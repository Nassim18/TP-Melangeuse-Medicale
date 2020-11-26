package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MymixGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMymixParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'put'", "'from'", "'to'", "'filter'", "'wait'", "'cup'", "'A'", "'B'"
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

    	public void setGrammarAccess(MymixGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMachine"
    // InternalMymix.g:53:1: entryRuleMachine : ruleMachine EOF ;
    public final void entryRuleMachine() throws RecognitionException {
        try {
            // InternalMymix.g:54:1: ( ruleMachine EOF )
            // InternalMymix.g:55:1: ruleMachine EOF
            {
             before(grammarAccess.getMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine();

            state._fsp--;

             after(grammarAccess.getMachineRule()); 
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
    // $ANTLR end "entryRuleMachine"


    // $ANTLR start "ruleMachine"
    // InternalMymix.g:62:1: ruleMachine : ( ( ( rule__Machine__OperationsAssignment ) ) ( ( rule__Machine__OperationsAssignment )* ) ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:66:2: ( ( ( ( rule__Machine__OperationsAssignment ) ) ( ( rule__Machine__OperationsAssignment )* ) ) )
            // InternalMymix.g:67:2: ( ( ( rule__Machine__OperationsAssignment ) ) ( ( rule__Machine__OperationsAssignment )* ) )
            {
            // InternalMymix.g:67:2: ( ( ( rule__Machine__OperationsAssignment ) ) ( ( rule__Machine__OperationsAssignment )* ) )
            // InternalMymix.g:68:3: ( ( rule__Machine__OperationsAssignment ) ) ( ( rule__Machine__OperationsAssignment )* )
            {
            // InternalMymix.g:68:3: ( ( rule__Machine__OperationsAssignment ) )
            // InternalMymix.g:69:4: ( rule__Machine__OperationsAssignment )
            {
             before(grammarAccess.getMachineAccess().getOperationsAssignment()); 
            // InternalMymix.g:70:4: ( rule__Machine__OperationsAssignment )
            // InternalMymix.g:70:5: rule__Machine__OperationsAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Machine__OperationsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMachineAccess().getOperationsAssignment()); 

            }

            // InternalMymix.g:73:3: ( ( rule__Machine__OperationsAssignment )* )
            // InternalMymix.g:74:4: ( rule__Machine__OperationsAssignment )*
            {
             before(grammarAccess.getMachineAccess().getOperationsAssignment()); 
            // InternalMymix.g:75:4: ( rule__Machine__OperationsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMymix.g:75:5: rule__Machine__OperationsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Machine__OperationsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getOperationsAssignment()); 

            }


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
    // $ANTLR end "ruleMachine"


    // $ANTLR start "entryRuleOperation"
    // InternalMymix.g:85:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMymix.g:86:1: ( ruleOperation EOF )
            // InternalMymix.g:87:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMymix.g:94:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:98:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMymix.g:99:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMymix.g:99:2: ( ( rule__Operation__Alternatives ) )
            // InternalMymix.g:100:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMymix.g:101:3: ( rule__Operation__Alternatives )
            // InternalMymix.g:101:4: rule__Operation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRulePut"
    // InternalMymix.g:110:1: entryRulePut : rulePut EOF ;
    public final void entryRulePut() throws RecognitionException {
        try {
            // InternalMymix.g:111:1: ( rulePut EOF )
            // InternalMymix.g:112:1: rulePut EOF
            {
             before(grammarAccess.getPutRule()); 
            pushFollow(FOLLOW_1);
            rulePut();

            state._fsp--;

             after(grammarAccess.getPutRule()); 
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
    // $ANTLR end "entryRulePut"


    // $ANTLR start "rulePut"
    // InternalMymix.g:119:1: rulePut : ( ( rule__Put__Group__0 ) ) ;
    public final void rulePut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:123:2: ( ( ( rule__Put__Group__0 ) ) )
            // InternalMymix.g:124:2: ( ( rule__Put__Group__0 ) )
            {
            // InternalMymix.g:124:2: ( ( rule__Put__Group__0 ) )
            // InternalMymix.g:125:3: ( rule__Put__Group__0 )
            {
             before(grammarAccess.getPutAccess().getGroup()); 
            // InternalMymix.g:126:3: ( rule__Put__Group__0 )
            // InternalMymix.g:126:4: rule__Put__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Put__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getGroup()); 

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
    // $ANTLR end "rulePut"


    // $ANTLR start "entryRuleWait"
    // InternalMymix.g:135:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalMymix.g:136:1: ( ruleWait EOF )
            // InternalMymix.g:137:1: ruleWait EOF
            {
             before(grammarAccess.getWaitRule()); 
            pushFollow(FOLLOW_1);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getWaitRule()); 
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
    // $ANTLR end "entryRuleWait"


    // $ANTLR start "ruleWait"
    // InternalMymix.g:144:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:148:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalMymix.g:149:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalMymix.g:149:2: ( ( rule__Wait__Group__0 ) )
            // InternalMymix.g:150:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalMymix.g:151:3: ( rule__Wait__Group__0 )
            // InternalMymix.g:151:4: rule__Wait__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getGroup()); 

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
    // $ANTLR end "ruleWait"


    // $ANTLR start "entryRuleFilter"
    // InternalMymix.g:160:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalMymix.g:161:1: ( ruleFilter EOF )
            // InternalMymix.g:162:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
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
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalMymix.g:169:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:173:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalMymix.g:174:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalMymix.g:174:2: ( ( rule__Filter__Alternatives ) )
            // InternalMymix.g:175:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalMymix.g:176:3: ( rule__Filter__Alternatives )
            // InternalMymix.g:176:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleCup"
    // InternalMymix.g:185:1: entryRuleCup : ruleCup EOF ;
    public final void entryRuleCup() throws RecognitionException {
        try {
            // InternalMymix.g:186:1: ( ruleCup EOF )
            // InternalMymix.g:187:1: ruleCup EOF
            {
             before(grammarAccess.getCupRule()); 
            pushFollow(FOLLOW_1);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getCupRule()); 
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
    // $ANTLR end "entryRuleCup"


    // $ANTLR start "ruleCup"
    // InternalMymix.g:194:1: ruleCup : ( ( rule__Cup__Group__0 ) ) ;
    public final void ruleCup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:198:2: ( ( ( rule__Cup__Group__0 ) ) )
            // InternalMymix.g:199:2: ( ( rule__Cup__Group__0 ) )
            {
            // InternalMymix.g:199:2: ( ( rule__Cup__Group__0 ) )
            // InternalMymix.g:200:3: ( rule__Cup__Group__0 )
            {
             before(grammarAccess.getCupAccess().getGroup()); 
            // InternalMymix.g:201:3: ( rule__Cup__Group__0 )
            // InternalMymix.g:201:4: rule__Cup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCupAccess().getGroup()); 

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
    // $ANTLR end "ruleCup"


    // $ANTLR start "entryRuleQuantity"
    // InternalMymix.g:210:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalMymix.g:211:1: ( ruleQuantity EOF )
            // InternalMymix.g:212:1: ruleQuantity EOF
            {
             before(grammarAccess.getQuantityRule()); 
            pushFollow(FOLLOW_1);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getQuantityRule()); 
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
    // $ANTLR end "entryRuleQuantity"


    // $ANTLR start "ruleQuantity"
    // InternalMymix.g:219:1: ruleQuantity : ( ( rule__Quantity__QuantityAssignment ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:223:2: ( ( ( rule__Quantity__QuantityAssignment ) ) )
            // InternalMymix.g:224:2: ( ( rule__Quantity__QuantityAssignment ) )
            {
            // InternalMymix.g:224:2: ( ( rule__Quantity__QuantityAssignment ) )
            // InternalMymix.g:225:3: ( rule__Quantity__QuantityAssignment )
            {
             before(grammarAccess.getQuantityAccess().getQuantityAssignment()); 
            // InternalMymix.g:226:3: ( rule__Quantity__QuantityAssignment )
            // InternalMymix.g:226:4: rule__Quantity__QuantityAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__QuantityAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getQuantityAssignment()); 

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
    // $ANTLR end "ruleQuantity"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMymix.g:234:1: rule__Operation__Alternatives : ( ( ruleWait ) | ( rulePut ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:238:1: ( ( ruleWait ) | ( rulePut ) )
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
                    // InternalMymix.g:239:2: ( ruleWait )
                    {
                    // InternalMymix.g:239:2: ( ruleWait )
                    // InternalMymix.g:240:3: ruleWait
                    {
                     before(grammarAccess.getOperationAccess().getWaitParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getWaitParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:245:2: ( rulePut )
                    {
                    // InternalMymix.g:245:2: ( rulePut )
                    // InternalMymix.g:246:3: rulePut
                    {
                     before(grammarAccess.getOperationAccess().getPutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePut();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getPutParserRuleCall_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Operation__Alternatives"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalMymix.g:255:1: rule__Filter__Alternatives : ( ( ( rule__Filter__FilterAssignment_0 ) ) | ( ( rule__Filter__FilterAssignment_1 ) ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:259:1: ( ( ( rule__Filter__FilterAssignment_0 ) ) | ( ( rule__Filter__FilterAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( (LA3_0==18) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMymix.g:260:2: ( ( rule__Filter__FilterAssignment_0 ) )
                    {
                    // InternalMymix.g:260:2: ( ( rule__Filter__FilterAssignment_0 ) )
                    // InternalMymix.g:261:3: ( rule__Filter__FilterAssignment_0 )
                    {
                     before(grammarAccess.getFilterAccess().getFilterAssignment_0()); 
                    // InternalMymix.g:262:3: ( rule__Filter__FilterAssignment_0 )
                    // InternalMymix.g:262:4: rule__Filter__FilterAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__FilterAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterAccess().getFilterAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:266:2: ( ( rule__Filter__FilterAssignment_1 ) )
                    {
                    // InternalMymix.g:266:2: ( ( rule__Filter__FilterAssignment_1 ) )
                    // InternalMymix.g:267:3: ( rule__Filter__FilterAssignment_1 )
                    {
                     before(grammarAccess.getFilterAccess().getFilterAssignment_1()); 
                    // InternalMymix.g:268:3: ( rule__Filter__FilterAssignment_1 )
                    // InternalMymix.g:268:4: rule__Filter__FilterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Filter__FilterAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterAccess().getFilterAssignment_1()); 

                    }


                    }
                    break;

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
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__Put__Group__0"
    // InternalMymix.g:276:1: rule__Put__Group__0 : rule__Put__Group__0__Impl rule__Put__Group__1 ;
    public final void rule__Put__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:280:1: ( rule__Put__Group__0__Impl rule__Put__Group__1 )
            // InternalMymix.g:281:2: rule__Put__Group__0__Impl rule__Put__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Put__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__1();

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
    // $ANTLR end "rule__Put__Group__0"


    // $ANTLR start "rule__Put__Group__0__Impl"
    // InternalMymix.g:288:1: rule__Put__Group__0__Impl : ( 'put' ) ;
    public final void rule__Put__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:292:1: ( ( 'put' ) )
            // InternalMymix.g:293:1: ( 'put' )
            {
            // InternalMymix.g:293:1: ( 'put' )
            // InternalMymix.g:294:2: 'put'
            {
             before(grammarAccess.getPutAccess().getPutKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getPutKeyword_0()); 

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
    // $ANTLR end "rule__Put__Group__0__Impl"


    // $ANTLR start "rule__Put__Group__1"
    // InternalMymix.g:303:1: rule__Put__Group__1 : rule__Put__Group__1__Impl rule__Put__Group__2 ;
    public final void rule__Put__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:307:1: ( rule__Put__Group__1__Impl rule__Put__Group__2 )
            // InternalMymix.g:308:2: rule__Put__Group__1__Impl rule__Put__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Put__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__2();

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
    // $ANTLR end "rule__Put__Group__1"


    // $ANTLR start "rule__Put__Group__1__Impl"
    // InternalMymix.g:315:1: rule__Put__Group__1__Impl : ( ( rule__Put__QuantityAssignment_1 ) ) ;
    public final void rule__Put__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:319:1: ( ( ( rule__Put__QuantityAssignment_1 ) ) )
            // InternalMymix.g:320:1: ( ( rule__Put__QuantityAssignment_1 ) )
            {
            // InternalMymix.g:320:1: ( ( rule__Put__QuantityAssignment_1 ) )
            // InternalMymix.g:321:2: ( rule__Put__QuantityAssignment_1 )
            {
             before(grammarAccess.getPutAccess().getQuantityAssignment_1()); 
            // InternalMymix.g:322:2: ( rule__Put__QuantityAssignment_1 )
            // InternalMymix.g:322:3: rule__Put__QuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Put__QuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getQuantityAssignment_1()); 

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
    // $ANTLR end "rule__Put__Group__1__Impl"


    // $ANTLR start "rule__Put__Group__2"
    // InternalMymix.g:330:1: rule__Put__Group__2 : rule__Put__Group__2__Impl rule__Put__Group__3 ;
    public final void rule__Put__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:334:1: ( rule__Put__Group__2__Impl rule__Put__Group__3 )
            // InternalMymix.g:335:2: rule__Put__Group__2__Impl rule__Put__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Put__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__3();

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
    // $ANTLR end "rule__Put__Group__2"


    // $ANTLR start "rule__Put__Group__2__Impl"
    // InternalMymix.g:342:1: rule__Put__Group__2__Impl : ( 'from' ) ;
    public final void rule__Put__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:346:1: ( ( 'from' ) )
            // InternalMymix.g:347:1: ( 'from' )
            {
            // InternalMymix.g:347:1: ( 'from' )
            // InternalMymix.g:348:2: 'from'
            {
             before(grammarAccess.getPutAccess().getFromKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Put__Group__2__Impl"


    // $ANTLR start "rule__Put__Group__3"
    // InternalMymix.g:357:1: rule__Put__Group__3 : rule__Put__Group__3__Impl rule__Put__Group__4 ;
    public final void rule__Put__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:361:1: ( rule__Put__Group__3__Impl rule__Put__Group__4 )
            // InternalMymix.g:362:2: rule__Put__Group__3__Impl rule__Put__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Put__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__4();

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
    // $ANTLR end "rule__Put__Group__3"


    // $ANTLR start "rule__Put__Group__3__Impl"
    // InternalMymix.g:369:1: rule__Put__Group__3__Impl : ( ( rule__Put__CupAssignment_3 ) ) ;
    public final void rule__Put__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:373:1: ( ( ( rule__Put__CupAssignment_3 ) ) )
            // InternalMymix.g:374:1: ( ( rule__Put__CupAssignment_3 ) )
            {
            // InternalMymix.g:374:1: ( ( rule__Put__CupAssignment_3 ) )
            // InternalMymix.g:375:2: ( rule__Put__CupAssignment_3 )
            {
             before(grammarAccess.getPutAccess().getCupAssignment_3()); 
            // InternalMymix.g:376:2: ( rule__Put__CupAssignment_3 )
            // InternalMymix.g:376:3: rule__Put__CupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Put__CupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getCupAssignment_3()); 

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
    // $ANTLR end "rule__Put__Group__3__Impl"


    // $ANTLR start "rule__Put__Group__4"
    // InternalMymix.g:384:1: rule__Put__Group__4 : rule__Put__Group__4__Impl rule__Put__Group__5 ;
    public final void rule__Put__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:388:1: ( rule__Put__Group__4__Impl rule__Put__Group__5 )
            // InternalMymix.g:389:2: rule__Put__Group__4__Impl rule__Put__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Put__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__5();

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
    // $ANTLR end "rule__Put__Group__4"


    // $ANTLR start "rule__Put__Group__4__Impl"
    // InternalMymix.g:396:1: rule__Put__Group__4__Impl : ( 'to' ) ;
    public final void rule__Put__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:400:1: ( ( 'to' ) )
            // InternalMymix.g:401:1: ( 'to' )
            {
            // InternalMymix.g:401:1: ( 'to' )
            // InternalMymix.g:402:2: 'to'
            {
             before(grammarAccess.getPutAccess().getToKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__Put__Group__4__Impl"


    // $ANTLR start "rule__Put__Group__5"
    // InternalMymix.g:411:1: rule__Put__Group__5 : rule__Put__Group__5__Impl rule__Put__Group__6 ;
    public final void rule__Put__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:415:1: ( rule__Put__Group__5__Impl rule__Put__Group__6 )
            // InternalMymix.g:416:2: rule__Put__Group__5__Impl rule__Put__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Put__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__6();

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
    // $ANTLR end "rule__Put__Group__5"


    // $ANTLR start "rule__Put__Group__5__Impl"
    // InternalMymix.g:423:1: rule__Put__Group__5__Impl : ( ( rule__Put__CupAssignment_5 ) ) ;
    public final void rule__Put__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:427:1: ( ( ( rule__Put__CupAssignment_5 ) ) )
            // InternalMymix.g:428:1: ( ( rule__Put__CupAssignment_5 ) )
            {
            // InternalMymix.g:428:1: ( ( rule__Put__CupAssignment_5 ) )
            // InternalMymix.g:429:2: ( rule__Put__CupAssignment_5 )
            {
             before(grammarAccess.getPutAccess().getCupAssignment_5()); 
            // InternalMymix.g:430:2: ( rule__Put__CupAssignment_5 )
            // InternalMymix.g:430:3: rule__Put__CupAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Put__CupAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getCupAssignment_5()); 

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
    // $ANTLR end "rule__Put__Group__5__Impl"


    // $ANTLR start "rule__Put__Group__6"
    // InternalMymix.g:438:1: rule__Put__Group__6 : rule__Put__Group__6__Impl rule__Put__Group__7 ;
    public final void rule__Put__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:442:1: ( rule__Put__Group__6__Impl rule__Put__Group__7 )
            // InternalMymix.g:443:2: rule__Put__Group__6__Impl rule__Put__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Put__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group__7();

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
    // $ANTLR end "rule__Put__Group__6"


    // $ANTLR start "rule__Put__Group__6__Impl"
    // InternalMymix.g:450:1: rule__Put__Group__6__Impl : ( ( rule__Put__Group_6__0 )? ) ;
    public final void rule__Put__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:454:1: ( ( ( rule__Put__Group_6__0 )? ) )
            // InternalMymix.g:455:1: ( ( rule__Put__Group_6__0 )? )
            {
            // InternalMymix.g:455:1: ( ( rule__Put__Group_6__0 )? )
            // InternalMymix.g:456:2: ( rule__Put__Group_6__0 )?
            {
             before(grammarAccess.getPutAccess().getGroup_6()); 
            // InternalMymix.g:457:2: ( rule__Put__Group_6__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMymix.g:457:3: rule__Put__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Put__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPutAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Put__Group__6__Impl"


    // $ANTLR start "rule__Put__Group__7"
    // InternalMymix.g:465:1: rule__Put__Group__7 : rule__Put__Group__7__Impl ;
    public final void rule__Put__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:469:1: ( rule__Put__Group__7__Impl )
            // InternalMymix.g:470:2: rule__Put__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Put__Group__7__Impl();

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
    // $ANTLR end "rule__Put__Group__7"


    // $ANTLR start "rule__Put__Group__7__Impl"
    // InternalMymix.g:476:1: rule__Put__Group__7__Impl : ( ( rule__Put__WaitAssignment_7 )? ) ;
    public final void rule__Put__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:480:1: ( ( ( rule__Put__WaitAssignment_7 )? ) )
            // InternalMymix.g:481:1: ( ( rule__Put__WaitAssignment_7 )? )
            {
            // InternalMymix.g:481:1: ( ( rule__Put__WaitAssignment_7 )? )
            // InternalMymix.g:482:2: ( rule__Put__WaitAssignment_7 )?
            {
             before(grammarAccess.getPutAccess().getWaitAssignment_7()); 
            // InternalMymix.g:483:2: ( rule__Put__WaitAssignment_7 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_INT) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // InternalMymix.g:483:3: rule__Put__WaitAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Put__WaitAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPutAccess().getWaitAssignment_7()); 

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
    // $ANTLR end "rule__Put__Group__7__Impl"


    // $ANTLR start "rule__Put__Group_6__0"
    // InternalMymix.g:492:1: rule__Put__Group_6__0 : rule__Put__Group_6__0__Impl rule__Put__Group_6__1 ;
    public final void rule__Put__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:496:1: ( rule__Put__Group_6__0__Impl rule__Put__Group_6__1 )
            // InternalMymix.g:497:2: rule__Put__Group_6__0__Impl rule__Put__Group_6__1
            {
            pushFollow(FOLLOW_9);
            rule__Put__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group_6__1();

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
    // $ANTLR end "rule__Put__Group_6__0"


    // $ANTLR start "rule__Put__Group_6__0__Impl"
    // InternalMymix.g:504:1: rule__Put__Group_6__0__Impl : ( 'filter' ) ;
    public final void rule__Put__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:508:1: ( ( 'filter' ) )
            // InternalMymix.g:509:1: ( 'filter' )
            {
            // InternalMymix.g:509:1: ( 'filter' )
            // InternalMymix.g:510:2: 'filter'
            {
             before(grammarAccess.getPutAccess().getFilterKeyword_6_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getFilterKeyword_6_0()); 

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
    // $ANTLR end "rule__Put__Group_6__0__Impl"


    // $ANTLR start "rule__Put__Group_6__1"
    // InternalMymix.g:519:1: rule__Put__Group_6__1 : rule__Put__Group_6__1__Impl ;
    public final void rule__Put__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:523:1: ( rule__Put__Group_6__1__Impl )
            // InternalMymix.g:524:2: rule__Put__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Put__Group_6__1__Impl();

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
    // $ANTLR end "rule__Put__Group_6__1"


    // $ANTLR start "rule__Put__Group_6__1__Impl"
    // InternalMymix.g:530:1: rule__Put__Group_6__1__Impl : ( ( rule__Put__FilterAssignment_6_1 ) ) ;
    public final void rule__Put__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:534:1: ( ( ( rule__Put__FilterAssignment_6_1 ) ) )
            // InternalMymix.g:535:1: ( ( rule__Put__FilterAssignment_6_1 ) )
            {
            // InternalMymix.g:535:1: ( ( rule__Put__FilterAssignment_6_1 ) )
            // InternalMymix.g:536:2: ( rule__Put__FilterAssignment_6_1 )
            {
             before(grammarAccess.getPutAccess().getFilterAssignment_6_1()); 
            // InternalMymix.g:537:2: ( rule__Put__FilterAssignment_6_1 )
            // InternalMymix.g:537:3: rule__Put__FilterAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Put__FilterAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getFilterAssignment_6_1()); 

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
    // $ANTLR end "rule__Put__Group_6__1__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalMymix.g:546:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:550:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalMymix.g:551:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Wait__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Wait__Group__1();

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
    // $ANTLR end "rule__Wait__Group__0"


    // $ANTLR start "rule__Wait__Group__0__Impl"
    // InternalMymix.g:558:1: rule__Wait__Group__0__Impl : ( 'wait' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:562:1: ( ( 'wait' ) )
            // InternalMymix.g:563:1: ( 'wait' )
            {
            // InternalMymix.g:563:1: ( 'wait' )
            // InternalMymix.g:564:2: 'wait'
            {
             before(grammarAccess.getWaitAccess().getWaitKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getWaitKeyword_0()); 

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
    // $ANTLR end "rule__Wait__Group__0__Impl"


    // $ANTLR start "rule__Wait__Group__1"
    // InternalMymix.g:573:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:577:1: ( rule__Wait__Group__1__Impl )
            // InternalMymix.g:578:2: rule__Wait__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Wait__Group__1__Impl();

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
    // $ANTLR end "rule__Wait__Group__1"


    // $ANTLR start "rule__Wait__Group__1__Impl"
    // InternalMymix.g:584:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:588:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalMymix.g:589:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalMymix.g:589:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalMymix.g:590:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalMymix.g:591:2: ( rule__Wait__TimeAssignment_1 )
            // InternalMymix.g:591:3: rule__Wait__TimeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Wait__TimeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWaitAccess().getTimeAssignment_1()); 

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
    // $ANTLR end "rule__Wait__Group__1__Impl"


    // $ANTLR start "rule__Cup__Group__0"
    // InternalMymix.g:600:1: rule__Cup__Group__0 : rule__Cup__Group__0__Impl rule__Cup__Group__1 ;
    public final void rule__Cup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:604:1: ( rule__Cup__Group__0__Impl rule__Cup__Group__1 )
            // InternalMymix.g:605:2: rule__Cup__Group__0__Impl rule__Cup__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Cup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cup__Group__1();

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
    // $ANTLR end "rule__Cup__Group__0"


    // $ANTLR start "rule__Cup__Group__0__Impl"
    // InternalMymix.g:612:1: rule__Cup__Group__0__Impl : ( 'cup' ) ;
    public final void rule__Cup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:616:1: ( ( 'cup' ) )
            // InternalMymix.g:617:1: ( 'cup' )
            {
            // InternalMymix.g:617:1: ( 'cup' )
            // InternalMymix.g:618:2: 'cup'
            {
             before(grammarAccess.getCupAccess().getCupKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCupAccess().getCupKeyword_0()); 

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
    // $ANTLR end "rule__Cup__Group__0__Impl"


    // $ANTLR start "rule__Cup__Group__1"
    // InternalMymix.g:627:1: rule__Cup__Group__1 : rule__Cup__Group__1__Impl ;
    public final void rule__Cup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:631:1: ( rule__Cup__Group__1__Impl )
            // InternalMymix.g:632:2: rule__Cup__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cup__Group__1__Impl();

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
    // $ANTLR end "rule__Cup__Group__1"


    // $ANTLR start "rule__Cup__Group__1__Impl"
    // InternalMymix.g:638:1: rule__Cup__Group__1__Impl : ( ( rule__Cup__CupAssignment_1 ) ) ;
    public final void rule__Cup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:642:1: ( ( ( rule__Cup__CupAssignment_1 ) ) )
            // InternalMymix.g:643:1: ( ( rule__Cup__CupAssignment_1 ) )
            {
            // InternalMymix.g:643:1: ( ( rule__Cup__CupAssignment_1 ) )
            // InternalMymix.g:644:2: ( rule__Cup__CupAssignment_1 )
            {
             before(grammarAccess.getCupAccess().getCupAssignment_1()); 
            // InternalMymix.g:645:2: ( rule__Cup__CupAssignment_1 )
            // InternalMymix.g:645:3: rule__Cup__CupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Cup__CupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCupAccess().getCupAssignment_1()); 

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
    // $ANTLR end "rule__Cup__Group__1__Impl"


    // $ANTLR start "rule__Machine__OperationsAssignment"
    // InternalMymix.g:654:1: rule__Machine__OperationsAssignment : ( ruleOperation ) ;
    public final void rule__Machine__OperationsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:658:1: ( ( ruleOperation ) )
            // InternalMymix.g:659:2: ( ruleOperation )
            {
            // InternalMymix.g:659:2: ( ruleOperation )
            // InternalMymix.g:660:3: ruleOperation
            {
             before(grammarAccess.getMachineAccess().getOperationsOperationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getOperationsOperationParserRuleCall_0()); 

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
    // $ANTLR end "rule__Machine__OperationsAssignment"


    // $ANTLR start "rule__Put__QuantityAssignment_1"
    // InternalMymix.g:669:1: rule__Put__QuantityAssignment_1 : ( ruleQuantity ) ;
    public final void rule__Put__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:673:1: ( ( ruleQuantity ) )
            // InternalMymix.g:674:2: ( ruleQuantity )
            {
            // InternalMymix.g:674:2: ( ruleQuantity )
            // InternalMymix.g:675:3: ruleQuantity
            {
             before(grammarAccess.getPutAccess().getQuantityQuantityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getPutAccess().getQuantityQuantityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Put__QuantityAssignment_1"


    // $ANTLR start "rule__Put__CupAssignment_3"
    // InternalMymix.g:684:1: rule__Put__CupAssignment_3 : ( ruleCup ) ;
    public final void rule__Put__CupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:688:1: ( ( ruleCup ) )
            // InternalMymix.g:689:2: ( ruleCup )
            {
            // InternalMymix.g:689:2: ( ruleCup )
            // InternalMymix.g:690:3: ruleCup
            {
             before(grammarAccess.getPutAccess().getCupCupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getPutAccess().getCupCupParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Put__CupAssignment_3"


    // $ANTLR start "rule__Put__CupAssignment_5"
    // InternalMymix.g:699:1: rule__Put__CupAssignment_5 : ( ruleCup ) ;
    public final void rule__Put__CupAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:703:1: ( ( ruleCup ) )
            // InternalMymix.g:704:2: ( ruleCup )
            {
            // InternalMymix.g:704:2: ( ruleCup )
            // InternalMymix.g:705:3: ruleCup
            {
             before(grammarAccess.getPutAccess().getCupCupParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getPutAccess().getCupCupParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Put__CupAssignment_5"


    // $ANTLR start "rule__Put__FilterAssignment_6_1"
    // InternalMymix.g:714:1: rule__Put__FilterAssignment_6_1 : ( ruleFilter ) ;
    public final void rule__Put__FilterAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:718:1: ( ( ruleFilter ) )
            // InternalMymix.g:719:2: ( ruleFilter )
            {
            // InternalMymix.g:719:2: ( ruleFilter )
            // InternalMymix.g:720:3: ruleFilter
            {
             before(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__Put__FilterAssignment_6_1"


    // $ANTLR start "rule__Put__WaitAssignment_7"
    // InternalMymix.g:729:1: rule__Put__WaitAssignment_7 : ( ruleWait ) ;
    public final void rule__Put__WaitAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:733:1: ( ( ruleWait ) )
            // InternalMymix.g:734:2: ( ruleWait )
            {
            // InternalMymix.g:734:2: ( ruleWait )
            // InternalMymix.g:735:3: ruleWait
            {
             before(grammarAccess.getPutAccess().getWaitWaitParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getPutAccess().getWaitWaitParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Put__WaitAssignment_7"


    // $ANTLR start "rule__Wait__TimeAssignment_1"
    // InternalMymix.g:744:1: rule__Wait__TimeAssignment_1 : ( RULE_INT ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:748:1: ( ( RULE_INT ) )
            // InternalMymix.g:749:2: ( RULE_INT )
            {
            // InternalMymix.g:749:2: ( RULE_INT )
            // InternalMymix.g:750:3: RULE_INT
            {
             before(grammarAccess.getWaitAccess().getTimeINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWaitAccess().getTimeINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Wait__TimeAssignment_1"


    // $ANTLR start "rule__Filter__FilterAssignment_0"
    // InternalMymix.g:759:1: rule__Filter__FilterAssignment_0 : ( ( 'A' ) ) ;
    public final void rule__Filter__FilterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:763:1: ( ( ( 'A' ) ) )
            // InternalMymix.g:764:2: ( ( 'A' ) )
            {
            // InternalMymix.g:764:2: ( ( 'A' ) )
            // InternalMymix.g:765:3: ( 'A' )
            {
             before(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 
            // InternalMymix.g:766:3: ( 'A' )
            // InternalMymix.g:767:4: 'A'
            {
             before(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 

            }

             after(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 

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
    // $ANTLR end "rule__Filter__FilterAssignment_0"


    // $ANTLR start "rule__Filter__FilterAssignment_1"
    // InternalMymix.g:778:1: rule__Filter__FilterAssignment_1 : ( ( 'B' ) ) ;
    public final void rule__Filter__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:782:1: ( ( ( 'B' ) ) )
            // InternalMymix.g:783:2: ( ( 'B' ) )
            {
            // InternalMymix.g:783:2: ( ( 'B' ) )
            // InternalMymix.g:784:3: ( 'B' )
            {
             before(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 
            // InternalMymix.g:785:3: ( 'B' )
            // InternalMymix.g:786:4: 'B'
            {
             before(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 

            }

             after(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 

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
    // $ANTLR end "rule__Filter__FilterAssignment_1"


    // $ANTLR start "rule__Cup__CupAssignment_1"
    // InternalMymix.g:797:1: rule__Cup__CupAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cup__CupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:801:1: ( ( RULE_INT ) )
            // InternalMymix.g:802:2: ( RULE_INT )
            {
            // InternalMymix.g:802:2: ( RULE_INT )
            // InternalMymix.g:803:3: RULE_INT
            {
             before(grammarAccess.getCupAccess().getCupINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getCupAccess().getCupINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Cup__CupAssignment_1"


    // $ANTLR start "rule__Quantity__QuantityAssignment"
    // InternalMymix.g:812:1: rule__Quantity__QuantityAssignment : ( RULE_INT ) ;
    public final void rule__Quantity__QuantityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:816:1: ( ( RULE_INT ) )
            // InternalMymix.g:817:2: ( RULE_INT )
            {
            // InternalMymix.g:817:2: ( RULE_INT )
            // InternalMymix.g:818:3: RULE_INT
            {
             before(grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Quantity__QuantityAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});

}