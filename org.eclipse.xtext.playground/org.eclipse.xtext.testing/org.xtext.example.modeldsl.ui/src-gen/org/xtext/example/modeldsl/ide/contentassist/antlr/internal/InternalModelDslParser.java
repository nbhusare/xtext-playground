package org.xtext.example.modeldsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.modeldsl.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'model'", "'abstract'"
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


        public InternalModelDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModelDsl.g"; }


    	private ModelDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(ModelDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModelFile"
    // InternalModelDsl.g:53:1: entryRuleModelFile : ruleModelFile EOF ;
    public final void entryRuleModelFile() throws RecognitionException {
        try {
            // InternalModelDsl.g:54:1: ( ruleModelFile EOF )
            // InternalModelDsl.g:55:1: ruleModelFile EOF
            {
             before(grammarAccess.getModelFileRule()); 
            pushFollow(FOLLOW_1);
            ruleModelFile();

            state._fsp--;

             after(grammarAccess.getModelFileRule()); 
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
    // $ANTLR end "entryRuleModelFile"


    // $ANTLR start "ruleModelFile"
    // InternalModelDsl.g:62:1: ruleModelFile : ( ( rule__ModelFile__ModelsAssignment )* ) ;
    public final void ruleModelFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:66:2: ( ( ( rule__ModelFile__ModelsAssignment )* ) )
            // InternalModelDsl.g:67:2: ( ( rule__ModelFile__ModelsAssignment )* )
            {
            // InternalModelDsl.g:67:2: ( ( rule__ModelFile__ModelsAssignment )* )
            // InternalModelDsl.g:68:3: ( rule__ModelFile__ModelsAssignment )*
            {
             before(grammarAccess.getModelFileAccess().getModelsAssignment()); 
            // InternalModelDsl.g:69:3: ( rule__ModelFile__ModelsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelDsl.g:69:4: rule__ModelFile__ModelsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__ModelFile__ModelsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelFileAccess().getModelsAssignment()); 

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
    // $ANTLR end "ruleModelFile"


    // $ANTLR start "entryRuleModel"
    // InternalModelDsl.g:78:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalModelDsl.g:79:1: ( ruleModel EOF )
            // InternalModelDsl.g:80:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalModelDsl.g:87:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:91:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalModelDsl.g:92:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalModelDsl.g:92:2: ( ( rule__Model__Group__0 ) )
            // InternalModelDsl.g:93:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalModelDsl.g:94:3: ( rule__Model__Group__0 )
            // InternalModelDsl.g:94:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "rule__Model__Group__0"
    // InternalModelDsl.g:102:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:106:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalModelDsl.g:107:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalModelDsl.g:114:1: rule__Model__Group__0__Impl : ( ( rule__Model__AbstractAssignment_0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:118:1: ( ( ( rule__Model__AbstractAssignment_0 )? ) )
            // InternalModelDsl.g:119:1: ( ( rule__Model__AbstractAssignment_0 )? )
            {
            // InternalModelDsl.g:119:1: ( ( rule__Model__AbstractAssignment_0 )? )
            // InternalModelDsl.g:120:2: ( rule__Model__AbstractAssignment_0 )?
            {
             before(grammarAccess.getModelAccess().getAbstractAssignment_0()); 
            // InternalModelDsl.g:121:2: ( rule__Model__AbstractAssignment_0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelDsl.g:121:3: rule__Model__AbstractAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__AbstractAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getAbstractAssignment_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalModelDsl.g:129:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:133:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalModelDsl.g:134:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalModelDsl.g:141:1: rule__Model__Group__1__Impl : ( 'model' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:145:1: ( ( 'model' ) )
            // InternalModelDsl.g:146:1: ( 'model' )
            {
            // InternalModelDsl.g:146:1: ( 'model' )
            // InternalModelDsl.g:147:2: 'model'
            {
             before(grammarAccess.getModelAccess().getModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getModelKeyword_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalModelDsl.g:156:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:160:1: ( rule__Model__Group__2__Impl )
            // InternalModelDsl.g:161:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__2__Impl();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalModelDsl.g:167:1: rule__Model__Group__2__Impl : ( ( rule__Model__NameAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:171:1: ( ( ( rule__Model__NameAssignment_2 ) ) )
            // InternalModelDsl.g:172:1: ( ( rule__Model__NameAssignment_2 ) )
            {
            // InternalModelDsl.g:172:1: ( ( rule__Model__NameAssignment_2 ) )
            // InternalModelDsl.g:173:2: ( rule__Model__NameAssignment_2 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_2()); 
            // InternalModelDsl.g:174:2: ( rule__Model__NameAssignment_2 )
            // InternalModelDsl.g:174:3: rule__Model__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__ModelFile__ModelsAssignment"
    // InternalModelDsl.g:183:1: rule__ModelFile__ModelsAssignment : ( ruleModel ) ;
    public final void rule__ModelFile__ModelsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:187:1: ( ( ruleModel ) )
            // InternalModelDsl.g:188:2: ( ruleModel )
            {
            // InternalModelDsl.g:188:2: ( ruleModel )
            // InternalModelDsl.g:189:3: ruleModel
            {
             before(grammarAccess.getModelFileAccess().getModelsModelParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelFileAccess().getModelsModelParserRuleCall_0()); 

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
    // $ANTLR end "rule__ModelFile__ModelsAssignment"


    // $ANTLR start "rule__Model__AbstractAssignment_0"
    // InternalModelDsl.g:198:1: rule__Model__AbstractAssignment_0 : ( ( 'abstract' ) ) ;
    public final void rule__Model__AbstractAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:202:1: ( ( ( 'abstract' ) ) )
            // InternalModelDsl.g:203:2: ( ( 'abstract' ) )
            {
            // InternalModelDsl.g:203:2: ( ( 'abstract' ) )
            // InternalModelDsl.g:204:3: ( 'abstract' )
            {
             before(grammarAccess.getModelAccess().getAbstractAbstractKeyword_0_0()); 
            // InternalModelDsl.g:205:3: ( 'abstract' )
            // InternalModelDsl.g:206:4: 'abstract'
            {
             before(grammarAccess.getModelAccess().getAbstractAbstractKeyword_0_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getAbstractAbstractKeyword_0_0()); 

            }

             after(grammarAccess.getModelAccess().getAbstractAbstractKeyword_0_0()); 

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
    // $ANTLR end "rule__Model__AbstractAssignment_0"


    // $ANTLR start "rule__Model__NameAssignment_2"
    // InternalModelDsl.g:217:1: rule__Model__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModelDsl.g:221:1: ( ( RULE_ID ) )
            // InternalModelDsl.g:222:2: ( RULE_ID )
            {
            // InternalModelDsl.g:222:2: ( RULE_ID )
            // InternalModelDsl.g:223:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}