// $ANTLR 3.1.3 Mar 17, 2009 19:23:44 /Users/Michael/dev/cs345/jython/jython/grammar/Python.g 2012-10-24 23:30:00

package org.python.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class PythonLexer extends Lexer {
    public static final int FUNCTION=143;
    public static final int BACKQUOTE=85;
    public static final int SLASHEQUAL=54;
    public static final int STAR=48;
    public static final int CIRCUMFLEXEQUAL=58;
    public static final int GROUP_FACT=105;
    public static final int CAPSIS=171;
    public static final int COMPLEX=89;
    public static final int NOT=31;
    public static final int EXCEPT=20;
    public static final int EOF=-1;
    public static final int TYPE=147;
    public static final int CLEAR=100;
    public static final int LEADING_WS=8;
    public static final int MINUSEQUAL=52;
    public static final int VBAR=71;
    public static final int RPAREN=44;
    public static final int IMPORT=27;
    public static final int CREATE=112;
    public static final int URLLINK=120;
    public static final int INCLUDE=175;
    public static final int RETURN=37;
    public static final int PRIMP=98;
    public static final int RBRACK=82;
    public static final int ASP=101;
    public static final int CHARTYPE=151;
    public static final int PRIO=95;
    public static final int LCURLY=83;
    public static final int INT=86;
    public static final int RIGHTSHIFT=63;
    public static final int REQD=166;
    public static final int MAXVAL=173;
    public static final int DOUBLESLASHEQUAL=62;
    public static final int RUNBAR=159;
    public static final int SQL_DELETE=115;
    public static final int WS=188;
    public static final int MAKECONNECT=117;
    public static final int INITVAL=167;
    public static final int VBAREQUAL=57;
    public static final int INTTYPE=149;
    public static final int MODIFY=161;
    public static final int ALTER=116;
    public static final int LBRACK=81;
    public static final int CONTINUED_LINE=187;
    public static final int FORCE=142;
    public static final int DOUBLESTAR=49;
    public static final int CTYPE=177;
    public static final int TABLE=135;
    public static final int REG_FACT=104;
    public static final int CAPSCLASS=162;
    public static final int FLOAT=88;
    public static final int RIGHTSHIFTEQUAL=60;
    public static final int INDENT=4;
    public static final int LPAREN=43;
    public static final int AT=42;
    public static final int AS=12;
    public static final int SLASH=77;
    public static final int CONTYPE=123;
    public static final int ASPDOTDOT=108;
    public static final int YIELD=41;
    public static final int PLUS=75;
    public static final int LAMBDA=30;
    public static final int CAPSAND=156;
    public static final int BY=130;
    public static final int CAPSWITH=176;
    public static final int SV=168;
    public static final int SORT=153;
    public static final int EXEC=21;
    public static final int MINUS=76;
    public static final int SEMI=50;
    public static final int PRINT=35;
    public static final int COLON=45;
    public static final int NULLS=178;
    public static final int AMPEREQUAL=56;
    public static final int DROP=113;
    public static final int VALIDATE=148;
    public static final int RCURLY=84;
    public static final int RDFSELECT=119;
    public static final int DESCEND=132;
    public static final int STAREQUAL=53;
    public static final int CIRCUMFLEX=72;
    public static final int FIRST=179;
    public static final int STRING=90;
    public static final int ALT_NOTEQUAL=69;
    public static final int CAPSAS=124;
    public static final int WHILE=39;
    public static final int TRIAPOS=183;
    public static final int DATETYPE=152;
    public static final int TRIGGER=146;
    public static final int ORELSE=33;
    public static final int GREATEREQUAL=67;
    public static final int CASCADE=137;
    public static final int BREAK=14;
    public static final int PASS=34;
    public static final int NOTEQUAL=70;
    public static final int MV=169;
    public static final int NAME=9;
    public static final int CAPSFROM=126;
    public static final int GREATER=65;
    public static final int ENTAIL=160;
    public static final int INSERT=111;
    public static final int FLOATTYPE=150;
    public static final int AGGREG=125;
    public static final int DOUBLESTAREQUAL=61;
    public static final int PRSO=96;
    public static final int LESS=64;
    public static final int RAISE=36;
    public static final int ASPSELECT=118;
    public static final int LAST=180;
    public static final int COMMENT=186;
    public static final int SELECT=110;
    public static final int SQL_SET=136;
    public static final int INTO=133;
    public static final int ASPBLANKQ=102;
    public static final int VIEW=140;
    public static final int PWORD=122;
    public static final int ON=128;
    public static final int DELETE=18;
    public static final int LUNBAR=158;
    public static final int PRQO=94;
    public static final int OF=165;
    public static final int ASSERT=13;
    public static final int ASPLC=107;
    public static final int TRY=38;
    public static final int URL=181;
    public static final int ELIF=19;
    public static final int INVERSE=170;
    public static final int OR=32;
    public static final int LONGINT=87;
    public static final int PRO_SELECT=97;
    public static final int FROM=23;
    public static final int LESSEQUAL=68;
    public static final int PERCENTEQUAL=55;
    public static final int DISTINCT=172;
    public static final int DOUBLESLASH=79;
    public static final int ASPPRINTDB=93;
    public static final int CONSTRAINTS=138;
    public static final int WHERE=155;
    public static final int CLASS=15;
    public static final int DEF=17;
    public static final int ORDER=129;
    public static final int LIMIT=174;
    public static final int ESC=185;
    public static final int DIGITS=99;
    public static final int UPDATE=114;
    public static final int FOR=24;
    public static final int Exponent=182;
    public static final int DEDENT=5;
    public static final int AND=11;
    public static final int PRO=91;
    public static final int ASP_PATH=106;
    public static final int PLUSEQUAL=51;
    public static final int IF=26;
    public static final int RETRIEVE=164;
    public static final int INDEX=141;
    public static final int IN=28;
    public static final int CONTINUE=16;
    public static final int COMMA=47;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int IS=29;
    public static final int AMPER=73;
    public static final int T__190=190;
    public static final int EQUAL=66;
    public static final int CAPSOR=157;
    public static final int TILDE=80;
    public static final int LEFTSHIFTEQUAL=59;
    public static final int LEFTSHIFT=74;
    public static final int DOT=10;
    public static final int WITH=40;
    public static final int UNAME=121;
    public static final int PERCENT=78;
    public static final int T__189=189;
    public static final int OPERATOR=144;
    public static final int DEFAULT=154;
    public static final int VALUES=134;
    public static final int SUBCLASS=163;
    public static final int PURGE=139;
    public static final int JOIN=127;
    public static final int PROCEDURE=145;
    public static final int TRIQUOTE=184;
    public static final int TRAILBACKSLASH=6;
    public static final int NEWLINE=7;
    public static final int FINALLY=22;
    public static final int ASCEND=131;
    public static final int ASSIGN=46;
    public static final int SOLVER=109;
    public static final int ASP_SELECT=103;
    public static final int GLOBAL=25;
    public static final int PRLO=92;

    /** Handles context-sensitive lexing of implicit line joining such as
     *  the case where newline is ignored in cases like this:
     *  a = [3,
     *       4]
     */
    int implicitLineJoiningLevel = 0;
    int startPos=-1;

    //For use in partial parsing.
    public boolean eofWhileNested = false;
    public boolean partial = false;
    public boolean single = false;

    //If you want to use another error recovery mechanism change this
    //and the same one in the parser.
    private ErrorHandler errorHandler;

        public void setErrorHandler(ErrorHandler eh) {
            this.errorHandler = eh;
        }

        /**
         *  Taken directly from antlr's Lexer.java -- needs to be re-integrated every time
         *  we upgrade from Antlr (need to consider a Lexer subclass, though the issue would
         *  remain).
         */
        public Token nextToken() {
            startPos = getCharPositionInLine();
            while (true) {
                state.token = null;
                state.channel = Token.DEFAULT_CHANNEL;
                state.tokenStartCharIndex = input.index();
                state.tokenStartCharPositionInLine = input.getCharPositionInLine();
                state.tokenStartLine = input.getLine();
                state.text = null;
                if ( input.LA(1)==CharStream.EOF ) {
                    if (implicitLineJoiningLevel > 0) {
                        eofWhileNested = true;
                    }
                    return Token.EOF_TOKEN;
                }
                try {
                    mTokens();
                    if ( state.token==null ) {
                        emit();
                    }
                    else if ( state.token==Token.SKIP_TOKEN ) {
                        continue;
                    }
                    return state.token;
                } catch (NoViableAltException nva) {
                    errorHandler.reportError(this, nva);
                    errorHandler.recover(this, nva); // throw out current char and try again
                } catch (FailedPredicateException fp) {
                    //XXX: added this for failed STRINGPART -- the FailedPredicateException
                    //     hides a NoViableAltException.  This should be the only
                    //     FailedPredicateException that gets thrown by the lexer.
                    errorHandler.reportError(this, fp);
                    errorHandler.recover(this, fp); // throw out current char and try again
                } catch (RecognitionException re) {
                    errorHandler.reportError(this, re);
                    // match() routine has already called recover()
                }
            }
        }


    // delegates
    // delegators

    public PythonLexer() {;} 
    public PythonLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public PythonLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Michael/dev/cs345/jython/jython/grammar/Python.g"; }

    // $ANTLR start "T__189"
    public final void mT__189() throws RecognitionException {
        try {
            int _type = T__189;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:74:8: ( 'TOP' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:74:10: 'TOP'
            {
            match("TOP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__189"

    // $ANTLR start "T__190"
    public final void mT__190() throws RecognitionException {
        try {
            int _type = T__190;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:75:8: ( 'INTEGERDATA' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:75:10: 'INTEGERDATA'
            {
            match("INTEGERDATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__190"

    // $ANTLR start "T__191"
    public final void mT__191() throws RecognitionException {
        try {
            int _type = T__191;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:76:8: ( 'STRINGDATA' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:76:10: 'STRINGDATA'
            {
            match("STRINGDATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__191"

    // $ANTLR start "T__192"
    public final void mT__192() throws RecognitionException {
        try {
            int _type = T__192;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:77:8: ( 'BOOLEANDATA' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:77:10: 'BOOLEANDATA'
            {
            match("BOOLEANDATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__192"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2804:11: ( 'as' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2804:13: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "ASSERT"
    public final void mASSERT() throws RecognitionException {
        try {
            int _type = ASSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2805:11: ( 'assert' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2805:13: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSERT"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2806:11: ( 'break' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2806:13: 'break'
            {
            match("break"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2807:11: ( 'class' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2807:13: 'class'
            {
            match("class"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2808:11: ( 'continue' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2808:13: 'continue'
            {
            match("continue"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "DEF"
    public final void mDEF() throws RecognitionException {
        try {
            int _type = DEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2809:11: ( 'def' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2809:13: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEF"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2810:11: ( 'del' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2810:13: 'del'
            {
            match("del"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DELETE"

    // $ANTLR start "ELIF"
    public final void mELIF() throws RecognitionException {
        try {
            int _type = ELIF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2811:11: ( 'elif' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2811:13: 'elif'
            {
            match("elif"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELIF"

    // $ANTLR start "EXCEPT"
    public final void mEXCEPT() throws RecognitionException {
        try {
            int _type = EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2812:11: ( 'except' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2812:13: 'except'
            {
            match("except"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXCEPT"

    // $ANTLR start "EXEC"
    public final void mEXEC() throws RecognitionException {
        try {
            int _type = EXEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2813:11: ( 'exec' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2813:13: 'exec'
            {
            match("exec"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EXEC"

    // $ANTLR start "FINALLY"
    public final void mFINALLY() throws RecognitionException {
        try {
            int _type = FINALLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2814:11: ( 'finally' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2814:13: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FINALLY"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2815:11: ( 'from' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2815:13: 'from'
            {
            match("from"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "FOR"
    public final void mFOR() throws RecognitionException {
        try {
            int _type = FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2816:11: ( 'for' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2816:13: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FOR"

    // $ANTLR start "GLOBAL"
    public final void mGLOBAL() throws RecognitionException {
        try {
            int _type = GLOBAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2817:11: ( 'global' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2817:13: 'global'
            {
            match("global"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GLOBAL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2818:11: ( 'if' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2818:13: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "IMPORT"
    public final void mIMPORT() throws RecognitionException {
        try {
            int _type = IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2819:11: ( 'import' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2819:13: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPORT"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2820:11: ( 'in' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2820:13: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "IS"
    public final void mIS() throws RecognitionException {
        try {
            int _type = IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2821:11: ( 'is' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2821:13: 'is'
            {
            match("is"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IS"

    // $ANTLR start "LAMBDA"
    public final void mLAMBDA() throws RecognitionException {
        try {
            int _type = LAMBDA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2822:11: ( 'lambda' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2822:13: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAMBDA"

    // $ANTLR start "ORELSE"
    public final void mORELSE() throws RecognitionException {
        try {
            int _type = ORELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2823:11: ( 'else' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2823:13: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORELSE"

    // $ANTLR start "PASS"
    public final void mPASS() throws RecognitionException {
        try {
            int _type = PASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2824:11: ( 'pass' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2824:13: 'pass'
            {
            match("pass"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PASS"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2825:11: ( 'print' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2825:13: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "RAISE"
    public final void mRAISE() throws RecognitionException {
        try {
            int _type = RAISE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2826:11: ( 'raise' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2826:13: 'raise'
            {
            match("raise"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RAISE"

    // $ANTLR start "RETURN"
    public final void mRETURN() throws RecognitionException {
        try {
            int _type = RETURN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2827:11: ( 'return' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2827:13: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETURN"

    // $ANTLR start "TRY"
    public final void mTRY() throws RecognitionException {
        try {
            int _type = TRY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2828:11: ( 'try' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2828:13: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRY"

    // $ANTLR start "WHILE"
    public final void mWHILE() throws RecognitionException {
        try {
            int _type = WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2829:11: ( 'while' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2829:13: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHILE"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2830:11: ( 'with' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2830:13: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "YIELD"
    public final void mYIELD() throws RecognitionException {
        try {
            int _type = YIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2831:11: ( 'yield' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2831:13: 'yield'
            {
            match("yield"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YIELD"

    // $ANTLR start "CLEAR"
    public final void mCLEAR() throws RecognitionException {
        try {
            int _type = CLEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2834:7: ( 'CLEAR' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2834:9: 'CLEAR'
            {
            match("CLEAR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLEAR"

    // $ANTLR start "PRO"
    public final void mPRO() throws RecognitionException {
        try {
            int _type = PRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2835:6: ( 'PRO' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2835:9: 'PRO'
            {
            match("PRO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRO"

    // $ANTLR start "PRIMP"
    public final void mPRIMP() throws RecognitionException {
        try {
            int _type = PRIMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2836:7: ( ':=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2836:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIMP"

    // $ANTLR start "PRIO"
    public final void mPRIO() throws RecognitionException {
        try {
            int _type = PRIO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2837:6: ( '?->' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2837:8: '?->'
            {
            match("?->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRIO"

    // $ANTLR start "PRLO"
    public final void mPRLO() throws RecognitionException {
        try {
            int _type = PRLO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2838:6: ( '?[' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2838:8: '?['
            {
            match("?["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRLO"

    // $ANTLR start "PRQO"
    public final void mPRQO() throws RecognitionException {
        try {
            int _type = PRQO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2839:6: ( '?-' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2839:8: '?-'
            {
            match("?-"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRQO"

    // $ANTLR start "PRSO"
    public final void mPRSO() throws RecognitionException {
        try {
            int _type = PRSO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2840:6: ( '?>>[' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2840:8: '?>>['
            {
            match("?>>["); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRSO"

    // $ANTLR start "PRO_SELECT"
    public final void mPRO_SELECT() throws RecognitionException {
        try {
            int _type = PRO_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2841:11: ( 'PRO_SELECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2841:13: 'PRO_SELECT'
            {
            match("PRO_SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRO_SELECT"

    // $ANTLR start "ASP"
    public final void mASP() throws RecognitionException {
        try {
            int _type = ASP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2845:7: ( 'ASP' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2845:10: 'ASP'
            {
            match("ASP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASP"

    // $ANTLR start "ASPBLANKQ"
    public final void mASPBLANKQ() throws RecognitionException {
        try {
            int _type = ASPBLANKQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2846:11: ( '?-.' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2846:13: '?-.'
            {
            match("?-."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASPBLANKQ"

    // $ANTLR start "ASPPRINTDB"
    public final void mASPPRINTDB() throws RecognitionException {
        try {
            int _type = ASPPRINTDB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2847:13: ( 'PRINT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2847:16: 'PRINT'
            {
            match("PRINT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASPPRINTDB"

    // $ANTLR start "ASPLC"
    public final void mASPLC() throws RecognitionException {
        try {
            int _type = ASPLC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2848:8: ( '!{' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2848:10: '!{'
            {
            match("!{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASPLC"

    // $ANTLR start "ASPDOTDOT"
    public final void mASPDOTDOT() throws RecognitionException {
        try {
            int _type = ASPDOTDOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2849:11: ( '..' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2849:13: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASPDOTDOT"

    // $ANTLR start "REG_FACT"
    public final void mREG_FACT() throws RecognitionException {
        try {
            int _type = REG_FACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2850:10: ( '?<<' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2850:12: '?<<'
            {
            match("?<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REG_FACT"

    // $ANTLR start "GROUP_FACT"
    public final void mGROUP_FACT() throws RecognitionException {
        try {
            int _type = GROUP_FACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2851:12: ( '?@@' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2851:14: '?@@'
            {
            match("?@@"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GROUP_FACT"

    // $ANTLR start "ASP_SELECT"
    public final void mASP_SELECT() throws RecognitionException {
        try {
            int _type = ASP_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2852:12: ( 'ASP_SELECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2852:14: 'ASP_SELECT'
            {
            match("ASP_SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASP_SELECT"

    // $ANTLR start "ASP_PATH"
    public final void mASP_PATH() throws RecognitionException {
        try {
            int _type = ASP_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2853:10: ( 'ASP_PATH' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2853:14: 'ASP_PATH'
            {
            match("ASP_PATH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASP_PATH"

    // $ANTLR start "SOLVER"
    public final void mSOLVER() throws RecognitionException {
        try {
            int _type = SOLVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2854:9: ( 'SOLVER' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2854:11: 'SOLVER'
            {
            match("SOLVER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SOLVER"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2859:7: ( 'LIMIT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2859:9: 'LIMIT'
            {
            match("LIMIT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "CAPSWITH"
    public final void mCAPSWITH() throws RecognitionException {
        try {
            int _type = CAPSWITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2860:9: ( 'WITH' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2860:11: 'WITH'
            {
            match("WITH"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSWITH"

    // $ANTLR start "SV"
    public final void mSV() throws RecognitionException {
        try {
            int _type = SV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2861:4: ( 'SV' | 'SINGLEVALUED' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='S') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='V') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='I') ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2861:6: 'SV'
                    {
                    match("SV"); 


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2861:13: 'SINGLEVALUED'
                    {
                    match("SINGLEVALUED"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SV"

    // $ANTLR start "MV"
    public final void mMV() throws RecognitionException {
        try {
            int _type = MV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2862:4: ( 'MV' | 'MULTIVALUED' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='M') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='V') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='U') ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2862:6: 'MV'
                    {
                    match("MV"); 


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2862:13: 'MULTIVALUED'
                    {
                    match("MULTIVALUED"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MV"

    // $ANTLR start "INVERSE"
    public final void mINVERSE() throws RecognitionException {
        try {
            int _type = INVERSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2863:9: ( 'INVERSE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2863:11: 'INVERSE'
            {
            match("INVERSE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INVERSE"

    // $ANTLR start "CAPSIS"
    public final void mCAPSIS() throws RecognitionException {
        try {
            int _type = CAPSIS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2864:8: ( 'IS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2864:10: 'IS'
            {
            match("IS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSIS"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2865:9: ( 'DISTINCT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2865:11: 'DISTINCT'
            {
            match("DISTINCT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "MAXVAL"
    public final void mMAXVAL() throws RecognitionException {
        try {
            int _type = MAXVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2866:8: ( 'MAXVAL' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2866:10: 'MAXVAL'
            {
            match("MAXVAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAXVAL"

    // $ANTLR start "CAPSCLASS"
    public final void mCAPSCLASS() throws RecognitionException {
        try {
            int _type = CAPSCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2867:10: ( 'CLASS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2867:12: 'CLASS'
            {
            match("CLASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSCLASS"

    // $ANTLR start "SUBCLASS"
    public final void mSUBCLASS() throws RecognitionException {
        try {
            int _type = SUBCLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2868:9: ( 'SUBCLASS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2868:11: 'SUBCLASS'
            {
            match("SUBCLASS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SUBCLASS"

    // $ANTLR start "REQD"
    public final void mREQD() throws RecognitionException {
        try {
            int _type = REQD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2869:6: ( 'REQUIRED' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2869:8: 'REQUIRED'
            {
            match("REQUIRED"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REQD"

    // $ANTLR start "INITVAL"
    public final void mINITVAL() throws RecognitionException {
        try {
            int _type = INITVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2870:9: ( 'INITIALVALUE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2870:11: 'INITIALVALUE'
            {
            match("INITIALVALUE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INITVAL"

    // $ANTLR start "MODIFY"
    public final void mMODIFY() throws RecognitionException {
        try {
            int _type = MODIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2871:8: ( 'MODIFY' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2871:10: 'MODIFY'
            {
            match("MODIFY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODIFY"

    // $ANTLR start "OF"
    public final void mOF() throws RecognitionException {
        try {
            int _type = OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2872:4: ( 'OF' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2872:6: 'OF'
            {
            match("OF"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OF"

    // $ANTLR start "RETRIEVE"
    public final void mRETRIEVE() throws RecognitionException {
        try {
            int _type = RETRIEVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2873:9: ( 'RETRIEVE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2873:11: 'RETRIEVE'
            {
            match("RETRIEVE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RETRIEVE"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2874:9: ( 'INCLUDE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2874:11: 'INCLUDE'
            {
            match("INCLUDE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCLUDE"

    // $ANTLR start "CTYPE"
    public final void mCTYPE() throws RecognitionException {
        try {
            int _type = CTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2875:9: ( 'CONNTYPE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2875:11: 'CONNTYPE'
            {
            match("CONNTYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CTYPE"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2882:9: ( 'SELECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2882:12: 'SELECT'
            {
            match("SELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "CAPSFROM"
    public final void mCAPSFROM() throws RecognitionException {
        try {
            int _type = CAPSFROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2883:9: ( 'FROM' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2883:12: 'FROM'
            {
            match("FROM"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSFROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2884:9: ( 'WHERE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2884:12: 'WHERE'
            {
            match("WHERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "CAPSAND"
    public final void mCAPSAND() throws RecognitionException {
        try {
            int _type = CAPSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2885:9: ( 'AND' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2885:11: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSAND"

    // $ANTLR start "CAPSOR"
    public final void mCAPSOR() throws RecognitionException {
        try {
            int _type = CAPSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2886:9: ( 'OR' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2886:12: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSOR"

    // $ANTLR start "CAPSAS"
    public final void mCAPSAS() throws RecognitionException {
        try {
            int _type = CAPSAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2887:8: ( 'AS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2887:10: 'AS'
            {
            match("AS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CAPSAS"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2888:9: ( 'INSERT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2888:12: 'INSERT'
            {
            match("INSERT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2889:9: ( 'INTO' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2889:12: 'INTO'
            {
            match("INTO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "ENTAIL"
    public final void mENTAIL() throws RecognitionException {
        try {
            int _type = ENTAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2890:9: ( 'ENTAIL' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2890:13: 'ENTAIL'
            {
            match("ENTAIL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTAIL"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2891:9: ( 'VALUES' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2891:12: 'VALUES'
            {
            match("VALUES"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2892:8: ( 'CREATE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2892:10: 'CREATE'
            {
            match("CREATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2893:7: ( 'TABLE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2893:9: 'TABLE'
            {
            match("TABLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "VIEW"
    public final void mVIEW() throws RecognitionException {
        try {
            int _type = VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2894:6: ( 'VIEW' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2894:8: 'VIEW'
            {
            match("VIEW"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VIEW"

    // $ANTLR start "INDEX"
    public final void mINDEX() throws RecognitionException {
        try {
            int _type = INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2895:7: ( 'INDEX' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2895:9: 'INDEX'
            {
            match("INDEX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INDEX"

    // $ANTLR start "ALTER"
    public final void mALTER() throws RecognitionException {
        try {
            int _type = ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2896:7: ( 'ALTER' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2896:9: 'ALTER'
            {
            match("ALTER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALTER"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2897:6: ( 'DROP' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2897:8: 'DROP'
            {
            match("DROP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DROP"

    // $ANTLR start "UPDATE"
    public final void mUPDATE() throws RecognitionException {
        try {
            int _type = UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2898:8: ( 'UPDATE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2898:10: 'UPDATE'
            {
            match("UPDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UPDATE"

    // $ANTLR start "SQL_DELETE"
    public final void mSQL_DELETE() throws RecognitionException {
        try {
            int _type = SQL_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2899:11: ( 'DELETE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2899:13: 'DELETE'
            {
            match("DELETE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL_DELETE"

    // $ANTLR start "DEFAULT"
    public final void mDEFAULT() throws RecognitionException {
        try {
            int _type = DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2900:9: ( 'DEFAULT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2900:11: 'DEFAULT'
            {
            match("DEFAULT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT"

    // $ANTLR start "SORT"
    public final void mSORT() throws RecognitionException {
        try {
            int _type = SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2901:6: ( 'SORT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2901:8: 'SORT'
            {
            match("SORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SORT"

    // $ANTLR start "SQL_SET"
    public final void mSQL_SET() throws RecognitionException {
        try {
            int _type = SQL_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2902:9: ( 'SET' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2902:11: 'SET'
            {
            match("SET"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SQL_SET"

    // $ANTLR start "CASCADE"
    public final void mCASCADE() throws RecognitionException {
        try {
            int _type = CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2903:9: ( 'CASCADE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2903:11: 'CASCADE'
            {
            match("CASCADE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CASCADE"

    // $ANTLR start "CONSTRAINTS"
    public final void mCONSTRAINTS() throws RecognitionException {
        try {
            int _type = CONSTRAINTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2904:13: ( 'CONSTRAINTS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2904:15: 'CONSTRAINTS'
            {
            match("CONSTRAINTS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONSTRAINTS"

    // $ANTLR start "PURGE"
    public final void mPURGE() throws RecognitionException {
        try {
            int _type = PURGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2905:7: ( 'PURGE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2905:9: 'PURGE'
            {
            match("PURGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PURGE"

    // $ANTLR start "FUNCTION"
    public final void mFUNCTION() throws RecognitionException {
        try {
            int _type = FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2906:10: ( 'FUNCTION' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2906:12: 'FUNCTION'
            {
            match("FUNCTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION"

    // $ANTLR start "OPERATOR"
    public final void mOPERATOR() throws RecognitionException {
        try {
            int _type = OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2907:10: ( 'OPERATOR' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2907:12: 'OPERATOR'
            {
            match("OPERATOR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OPERATOR"

    // $ANTLR start "PROCEDURE"
    public final void mPROCEDURE() throws RecognitionException {
        try {
            int _type = PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2908:11: ( 'PROCEDURE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2908:13: 'PROCEDURE'
            {
            match("PROCEDURE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE"

    // $ANTLR start "TRIGGER"
    public final void mTRIGGER() throws RecognitionException {
        try {
            int _type = TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2909:9: ( 'TRIGGER' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2909:11: 'TRIGGER'
            {
            match("TRIGGER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRIGGER"

    // $ANTLR start "TYPE"
    public final void mTYPE() throws RecognitionException {
        try {
            int _type = TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2910:6: ( 'TYPE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2910:8: 'TYPE'
            {
            match("TYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE"

    // $ANTLR start "FORCE"
    public final void mFORCE() throws RecognitionException {
        try {
            int _type = FORCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2911:7: ( 'FORCE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2911:9: 'FORCE'
            {
            match("FORCE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORCE"

    // $ANTLR start "VALIDATE"
    public final void mVALIDATE() throws RecognitionException {
        try {
            int _type = VALIDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2912:10: ( 'VALIDATE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2912:12: 'VALIDATE'
            {
            match("VALIDATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VALIDATE"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2913:6: ( 'JOIN' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2913:8: 'JOIN'
            {
            match("JOIN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2914:4: ( 'ON' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2914:6: 'ON'
            {
            match("ON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2915:7: ( 'ORDER' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2915:9: 'ORDER'
            {
            match("ORDER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2916:4: ( 'BY' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2916:6: 'BY'
            {
            match("BY"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "ASCEND"
    public final void mASCEND() throws RecognitionException {
        try {
            int _type = ASCEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2917:8: ( 'ASC' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2917:10: 'ASC'
            {
            match("ASC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASCEND"

    // $ANTLR start "DESCEND"
    public final void mDESCEND() throws RecognitionException {
        try {
            int _type = DESCEND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2918:9: ( 'DESC' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2918:11: 'DESC'
            {
            match("DESC"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DESCEND"

    // $ANTLR start "NULLS"
    public final void mNULLS() throws RecognitionException {
        try {
            int _type = NULLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2919:7: ( 'NULLS' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2919:9: 'NULLS'
            {
            match("NULLS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULLS"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2920:7: ( 'FIRST' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2920:9: 'FIRST'
            {
            match("FIRST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "LAST"
    public final void mLAST() throws RecognitionException {
        try {
            int _type = LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2921:6: ( 'LAST' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2921:8: 'LAST'
            {
            match("LAST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LAST"

    // $ANTLR start "MAKECONNECT"
    public final void mMAKECONNECT() throws RecognitionException {
        try {
            int _type = MAKECONNECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2922:12: ( 'MAKECONNECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2922:14: 'MAKECONNECT'
            {
            match("MAKECONNECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MAKECONNECT"

    // $ANTLR start "URL"
    public final void mURL() throws RecognitionException {
        try {
            int _type = URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2923:5: ( 'URL' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2923:7: 'URL'
            {
            match("URL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URL"

    // $ANTLR start "UNAME"
    public final void mUNAME() throws RecognitionException {
        try {
            int _type = UNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2924:7: ( 'UNAME' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2924:9: 'UNAME'
            {
            match("UNAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNAME"

    // $ANTLR start "PWORD"
    public final void mPWORD() throws RecognitionException {
        try {
            int _type = PWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2925:7: ( 'PWORD' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2925:9: 'PWORD'
            {
            match("PWORD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PWORD"

    // $ANTLR start "CONTYPE"
    public final void mCONTYPE() throws RecognitionException {
        try {
            int _type = CONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2926:10: ( 'CONTYPE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2926:12: 'CONTYPE'
            {
            match("CONTYPE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTYPE"

    // $ANTLR start "AGGREG"
    public final void mAGGREG() throws RecognitionException {
        try {
            int _type = AGGREG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2927:8: ( 'MAX(' | 'MIN(' | 'AVG(' | 'COUNT(' | 'FIRST(' | 'LAST(' | 'SUM(' )
            int alt3=7;
            switch ( input.LA(1) ) {
            case 'M':
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='A') ) {
                    alt3=1;
                }
                else if ( (LA3_1=='I') ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 'A':
                {
                alt3=3;
                }
                break;
            case 'C':
                {
                alt3=4;
                }
                break;
            case 'F':
                {
                alt3=5;
                }
                break;
            case 'L':
                {
                alt3=6;
                }
                break;
            case 'S':
                {
                alt3=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2927:10: 'MAX('
                    {
                    match("MAX("); 


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2928:4: 'MIN('
                    {
                    match("MIN("); 


                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2929:4: 'AVG('
                    {
                    match("AVG("); 


                    }
                    break;
                case 4 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2930:4: 'COUNT('
                    {
                    match("COUNT("); 


                    }
                    break;
                case 5 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2931:4: 'FIRST('
                    {
                    match("FIRST("); 


                    }
                    break;
                case 6 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2932:4: 'LAST('
                    {
                    match("LAST("); 


                    }
                    break;
                case 7 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2933:4: 'SUM('
                    {
                    match("SUM("); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AGGREG"

    // $ANTLR start "LUNBAR"
    public final void mLUNBAR() throws RecognitionException {
        try {
            int _type = LUNBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2935:8: ( '_|' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2935:10: '_|'
            {
            match("_|"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LUNBAR"

    // $ANTLR start "RUNBAR"
    public final void mRUNBAR() throws RecognitionException {
        try {
            int _type = RUNBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2936:8: ( '|_' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2936:10: '|_'
            {
            match("|_"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RUNBAR"

    // $ANTLR start "ASPSELECT"
    public final void mASPSELECT() throws RecognitionException {
        try {
            int _type = ASPSELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2938:11: ( 'ASPSELECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2938:13: 'ASPSELECT'
            {
            match("ASPSELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASPSELECT"

    // $ANTLR start "RDFSELECT"
    public final void mRDFSELECT() throws RecognitionException {
        try {
            int _type = RDFSELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2939:11: ( 'RDFSELECT' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2939:13: 'RDFSELECT'
            {
            match("RDFSELECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RDFSELECT"

    // $ANTLR start "INTTYPE"
    public final void mINTTYPE() throws RecognitionException {
        try {
            int _type = INTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2941:9: ( 'BIT' | 'TINYINT' | 'BIGINT' )
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='B') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='I') ) {
                    int LA4_3 = input.LA(3);

                    if ( (LA4_3=='T') ) {
                        alt4=1;
                    }
                    else if ( (LA4_3=='G') ) {
                        alt4=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0=='T') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2941:11: 'BIT'
                    {
                    match("BIT"); 


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2942:4: 'TINYINT'
                    {
                    match("TINYINT"); 


                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2943:4: 'BIGINT'
                    {
                    match("BIGINT"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTTYPE"

    // $ANTLR start "FLOATTYPE"
    public final void mFLOATTYPE() throws RecognitionException {
        try {
            int _type = FLOATTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:11: ( 'DECIMAL' ( LPAREN INT ( COMMA INT )? RPAREN )? | 'NUMERIC' ( LPAREN INT ( COMMA INT )? RPAREN )? | 'REAL' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 'D':
                {
                alt9=1;
                }
                break;
            case 'N':
                {
                alt9=2;
                }
                break;
            case 'R':
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:13: 'DECIMAL' ( LPAREN INT ( COMMA INT )? RPAREN )?
                    {
                    match("DECIMAL"); 

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:23: ( LPAREN INT ( COMMA INT )? RPAREN )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='(') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:25: LPAREN INT ( COMMA INT )? RPAREN
                            {
                            mLPAREN(); 
                            mINT(); 
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:36: ( COMMA INT )?
                            int alt5=2;
                            int LA5_0 = input.LA(1);

                            if ( (LA5_0==',') ) {
                                alt5=1;
                            }
                            switch (alt5) {
                                case 1 :
                                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2946:37: COMMA INT
                                    {
                                    mCOMMA(); 
                                    mINT(); 

                                    }
                                    break;

                            }

                            mRPAREN(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2947:4: 'NUMERIC' ( LPAREN INT ( COMMA INT )? RPAREN )?
                    {
                    match("NUMERIC"); 

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2947:14: ( LPAREN INT ( COMMA INT )? RPAREN )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0=='(') ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2947:16: LPAREN INT ( COMMA INT )? RPAREN
                            {
                            mLPAREN(); 
                            mINT(); 
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2947:27: ( COMMA INT )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==',') ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2947:28: COMMA INT
                                    {
                                    mCOMMA(); 
                                    mINT(); 

                                    }
                                    break;

                            }

                            mRPAREN(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2948:4: 'REAL'
                    {
                    match("REAL"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOATTYPE"

    // $ANTLR start "CHARTYPE"
    public final void mCHARTYPE() throws RecognitionException {
        try {
            int _type = CHARTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2951:10: ( 'VARCHAR' LPAREN INT RPAREN | 'VARCHAR2' LPAREN INT RPAREN )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2951:12: 'VARCHAR' LPAREN INT RPAREN
                    {
                    match("VARCHAR"); 

                    mLPAREN(); 
                    mINT(); 
                    mRPAREN(); 

                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2952:4: 'VARCHAR2' LPAREN INT RPAREN
                    {
                    match("VARCHAR2"); 

                    mLPAREN(); 
                    mINT(); 
                    mRPAREN(); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CHARTYPE"

    // $ANTLR start "DATETYPE"
    public final void mDATETYPE() throws RecognitionException {
        try {
            int _type = DATETYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2954:10: ( 'DATE' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2954:12: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATETYPE"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2961:11: ( '(' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2961:13: '('
            {
            match('('); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2963:11: ( ')' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2963:13: ')'
            {
            match(')'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2965:11: ( '[' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2965:13: '['
            {
            match('['); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2967:11: ( ']' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2967:13: ']'
            {
            match(']'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2969:11: ( ':' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2969:13: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2971:10: ( ',' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2971:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2973:9: ( ';' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2973:11: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2975:9: ( '+' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2975:11: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2977:10: ( '-' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2977:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2979:9: ( '*' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2979:11: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "SLASH"
    public final void mSLASH() throws RecognitionException {
        try {
            int _type = SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2981:10: ( '/' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2981:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASH"

    // $ANTLR start "VBAR"
    public final void mVBAR() throws RecognitionException {
        try {
            int _type = VBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2983:9: ( '|' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2983:11: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAR"

    // $ANTLR start "AMPER"
    public final void mAMPER() throws RecognitionException {
        try {
            int _type = AMPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2985:10: ( '&' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2985:12: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPER"

    // $ANTLR start "LESS"
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2987:9: ( '<' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2987:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESS"

    // $ANTLR start "GREATER"
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2989:12: ( '>' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2989:14: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATER"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2991:11: ( '=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2991:13: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2993:12: ( '%' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2993:14: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "BACKQUOTE"
    public final void mBACKQUOTE() throws RecognitionException {
        try {
            int _type = BACKQUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2995:14: ( '`' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2995:16: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BACKQUOTE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2997:11: ( '{' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2997:13: '{'
            {
            match('{'); 
            implicitLineJoiningLevel++;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2999:11: ( '}' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:2999:13: '}'
            {
            match('}'); 
            implicitLineJoiningLevel--;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "CIRCUMFLEX"
    public final void mCIRCUMFLEX() throws RecognitionException {
        try {
            int _type = CIRCUMFLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3001:15: ( '^' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3001:17: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEX"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3003:10: ( '~' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3003:12: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3005:10: ( '==' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3005:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3007:13: ( '!=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3007:15: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "ALT_NOTEQUAL"
    public final void mALT_NOTEQUAL() throws RecognitionException {
        try {
            int _type = ALT_NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3009:13: ( '<>' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3009:15: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALT_NOTEQUAL"

    // $ANTLR start "LESSEQUAL"
    public final void mLESSEQUAL() throws RecognitionException {
        try {
            int _type = LESSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3011:14: ( '<=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3011:16: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQUAL"

    // $ANTLR start "LEFTSHIFT"
    public final void mLEFTSHIFT() throws RecognitionException {
        try {
            int _type = LEFTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3013:14: ( '<<' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3013:16: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFT"

    // $ANTLR start "GREATEREQUAL"
    public final void mGREATEREQUAL() throws RecognitionException {
        try {
            int _type = GREATEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3015:17: ( '>=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3015:19: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQUAL"

    // $ANTLR start "RIGHTSHIFT"
    public final void mRIGHTSHIFT() throws RecognitionException {
        try {
            int _type = RIGHTSHIFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3017:15: ( '>>' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3017:17: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFT"

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3019:14: ( '+=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3019:16: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3021:15: ( '-=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3021:17: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "DOUBLESTAR"
    public final void mDOUBLESTAR() throws RecognitionException {
        try {
            int _type = DOUBLESTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3023:15: ( '**' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3023:17: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAR"

    // $ANTLR start "STAREQUAL"
    public final void mSTAREQUAL() throws RecognitionException {
        try {
            int _type = STAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3025:14: ( '*=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3025:16: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STAREQUAL"

    // $ANTLR start "DOUBLESLASH"
    public final void mDOUBLESLASH() throws RecognitionException {
        try {
            int _type = DOUBLESLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3027:16: ( '//' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3027:18: '//'
            {
            match("//"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASH"

    // $ANTLR start "SLASHEQUAL"
    public final void mSLASHEQUAL() throws RecognitionException {
        try {
            int _type = SLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3029:15: ( '/=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3029:17: '/='
            {
            match("/="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLASHEQUAL"

    // $ANTLR start "VBAREQUAL"
    public final void mVBAREQUAL() throws RecognitionException {
        try {
            int _type = VBAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3031:14: ( '|=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3031:16: '|='
            {
            match("|="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VBAREQUAL"

    // $ANTLR start "PERCENTEQUAL"
    public final void mPERCENTEQUAL() throws RecognitionException {
        try {
            int _type = PERCENTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3033:17: ( '%=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3033:19: '%='
            {
            match("%="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENTEQUAL"

    // $ANTLR start "AMPEREQUAL"
    public final void mAMPEREQUAL() throws RecognitionException {
        try {
            int _type = AMPEREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3035:15: ( '&=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3035:17: '&='
            {
            match("&="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AMPEREQUAL"

    // $ANTLR start "CIRCUMFLEXEQUAL"
    public final void mCIRCUMFLEXEQUAL() throws RecognitionException {
        try {
            int _type = CIRCUMFLEXEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3037:20: ( '^=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3037:22: '^='
            {
            match("^="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCUMFLEXEQUAL"

    // $ANTLR start "LEFTSHIFTEQUAL"
    public final void mLEFTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = LEFTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3039:19: ( '<<=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3039:21: '<<='
            {
            match("<<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEFTSHIFTEQUAL"

    // $ANTLR start "RIGHTSHIFTEQUAL"
    public final void mRIGHTSHIFTEQUAL() throws RecognitionException {
        try {
            int _type = RIGHTSHIFTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3041:20: ( '>>=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3041:22: '>>='
            {
            match(">>="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RIGHTSHIFTEQUAL"

    // $ANTLR start "DOUBLESTAREQUAL"
    public final void mDOUBLESTAREQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESTAREQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3043:20: ( '**=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3043:22: '**='
            {
            match("**="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAREQUAL"

    // $ANTLR start "DOUBLESLASHEQUAL"
    public final void mDOUBLESLASHEQUAL() throws RecognitionException {
        try {
            int _type = DOUBLESLASHEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3045:21: ( '//=' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3045:23: '//='
            {
            match("//="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLESLASHEQUAL"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3047:5: ( '.' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3047:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3049:4: ( '@' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3049:6: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3051:5: ( 'and' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3051:7: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3053:4: ( 'or' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3053:6: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3055:5: ( 'not' )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3055:7: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3058:5: ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3058:9: '.' DIGITS ( Exponent )?
                    {
                    match('.'); 
                    mDIGITS(); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3058:20: ( Exponent )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3058:21: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3059:9: DIGITS '.' Exponent
                    {
                    mDIGITS(); 
                    match('.'); 
                    mExponent(); 

                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:9: DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    {
                    mDIGITS(); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:16: ( '.' ( DIGITS ( Exponent )? )? | Exponent )
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='.') ) {
                        alt14=1;
                    }
                    else if ( (LA14_0=='E'||LA14_0=='e') ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:17: '.' ( DIGITS ( Exponent )? )?
                            {
                            match('.'); 
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:21: ( DIGITS ( Exponent )? )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:22: DIGITS ( Exponent )?
                                    {
                                    mDIGITS(); 
                                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:29: ( Exponent )?
                                    int alt12=2;
                                    int LA12_0 = input.LA(1);

                                    if ( (LA12_0=='E'||LA12_0=='e') ) {
                                        alt12=1;
                                    }
                                    switch (alt12) {
                                        case 1 :
                                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:30: Exponent
                                            {
                                            mExponent(); 

                                            }
                                            break;

                                    }


                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3060:45: Exponent
                            {
                            mExponent(); 

                            }
                            break;

                    }


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "LONGINT"
    public final void mLONGINT() throws RecognitionException {
        try {
            int _type = LONGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3064:5: ( INT ( 'l' | 'L' ) )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3064:9: INT ( 'l' | 'L' )
            {
            mINT(); 
            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LONGINT"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3069:5: ( ( 'e' | 'E' ) ( '+' | '-' )? DIGITS )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3069:10: ( 'e' | 'E' ) ( '+' | '-' )? DIGITS
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3069:22: ( '+' | '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='+'||LA16_0=='-') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mDIGITS(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3072:5: ( '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ | '0' ( 'o' | 'O' ) ( '0' .. '7' )* | '0' ( '0' .. '7' )* | '0' ( 'b' | 'B' ) ( '0' .. '1' )* | '1' .. '9' ( DIGITS )* )
            int alt22=5;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'X':
                case 'x':
                    {
                    alt22=1;
                    }
                    break;
                case 'O':
                case 'o':
                    {
                    alt22=2;
                    }
                    break;
                case 'B':
                case 'b':
                    {
                    alt22=4;
                    }
                    break;
                default:
                    alt22=3;}

            }
            else if ( ((LA22_0>='1' && LA22_0<='9')) ) {
                alt22=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3073:9: '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    {
                    match('0'); 
                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3073:25: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||(LA17_0>='a' && LA17_0<='f')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3075:9: '0' ( 'o' | 'O' ) ( '0' .. '7' )*
                    {
                    match('0'); 
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3075:25: ( '0' .. '7' )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( ((LA18_0>='0' && LA18_0<='7')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3075:27: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3076:9: '0' ( '0' .. '7' )*
                    {
                    match('0'); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3076:14: ( '0' .. '7' )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( ((LA19_0>='0' && LA19_0<='7')) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3076:16: '0' .. '7'
                    	    {
                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3078:9: '0' ( 'b' | 'B' ) ( '0' .. '1' )*
                    {
                    match('0'); 
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3078:25: ( '0' .. '1' )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='0' && LA20_0<='1')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3078:27: '0' .. '1'
                    	    {
                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;
                case 5 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3080:9: '1' .. '9' ( DIGITS )*
                    {
                    matchRange('1','9'); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3080:18: ( DIGITS )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3080:18: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "COMPLEX"
    public final void mCOMPLEX() throws RecognitionException {
        try {
            int _type = COMPLEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3084:5: ( ( DIGITS )+ ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3084:9: ( DIGITS )+ ( 'j' | 'J' )
                    {
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3084:9: ( DIGITS )+
                    int cnt23=0;
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>='0' && LA23_0<='9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3084:9: DIGITS
                    	    {
                    	    mDIGITS(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt23 >= 1 ) break loop23;
                                EarlyExitException eee =
                                    new EarlyExitException(23, input);
                                throw eee;
                        }
                        cnt23++;
                    } while (true);

                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3085:9: FLOAT ( 'j' | 'J' )
                    {
                    mFLOAT(); 
                    if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPLEX"

    // $ANTLR start "DIGITS"
    public final void mDIGITS() throws RecognitionException {
        try {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3089:8: ( ( '0' .. '9' )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3089:10: ( '0' .. '9' )+
            {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3089:10: ( '0' .. '9' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3089:12: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGITS"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3091:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3091:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3092:9: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')||(LA26_0>='A' && LA26_0<='Z')||LA26_0=='_'||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "URLLINK"
    public final void mURLLINK() throws RecognitionException {
        try {
            int _type = URLLINK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3095:8: ( URL ' ' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | COLON | AT | MINUS | DOT )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3095:10: URL ' ' ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | COLON | AT | MINUS | DOT )+
            {
            mURL(); 
            match(' '); 
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3095:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | COLON | AT | MINUS | DOT )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='-' && LA27_0<='.')||(LA27_0>='0' && LA27_0<=':')||(LA27_0>='@' && LA27_0<='Z')||LA27_0=='_'||(LA27_0>='a' && LA27_0<='z')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
            	    {
            	    if ( (input.LA(1)>='-' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<=':')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "URLLINK"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:5: ( ( 'r' | 'u' | 'b' | 'ur' | 'R' | 'U' | 'B' | 'UR' | 'uR' | 'Ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' ) )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:9: ( 'r' | 'u' | 'b' | 'ur' | 'R' | 'U' | 'B' | 'UR' | 'uR' | 'Ur' )? ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:9: ( 'r' | 'u' | 'b' | 'ur' | 'R' | 'U' | 'B' | 'UR' | 'uR' | 'Ur' )?
            int alt28=11;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:10: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:14: 'u'
                    {
                    match('u'); 

                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:18: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 4 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:22: 'ur'
                    {
                    match("ur"); 


                    }
                    break;
                case 5 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:27: 'R'
                    {
                    match('R'); 

                    }
                    break;
                case 6 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:31: 'U'
                    {
                    match('U'); 

                    }
                    break;
                case 7 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:35: 'B'
                    {
                    match('B'); 

                    }
                    break;
                case 8 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:39: 'UR'
                    {
                    match("UR"); 


                    }
                    break;
                case 9 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:44: 'uR'
                    {
                    match("uR"); 


                    }
                    break;
                case 10 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3102:49: 'Ur'
                    {
                    match("Ur"); 


                    }
                    break;

            }

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3103:9: ( '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\'' | '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"' | '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"' | '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\'' )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( (LA33_0=='\'') ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1=='\'') ) {
                    int LA33_3 = input.LA(3);

                    if ( (LA33_3=='\'') ) {
                        alt33=1;
                    }
                    else {
                        alt33=4;}
                }
                else if ( ((LA33_1>='\u0000' && LA33_1<='\t')||(LA33_1>='\u000B' && LA33_1<='&')||(LA33_1>='(' && LA33_1<='\uFFFF')) ) {
                    alt33=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA33_0=='\"') ) {
                int LA33_2 = input.LA(2);

                if ( (LA33_2=='\"') ) {
                    int LA33_5 = input.LA(3);

                    if ( (LA33_5=='\"') ) {
                        alt33=2;
                    }
                    else {
                        alt33=3;}
                }
                else if ( ((LA33_2>='\u0000' && LA33_2<='\t')||(LA33_2>='\u000B' && LA33_2<='!')||(LA33_2>='#' && LA33_2<='\uFFFF')) ) {
                    alt33=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 33, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3103:13: '\\'\\'\\'' ( options {greedy=false; } : TRIAPOS )* '\\'\\'\\''
                    {
                    match("'''"); 

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3103:22: ( options {greedy=false; } : TRIAPOS )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\'') ) {
                            int LA29_1 = input.LA(2);

                            if ( (LA29_1=='\'') ) {
                                int LA29_3 = input.LA(3);

                                if ( (LA29_3=='\'') ) {
                                    alt29=2;
                                }
                                else if ( ((LA29_3>='\u0000' && LA29_3<='&')||(LA29_3>='(' && LA29_3<='\uFFFF')) ) {
                                    alt29=1;
                                }


                            }
                            else if ( ((LA29_1>='\u0000' && LA29_1<='&')||(LA29_1>='(' && LA29_1<='\uFFFF')) ) {
                                alt29=1;
                            }


                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='\uFFFF')) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3103:47: TRIAPOS
                    	    {
                    	    mTRIAPOS(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match("'''"); 


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3104:13: '\"\"\"' ( options {greedy=false; } : TRIQUOTE )* '\"\"\"'
                    {
                    match("\"\"\""); 

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3104:19: ( options {greedy=false; } : TRIQUOTE )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0=='\"') ) {
                            int LA30_1 = input.LA(2);

                            if ( (LA30_1=='\"') ) {
                                int LA30_3 = input.LA(3);

                                if ( (LA30_3=='\"') ) {
                                    alt30=2;
                                }
                                else if ( ((LA30_3>='\u0000' && LA30_3<='!')||(LA30_3>='#' && LA30_3<='\uFFFF')) ) {
                                    alt30=1;
                                }


                            }
                            else if ( ((LA30_1>='\u0000' && LA30_1<='!')||(LA30_1>='#' && LA30_1<='\uFFFF')) ) {
                                alt30=1;
                            }


                        }
                        else if ( ((LA30_0>='\u0000' && LA30_0<='!')||(LA30_0>='#' && LA30_0<='\uFFFF')) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3104:44: TRIQUOTE
                    	    {
                    	    mTRIQUOTE(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    match("\"\"\""); 


                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3105:13: '\"' ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3105:17: ( ESC | ~ ( '\\\\' | '\\n' | '\"' ) )*
                    loop31:
                    do {
                        int alt31=3;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0=='\\') ) {
                            alt31=1;
                        }
                        else if ( ((LA31_0>='\u0000' && LA31_0<='\t')||(LA31_0>='\u000B' && LA31_0<='!')||(LA31_0>='#' && LA31_0<='[')||(LA31_0>=']' && LA31_0<='\uFFFF')) ) {
                            alt31=2;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3105:18: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3105:22: ~ ( '\\\\' | '\\n' | '\"' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 4 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3106:13: '\\'' ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3106:18: ( ESC | ~ ( '\\\\' | '\\n' | '\\'' ) )*
                    loop32:
                    do {
                        int alt32=3;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0=='\\') ) {
                            alt32=1;
                        }
                        else if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='&')||(LA32_0>='(' && LA32_0<='[')||(LA32_0>=']' && LA32_0<='\uFFFF')) ) {
                            alt32=2;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3106:19: ESC
                    	    {
                    	    mESC(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3106:23: ~ ( '\\\\' | '\\n' | '\\'' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


                       if (state.tokenStartLine != input.getLine()) {
                           state.tokenStartLine = input.getLine();
                           state.tokenStartCharPositionInLine = -2;
                       }
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "TRIQUOTE"
    public final void mTRIQUOTE() throws RecognitionException {
        try {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:5: ( ( '\"' )? ( '\"' )? ( ESC | ~ ( '\\\\' | '\"' ) )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:7: ( '\"' )? ( '\"' )? ( ESC | ~ ( '\\\\' | '\"' ) )+
            {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:7: ( '\"' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\"') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:7: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:12: ( '\"' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0=='\"') ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:12: '\"'
                    {
                    match('\"'); 

                    }
                    break;

            }

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:17: ( ESC | ~ ( '\\\\' | '\"' ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0=='\\') ) {
                    alt36=1;
                }
                else if ( ((LA36_0>='\u0000' && LA36_0<='!')||(LA36_0>='#' && LA36_0<='[')||(LA36_0>=']' && LA36_0<='\uFFFF')) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:18: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3118:22: ~ ( '\\\\' | '\"' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TRIQUOTE"

    // $ANTLR start "TRIAPOS"
    public final void mTRIAPOS() throws RecognitionException {
        try {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:5: ( ( '\\'' )? ( '\\'' )? ( ESC | ~ ( '\\\\' | '\\'' ) )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:7: ( '\\'' )? ( '\\'' )? ( ESC | ~ ( '\\\\' | '\\'' ) )+
            {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:7: ( '\\'' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0=='\'') ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:7: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:13: ( '\\'' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0=='\'') ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:13: '\\''
                    {
                    match('\''); 

                    }
                    break;

            }

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:19: ( ESC | ~ ( '\\\\' | '\\'' ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=3;
                int LA39_0 = input.LA(1);

                if ( (LA39_0=='\\') ) {
                    alt39=1;
                }
                else if ( ((LA39_0>='\u0000' && LA39_0<='&')||(LA39_0>='(' && LA39_0<='[')||(LA39_0>=']' && LA39_0<='\uFFFF')) ) {
                    alt39=2;
                }


                switch (alt39) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:20: ESC
            	    {
            	    mESC(); 

            	    }
            	    break;
            	case 2 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3124:24: ~ ( '\\\\' | '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "TRIAPOS"

    // $ANTLR start "ESC"
    public final void mESC() throws RecognitionException {
        try {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3129:5: ( '\\\\' . )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3129:10: '\\\\' .
            {
            match('\\'); 
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "ESC"

    // $ANTLR start "CONTINUED_LINE"
    public final void mCONTINUED_LINE() throws RecognitionException {
        try {
            int _type = CONTINUED_LINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            Token nl=null;

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3137:5: ( '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* ( COMMENT | nl= NEWLINE | ) )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3137:10: '\\\\' ( '\\r' )? '\\n' ( ' ' | '\\t' )* ( COMMENT | nl= NEWLINE | )
            {
            match('\\'); 
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3137:15: ( '\\r' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0=='\r') ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3137:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3137:28: ( ' ' | '\\t' )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0=='\t'||LA41_0==' ') ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             _channel=HIDDEN; 
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3138:10: ( COMMENT | nl= NEWLINE | )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0=='\t'||LA42_0==' ') && ((startPos==0))) {
                alt42=1;
            }
            else if ( (LA42_0=='#') ) {
                alt42=1;
            }
            else if ( (LA42_0=='\n'||(LA42_0>='\f' && LA42_0<='\r')) ) {
                alt42=2;
            }
            else {
                alt42=3;}
            switch (alt42) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3138:12: COMMENT
                    {
                    mCOMMENT(); 

                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3139:12: nl= NEWLINE
                    {
                    int nlStart2803 = getCharIndex();
                    mNEWLINE(); 
                    nl = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, nlStart2803, getCharIndex()-1);

                                   emit(new CommonToken(NEWLINE,nl.getText()));
                               

                    }
                    break;
                case 3 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3144:10: 
                    {
                    }
                    break;

            }


                           if (input.LA(1) == -1) {
                               throw new ParseException("unexpected character after line continuation character");
                           }
                       

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONTINUED_LINE"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                int newlines = 0;

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:5: ( ( ( '\\u000C' )? ( '\\r' )? '\\n' )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            {
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:9: ( ( '\\u000C' )? ( '\\r' )? '\\n' )+
            int cnt45=0;
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0=='\n'||(LA45_0>='\f' && LA45_0<='\r')) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:10: ( '\\u000C' )? ( '\\r' )? '\\n'
            	    {
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:10: ( '\\u000C' )?
            	    int alt43=2;
            	    int LA43_0 = input.LA(1);

            	    if ( (LA43_0=='\f') ) {
            	        alt43=1;
            	    }
            	    switch (alt43) {
            	        case 1 :
            	            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:11: '\\u000C'
            	            {
            	            match('\f'); 

            	            }
            	            break;

            	    }

            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:21: ( '\\r' )?
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0=='\r') ) {
            	        alt44=1;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3161:22: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 
            	    newlines++; 

            	    }
            	    break;

            	default :
            	    if ( cnt45 >= 1 ) break loop45;
                        EarlyExitException eee =
                            new EarlyExitException(45, input);
                        throw eee;
                }
                cnt45++;
            } while (true);


                     if ( startPos==0 || implicitLineJoiningLevel>0 )
                        _channel=HIDDEN;
                    

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEWLINE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3167:5: ({...}? => ( ' ' | '\\t' | '\\u000C' )+ )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3167:10: {...}? => ( ' ' | '\\t' | '\\u000C' )+
            {
            if ( !((startPos>0)) ) {
                throw new FailedPredicateException(input, "WS", "startPos>0");
            }
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3167:26: ( ' ' | '\\t' | '\\u000C' )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0=='\t'||LA46_0=='\f'||LA46_0==' ') ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)=='\f'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LEADING_WS"
    public final void mLEADING_WS() throws RecognitionException {
        try {
            int _type = LEADING_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                int spaces = 0;
                int newlines = 0;

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3181:5: ({...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* ) )
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3181:9: {...}? => ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            {
            if ( !((startPos==0)) ) {
                throw new FailedPredicateException(input, "LEADING_WS", "startPos==0");
            }
            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3182:9: ({...}? ( ' ' | '\\t' )+ | ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )* )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==' ') ) {
                int LA51_1 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA51_0=='\t') ) {
                int LA51_2 = input.LA(2);

                if ( ((implicitLineJoiningLevel>0)) ) {
                    alt51=1;
                }
                else if ( (true) ) {
                    alt51=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3182:13: {...}? ( ' ' | '\\t' )+
                    {
                    if ( !((implicitLineJoiningLevel>0)) ) {
                        throw new FailedPredicateException(input, "LEADING_WS", "implicitLineJoiningLevel>0");
                    }
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3182:43: ( ' ' | '\\t' )+
                    int cnt47=0;
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0=='\t'||LA47_0==' ') ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt47 >= 1 ) break loop47;
                                EarlyExitException eee =
                                    new EarlyExitException(47, input);
                                throw eee;
                        }
                        cnt47++;
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3183:14: ( ' ' | '\\t' )+ ( ( '\\r' )? '\\n' )*
                    {
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3183:14: ( ' ' | '\\t' )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=3;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==' ') ) {
                            alt48=1;
                        }
                        else if ( (LA48_0=='\t') ) {
                            alt48=2;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3183:20: ' '
                    	    {
                    	    match(' '); 
                    	     spaces++; 

                    	    }
                    	    break;
                    	case 2 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3184:19: '\\t'
                    	    {
                    	    match('\t'); 
                    	     spaces += 8; spaces -= (spaces % 8); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3186:14: ( ( '\\r' )? '\\n' )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0=='\n'||LA50_0=='\r') ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3186:16: ( '\\r' )? '\\n'
                    	    {
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3186:16: ( '\\r' )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0=='\r') ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3186:17: '\\r'
                    	            {
                    	            match('\r'); 

                    	            }
                    	            break;

                    	    }

                    	    match('\n'); 
                    	    newlines++; 

                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                                       if (input.LA(1) != -1 || newlines == 0) {
                                           // make a string of n spaces where n is column number - 1
                                           char[] indentation = new char[spaces];
                                           for (int i=0; i<spaces; i++) {
                                               indentation[i] = ' ';
                                           }
                                           CommonToken c = new CommonToken(LEADING_WS,new String(indentation));
                                           c.setLine(input.getLine());
                                           c.setCharPositionInLine(input.getCharPositionInLine());
                                           c.setStartIndex(input.index() - 1);
                                           c.setStopIndex(input.index() - 1);
                                           emit(c);
                                           // kill trailing newline if present and then ignore
                                           if (newlines != 0) {
                                               if (state.token!=null) {
                                                   state.token.setChannel(HIDDEN);
                                               } else {
                                                   _channel=HIDDEN;
                                               }
                                           }
                                       } else if (this.single && newlines == 1) {
                                           // This is here for this case in interactive mode:
                                           //
                                           // def foo():
                                           //   print 1
                                           //   <spaces but no code>
                                           //
                                           // The above would complete in interactive mode instead
                                           // of giving ... to wait for more input.
                                           //
                                           throw new ParseException("Trailing space in single mode.");
                                       } else {
                                           // make a string of n newlines
                                           char[] nls = new char[newlines];
                                           for (int i=0; i<newlines; i++) {
                                               nls[i] = '\n';
                                           }
                                           CommonToken c = new CommonToken(NEWLINE,new String(nls));
                                           c.setLine(input.getLine());
                                           c.setCharPositionInLine(input.getCharPositionInLine());
                                           c.setStartIndex(input.index() - 1);
                                           c.setStopIndex(input.index() - 1);
                                           emit(c);
                                       }
                                    

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LEADING_WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;

                _channel=HIDDEN;

            // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:5: ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | '#' (~ '\\n' )* )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:10: {...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+
                    {
                    if ( !((startPos==0)) ) {
                        throw new FailedPredicateException(input, "COMMENT", "startPos==0");
                    }
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:27: ( ' ' | '\\t' )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0=='\t'||LA52_0==' ') ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:
                    	    {
                    	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    match('#'); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:43: (~ '\\n' )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( ((LA53_0>='\u0000' && LA53_0<='\t')||(LA53_0>='\u000B' && LA53_0<='\uFFFF')) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:44: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:52: ( '\\n' )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0=='\n') ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3257:52: '\\n'
                    	    {
                    	    match('\n'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt54 >= 1 ) break loop54;
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3258:10: '#' (~ '\\n' )*
                    {
                    match('#'); 
                    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3258:14: (~ '\\n' )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>='\u0000' && LA55_0<='\t')||(LA55_0>='\u000B' && LA55_0<='\uFFFF')) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:3258:15: ~ '\\n'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:8: ( T__189 | T__190 | T__191 | T__192 | AS | ASSERT | BREAK | CLASS | CONTINUE | DEF | DELETE | ELIF | EXCEPT | EXEC | FINALLY | FROM | FOR | GLOBAL | IF | IMPORT | IN | IS | LAMBDA | ORELSE | PASS | PRINT | RAISE | RETURN | TRY | WHILE | WITH | YIELD | CLEAR | PRO | PRIMP | PRIO | PRLO | PRQO | PRSO | PRO_SELECT | ASP | ASPBLANKQ | ASPPRINTDB | ASPLC | ASPDOTDOT | REG_FACT | GROUP_FACT | ASP_SELECT | ASP_PATH | SOLVER | LIMIT | CAPSWITH | SV | MV | INVERSE | CAPSIS | DISTINCT | MAXVAL | CAPSCLASS | SUBCLASS | REQD | INITVAL | MODIFY | OF | RETRIEVE | INCLUDE | CTYPE | SELECT | CAPSFROM | WHERE | CAPSAND | CAPSOR | CAPSAS | INSERT | INTO | ENTAIL | VALUES | CREATE | TABLE | VIEW | INDEX | ALTER | DROP | UPDATE | SQL_DELETE | DEFAULT | SORT | SQL_SET | CASCADE | CONSTRAINTS | PURGE | FUNCTION | OPERATOR | PROCEDURE | TRIGGER | TYPE | FORCE | VALIDATE | JOIN | ON | ORDER | BY | ASCEND | DESCEND | NULLS | FIRST | LAST | MAKECONNECT | URL | UNAME | PWORD | CONTYPE | AGGREG | LUNBAR | RUNBAR | ASPSELECT | RDFSELECT | INTTYPE | FLOATTYPE | CHARTYPE | DATETYPE | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | URLLINK | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT )
        int alt57=181;
        alt57 = dfa57.predict(input);
        switch (alt57) {
            case 1 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:10: T__189
                {
                mT__189(); 

                }
                break;
            case 2 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:17: T__190
                {
                mT__190(); 

                }
                break;
            case 3 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:24: T__191
                {
                mT__191(); 

                }
                break;
            case 4 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:31: T__192
                {
                mT__192(); 

                }
                break;
            case 5 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:38: AS
                {
                mAS(); 

                }
                break;
            case 6 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:41: ASSERT
                {
                mASSERT(); 

                }
                break;
            case 7 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:48: BREAK
                {
                mBREAK(); 

                }
                break;
            case 8 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:54: CLASS
                {
                mCLASS(); 

                }
                break;
            case 9 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:60: CONTINUE
                {
                mCONTINUE(); 

                }
                break;
            case 10 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:69: DEF
                {
                mDEF(); 

                }
                break;
            case 11 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:73: DELETE
                {
                mDELETE(); 

                }
                break;
            case 12 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:80: ELIF
                {
                mELIF(); 

                }
                break;
            case 13 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:85: EXCEPT
                {
                mEXCEPT(); 

                }
                break;
            case 14 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:92: EXEC
                {
                mEXEC(); 

                }
                break;
            case 15 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:97: FINALLY
                {
                mFINALLY(); 

                }
                break;
            case 16 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:105: FROM
                {
                mFROM(); 

                }
                break;
            case 17 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:110: FOR
                {
                mFOR(); 

                }
                break;
            case 18 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:114: GLOBAL
                {
                mGLOBAL(); 

                }
                break;
            case 19 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:121: IF
                {
                mIF(); 

                }
                break;
            case 20 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:124: IMPORT
                {
                mIMPORT(); 

                }
                break;
            case 21 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:131: IN
                {
                mIN(); 

                }
                break;
            case 22 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:134: IS
                {
                mIS(); 

                }
                break;
            case 23 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:137: LAMBDA
                {
                mLAMBDA(); 

                }
                break;
            case 24 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:144: ORELSE
                {
                mORELSE(); 

                }
                break;
            case 25 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:151: PASS
                {
                mPASS(); 

                }
                break;
            case 26 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:156: PRINT
                {
                mPRINT(); 

                }
                break;
            case 27 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:162: RAISE
                {
                mRAISE(); 

                }
                break;
            case 28 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:168: RETURN
                {
                mRETURN(); 

                }
                break;
            case 29 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:175: TRY
                {
                mTRY(); 

                }
                break;
            case 30 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:179: WHILE
                {
                mWHILE(); 

                }
                break;
            case 31 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:185: WITH
                {
                mWITH(); 

                }
                break;
            case 32 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:190: YIELD
                {
                mYIELD(); 

                }
                break;
            case 33 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:196: CLEAR
                {
                mCLEAR(); 

                }
                break;
            case 34 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:202: PRO
                {
                mPRO(); 

                }
                break;
            case 35 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:206: PRIMP
                {
                mPRIMP(); 

                }
                break;
            case 36 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:212: PRIO
                {
                mPRIO(); 

                }
                break;
            case 37 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:217: PRLO
                {
                mPRLO(); 

                }
                break;
            case 38 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:222: PRQO
                {
                mPRQO(); 

                }
                break;
            case 39 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:227: PRSO
                {
                mPRSO(); 

                }
                break;
            case 40 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:232: PRO_SELECT
                {
                mPRO_SELECT(); 

                }
                break;
            case 41 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:243: ASP
                {
                mASP(); 

                }
                break;
            case 42 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:247: ASPBLANKQ
                {
                mASPBLANKQ(); 

                }
                break;
            case 43 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:257: ASPPRINTDB
                {
                mASPPRINTDB(); 

                }
                break;
            case 44 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:268: ASPLC
                {
                mASPLC(); 

                }
                break;
            case 45 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:274: ASPDOTDOT
                {
                mASPDOTDOT(); 

                }
                break;
            case 46 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:284: REG_FACT
                {
                mREG_FACT(); 

                }
                break;
            case 47 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:293: GROUP_FACT
                {
                mGROUP_FACT(); 

                }
                break;
            case 48 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:304: ASP_SELECT
                {
                mASP_SELECT(); 

                }
                break;
            case 49 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:315: ASP_PATH
                {
                mASP_PATH(); 

                }
                break;
            case 50 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:324: SOLVER
                {
                mSOLVER(); 

                }
                break;
            case 51 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:331: LIMIT
                {
                mLIMIT(); 

                }
                break;
            case 52 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:337: CAPSWITH
                {
                mCAPSWITH(); 

                }
                break;
            case 53 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:346: SV
                {
                mSV(); 

                }
                break;
            case 54 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:349: MV
                {
                mMV(); 

                }
                break;
            case 55 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:352: INVERSE
                {
                mINVERSE(); 

                }
                break;
            case 56 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:360: CAPSIS
                {
                mCAPSIS(); 

                }
                break;
            case 57 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:367: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 58 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:376: MAXVAL
                {
                mMAXVAL(); 

                }
                break;
            case 59 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:383: CAPSCLASS
                {
                mCAPSCLASS(); 

                }
                break;
            case 60 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:393: SUBCLASS
                {
                mSUBCLASS(); 

                }
                break;
            case 61 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:402: REQD
                {
                mREQD(); 

                }
                break;
            case 62 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:407: INITVAL
                {
                mINITVAL(); 

                }
                break;
            case 63 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:415: MODIFY
                {
                mMODIFY(); 

                }
                break;
            case 64 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:422: OF
                {
                mOF(); 

                }
                break;
            case 65 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:425: RETRIEVE
                {
                mRETRIEVE(); 

                }
                break;
            case 66 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:434: INCLUDE
                {
                mINCLUDE(); 

                }
                break;
            case 67 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:442: CTYPE
                {
                mCTYPE(); 

                }
                break;
            case 68 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:448: SELECT
                {
                mSELECT(); 

                }
                break;
            case 69 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:455: CAPSFROM
                {
                mCAPSFROM(); 

                }
                break;
            case 70 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:464: WHERE
                {
                mWHERE(); 

                }
                break;
            case 71 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:470: CAPSAND
                {
                mCAPSAND(); 

                }
                break;
            case 72 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:478: CAPSOR
                {
                mCAPSOR(); 

                }
                break;
            case 73 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:485: CAPSAS
                {
                mCAPSAS(); 

                }
                break;
            case 74 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:492: INSERT
                {
                mINSERT(); 

                }
                break;
            case 75 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:499: INTO
                {
                mINTO(); 

                }
                break;
            case 76 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:504: ENTAIL
                {
                mENTAIL(); 

                }
                break;
            case 77 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:511: VALUES
                {
                mVALUES(); 

                }
                break;
            case 78 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:518: CREATE
                {
                mCREATE(); 

                }
                break;
            case 79 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:525: TABLE
                {
                mTABLE(); 

                }
                break;
            case 80 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:531: VIEW
                {
                mVIEW(); 

                }
                break;
            case 81 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:536: INDEX
                {
                mINDEX(); 

                }
                break;
            case 82 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:542: ALTER
                {
                mALTER(); 

                }
                break;
            case 83 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:548: DROP
                {
                mDROP(); 

                }
                break;
            case 84 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:553: UPDATE
                {
                mUPDATE(); 

                }
                break;
            case 85 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:560: SQL_DELETE
                {
                mSQL_DELETE(); 

                }
                break;
            case 86 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:571: DEFAULT
                {
                mDEFAULT(); 

                }
                break;
            case 87 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:579: SORT
                {
                mSORT(); 

                }
                break;
            case 88 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:584: SQL_SET
                {
                mSQL_SET(); 

                }
                break;
            case 89 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:592: CASCADE
                {
                mCASCADE(); 

                }
                break;
            case 90 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:600: CONSTRAINTS
                {
                mCONSTRAINTS(); 

                }
                break;
            case 91 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:612: PURGE
                {
                mPURGE(); 

                }
                break;
            case 92 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:618: FUNCTION
                {
                mFUNCTION(); 

                }
                break;
            case 93 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:627: OPERATOR
                {
                mOPERATOR(); 

                }
                break;
            case 94 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:636: PROCEDURE
                {
                mPROCEDURE(); 

                }
                break;
            case 95 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:646: TRIGGER
                {
                mTRIGGER(); 

                }
                break;
            case 96 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:654: TYPE
                {
                mTYPE(); 

                }
                break;
            case 97 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:659: FORCE
                {
                mFORCE(); 

                }
                break;
            case 98 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:665: VALIDATE
                {
                mVALIDATE(); 

                }
                break;
            case 99 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:674: JOIN
                {
                mJOIN(); 

                }
                break;
            case 100 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:679: ON
                {
                mON(); 

                }
                break;
            case 101 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:682: ORDER
                {
                mORDER(); 

                }
                break;
            case 102 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:688: BY
                {
                mBY(); 

                }
                break;
            case 103 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:691: ASCEND
                {
                mASCEND(); 

                }
                break;
            case 104 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:698: DESCEND
                {
                mDESCEND(); 

                }
                break;
            case 105 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:706: NULLS
                {
                mNULLS(); 

                }
                break;
            case 106 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:712: FIRST
                {
                mFIRST(); 

                }
                break;
            case 107 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:718: LAST
                {
                mLAST(); 

                }
                break;
            case 108 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:723: MAKECONNECT
                {
                mMAKECONNECT(); 

                }
                break;
            case 109 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:735: URL
                {
                mURL(); 

                }
                break;
            case 110 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:739: UNAME
                {
                mUNAME(); 

                }
                break;
            case 111 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:745: PWORD
                {
                mPWORD(); 

                }
                break;
            case 112 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:751: CONTYPE
                {
                mCONTYPE(); 

                }
                break;
            case 113 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:759: AGGREG
                {
                mAGGREG(); 

                }
                break;
            case 114 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:766: LUNBAR
                {
                mLUNBAR(); 

                }
                break;
            case 115 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:773: RUNBAR
                {
                mRUNBAR(); 

                }
                break;
            case 116 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:780: ASPSELECT
                {
                mASPSELECT(); 

                }
                break;
            case 117 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:790: RDFSELECT
                {
                mRDFSELECT(); 

                }
                break;
            case 118 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:800: INTTYPE
                {
                mINTTYPE(); 

                }
                break;
            case 119 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:808: FLOATTYPE
                {
                mFLOATTYPE(); 

                }
                break;
            case 120 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:818: CHARTYPE
                {
                mCHARTYPE(); 

                }
                break;
            case 121 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:827: DATETYPE
                {
                mDATETYPE(); 

                }
                break;
            case 122 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:836: LPAREN
                {
                mLPAREN(); 

                }
                break;
            case 123 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:843: RPAREN
                {
                mRPAREN(); 

                }
                break;
            case 124 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:850: LBRACK
                {
                mLBRACK(); 

                }
                break;
            case 125 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:857: RBRACK
                {
                mRBRACK(); 

                }
                break;
            case 126 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:864: COLON
                {
                mCOLON(); 

                }
                break;
            case 127 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:870: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 128 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:876: SEMI
                {
                mSEMI(); 

                }
                break;
            case 129 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:881: PLUS
                {
                mPLUS(); 

                }
                break;
            case 130 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:886: MINUS
                {
                mMINUS(); 

                }
                break;
            case 131 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:892: STAR
                {
                mSTAR(); 

                }
                break;
            case 132 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:897: SLASH
                {
                mSLASH(); 

                }
                break;
            case 133 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:903: VBAR
                {
                mVBAR(); 

                }
                break;
            case 134 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:908: AMPER
                {
                mAMPER(); 

                }
                break;
            case 135 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:914: LESS
                {
                mLESS(); 

                }
                break;
            case 136 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:919: GREATER
                {
                mGREATER(); 

                }
                break;
            case 137 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:927: ASSIGN
                {
                mASSIGN(); 

                }
                break;
            case 138 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:934: PERCENT
                {
                mPERCENT(); 

                }
                break;
            case 139 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:942: BACKQUOTE
                {
                mBACKQUOTE(); 

                }
                break;
            case 140 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:952: LCURLY
                {
                mLCURLY(); 

                }
                break;
            case 141 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:959: RCURLY
                {
                mRCURLY(); 

                }
                break;
            case 142 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:966: CIRCUMFLEX
                {
                mCIRCUMFLEX(); 

                }
                break;
            case 143 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:977: TILDE
                {
                mTILDE(); 

                }
                break;
            case 144 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:983: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 145 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:989: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 146 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:998: ALT_NOTEQUAL
                {
                mALT_NOTEQUAL(); 

                }
                break;
            case 147 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1011: LESSEQUAL
                {
                mLESSEQUAL(); 

                }
                break;
            case 148 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1021: LEFTSHIFT
                {
                mLEFTSHIFT(); 

                }
                break;
            case 149 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1031: GREATEREQUAL
                {
                mGREATEREQUAL(); 

                }
                break;
            case 150 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1044: RIGHTSHIFT
                {
                mRIGHTSHIFT(); 

                }
                break;
            case 151 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1055: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 152 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1065: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 153 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1076: DOUBLESTAR
                {
                mDOUBLESTAR(); 

                }
                break;
            case 154 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1087: STAREQUAL
                {
                mSTAREQUAL(); 

                }
                break;
            case 155 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1097: DOUBLESLASH
                {
                mDOUBLESLASH(); 

                }
                break;
            case 156 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1109: SLASHEQUAL
                {
                mSLASHEQUAL(); 

                }
                break;
            case 157 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1120: VBAREQUAL
                {
                mVBAREQUAL(); 

                }
                break;
            case 158 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1130: PERCENTEQUAL
                {
                mPERCENTEQUAL(); 

                }
                break;
            case 159 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1143: AMPEREQUAL
                {
                mAMPEREQUAL(); 

                }
                break;
            case 160 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1154: CIRCUMFLEXEQUAL
                {
                mCIRCUMFLEXEQUAL(); 

                }
                break;
            case 161 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1170: LEFTSHIFTEQUAL
                {
                mLEFTSHIFTEQUAL(); 

                }
                break;
            case 162 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1185: RIGHTSHIFTEQUAL
                {
                mRIGHTSHIFTEQUAL(); 

                }
                break;
            case 163 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1201: DOUBLESTAREQUAL
                {
                mDOUBLESTAREQUAL(); 

                }
                break;
            case 164 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1217: DOUBLESLASHEQUAL
                {
                mDOUBLESLASHEQUAL(); 

                }
                break;
            case 165 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1234: DOT
                {
                mDOT(); 

                }
                break;
            case 166 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1238: AT
                {
                mAT(); 

                }
                break;
            case 167 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1241: AND
                {
                mAND(); 

                }
                break;
            case 168 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1245: OR
                {
                mOR(); 

                }
                break;
            case 169 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1248: NOT
                {
                mNOT(); 

                }
                break;
            case 170 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1252: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 171 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1258: LONGINT
                {
                mLONGINT(); 

                }
                break;
            case 172 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1266: INT
                {
                mINT(); 

                }
                break;
            case 173 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1270: COMPLEX
                {
                mCOMPLEX(); 

                }
                break;
            case 174 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1278: NAME
                {
                mNAME(); 

                }
                break;
            case 175 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1283: URLLINK
                {
                mURLLINK(); 

                }
                break;
            case 176 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1291: STRING
                {
                mSTRING(); 

                }
                break;
            case 177 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1298: CONTINUED_LINE
                {
                mCONTINUED_LINE(); 

                }
                break;
            case 178 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1313: NEWLINE
                {
                mNEWLINE(); 

                }
                break;
            case 179 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1321: WS
                {
                mWS(); 

                }
                break;
            case 180 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1324: LEADING_WS
                {
                mLEADING_WS(); 

                }
                break;
            case 181 :
                // /Users/Michael/dev/cs345/jython/jython/grammar/Python.g:1:1335: COMMENT
                {
                mCOMMENT(); 

                }
                break;

        }

    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\126\1\101\1\122\1\103\1\110\1\101\1\122\1\50\2\uffff";
    static final String DFA10_maxS =
        "\1\126\1\101\1\122\1\103\1\110\1\101\1\122\1\62\2\uffff";
    static final String DFA10_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\11\11\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "2951:1: CHARTYPE : ( 'VARCHAR' LPAREN INT RPAREN | 'VARCHAR2' LPAREN INT RPAREN );";
        }
    }
    static final String DFA15_eotS =
        "\3\uffff\1\4\2\uffff";
    static final String DFA15_eofS =
        "\6\uffff";
    static final String DFA15_minS =
        "\1\56\1\uffff\1\56\1\105\2\uffff";
    static final String DFA15_maxS =
        "\1\71\1\uffff\2\145\2\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2";
    static final String DFA15_specialS =
        "\6\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\uffff\12\2",
            "",
            "\1\3\1\uffff\12\2\13\uffff\1\4\37\uffff\1\4",
            "\1\5\37\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "3057:1: FLOAT : ( '.' DIGITS ( Exponent )? | DIGITS '.' Exponent | DIGITS ( '.' ( DIGITS ( Exponent )? )? | Exponent ) );";
        }
    }
    static final String DFA24_eotS =
        "\4\uffff";
    static final String DFA24_eofS =
        "\4\uffff";
    static final String DFA24_minS =
        "\2\56\2\uffff";
    static final String DFA24_maxS =
        "\1\71\1\152\2\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA24_specialS =
        "\4\uffff}>";
    static final String[] DFA24_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\2\1\uffff\12\1\13\uffff\1\2\4\uffff\1\3\32\uffff\1\2\4\uffff"+
            "\1\3",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "3083:1: COMPLEX : ( ( DIGITS )+ ( 'j' | 'J' ) | FLOAT ( 'j' | 'J' ) );";
        }
    }
    static final String DFA28_eotS =
        "\16\uffff";
    static final String DFA28_eofS =
        "\16\uffff";
    static final String DFA28_minS =
        "\1\42\1\uffff\1\42\2\uffff\1\42\10\uffff";
    static final String DFA28_maxS =
        "\1\165\1\uffff\1\162\2\uffff\1\162\10\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\5\1\uffff\1\7\1\13\1\4\1\11\1\2\1\10"+
        "\1\12\1\6";
    static final String DFA28_specialS =
        "\16\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\7\4\uffff\1\7\32\uffff\1\6\17\uffff\1\4\2\uffff\1\5\14\uffff"+
            "\1\3\17\uffff\1\1\2\uffff\1\2",
            "",
            "\1\12\4\uffff\1\12\52\uffff\1\11\37\uffff\1\10",
            "",
            "",
            "\1\15\4\uffff\1\15\52\uffff\1\13\37\uffff\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "3102:9: ( 'r' | 'u' | 'b' | 'ur' | 'R' | 'U' | 'B' | 'UR' | 'uR' | 'Ur' )?";
        }
    }
    static final String DFA56_eotS =
        "\2\uffff\2\4\1\uffff";
    static final String DFA56_eofS =
        "\5\uffff";
    static final String DFA56_minS =
        "\1\11\1\uffff\2\0\1\uffff";
    static final String DFA56_maxS =
        "\1\43\1\uffff\2\uffff\1\uffff";
    static final String DFA56_acceptS =
        "\1\uffff\1\1\2\uffff\1\2";
    static final String DFA56_specialS =
        "\1\2\1\uffff\1\1\1\0\1\uffff}>";
    static final String[] DFA56_transitionS = {
            "\1\1\26\uffff\1\1\2\uffff\1\2",
            "",
            "\12\3\1\1\ufff5\3",
            "\12\3\1\1\ufff5\3",
            ""
    };

    static final short[] DFA56_eot = DFA.unpackEncodedString(DFA56_eotS);
    static final short[] DFA56_eof = DFA.unpackEncodedString(DFA56_eofS);
    static final char[] DFA56_min = DFA.unpackEncodedStringToUnsignedChars(DFA56_minS);
    static final char[] DFA56_max = DFA.unpackEncodedStringToUnsignedChars(DFA56_maxS);
    static final short[] DFA56_accept = DFA.unpackEncodedString(DFA56_acceptS);
    static final short[] DFA56_special = DFA.unpackEncodedString(DFA56_specialS);
    static final short[][] DFA56_transition;

    static {
        int numStates = DFA56_transitionS.length;
        DFA56_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA56_transition[i] = DFA.unpackEncodedString(DFA56_transitionS[i]);
        }
    }

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = DFA56_eot;
            this.eof = DFA56_eof;
            this.min = DFA56_min;
            this.max = DFA56_max;
            this.accept = DFA56_accept;
            this.special = DFA56_special;
            this.transition = DFA56_transition;
        }
        public String getDescription() {
            return "3236:1: COMMENT : ({...}? => ( ' ' | '\\t' )* '#' (~ '\\n' )* ( '\\n' )+ | '#' (~ '\\n' )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_3 = input.LA(1);

                         
                        int index56_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_3=='\n') && ((startPos==0))) {s = 1;}

                        else if ( ((LA56_3>='\u0000' && LA56_3<='\t')||(LA56_3>='\u000B' && LA56_3<='\uFFFF')) ) {s = 3;}

                        else s = 4;

                         
                        input.seek(index56_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_2 = input.LA(1);

                         
                        int index56_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA56_2>='\u0000' && LA56_2<='\t')||(LA56_2>='\u000B' && LA56_2<='\uFFFF')) ) {s = 3;}

                        else if ( (LA56_2=='\n') && ((startPos==0))) {s = 1;}

                        else s = 4;

                         
                        input.seek(index56_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA56_0 = input.LA(1);

                         
                        int index56_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA56_0=='\t'||LA56_0==' ') && ((startPos==0))) {s = 1;}

                        else if ( (LA56_0=='#') ) {s = 2;}

                         
                        input.seek(index56_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\1\uffff\24\102\1\173\1\uffff\1\102\1\uffff\1\u0088\15\102\1\u00ad"+
        "\6\uffff\1\u00af\1\u00b1\1\u00b4\1\u00b7\1\u00b9\1\u00bd\1\u00c0"+
        "\1\u00c2\1\u00c4\3\uffff\1\u00c6\2\uffff\2\102\2\u00cd\1\102\3\uffff"+
        "\1\u00d6\1\uffff\1\u00d8\1\u00da\1\uffff\6\102\1\u00e6\2\102\1\u00ea"+
        "\4\102\1\u00f1\1\102\1\u00f5\13\102\1\u0104\1\102\1\u0106\1\u0107"+
        "\20\102\2\uffff\1\u011d\4\uffff\1\u0120\3\102\4\uffff\1\u0124\4"+
        "\102\1\u012a\12\102\1\u013b\1\u013d\1\102\1\u013f\15\102\10\uffff"+
        "\1\u014f\2\uffff\1\u0151\6\uffff\1\u0153\2\uffff\1\u0155\7\uffff"+
        "\1\u0156\1\102\1\uffff\3\u00cd\4\uffff\1\u0124\1\uffff\1\u00cd\2"+
        "\102\5\uffff\1\u015f\12\102\1\uffff\3\102\1\uffff\4\102\1\u0172"+
        "\1\102\1\uffff\1\u0174\2\102\1\uffff\1\u0177\3\102\1\u017b\1\u017c"+
        "\6\102\1\u0183\1\102\1\uffff\1\102\2\uffff\5\102\1\u018b\11\102"+
        "\1\u0199\3\102\3\uffff\1\u019f\1\u01a0\1\uffff\1\u01a1\2\102\2\uffff"+
        "\4\102\1\uffff\20\102\1\uffff\1\102\1\uffff\1\102\1\uffff\11\102"+
        "\1\u01c4\4\102\11\uffff\1\u01ca\3\u00cd\1\uffff\1\u0124\1\uffff"+
        "\1\u0124\1\uffff\2\102\1\u01d0\2\102\1\u01d3\7\102\1\u01db\2\102"+
        "\1\uffff\1\102\1\uffff\1\102\1\uffff\2\102\1\uffff\3\102\2\uffff"+
        "\1\u01e5\1\u01e6\1\102\1\u01e8\1\102\1\u01ea\1\uffff\3\102\1\u01ee"+
        "\3\102\1\uffff\1\102\1\u01f3\13\102\1\uffff\5\102\3\uffff\1\102"+
        "\1\uffff\1\u0124\1\102\1\u0207\1\u0208\6\102\1\u020f\2\102\1\u0212"+
        "\1\102\1\u0214\2\102\1\u0217\3\102\1\u021b\7\102\1\u0223\1\102\2"+
        "\uffff\1\102\1\u0226\2\102\2\uffff\1\u0124\1\uffff\1\u022b\1\102"+
        "\1\uffff\2\102\1\uffff\4\102\1\u0233\2\102\1\uffff\6\102\1\u023c"+
        "\1\u023d\1\102\2\uffff\1\102\1\uffff\1\102\1\uffff\3\102\1\uffff"+
        "\1\u0244\1\u0245\1\102\1\u0247\1\uffff\1\u0248\1\u0249\1\u024a\10"+
        "\102\1\u0252\1\u0253\1\u0254\3\102\1\u0258\1\u0259\2\uffff\1\u025a"+
        "\5\102\1\uffff\2\102\1\uffff\1\102\1\uffff\2\102\1\uffff\1\102\1"+
        "\u0266\1\102\1\uffff\1\102\1\u0269\1\u026a\4\102\1\uffff\1\102\1"+
        "\u0270\1\uffff\1\u0271\1\102\1\uffff\1\u0124\1\uffff\6\102\1\u0279"+
        "\1\uffff\1\102\1\u027b\2\102\1\u027e\1\102\1\u0174\1\u0280\2\uffff"+
        "\1\102\1\u0282\1\102\1\u0284\1\u0285\1\u0286\2\uffff\1\u0287\4\uffff"+
        "\3\102\1\u028b\3\102\3\uffff\3\102\3\uffff\1\102\1\u0293\1\102\1"+
        "\u0295\1\102\1\u0297\5\102\1\uffff\2\102\2\uffff\1\u029f\1\u02a0"+
        "\2\102\1\u02a3\2\uffff\1\102\1\u02a5\1\u0174\1\102\1\u02a7\1\102"+
        "\1\u02a9\1\uffff\1\102\1\uffff\2\102\1\uffff\1\102\1\uffff\1\102"+
        "\1\uffff\1\u02af\4\uffff\2\102\1\u02b2\1\uffff\1\u02b3\6\102\1\uffff"+
        "\1\102\1\uffff\1\102\1\uffff\1\u02bc\1\u0217\5\102\2\uffff\2\102"+
        "\1\uffff\1\u0217\1\uffff\1\102\1\uffff\1\102\1\uffff\2\102\1\u02c9"+
        "\1\102\1\u02cb\1\uffff\1\u02cc\1\102\2\uffff\3\102\1\u02d1\3\102"+
        "\1\u02d5\1\uffff\1\u02d6\1\u02d7\1\102\1\u02d9\1\u02da\1\u02db\1"+
        "\102\1\uffff\4\102\1\uffff\1\102\2\uffff\2\102\1\u02e3\1\102\1\uffff"+
        "\1\u02e5\2\102\3\uffff\1\u02e8\3\uffff\2\102\1\u02eb\3\102\1\u02ef"+
        "\1\uffff\1\u02f0\1\uffff\2\102\1\uffff\1\u02f3\1\102\1\uffff\1\102"+
        "\1\u02f6\1\u02f7\2\uffff\1\u012a\1\u02f8\1\uffff\1\u02f9\1\u00ea"+
        "\4\uffff";
    static final String DFA57_eofS =
        "\u02fa\uffff";
    static final String DFA57_minS =
        "\1\11\1\101\1\116\1\105\1\42\1\156\1\42\1\154\1\145\1\154\1\151"+
        "\1\154\1\146\2\141\1\42\1\162\1\150\1\151\1\101\1\122\1\75\1\55"+
        "\1\114\1\75\1\56\1\101\1\110\2\101\1\42\1\106\1\111\1\116\1\101"+
        "\1\42\1\117\1\125\1\174\1\75\6\uffff\2\75\1\52\1\57\1\75\1\74\3"+
        "\75\3\uffff\1\75\2\uffff\1\162\1\157\2\56\1\42\3\uffff\1\12\1\uffff"+
        "\2\11\1\uffff\1\120\1\102\1\111\1\120\1\116\1\103\1\60\1\122\1\114"+
        "\1\60\1\116\1\102\1\114\1\117\1\60\1\107\1\60\1\144\1\145\1\141"+
        "\1\156\1\146\1\151\1\143\1\156\1\157\1\162\1\157\1\60\1\160\2\60"+
        "\1\155\1\163\2\151\1\164\1\171\1\151\1\164\1\145\1\101\1\116\1\105"+
        "\1\123\1\111\1\122\1\117\2\uffff\1\56\4\uffff\1\60\1\104\1\124\1"+
        "\107\4\uffff\1\60\1\115\1\123\1\124\1\105\1\60\1\114\1\113\1\104"+
        "\1\116\1\123\1\117\1\103\1\124\1\101\1\106\2\60\1\105\1\60\1\117"+
        "\1\116\2\122\1\124\1\114\1\105\1\104\1\42\1\101\1\42\1\111\1\114"+
        "\10\uffff\1\75\2\uffff\1\75\6\uffff\1\75\2\uffff\1\75\7\uffff\1"+
        "\60\1\164\3\60\1\56\3\uffff\1\56\1\60\1\53\1\56\2\42\2\uffff\1\0"+
        "\1\uffff\1\0\1\60\1\114\1\107\1\105\1\131\2\105\1\124\1\114\2\105"+
        "\1\uffff\1\111\1\126\1\124\1\uffff\1\107\1\103\1\50\1\105\1\60\1"+
        "\114\1\uffff\1\60\1\111\1\145\1\uffff\1\60\1\141\1\163\1\164\2\60"+
        "\1\146\2\145\1\143\1\141\1\155\1\60\1\142\1\uffff\1\157\2\uffff"+
        "\1\142\1\163\1\156\1\163\1\165\1\60\1\154\1\150\1\154\1\101\1\123"+
        "\2\116\1\101\1\103\1\60\1\116\1\107\1\122\3\uffff\2\60\1\uffff\1"+
        "\60\1\105\1\50\1\uffff\1\53\1\111\1\124\1\110\1\122\1\uffff\1\124"+
        "\1\50\1\105\1\111\1\50\1\124\1\120\1\105\1\101\1\103\1\111\1\105"+
        "\1\125\1\122\1\114\1\123\1\uffff\1\105\1\uffff\1\122\1\uffff\1\115"+
        "\2\103\1\123\1\101\1\111\1\103\1\127\1\101\1\40\1\115\1\116\1\114"+
        "\1\105\11\uffff\4\60\1\53\3\60\1\uffff\1\105\1\107\1\60\1\111\1"+
        "\107\1\60\1\122\1\111\1\125\1\122\1\130\1\116\1\105\1\60\2\114\1"+
        "\uffff\1\103\1\uffff\1\105\1\uffff\1\116\1\162\1\uffff\1\153\1\163"+
        "\1\151\2\uffff\2\60\1\160\1\60\1\154\1\60\1\uffff\1\141\1\162\1"+
        "\144\1\60\1\164\1\145\1\162\1\uffff\1\145\1\60\1\144\1\122\1\123"+
        "\2\124\1\131\2\124\1\101\1\123\1\105\1\uffff\1\124\1\105\1\104\1"+
        "\120\1\105\3\uffff\1\122\2\60\1\124\1\50\1\60\1\105\1\111\1\101"+
        "\1\103\1\106\1\111\1\60\1\124\1\125\1\60\1\115\1\60\2\111\1\60\1"+
        "\105\1\122\1\101\1\60\1\124\1\105\1\124\1\111\1\105\1\104\1\110"+
        "\1\60\1\124\2\uffff\1\105\1\60\1\123\1\122\1\uffff\2\60\1\53\1\60"+
        "\1\105\1\uffff\1\116\1\105\1\uffff\1\123\1\101\1\104\1\124\1\60"+
        "\1\107\1\122\1\uffff\1\105\1\101\1\124\1\101\1\124\1\164\2\60\1"+
        "\156\2\uffff\1\164\1\uffff\1\154\1\uffff\1\154\1\164\1\141\1\uffff"+
        "\2\60\1\156\1\60\1\uffff\3\60\1\131\1\122\1\120\1\50\1\105\1\104"+
        "\1\105\1\104\3\60\1\105\1\101\1\114\2\60\2\uffff\1\60\1\126\1\114"+
        "\1\117\1\131\1\116\1\uffff\1\105\1\114\1\uffff\1\101\1\uffff\1\122"+
        "\1\105\1\uffff\1\114\1\60\1\124\1\uffff\1\111\1\60\1\50\1\114\1"+
        "\123\2\101\1\uffff\1\105\1\60\1\uffff\1\60\1\111\2\60\1\uffff\1"+
        "\122\1\124\1\122\1\105\1\114\1\105\1\60\1\uffff\1\104\1\60\1\126"+
        "\1\123\1\60\1\116\2\60\2\uffff\1\165\1\60\1\171\3\60\2\uffff\1\60"+
        "\4\uffff\1\120\1\101\1\105\1\60\1\105\1\114\1\125\3\uffff\1\114"+
        "\1\124\1\105\3\uffff\1\101\1\60\1\116\1\60\1\103\1\60\1\124\1\114"+
        "\1\105\1\126\1\105\1\uffff\2\117\2\uffff\2\60\1\124\1\122\1\60\2"+
        "\uffff\1\103\2\60\1\104\1\60\1\126\1\60\1\uffff\1\101\1\uffff\1"+
        "\101\1\123\1\uffff\1\104\1\uffff\1\145\1\uffff\1\60\4\uffff\1\105"+
        "\1\111\1\60\1\uffff\1\60\1\105\1\122\1\105\1\110\1\103\1\114\1\uffff"+
        "\1\116\1\uffff\1\124\1\uffff\2\60\1\104\1\105\1\103\1\122\1\116"+
        "\2\uffff\1\105\1\50\1\uffff\1\60\1\uffff\1\101\1\uffff\1\101\1\uffff"+
        "\1\124\1\114\1\60\1\101\1\60\1\uffff\1\60\1\116\2\uffff\1\103\1"+
        "\105\1\103\1\60\1\124\1\125\1\105\1\60\1\uffff\2\60\1\124\3\60\1"+
        "\50\1\uffff\1\124\1\114\1\101\1\125\1\uffff\1\124\2\uffff\2\124"+
        "\1\60\1\124\1\uffff\1\60\1\105\1\103\3\uffff\1\60\3\uffff\1\101"+
        "\1\125\1\60\1\105\1\101\1\123\1\60\1\uffff\1\60\1\uffff\1\104\1"+
        "\124\1\uffff\1\60\1\105\1\uffff\1\104\2\60\2\uffff\2\60\1\uffff"+
        "\2\60\4\uffff";
    static final String DFA57_maxS =
        "\1\176\1\131\1\123\1\126\1\131\1\163\1\162\1\157\1\145\1\170\1\162"+
        "\1\154\1\163\1\141\1\162\1\145\1\162\2\151\1\122\1\127\1\75\1\133"+
        "\1\126\1\173\1\71\2\111\1\126\1\122\1\105\1\122\1\125\1\116\1\111"+
        "\1\162\1\117\1\125\1\174\1\137\6\uffff\5\75\2\76\2\75\3\uffff\1"+
        "\75\2\uffff\1\162\1\157\1\170\1\154\1\162\3\uffff\1\15\1\uffff\2"+
        "\43\1\uffff\1\120\1\102\1\111\1\120\1\116\1\126\1\172\2\122\1\172"+
        "\1\116\1\115\1\124\1\117\1\172\1\124\1\172\1\144\1\145\1\141\1\156"+
        "\1\154\1\163\1\145\1\156\1\157\1\162\1\157\1\172\1\160\2\172\1\155"+
        "\1\163\2\151\1\164\1\171\1\151\1\164\1\145\1\105\1\125\1\105\1\123"+
        "\1\117\1\122\1\117\2\uffff\1\76\4\uffff\1\172\1\104\1\124\1\107"+
        "\4\uffff\1\152\1\115\1\123\1\124\1\105\1\172\1\114\1\130\1\104\1"+
        "\116\1\123\1\117\1\123\2\124\1\106\2\172\1\105\1\172\1\117\1\116"+
        "\2\122\1\124\1\122\1\105\1\104\1\114\1\101\1\47\1\111\1\115\10\uffff"+
        "\1\75\2\uffff\1\75\6\uffff\1\75\2\uffff\1\75\7\uffff\1\172\1\164"+
        "\1\146\3\154\3\uffff\2\152\1\71\1\154\2\47\2\uffff\1\0\1\uffff\1"+
        "\0\1\172\1\114\1\107\1\105\1\131\1\117\1\105\1\124\1\114\2\105\1"+
        "\uffff\1\111\1\126\1\124\1\uffff\1\107\1\103\1\50\1\105\1\172\1"+
        "\114\1\uffff\1\172\1\111\1\145\1\uffff\1\172\1\141\1\163\1\164\2"+
        "\172\1\146\2\145\1\143\1\141\1\155\1\172\1\142\1\uffff\1\157\2\uffff"+
        "\1\142\1\163\1\156\1\163\1\165\1\172\1\154\1\150\1\154\1\101\1\123"+
        "\1\124\1\116\1\101\1\103\1\172\1\116\1\107\1\122\3\uffff\2\172\1"+
        "\uffff\1\172\1\105\1\50\1\uffff\1\71\1\111\1\124\1\110\1\122\1\uffff"+
        "\1\124\1\126\1\105\1\111\1\50\1\124\1\120\1\105\1\101\1\103\1\111"+
        "\1\105\1\125\1\122\1\114\1\123\1\uffff\1\105\1\uffff\1\122\1\uffff"+
        "\1\115\2\103\1\123\1\101\1\125\1\103\1\127\1\101\1\172\1\115\1\116"+
        "\1\114\1\105\11\uffff\1\172\3\154\1\71\1\152\1\71\1\152\1\uffff"+
        "\1\105\1\107\1\172\1\111\1\107\1\172\1\122\1\111\1\125\1\122\1\130"+
        "\1\116\1\105\1\172\2\114\1\uffff\1\103\1\uffff\1\105\1\uffff\1\116"+
        "\1\162\1\uffff\1\153\1\163\1\151\2\uffff\2\172\1\160\1\172\1\154"+
        "\1\172\1\uffff\1\141\1\162\1\144\1\172\1\164\1\145\1\162\1\uffff"+
        "\1\145\1\172\1\144\1\122\1\123\2\124\1\131\2\124\1\101\1\123\1\105"+
        "\1\uffff\1\124\1\105\1\104\1\123\1\105\3\uffff\1\122\1\71\1\152"+
        "\1\124\2\172\1\105\1\111\1\101\1\103\1\106\1\111\1\172\1\124\1\125"+
        "\1\172\1\115\1\172\2\111\1\172\1\105\1\122\1\101\1\172\1\124\1\105"+
        "\1\124\1\111\1\105\1\104\1\110\1\172\1\124\2\uffff\1\105\1\172\1"+
        "\123\1\122\1\uffff\1\71\1\152\1\71\1\172\1\105\1\uffff\1\116\1\105"+
        "\1\uffff\1\123\1\101\1\104\1\124\1\172\1\107\1\122\1\uffff\1\105"+
        "\1\101\1\124\1\101\1\124\1\164\2\172\1\156\2\uffff\1\164\1\uffff"+
        "\1\154\1\uffff\1\154\1\164\1\141\1\uffff\2\172\1\156\1\172\1\uffff"+
        "\3\172\1\131\1\122\1\120\1\50\1\105\1\104\1\105\1\104\3\172\1\105"+
        "\1\101\1\114\2\172\2\uffff\1\172\1\126\1\114\1\117\1\131\1\116\1"+
        "\uffff\1\105\1\114\1\uffff\1\101\1\uffff\1\122\1\105\1\uffff\1\114"+
        "\1\172\1\124\1\uffff\1\111\2\172\1\114\1\123\2\101\1\uffff\1\105"+
        "\1\172\1\uffff\1\172\1\111\1\71\1\152\1\uffff\1\122\1\124\1\122"+
        "\1\105\1\114\1\105\1\172\1\uffff\1\104\1\172\1\126\1\123\1\172\1"+
        "\116\2\172\2\uffff\1\165\1\172\1\171\3\172\2\uffff\1\172\4\uffff"+
        "\1\120\1\101\1\105\1\172\1\105\1\114\1\125\3\uffff\1\114\1\124\1"+
        "\105\3\uffff\1\101\1\172\1\116\1\172\1\103\1\172\1\124\1\114\1\105"+
        "\1\126\1\105\1\uffff\2\117\2\uffff\2\172\1\124\1\122\1\172\2\uffff"+
        "\1\103\2\172\1\104\1\172\1\126\1\172\1\uffff\1\101\1\uffff\1\101"+
        "\1\123\1\uffff\1\104\1\uffff\1\145\1\uffff\1\172\4\uffff\1\105\1"+
        "\111\1\172\1\uffff\1\172\1\105\1\122\1\105\1\110\1\103\1\114\1\uffff"+
        "\1\116\1\uffff\1\124\1\uffff\2\172\1\104\1\105\1\103\1\122\1\116"+
        "\2\uffff\1\105\1\62\1\uffff\1\172\1\uffff\1\101\1\uffff\1\101\1"+
        "\uffff\1\124\1\114\1\172\1\101\1\172\1\uffff\1\172\1\116\2\uffff"+
        "\1\103\1\105\1\103\1\172\1\124\1\125\1\105\1\172\1\uffff\2\172\1"+
        "\124\3\172\1\50\1\uffff\1\124\1\114\1\101\1\125\1\uffff\1\124\2"+
        "\uffff\2\124\1\172\1\124\1\uffff\1\172\1\105\1\103\3\uffff\1\172"+
        "\3\uffff\1\101\1\125\1\172\1\105\1\101\1\123\1\172\1\uffff\1\172"+
        "\1\uffff\1\104\1\124\1\uffff\1\172\1\105\1\uffff\1\104\2\172\2\uffff"+
        "\2\172\1\uffff\2\172\4\uffff";
    static final String DFA57_acceptS =
        "\50\uffff\1\172\1\173\1\174\1\175\1\177\1\u0080\11\uffff\1\u008b"+
        "\1\u008c\1\u008d\1\uffff\1\u008f\1\u00a6\5\uffff\1\u00ae\1\u00b0"+
        "\1\u00b1\1\uffff\1\u00b2\2\uffff\1\u00b5\60\uffff\1\43\1\176\1\uffff"+
        "\1\45\1\47\1\56\1\57\4\uffff\1\54\1\u0091\1\55\1\u00a5\41\uffff"+
        "\1\162\1\163\1\u009d\1\u0085\1\u0097\1\u0081\1\u0098\1\u0082\1\uffff"+
        "\1\u009a\1\u0083\1\uffff\1\u009c\1\u0084\1\u009f\1\u0086\1\u0092"+
        "\1\u0093\1\uffff\1\u0087\1\u0095\1\uffff\1\u0088\1\u0090\1\u0089"+
        "\1\u009e\1\u008a\1\u00a0\1\u008e\6\uffff\1\u00ac\1\u00ab\1\u00ad"+
        "\6\uffff\1\u00b3\1\u00b5\1\uffff\1\u00b4\14\uffff\1\70\3\uffff\1"+
        "\65\6\uffff\1\146\3\uffff\1\5\16\uffff\1\23\1\uffff\1\25\1\26\23"+
        "\uffff\1\44\1\52\1\46\2\uffff\1\111\3\uffff\1\u00aa\5\uffff\1\66"+
        "\20\uffff\1\100\1\uffff\1\110\1\uffff\1\144\16\uffff\1\u00a3\1\u0099"+
        "\1\u00a4\1\u009b\1\u00a1\1\u0094\1\u00a2\1\u0096\1\u00a8\10\uffff"+
        "\1\1\20\uffff\1\161\1\uffff\1\130\1\uffff\1\166\2\uffff\1\u00a7"+
        "\3\uffff\1\12\1\13\6\uffff\1\21\7\uffff\1\35\15\uffff\1\42\5\uffff"+
        "\1\51\1\147\1\107\42\uffff\1\155\1\u00af\4\uffff\1\u00a9\5\uffff"+
        "\1\140\2\uffff\1\113\7\uffff\1\127\11\uffff\1\14\1\30\1\uffff\1"+
        "\16\1\uffff\1\20\3\uffff\1\31\4\uffff\1\37\23\uffff\1\153\1\64\6"+
        "\uffff\1\123\2\uffff\1\150\1\uffff\1\171\2\uffff\1\167\3\uffff\1"+
        "\105\7\uffff\1\120\2\uffff\1\143\4\uffff\1\117\7\uffff\1\121\10"+
        "\uffff\1\7\1\10\6\uffff\1\32\1\33\1\uffff\1\36\1\40\1\41\1\73\7"+
        "\uffff\1\53\1\133\1\157\3\uffff\1\122\1\63\1\106\13\uffff\1\145"+
        "\2\uffff\1\141\1\152\5\uffff\1\156\1\151\7\uffff\1\112\1\uffff\1"+
        "\62\2\uffff\1\104\1\uffff\1\6\1\uffff\1\15\1\uffff\1\22\1\24\1\27"+
        "\1\34\3\uffff\1\116\7\uffff\1\72\1\uffff\1\77\1\uffff\1\125\7\uffff"+
        "\1\114\1\115\2\uffff\1\124\1\uffff\1\137\1\uffff\1\67\1\uffff\1"+
        "\102\5\uffff\1\17\2\uffff\1\160\1\131\10\uffff\1\126\7\uffff\1\170"+
        "\4\uffff\1\74\1\uffff\1\11\1\103\4\uffff\1\61\3\uffff\1\71\1\75"+
        "\1\101\1\uffff\1\135\1\134\1\142\7\uffff\1\136\1\uffff\1\164\2\uffff"+
        "\1\165\2\uffff\1\3\3\uffff\1\50\1\60\2\uffff\1\2\2\uffff\1\4\1\132"+
        "\1\154\1\76";
    static final String DFA57_specialS =
        "\1\3\104\uffff\1\2\1\uffff\1\4\1\5\u008f\uffff\1\0\1\uffff\1\1\u021f"+
        "\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\110\1\106\1\uffff\1\105\1\106\22\uffff\1\107\1\30\1\103\1"+
            "\111\1\uffff\1\66\1\62\1\103\1\50\1\51\1\60\1\56\1\54\1\57\1"+
            "\31\1\61\1\77\11\100\1\25\1\55\1\63\1\65\1\64\1\26\1\74\1\27"+
            "\1\4\1\23\1\35\1\41\1\40\2\102\1\2\1\44\1\102\1\32\1\34\1\45"+
            "\1\37\1\24\1\102\1\36\1\3\1\1\1\43\1\42\1\33\3\102\1\52\1\104"+
            "\1\53\1\72\1\46\1\67\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\102\1"+
            "\14\2\102\1\15\1\102\1\76\1\75\1\16\1\102\1\17\1\102\1\20\1"+
            "\101\1\102\1\21\1\102\1\22\1\102\1\70\1\47\1\71\1\73",
            "\1\113\7\uffff\1\116\5\uffff\1\112\2\uffff\1\114\6\uffff\1"+
            "\115",
            "\1\117\4\uffff\1\120",
            "\1\126\3\uffff\1\124\5\uffff\1\122\4\uffff\1\121\1\125\1\123",
            "\1\103\4\uffff\1\103\41\uffff\1\131\5\uffff\1\127\11\uffff"+
            "\1\130",
            "\1\133\4\uffff\1\132",
            "\1\103\4\uffff\1\103\112\uffff\1\134",
            "\1\135\2\uffff\1\136",
            "\1\137",
            "\1\140\13\uffff\1\141",
            "\1\142\5\uffff\1\144\2\uffff\1\143",
            "\1\145",
            "\1\146\6\uffff\1\147\1\150\4\uffff\1\151",
            "\1\152",
            "\1\153\20\uffff\1\154",
            "\1\103\4\uffff\1\103\71\uffff\1\155\3\uffff\1\156",
            "\1\157",
            "\1\160\1\161",
            "\1\162",
            "\1\166\12\uffff\1\163\2\uffff\1\164\2\uffff\1\165",
            "\1\167\2\uffff\1\170\1\uffff\1\171",
            "\1\172",
            "\1\174\16\uffff\1\177\1\uffff\1\176\1\uffff\1\u0080\32\uffff"+
            "\1\175",
            "\1\u0083\1\uffff\1\u0082\4\uffff\1\u0081\2\uffff\1\u0084",
            "\1\u0086\75\uffff\1\u0085",
            "\1\u0087\1\uffff\12\u0089",
            "\1\u008b\7\uffff\1\u008a",
            "\1\u008d\1\u008c",
            "\1\u0090\7\uffff\1\u0092\5\uffff\1\u0091\5\uffff\1\u008f\1"+
            "\u008e",
            "\1\u0096\3\uffff\1\u0095\3\uffff\1\u0093\10\uffff\1\u0094",
            "\1\103\4\uffff\1\103\34\uffff\1\u0098\1\u0097",
            "\1\u0099\7\uffff\1\u009c\1\uffff\1\u009b\1\uffff\1\u009a",
            "\1\u00a0\5\uffff\1\u009f\2\uffff\1\u009d\2\uffff\1\u009e",
            "\1\u00a1",
            "\1\u00a2\7\uffff\1\u00a3",
            "\1\103\4\uffff\1\103\46\uffff\1\u00a6\1\uffff\1\u00a4\1\uffff"+
            "\1\u00a5\37\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ac\41\uffff\1\u00ab",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ae",
            "\1\u00b0",
            "\1\u00b2\22\uffff\1\u00b3",
            "\1\u00b5\15\uffff\1\u00b6",
            "\1\u00b8",
            "\1\u00bc\1\u00bb\1\u00ba",
            "\1\u00be\1\u00bf",
            "\1\u00c1",
            "\1\u00c3",
            "",
            "",
            "",
            "\1\u00c5",
            "",
            "",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00d1\1\uffff\10\u00cc\2\u00d0\10\uffff\1\u00cb\2\uffff"+
            "\1\u00d2\4\uffff\1\u00cf\1\uffff\1\u00ce\2\uffff\1\u00ca\10"+
            "\uffff\1\u00c9\11\uffff\1\u00cb\2\uffff\1\u00d2\4\uffff\1\u00cf"+
            "\1\uffff\1\u00ce\2\uffff\1\u00ca\10\uffff\1\u00c9",
            "\1\u00d1\1\uffff\12\u00d3\13\uffff\1\u00d2\4\uffff\1\u00cf"+
            "\1\uffff\1\u00ce\30\uffff\1\u00d2\4\uffff\1\u00cf\1\uffff\1"+
            "\u00ce",
            "\1\103\4\uffff\1\103\52\uffff\1\u00d5\37\uffff\1\u00d4",
            "",
            "",
            "",
            "\1\106\2\uffff\1\106",
            "",
            "\1\110\1\u00d9\1\uffff\1\u00d6\1\u00d9\22\uffff\1\107\2\uffff"+
            "\1\u00d7",
            "\1\110\1\u00d9\1\uffff\1\u00d6\1\u00d9\22\uffff\1\107\2\uffff"+
            "\1\u00d7",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e3\1\u00e5\4\uffff\1\u00e2\11\uffff\1\u00e4\1\u00e0\1"+
            "\uffff\1\u00e1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00e7",
            "\1\u00e8\5\uffff\1\u00e9",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00eb",
            "\1\u00ec\12\uffff\1\u00ed",
            "\1\u00ee\7\uffff\1\u00ef",
            "\1\u00f0",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u00f3\14\uffff\1\u00f2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\22\102\1\u00f4"+
            "\7\102",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa\5\uffff\1\u00fb",
            "\1\u00fc\11\uffff\1\u00fd",
            "\1\u00fe\1\uffff\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0105",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0112\3\uffff\1\u0111",
            "\1\u0113\6\uffff\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\u0118\5\uffff\1\u0117",
            "\1\u0119",
            "\1\u011a",
            "",
            "",
            "\1\u011c\17\uffff\1\u011b",
            "",
            "",
            "",
            "",
            "\12\102\7\uffff\2\102\1\u011f\14\102\1\u011e\12\102\4\uffff"+
            "\1\102\1\uffff\32\102",
            "\1\u0121",
            "\1\u0122",
            "\1\u0123",
            "",
            "",
            "",
            "",
            "\12\u0089\13\uffff\1\u0125\4\uffff\1\u00cf\32\uffff\1\u0125"+
            "\4\uffff\1\u00cf",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u012b",
            "\1\u012d\14\uffff\1\u012c",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0135\2\uffff\1\u0133\5\uffff\1\u0132\6\uffff\1\u0134",
            "\1\u0136",
            "\1\u0139\17\uffff\1\u0137\2\uffff\1\u0138",
            "\1\u013a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\3\102\1\u013c\26\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u013e",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145\5\uffff\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\103\4\uffff\1\103\44\uffff\1\u0149",
            "\1\u014a",
            "\1\103\4\uffff\1\103",
            "\1\u014b",
            "\1\u014c\1\u014d",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u014e",
            "",
            "",
            "\1\u0150",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0152",
            "",
            "",
            "\1\u0154",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0157",
            "\12\u0158\7\uffff\6\u0158\32\uffff\6\u0158",
            "\10\u0159\24\uffff\1\u00ce\37\uffff\1\u00ce",
            "\2\u015a\32\uffff\1\u00ce\37\uffff\1\u00ce",
            "\1\u00d1\1\uffff\10\u00cc\2\u00d0\13\uffff\1\u00d2\4\uffff"+
            "\1\u00cf\1\uffff\1\u00ce\30\uffff\1\u00d2\4\uffff\1\u00cf\1"+
            "\uffff\1\u00ce",
            "",
            "",
            "",
            "\1\u00d1\1\uffff\12\u00d0\13\uffff\1\u00d2\4\uffff\1\u00cf"+
            "\32\uffff\1\u00d2\4\uffff\1\u00cf",
            "\12\u015c\13\uffff\1\u015b\4\uffff\1\u00cf\32\uffff\1\u015b"+
            "\4\uffff\1\u00cf",
            "\1\u015d\1\uffff\1\u015d\2\uffff\12\u015e",
            "\1\u00d1\1\uffff\12\u00d3\13\uffff\1\u00d2\4\uffff\1\u00cf"+
            "\1\uffff\1\u00ce\30\uffff\1\u00d2\4\uffff\1\u00cf\1\uffff\1"+
            "\u00ce",
            "\1\103\4\uffff\1\103",
            "\1\103\4\uffff\1\103",
            "",
            "",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164\11\uffff\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0173",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0175",
            "\1\u0176",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0184",
            "",
            "\1\u0185",
            "",
            "",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191\4\uffff\1\u0192\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\12\102\7\uffff\2\102\1\u0198\27\102\4\uffff\1\u0197\1\uffff"+
            "\32\102",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "",
            "",
            "\12\102\7\uffff\22\102\1\u019e\7\102\4\uffff\1\u019d\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01a2",
            "\1\u0170",
            "",
            "\1\u01a3\1\uffff\1\u01a3\2\uffff\12\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u0170\55\uffff\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u0170",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "",
            "\1\u01b8",
            "",
            "\1\u01b9",
            "",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01c0\13\uffff\1\u01bf",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c5\17\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\u0158\7\uffff\6\u0158\5\uffff\1\u00ce\24\uffff\6\u0158"+
            "\5\uffff\1\u00ce",
            "\10\u0159\24\uffff\1\u00ce\37\uffff\1\u00ce",
            "\2\u015a\32\uffff\1\u00ce\37\uffff\1\u00ce",
            "\1\u01cb\1\uffff\1\u01cb\2\uffff\12\u01cc",
            "\12\u015c\13\uffff\1\u01cd\4\uffff\1\u00cf\32\uffff\1\u01cd"+
            "\4\uffff\1\u00cf",
            "\12\u015e",
            "\12\u015e\20\uffff\1\u00cf\37\uffff\1\u00cf",
            "",
            "\1\u01ce",
            "\1\u01cf",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01d1",
            "\1\u01d2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de",
            "",
            "\1\u01df",
            "",
            "\1\u01e0",
            "\1\u01e1",
            "",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01e7",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01e9",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01ef",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\u01fe",
            "",
            "\1\u01ff",
            "\1\u0200",
            "\1\u0201",
            "\1\u0203\2\uffff\1\u0202",
            "\1\u0204",
            "",
            "",
            "",
            "\1\u0205",
            "\12\u01a4",
            "\12\u01a4\20\uffff\1\u00cf\37\uffff\1\u00cf",
            "\1\u0206",
            "\1\u0170\7\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0209",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0210",
            "\1\u0211",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0213",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0215",
            "\1\u0216",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0224",
            "",
            "",
            "\1\u0225",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0227",
            "\1\u0228",
            "",
            "\12\u01cc",
            "\12\u01cc\20\uffff\1\u00cf\37\uffff\1\u00cf",
            "\1\u0229\1\uffff\1\u0229\2\uffff\12\u022a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u022c",
            "",
            "\1\u022d",
            "\1\u022e",
            "",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\1\u0232",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0234",
            "\1\u0235",
            "",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "\1\u0239",
            "\1\u023a",
            "\1\u023b",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u023e",
            "",
            "",
            "\1\u023f",
            "",
            "\1\u0240",
            "",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0246",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u024b",
            "\1\u024c",
            "\1\u024d",
            "\1\u0170",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "\1\u0251",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0255",
            "\1\u0256",
            "\1\u0257",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f",
            "",
            "\1\u0260",
            "\1\u0261",
            "",
            "\1\u0262",
            "",
            "\1\u0263",
            "\1\u0264",
            "",
            "\1\u0265",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0267",
            "",
            "\1\u0268",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0170\7\uffff\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff"+
            "\32\102",
            "\1\u026b",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "",
            "\1\u026f",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0272",
            "\12\u022a",
            "\12\u022a\20\uffff\1\u00cf\37\uffff\1\u00cf",
            "",
            "\1\u0273",
            "\1\u0274",
            "\1\u0275",
            "\1\u0276",
            "\1\u0277",
            "\1\u0278",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u027a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u027c",
            "\1\u027d",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u027f",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\u0281",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0283",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "",
            "",
            "",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "",
            "",
            "",
            "\1\u0292",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0294",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0296",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u0298",
            "\1\u0299",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "",
            "\1\u029d",
            "\1\u029e",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02a1",
            "\1\u02a2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\1\u02a4",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02a6",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02a8",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u02aa",
            "",
            "\1\u02ab",
            "\1\u02ac",
            "",
            "\1\u02ad",
            "",
            "\1\u02ae",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "",
            "\1\u02b0",
            "\1\u02b1",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02b4",
            "\1\u02b5",
            "\1\u02b6",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "",
            "\1\u02ba",
            "",
            "\1\u02bb",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02bd",
            "\1\u02be",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1",
            "",
            "",
            "\1\u02c2",
            "\1\u02c4\11\uffff\1\u02c3",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u02c5",
            "",
            "\1\u02c6",
            "",
            "\1\u02c7",
            "\1\u02c8",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02ca",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02cd",
            "",
            "",
            "\1\u02ce",
            "\1\u02cf",
            "\1\u02d0",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02d2",
            "\1\u02d3",
            "\1\u02d4",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02d8",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02c4",
            "",
            "\1\u02dc",
            "\1\u02dd",
            "\1\u02de",
            "\1\u02df",
            "",
            "\1\u02e0",
            "",
            "",
            "\1\u02e1",
            "\1\u02e2",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02e4",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02e6",
            "\1\u02e7",
            "",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            "\1\u02e9",
            "\1\u02ea",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02ec",
            "\1\u02ed",
            "\1\u02ee",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\1\u02f1",
            "\1\u02f2",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\1\u02f4",
            "",
            "\1\u02f5",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "\12\102\7\uffff\32\102\4\uffff\1\102\1\uffff\32\102",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__189 | T__190 | T__191 | T__192 | AS | ASSERT | BREAK | CLASS | CONTINUE | DEF | DELETE | ELIF | EXCEPT | EXEC | FINALLY | FROM | FOR | GLOBAL | IF | IMPORT | IN | IS | LAMBDA | ORELSE | PASS | PRINT | RAISE | RETURN | TRY | WHILE | WITH | YIELD | CLEAR | PRO | PRIMP | PRIO | PRLO | PRQO | PRSO | PRO_SELECT | ASP | ASPBLANKQ | ASPPRINTDB | ASPLC | ASPDOTDOT | REG_FACT | GROUP_FACT | ASP_SELECT | ASP_PATH | SOLVER | LIMIT | CAPSWITH | SV | MV | INVERSE | CAPSIS | DISTINCT | MAXVAL | CAPSCLASS | SUBCLASS | REQD | INITVAL | MODIFY | OF | RETRIEVE | INCLUDE | CTYPE | SELECT | CAPSFROM | WHERE | CAPSAND | CAPSOR | CAPSAS | INSERT | INTO | ENTAIL | VALUES | CREATE | TABLE | VIEW | INDEX | ALTER | DROP | UPDATE | SQL_DELETE | DEFAULT | SORT | SQL_SET | CASCADE | CONSTRAINTS | PURGE | FUNCTION | OPERATOR | PROCEDURE | TRIGGER | TYPE | FORCE | VALIDATE | JOIN | ON | ORDER | BY | ASCEND | DESCEND | NULLS | FIRST | LAST | MAKECONNECT | URL | UNAME | PWORD | CONTYPE | AGGREG | LUNBAR | RUNBAR | ASPSELECT | RDFSELECT | INTTYPE | FLOATTYPE | CHARTYPE | DATETYPE | LPAREN | RPAREN | LBRACK | RBRACK | COLON | COMMA | SEMI | PLUS | MINUS | STAR | SLASH | VBAR | AMPER | LESS | GREATER | ASSIGN | PERCENT | BACKQUOTE | LCURLY | RCURLY | CIRCUMFLEX | TILDE | EQUAL | NOTEQUAL | ALT_NOTEQUAL | LESSEQUAL | LEFTSHIFT | GREATEREQUAL | RIGHTSHIFT | PLUSEQUAL | MINUSEQUAL | DOUBLESTAR | STAREQUAL | DOUBLESLASH | SLASHEQUAL | VBAREQUAL | PERCENTEQUAL | AMPEREQUAL | CIRCUMFLEXEQUAL | LEFTSHIFTEQUAL | RIGHTSHIFTEQUAL | DOUBLESTAREQUAL | DOUBLESLASHEQUAL | DOT | AT | AND | OR | NOT | FLOAT | LONGINT | INT | COMPLEX | NAME | URLLINK | STRING | CONTINUED_LINE | NEWLINE | WS | LEADING_WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_216 = input.LA(1);

                         
                        int index57_216 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos>0)) ) {s = 214;}

                        else if ( ((((startPos==0)&&(implicitLineJoiningLevel>0))||(startPos==0))) ) {s = 217;}

                         
                        input.seek(index57_216);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA57_218 = input.LA(1);

                         
                        int index57_218 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((startPos>0)) ) {s = 214;}

                        else if ( ((((startPos==0)&&(implicitLineJoiningLevel>0))||(startPos==0))) ) {s = 217;}

                         
                        input.seek(index57_218);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA57_69 = input.LA(1);

                         
                        int index57_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_69=='\n'||LA57_69=='\r') ) {s = 70;}

                        else s = 214;

                         
                        input.seek(index57_69);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_0=='T') ) {s = 1;}

                        else if ( (LA57_0=='I') ) {s = 2;}

                        else if ( (LA57_0=='S') ) {s = 3;}

                        else if ( (LA57_0=='B') ) {s = 4;}

                        else if ( (LA57_0=='a') ) {s = 5;}

                        else if ( (LA57_0=='b') ) {s = 6;}

                        else if ( (LA57_0=='c') ) {s = 7;}

                        else if ( (LA57_0=='d') ) {s = 8;}

                        else if ( (LA57_0=='e') ) {s = 9;}

                        else if ( (LA57_0=='f') ) {s = 10;}

                        else if ( (LA57_0=='g') ) {s = 11;}

                        else if ( (LA57_0=='i') ) {s = 12;}

                        else if ( (LA57_0=='l') ) {s = 13;}

                        else if ( (LA57_0=='p') ) {s = 14;}

                        else if ( (LA57_0=='r') ) {s = 15;}

                        else if ( (LA57_0=='t') ) {s = 16;}

                        else if ( (LA57_0=='w') ) {s = 17;}

                        else if ( (LA57_0=='y') ) {s = 18;}

                        else if ( (LA57_0=='C') ) {s = 19;}

                        else if ( (LA57_0=='P') ) {s = 20;}

                        else if ( (LA57_0==':') ) {s = 21;}

                        else if ( (LA57_0=='?') ) {s = 22;}

                        else if ( (LA57_0=='A') ) {s = 23;}

                        else if ( (LA57_0=='!') ) {s = 24;}

                        else if ( (LA57_0=='.') ) {s = 25;}

                        else if ( (LA57_0=='L') ) {s = 26;}

                        else if ( (LA57_0=='W') ) {s = 27;}

                        else if ( (LA57_0=='M') ) {s = 28;}

                        else if ( (LA57_0=='D') ) {s = 29;}

                        else if ( (LA57_0=='R') ) {s = 30;}

                        else if ( (LA57_0=='O') ) {s = 31;}

                        else if ( (LA57_0=='F') ) {s = 32;}

                        else if ( (LA57_0=='E') ) {s = 33;}

                        else if ( (LA57_0=='V') ) {s = 34;}

                        else if ( (LA57_0=='U') ) {s = 35;}

                        else if ( (LA57_0=='J') ) {s = 36;}

                        else if ( (LA57_0=='N') ) {s = 37;}

                        else if ( (LA57_0=='_') ) {s = 38;}

                        else if ( (LA57_0=='|') ) {s = 39;}

                        else if ( (LA57_0=='(') ) {s = 40;}

                        else if ( (LA57_0==')') ) {s = 41;}

                        else if ( (LA57_0=='[') ) {s = 42;}

                        else if ( (LA57_0==']') ) {s = 43;}

                        else if ( (LA57_0==',') ) {s = 44;}

                        else if ( (LA57_0==';') ) {s = 45;}

                        else if ( (LA57_0=='+') ) {s = 46;}

                        else if ( (LA57_0=='-') ) {s = 47;}

                        else if ( (LA57_0=='*') ) {s = 48;}

                        else if ( (LA57_0=='/') ) {s = 49;}

                        else if ( (LA57_0=='&') ) {s = 50;}

                        else if ( (LA57_0=='<') ) {s = 51;}

                        else if ( (LA57_0=='>') ) {s = 52;}

                        else if ( (LA57_0=='=') ) {s = 53;}

                        else if ( (LA57_0=='%') ) {s = 54;}

                        else if ( (LA57_0=='`') ) {s = 55;}

                        else if ( (LA57_0=='{') ) {s = 56;}

                        else if ( (LA57_0=='}') ) {s = 57;}

                        else if ( (LA57_0=='^') ) {s = 58;}

                        else if ( (LA57_0=='~') ) {s = 59;}

                        else if ( (LA57_0=='@') ) {s = 60;}

                        else if ( (LA57_0=='o') ) {s = 61;}

                        else if ( (LA57_0=='n') ) {s = 62;}

                        else if ( (LA57_0=='0') ) {s = 63;}

                        else if ( ((LA57_0>='1' && LA57_0<='9')) ) {s = 64;}

                        else if ( (LA57_0=='u') ) {s = 65;}

                        else if ( ((LA57_0>='G' && LA57_0<='H')||LA57_0=='K'||LA57_0=='Q'||(LA57_0>='X' && LA57_0<='Z')||LA57_0=='h'||(LA57_0>='j' && LA57_0<='k')||LA57_0=='m'||LA57_0=='q'||LA57_0=='s'||LA57_0=='v'||LA57_0=='x'||LA57_0=='z') ) {s = 66;}

                        else if ( (LA57_0=='\"'||LA57_0=='\'') ) {s = 67;}

                        else if ( (LA57_0=='\\') ) {s = 68;}

                        else if ( (LA57_0=='\f') ) {s = 69;}

                        else if ( (LA57_0=='\n'||LA57_0=='\r') ) {s = 70;}

                        else if ( (LA57_0==' ') && (((startPos==0)||(startPos>0)))) {s = 71;}

                        else if ( (LA57_0=='\t') && (((startPos==0)||(startPos>0)))) {s = 72;}

                        else if ( (LA57_0=='#') ) {s = 73;}

                         
                        input.seek(index57_0);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA57_71 = input.LA(1);

                         
                        int index57_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_71=='#') && ((startPos==0))) {s = 215;}

                        else if ( (LA57_71==' ') && (((startPos==0)||(startPos>0)))) {s = 71;}

                        else if ( (LA57_71=='\f') && ((startPos>0))) {s = 214;}

                        else if ( (LA57_71=='\n'||LA57_71=='\r') && ((startPos==0))) {s = 217;}

                        else if ( (LA57_71=='\t') && (((startPos==0)||(startPos>0)))) {s = 72;}

                        else s = 216;

                         
                        input.seek(index57_71);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA57_72 = input.LA(1);

                         
                        int index57_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA57_72=='\n'||LA57_72=='\r') && ((startPos==0))) {s = 217;}

                        else if ( (LA57_72==' ') && (((startPos==0)||(startPos>0)))) {s = 71;}

                        else if ( (LA57_72=='\t') && (((startPos==0)||(startPos>0)))) {s = 72;}

                        else if ( (LA57_72=='#') && ((startPos==0))) {s = 215;}

                        else if ( (LA57_72=='\f') && ((startPos>0))) {s = 214;}

                        else s = 218;

                         
                        input.seek(index57_72);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}