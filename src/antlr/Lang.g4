grammar Lang;

@header {
package ru.itmo.fl.lang.antlr;

import java.util.LinkedList;
import ru.itmo.fl.lang.tree.*;
}

program returns [Program prog]:
    statementList EOF { $prog = new Program($statementList.statements); }
    ;

statement returns [Statement stmt]:
    assignment { $stmt = $assignment.value; }
    | ifStatement { $stmt = $ifStatement.value; }
    | whileLoop { $stmt = $whileLoop.value; }
    | input { $stmt = $input.value; }
    | print { $stmt = $print.value; }
    ;

comment:
    COMMENT
    ;

assignment returns [Assignment value]:
    id=ID ASSIGN expression SEMICOLON
    {
        Variable variable = new Variable($id.getText());
        $value = new Assignment(variable, $expression.value);
    }
    ;

ifStatement returns [IfStatement value]:
    IF LPAREN condition=expression RPAREN THEN thenBranch=block (ELSE elseBranch=block)?
    {
        $value = new IfStatement($condition.value, $thenBranch.value, $elseBranch.value);
    }
    ;

whileLoop returns [WhileLoop value]:
    WHILE LPAREN condition=expression RPAREN block
    {
        $value = new WhileLoop($condition.value, $block.value);
    }
    ;

input returns [InputFunction value]:
    INPUT LPAREN RPAREN { $value = InputFunction.INSTANCE; }
    ;

print returns [PrintFunction value]:
    PRINT LPAREN expression RPAREN
    {
        $value = new PrintFunction($expression.value);
    }
    ;

block returns [Block value]:
    LBRACE statementList RBRACE
    {
        $value = new Block($statementList.statements);
    }
    ;

statementList returns [List<Statement> statements]:
    head=statement tail=statementList
    {
        $statements = $tail.statements;
        $statements.add(0, $head.stmt);
    }
    | comment tail=statementList
    {
        $statements = $tail.statements;
    }
    | { $statements = new LinkedList<Statement>(); }
    ;

expression returns [Expression value]:
    <assoc=right> left=expression POW right=expression
    { $value = new PowExpression($left.value, $right.value); }
    | MINUS argument=expression
    { $value = new UnaryMinusExpression($argument.value); }
    | left=expression MUL right=expression
    { $value = new MulExpression($left.value, $right.value); }
    | left=expression DIV right=expression
    { $value = new DivExpression($left.value, $right.value); }
    | left=expression PLUS right=expression
    { $value = new AddExpression($left.value, $right.value); }
    | left=expression MINUS right=expression
    { $value = new SubExpression($left.value, $right.value); }
    | leftSE=simpleExpression EQ rightSE=simpleExpression
    { $value = new EqualsExpression($leftSE.value, $rightSE.value); }
    | leftSE=simpleExpression NEQ rightSE=simpleExpression
    { $value = new NotEqualsExpression($leftSE.value, $rightSE.value); }
    | leftSE=simpleExpression LEQ rightSE=simpleExpression
    { $value = new LeqExpression($leftSE.value, $rightSE.value); }
    | leftSE=simpleExpression LT rightSE=simpleExpression
    { $value = new LessExpression($leftSE.value, $rightSE.value); }
    | leftSE=simpleExpression GEQ rightSE=simpleExpression
    { $value = new GeqExpression($leftSE.value, $rightSE.value); }
    | leftSE=simpleExpression GT rightSE=simpleExpression
    { $value = new GreaterExpression($leftSE.value, $rightSE.value); }
    | NOT argument=expression
    { $value = new NotExpression($argument.value); }
    | <assoc=right> left=expression AND right=expression
    { $value = new AndExpression($left.value, $right.value); }
    | <assoc=right> left=expression OR right=expression
    { $value = new AndExpression($left.value, $right.value); }
    | simpleExpression { $value = $simpleExpression.value; }
    ;

simpleExpression returns [Expression value]:
    id=ID { $value = new Variable($id.getText()); }
    | num=NUM { $value = new NumberExpression(Integer.parseInt($num.getText())); }
    | LPAREN expression RPAREN { $value = $expression.value; }
    ;

ASSIGN: '=';

IF: 'if';
THEN: 'then';
ELSE: 'else';

WHILE: 'while';

INPUT: 'input';

PRINT: 'print';

COMMENT: '//' ~[\r\n]*;

ID: [a-zA-Z][a-zA-Z0-9]*;

NUM: [+-]?('0' | [1-9][0-9]*);

LPAREN: '(';
RPAREN: ')';

LBRACE: '{';
RBRACE: '}';

POW: '^';
MUL: '*';
DIV: '/';
PLUS: '+';
MINUS: '-';
EQ: '==';
NEQ: '/=';
LEQ: '<=';
LT: '<';
GEQ: '>=';
GT: '>';

NOT: '!';
AND: '&&';
OR: '||';

SEMICOLON: ';';

WS: [ \t\n] -> skip;
