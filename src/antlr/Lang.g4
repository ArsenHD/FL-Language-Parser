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
    | inputStmt { $stmt = $inputStmt.value; }
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
        Block elseBlock = null;
        if ($elseBranch.ctx != null) {
            elseBlock = $elseBranch.value;
        }
        $value = new IfStatement($condition.value, $thenBranch.value, elseBlock);
    }
    ;

whileLoop returns [WhileLoop value]:
    WHILE LPAREN condition=expression RPAREN block
    {
        $value = new WhileLoop($condition.value, $block.value);
    }
    ;

inputStmt returns [InputFunction value]:
    input SEMICOLON { $value = $input.value; }
    ;

print returns [PrintFunction value]:
    PRINT LPAREN expression RPAREN SEMICOLON
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
    | left=arithmeticExpression EQ right=arithmeticExpression
    { $value = new EqualsExpression($left.value, $right.value); }
    | left=arithmeticExpression NEQ right=arithmeticExpression
    { $value = new NotEqualsExpression($left.value, $right.value); }
    | left=arithmeticExpression LEQ right=arithmeticExpression
    { $value = new LeqExpression($left.value, $right.value); }
    | left=arithmeticExpression LT right=arithmeticExpression
    { $value = new LessExpression($left.value, $right.value); }
    | left=arithmeticExpression GEQ right=arithmeticExpression
    { $value = new GeqExpression($left.value, $right.value); }
    | left=arithmeticExpression GT right=arithmeticExpression
    { $value = new GreaterExpression($left.value, $right.value); }
    | NOT argument=expression
    { $value = new NotExpression($argument.value); }
    | <assoc=right> lhs=expression AND rhs=expression
    { $value = new AndExpression($lhs.value, $rhs.value); }
    | <assoc=right> lhs=expression OR rhs=expression
    { $value = new AndExpression($lhs.value, $rhs.value); }
    | arithmeticExpression { $value = $arithmeticExpression.value; }
    ;

arithmeticExpression returns [Expression value]:
    <assoc=right> left=arithmeticExpression POW right=arithmeticExpression
    { $value = new PowExpression($left.value, $right.value); }
    | MINUS argument=arithmeticExpression
    { $value = new UnaryMinusExpression($argument.value); }
    | left=arithmeticExpression MUL right=arithmeticExpression
    { $value = new MulExpression($left.value, $right.value); }
    | left=arithmeticExpression DIV right=arithmeticExpression
    { $value = new DivExpression($left.value, $right.value); }
    | left=arithmeticExpression PLUS right=arithmeticExpression
    { $value = new AddExpression($left.value, $right.value); }
    | left=arithmeticExpression MINUS right=arithmeticExpression
    { $value = new SubExpression($left.value, $right.value); }
    | simpleExpression { $value = $simpleExpression.value; }
    | input { $value = $input.value; }
    ;

simpleExpression returns [Expression value]:
    id=ID { $value = new Variable($id.getText()); }
    | num=NUM { $value = new NumberExpression(Integer.parseInt($num.getText())); }
    | LPAREN expression RPAREN { $value = $expression.value; }
    ;

input returns [InputFunction value]:
    INPUT LPAREN RPAREN { $value = InputFunction.INSTANCE; }
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
