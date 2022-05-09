// Generated from //wsl$/Ubuntu/home/arsen/FormalLanguages/ANTLR_Homework/src/antlr\Lang.g4 by ANTLR 4.10.1

package ru.itmo.fl.lang.antlr;

import java.util.LinkedList;
import ru.itmo.fl.lang.tree.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ASSIGN=1, IF=2, THEN=3, ELSE=4, WHILE=5, INPUT=6, PRINT=7, COMMENT=8, 
		ID=9, NUM=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, POW=15, MUL=16, 
		DIV=17, PLUS=18, MINUS=19, EQ=20, NEQ=21, LEQ=22, LT=23, GEQ=24, GT=25, 
		NOT=26, AND=27, OR=28, SEMICOLON=29, WS=30;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_comment = 2, RULE_assignment = 3, 
		RULE_ifStatement = 4, RULE_whileLoop = 5, RULE_input = 6, RULE_print = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_expression = 10, RULE_simpleExpression = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "comment", "assignment", "ifStatement", "whileLoop", 
			"input", "print", "block", "statementList", "expression", "simpleExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'if'", "'then'", "'else'", "'while'", "'input'", "'print'", 
			null, null, null, "'('", "')'", "'{'", "'}'", "'^'", "'*'", "'/'", "'+'", 
			"'-'", "'=='", "'/='", "'<='", "'<'", "'>='", "'>'", "'!'", "'&&'", "'||'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ASSIGN", "IF", "THEN", "ELSE", "WHILE", "INPUT", "PRINT", "COMMENT", 
			"ID", "NUM", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "POW", "MUL", "DIV", 
			"PLUS", "MINUS", "EQ", "NEQ", "LEQ", "LT", "GEQ", "GT", "NOT", "AND", 
			"OR", "SEMICOLON", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Lang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public Program prog;
		public StatementListContext statementList;
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LangParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			((ProgramContext)_localctx).statementList = statementList();
			setState(25);
			match(EOF);
			 ((ProgramContext)_localctx).prog =  new Program(((ProgramContext)_localctx).statementList.statements); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Statement stmt;
		public AssignmentContext assignment;
		public IfStatementContext ifStatement;
		public WhileLoopContext whileLoop;
		public InputContext input;
		public PrintContext print;
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				((StatementContext)_localctx).assignment = assignment();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).assignment.value; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).ifStatement.value; 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				((StatementContext)_localctx).whileLoop = whileLoop();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).whileLoop.value; 
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				((StatementContext)_localctx).input = input();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).input.value; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				((StatementContext)_localctx).print = print();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).print.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(LangParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public Assignment value;
		public Token id;
		public ExpressionContext expression;
		public TerminalNode ASSIGN() { return getToken(LangParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((AssignmentContext)_localctx).id = match(ID);
			setState(48);
			match(ASSIGN);
			setState(49);
			((AssignmentContext)_localctx).expression = expression(0);
			setState(50);
			match(SEMICOLON);

			        Variable variable = new Variable(((AssignmentContext)_localctx).id.getText());
			        ((AssignmentContext)_localctx).value =  new Assignment(variable, ((AssignmentContext)_localctx).expression.value);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public IfStatement value;
		public ExpressionContext condition;
		public BlockContext thenBranch;
		public BlockContext elseBranch;
		public TerminalNode IF() { return getToken(LangParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode THEN() { return getToken(LangParser.THEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(LangParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(IF);
			setState(54);
			match(LPAREN);
			setState(55);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(56);
			match(RPAREN);
			setState(57);
			match(THEN);
			setState(58);
			((IfStatementContext)_localctx).thenBranch = block();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(59);
				match(ELSE);
				setState(60);
				((IfStatementContext)_localctx).elseBranch = block();
				}
			}


			        Block elseBlock = null;
			        if (((IfStatementContext)_localctx).elseBranch != null) {
			            elseBlock = ((IfStatementContext)_localctx).elseBranch.value;
			        }
			        ((IfStatementContext)_localctx).value =  new IfStatement(((IfStatementContext)_localctx).condition.value, ((IfStatementContext)_localctx).thenBranch.value, elseBlock);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileLoopContext extends ParserRuleContext {
		public WhileLoop value;
		public ExpressionContext condition;
		public BlockContext block;
		public TerminalNode WHILE() { return getToken(LangParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WHILE);
			setState(66);
			match(LPAREN);
			setState(67);
			((WhileLoopContext)_localctx).condition = expression(0);
			setState(68);
			match(RPAREN);
			setState(69);
			((WhileLoopContext)_localctx).block = block();

			        ((WhileLoopContext)_localctx).value =  new WhileLoop(((WhileLoopContext)_localctx).condition.value, ((WhileLoopContext)_localctx).block.value);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public InputFunction value;
		public TerminalNode INPUT() { return getToken(LangParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInput(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(INPUT);
			setState(73);
			match(LPAREN);
			setState(74);
			match(RPAREN);
			setState(75);
			match(SEMICOLON);
			 ((InputContext)_localctx).value =  InputFunction.INSTANCE; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintFunction value;
		public ExpressionContext expression;
		public TerminalNode PRINT() { return getToken(LangParser.PRINT, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(PRINT);
			setState(79);
			match(LPAREN);
			setState(80);
			((PrintContext)_localctx).expression = expression(0);
			setState(81);
			match(RPAREN);
			setState(82);
			match(SEMICOLON);

			        ((PrintContext)_localctx).value =  new PrintFunction(((PrintContext)_localctx).expression.value);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public Block value;
		public StatementListContext statementList;
		public TerminalNode LBRACE() { return getToken(LangParser.LBRACE, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(LangParser.RBRACE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LBRACE);
			setState(86);
			((BlockContext)_localctx).statementList = statementList();
			setState(87);
			match(RBRACE);

			        ((BlockContext)_localctx).value =  new Block(((BlockContext)_localctx).statementList.statements);
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementListContext extends ParserRuleContext {
		public List<Statement> statements;
		public StatementContext head;
		public StatementListContext tail;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterStatementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitStatementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitStatementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statementList);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case INPUT:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				((StatementListContext)_localctx).head = statement();
				setState(91);
				((StatementListContext)_localctx).tail = statementList();

				        ((StatementListContext)_localctx).statements =  ((StatementListContext)_localctx).tail.statements;
				        _localctx.statements.add(0, ((StatementListContext)_localctx).head.stmt);
				    
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				comment();
				setState(95);
				((StatementListContext)_localctx).tail = statementList();

				        ((StatementListContext)_localctx).statements =  ((StatementListContext)_localctx).tail.statements;
				    
				}
				break;
			case EOF:
			case RBRACE:
				enterOuterAlt(_localctx, 3);
				{
				 ((StatementListContext)_localctx).statements =  new LinkedList<Statement>(); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Expression value;
		public ExpressionContext left;
		public ExpressionContext argument;
		public SimpleExpressionContext leftSE;
		public SimpleExpressionContext simpleExpression;
		public SimpleExpressionContext rightSE;
		public ExpressionContext right;
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(LangParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(LangParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(LangParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public TerminalNode POW() { return getToken(LangParser.POW, 0); }
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public TerminalNode AND() { return getToken(LangParser.AND, 0); }
		public TerminalNode OR() { return getToken(LangParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(102);
				match(MINUS);
				setState(103);
				((ExpressionContext)_localctx).argument = expression(15);
				 ((ExpressionContext)_localctx).value =  new UnaryMinusExpression(((ExpressionContext)_localctx).argument.value); 
				}
				break;
			case 2:
				{
				setState(106);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(107);
				match(EQ);
				setState(108);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new EqualsExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 3:
				{
				setState(111);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(112);
				match(NEQ);
				setState(113);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new NotEqualsExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 4:
				{
				setState(116);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(117);
				match(LEQ);
				setState(118);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new LeqExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 5:
				{
				setState(121);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(122);
				match(LT);
				setState(123);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new LessExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 6:
				{
				setState(126);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(127);
				match(GEQ);
				setState(128);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new GeqExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 7:
				{
				setState(131);
				((ExpressionContext)_localctx).leftSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				setState(132);
				match(GT);
				setState(133);
				((ExpressionContext)_localctx).rightSE = ((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  new GreaterExpression(((ExpressionContext)_localctx).leftSE.value, ((ExpressionContext)_localctx).rightSE.value); 
				}
				break;
			case 8:
				{
				setState(136);
				match(NOT);
				setState(137);
				((ExpressionContext)_localctx).argument = expression(4);
				 ((ExpressionContext)_localctx).value =  new NotExpression(((ExpressionContext)_localctx).argument.value); 
				}
				break;
			case 9:
				{
				setState(140);
				((ExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).simpleExpression.value; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(145);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(146);
						match(POW);
						setState(147);
						((ExpressionContext)_localctx).right = expression(16);
						 ((ExpressionContext)_localctx).value =  new PowExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(151);
						match(MUL);
						setState(152);
						((ExpressionContext)_localctx).right = expression(15);
						 ((ExpressionContext)_localctx).value =  new MulExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(155);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(156);
						match(DIV);
						setState(157);
						((ExpressionContext)_localctx).right = expression(14);
						 ((ExpressionContext)_localctx).value =  new DivExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(160);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(161);
						match(PLUS);
						setState(162);
						((ExpressionContext)_localctx).right = expression(13);
						 ((ExpressionContext)_localctx).value =  new AddExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(166);
						match(MINUS);
						setState(167);
						((ExpressionContext)_localctx).right = expression(12);
						 ((ExpressionContext)_localctx).value =  new SubExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(171);
						match(AND);
						setState(172);
						((ExpressionContext)_localctx).right = expression(3);
						 ((ExpressionContext)_localctx).value =  new AndExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(175);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(176);
						match(OR);
						setState(177);
						((ExpressionContext)_localctx).right = expression(2);
						 ((ExpressionContext)_localctx).value =  new AndExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
						}
						break;
					}
					} 
				}
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SimpleExpressionContext extends ParserRuleContext {
		public Expression value;
		public Token id;
		public Token num;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(LangParser.ID, 0); }
		public TerminalNode NUM() { return getToken(LangParser.NUM, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterSimpleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitSimpleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpression);
		try {
			setState(194);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				((SimpleExpressionContext)_localctx).id = match(ID);
				 ((SimpleExpressionContext)_localctx).value =  new Variable(((SimpleExpressionContext)_localctx).id.getText()); 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				((SimpleExpressionContext)_localctx).num = match(NUM);
				 ((SimpleExpressionContext)_localctx).value =  new NumberExpression(Integer.parseInt(((SimpleExpressionContext)_localctx).num.getText())); 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(189);
				match(LPAREN);
				setState(190);
				((SimpleExpressionContext)_localctx).expression = expression(0);
				setState(191);
				match(RPAREN);
				 ((SimpleExpressionContext)_localctx).value =  ((SimpleExpressionContext)_localctx).expression.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 12);
		case 4:
			return precpred(_ctx, 11);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00c5\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004>\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\td\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0090\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b5\b\n\n"+
		"\n\f\n\u00b8\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00c3"+
		"\b\u000b\u0001\u000b\u0000\u0001\u0014\f\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0000\u0000\u00d0\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000"+
		"\u0006/\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\nA\u0001\u0000"+
		"\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000"+
		"\u0010U\u0001\u0000\u0000\u0000\u0012c\u0001\u0000\u0000\u0000\u0014\u008f"+
		"\u0001\u0000\u0000\u0000\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0003\u0012\t\u0000\u0019\u001a\u0005\u0000\u0000\u0001\u001a\u001b\u0006"+
		"\u0000\uffff\uffff\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001d"+
		"\u0003\u0006\u0003\u0000\u001d\u001e\u0006\u0001\uffff\uffff\u0000\u001e"+
		",\u0001\u0000\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0006\u0001\uffff"+
		"\uffff\u0000!,\u0001\u0000\u0000\u0000\"#\u0003\n\u0005\u0000#$\u0006"+
		"\u0001\uffff\uffff\u0000$,\u0001\u0000\u0000\u0000%&\u0003\f\u0006\u0000"+
		"&\'\u0006\u0001\uffff\uffff\u0000\',\u0001\u0000\u0000\u0000()\u0003\u000e"+
		"\u0007\u0000)*\u0006\u0001\uffff\uffff\u0000*,\u0001\u0000\u0000\u0000"+
		"+\u001c\u0001\u0000\u0000\u0000+\u001f\u0001\u0000\u0000\u0000+\"\u0001"+
		"\u0000\u0000\u0000+%\u0001\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000"+
		",\u0003\u0001\u0000\u0000\u0000-.\u0005\b\u0000\u0000.\u0005\u0001\u0000"+
		"\u0000\u0000/0\u0005\t\u0000\u000001\u0005\u0001\u0000\u000012\u0003\u0014"+
		"\n\u000023\u0005\u001d\u0000\u000034\u0006\u0003\uffff\uffff\u00004\u0007"+
		"\u0001\u0000\u0000\u000056\u0005\u0002\u0000\u000067\u0005\u000b\u0000"+
		"\u000078\u0003\u0014\n\u000089\u0005\f\u0000\u00009:\u0005\u0003\u0000"+
		"\u0000:=\u0003\u0010\b\u0000;<\u0005\u0004\u0000\u0000<>\u0003\u0010\b"+
		"\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000"+
		"\u0000\u0000?@\u0006\u0004\uffff\uffff\u0000@\t\u0001\u0000\u0000\u0000"+
		"AB\u0005\u0005\u0000\u0000BC\u0005\u000b\u0000\u0000CD\u0003\u0014\n\u0000"+
		"DE\u0005\f\u0000\u0000EF\u0003\u0010\b\u0000FG\u0006\u0005\uffff\uffff"+
		"\u0000G\u000b\u0001\u0000\u0000\u0000HI\u0005\u0006\u0000\u0000IJ\u0005"+
		"\u000b\u0000\u0000JK\u0005\f\u0000\u0000KL\u0005\u001d\u0000\u0000LM\u0006"+
		"\u0006\uffff\uffff\u0000M\r\u0001\u0000\u0000\u0000NO\u0005\u0007\u0000"+
		"\u0000OP\u0005\u000b\u0000\u0000PQ\u0003\u0014\n\u0000QR\u0005\f\u0000"+
		"\u0000RS\u0005\u001d\u0000\u0000ST\u0006\u0007\uffff\uffff\u0000T\u000f"+
		"\u0001\u0000\u0000\u0000UV\u0005\r\u0000\u0000VW\u0003\u0012\t\u0000W"+
		"X\u0005\u000e\u0000\u0000XY\u0006\b\uffff\uffff\u0000Y\u0011\u0001\u0000"+
		"\u0000\u0000Z[\u0003\u0002\u0001\u0000[\\\u0003\u0012\t\u0000\\]\u0006"+
		"\t\uffff\uffff\u0000]d\u0001\u0000\u0000\u0000^_\u0003\u0004\u0002\u0000"+
		"_`\u0003\u0012\t\u0000`a\u0006\t\uffff\uffff\u0000ad\u0001\u0000\u0000"+
		"\u0000bd\u0006\t\uffff\uffff\u0000cZ\u0001\u0000\u0000\u0000c^\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0013\u0001\u0000\u0000\u0000"+
		"ef\u0006\n\uffff\uffff\u0000fg\u0005\u0013\u0000\u0000gh\u0003\u0014\n"+
		"\u000fhi\u0006\n\uffff\uffff\u0000i\u0090\u0001\u0000\u0000\u0000jk\u0003"+
		"\u0016\u000b\u0000kl\u0005\u0014\u0000\u0000lm\u0003\u0016\u000b\u0000"+
		"mn\u0006\n\uffff\uffff\u0000n\u0090\u0001\u0000\u0000\u0000op\u0003\u0016"+
		"\u000b\u0000pq\u0005\u0015\u0000\u0000qr\u0003\u0016\u000b\u0000rs\u0006"+
		"\n\uffff\uffff\u0000s\u0090\u0001\u0000\u0000\u0000tu\u0003\u0016\u000b"+
		"\u0000uv\u0005\u0016\u0000\u0000vw\u0003\u0016\u000b\u0000wx\u0006\n\uffff"+
		"\uffff\u0000x\u0090\u0001\u0000\u0000\u0000yz\u0003\u0016\u000b\u0000"+
		"z{\u0005\u0017\u0000\u0000{|\u0003\u0016\u000b\u0000|}\u0006\n\uffff\uffff"+
		"\u0000}\u0090\u0001\u0000\u0000\u0000~\u007f\u0003\u0016\u000b\u0000\u007f"+
		"\u0080\u0005\u0018\u0000\u0000\u0080\u0081\u0003\u0016\u000b\u0000\u0081"+
		"\u0082\u0006\n\uffff\uffff\u0000\u0082\u0090\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0003\u0016\u000b\u0000\u0084\u0085\u0005\u0019\u0000\u0000\u0085"+
		"\u0086\u0003\u0016\u000b\u0000\u0086\u0087\u0006\n\uffff\uffff\u0000\u0087"+
		"\u0090\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u001a\u0000\u0000\u0089"+
		"\u008a\u0003\u0014\n\u0004\u008a\u008b\u0006\n\uffff\uffff\u0000\u008b"+
		"\u0090\u0001\u0000\u0000\u0000\u008c\u008d\u0003\u0016\u000b\u0000\u008d"+
		"\u008e\u0006\n\uffff\uffff\u0000\u008e\u0090\u0001\u0000\u0000\u0000\u008f"+
		"e\u0001\u0000\u0000\u0000\u008fj\u0001\u0000\u0000\u0000\u008fo\u0001"+
		"\u0000\u0000\u0000\u008ft\u0001\u0000\u0000\u0000\u008fy\u0001\u0000\u0000"+
		"\u0000\u008f~\u0001\u0000\u0000\u0000\u008f\u0083\u0001\u0000\u0000\u0000"+
		"\u008f\u0088\u0001\u0000\u0000\u0000\u008f\u008c\u0001\u0000\u0000\u0000"+
		"\u0090\u00b6\u0001\u0000\u0000\u0000\u0091\u0092\n\u0010\u0000\u0000\u0092"+
		"\u0093\u0005\u000f\u0000\u0000\u0093\u0094\u0003\u0014\n\u0010\u0094\u0095"+
		"\u0006\n\uffff\uffff\u0000\u0095\u00b5\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\n\u000e\u0000\u0000\u0097\u0098\u0005\u0010\u0000\u0000\u0098\u0099\u0003"+
		"\u0014\n\u000f\u0099\u009a\u0006\n\uffff\uffff\u0000\u009a\u00b5\u0001"+
		"\u0000\u0000\u0000\u009b\u009c\n\r\u0000\u0000\u009c\u009d\u0005\u0011"+
		"\u0000\u0000\u009d\u009e\u0003\u0014\n\u000e\u009e\u009f\u0006\n\uffff"+
		"\uffff\u0000\u009f\u00b5\u0001\u0000\u0000\u0000\u00a0\u00a1\n\f\u0000"+
		"\u0000\u00a1\u00a2\u0005\u0012\u0000\u0000\u00a2\u00a3\u0003\u0014\n\r"+
		"\u00a3\u00a4\u0006\n\uffff\uffff\u0000\u00a4\u00b5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\n\u000b\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7"+
		"\u00a8\u0003\u0014\n\f\u00a8\u00a9\u0006\n\uffff\uffff\u0000\u00a9\u00b5"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u0003\u0000\u0000\u00ab\u00ac\u0005"+
		"\u001b\u0000\u0000\u00ac\u00ad\u0003\u0014\n\u0003\u00ad\u00ae\u0006\n"+
		"\uffff\uffff\u0000\u00ae\u00b5\u0001\u0000\u0000\u0000\u00af\u00b0\n\u0002"+
		"\u0000\u0000\u00b0\u00b1\u0005\u001c\u0000\u0000\u00b1\u00b2\u0003\u0014"+
		"\n\u0002\u00b2\u00b3\u0006\n\uffff\uffff\u0000\u00b3\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b4\u0091\u0001\u0000\u0000\u0000\u00b4\u0096\u0001\u0000"+
		"\u0000\u0000\u00b4\u009b\u0001\u0000\u0000\u0000\u00b4\u00a0\u0001\u0000"+
		"\u0000\u0000\u00b4\u00a5\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001\u0000"+
		"\u0000\u0000\u00b4\u00af\u0001\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u0015\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0005\t\u0000\u0000\u00ba\u00c3\u0006\u000b\uffff"+
		"\uffff\u0000\u00bb\u00bc\u0005\n\u0000\u0000\u00bc\u00c3\u0006\u000b\uffff"+
		"\uffff\u0000\u00bd\u00be\u0005\u000b\u0000\u0000\u00be\u00bf\u0003\u0014"+
		"\n\u0000\u00bf\u00c0\u0005\f\u0000\u0000\u00c0\u00c1\u0006\u000b\uffff"+
		"\uffff\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c2\u00bb\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c3\u0017\u0001\u0000\u0000\u0000\u0007+=c\u008f\u00b4"+
		"\u00b6\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}