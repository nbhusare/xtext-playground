package org.xtext.example.modeldsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.modeldsl.services.ModelDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalModelDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'abstract'", "'model'"
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

        public InternalModelDslParser(TokenStream input, ModelDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ModelFile";
       	}

       	@Override
       	protected ModelDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModelFile"
    // InternalModelDsl.g:64:1: entryRuleModelFile returns [EObject current=null] : iv_ruleModelFile= ruleModelFile EOF ;
    public final EObject entryRuleModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFile = null;


        try {
            // InternalModelDsl.g:64:50: (iv_ruleModelFile= ruleModelFile EOF )
            // InternalModelDsl.g:65:2: iv_ruleModelFile= ruleModelFile EOF
            {
             newCompositeNode(grammarAccess.getModelFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModelFile=ruleModelFile();

            state._fsp--;

             current =iv_ruleModelFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFile"


    // $ANTLR start "ruleModelFile"
    // InternalModelDsl.g:71:1: ruleModelFile returns [EObject current=null] : ( (lv_models_0_0= ruleModel ) )* ;
    public final EObject ruleModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_models_0_0 = null;



        	enterRule();

        try {
            // InternalModelDsl.g:77:2: ( ( (lv_models_0_0= ruleModel ) )* )
            // InternalModelDsl.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            {
            // InternalModelDsl.g:78:2: ( (lv_models_0_0= ruleModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalModelDsl.g:79:3: (lv_models_0_0= ruleModel )
            	    {
            	    // InternalModelDsl.g:79:3: (lv_models_0_0= ruleModel )
            	    // InternalModelDsl.g:80:4: lv_models_0_0= ruleModel
            	    {

            	    				newCompositeNode(grammarAccess.getModelFileAccess().getModelsModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_models_0_0=ruleModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"models",
            	    					lv_models_0_0,
            	    					"org.xtext.example.modeldsl.ModelDsl.Model");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFile"


    // $ANTLR start "entryRuleModel"
    // InternalModelDsl.g:100:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalModelDsl.g:100:46: (iv_ruleModel= ruleModel EOF )
            // InternalModelDsl.g:101:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalModelDsl.g:107:1: ruleModel returns [EObject current=null] : ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token lv_abstract_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalModelDsl.g:113:2: ( ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalModelDsl.g:114:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalModelDsl.g:114:2: ( ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalModelDsl.g:115:3: ( (lv_abstract_0_0= 'abstract' ) )? otherlv_1= 'model' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalModelDsl.g:115:3: ( (lv_abstract_0_0= 'abstract' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModelDsl.g:116:4: (lv_abstract_0_0= 'abstract' )
                    {
                    // InternalModelDsl.g:116:4: (lv_abstract_0_0= 'abstract' )
                    // InternalModelDsl.g:117:5: lv_abstract_0_0= 'abstract'
                    {
                    lv_abstract_0_0=(Token)match(input,11,FOLLOW_4); 

                    					newLeafNode(lv_abstract_0_0, grammarAccess.getModelAccess().getAbstractAbstractKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getModelRule());
                    					}
                    					setWithLastConsumed(current, "abstract", lv_abstract_0_0 != null, "abstract");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            // InternalModelDsl.g:133:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalModelDsl.g:134:4: (lv_name_2_0= RULE_ID )
            {
            // InternalModelDsl.g:134:4: (lv_name_2_0= RULE_ID )
            // InternalModelDsl.g:135:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}