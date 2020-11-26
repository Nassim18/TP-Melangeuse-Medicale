package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MymixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMymixParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'put'", "'from'", "'to'", "'filter'", "'wait'", "'A'", "'B'", "'cup'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMymixParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMymixParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMymixParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMymix.g"; }



     	private MymixGrammarAccess grammarAccess;

        public InternalMymixParser(TokenStream input, MymixGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Machine";
       	}

       	@Override
       	protected MymixGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMachine"
    // InternalMymix.g:64:1: entryRuleMachine returns [EObject current=null] : iv_ruleMachine= ruleMachine EOF ;
    public final EObject entryRuleMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine = null;


        try {
            // InternalMymix.g:64:48: (iv_ruleMachine= ruleMachine EOF )
            // InternalMymix.g:65:2: iv_ruleMachine= ruleMachine EOF
            {
             newCompositeNode(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine=ruleMachine();

            state._fsp--;

             current =iv_ruleMachine; 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalMymix.g:71:1: ruleMachine returns [EObject current=null] : ( (lv_operations_0_0= ruleOperation ) )+ ;
    public final EObject ruleMachine() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_0_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:77:2: ( ( (lv_operations_0_0= ruleOperation ) )+ )
            // InternalMymix.g:78:2: ( (lv_operations_0_0= ruleOperation ) )+
            {
            // InternalMymix.g:78:2: ( (lv_operations_0_0= ruleOperation ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMymix.g:79:3: (lv_operations_0_0= ruleOperation )
            	    {
            	    // InternalMymix.g:79:3: (lv_operations_0_0= ruleOperation )
            	    // InternalMymix.g:80:4: lv_operations_0_0= ruleOperation
            	    {

            	    				newCompositeNode(grammarAccess.getMachineAccess().getOperationsOperationParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_operations_0_0=ruleOperation();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getMachineRule());
            	    				}
            	    				add(
            	    					current,
            	    					"operations",
            	    					lv_operations_0_0,
            	    					"org.xtext.example.mydsl.Mymix.Operation");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleOperation"
    // InternalMymix.g:100:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMymix.g:100:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMymix.g:101:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMymix.g:107:1: ruleOperation returns [EObject current=null] : (this_Wait_0= ruleWait | this_Put_1= rulePut ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Wait_0 = null;

        EObject this_Put_1 = null;



        	enterRule();

        try {
            // InternalMymix.g:113:2: ( (this_Wait_0= ruleWait | this_Put_1= rulePut ) )
            // InternalMymix.g:114:2: (this_Wait_0= ruleWait | this_Put_1= rulePut )
            {
            // InternalMymix.g:114:2: (this_Wait_0= ruleWait | this_Put_1= rulePut )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==11) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMymix.g:115:3: this_Wait_0= ruleWait
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getWaitParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Wait_0=ruleWait();

                    state._fsp--;


                    			current = this_Wait_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMymix.g:124:3: this_Put_1= rulePut
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getPutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Put_1=rulePut();

                    state._fsp--;


                    			current = this_Put_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRulePut"
    // InternalMymix.g:136:1: entryRulePut returns [EObject current=null] : iv_rulePut= rulePut EOF ;
    public final EObject entryRulePut() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePut = null;


        try {
            // InternalMymix.g:136:44: (iv_rulePut= rulePut EOF )
            // InternalMymix.g:137:2: iv_rulePut= rulePut EOF
            {
             newCompositeNode(grammarAccess.getPutRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePut=rulePut();

            state._fsp--;

             current =iv_rulePut; 
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
    // $ANTLR end "entryRulePut"


    // $ANTLR start "rulePut"
    // InternalMymix.g:143:1: rulePut returns [EObject current=null] : (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) otherlv_4= 'to' ( (lv_cup_5_0= ruleCup ) ) (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )? ( (lv_wait_8_0= ruleWait ) )? ) ;
    public final EObject rulePut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_quantity_1_0 = null;

        EObject lv_cup_3_0 = null;

        EObject lv_cup_5_0 = null;

        EObject lv_filter_7_0 = null;

        EObject lv_wait_8_0 = null;



        	enterRule();

        try {
            // InternalMymix.g:149:2: ( (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) otherlv_4= 'to' ( (lv_cup_5_0= ruleCup ) ) (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )? ( (lv_wait_8_0= ruleWait ) )? ) )
            // InternalMymix.g:150:2: (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) otherlv_4= 'to' ( (lv_cup_5_0= ruleCup ) ) (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )? ( (lv_wait_8_0= ruleWait ) )? )
            {
            // InternalMymix.g:150:2: (otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) otherlv_4= 'to' ( (lv_cup_5_0= ruleCup ) ) (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )? ( (lv_wait_8_0= ruleWait ) )? )
            // InternalMymix.g:151:3: otherlv_0= 'put' ( (lv_quantity_1_0= ruleQuantity ) ) otherlv_2= 'from' ( (lv_cup_3_0= ruleCup ) ) otherlv_4= 'to' ( (lv_cup_5_0= ruleCup ) ) (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )? ( (lv_wait_8_0= ruleWait ) )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPutAccess().getPutKeyword_0());
            		
            // InternalMymix.g:155:3: ( (lv_quantity_1_0= ruleQuantity ) )
            // InternalMymix.g:156:4: (lv_quantity_1_0= ruleQuantity )
            {
            // InternalMymix.g:156:4: (lv_quantity_1_0= ruleQuantity )
            // InternalMymix.g:157:5: lv_quantity_1_0= ruleQuantity
            {

            					newCompositeNode(grammarAccess.getPutAccess().getQuantityQuantityParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_quantity_1_0=ruleQuantity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutRule());
            					}
            					set(
            						current,
            						"quantity",
            						lv_quantity_1_0,
            						"org.xtext.example.mydsl.Mymix.Quantity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPutAccess().getFromKeyword_2());
            		
            // InternalMymix.g:178:3: ( (lv_cup_3_0= ruleCup ) )
            // InternalMymix.g:179:4: (lv_cup_3_0= ruleCup )
            {
            // InternalMymix.g:179:4: (lv_cup_3_0= ruleCup )
            // InternalMymix.g:180:5: lv_cup_3_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getPutAccess().getCupCupParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_cup_3_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_3_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getPutAccess().getToKeyword_4());
            		
            // InternalMymix.g:201:3: ( (lv_cup_5_0= ruleCup ) )
            // InternalMymix.g:202:4: (lv_cup_5_0= ruleCup )
            {
            // InternalMymix.g:202:4: (lv_cup_5_0= ruleCup )
            // InternalMymix.g:203:5: lv_cup_5_0= ruleCup
            {

            					newCompositeNode(grammarAccess.getPutAccess().getCupCupParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_cup_5_0=ruleCup();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPutRule());
            					}
            					set(
            						current,
            						"cup",
            						lv_cup_5_0,
            						"org.xtext.example.mydsl.Mymix.Cup");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMymix.g:220:3: (otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMymix.g:221:4: otherlv_6= 'filter' ( (lv_filter_7_0= ruleFilter ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getPutAccess().getFilterKeyword_6_0());
                    			
                    // InternalMymix.g:225:4: ( (lv_filter_7_0= ruleFilter ) )
                    // InternalMymix.g:226:5: (lv_filter_7_0= ruleFilter )
                    {
                    // InternalMymix.g:226:5: (lv_filter_7_0= ruleFilter )
                    // InternalMymix.g:227:6: lv_filter_7_0= ruleFilter
                    {

                    						newCompositeNode(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_filter_7_0=ruleFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPutRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_7_0,
                    							"org.xtext.example.mydsl.Mymix.Filter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMymix.g:245:3: ( (lv_wait_8_0= ruleWait ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_INT) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // InternalMymix.g:246:4: (lv_wait_8_0= ruleWait )
                    {
                    // InternalMymix.g:246:4: (lv_wait_8_0= ruleWait )
                    // InternalMymix.g:247:5: lv_wait_8_0= ruleWait
                    {

                    					newCompositeNode(grammarAccess.getPutAccess().getWaitWaitParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_wait_8_0=ruleWait();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPutRule());
                    					}
                    					add(
                    						current,
                    						"wait",
                    						lv_wait_8_0,
                    						"org.xtext.example.mydsl.Mymix.Wait");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

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
    // $ANTLR end "rulePut"


    // $ANTLR start "entryRuleWait"
    // InternalMymix.g:268:1: entryRuleWait returns [EObject current=null] : iv_ruleWait= ruleWait EOF ;
    public final EObject entryRuleWait() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWait = null;


        try {
            // InternalMymix.g:268:45: (iv_ruleWait= ruleWait EOF )
            // InternalMymix.g:269:2: iv_ruleWait= ruleWait EOF
            {
             newCompositeNode(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWait=ruleWait();

            state._fsp--;

             current =iv_ruleWait; 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMymix.g:275:1: ruleWait returns [EObject current=null] : (otherlv_0= 'wait' ( (lv_time_1_0= RULE_INT ) ) ) ;
    public final EObject ruleWait() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_time_1_0=null;


        	enterRule();

        try {
            // InternalMymix.g:281:2: ( (otherlv_0= 'wait' ( (lv_time_1_0= RULE_INT ) ) ) )
            // InternalMymix.g:282:2: (otherlv_0= 'wait' ( (lv_time_1_0= RULE_INT ) ) )
            {
            // InternalMymix.g:282:2: (otherlv_0= 'wait' ( (lv_time_1_0= RULE_INT ) ) )
            // InternalMymix.g:283:3: otherlv_0= 'wait' ( (lv_time_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWaitAccess().getWaitKeyword_0());
            		
            // InternalMymix.g:287:3: ( (lv_time_1_0= RULE_INT ) )
            // InternalMymix.g:288:4: (lv_time_1_0= RULE_INT )
            {
            // InternalMymix.g:288:4: (lv_time_1_0= RULE_INT )
            // InternalMymix.g:289:5: lv_time_1_0= RULE_INT
            {
            lv_time_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_time_1_0, grammarAccess.getWaitAccess().getTimeINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWaitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"time",
            						lv_time_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFilter"
    // InternalMymix.g:309:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalMymix.g:309:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalMymix.g:310:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMymix.g:316:1: ruleFilter returns [EObject current=null] : ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        Token lv_filter_0_0=null;
        Token lv_filter_1_0=null;


        	enterRule();

        try {
            // InternalMymix.g:322:2: ( ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) ) )
            // InternalMymix.g:323:2: ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) )
            {
            // InternalMymix.g:323:2: ( ( (lv_filter_0_0= 'A' ) ) | ( (lv_filter_1_0= 'B' ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            else if ( (LA5_0==17) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMymix.g:324:3: ( (lv_filter_0_0= 'A' ) )
                    {
                    // InternalMymix.g:324:3: ( (lv_filter_0_0= 'A' ) )
                    // InternalMymix.g:325:4: (lv_filter_0_0= 'A' )
                    {
                    // InternalMymix.g:325:4: (lv_filter_0_0= 'A' )
                    // InternalMymix.g:326:5: lv_filter_0_0= 'A'
                    {
                    lv_filter_0_0=(Token)match(input,16,FOLLOW_2); 

                    					newLeafNode(lv_filter_0_0, grammarAccess.getFilterAccess().getFilterAKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "filter", lv_filter_0_0, "A");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:339:3: ( (lv_filter_1_0= 'B' ) )
                    {
                    // InternalMymix.g:339:3: ( (lv_filter_1_0= 'B' ) )
                    // InternalMymix.g:340:4: (lv_filter_1_0= 'B' )
                    {
                    // InternalMymix.g:340:4: (lv_filter_1_0= 'B' )
                    // InternalMymix.g:341:5: lv_filter_1_0= 'B'
                    {
                    lv_filter_1_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_filter_1_0, grammarAccess.getFilterAccess().getFilterBKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterRule());
                    					}
                    					setWithLastConsumed(current, "filter", lv_filter_1_0, "B");
                    				

                    }


                    }


                    }
                    break;

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleCup"
    // InternalMymix.g:357:1: entryRuleCup returns [EObject current=null] : iv_ruleCup= ruleCup EOF ;
    public final EObject entryRuleCup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCup = null;


        try {
            // InternalMymix.g:357:44: (iv_ruleCup= ruleCup EOF )
            // InternalMymix.g:358:2: iv_ruleCup= ruleCup EOF
            {
             newCompositeNode(grammarAccess.getCupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCup=ruleCup();

            state._fsp--;

             current =iv_ruleCup; 
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
    // $ANTLR end "entryRuleCup"


    // $ANTLR start "ruleCup"
    // InternalMymix.g:364:1: ruleCup returns [EObject current=null] : (otherlv_0= 'cup' ( (lv_cup_1_0= RULE_INT ) ) ) ;
    public final EObject ruleCup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cup_1_0=null;


        	enterRule();

        try {
            // InternalMymix.g:370:2: ( (otherlv_0= 'cup' ( (lv_cup_1_0= RULE_INT ) ) ) )
            // InternalMymix.g:371:2: (otherlv_0= 'cup' ( (lv_cup_1_0= RULE_INT ) ) )
            {
            // InternalMymix.g:371:2: (otherlv_0= 'cup' ( (lv_cup_1_0= RULE_INT ) ) )
            // InternalMymix.g:372:3: otherlv_0= 'cup' ( (lv_cup_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getCupAccess().getCupKeyword_0());
            		
            // InternalMymix.g:376:3: ( (lv_cup_1_0= RULE_INT ) )
            // InternalMymix.g:377:4: (lv_cup_1_0= RULE_INT )
            {
            // InternalMymix.g:377:4: (lv_cup_1_0= RULE_INT )
            // InternalMymix.g:378:5: lv_cup_1_0= RULE_INT
            {
            lv_cup_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_cup_1_0, grammarAccess.getCupAccess().getCupINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCupRule());
            					}
            					setWithLastConsumed(
            						current,
            						"cup",
            						lv_cup_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleCup"


    // $ANTLR start "entryRuleQuantity"
    // InternalMymix.g:398:1: entryRuleQuantity returns [EObject current=null] : iv_ruleQuantity= ruleQuantity EOF ;
    public final EObject entryRuleQuantity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantity = null;


        try {
            // InternalMymix.g:398:49: (iv_ruleQuantity= ruleQuantity EOF )
            // InternalMymix.g:399:2: iv_ruleQuantity= ruleQuantity EOF
            {
             newCompositeNode(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuantity=ruleQuantity();

            state._fsp--;

             current =iv_ruleQuantity; 
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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalMymix.g:405:1: ruleQuantity returns [EObject current=null] : ( (lv_quantity_0_0= RULE_INT ) ) ;
    public final EObject ruleQuantity() throws RecognitionException {
        EObject current = null;

        Token lv_quantity_0_0=null;


        	enterRule();

        try {
            // InternalMymix.g:411:2: ( ( (lv_quantity_0_0= RULE_INT ) ) )
            // InternalMymix.g:412:2: ( (lv_quantity_0_0= RULE_INT ) )
            {
            // InternalMymix.g:412:2: ( (lv_quantity_0_0= RULE_INT ) )
            // InternalMymix.g:413:3: (lv_quantity_0_0= RULE_INT )
            {
            // InternalMymix.g:413:3: (lv_quantity_0_0= RULE_INT )
            // InternalMymix.g:414:4: lv_quantity_0_0= RULE_INT
            {
            lv_quantity_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_quantity_0_0, grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getQuantityRule());
            				}
            				setWithLastConsumed(
            					current,
            					"quantity",
            					lv_quantity_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleQuantity"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008002L});

}