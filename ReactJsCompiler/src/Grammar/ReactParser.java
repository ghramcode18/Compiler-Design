// Generated from /home/ghram/Downloads/ReactJsCompiler/src/Grammar/ReactParser.g4 by ANTLR 4.13.1
package Grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OpenBracket=1, CloseBracket=2, OpenParen=3, CloseParen=4, OpenBrace=5, 
		CloseBrace=6, SemiColon=7, Comma=8, Assign=9, Not=10, QuestionMark=11, 
		Colon=12, Dot=13, SingleCotation=14, DoubleCotation=15, Plus=16, Minus=17, 
		Multiply=18, Divide=19, Modulus=20, Increment=21, Decrement=22, Assign_Plus=23, 
		Assign_Minus=24, Assign_Multiply=25, Assign_Divide=26, LessThan=27, MoreThan=28, 
		LessThanEquals=29, GreaterThanEquals=30, Equals_=31, NotEquals=32, IdentityEquals=33, 
		IdentityNotEquals=34, And=35, Or=36, ARROW=37, Do=38, While=39, If=40, 
		Elseif=41, Else=42, Void=43, Return=44, For=45, Switch=46, Case=47, Break=48, 
		Continue=49, Var=50, Let=51, Const=52, Function=53, This=54, Default=55, 
		In=56, Import=57, Export=58, From=59, Map=60, Console=61, Log=62, Div=63, 
		P=64, H1=65, H2=66, H3=67, H4=68, H5=69, H6=70, Button=71, Img=72, Usestate=73, 
		Useeffect=74, Useref=75, Set=76, NullLiteral=77, BooleanLiteral=78, StringLiteral=79, 
		CharLiteral=80, IntLiteral=81, FloatLiteral=82, Identifier=83, WS=84, 
		MultiLineComment=85, SingleLineComment=86;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importStatment = 2, RULE_importBody = 3, 
		RULE_singleHookImport = 4, RULE_componentStatment = 5, RULE_componentBody = 6, 
		RULE_returnBody = 7, RULE_jsxElement = 8, RULE_htmlTag = 9, RULE_htmlAttribute = 10, 
		RULE_htmlContent = 11, RULE_variableDeclaration = 12, RULE_arrayDeclaration = 13, 
		RULE_arrayContent = 14, RULE_arrayElement = 15, RULE_functionDeclaration = 16, 
		RULE_functionReturn = 17, RULE_parameters = 18, RULE_hooksDeclaration = 19, 
		RULE_hooksReturn = 20, RULE_expression = 21, RULE_functionCall = 22, RULE_ifStatement = 23, 
		RULE_whileStatement = 24, RULE_doWhileStatement = 25, RULE_forStatement = 26, 
		RULE_switchStatement = 27, RULE_switchBlock = 28, RULE_caseBlock = 29, 
		RULE_defaultBlock = 30, RULE_type = 31, RULE_initial = 32, RULE_stringLiteral = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importStatment", "importBody", "singleHookImport", 
			"componentStatment", "componentBody", "returnBody", "jsxElement", "htmlTag", 
			"htmlAttribute", "htmlContent", "variableDeclaration", "arrayDeclaration", 
			"arrayContent", "arrayElement", "functionDeclaration", "functionReturn", 
			"parameters", "hooksDeclaration", "hooksReturn", "expression", "functionCall", 
			"ifStatement", "whileStatement", "doWhileStatement", "forStatement", 
			"switchStatement", "switchBlock", "caseBlock", "defaultBlock", "type", 
			"initial", "stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", 
			"'!'", "'?'", "':'", "'.'", "'''", "'\"'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'++'", "'--'", "'+='", "'-='", "'*='", "'/='", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'==='", "'!=='", "'&&'", "'||'", "'=>'", 
			"'do'", "'while'", "'if'", "'elseif'", "'else'", "'void'", "'return'", 
			"'for'", "'switch'", "'case'", "'break'", "'continue'", "'var'", "'let'", 
			"'const'", "'function'", "'this'", "'default'", "'in'", "'import'", "'export'", 
			"'from'", "'map'", "'console'", "'log'", "'div'", "'p'", "'h1'", "'h2'", 
			"'h3'", "'h4'", "'h5'", "'h6'", "'button'", "'img'", "'useState'", "'useEffect'", 
			"'useRef'", "'set'", "'null'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "Not", "QuestionMark", 
			"Colon", "Dot", "SingleCotation", "DoubleCotation", "Plus", "Minus", 
			"Multiply", "Divide", "Modulus", "Increment", "Decrement", "Assign_Plus", 
			"Assign_Minus", "Assign_Multiply", "Assign_Divide", "LessThan", "MoreThan", 
			"LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", "IdentityEquals", 
			"IdentityNotEquals", "And", "Or", "ARROW", "Do", "While", "If", "Elseif", 
			"Else", "Void", "Return", "For", "Switch", "Case", "Break", "Continue", 
			"Var", "Let", "Const", "Function", "This", "Default", "In", "Import", 
			"Export", "From", "Map", "Console", "Log", "Div", "P", "H1", "H2", "H3", 
			"H4", "H5", "H6", "Button", "Img", "Usestate", "Useeffect", "Useref", 
			"Set", "NullLiteral", "BooleanLiteral", "StringLiteral", "CharLiteral", 
			"IntLiteral", "FloatLiteral", "Identifier", "WS", "MultiLineComment", 
			"SingleLineComment"
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 441352763482308608L) != 0) );
			setState(73);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ImportStateContext extends StatementContext {
		public ImportStatmentContext importStatment() {
			return getRuleContext(ImportStatmentContext.class,0);
		}
		public ImportStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportState(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStateContext extends StatementContext {
		public ComponentStatmentContext componentStatment() {
			return getRuleContext(ComponentStatmentContext.class,0);
		}
		public ComponentStateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Import:
				_localctx = new ImportStateContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				importStatment();
				}
				break;
			case Function:
			case Export:
				_localctx = new ComponentStateContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				componentStatment();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportStatmentContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public List<ImportBodyContext> importBody() {
			return getRuleContexts(ImportBodyContext.class);
		}
		public ImportBodyContext importBody(int i) {
			return getRuleContext(ImportBodyContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public ImportStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportStatmentContext importStatment() throws RecognitionException {
		ImportStatmentContext _localctx = new ImportStatmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(Import);
			setState(80);
			importBody();
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(81);
				match(Comma);
				setState(82);
				importBody();
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(88);
				match(SemiColon);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImportBodyContext extends ParserRuleContext {
		public ImportBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importBody; }
	 
		public ImportBodyContext() { }
		public void copyFrom(ImportBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HooksImportContext extends ImportBodyContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<SingleHookImportContext> singleHookImport() {
			return getRuleContexts(SingleHookImportContext.class);
		}
		public SingleHookImportContext singleHookImport(int i) {
			return getRuleContext(SingleHookImportContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public HooksImportContext(ImportBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooksImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooksImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooksImport(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LibraryImportContext extends ImportBodyContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LibraryImportContext(ImportBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLibraryImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLibraryImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLibraryImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportBodyContext importBody() throws RecognitionException {
		ImportBodyContext _localctx = new ImportBodyContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importBody);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new LibraryImportContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(Identifier);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==From) {
					{
					setState(92);
					match(From);
					}
				}

				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 19L) != 0)) {
					{
					setState(95);
					stringLiteral();
					}
				}

				}
				break;
			case 2:
				_localctx = new HooksImportContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(OpenBrace);
				setState(99);
				singleHookImport();
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(100);
					match(Comma);
					setState(101);
					singleHookImport();
					}
					}
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(107);
				match(CloseBrace);
				setState(108);
				match(From);
				setState(109);
				stringLiteral();
				}
				break;
			case 3:
				_localctx = new LibraryImportContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				stringLiteral();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SingleHookImportContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Usestate() { return getToken(ReactParser.Usestate, 0); }
		public TerminalNode Useref() { return getToken(ReactParser.Useref, 0); }
		public TerminalNode Useeffect() { return getToken(ReactParser.Useeffect, 0); }
		public SingleHookImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleHookImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSingleHookImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSingleHookImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSingleHookImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleHookImportContext singleHookImport() throws RecognitionException {
		SingleHookImportContext _localctx = new SingleHookImportContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleHookImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_la = _input.LA(1);
			if ( !(((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 1031L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentStatmentContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(ReactParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public ReturnBodyContext returnBody() {
			return getRuleContext(ReturnBodyContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<ComponentBodyContext> componentBody() {
			return getRuleContexts(ComponentBodyContext.class);
		}
		public ComponentBodyContext componentBody(int i) {
			return getRuleContext(ComponentBodyContext.class,i);
		}
		public ComponentStatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentStatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComponentStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComponentStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComponentStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentStatmentContext componentStatment() throws RecognitionException {
		ComponentStatmentContext _localctx = new ComponentStatmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_componentStatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Export) {
				{
				setState(116);
				match(Export);
				setState(117);
				match(Default);
				}
			}

			setState(120);
			match(Function);
			setState(121);
			match(Identifier);
			setState(122);
			match(OpenParen);
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || _la==Identifier) {
				{
				setState(123);
				parameters();
				}
			}

			setState(126);
			match(CloseParen);
			setState(127);
			match(OpenBrace);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16995975864254472L) != 0) || _la==Useeffect || _la==Identifier) {
				{
				{
				setState(128);
				componentBody();
				}
				}
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(134);
			returnBody();
			setState(135);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentBodyContext extends ParserRuleContext {
		public ComponentBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentBody; }
	 
		public ComponentBodyContext() { }
		public void copyFrom(ComponentBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCompoContext extends ComponentBodyContext {
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public FunctionCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class HooksCompoContext extends ComponentBodyContext {
		public HooksDeclarationContext hooksDeclaration() {
			return getRuleContext(HooksDeclarationContext.class,0);
		}
		public HooksCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooksCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooksCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooksCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileCompoContext extends ComponentBodyContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public WhileCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchCompoContext extends ComponentBodyContext {
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public SwitchCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitchCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitchCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitchCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCompoContext extends ComponentBodyContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public ForCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayCompoContext extends ComponentBodyContext {
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
		}
		public ArrayCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfCompoContext extends ComponentBodyContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IfCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileCompoContext extends ComponentBodyContext {
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public DoWhileCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDoWhileCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDoWhileCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDoWhileCompo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableCompoContext extends ComponentBodyContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public VariableCompoContext(ComponentBodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableCompo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableCompo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableCompo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentBodyContext componentBody() throws RecognitionException {
		ComponentBodyContext _localctx = new ComponentBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_componentBody);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new VariableCompoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				variableDeclaration();
				}
				break;
			case 2:
				_localctx = new ArrayCompoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				arrayDeclaration();
				}
				break;
			case 3:
				_localctx = new FunctionCompoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				functionDeclaration();
				}
				break;
			case 4:
				_localctx = new HooksCompoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				hooksDeclaration();
				}
				break;
			case 5:
				_localctx = new IfCompoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				ifStatement();
				}
				break;
			case 6:
				_localctx = new WhileCompoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				whileStatement();
				}
				break;
			case 7:
				_localctx = new DoWhileCompoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				doWhileStatement();
				}
				break;
			case 8:
				_localctx = new ForCompoContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				forStatement();
				}
				break;
			case 9:
				_localctx = new SwitchCompoContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				switchStatement();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnBodyContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public ReturnBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBodyContext returnBody() throws RecognitionException {
		ReturnBodyContext _localctx = new ReturnBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(Return);
			setState(149);
			match(OpenParen);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				jsxElement();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LessThan );
			setState(155);
			match(CloseParen);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(156);
				match(SemiColon);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
	 
		public JsxElementContext() { }
		public void copyFrom(JsxElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JSXOpenCloseContext extends JsxElementContext {
		public List<TerminalNode> LessThan() { return getTokens(ReactParser.LessThan); }
		public TerminalNode LessThan(int i) {
			return getToken(ReactParser.LessThan, i);
		}
		public List<TerminalNode> MoreThan() { return getTokens(ReactParser.MoreThan); }
		public TerminalNode MoreThan(int i) {
			return getToken(ReactParser.MoreThan, i);
		}
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public List<HtmlTagContext> htmlTag() {
			return getRuleContexts(HtmlTagContext.class);
		}
		public HtmlTagContext htmlTag(int i) {
			return getRuleContext(HtmlTagContext.class,i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<HtmlContentContext> htmlContent() {
			return getRuleContexts(HtmlContentContext.class);
		}
		public HtmlContentContext htmlContent(int i) {
			return getRuleContext(HtmlContentContext.class,i);
		}
		public JSXOpenCloseContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJSXOpenClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJSXOpenClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJSXOpenClose(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JSXOpenContext extends JsxElementContext {
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public HtmlTagContext htmlTag() {
			return getRuleContext(HtmlTagContext.class,0);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public JSXOpenContext(JsxElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJSXOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJSXOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJSXOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jsxElement);
		int _la;
		try {
			int _alt;
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new JSXOpenCloseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(LessThan);
				setState(161);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(160);
					htmlTag();
					}
					break;
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(163);
					htmlAttribute();
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(169);
				match(MoreThan);
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						htmlContent();
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(176);
				match(LessThan);
				setState(177);
				match(Divide);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 1049599L) != 0)) {
					{
					setState(178);
					htmlTag();
					}
				}

				setState(181);
				match(MoreThan);
				}
				break;
			case 2:
				_localctx = new JSXOpenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(LessThan);
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(183);
					htmlTag();
					}
					break;
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Identifier) {
					{
					{
					setState(186);
					htmlAttribute();
					}
					}
					setState(191);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Divide) {
					{
					setState(192);
					match(Divide);
					}
				}

				setState(195);
				match(MoreThan);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlTagContext extends ParserRuleContext {
		public TerminalNode Div() { return getToken(ReactParser.Div, 0); }
		public TerminalNode P() { return getToken(ReactParser.P, 0); }
		public TerminalNode H1() { return getToken(ReactParser.H1, 0); }
		public TerminalNode H2() { return getToken(ReactParser.H2, 0); }
		public TerminalNode H3() { return getToken(ReactParser.H3, 0); }
		public TerminalNode H4() { return getToken(ReactParser.H4, 0); }
		public TerminalNode H5() { return getToken(ReactParser.H5, 0); }
		public TerminalNode H6() { return getToken(ReactParser.H6, 0); }
		public TerminalNode Button() { return getToken(ReactParser.Button, 0); }
		public TerminalNode Img() { return getToken(ReactParser.Img, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public HtmlTagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlTag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlTag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtmlTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContext htmlTag() throws RecognitionException {
		HtmlTagContext _localctx = new HtmlTagContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_htmlTag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 1049599L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlAttributeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<StringLiteralContext> stringLiteral() {
			return getRuleContexts(StringLiteralContext.class);
		}
		public StringLiteralContext stringLiteral(int i) {
			return getRuleContext(StringLiteralContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_htmlAttribute);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(Identifier);
			setState(201);
			match(Assign);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(202);
				match(OpenBrace);
				}
			}

			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(215);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(205);
						match(Identifier);
						setState(210);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Dot) {
							{
							{
							setState(206);
							match(Dot);
							setState(207);
							match(Identifier);
							}
							}
							setState(212);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(213);
						stringLiteral();
						}
						break;
					case 3:
						{
						setState(214);
						functionDeclaration();
						}
						break;
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CloseBrace) {
				{
				setState(220);
				match(CloseBrace);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlContentContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public TerminalNode Map() { return getToken(ReactParser.Map, 0); }
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public TerminalNode And() { return getToken(ReactParser.And, 0); }
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_htmlContent);
		int _la;
		try {
			int _alt;
			setState(298);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(OpenBrace);
				setState(224);
				match(Identifier);
				setState(225);
				match(Dot);
				setState(226);
				match(Map);
				setState(227);
				match(OpenParen);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					{
					setState(228);
					expression(0);
					}
					}
					setState(233);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(234);
				match(ARROW);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OpenParen) {
					{
					{
					setState(235);
					match(OpenParen);
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LessThan) {
					{
					setState(241);
					jsxElement();
					}
				}

				setState(245);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(244);
					match(CloseParen);
					}
					break;
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CloseParen) {
					{
					setState(247);
					match(CloseParen);
					}
				}

				setState(250);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Colon || _la==Dot) {
					{
					setState(251);
					_la = _input.LA(1);
					if ( !(_la==Colon || _la==Dot) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(254);
					match(OpenBrace);
					}
				}

				setState(257);
				match(Identifier);
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						match(Dot);
						setState(259);
						match(Identifier);
						}
						} 
					}
					setState(264);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CloseBrace) {
					{
					setState(265);
					match(CloseBrace);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(268);
					match(OpenBrace);
					}
				}

				setState(272); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(271);
						jsxElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(274); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CloseBrace) {
					{
					setState(276);
					match(CloseBrace);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenBrace) {
					{
					setState(279);
					match(OpenBrace);
					}
				}

				setState(282);
				match(Identifier);
				setState(283);
				match(And);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OpenParen) {
					{
					setState(284);
					match(OpenParen);
					}
				}

				setState(288); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(287);
						jsxElement();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(290); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CloseParen) {
					{
					setState(292);
					match(CloseParen);
					}
				}

				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CloseBrace) {
					{
					setState(295);
					match(CloseBrace);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			type();
			setState(301);
			match(Identifier);
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(302);
				match(Assign);
				setState(303);
				expression(0);
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(306);
				match(SemiColon);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<ArrayContentContext> arrayContent() {
			return getRuleContexts(ArrayContentContext.class);
		}
		public ArrayContentContext arrayContent(int i) {
			return getRuleContext(ArrayContentContext.class,i);
		}
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			type();
			setState(310);
			match(Identifier);
			setState(311);
			match(Assign);
			setState(312);
			match(OpenBracket);
			setState(313);
			arrayContent();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(314);
				match(Comma);
				setState(315);
				arrayContent();
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
			match(CloseBracket);
			setState(322);
			match(SemiColon);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContentContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ArrayContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContentContext arrayContent() throws RecognitionException {
		ArrayContentContext _localctx = new ArrayContentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrayContent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OpenBrace);
			setState(325);
			arrayElement();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(326);
				match(Comma);
				setState(327);
				arrayElement();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
			match(CloseBrace);
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(334);
				match(Comma);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayElementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(Identifier);
			setState(338);
			match(Colon);
			setState(339);
			stringLiteral();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Function() { return getToken(ReactParser.Function, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public FunctionReturnContext functionReturn() {
			return getRuleContext(FunctionReturnContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function) {
				{
				setState(341);
				match(Function);
				}
			}

			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(344);
				match(Identifier);
				}
			}

			setState(347);
			match(OpenParen);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || _la==Identifier) {
				{
				setState(348);
				parameters();
				}
			}

			setState(351);
			match(CloseParen);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ARROW) {
				{
				setState(352);
				match(ARROW);
				}
			}

			setState(355);
			match(OpenBrace);
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(356);
				expression(0);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(362);
				functionReturn();
				}
			}

			setState(365);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public FunctionReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnContext functionReturn() throws RecognitionException {
		FunctionReturnContext _localctx = new FunctionReturnContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(Return);
			setState(368);
			match(OpenParen);
			setState(372);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(369);
				expression(0);
				}
				}
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(375);
			match(CloseParen);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SemiColon) {
				{
				setState(376);
				match(SemiColon);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace) {
				{
				setState(379);
				match(OpenBrace);
				}
			}

			setState(382);
			match(Identifier);
			setState(387);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(383);
					match(Comma);
					setState(384);
					match(Identifier);
					}
					} 
				}
				setState(389);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(390);
				match(CloseBrace);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class HooksDeclarationContext extends ParserRuleContext {
		public HooksDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooksDeclaration; }
	 
		public HooksDeclarationContext() { }
		public void copyFrom(HooksDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseEffectDeclContext extends HooksDeclarationContext {
		public TerminalNode Useeffect() { return getToken(ReactParser.Useeffect, 0); }
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HooksReturnContext hooksReturn() {
			return getRuleContext(HooksReturnContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public UseEffectDeclContext(HooksDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffectDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffectDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseRefDeclContext extends HooksDeclarationContext {
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode Useref() { return getToken(ReactParser.Useref, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public UseRefDeclContext(HooksDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRefDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRefDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRefDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UseStateDeclContext extends HooksDeclarationContext {
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode Comma() { return getToken(ReactParser.Comma, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode Usestate() { return getToken(ReactParser.Usestate, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public UseStateDeclContext(HooksDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseStateDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseStateDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseStateDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksDeclarationContext hooksDeclaration() throws RecognitionException {
		HooksDeclarationContext _localctx = new HooksDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_hooksDeclaration);
		int _la;
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				_localctx = new UseStateDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				match(Const);
				setState(394);
				match(OpenBracket);
				setState(395);
				match(Identifier);
				setState(396);
				match(Comma);
				setState(397);
				match(Identifier);
				setState(398);
				match(CloseBracket);
				setState(399);
				match(Assign);
				setState(400);
				match(Usestate);
				setState(401);
				match(OpenParen);
				setState(402);
				initial();
				setState(403);
				match(CloseParen);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(404);
					match(SemiColon);
					}
				}

				}
				break;
			case 2:
				_localctx = new UseRefDeclContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(Const);
				setState(408);
				match(OpenBracket);
				setState(409);
				match(Identifier);
				setState(410);
				match(CloseBracket);
				setState(411);
				match(Assign);
				setState(412);
				match(Useref);
				setState(413);
				match(OpenParen);
				setState(414);
				match(CloseParen);
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(415);
					match(SemiColon);
					}
				}

				}
				break;
			case 3:
				_localctx = new UseEffectDeclContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(418);
				match(Useeffect);
				setState(419);
				match(OpenParen);
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(420);
					expression(0);
					}
					break;
				}
				setState(423);
				match(OpenParen);
				setState(424);
				match(CloseParen);
				setState(425);
				match(ARROW);
				setState(426);
				match(OpenBrace);
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(427);
					hooksReturn();
					}
				}

				setState(430);
				match(CloseBrace);
				setState(431);
				match(Comma);
				setState(432);
				match(OpenBracket);
				setState(433);
				match(Identifier);
				setState(434);
				match(CloseBracket);
				setState(435);
				match(CloseParen);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SemiColon) {
					{
					setState(436);
					match(SemiColon);
					}
				}

				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class HooksReturnContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public HooksReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooksReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooksReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooksReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooksReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksReturnContext hooksReturn() throws RecognitionException {
		HooksReturnContext _localctx = new HooksReturnContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_hooksReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(Return);
			setState(442);
			match(OpenParen);
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(443);
				expression(0);
				}
				}
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(449);
			match(CloseParen);
			setState(450);
			match(ARROW);
			setState(451);
			match(OpenBrace);
			setState(452);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpDecrementIncrementContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Increment() { return getToken(ReactParser.Increment, 0); }
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public TerminalNode Decrement() { return getToken(ReactParser.Decrement, 0); }
		public ExpDecrementIncrementContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpDecrementIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpDecrementIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpDecrementIncrement(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpOperationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public TerminalNode Modulus() { return getToken(ReactParser.Modulus, 0); }
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode Assign_Plus() { return getToken(ReactParser.Assign_Plus, 0); }
		public TerminalNode Assign_Minus() { return getToken(ReactParser.Assign_Minus, 0); }
		public TerminalNode Assign_Multiply() { return getToken(ReactParser.Assign_Multiply, 0); }
		public TerminalNode Assign_Divide() { return getToken(ReactParser.Assign_Divide, 0); }
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode And() { return getToken(ReactParser.And, 0); }
		public TerminalNode Or() { return getToken(ReactParser.Or, 0); }
		public ExpOperationContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpOperation(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpFuncCallContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpFuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpInitialContext extends ExpressionContext {
		public InitialContext initial() {
			return getRuleContext(InitialContext.class,0);
		}
		public ExpInitialContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpInitial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpInitial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpInitial(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParamsContext extends ExpressionContext {
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ExpParamsContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpParams(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpVarDeclContext extends ExpressionContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpVarDeclContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpParensContext extends ExpressionContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public ExpParensContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpParens(this);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				_localctx = new ExpParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(455);
				match(OpenParen);
				setState(456);
				expression(0);
				setState(457);
				match(CloseParen);
				}
				break;
			case 2:
				{
				_localctx = new ExpFuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(459);
				functionCall();
				}
				break;
			case 3:
				{
				_localctx = new ExpInitialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(460);
				initial();
				}
				break;
			case 4:
				{
				_localctx = new ExpParamsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(461);
				parameters();
				}
				break;
			case 5:
				{
				_localctx = new ExpVarDeclContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(462);
				variableDeclaration();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
					case 1:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(465);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(466);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32214286848L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(468);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(469);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(470);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(471);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(472);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139452219392L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(473);
						expression(9);
						}
						break;
					case 4:
						{
						_localctx = new ExpOperationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(474);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(475);
						_la = _input.LA(1);
						if ( !(_la==And || _la==Or) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(476);
						expression(8);
						}
						break;
					case 5:
						{
						_localctx = new ExpDecrementIncrementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(477);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(478);
						match(Increment);
						setState(480);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
						case 1:
							{
							setState(479);
							match(SemiColon);
							}
							break;
						}
						}
						break;
					case 6:
						{
						_localctx = new ExpDecrementIncrementContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(482);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(483);
						match(Decrement);
						setState(485);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
						case 1:
							{
							setState(484);
							match(SemiColon);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(ReactParser.SemiColon, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(Identifier);
			setState(493);
			match(OpenParen);
			setState(494);
			expression(0);
			setState(495);
			match(CloseParen);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(496);
				match(SemiColon);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public List<TerminalNode> OpenBrace() { return getTokens(ReactParser.OpenBrace); }
		public TerminalNode OpenBrace(int i) {
			return getToken(ReactParser.OpenBrace, i);
		}
		public List<TerminalNode> CloseBrace() { return getTokens(ReactParser.CloseBrace); }
		public TerminalNode CloseBrace(int i) {
			return getToken(ReactParser.CloseBrace, i);
		}
		public List<TerminalNode> Elseif() { return getTokens(ReactParser.Elseif); }
		public TerminalNode Elseif(int i) {
			return getToken(ReactParser.Elseif, i);
		}
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(If);
			setState(500);
			match(OpenParen);
			setState(501);
			expression(0);
			setState(502);
			match(CloseParen);
			setState(503);
			match(OpenBrace);
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(504);
				expression(0);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(CloseBrace);
			setState(526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Elseif) {
				{
				{
				setState(511);
				match(Elseif);
				setState(512);
				match(OpenParen);
				setState(513);
				expression(0);
				setState(514);
				match(CloseParen);
				setState(515);
				match(OpenBrace);
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					{
					setState(516);
					expression(0);
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(522);
				match(CloseBrace);
				}
				}
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(529);
				match(Else);
				setState(530);
				match(OpenBrace);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					{
					setState(531);
					expression(0);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(537);
				match(CloseBrace);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			match(While);
			setState(541);
			match(OpenParen);
			setState(542);
			expression(0);
			setState(543);
			match(CloseParen);
			setState(544);
			match(OpenBrace);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(545);
				expression(0);
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			match(Do);
			setState(554);
			match(OpenBrace);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(555);
				expression(0);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			match(CloseBrace);
			setState(562);
			match(While);
			setState(563);
			match(OpenParen);
			setState(564);
			expression(0);
			setState(565);
			match(CloseParen);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(ReactParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ReactParser.Identifier, i);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_forStatement);
		int _la;
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(567);
				match(For);
				setState(568);
				match(OpenParen);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					setState(569);
					expression(0);
					}
				}

				setState(572);
				match(SemiColon);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					setState(573);
					expression(0);
					}
				}

				setState(576);
				match(SemiColon);
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					setState(577);
					expression(0);
					}
				}

				setState(580);
				match(CloseParen);
				setState(581);
				match(OpenBrace);
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
					{
					{
					setState(582);
					expression(0);
					}
					}
					setState(587);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(588);
				match(CloseBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(589);
				match(For);
				setState(590);
				match(OpenParen);
				setState(591);
				type();
				setState(592);
				match(Identifier);
				setState(593);
				match(Colon);
				setState(594);
				match(Identifier);
				setState(595);
				match(CloseParen);
				setState(596);
				match(OpenBrace);
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 441352763482308608L) != 0)) {
					{
					{
					setState(597);
					statement();
					}
					}
					setState(602);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(603);
				match(CloseBrace);
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public SwitchBlockContext switchBlock() {
			return getRuleContext(SwitchBlockContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(Switch);
			setState(608);
			match(OpenParen);
			setState(609);
			expression(0);
			setState(610);
			match(CloseParen);
			setState(611);
			match(OpenBrace);
			setState(612);
			switchBlock();
			setState(613);
			match(CloseBrace);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchBlockContext extends ParserRuleContext {
		public List<CaseBlockContext> caseBlock() {
			return getRuleContexts(CaseBlockContext.class);
		}
		public CaseBlockContext caseBlock(int i) {
			return getRuleContext(CaseBlockContext.class,i);
		}
		public List<DefaultBlockContext> defaultBlock() {
			return getRuleContexts(DefaultBlockContext.class);
		}
		public DefaultBlockContext defaultBlock(int i) {
			return getRuleContext(DefaultBlockContext.class,i);
		}
		public SwitchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockContext switchBlock() throws RecognitionException {
		SwitchBlockContext _localctx = new SwitchBlockContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_switchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(617);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Case:
					{
					setState(615);
					caseBlock();
					}
					break;
				case Default:
					{
					setState(616);
					defaultBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(619); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case || _la==Default );
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

	@SuppressWarnings("CheckReturnValue")
	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(ReactParser.Case, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCaseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCaseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCaseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(Case);
			setState(622);
			expression(0);
			setState(623);
			match(Colon);
			setState(627);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(624);
				expression(0);
				}
				}
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultBlockContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DefaultBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefaultBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefaultBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefaultBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultBlockContext defaultBlock() throws RecognitionException {
		DefaultBlockContext _localctx = new DefaultBlockContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defaultBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(Default);
			setState(631);
			match(Colon);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898408L) != 0) || ((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & 119L) != 0)) {
				{
				{
				setState(632);
				expression(0);
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class InitialContext extends ParserRuleContext {
		public InitialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial; }
	 
		public InitialContext() { }
		public void copyFrom(InitialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolValueContext extends InitialContext {
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public BoolValueContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatValueContext extends InitialContext {
		public TerminalNode FloatLiteral() { return getToken(ReactParser.FloatLiteral, 0); }
		public FloatValueContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFloatValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFloatValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFloatValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringValueContext extends InitialContext {
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public StringValueContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStringValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStringValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStringValue(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntValueContext extends InitialContext {
		public TerminalNode IntLiteral() { return getToken(ReactParser.IntLiteral, 0); }
		public IntValueContext(InitialContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIntValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIntValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIntValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitialContext initial() throws RecognitionException {
		InitialContext _localctx = new InitialContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_initial);
		try {
			setState(646);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NullLiteral:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(NullLiteral);
				}
				break;
			case BooleanLiteral:
				_localctx = new BoolValueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(641);
				match(BooleanLiteral);
				}
				break;
			case Identifier:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(642);
				match(Identifier);
				}
				break;
			case IntLiteral:
				_localctx = new IntValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(643);
				match(IntLiteral);
				}
				break;
			case FloatLiteral:
				_localctx = new FloatValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(644);
				match(FloatLiteral);
				}
				break;
			case StringLiteral:
				_localctx = new StringValueContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(645);
				match(StringLiteral);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ReactParser.StringLiteral, 0); }
		public TerminalNode CharLiteral() { return getToken(ReactParser.CharLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ReactParser.Identifier, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			_la = _input.LA(1);
			if ( !(((((_la - 79)) & ~0x3f) == 0 && ((1L << (_la - 79)) & 19L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001V\u028b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0004"+
		"\u0000F\b\u0000\u000b\u0000\f\u0000G\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002T\b\u0002\n\u0002\f\u0002W\t\u0002\u0001\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003^\b\u0003\u0001"+
		"\u0003\u0003\u0003a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003g\b\u0003\n\u0003\f\u0003j\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003q\b\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0003\u0005w\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0082\b\u0005\n\u0005\f\u0005"+
		"\u0085\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006\u0093\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0004\u0007\u0098\b\u0007\u000b\u0007\f\u0007\u0099\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u009e\b\u0007\u0001\b\u0001\b\u0003\b\u00a2\b\b\u0001"+
		"\b\u0005\b\u00a5\b\b\n\b\f\b\u00a8\t\b\u0001\b\u0001\b\u0005\b\u00ac\b"+
		"\b\n\b\f\b\u00af\t\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b4\b\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00b9\b\b\u0001\b\u0005\b\u00bc\b\b\n\b\f\b\u00bf"+
		"\t\b\u0001\b\u0003\b\u00c2\b\b\u0001\b\u0003\b\u00c5\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0003\n\u00cc\b\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u00d1\b\n\n\n\f\n\u00d4\t\n\u0001\n\u0001\n\u0005\n\u00d8\b\n\n\n\f"+
		"\n\u00db\t\n\u0001\n\u0003\n\u00de\b\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e6\b\u000b\n\u000b"+
		"\f\u000b\u00e9\t\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00ed\b\u000b"+
		"\n\u000b\f\u000b\u00f0\t\u000b\u0001\u000b\u0003\u000b\u00f3\b\u000b\u0001"+
		"\u000b\u0003\u000b\u00f6\b\u000b\u0001\u000b\u0003\u000b\u00f9\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00fd\b\u000b\u0001\u000b\u0003\u000b"+
		"\u0100\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0105\b"+
		"\u000b\n\u000b\f\u000b\u0108\t\u000b\u0001\u000b\u0003\u000b\u010b\b\u000b"+
		"\u0001\u000b\u0003\u000b\u010e\b\u000b\u0001\u000b\u0004\u000b\u0111\b"+
		"\u000b\u000b\u000b\f\u000b\u0112\u0001\u000b\u0003\u000b\u0116\b\u000b"+
		"\u0001\u000b\u0003\u000b\u0119\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u011e\b\u000b\u0001\u000b\u0004\u000b\u0121\b\u000b\u000b"+
		"\u000b\f\u000b\u0122\u0001\u000b\u0003\u000b\u0126\b\u000b\u0001\u000b"+
		"\u0003\u000b\u0129\b\u000b\u0003\u000b\u012b\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0003\f\u0131\b\f\u0001\f\u0003\f\u0134\b\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u013d\b\r\n\r\f\r\u0140"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0149\b\u000e\n\u000e\f\u000e\u014c\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0150\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0003\u0010\u0157\b\u0010\u0001\u0010\u0003\u0010"+
		"\u015a\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015e\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0162\b\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0166\b\u0010\n\u0010\f\u0010\u0169\t\u0010\u0001\u0010\u0003\u0010"+
		"\u016c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u0173\b\u0011\n\u0011\f\u0011\u0176\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u017a\b\u0011\u0001\u0012\u0003\u0012\u017d\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0182\b\u0012\n\u0012"+
		"\f\u0012\u0185\t\u0012\u0001\u0012\u0003\u0012\u0188\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u0196\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a1\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01a6\b\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01ad\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u01b6\b\u0013\u0003\u0013\u01b8\b\u0013\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01bd\b\u0014\n\u0014\f\u0014"+
		"\u01c0\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01d0\b\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01e1\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u01e6\b\u0015\u0005\u0015\u01e8\b\u0015\n\u0015"+
		"\f\u0015\u01eb\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u01f2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u01fa\b\u0017\n\u0017"+
		"\f\u0017\u01fd\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u0206\b\u0017\n\u0017"+
		"\f\u0017\u0209\t\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u020d\b\u0017"+
		"\n\u0017\f\u0017\u0210\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0215\b\u0017\n\u0017\f\u0017\u0218\t\u0017\u0001\u0017\u0003\u0017"+
		"\u021b\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0005\u0018\u0223\b\u0018\n\u0018\f\u0018\u0226\t\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u022d"+
		"\b\u0019\n\u0019\f\u0019\u0230\t\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u023b\b\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u023f\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0243\b\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u0248\b\u001a\n\u001a\f\u001a\u024b\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0257\b\u001a"+
		"\n\u001a\f\u001a\u025a\t\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u025e"+
		"\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0004\u001c\u026a"+
		"\b\u001c\u000b\u001c\f\u001c\u026b\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u0272\b\u001d\n\u001d\f\u001d\u0275\t\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u027a\b\u001e\n\u001e\f\u001e"+
		"\u027d\t\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0003 \u0287\b \u0001!\u0001!\u0001!\u0000\u0001*\"\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@B\u0000\t\u0002\u0000IKSS\u0002\u0000?HSS\u0001\u0000"+
		"\f\r\u0003\u0000\t\t\u0010\u0014\u001f\"\u0001\u0000\u0017\u001a\u0002"+
		"\u0000\u001b\u001e%%\u0001\u0000#$\u0001\u000024\u0002\u0000OPSS\u02db"+
		"\u0000E\u0001\u0000\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004O"+
		"\u0001\u0000\u0000\u0000\u0006p\u0001\u0000\u0000\u0000\br\u0001\u0000"+
		"\u0000\u0000\nv\u0001\u0000\u0000\u0000\f\u0092\u0001\u0000\u0000\u0000"+
		"\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00c4\u0001\u0000\u0000\u0000"+
		"\u0012\u00c6\u0001\u0000\u0000\u0000\u0014\u00c8\u0001\u0000\u0000\u0000"+
		"\u0016\u012a\u0001\u0000\u0000\u0000\u0018\u012c\u0001\u0000\u0000\u0000"+
		"\u001a\u0135\u0001\u0000\u0000\u0000\u001c\u0144\u0001\u0000\u0000\u0000"+
		"\u001e\u0151\u0001\u0000\u0000\u0000 \u0156\u0001\u0000\u0000\u0000\""+
		"\u016f\u0001\u0000\u0000\u0000$\u017c\u0001\u0000\u0000\u0000&\u01b7\u0001"+
		"\u0000\u0000\u0000(\u01b9\u0001\u0000\u0000\u0000*\u01cf\u0001\u0000\u0000"+
		"\u0000,\u01ec\u0001\u0000\u0000\u0000.\u01f3\u0001\u0000\u0000\u00000"+
		"\u021c\u0001\u0000\u0000\u00002\u0229\u0001\u0000\u0000\u00004\u025d\u0001"+
		"\u0000\u0000\u00006\u025f\u0001\u0000\u0000\u00008\u0269\u0001\u0000\u0000"+
		"\u0000:\u026d\u0001\u0000\u0000\u0000<\u0276\u0001\u0000\u0000\u0000>"+
		"\u027e\u0001\u0000\u0000\u0000@\u0286\u0001\u0000\u0000\u0000B\u0288\u0001"+
		"\u0000\u0000\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000"+
		"FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\u0000\u0000\u0001J\u0001\u0001"+
		"\u0000\u0000\u0000KN\u0003\u0004\u0002\u0000LN\u0003\n\u0005\u0000MK\u0001"+
		"\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0003\u0001\u0000\u0000"+
		"\u0000OP\u00059\u0000\u0000PU\u0003\u0006\u0003\u0000QR\u0005\b\u0000"+
		"\u0000RT\u0003\u0006\u0003\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XZ\u0005\u0007\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000"+
		"\u0000\u0000[]\u0005S\u0000\u0000\\^\u0005;\u0000\u0000]\\\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_a\u0003"+
		"B!\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000aq\u0001\u0000"+
		"\u0000\u0000bc\u0005\u0005\u0000\u0000ch\u0003\b\u0004\u0000de\u0005\b"+
		"\u0000\u0000eg\u0003\b\u0004\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001"+
		"\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kl\u0005\u0006\u0000\u0000"+
		"lm\u0005;\u0000\u0000mn\u0003B!\u0000nq\u0001\u0000\u0000\u0000oq\u0003"+
		"B!\u0000p[\u0001\u0000\u0000\u0000pb\u0001\u0000\u0000\u0000po\u0001\u0000"+
		"\u0000\u0000q\u0007\u0001\u0000\u0000\u0000rs\u0007\u0000\u0000\u0000"+
		"s\t\u0001\u0000\u0000\u0000tu\u0005:\u0000\u0000uw\u00057\u0000\u0000"+
		"vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xy\u00055\u0000\u0000yz\u0005S\u0000\u0000z|\u0005\u0003\u0000\u0000"+
		"{}\u0003$\u0012\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}~\u0001\u0000\u0000\u0000~\u007f\u0005\u0004\u0000\u0000\u007f\u0083"+
		"\u0005\u0005\u0000\u0000\u0080\u0082\u0003\f\u0006\u0000\u0081\u0080\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0086\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0003"+
		"\u000e\u0007\u0000\u0087\u0088\u0005\u0006\u0000\u0000\u0088\u000b\u0001"+
		"\u0000\u0000\u0000\u0089\u0093\u0003\u0018\f\u0000\u008a\u0093\u0003\u001a"+
		"\r\u0000\u008b\u0093\u0003 \u0010\u0000\u008c\u0093\u0003&\u0013\u0000"+
		"\u008d\u0093\u0003.\u0017\u0000\u008e\u0093\u00030\u0018\u0000\u008f\u0093"+
		"\u00032\u0019\u0000\u0090\u0093\u00034\u001a\u0000\u0091\u0093\u00036"+
		"\u001b\u0000\u0092\u0089\u0001\u0000\u0000\u0000\u0092\u008a\u0001\u0000"+
		"\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0092\u008c\u0001\u0000"+
		"\u0000\u0000\u0092\u008d\u0001\u0000\u0000\u0000\u0092\u008e\u0001\u0000"+
		"\u0000\u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\r\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005,\u0000\u0000\u0095\u0097\u0005\u0003\u0000\u0000"+
		"\u0096\u0098\u0003\u0010\b\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b"+
		"\u009d\u0005\u0004\u0000\u0000\u009c\u009e\u0005\u0007\u0000\u0000\u009d"+
		"\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u000f\u0001\u0000\u0000\u0000\u009f\u00a1\u0005\u001b\u0000\u0000\u00a0"+
		"\u00a2\u0003\u0012\t\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a6\u0001\u0000\u0000\u0000\u00a3\u00a5"+
		"\u0003\u0014\n\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001"+
		"\u0000\u0000\u0000\u00a9\u00ad\u0005\u001c\u0000\u0000\u00aa\u00ac\u0003"+
		"\u0016\u000b\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00af\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001"+
		"\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0005\u001b\u0000\u0000\u00b1\u00b3\u0005"+
		"\u0013\u0000\u0000\u00b2\u00b4\u0003\u0012\t\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00c5\u0005\u001c\u0000\u0000\u00b6\u00b8\u0005\u001b"+
		"\u0000\u0000\u00b7\u00b9\u0003\u0012\t\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bd\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0003\u0014\n\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00c1\u0001\u0000\u0000\u0000"+
		"\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0\u00c2\u0005\u0013\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005\u001c\u0000\u0000"+
		"\u00c4\u009f\u0001\u0000\u0000\u0000\u00c4\u00b6\u0001\u0000\u0000\u0000"+
		"\u00c5\u0011\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0001\u0000\u0000"+
		"\u00c7\u0013\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005S\u0000\u0000\u00c9"+
		"\u00cb\u0005\t\u0000\u0000\u00ca\u00cc\u0005\u0005\u0000\u0000\u00cb\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00d9"+
		"\u0001\u0000\u0000\u0000\u00cd\u00d2\u0005S\u0000\u0000\u00ce\u00cf\u0005"+
		"\r\u0000\u0000\u00cf\u00d1\u0005S\u0000\u0000\u00d0\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d8\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d8\u0003B!\u0000"+
		"\u00d6\u00d8\u0003 \u0010\u0000\u00d7\u00cd\u0001\u0000\u0000\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u0005\u0006\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de"+
		"\u0015\u0001\u0000\u0000\u0000\u00df\u00e0\u0005\u0005\u0000\u0000\u00e0"+
		"\u00e1\u0005S\u0000\u0000\u00e1\u00e2\u0005\r\u0000\u0000\u00e2\u00e3"+
		"\u0005<\u0000\u0000\u00e3\u00e7\u0005\u0003\u0000\u0000\u00e4\u00e6\u0003"+
		"*\u0015\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ea\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ea\u00ee\u0005%\u0000\u0000\u00eb\u00ed\u0005\u0003\u0000"+
		"\u0000\u00ec\u00eb\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f2\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f3\u0003\u0010\b\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f6\u0005\u0004\u0000\u0000\u00f5\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f9\u0005\u0004\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fa\u012b\u0005\u0006\u0000\u0000\u00fb\u00fd\u0007\u0002\u0000\u0000"+
		"\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u0100\u0005\u0005\u0000\u0000"+
		"\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0106\u0005S\u0000\u0000\u0102"+
		"\u0103\u0005\r\u0000\u0000\u0103\u0105\u0005S\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u010a"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010b"+
		"\u0005\u0006\u0000\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u012b\u0001\u0000\u0000\u0000\u010c\u010e"+
		"\u0005\u0005\u0000\u0000\u010d\u010c\u0001\u0000\u0000\u0000\u010d\u010e"+
		"\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0111"+
		"\u0003\u0010\b\u0000\u0110\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001"+
		"\u0000\u0000\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0116\u0005"+
		"\u0006\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001"+
		"\u0000\u0000\u0000\u0116\u012b\u0001\u0000\u0000\u0000\u0117\u0119\u0005"+
		"\u0005\u0000\u0000\u0118\u0117\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"S\u0000\u0000\u011b\u011d\u0005#\u0000\u0000\u011c\u011e\u0005\u0003\u0000"+
		"\u0000\u011d\u011c\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000"+
		"\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u0121\u0003\u0010\b\u0000"+
		"\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122\u0001\u0000\u0000\u0000"+
		"\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000\u0000"+
		"\u0123\u0125\u0001\u0000\u0000\u0000\u0124\u0126\u0005\u0004\u0000\u0000"+
		"\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000"+
		"\u0126\u0128\u0001\u0000\u0000\u0000\u0127\u0129\u0005\u0006\u0000\u0000"+
		"\u0128\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000"+
		"\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u00df\u0001\u0000\u0000\u0000"+
		"\u012a\u00fc\u0001\u0000\u0000\u0000\u012a\u010d\u0001\u0000\u0000\u0000"+
		"\u012a\u0118\u0001\u0000\u0000\u0000\u012b\u0017\u0001\u0000\u0000\u0000"+
		"\u012c\u012d\u0003>\u001f\u0000\u012d\u0130\u0005S\u0000\u0000\u012e\u012f"+
		"\u0005\t\u0000\u0000\u012f\u0131\u0003*\u0015\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131\u0133\u0001"+
		"\u0000\u0000\u0000\u0132\u0134\u0005\u0007\u0000\u0000\u0133\u0132\u0001"+
		"\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0019\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0003>\u001f\u0000\u0136\u0137\u0005S\u0000"+
		"\u0000\u0137\u0138\u0005\t\u0000\u0000\u0138\u0139\u0005\u0001\u0000\u0000"+
		"\u0139\u013e\u0003\u001c\u000e\u0000\u013a\u013b\u0005\b\u0000\u0000\u013b"+
		"\u013d\u0003\u001c\u000e\u0000\u013c\u013a\u0001\u0000\u0000\u0000\u013d"+
		"\u0140\u0001\u0000\u0000\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013e"+
		"\u013f\u0001\u0000\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140"+
		"\u013e\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0002\u0000\u0000\u0142"+
		"\u0143\u0005\u0007\u0000\u0000\u0143\u001b\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\u0005\u0000\u0000\u0145\u014a\u0003\u001e\u000f\u0000\u0146"+
		"\u0147\u0005\b\u0000\u0000\u0147\u0149\u0003\u001e\u000f\u0000\u0148\u0146"+
		"\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000\u014a\u0148"+
		"\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000\u0000\u014b\u014d"+
		"\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000\u014d\u014f"+
		"\u0005\u0006\u0000\u0000\u014e\u0150\u0005\b\u0000\u0000\u014f\u014e\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u001d\u0001"+
		"\u0000\u0000\u0000\u0151\u0152\u0005S\u0000\u0000\u0152\u0153\u0005\f"+
		"\u0000\u0000\u0153\u0154\u0003B!\u0000\u0154\u001f\u0001\u0000\u0000\u0000"+
		"\u0155\u0157\u00055\u0000\u0000\u0156\u0155\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0001\u0000\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158"+
		"\u015a\u0005S\u0000\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u0159\u015a"+
		"\u0001\u0000\u0000\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u015d"+
		"\u0005\u0003\u0000\u0000\u015c\u015e\u0003$\u0012\u0000\u015d\u015c\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\u0001\u0000\u0000\u0000\u015e\u015f\u0001"+
		"\u0000\u0000\u0000\u015f\u0161\u0005\u0004\u0000\u0000\u0160\u0162\u0005"+
		"%\u0000\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000"+
		"\u0000\u0000\u0162\u0163\u0001\u0000\u0000\u0000\u0163\u0167\u0005\u0005"+
		"\u0000\u0000\u0164\u0166\u0003*\u0015\u0000\u0165\u0164\u0001\u0000\u0000"+
		"\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016c\u0003\"\u0011\u0000"+
		"\u016b\u016a\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016e\u0005\u0006\u0000\u0000"+
		"\u016e!\u0001\u0000\u0000\u0000\u016f\u0170\u0005,\u0000\u0000\u0170\u0174"+
		"\u0005\u0003\u0000\u0000\u0171\u0173\u0003*\u0015\u0000\u0172\u0171\u0001"+
		"\u0000\u0000\u0000\u0173\u0176\u0001\u0000\u0000\u0000\u0174\u0172\u0001"+
		"\u0000\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0177\u0001"+
		"\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0177\u0179\u0005"+
		"\u0004\u0000\u0000\u0178\u017a\u0005\u0007\u0000\u0000\u0179\u0178\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a#\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u0005\u0005\u0000\u0000\u017c\u017b\u0001\u0000"+
		"\u0000\u0000\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000"+
		"\u0000\u0000\u017e\u0183\u0005S\u0000\u0000\u017f\u0180\u0005\b\u0000"+
		"\u0000\u0180\u0182\u0005S\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0182\u0185\u0001\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0183\u0184\u0001\u0000\u0000\u0000\u0184\u0187\u0001\u0000\u0000\u0000"+
		"\u0185\u0183\u0001\u0000\u0000\u0000\u0186\u0188\u0005\u0006\u0000\u0000"+
		"\u0187\u0186\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000"+
		"\u0188%\u0001\u0000\u0000\u0000\u0189\u018a\u00054\u0000\u0000\u018a\u018b"+
		"\u0005\u0001\u0000\u0000\u018b\u018c\u0005S\u0000\u0000\u018c\u018d\u0005"+
		"\b\u0000\u0000\u018d\u018e\u0005S\u0000\u0000\u018e\u018f\u0005\u0002"+
		"\u0000\u0000\u018f\u0190\u0005\t\u0000\u0000\u0190\u0191\u0005I\u0000"+
		"\u0000\u0191\u0192\u0005\u0003\u0000\u0000\u0192\u0193\u0003@ \u0000\u0193"+
		"\u0195\u0005\u0004\u0000\u0000\u0194\u0196\u0005\u0007\u0000\u0000\u0195"+
		"\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u01b8\u0001\u0000\u0000\u0000\u0197\u0198\u00054\u0000\u0000\u0198\u0199"+
		"\u0005\u0001\u0000\u0000\u0199\u019a\u0005S\u0000\u0000\u019a\u019b\u0005"+
		"\u0002\u0000\u0000\u019b\u019c\u0005\t\u0000\u0000\u019c\u019d\u0005K"+
		"\u0000\u0000\u019d\u019e\u0005\u0003\u0000\u0000\u019e\u01a0\u0005\u0004"+
		"\u0000\u0000\u019f\u01a1\u0005\u0007\u0000\u0000\u01a0\u019f\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1\u01b8\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a3\u0005J\u0000\u0000\u01a3\u01a5\u0005\u0003\u0000"+
		"\u0000\u01a4\u01a6\u0003*\u0015\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a7\u01a8\u0005\u0003\u0000\u0000\u01a8\u01a9\u0005\u0004\u0000\u0000"+
		"\u01a9\u01aa\u0005%\u0000\u0000\u01aa\u01ac\u0005\u0005\u0000\u0000\u01ab"+
		"\u01ad\u0003(\u0014\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad"+
		"\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af"+
		"\u0005\u0006\u0000\u0000\u01af\u01b0\u0005\b\u0000\u0000\u01b0\u01b1\u0005"+
		"\u0001\u0000\u0000\u01b1\u01b2\u0005S\u0000\u0000\u01b2\u01b3\u0005\u0002"+
		"\u0000\u0000\u01b3\u01b5\u0005\u0004\u0000\u0000\u01b4\u01b6\u0005\u0007"+
		"\u0000\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u0189\u0001\u0000"+
		"\u0000\u0000\u01b7\u0197\u0001\u0000\u0000\u0000\u01b7\u01a2\u0001\u0000"+
		"\u0000\u0000\u01b8\'\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005,\u0000"+
		"\u0000\u01ba\u01be\u0005\u0003\u0000\u0000\u01bb\u01bd\u0003*\u0015\u0000"+
		"\u01bc\u01bb\u0001\u0000\u0000\u0000\u01bd\u01c0\u0001\u0000\u0000\u0000"+
		"\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\u0005\u0004\u0000\u0000\u01c2\u01c3\u0005%\u0000\u0000\u01c3"+
		"\u01c4\u0005\u0005\u0000\u0000\u01c4\u01c5\u0005\u0006\u0000\u0000\u01c5"+
		")\u0001\u0000\u0000\u0000\u01c6\u01c7\u0006\u0015\uffff\uffff\u0000\u01c7"+
		"\u01c8\u0005\u0003\u0000\u0000\u01c8\u01c9\u0003*\u0015\u0000\u01c9\u01ca"+
		"\u0005\u0004\u0000\u0000\u01ca\u01d0\u0001\u0000\u0000\u0000\u01cb\u01d0"+
		"\u0003,\u0016\u0000\u01cc\u01d0\u0003@ \u0000\u01cd\u01d0\u0003$\u0012"+
		"\u0000\u01ce\u01d0\u0003\u0018\f\u0000\u01cf\u01c6\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cb\u0001\u0000\u0000\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000"+
		"\u01cf\u01cd\u0001\u0000\u0000\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000"+
		"\u01d0\u01e9\u0001\u0000\u0000\u0000\u01d1\u01d2\n\n\u0000\u0000\u01d2"+
		"\u01d3\u0007\u0003\u0000\u0000\u01d3\u01e8\u0003*\u0015\u000b\u01d4\u01d5"+
		"\n\t\u0000\u0000\u01d5\u01d6\u0007\u0004\u0000\u0000\u01d6\u01e8\u0003"+
		"*\u0015\n\u01d7\u01d8\n\b\u0000\u0000\u01d8\u01d9\u0007\u0005\u0000\u0000"+
		"\u01d9\u01e8\u0003*\u0015\t\u01da\u01db\n\u0007\u0000\u0000\u01db\u01dc"+
		"\u0007\u0006\u0000\u0000\u01dc\u01e8\u0003*\u0015\b\u01dd\u01de\n\u0006"+
		"\u0000\u0000\u01de\u01e0\u0005\u0015\u0000\u0000\u01df\u01e1\u0005\u0007"+
		"\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e8\u0001\u0000\u0000\u0000\u01e2\u01e3\n\u0005\u0000"+
		"\u0000\u01e3\u01e5\u0005\u0016\u0000\u0000\u01e4\u01e6\u0005\u0007\u0000"+
		"\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01d1\u0001\u0000\u0000"+
		"\u0000\u01e7\u01d4\u0001\u0000\u0000\u0000\u01e7\u01d7\u0001\u0000\u0000"+
		"\u0000\u01e7\u01da\u0001\u0000\u0000\u0000\u01e7\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e7\u01e2\u0001\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000"+
		"\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000"+
		"\u0000\u01ea+\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000"+
		"\u01ec\u01ed\u0005S\u0000\u0000\u01ed\u01ee\u0005\u0003\u0000\u0000\u01ee"+
		"\u01ef\u0003*\u0015\u0000\u01ef\u01f1\u0005\u0004\u0000\u0000\u01f0\u01f2"+
		"\u0005\u0007\u0000\u0000\u01f1\u01f0\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0001\u0000\u0000\u0000\u01f2-\u0001\u0000\u0000\u0000\u01f3\u01f4\u0005"+
		"(\u0000\u0000\u01f4\u01f5\u0005\u0003\u0000\u0000\u01f5\u01f6\u0003*\u0015"+
		"\u0000\u01f6\u01f7\u0005\u0004\u0000\u0000\u01f7\u01fb\u0005\u0005\u0000"+
		"\u0000\u01f8\u01fa\u0003*\u0015\u0000\u01f9\u01f8\u0001\u0000\u0000\u0000"+
		"\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000\u0000"+
		"\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u020e\u0005\u0006\u0000\u0000"+
		"\u01ff\u0200\u0005)\u0000\u0000\u0200\u0201\u0005\u0003\u0000\u0000\u0201"+
		"\u0202\u0003*\u0015\u0000\u0202\u0203\u0005\u0004\u0000\u0000\u0203\u0207"+
		"\u0005\u0005\u0000\u0000\u0204\u0206\u0003*\u0015\u0000\u0205\u0204\u0001"+
		"\u0000\u0000\u0000\u0206\u0209\u0001\u0000\u0000\u0000\u0207\u0205\u0001"+
		"\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u020a\u0001"+
		"\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u020a\u020b\u0005"+
		"\u0006\u0000\u0000\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u01ff\u0001"+
		"\u0000\u0000\u0000\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001"+
		"\u0000\u0000\u0000\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u021a\u0001"+
		"\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u0005"+
		"*\u0000\u0000\u0212\u0216\u0005\u0005\u0000\u0000\u0213\u0215\u0003*\u0015"+
		"\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0215\u0218\u0001\u0000\u0000"+
		"\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000"+
		"\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0216\u0001\u0000\u0000"+
		"\u0000\u0219\u021b\u0005\u0006\u0000\u0000\u021a\u0211\u0001\u0000\u0000"+
		"\u0000\u021a\u021b\u0001\u0000\u0000\u0000\u021b/\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0005\'\u0000\u0000\u021d\u021e\u0005\u0003\u0000\u0000\u021e"+
		"\u021f\u0003*\u0015\u0000\u021f\u0220\u0005\u0004\u0000\u0000\u0220\u0224"+
		"\u0005\u0005\u0000\u0000\u0221\u0223\u0003*\u0015\u0000\u0222\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u0227\u0001"+
		"\u0000\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0228\u0005"+
		"\u0006\u0000\u0000\u02281\u0001\u0000\u0000\u0000\u0229\u022a\u0005&\u0000"+
		"\u0000\u022a\u022e\u0005\u0005\u0000\u0000\u022b\u022d\u0003*\u0015\u0000"+
		"\u022c\u022b\u0001\u0000\u0000\u0000\u022d\u0230\u0001\u0000\u0000\u0000"+
		"\u022e\u022c\u0001\u0000\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000"+
		"\u022f\u0231\u0001\u0000\u0000\u0000\u0230\u022e\u0001\u0000\u0000\u0000"+
		"\u0231\u0232\u0005\u0006\u0000\u0000\u0232\u0233\u0005\'\u0000\u0000\u0233"+
		"\u0234\u0005\u0003\u0000\u0000\u0234\u0235\u0003*\u0015\u0000\u0235\u0236"+
		"\u0005\u0004\u0000\u0000\u02363\u0001\u0000\u0000\u0000\u0237\u0238\u0005"+
		"-\u0000\u0000\u0238\u023a\u0005\u0003\u0000\u0000\u0239\u023b\u0003*\u0015"+
		"\u0000\u023a\u0239\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0005\u0007\u0000"+
		"\u0000\u023d\u023f\u0003*\u0015\u0000\u023e\u023d\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0242\u0005\u0007\u0000\u0000\u0241\u0243\u0003*\u0015\u0000\u0242"+
		"\u0241\u0001\u0000\u0000\u0000\u0242\u0243\u0001\u0000\u0000\u0000\u0243"+
		"\u0244\u0001\u0000\u0000\u0000\u0244\u0245\u0005\u0004\u0000\u0000\u0245"+
		"\u0249\u0005\u0005\u0000\u0000\u0246\u0248\u0003*\u0015\u0000\u0247\u0246"+
		"\u0001\u0000\u0000\u0000\u0248\u024b\u0001\u0000\u0000\u0000\u0249\u0247"+
		"\u0001\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024c"+
		"\u0001\u0000\u0000\u0000\u024b\u0249\u0001\u0000\u0000\u0000\u024c\u025e"+
		"\u0005\u0006\u0000\u0000\u024d\u024e\u0005-\u0000\u0000\u024e\u024f\u0005"+
		"\u0003\u0000\u0000\u024f\u0250\u0003>\u001f\u0000\u0250\u0251\u0005S\u0000"+
		"\u0000\u0251\u0252\u0005\f\u0000\u0000\u0252\u0253\u0005S\u0000\u0000"+
		"\u0253\u0254\u0005\u0004\u0000\u0000\u0254\u0258\u0005\u0005\u0000\u0000"+
		"\u0255\u0257\u0003\u0002\u0001\u0000\u0256\u0255\u0001\u0000\u0000\u0000"+
		"\u0257\u025a\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000\u0000"+
		"\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025b\u0001\u0000\u0000\u0000"+
		"\u025a\u0258\u0001\u0000\u0000\u0000\u025b\u025c\u0005\u0006\u0000\u0000"+
		"\u025c\u025e\u0001\u0000\u0000\u0000\u025d\u0237\u0001\u0000\u0000\u0000"+
		"\u025d\u024d\u0001\u0000\u0000\u0000\u025e5\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0005.\u0000\u0000\u0260\u0261\u0005\u0003\u0000\u0000\u0261\u0262"+
		"\u0003*\u0015\u0000\u0262\u0263\u0005\u0004\u0000\u0000\u0263\u0264\u0005"+
		"\u0005\u0000\u0000\u0264\u0265\u00038\u001c\u0000\u0265\u0266\u0005\u0006"+
		"\u0000\u0000\u02667\u0001\u0000\u0000\u0000\u0267\u026a\u0003:\u001d\u0000"+
		"\u0268\u026a\u0003<\u001e\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269"+
		"\u0268\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b"+
		"\u0269\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c"+
		"9\u0001\u0000\u0000\u0000\u026d\u026e\u0005/\u0000\u0000\u026e\u026f\u0003"+
		"*\u0015\u0000\u026f\u0273\u0005\f\u0000\u0000\u0270\u0272\u0003*\u0015"+
		"\u0000\u0271\u0270\u0001\u0000\u0000\u0000\u0272\u0275\u0001\u0000\u0000"+
		"\u0000\u0273\u0271\u0001\u0000\u0000\u0000\u0273\u0274\u0001\u0000\u0000"+
		"\u0000\u0274;\u0001\u0000\u0000\u0000\u0275\u0273\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u00057\u0000\u0000\u0277\u027b\u0005\f\u0000\u0000\u0278"+
		"\u027a\u0003*\u0015\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a\u027d"+
		"\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0001\u0000\u0000\u0000\u027c=\u0001\u0000\u0000\u0000\u027d\u027b\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0007\u0007\u0000\u0000\u027f?\u0001\u0000"+
		"\u0000\u0000\u0280\u0287\u0005M\u0000\u0000\u0281\u0287\u0005N\u0000\u0000"+
		"\u0282\u0287\u0005S\u0000\u0000\u0283\u0287\u0005Q\u0000\u0000\u0284\u0287"+
		"\u0005R\u0000\u0000\u0285\u0287\u0005O\u0000\u0000\u0286\u0280\u0001\u0000"+
		"\u0000\u0000\u0286\u0281\u0001\u0000\u0000\u0000\u0286\u0282\u0001\u0000"+
		"\u0000\u0000\u0286\u0283\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000"+
		"\u0000\u0000\u0286\u0285\u0001\u0000\u0000\u0000\u0287A\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0007\b\u0000\u0000\u0289C\u0001\u0000\u0000\u0000"+
		"\\GMUY]`hpv|\u0083\u0092\u0099\u009d\u00a1\u00a6\u00ad\u00b3\u00b8\u00bd"+
		"\u00c1\u00c4\u00cb\u00d2\u00d7\u00d9\u00dd\u00e7\u00ee\u00f2\u00f5\u00f8"+
		"\u00fc\u00ff\u0106\u010a\u010d\u0112\u0115\u0118\u011d\u0122\u0125\u0128"+
		"\u012a\u0130\u0133\u013e\u014a\u014f\u0156\u0159\u015d\u0161\u0167\u016b"+
		"\u0174\u0179\u017c\u0183\u0187\u0195\u01a0\u01a5\u01ac\u01b5\u01b7\u01be"+
		"\u01cf\u01e0\u01e5\u01e7\u01e9\u01f1\u01fb\u0207\u020e\u0216\u021a\u0224"+
		"\u022e\u023a\u023e\u0242\u0249\u0258\u025d\u0269\u026b\u0273\u027b\u0286";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}