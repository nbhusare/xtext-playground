package org.xtext.example.uidsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.uidsl.services.UiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'ui'", "'for'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalUiDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUiDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUiDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUiDsl.g"; }


    	private UiDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(UiDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleUiModelFile"
    // InternalUiDsl.g:53:1: entryRuleUiModelFile : ruleUiModelFile EOF ;
    public final void entryRuleUiModelFile() throws RecognitionException {
        try {
            // InternalUiDsl.g:54:1: ( ruleUiModelFile EOF )
            // InternalUiDsl.g:55:1: ruleUiModelFile EOF
            {
             before(grammarAccess.getUiModelFileRule()); 
            pushFollow(FOLLOW_1);
            ruleUiModelFile();

            state._fsp--;

             after(grammarAccess.getUiModelFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUiModelFile"


    // $ANTLR start "ruleUiModelFile"
    // InternalUiDsl.g:62:1: ruleUiModelFile : ( ( rule__UiModelFile__UiModelsAssignment )* ) ;
    public final void ruleUiModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:66:2: ( ( ( rule__UiModelFile__UiModelsAssignment )* ) )
            // InternalUiDsl.g:67:2: ( ( rule__UiModelFile__UiModelsAssignment )* )
            {
            // InternalUiDsl.g:67:2: ( ( rule__UiModelFile__UiModelsAssignment )* )
            // InternalUiDsl.g:68:3: ( rule__UiModelFile__UiModelsAssignment )*
            {
             before(grammarAccess.getUiModelFileAccess().getUiModelsAssignment()); 
            // InternalUiDsl.g:69:3: ( rule__UiModelFile__UiModelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUiDsl.g:69:4: rule__UiModelFile__UiModelsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__UiModelFile__UiModelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getUiModelFileAccess().getUiModelsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUiModelFile"


    // $ANTLR start "entryRuleUiModel"
    // InternalUiDsl.g:78:1: entryRuleUiModel : ruleUiModel EOF ;
    public final void entryRuleUiModel() throws RecognitionException {
        try {
            // InternalUiDsl.g:79:1: ( ruleUiModel EOF )
            // InternalUiDsl.g:80:1: ruleUiModel EOF
            {
             before(grammarAccess.getUiModelRule()); 
            pushFollow(FOLLOW_1);
            ruleUiModel();

            state._fsp--;

             after(grammarAccess.getUiModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUiModel"


    // $ANTLR start "ruleUiModel"
    // InternalUiDsl.g:87:1: ruleUiModel : ( ( rule__UiModel__Group__0 ) ) ;
    public final void ruleUiModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:91:2: ( ( ( rule__UiModel__Group__0 ) ) )
            // InternalUiDsl.g:92:2: ( ( rule__UiModel__Group__0 ) )
            {
            // InternalUiDsl.g:92:2: ( ( rule__UiModel__Group__0 ) )
            // InternalUiDsl.g:93:3: ( rule__UiModel__Group__0 )
            {
             before(grammarAccess.getUiModelAccess().getGroup()); 
            // InternalUiDsl.g:94:3: ( rule__UiModel__Group__0 )
            // InternalUiDsl.g:94:4: rule__UiModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UiModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUiModel"


    // $ANTLR start "rule__UiModel__Group__0"
    // InternalUiDsl.g:102:1: rule__UiModel__Group__0 : rule__UiModel__Group__0__Impl rule__UiModel__Group__1 ;
    public final void rule__UiModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:106:1: ( rule__UiModel__Group__0__Impl rule__UiModel__Group__1 )
            // InternalUiDsl.g:107:2: rule__UiModel__Group__0__Impl rule__UiModel__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__UiModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UiModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__0"


    // $ANTLR start "rule__UiModel__Group__0__Impl"
    // InternalUiDsl.g:114:1: rule__UiModel__Group__0__Impl : ( 'ui' ) ;
    public final void rule__UiModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:118:1: ( ( 'ui' ) )
            // InternalUiDsl.g:119:1: ( 'ui' )
            {
            // InternalUiDsl.g:119:1: ( 'ui' )
            // InternalUiDsl.g:120:2: 'ui'
            {
             before(grammarAccess.getUiModelAccess().getUiKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getUiModelAccess().getUiKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__0__Impl"


    // $ANTLR start "rule__UiModel__Group__1"
    // InternalUiDsl.g:129:1: rule__UiModel__Group__1 : rule__UiModel__Group__1__Impl rule__UiModel__Group__2 ;
    public final void rule__UiModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:133:1: ( rule__UiModel__Group__1__Impl rule__UiModel__Group__2 )
            // InternalUiDsl.g:134:2: rule__UiModel__Group__1__Impl rule__UiModel__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__UiModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UiModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__1"


    // $ANTLR start "rule__UiModel__Group__1__Impl"
    // InternalUiDsl.g:141:1: rule__UiModel__Group__1__Impl : ( ( rule__UiModel__NameAssignment_1 ) ) ;
    public final void rule__UiModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:145:1: ( ( ( rule__UiModel__NameAssignment_1 ) ) )
            // InternalUiDsl.g:146:1: ( ( rule__UiModel__NameAssignment_1 ) )
            {
            // InternalUiDsl.g:146:1: ( ( rule__UiModel__NameAssignment_1 ) )
            // InternalUiDsl.g:147:2: ( rule__UiModel__NameAssignment_1 )
            {
             before(grammarAccess.getUiModelAccess().getNameAssignment_1()); 
            // InternalUiDsl.g:148:2: ( rule__UiModel__NameAssignment_1 )
            // InternalUiDsl.g:148:3: rule__UiModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UiModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__1__Impl"


    // $ANTLR start "rule__UiModel__Group__2"
    // InternalUiDsl.g:156:1: rule__UiModel__Group__2 : rule__UiModel__Group__2__Impl rule__UiModel__Group__3 ;
    public final void rule__UiModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:160:1: ( rule__UiModel__Group__2__Impl rule__UiModel__Group__3 )
            // InternalUiDsl.g:161:2: rule__UiModel__Group__2__Impl rule__UiModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__UiModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UiModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__2"


    // $ANTLR start "rule__UiModel__Group__2__Impl"
    // InternalUiDsl.g:168:1: rule__UiModel__Group__2__Impl : ( 'for' ) ;
    public final void rule__UiModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:172:1: ( ( 'for' ) )
            // InternalUiDsl.g:173:1: ( 'for' )
            {
            // InternalUiDsl.g:173:1: ( 'for' )
            // InternalUiDsl.g:174:2: 'for'
            {
             before(grammarAccess.getUiModelAccess().getForKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getUiModelAccess().getForKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__2__Impl"


    // $ANTLR start "rule__UiModel__Group__3"
    // InternalUiDsl.g:183:1: rule__UiModel__Group__3 : rule__UiModel__Group__3__Impl ;
    public final void rule__UiModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:187:1: ( rule__UiModel__Group__3__Impl )
            // InternalUiDsl.g:188:2: rule__UiModel__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UiModel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__3"


    // $ANTLR start "rule__UiModel__Group__3__Impl"
    // InternalUiDsl.g:194:1: rule__UiModel__Group__3__Impl : ( ( rule__UiModel__ModelAssignment_3 ) ) ;
    public final void rule__UiModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:198:1: ( ( ( rule__UiModel__ModelAssignment_3 ) ) )
            // InternalUiDsl.g:199:1: ( ( rule__UiModel__ModelAssignment_3 ) )
            {
            // InternalUiDsl.g:199:1: ( ( rule__UiModel__ModelAssignment_3 ) )
            // InternalUiDsl.g:200:2: ( rule__UiModel__ModelAssignment_3 )
            {
             before(grammarAccess.getUiModelAccess().getModelAssignment_3()); 
            // InternalUiDsl.g:201:2: ( rule__UiModel__ModelAssignment_3 )
            // InternalUiDsl.g:201:3: rule__UiModel__ModelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__UiModel__ModelAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getUiModelAccess().getModelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__Group__3__Impl"


    // $ANTLR start "rule__UiModelFile__UiModelsAssignment"
    // InternalUiDsl.g:210:1: rule__UiModelFile__UiModelsAssignment : ( ruleUiModel ) ;
    public final void rule__UiModelFile__UiModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:214:1: ( ( ruleUiModel ) )
            // InternalUiDsl.g:215:2: ( ruleUiModel )
            {
            // InternalUiDsl.g:215:2: ( ruleUiModel )
            // InternalUiDsl.g:216:3: ruleUiModel
            {
             before(grammarAccess.getUiModelFileAccess().getUiModelsUiModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUiModel();

            state._fsp--;

             after(grammarAccess.getUiModelFileAccess().getUiModelsUiModelParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModelFile__UiModelsAssignment"


    // $ANTLR start "rule__UiModel__NameAssignment_1"
    // InternalUiDsl.g:225:1: rule__UiModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UiModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:229:1: ( ( RULE_ID ) )
            // InternalUiDsl.g:230:2: ( RULE_ID )
            {
            // InternalUiDsl.g:230:2: ( RULE_ID )
            // InternalUiDsl.g:231:3: RULE_ID
            {
             before(grammarAccess.getUiModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUiModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__NameAssignment_1"


    // $ANTLR start "rule__UiModel__ModelAssignment_3"
    // InternalUiDsl.g:240:1: rule__UiModel__ModelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__UiModel__ModelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalUiDsl.g:244:1: ( ( ( RULE_ID ) ) )
            // InternalUiDsl.g:245:2: ( ( RULE_ID ) )
            {
            // InternalUiDsl.g:245:2: ( ( RULE_ID ) )
            // InternalUiDsl.g:246:3: ( RULE_ID )
            {
             before(grammarAccess.getUiModelAccess().getModelModelCrossReference_3_0()); 
            // InternalUiDsl.g:247:3: ( RULE_ID )
            // InternalUiDsl.g:248:4: RULE_ID
            {
             before(grammarAccess.getUiModelAccess().getModelModelIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUiModelAccess().getModelModelIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getUiModelAccess().getModelModelCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UiModel__ModelAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}