// Generated from /Users/feviscom/workspace/jogFun/src/main/antlr4/JogFilter.g4 by ANTLR 4.7
package com.feviscom.server.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JogFilterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SCOL=1, DOT=2, OPEN_PAR=3, CLOSE_PAR=4, COMMA=5, ASSIGN=6, STAR=7, PLUS=8, 
		MINUS=9, TILDE=10, PIPE2=11, DIV=12, MOD=13, LT2=14, GT2=15, AMP=16, PIPE=17, 
		LT=18, LT_EQ=19, GT=20, GT_EQ=21, EQ=22, NOT_EQ1=23, NOT_EQ2=24, K_ABORT=25, 
		K_ACTION=26, K_ADD=27, K_AFTER=28, K_ALL=29, K_ALTER=30, K_ANALYZE=31, 
		K_AND=32, K_AS=33, K_ASC=34, K_ATTACH=35, K_AUTOINCREMENT=36, K_BEFORE=37, 
		K_BEGIN=38, K_BETWEEN=39, K_BY=40, K_CASCADE=41, K_CASE=42, K_CAST=43, 
		K_CHECK=44, K_COLLATE=45, K_COLUMN=46, K_COMMIT=47, K_CONFLICT=48, K_CONSTRAINT=49, 
		K_CREATE=50, K_CROSS=51, K_CURRENT_DATE=52, K_CURRENT_TIME=53, K_CURRENT_TIMESTAMP=54, 
		K_DATABASE=55, K_DEFAULT=56, K_DEFERRABLE=57, K_DEFERRED=58, K_DELETE=59, 
		K_DESC=60, K_DETACH=61, K_DISTINCT=62, K_DROP=63, K_EACH=64, K_ELSE=65, 
		K_END=66, K_ESCAPE=67, K_EXCEPT=68, K_EXCLUSIVE=69, K_EXISTS=70, K_EXPLAIN=71, 
		K_FAIL=72, K_FOR=73, K_FOREIGN=74, K_FROM=75, K_FULL=76, K_GLOB=77, K_GROUP=78, 
		K_HAVING=79, K_IF=80, K_IGNORE=81, K_IMMEDIATE=82, K_IN=83, K_INDEX=84, 
		K_INDEXED=85, K_INITIALLY=86, K_INNER=87, K_INSERT=88, K_INSTEAD=89, K_INTERSECT=90, 
		K_INTO=91, K_IS=92, K_ISNULL=93, K_JOIN=94, K_KEY=95, K_LEFT=96, K_LIKE=97, 
		K_LIMIT=98, K_MATCH=99, K_NATURAL=100, K_NO=101, K_NOT=102, K_NOTNULL=103, 
		K_NULL=104, K_OF=105, K_OFFSET=106, K_ON=107, K_OR=108, K_ORDER=109, K_OUTER=110, 
		K_PLAN=111, K_PRAGMA=112, K_PRIMARY=113, K_QUERY=114, K_RAISE=115, K_RECURSIVE=116, 
		K_REFERENCES=117, K_REGEXP=118, K_REINDEX=119, K_RELEASE=120, K_RENAME=121, 
		K_REPLACE=122, K_RESTRICT=123, K_RIGHT=124, K_ROLLBACK=125, K_ROW=126, 
		K_SAVEPOINT=127, K_SELECT=128, K_SET=129, K_TABLE=130, K_TEMP=131, K_TEMPORARY=132, 
		K_THEN=133, K_TO=134, K_TRANSACTION=135, K_TRIGGER=136, K_UNION=137, K_UNIQUE=138, 
		K_UPDATE=139, K_USING=140, K_VACUUM=141, K_VALUES=142, K_VIEW=143, K_VIRTUAL=144, 
		K_WHEN=145, K_WHERE=146, K_WITH=147, K_WITHOUT=148, IDENTIFIER=149, NUMERIC_LITERAL=150, 
		BIND_PARAMETER=151, STRING_LITERAL=152, BLOB_LITERAL=153, SPACES=154, 
		UNEXPECTED_CHAR=155;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_expr = 2, RULE_signed_number = 3, 
		RULE_literal_value = 4, RULE_unary_operator = 5, RULE_keyword = 6, RULE_name = 7, 
		RULE_function_name = 8, RULE_database_name = 9, RULE_table_name = 10, 
		RULE_table_or_index_name = 11, RULE_new_table_name = 12, RULE_column_name = 13, 
		RULE_collation_name = 14, RULE_foreign_table = 15, RULE_index_name = 16, 
		RULE_trigger_name = 17, RULE_view_name = 18, RULE_module_name = 19, RULE_pragma_name = 20, 
		RULE_savepoint_name = 21, RULE_table_alias = 22, RULE_transaction_name = 23, 
		RULE_any_name = 24;
	public static final String[] ruleNames = {
		"parse", "error", "expr", "signed_number", "literal_value", "unary_operator", 
		"keyword", "name", "function_name", "database_name", "table_name", "table_or_index_name", 
		"new_table_name", "column_name", "collation_name", "foreign_table", "index_name", 
		"trigger_name", "view_name", "module_name", "pragma_name", "savepoint_name", 
		"table_alias", "transaction_name", "any_name"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", 
		"'||'", "'/'", "'%'", "'<<'", "'>>'", "'&'", "'|'", "'<'", "'<='", "'>'", 
		"'>='", "'=='", "'!='", "'<>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", "STAR", 
		"PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", "AMP", 
		"PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", "NOT_EQ2", "K_ABORT", 
		"K_ACTION", "K_ADD", "K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", 
		"K_AS", "K_ASC", "K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", 
		"K_BETWEEN", "K_BY", "K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", 
		"K_COLUMN", "K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", 
		"K_CURRENT_DATE", "K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", 
		"K_DEFAULT", "K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", 
		"K_DISTINCT", "K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ESCAPE", "K_EXCEPT", 
		"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
		"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_IGNORE", 
		"K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", "K_INNER", 
		"K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", "K_ISNULL", 
		"K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", "K_NATURAL", 
		"K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", "K_OFFSET", "K_ON", "K_OR", 
		"K_ORDER", "K_OUTER", "K_PLAN", "K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", 
		"K_RECURSIVE", "K_REFERENCES", "K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", 
		"K_REPLACE", "K_RESTRICT", "K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", 
		"K_SELECT", "K_SET", "K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", 
		"K_TRANSACTION", "K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", 
		"K_VACUUM", "K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", 
		"K_WITHOUT", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
		"BLOB_LITERAL", "SPACES", "UNEXPECTED_CHAR"
	};
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
	public String getGrammarFileName() { return "JogFilter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public JogFilterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(JogFilterParser.EOF, 0); }
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case BIND_PARAMETER:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				expr(0);
				setState(52);
				match(EOF);
				}
				break;
			case UNEXPECTED_CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				error();
				setState(55);
				match(EOF);
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

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(JogFilterParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public TerminalNode BIND_PARAMETER() { return getToken(JogFilterParser.BIND_PARAMETER, 0); }
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(JogFilterParser.K_DISTINCT, 0); }
		public TerminalNode K_CASE() { return getToken(JogFilterParser.K_CASE, 0); }
		public TerminalNode K_END() { return getToken(JogFilterParser.K_END, 0); }
		public List<TerminalNode> K_WHEN() { return getTokens(JogFilterParser.K_WHEN); }
		public TerminalNode K_WHEN(int i) {
			return getToken(JogFilterParser.K_WHEN, i);
		}
		public List<TerminalNode> K_THEN() { return getTokens(JogFilterParser.K_THEN); }
		public TerminalNode K_THEN(int i) {
			return getToken(JogFilterParser.K_THEN, i);
		}
		public TerminalNode K_ELSE() { return getToken(JogFilterParser.K_ELSE, 0); }
		public TerminalNode K_IS() { return getToken(JogFilterParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(JogFilterParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(JogFilterParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(JogFilterParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(JogFilterParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(JogFilterParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(JogFilterParser.K_REGEXP, 0); }
		public TerminalNode K_AND() { return getToken(JogFilterParser.K_AND, 0); }
		public TerminalNode K_OR() { return getToken(JogFilterParser.K_OR, 0); }
		public TerminalNode K_BETWEEN() { return getToken(JogFilterParser.K_BETWEEN, 0); }
		public TerminalNode K_COLLATE() { return getToken(JogFilterParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ESCAPE() { return getToken(JogFilterParser.K_ESCAPE, 0); }
		public TerminalNode K_ISNULL() { return getToken(JogFilterParser.K_ISNULL, 0); }
		public TerminalNode K_NOTNULL() { return getToken(JogFilterParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(JogFilterParser.K_NULL, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(63);
				literal_value();
				}
				break;
			case 2:
				{
				setState(64);
				match(BIND_PARAMETER);
				}
				break;
			case 3:
				{
				setState(73);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						setState(65);
						database_name();
						setState(66);
						match(DOT);
						}
						break;
					}
					setState(70);
					table_name();
					setState(71);
					match(DOT);
					}
					break;
				}
				setState(75);
				column_name();
				}
				break;
			case 4:
				{
				setState(76);
				unary_operator();
				setState(77);
				expr(17);
				}
				break;
			case 5:
				{
				setState(79);
				function_name();
				setState(80);
				match(OPEN_PAR);
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case K_ABORT:
				case K_ACTION:
				case K_ADD:
				case K_AFTER:
				case K_ALL:
				case K_ALTER:
				case K_ANALYZE:
				case K_AND:
				case K_AS:
				case K_ASC:
				case K_ATTACH:
				case K_AUTOINCREMENT:
				case K_BEFORE:
				case K_BEGIN:
				case K_BETWEEN:
				case K_BY:
				case K_CASCADE:
				case K_CASE:
				case K_CAST:
				case K_CHECK:
				case K_COLLATE:
				case K_COLUMN:
				case K_COMMIT:
				case K_CONFLICT:
				case K_CONSTRAINT:
				case K_CREATE:
				case K_CROSS:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_DATABASE:
				case K_DEFAULT:
				case K_DEFERRABLE:
				case K_DEFERRED:
				case K_DELETE:
				case K_DESC:
				case K_DETACH:
				case K_DISTINCT:
				case K_DROP:
				case K_EACH:
				case K_ELSE:
				case K_END:
				case K_ESCAPE:
				case K_EXCEPT:
				case K_EXCLUSIVE:
				case K_EXISTS:
				case K_EXPLAIN:
				case K_FAIL:
				case K_FOR:
				case K_FOREIGN:
				case K_FROM:
				case K_FULL:
				case K_GLOB:
				case K_GROUP:
				case K_HAVING:
				case K_IF:
				case K_IGNORE:
				case K_IMMEDIATE:
				case K_IN:
				case K_INDEX:
				case K_INDEXED:
				case K_INITIALLY:
				case K_INNER:
				case K_INSERT:
				case K_INSTEAD:
				case K_INTERSECT:
				case K_INTO:
				case K_IS:
				case K_ISNULL:
				case K_JOIN:
				case K_KEY:
				case K_LEFT:
				case K_LIKE:
				case K_LIMIT:
				case K_MATCH:
				case K_NATURAL:
				case K_NO:
				case K_NOT:
				case K_NOTNULL:
				case K_NULL:
				case K_OF:
				case K_OFFSET:
				case K_ON:
				case K_OR:
				case K_ORDER:
				case K_OUTER:
				case K_PLAN:
				case K_PRAGMA:
				case K_PRIMARY:
				case K_QUERY:
				case K_RAISE:
				case K_RECURSIVE:
				case K_REFERENCES:
				case K_REGEXP:
				case K_REINDEX:
				case K_RELEASE:
				case K_RENAME:
				case K_REPLACE:
				case K_RESTRICT:
				case K_RIGHT:
				case K_ROLLBACK:
				case K_ROW:
				case K_SAVEPOINT:
				case K_SELECT:
				case K_SET:
				case K_TABLE:
				case K_TEMP:
				case K_TEMPORARY:
				case K_THEN:
				case K_TO:
				case K_TRANSACTION:
				case K_TRIGGER:
				case K_UNION:
				case K_UNIQUE:
				case K_UPDATE:
				case K_USING:
				case K_VACUUM:
				case K_VALUES:
				case K_VIEW:
				case K_VIRTUAL:
				case K_WHEN:
				case K_WHERE:
				case K_WITH:
				case K_WITHOUT:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case BIND_PARAMETER:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(81);
						match(K_DISTINCT);
						}
						break;
					}
					setState(84);
					expr(0);
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(85);
						match(COMMA);
						setState(86);
						expr(0);
						}
						}
						setState(91);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case STAR:
					{
					setState(92);
					match(STAR);
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(95);
				match(CLOSE_PAR);
				}
				break;
			case 6:
				{
				setState(97);
				match(OPEN_PAR);
				setState(98);
				expr(0);
				setState(99);
				match(CLOSE_PAR);
				}
				break;
			case 7:
				{
				setState(101);
				match(K_CASE);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(102);
					expr(0);
					}
					break;
				}
				setState(110); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(105);
					match(K_WHEN);
					setState(106);
					expr(0);
					setState(107);
					match(K_THEN);
					setState(108);
					expr(0);
					}
					}
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_WHEN );
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ELSE) {
					{
					setState(114);
					match(K_ELSE);
					setState(115);
					expr(0);
					}
				}

				setState(118);
				match(K_END);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(194);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(122);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(123);
						match(PIPE2);
						setState(124);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(125);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(126);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(132);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(135);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(150);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
						case 1:
							{
							setState(138);
							match(ASSIGN);
							}
							break;
						case 2:
							{
							setState(139);
							match(EQ);
							}
							break;
						case 3:
							{
							setState(140);
							match(NOT_EQ1);
							}
							break;
						case 4:
							{
							setState(141);
							match(NOT_EQ2);
							}
							break;
						case 5:
							{
							setState(142);
							match(K_IS);
							}
							break;
						case 6:
							{
							setState(143);
							match(K_IS);
							setState(144);
							match(K_NOT);
							}
							break;
						case 7:
							{
							setState(145);
							match(K_IN);
							}
							break;
						case 8:
							{
							setState(146);
							match(K_LIKE);
							}
							break;
						case 9:
							{
							setState(147);
							match(K_GLOB);
							}
							break;
						case 10:
							{
							setState(148);
							match(K_MATCH);
							}
							break;
						case 11:
							{
							setState(149);
							match(K_REGEXP);
							}
							break;
						}
						setState(152);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						match(K_AND);
						setState(155);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						match(K_OR);
						setState(158);
						expr(10);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160);
						match(K_IS);
						setState(162);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(161);
							match(K_NOT);
							}
							break;
						}
						setState(164);
						expr(4);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(165);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(166);
							match(K_NOT);
							}
						}

						setState(169);
						match(K_BETWEEN);
						setState(170);
						expr(0);
						setState(171);
						match(K_AND);
						setState(172);
						expr(3);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(174);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(175);
						match(K_COLLATE);
						setState(176);
						collation_name();
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(177);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==K_NOT) {
							{
							setState(178);
							match(K_NOT);
							}
						}

						setState(181);
						_la = _input.LA(1);
						if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (K_GLOB - 77)) | (1L << (K_LIKE - 77)) | (1L << (K_MATCH - 77)) | (1L << (K_REGEXP - 77)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						expr(0);
						setState(185);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
						case 1:
							{
							setState(183);
							match(K_ESCAPE);
							setState(184);
							expr(0);
							}
							break;
						}
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case K_ISNULL:
							{
							setState(188);
							match(K_ISNULL);
							}
							break;
						case K_NOTNULL:
							{
							setState(189);
							match(K_NOTNULL);
							}
							break;
						case K_NOT:
							{
							setState(190);
							match(K_NOT);
							setState(191);
							match(K_NULL);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(JogFilterParser.NUMERIC_LITERAL, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(199);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(202);
			match(NUMERIC_LITERAL);
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

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(JogFilterParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(JogFilterParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(JogFilterParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(JogFilterParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(JogFilterParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(JogFilterParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(JogFilterParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_CURRENT_DATE) | (1L << K_CURRENT_TIME) | (1L << K_CURRENT_TIMESTAMP))) != 0) || ((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (K_NULL - 104)) | (1L << (NUMERIC_LITERAL - 104)) | (1L << (STRING_LITERAL - 104)) | (1L << (BLOB_LITERAL - 104)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(JogFilterParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(JogFilterParser.K_ABORT, 0); }
		public TerminalNode K_ACTION() { return getToken(JogFilterParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(JogFilterParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(JogFilterParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(JogFilterParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(JogFilterParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(JogFilterParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(JogFilterParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(JogFilterParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(JogFilterParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(JogFilterParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(JogFilterParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(JogFilterParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(JogFilterParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(JogFilterParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(JogFilterParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(JogFilterParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(JogFilterParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(JogFilterParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(JogFilterParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(JogFilterParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(JogFilterParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(JogFilterParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(JogFilterParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(JogFilterParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(JogFilterParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(JogFilterParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(JogFilterParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(JogFilterParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(JogFilterParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(JogFilterParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(JogFilterParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(JogFilterParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(JogFilterParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(JogFilterParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(JogFilterParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(JogFilterParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(JogFilterParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(JogFilterParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(JogFilterParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(JogFilterParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(JogFilterParser.K_END, 0); }
		public TerminalNode K_ESCAPE() { return getToken(JogFilterParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(JogFilterParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(JogFilterParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(JogFilterParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(JogFilterParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(JogFilterParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(JogFilterParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(JogFilterParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(JogFilterParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(JogFilterParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(JogFilterParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(JogFilterParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(JogFilterParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(JogFilterParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(JogFilterParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(JogFilterParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(JogFilterParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(JogFilterParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(JogFilterParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(JogFilterParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(JogFilterParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(JogFilterParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(JogFilterParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(JogFilterParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(JogFilterParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(JogFilterParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(JogFilterParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(JogFilterParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(JogFilterParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(JogFilterParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(JogFilterParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(JogFilterParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(JogFilterParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(JogFilterParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(JogFilterParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(JogFilterParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(JogFilterParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(JogFilterParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(JogFilterParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(JogFilterParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(JogFilterParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(JogFilterParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(JogFilterParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(JogFilterParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(JogFilterParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(JogFilterParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(JogFilterParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(JogFilterParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(JogFilterParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(JogFilterParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(JogFilterParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(JogFilterParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(JogFilterParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(JogFilterParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(JogFilterParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(JogFilterParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(JogFilterParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(JogFilterParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(JogFilterParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(JogFilterParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(JogFilterParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(JogFilterParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(JogFilterParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(JogFilterParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(JogFilterParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(JogFilterParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(JogFilterParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(JogFilterParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(JogFilterParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(JogFilterParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(JogFilterParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(JogFilterParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(JogFilterParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(JogFilterParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(JogFilterParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(JogFilterParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(JogFilterParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(JogFilterParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(JogFilterParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(JogFilterParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(JogFilterParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(JogFilterParser.K_WITHOUT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !(((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (K_ABORT - 25)) | (1L << (K_ACTION - 25)) | (1L << (K_ADD - 25)) | (1L << (K_AFTER - 25)) | (1L << (K_ALL - 25)) | (1L << (K_ALTER - 25)) | (1L << (K_ANALYZE - 25)) | (1L << (K_AND - 25)) | (1L << (K_AS - 25)) | (1L << (K_ASC - 25)) | (1L << (K_ATTACH - 25)) | (1L << (K_AUTOINCREMENT - 25)) | (1L << (K_BEFORE - 25)) | (1L << (K_BEGIN - 25)) | (1L << (K_BETWEEN - 25)) | (1L << (K_BY - 25)) | (1L << (K_CASCADE - 25)) | (1L << (K_CASE - 25)) | (1L << (K_CAST - 25)) | (1L << (K_CHECK - 25)) | (1L << (K_COLLATE - 25)) | (1L << (K_COLUMN - 25)) | (1L << (K_COMMIT - 25)) | (1L << (K_CONFLICT - 25)) | (1L << (K_CONSTRAINT - 25)) | (1L << (K_CREATE - 25)) | (1L << (K_CROSS - 25)) | (1L << (K_CURRENT_DATE - 25)) | (1L << (K_CURRENT_TIME - 25)) | (1L << (K_CURRENT_TIMESTAMP - 25)) | (1L << (K_DATABASE - 25)) | (1L << (K_DEFAULT - 25)) | (1L << (K_DEFERRABLE - 25)) | (1L << (K_DEFERRED - 25)) | (1L << (K_DELETE - 25)) | (1L << (K_DESC - 25)) | (1L << (K_DETACH - 25)) | (1L << (K_DISTINCT - 25)) | (1L << (K_DROP - 25)) | (1L << (K_EACH - 25)) | (1L << (K_ELSE - 25)) | (1L << (K_END - 25)) | (1L << (K_ESCAPE - 25)) | (1L << (K_EXCEPT - 25)) | (1L << (K_EXCLUSIVE - 25)) | (1L << (K_EXISTS - 25)) | (1L << (K_EXPLAIN - 25)) | (1L << (K_FAIL - 25)) | (1L << (K_FOR - 25)) | (1L << (K_FOREIGN - 25)) | (1L << (K_FROM - 25)) | (1L << (K_FULL - 25)) | (1L << (K_GLOB - 25)) | (1L << (K_GROUP - 25)) | (1L << (K_HAVING - 25)) | (1L << (K_IF - 25)) | (1L << (K_IGNORE - 25)) | (1L << (K_IMMEDIATE - 25)) | (1L << (K_IN - 25)) | (1L << (K_INDEX - 25)) | (1L << (K_INDEXED - 25)) | (1L << (K_INITIALLY - 25)) | (1L << (K_INNER - 25)) | (1L << (K_INSERT - 25)))) != 0) || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (K_INSTEAD - 89)) | (1L << (K_INTERSECT - 89)) | (1L << (K_INTO - 89)) | (1L << (K_IS - 89)) | (1L << (K_ISNULL - 89)) | (1L << (K_JOIN - 89)) | (1L << (K_KEY - 89)) | (1L << (K_LEFT - 89)) | (1L << (K_LIKE - 89)) | (1L << (K_LIMIT - 89)) | (1L << (K_MATCH - 89)) | (1L << (K_NATURAL - 89)) | (1L << (K_NO - 89)) | (1L << (K_NOT - 89)) | (1L << (K_NOTNULL - 89)) | (1L << (K_NULL - 89)) | (1L << (K_OF - 89)) | (1L << (K_OFFSET - 89)) | (1L << (K_ON - 89)) | (1L << (K_OR - 89)) | (1L << (K_ORDER - 89)) | (1L << (K_OUTER - 89)) | (1L << (K_PLAN - 89)) | (1L << (K_PRAGMA - 89)) | (1L << (K_PRIMARY - 89)) | (1L << (K_QUERY - 89)) | (1L << (K_RAISE - 89)) | (1L << (K_RECURSIVE - 89)) | (1L << (K_REFERENCES - 89)) | (1L << (K_REGEXP - 89)) | (1L << (K_REINDEX - 89)) | (1L << (K_RELEASE - 89)) | (1L << (K_RENAME - 89)) | (1L << (K_REPLACE - 89)) | (1L << (K_RESTRICT - 89)) | (1L << (K_RIGHT - 89)) | (1L << (K_ROLLBACK - 89)) | (1L << (K_ROW - 89)) | (1L << (K_SAVEPOINT - 89)) | (1L << (K_SELECT - 89)) | (1L << (K_SET - 89)) | (1L << (K_TABLE - 89)) | (1L << (K_TEMP - 89)) | (1L << (K_TEMPORARY - 89)) | (1L << (K_THEN - 89)) | (1L << (K_TO - 89)) | (1L << (K_TRANSACTION - 89)) | (1L << (K_TRIGGER - 89)) | (1L << (K_UNION - 89)) | (1L << (K_UNIQUE - 89)) | (1L << (K_UPDATE - 89)) | (1L << (K_USING - 89)) | (1L << (K_VACUUM - 89)) | (1L << (K_VALUES - 89)) | (1L << (K_VIEW - 89)) | (1L << (K_VIRTUAL - 89)) | (1L << (K_WHEN - 89)) | (1L << (K_WHERE - 89)) | (1L << (K_WITH - 89)) | (1L << (K_WITHOUT - 89)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			any_name();
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

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			any_name();
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

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			any_name();
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

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			any_name();
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

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			any_name();
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

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			any_name();
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

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			any_name();
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

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			any_name();
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

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			any_name();
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

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			any_name();
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

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			any_name();
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

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			any_name();
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

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			any_name();
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

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			any_name();
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

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			any_name();
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

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			any_name();
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

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			any_name();
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

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(JogFilterParser.IDENTIFIER, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(JogFilterParser.STRING_LITERAL, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JogFilterListener ) ((JogFilterListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JogFilterVisitor ) return ((JogFilterVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_any_name);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(IDENTIFIER);
				}
				break;
			case K_ABORT:
			case K_ACTION:
			case K_ADD:
			case K_AFTER:
			case K_ALL:
			case K_ALTER:
			case K_ANALYZE:
			case K_AND:
			case K_AS:
			case K_ASC:
			case K_ATTACH:
			case K_AUTOINCREMENT:
			case K_BEFORE:
			case K_BEGIN:
			case K_BETWEEN:
			case K_BY:
			case K_CASCADE:
			case K_CASE:
			case K_CAST:
			case K_CHECK:
			case K_COLLATE:
			case K_COLUMN:
			case K_COMMIT:
			case K_CONFLICT:
			case K_CONSTRAINT:
			case K_CREATE:
			case K_CROSS:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DATABASE:
			case K_DEFAULT:
			case K_DEFERRABLE:
			case K_DEFERRED:
			case K_DELETE:
			case K_DESC:
			case K_DETACH:
			case K_DISTINCT:
			case K_DROP:
			case K_EACH:
			case K_ELSE:
			case K_END:
			case K_ESCAPE:
			case K_EXCEPT:
			case K_EXCLUSIVE:
			case K_EXISTS:
			case K_EXPLAIN:
			case K_FAIL:
			case K_FOR:
			case K_FOREIGN:
			case K_FROM:
			case K_FULL:
			case K_GLOB:
			case K_GROUP:
			case K_HAVING:
			case K_IF:
			case K_IGNORE:
			case K_IMMEDIATE:
			case K_IN:
			case K_INDEX:
			case K_INDEXED:
			case K_INITIALLY:
			case K_INNER:
			case K_INSERT:
			case K_INSTEAD:
			case K_INTERSECT:
			case K_INTO:
			case K_IS:
			case K_ISNULL:
			case K_JOIN:
			case K_KEY:
			case K_LEFT:
			case K_LIKE:
			case K_LIMIT:
			case K_MATCH:
			case K_NATURAL:
			case K_NO:
			case K_NOT:
			case K_NOTNULL:
			case K_NULL:
			case K_OF:
			case K_OFFSET:
			case K_ON:
			case K_OR:
			case K_ORDER:
			case K_OUTER:
			case K_PLAN:
			case K_PRAGMA:
			case K_PRIMARY:
			case K_QUERY:
			case K_RAISE:
			case K_RECURSIVE:
			case K_REFERENCES:
			case K_REGEXP:
			case K_REINDEX:
			case K_RELEASE:
			case K_RENAME:
			case K_REPLACE:
			case K_RESTRICT:
			case K_RIGHT:
			case K_ROLLBACK:
			case K_ROW:
			case K_SAVEPOINT:
			case K_SELECT:
			case K_SET:
			case K_TABLE:
			case K_TEMP:
			case K_TEMPORARY:
			case K_THEN:
			case K_TO:
			case K_TRANSACTION:
			case K_TRIGGER:
			case K_UNION:
			case K_UNIQUE:
			case K_UPDATE:
			case K_USING:
			case K_VACUUM:
			case K_VALUES:
			case K_VIEW:
			case K_VIRTUAL:
			case K_WHEN:
			case K_WHERE:
			case K_WITH:
			case K_WITHOUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				keyword();
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(247);
				match(OPEN_PAR);
				setState(248);
				any_name();
				setState(249);
				match(CLOSE_PAR);
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
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 9);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 2);
		case 10:
			return precpred(_ctx, 6);
		case 11:
			return precpred(_ctx, 5);
		case 12:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009d\u0100\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2<\n\2\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4G\n\4\3\4\3\4\3\4\5\4L\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4U\n\4\3\4\3\4\3\4\7\4Z\n\4\f\4\16\4]\13\4\3\4\5\4`\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4j\n\4\3\4\3\4\3\4\3\4\3\4\6\4q\n\4\r\4\16\4"+
		"r\3\4\3\4\5\4w\n\4\3\4\3\4\5\4{\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0099\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00a5"+
		"\n\4\3\4\3\4\3\4\5\4\u00aa\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u00b6\n\4\3\4\3\4\3\4\3\4\5\4\u00bc\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00c3"+
		"\n\4\7\4\u00c5\n\4\f\4\16\4\u00c8\13\4\3\5\5\5\u00cb\n\5\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00fe\n\32\3\32\2\3\6\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\n\4\2\t\t\16\17\3\2\n\13\3\2\20\23\3\2\24\27\6\2"+
		"OOcceexx\6\2\668jj\u0098\u0098\u009a\u009b\4\2\n\fhh\3\2\33\u0096\2\u0118"+
		"\2;\3\2\2\2\4=\3\2\2\2\6z\3\2\2\2\b\u00ca\3\2\2\2\n\u00ce\3\2\2\2\f\u00d0"+
		"\3\2\2\2\16\u00d2\3\2\2\2\20\u00d4\3\2\2\2\22\u00d6\3\2\2\2\24\u00d8\3"+
		"\2\2\2\26\u00da\3\2\2\2\30\u00dc\3\2\2\2\32\u00de\3\2\2\2\34\u00e0\3\2"+
		"\2\2\36\u00e2\3\2\2\2 \u00e4\3\2\2\2\"\u00e6\3\2\2\2$\u00e8\3\2\2\2&\u00ea"+
		"\3\2\2\2(\u00ec\3\2\2\2*\u00ee\3\2\2\2,\u00f0\3\2\2\2.\u00f2\3\2\2\2\60"+
		"\u00f4\3\2\2\2\62\u00fd\3\2\2\2\64<\3\2\2\2\65\66\5\6\4\2\66\67\7\2\2"+
		"\3\67<\3\2\2\289\5\4\3\29:\7\2\2\3:<\3\2\2\2;\64\3\2\2\2;\65\3\2\2\2;"+
		"8\3\2\2\2<\3\3\2\2\2=>\7\u009d\2\2>?\b\3\1\2?\5\3\2\2\2@A\b\4\1\2A{\5"+
		"\n\6\2B{\7\u0099\2\2CD\5\24\13\2DE\7\4\2\2EG\3\2\2\2FC\3\2\2\2FG\3\2\2"+
		"\2GH\3\2\2\2HI\5\26\f\2IJ\7\4\2\2JL\3\2\2\2KF\3\2\2\2KL\3\2\2\2LM\3\2"+
		"\2\2M{\5\34\17\2NO\5\f\7\2OP\5\6\4\23P{\3\2\2\2QR\5\22\n\2R_\7\5\2\2S"+
		"U\7@\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2V[\5\6\4\2WX\7\7\2\2XZ\5\6\4\2Y"+
		"W\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\`\3\2\2\2][\3\2\2\2^`\7\t\2"+
		"\2_T\3\2\2\2_^\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\6\2\2b{\3\2\2\2cd\7\5\2"+
		"\2de\5\6\4\2ef\7\6\2\2f{\3\2\2\2gi\7,\2\2hj\5\6\4\2ih\3\2\2\2ij\3\2\2"+
		"\2jp\3\2\2\2kl\7\u0093\2\2lm\5\6\4\2mn\7\u0087\2\2no\5\6\4\2oq\3\2\2\2"+
		"pk\3\2\2\2qr\3\2\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tu\7C\2\2uw\5\6\4\2"+
		"vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\7D\2\2y{\3\2\2\2z@\3\2\2\2zB\3\2\2\2"+
		"zK\3\2\2\2zN\3\2\2\2zQ\3\2\2\2zc\3\2\2\2zg\3\2\2\2{\u00c6\3\2\2\2|}\f"+
		"\22\2\2}~\7\r\2\2~\u00c5\5\6\4\23\177\u0080\f\21\2\2\u0080\u0081\t\2\2"+
		"\2\u0081\u00c5\5\6\4\22\u0082\u0083\f\20\2\2\u0083\u0084\t\3\2\2\u0084"+
		"\u00c5\5\6\4\21\u0085\u0086\f\17\2\2\u0086\u0087\t\4\2\2\u0087\u00c5\5"+
		"\6\4\20\u0088\u0089\f\16\2\2\u0089\u008a\t\5\2\2\u008a\u00c5\5\6\4\17"+
		"\u008b\u0098\f\r\2\2\u008c\u0099\7\b\2\2\u008d\u0099\7\30\2\2\u008e\u0099"+
		"\7\31\2\2\u008f\u0099\7\32\2\2\u0090\u0099\7^\2\2\u0091\u0092\7^\2\2\u0092"+
		"\u0099\7h\2\2\u0093\u0099\7U\2\2\u0094\u0099\7c\2\2\u0095\u0099\7O\2\2"+
		"\u0096\u0099\7e\2\2\u0097\u0099\7x\2\2\u0098\u008c\3\2\2\2\u0098\u008d"+
		"\3\2\2\2\u0098\u008e\3\2\2\2\u0098\u008f\3\2\2\2\u0098\u0090\3\2\2\2\u0098"+
		"\u0091\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0094\3\2\2\2\u0098\u0095\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\u00c5\5\6\4\16\u009b\u009c\f\f\2\2\u009c\u009d\7\"\2\2\u009d\u00c5\5"+
		"\6\4\r\u009e\u009f\f\13\2\2\u009f\u00a0\7n\2\2\u00a0\u00c5\5\6\4\f\u00a1"+
		"\u00a2\f\5\2\2\u00a2\u00a4\7^\2\2\u00a3\u00a5\7h\2\2\u00a4\u00a3\3\2\2"+
		"\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00c5\5\6\4\6\u00a7\u00a9"+
		"\f\4\2\2\u00a8\u00aa\7h\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\7)\2\2\u00ac\u00ad\5\6\4\2\u00ad\u00ae\7\""+
		"\2\2\u00ae\u00af\5\6\4\5\u00af\u00c5\3\2\2\2\u00b0\u00b1\f\b\2\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00c5\5\36\20\2\u00b3\u00b5\f\7\2\2\u00b4\u00b6\7"+
		"h\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\t\6\2\2\u00b8\u00bb\5\6\4\2\u00b9\u00ba\7E\2\2\u00ba\u00bc\5\6"+
		"\4\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c5\3\2\2\2\u00bd"+
		"\u00c2\f\6\2\2\u00be\u00c3\7_\2\2\u00bf\u00c3\7i\2\2\u00c0\u00c1\7h\2"+
		"\2\u00c1\u00c3\7j\2\2\u00c2\u00be\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c2\u00c0"+
		"\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4|\3\2\2\2\u00c4\177\3\2\2\2\u00c4\u0082"+
		"\3\2\2\2\u00c4\u0085\3\2\2\2\u00c4\u0088\3\2\2\2\u00c4\u008b\3\2\2\2\u00c4"+
		"\u009b\3\2\2\2\u00c4\u009e\3\2\2\2\u00c4\u00a1\3\2\2\2\u00c4\u00a7\3\2"+
		"\2\2\u00c4\u00b0\3\2\2\2\u00c4\u00b3\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c5"+
		"\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\7\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c9\u00cb\t\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\u0098\2\2\u00cd\t\3\2\2\2\u00ce"+
		"\u00cf\t\7\2\2\u00cf\13\3\2\2\2\u00d0\u00d1\t\b\2\2\u00d1\r\3\2\2\2\u00d2"+
		"\u00d3\t\t\2\2\u00d3\17\3\2\2\2\u00d4\u00d5\5\62\32\2\u00d5\21\3\2\2\2"+
		"\u00d6\u00d7\5\62\32\2\u00d7\23\3\2\2\2\u00d8\u00d9\5\62\32\2\u00d9\25"+
		"\3\2\2\2\u00da\u00db\5\62\32\2\u00db\27\3\2\2\2\u00dc\u00dd\5\62\32\2"+
		"\u00dd\31\3\2\2\2\u00de\u00df\5\62\32\2\u00df\33\3\2\2\2\u00e0\u00e1\5"+
		"\62\32\2\u00e1\35\3\2\2\2\u00e2\u00e3\5\62\32\2\u00e3\37\3\2\2\2\u00e4"+
		"\u00e5\5\62\32\2\u00e5!\3\2\2\2\u00e6\u00e7\5\62\32\2\u00e7#\3\2\2\2\u00e8"+
		"\u00e9\5\62\32\2\u00e9%\3\2\2\2\u00ea\u00eb\5\62\32\2\u00eb\'\3\2\2\2"+
		"\u00ec\u00ed\5\62\32\2\u00ed)\3\2\2\2\u00ee\u00ef\5\62\32\2\u00ef+\3\2"+
		"\2\2\u00f0\u00f1\5\62\32\2\u00f1-\3\2\2\2\u00f2\u00f3\5\62\32\2\u00f3"+
		"/\3\2\2\2\u00f4\u00f5\5\62\32\2\u00f5\61\3\2\2\2\u00f6\u00fe\7\u0097\2"+
		"\2\u00f7\u00fe\5\16\b\2\u00f8\u00fe\7\u009a\2\2\u00f9\u00fa\7\5\2\2\u00fa"+
		"\u00fb\5\62\32\2\u00fb\u00fc\7\6\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00f6\3"+
		"\2\2\2\u00fd\u00f7\3\2\2\2\u00fd\u00f8\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe"+
		"\63\3\2\2\2\26;FKT[_irvz\u0098\u00a4\u00a9\u00b5\u00bb\u00c2\u00c4\u00c6"+
		"\u00ca\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}