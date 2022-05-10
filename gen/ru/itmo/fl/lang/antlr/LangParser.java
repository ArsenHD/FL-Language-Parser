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
		RULE_ifStatement = 4, RULE_whileLoop = 5, RULE_inputStmt = 6, RULE_print = 7, 
		RULE_block = 8, RULE_statementList = 9, RULE_expression = 10, RULE_arithmeticExpression = 11, 
		RULE_simpleExpression = 12, RULE_input = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "comment", "assignment", "ifStatement", "whileLoop", 
			"inputStmt", "print", "block", "statementList", "expression", "arithmeticExpression", 
			"simpleExpression", "input"
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
			setState(28);
			((ProgramContext)_localctx).statementList = statementList();
			setState(29);
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
		public InputStmtContext inputStmt;
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
		public InputStmtContext inputStmt() {
			return getRuleContext(InputStmtContext.class,0);
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
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((StatementContext)_localctx).assignment = assignment();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).assignment.value; 
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).ifStatement.value; 
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				((StatementContext)_localctx).whileLoop = whileLoop();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).whileLoop.value; 
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				((StatementContext)_localctx).inputStmt = inputStmt();
				 ((StatementContext)_localctx).stmt =  ((StatementContext)_localctx).inputStmt.value; 
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
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
			setState(49);
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
			setState(51);
			((AssignmentContext)_localctx).id = match(ID);
			setState(52);
			match(ASSIGN);
			setState(53);
			((AssignmentContext)_localctx).expression = expression(0);
			setState(54);
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
			setState(57);
			match(IF);
			setState(58);
			match(LPAREN);
			setState(59);
			((IfStatementContext)_localctx).condition = expression(0);
			setState(60);
			match(RPAREN);
			setState(61);
			match(THEN);
			setState(62);
			((IfStatementContext)_localctx).thenBranch = block();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(63);
				match(ELSE);
				setState(64);
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
			setState(69);
			match(WHILE);
			setState(70);
			match(LPAREN);
			setState(71);
			((WhileLoopContext)_localctx).condition = expression(0);
			setState(72);
			match(RPAREN);
			setState(73);
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

	public static class InputStmtContext extends ParserRuleContext {
		public InputFunction value;
		public InputContext input;
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(LangParser.SEMICOLON, 0); }
		public InputStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStmtContext inputStmt() throws RecognitionException {
		InputStmtContext _localctx = new InputStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_inputStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			((InputStmtContext)_localctx).input = input();
			setState(77);
			match(SEMICOLON);
			 ((InputStmtContext)_localctx).value =  ((InputStmtContext)_localctx).input.value; 
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
			setState(80);
			match(PRINT);
			setState(81);
			match(LPAREN);
			setState(82);
			((PrintContext)_localctx).expression = expression(0);
			setState(83);
			match(RPAREN);
			setState(84);
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
			setState(87);
			match(LBRACE);
			setState(88);
			((BlockContext)_localctx).statementList = statementList();
			setState(89);
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
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case WHILE:
			case INPUT:
			case PRINT:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((StatementListContext)_localctx).head = statement();
				setState(93);
				((StatementListContext)_localctx).tail = statementList();

				        ((StatementListContext)_localctx).statements =  ((StatementListContext)_localctx).tail.statements;
				        _localctx.statements.add(0, ((StatementListContext)_localctx).head.stmt);
				    
				}
				break;
			case COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				comment();
				setState(97);
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
		public ExpressionContext lhs;
		public ArithmeticExpressionContext left;
		public ArithmeticExpressionContext arithmeticExpression;
		public ArithmeticExpressionContext right;
		public ExpressionContext argument;
		public ExpressionContext rhs;
		public TerminalNode EQ() { return getToken(LangParser.EQ, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public TerminalNode NEQ() { return getToken(LangParser.NEQ, 0); }
		public TerminalNode LEQ() { return getToken(LangParser.LEQ, 0); }
		public TerminalNode LT() { return getToken(LangParser.LT, 0); }
		public TerminalNode GEQ() { return getToken(LangParser.GEQ, 0); }
		public TerminalNode GT() { return getToken(LangParser.GT, 0); }
		public TerminalNode NOT() { return getToken(LangParser.NOT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(104);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(105);
				match(EQ);
				setState(106);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new EqualsExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 3:
				{
				setState(109);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(110);
				match(NEQ);
				setState(111);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new NotEqualsExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 4:
				{
				setState(114);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(115);
				match(LEQ);
				setState(116);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new LeqExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 5:
				{
				setState(119);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(120);
				match(LT);
				setState(121);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new LessExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 6:
				{
				setState(124);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(125);
				match(GEQ);
				setState(126);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new GeqExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 7:
				{
				setState(129);
				((ExpressionContext)_localctx).left = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				setState(130);
				match(GT);
				setState(131);
				((ExpressionContext)_localctx).right = ((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  new GreaterExpression(((ExpressionContext)_localctx).left.value, ((ExpressionContext)_localctx).right.value); 
				}
				break;
			case 8:
				{
				setState(134);
				match(NOT);
				setState(135);
				((ExpressionContext)_localctx).argument = expression(4);
				 ((ExpressionContext)_localctx).value =  new NotExpression(((ExpressionContext)_localctx).argument.value); 
				}
				break;
			case 9:
				{
				setState(138);
				((ExpressionContext)_localctx).arithmeticExpression = arithmeticExpression(0);
				 ((ExpressionContext)_localctx).value =  ((ExpressionContext)_localctx).arithmeticExpression.value; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						match(AND);
						setState(145);
						((ExpressionContext)_localctx).rhs = expression(3);
						 ((ExpressionContext)_localctx).value =  new AndExpression(((ExpressionContext)_localctx).lhs.value, ((ExpressionContext)_localctx).rhs.value); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.lhs = _prevctx;
						_localctx.lhs = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(148);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(149);
						match(OR);
						setState(150);
						((ExpressionContext)_localctx).rhs = expression(2);
						 ((ExpressionContext)_localctx).value =  new AndExpression(((ExpressionContext)_localctx).lhs.value, ((ExpressionContext)_localctx).rhs.value); 
						}
						break;
					}
					} 
				}
				setState(157);
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

	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public Expression value;
		public ArithmeticExpressionContext left;
		public ArithmeticExpressionContext argument;
		public SimpleExpressionContext simpleExpression;
		public InputContext input;
		public ArithmeticExpressionContext right;
		public TerminalNode MINUS() { return getToken(LangParser.MINUS, 0); }
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public TerminalNode POW() { return getToken(LangParser.POW, 0); }
		public TerminalNode MUL() { return getToken(LangParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LangParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(LangParser.PLUS, 0); }
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LangListener ) ((LangListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LangVisitor ) return ((LangVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		return arithmeticExpression(0);
	}

	private ArithmeticExpressionContext arithmeticExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, _parentState);
		ArithmeticExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_arithmeticExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(159);
				match(MINUS);
				setState(160);
				((ArithmeticExpressionContext)_localctx).argument = arithmeticExpression(7);
				 ((ArithmeticExpressionContext)_localctx).value =  new UnaryMinusExpression(((ArithmeticExpressionContext)_localctx).argument.value); 
				}
				break;
			case ID:
			case NUM:
			case LPAREN:
				{
				setState(163);
				((ArithmeticExpressionContext)_localctx).simpleExpression = simpleExpression();
				 ((ArithmeticExpressionContext)_localctx).value =  ((ArithmeticExpressionContext)_localctx).simpleExpression.value; 
				}
				break;
			case INPUT:
				{
				setState(166);
				((ArithmeticExpressionContext)_localctx).input = input();
				 ((ArithmeticExpressionContext)_localctx).value =  ((ArithmeticExpressionContext)_localctx).input.value; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(171);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(172);
						match(POW);
						setState(173);
						((ArithmeticExpressionContext)_localctx).right = arithmeticExpression(8);
						 ((ArithmeticExpressionContext)_localctx).value =  new PowExpression(((ArithmeticExpressionContext)_localctx).left.value, ((ArithmeticExpressionContext)_localctx).right.value); 
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(176);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(177);
						match(MUL);
						setState(178);
						((ArithmeticExpressionContext)_localctx).right = arithmeticExpression(7);
						 ((ArithmeticExpressionContext)_localctx).value =  new MulExpression(((ArithmeticExpressionContext)_localctx).left.value, ((ArithmeticExpressionContext)_localctx).right.value); 
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(181);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(182);
						match(DIV);
						setState(183);
						((ArithmeticExpressionContext)_localctx).right = arithmeticExpression(6);
						 ((ArithmeticExpressionContext)_localctx).value =  new DivExpression(((ArithmeticExpressionContext)_localctx).left.value, ((ArithmeticExpressionContext)_localctx).right.value); 
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(186);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(187);
						match(PLUS);
						setState(188);
						((ArithmeticExpressionContext)_localctx).right = arithmeticExpression(5);
						 ((ArithmeticExpressionContext)_localctx).value =  new AddExpression(((ArithmeticExpressionContext)_localctx).left.value, ((ArithmeticExpressionContext)_localctx).right.value); 
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticExpressionContext(_parentctx, _parentState);
						_localctx.left = _prevctx;
						_localctx.left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithmeticExpression);
						setState(191);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(192);
						match(MINUS);
						setState(193);
						((ArithmeticExpressionContext)_localctx).right = arithmeticExpression(4);
						 ((ArithmeticExpressionContext)_localctx).value =  new SubExpression(((ArithmeticExpressionContext)_localctx).left.value, ((ArithmeticExpressionContext)_localctx).right.value); 
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		enterRule(_localctx, 24, RULE_simpleExpression);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((SimpleExpressionContext)_localctx).id = match(ID);
				 ((SimpleExpressionContext)_localctx).value =  new Variable(((SimpleExpressionContext)_localctx).id.getText()); 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((SimpleExpressionContext)_localctx).num = match(NUM);
				 ((SimpleExpressionContext)_localctx).value =  new NumberExpression(Integer.parseInt(((SimpleExpressionContext)_localctx).num.getText())); 
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(205);
				match(LPAREN);
				setState(206);
				((SimpleExpressionContext)_localctx).expression = expression(0);
				setState(207);
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

	public static class InputContext extends ParserRuleContext {
		public InputFunction value;
		public TerminalNode INPUT() { return getToken(LangParser.INPUT, 0); }
		public TerminalNode LPAREN() { return getToken(LangParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(LangParser.RPAREN, 0); }
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
		enterRule(_localctx, 26, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(INPUT);
			setState(213);
			match(LPAREN);
			setState(214);
			match(RPAREN);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 11:
			return arithmeticExpression_sempred((ArithmeticExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean arithmeticExpression_sempred(ArithmeticExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00da\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00010\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004B\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tf\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u008e\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u009a\b\n\n\n\f\n\u009d"+
		"\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00aa\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00c5\b\u000b\n\u000b\f\u000b"+
		"\u00c8\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00d3\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0000\u0002\u0014\u0016\u000e\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\u0000\u00e5\u0000\u001c"+
		"\u0001\u0000\u0000\u0000\u0002/\u0001\u0000\u0000\u0000\u00041\u0001\u0000"+
		"\u0000\u0000\u00063\u0001\u0000\u0000\u0000\b9\u0001\u0000\u0000\u0000"+
		"\nE\u0001\u0000\u0000\u0000\fL\u0001\u0000\u0000\u0000\u000eP\u0001\u0000"+
		"\u0000\u0000\u0010W\u0001\u0000\u0000\u0000\u0012e\u0001\u0000\u0000\u0000"+
		"\u0014\u008d\u0001\u0000\u0000\u0000\u0016\u00a9\u0001\u0000\u0000\u0000"+
		"\u0018\u00d2\u0001\u0000\u0000\u0000\u001a\u00d4\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0003\u0012\t\u0000\u001d\u001e\u0005\u0000\u0000\u0001\u001e"+
		"\u001f\u0006\u0000\uffff\uffff\u0000\u001f\u0001\u0001\u0000\u0000\u0000"+
		" !\u0003\u0006\u0003\u0000!\"\u0006\u0001\uffff\uffff\u0000\"0\u0001\u0000"+
		"\u0000\u0000#$\u0003\b\u0004\u0000$%\u0006\u0001\uffff\uffff\u0000%0\u0001"+
		"\u0000\u0000\u0000&\'\u0003\n\u0005\u0000\'(\u0006\u0001\uffff\uffff\u0000"+
		"(0\u0001\u0000\u0000\u0000)*\u0003\f\u0006\u0000*+\u0006\u0001\uffff\uffff"+
		"\u0000+0\u0001\u0000\u0000\u0000,-\u0003\u000e\u0007\u0000-.\u0006\u0001"+
		"\uffff\uffff\u0000.0\u0001\u0000\u0000\u0000/ \u0001\u0000\u0000\u0000"+
		"/#\u0001\u0000\u0000\u0000/&\u0001\u0000\u0000\u0000/)\u0001\u0000\u0000"+
		"\u0000/,\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u000012\u0005"+
		"\b\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005\t\u0000\u000045"+
		"\u0005\u0001\u0000\u000056\u0003\u0014\n\u000067\u0005\u001d\u0000\u0000"+
		"78\u0006\u0003\uffff\uffff\u00008\u0007\u0001\u0000\u0000\u00009:\u0005"+
		"\u0002\u0000\u0000:;\u0005\u000b\u0000\u0000;<\u0003\u0014\n\u0000<=\u0005"+
		"\f\u0000\u0000=>\u0005\u0003\u0000\u0000>A\u0003\u0010\b\u0000?@\u0005"+
		"\u0004\u0000\u0000@B\u0003\u0010\b\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0006\u0004\uffff\uffff"+
		"\u0000D\t\u0001\u0000\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0005\u000b"+
		"\u0000\u0000GH\u0003\u0014\n\u0000HI\u0005\f\u0000\u0000IJ\u0003\u0010"+
		"\b\u0000JK\u0006\u0005\uffff\uffff\u0000K\u000b\u0001\u0000\u0000\u0000"+
		"LM\u0003\u001a\r\u0000MN\u0005\u001d\u0000\u0000NO\u0006\u0006\uffff\uffff"+
		"\u0000O\r\u0001\u0000\u0000\u0000PQ\u0005\u0007\u0000\u0000QR\u0005\u000b"+
		"\u0000\u0000RS\u0003\u0014\n\u0000ST\u0005\f\u0000\u0000TU\u0005\u001d"+
		"\u0000\u0000UV\u0006\u0007\uffff\uffff\u0000V\u000f\u0001\u0000\u0000"+
		"\u0000WX\u0005\r\u0000\u0000XY\u0003\u0012\t\u0000YZ\u0005\u000e\u0000"+
		"\u0000Z[\u0006\b\uffff\uffff\u0000[\u0011\u0001\u0000\u0000\u0000\\]\u0003"+
		"\u0002\u0001\u0000]^\u0003\u0012\t\u0000^_\u0006\t\uffff\uffff\u0000_"+
		"f\u0001\u0000\u0000\u0000`a\u0003\u0004\u0002\u0000ab\u0003\u0012\t\u0000"+
		"bc\u0006\t\uffff\uffff\u0000cf\u0001\u0000\u0000\u0000df\u0006\t\uffff"+
		"\uffff\u0000e\\\u0001\u0000\u0000\u0000e`\u0001\u0000\u0000\u0000ed\u0001"+
		"\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000g\u008e\u0006\n\uffff"+
		"\uffff\u0000hi\u0003\u0016\u000b\u0000ij\u0005\u0014\u0000\u0000jk\u0003"+
		"\u0016\u000b\u0000kl\u0006\n\uffff\uffff\u0000l\u008e\u0001\u0000\u0000"+
		"\u0000mn\u0003\u0016\u000b\u0000no\u0005\u0015\u0000\u0000op\u0003\u0016"+
		"\u000b\u0000pq\u0006\n\uffff\uffff\u0000q\u008e\u0001\u0000\u0000\u0000"+
		"rs\u0003\u0016\u000b\u0000st\u0005\u0016\u0000\u0000tu\u0003\u0016\u000b"+
		"\u0000uv\u0006\n\uffff\uffff\u0000v\u008e\u0001\u0000\u0000\u0000wx\u0003"+
		"\u0016\u000b\u0000xy\u0005\u0017\u0000\u0000yz\u0003\u0016\u000b\u0000"+
		"z{\u0006\n\uffff\uffff\u0000{\u008e\u0001\u0000\u0000\u0000|}\u0003\u0016"+
		"\u000b\u0000}~\u0005\u0018\u0000\u0000~\u007f\u0003\u0016\u000b\u0000"+
		"\u007f\u0080\u0006\n\uffff\uffff\u0000\u0080\u008e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0005\u0019\u0000\u0000"+
		"\u0083\u0084\u0003\u0016\u000b\u0000\u0084\u0085\u0006\n\uffff\uffff\u0000"+
		"\u0085\u008e\u0001\u0000\u0000\u0000\u0086\u0087\u0005\u001a\u0000\u0000"+
		"\u0087\u0088\u0003\u0014\n\u0004\u0088\u0089\u0006\n\uffff\uffff\u0000"+
		"\u0089\u008e\u0001\u0000\u0000\u0000\u008a\u008b\u0003\u0016\u000b\u0000"+
		"\u008b\u008c\u0006\n\uffff\uffff\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008dg\u0001\u0000\u0000\u0000\u008dh\u0001\u0000\u0000\u0000\u008dm"+
		"\u0001\u0000\u0000\u0000\u008dr\u0001\u0000\u0000\u0000\u008dw\u0001\u0000"+
		"\u0000\u0000\u008d|\u0001\u0000\u0000\u0000\u008d\u0081\u0001\u0000\u0000"+
		"\u0000\u008d\u0086\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000"+
		"\u0000\u008e\u009b\u0001\u0000\u0000\u0000\u008f\u0090\n\u0003\u0000\u0000"+
		"\u0090\u0091\u0005\u001b\u0000\u0000\u0091\u0092\u0003\u0014\n\u0003\u0092"+
		"\u0093\u0006\n\uffff\uffff\u0000\u0093\u009a\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\n\u0002\u0000\u0000\u0095\u0096\u0005\u001c\u0000\u0000\u0096\u0097"+
		"\u0003\u0014\n\u0002\u0097\u0098\u0006\n\uffff\uffff\u0000\u0098\u009a"+
		"\u0001\u0000\u0000\u0000\u0099\u008f\u0001\u0000\u0000\u0000\u0099\u0094"+
		"\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0015"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u009f"+
		"\u0006\u000b\uffff\uffff\u0000\u009f\u00a0\u0005\u0013\u0000\u0000\u00a0"+
		"\u00a1\u0003\u0016\u000b\u0007\u00a1\u00a2\u0006\u000b\uffff\uffff\u0000"+
		"\u00a2\u00aa\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u0018\f\u0000\u00a4"+
		"\u00a5\u0006\u000b\uffff\uffff\u0000\u00a5\u00aa\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0003\u001a\r\u0000\u00a7\u00a8\u0006\u000b\uffff\uffff\u0000"+
		"\u00a8\u00aa\u0001\u0000\u0000\u0000\u00a9\u009e\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9\u00a6\u0001\u0000\u0000\u0000"+
		"\u00aa\u00c6\u0001\u0000\u0000\u0000\u00ab\u00ac\n\b\u0000\u0000\u00ac"+
		"\u00ad\u0005\u000f\u0000\u0000\u00ad\u00ae\u0003\u0016\u000b\b\u00ae\u00af"+
		"\u0006\u000b\uffff\uffff\u0000\u00af\u00c5\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b1\n\u0006\u0000\u0000\u00b1\u00b2\u0005\u0010\u0000\u0000\u00b2\u00b3"+
		"\u0003\u0016\u000b\u0007\u00b3\u00b4\u0006\u000b\uffff\uffff\u0000\u00b4"+
		"\u00c5\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0005\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0011\u0000\u0000\u00b7\u00b8\u0003\u0016\u000b\u0006\u00b8\u00b9"+
		"\u0006\u000b\uffff\uffff\u0000\u00b9\u00c5\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\n\u0004\u0000\u0000\u00bb\u00bc\u0005\u0012\u0000\u0000\u00bc\u00bd"+
		"\u0003\u0016\u000b\u0005\u00bd\u00be\u0006\u000b\uffff\uffff\u0000\u00be"+
		"\u00c5\u0001\u0000\u0000\u0000\u00bf\u00c0\n\u0003\u0000\u0000\u00c0\u00c1"+
		"\u0005\u0013\u0000\u0000\u00c1\u00c2\u0003\u0016\u000b\u0004\u00c2\u00c3"+
		"\u0006\u000b\uffff\uffff\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4"+
		"\u00ab\u0001\u0000\u0000\u0000\u00c4\u00b0\u0001\u0000\u0000\u0000\u00c4"+
		"\u00b5\u0001\u0000\u0000\u0000\u00c4\u00ba\u0001\u0000\u0000\u0000\u00c4"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u0017\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9"+
		"\u00ca\u0005\t\u0000\u0000\u00ca\u00d3\u0006\f\uffff\uffff\u0000\u00cb"+
		"\u00cc\u0005\n\u0000\u0000\u00cc\u00d3\u0006\f\uffff\uffff\u0000\u00cd"+
		"\u00ce\u0005\u000b\u0000\u0000\u00ce\u00cf\u0003\u0014\n\u0000\u00cf\u00d0"+
		"\u0005\f\u0000\u0000\u00d0\u00d1\u0006\f\uffff\uffff\u0000\u00d1\u00d3"+
		"\u0001\u0000\u0000\u0000\u00d2\u00c9\u0001\u0000\u0000\u0000\u00d2\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3\u0019"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0006\u0000\u0000\u00d5\u00d6"+
		"\u0005\u000b\u0000\u0000\u00d6\u00d7\u0005\f\u0000\u0000\u00d7\u00d8\u0006"+
		"\r\uffff\uffff\u0000\u00d8\u001b\u0001\u0000\u0000\u0000\n/Ae\u008d\u0099"+
		"\u009b\u00a9\u00c4\u00c6\u00d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}