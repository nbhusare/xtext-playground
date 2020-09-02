package org.xtext.example.uidsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.uidsl.services.UiDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUiDslParser extends AbstractInternalAntlrParser {
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

        public InternalUiDslParser(TokenStream input, UiDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UiModelFile";
       	}

       	@Override
       	protected UiDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUiModelFile"
    // InternalUiDsl.g:64:1: entryRuleUiModelFile returns [EObject current=null] : iv_ruleUiModelFile= ruleUiModelFile EOF ;
    public final EObject entryRuleUiModelFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiModelFile = null;


        try {
            // InternalUiDsl.g:64:52: (iv_ruleUiModelFile= ruleUiModelFile EOF )
            // InternalUiDsl.g:65:2: iv_ruleUiModelFile= ruleUiModelFile EOF
            {
             newCompositeNode(grammarAccess.getUiModelFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUiModelFile=ruleUiModelFile();

            state._fsp--;

             current =iv_ruleUiModelFile; 
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
    // $ANTLR end "entryRuleUiModelFile"


    // $ANTLR start "ruleUiModelFile"
    // InternalUiDsl.g:71:1: ruleUiModelFile returns [EObject current=null] : ( (lv_uiModels_0_0= ruleUiModel ) )* ;
    public final EObject ruleUiModelFile() throws RecognitionException {
        EObject current = null;

        EObject lv_uiModels_0_0 = null;



        	enterRule();

        try {
            // InternalUiDsl.g:77:2: ( ( (lv_uiModels_0_0= ruleUiModel ) )* )
            // InternalUiDsl.g:78:2: ( (lv_uiModels_0_0= ruleUiModel ) )*
            {
            // InternalUiDsl.g:78:2: ( (lv_uiModels_0_0= ruleUiModel ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUiDsl.g:79:3: (lv_uiModels_0_0= ruleUiModel )
            	    {
            	    // InternalUiDsl.g:79:3: (lv_uiModels_0_0= ruleUiModel )
            	    // InternalUiDsl.g:80:4: lv_uiModels_0_0= ruleUiModel
            	    {

            	    				newCompositeNode(grammarAccess.getUiModelFileAccess().getUiModelsUiModelParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_uiModels_0_0=ruleUiModel();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getUiModelFileRule());
            	    				}
            	    				add(
            	    					current,
            	    					"uiModels",
            	    					lv_uiModels_0_0,
            	    					"org.xtext.example.uidsl.UiDsl.UiModel");
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
    // $ANTLR end "ruleUiModelFile"


    // $ANTLR start "entryRuleUiModel"
    // InternalUiDsl.g:100:1: entryRuleUiModel returns [EObject current=null] : iv_ruleUiModel= ruleUiModel EOF ;
    public final EObject entryRuleUiModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUiModel = null;


        try {
            // InternalUiDsl.g:100:48: (iv_ruleUiModel= ruleUiModel EOF )
            // InternalUiDsl.g:101:2: iv_ruleUiModel= ruleUiModel EOF
            {
             newCompositeNode(grammarAccess.getUiModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUiModel=ruleUiModel();

            state._fsp--;

             current =iv_ruleUiModel; 
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
    // $ANTLR end "entryRuleUiModel"


    // $ANTLR start "ruleUiModel"
    // InternalUiDsl.g:107:1: ruleUiModel returns [EObject current=null] : (otherlv_0= 'ui' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleUiModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalUiDsl.g:113:2: ( (otherlv_0= 'ui' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalUiDsl.g:114:2: (otherlv_0= 'ui' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalUiDsl.g:114:2: (otherlv_0= 'ui' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) ) )
            // InternalUiDsl.g:115:3: otherlv_0= 'ui' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for' ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getUiModelAccess().getUiKeyword_0());
            		
            // InternalUiDsl.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalUiDsl.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalUiDsl.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalUiDsl.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUiModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUiModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getUiModelAccess().getForKeyword_2());
            		
            // InternalUiDsl.g:141:3: ( (otherlv_3= RULE_ID ) )
            // InternalUiDsl.g:142:4: (otherlv_3= RULE_ID )
            {
            // InternalUiDsl.g:142:4: (otherlv_3= RULE_ID )
            // InternalUiDsl.g:143:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUiModelRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getUiModelAccess().getModelModelCrossReference_3_0());
            				

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
    // $ANTLR end "ruleUiModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});

}