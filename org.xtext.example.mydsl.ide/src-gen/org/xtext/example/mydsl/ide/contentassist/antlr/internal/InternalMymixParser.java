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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'procedure'", "'take'", "'from'", "'filter'", "'to'", "'put'", "'check'", "'forQuantity'", "'wait'", "'result'", "'cup'", "'mL'", "'sec'", "'A'", "'B'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMymix.g:62:1: ruleMachine : ( ( rule__Machine__ProceduresAssignment )* ) ;
    public final void ruleMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:66:2: ( ( ( rule__Machine__ProceduresAssignment )* ) )
            // InternalMymix.g:67:2: ( ( rule__Machine__ProceduresAssignment )* )
            {
            // InternalMymix.g:67:2: ( ( rule__Machine__ProceduresAssignment )* )
            // InternalMymix.g:68:3: ( rule__Machine__ProceduresAssignment )*
            {
             before(grammarAccess.getMachineAccess().getProceduresAssignment()); 
            // InternalMymix.g:69:3: ( rule__Machine__ProceduresAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMymix.g:69:4: rule__Machine__ProceduresAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Machine__ProceduresAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMachineAccess().getProceduresAssignment()); 

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


    // $ANTLR start "entryRuleProcedure"
    // InternalMymix.g:78:1: entryRuleProcedure : ruleProcedure EOF ;
    public final void entryRuleProcedure() throws RecognitionException {
        try {
            // InternalMymix.g:79:1: ( ruleProcedure EOF )
            // InternalMymix.g:80:1: ruleProcedure EOF
            {
             before(grammarAccess.getProcedureRule()); 
            pushFollow(FOLLOW_1);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getProcedureRule()); 
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
    // $ANTLR end "entryRuleProcedure"


    // $ANTLR start "ruleProcedure"
    // InternalMymix.g:87:1: ruleProcedure : ( ( rule__Procedure__Group__0 ) ) ;
    public final void ruleProcedure() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:91:2: ( ( ( rule__Procedure__Group__0 ) ) )
            // InternalMymix.g:92:2: ( ( rule__Procedure__Group__0 ) )
            {
            // InternalMymix.g:92:2: ( ( rule__Procedure__Group__0 ) )
            // InternalMymix.g:93:3: ( rule__Procedure__Group__0 )
            {
             before(grammarAccess.getProcedureAccess().getGroup()); 
            // InternalMymix.g:94:3: ( rule__Procedure__Group__0 )
            // InternalMymix.g:94:4: rule__Procedure__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getGroup()); 

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
    // $ANTLR end "ruleProcedure"


    // $ANTLR start "entryRuleOperation"
    // InternalMymix.g:103:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMymix.g:104:1: ( ruleOperation EOF )
            // InternalMymix.g:105:1: ruleOperation EOF
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
    // InternalMymix.g:112:1: ruleOperation : ( ( rule__Operation__Alternatives ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:116:2: ( ( ( rule__Operation__Alternatives ) ) )
            // InternalMymix.g:117:2: ( ( rule__Operation__Alternatives ) )
            {
            // InternalMymix.g:117:2: ( ( rule__Operation__Alternatives ) )
            // InternalMymix.g:118:3: ( rule__Operation__Alternatives )
            {
             before(grammarAccess.getOperationAccess().getAlternatives()); 
            // InternalMymix.g:119:3: ( rule__Operation__Alternatives )
            // InternalMymix.g:119:4: rule__Operation__Alternatives
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


    // $ANTLR start "entryRuleTakeStuff"
    // InternalMymix.g:128:1: entryRuleTakeStuff : ruleTakeStuff EOF ;
    public final void entryRuleTakeStuff() throws RecognitionException {
        try {
            // InternalMymix.g:129:1: ( ruleTakeStuff EOF )
            // InternalMymix.g:130:1: ruleTakeStuff EOF
            {
             before(grammarAccess.getTakeStuffRule()); 
            pushFollow(FOLLOW_1);
            ruleTakeStuff();

            state._fsp--;

             after(grammarAccess.getTakeStuffRule()); 
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
    // $ANTLR end "entryRuleTakeStuff"


    // $ANTLR start "ruleTakeStuff"
    // InternalMymix.g:137:1: ruleTakeStuff : ( ( rule__TakeStuff__Group__0 ) ) ;
    public final void ruleTakeStuff() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:141:2: ( ( ( rule__TakeStuff__Group__0 ) ) )
            // InternalMymix.g:142:2: ( ( rule__TakeStuff__Group__0 ) )
            {
            // InternalMymix.g:142:2: ( ( rule__TakeStuff__Group__0 ) )
            // InternalMymix.g:143:3: ( rule__TakeStuff__Group__0 )
            {
             before(grammarAccess.getTakeStuffAccess().getGroup()); 
            // InternalMymix.g:144:3: ( rule__TakeStuff__Group__0 )
            // InternalMymix.g:144:4: rule__TakeStuff__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TakeStuff__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTakeStuffAccess().getGroup()); 

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
    // $ANTLR end "ruleTakeStuff"


    // $ANTLR start "entryRuleTake"
    // InternalMymix.g:153:1: entryRuleTake : ruleTake EOF ;
    public final void entryRuleTake() throws RecognitionException {
        try {
            // InternalMymix.g:154:1: ( ruleTake EOF )
            // InternalMymix.g:155:1: ruleTake EOF
            {
             before(grammarAccess.getTakeRule()); 
            pushFollow(FOLLOW_1);
            ruleTake();

            state._fsp--;

             after(grammarAccess.getTakeRule()); 
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
    // $ANTLR end "entryRuleTake"


    // $ANTLR start "ruleTake"
    // InternalMymix.g:162:1: ruleTake : ( ( rule__Take__Group__0 ) ) ;
    public final void ruleTake() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:166:2: ( ( ( rule__Take__Group__0 ) ) )
            // InternalMymix.g:167:2: ( ( rule__Take__Group__0 ) )
            {
            // InternalMymix.g:167:2: ( ( rule__Take__Group__0 ) )
            // InternalMymix.g:168:3: ( rule__Take__Group__0 )
            {
             before(grammarAccess.getTakeAccess().getGroup()); 
            // InternalMymix.g:169:3: ( rule__Take__Group__0 )
            // InternalMymix.g:169:4: rule__Take__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Take__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTakeAccess().getGroup()); 

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
    // $ANTLR end "ruleTake"


    // $ANTLR start "entryRulePutSome"
    // InternalMymix.g:178:1: entryRulePutSome : rulePutSome EOF ;
    public final void entryRulePutSome() throws RecognitionException {
        try {
            // InternalMymix.g:179:1: ( rulePutSome EOF )
            // InternalMymix.g:180:1: rulePutSome EOF
            {
             before(grammarAccess.getPutSomeRule()); 
            pushFollow(FOLLOW_1);
            rulePutSome();

            state._fsp--;

             after(grammarAccess.getPutSomeRule()); 
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
    // $ANTLR end "entryRulePutSome"


    // $ANTLR start "rulePutSome"
    // InternalMymix.g:187:1: rulePutSome : ( ( ( rule__PutSome__Group__0 ) ) ( ( rule__PutSome__Group__0 )* ) ) ;
    public final void rulePutSome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:191:2: ( ( ( ( rule__PutSome__Group__0 ) ) ( ( rule__PutSome__Group__0 )* ) ) )
            // InternalMymix.g:192:2: ( ( ( rule__PutSome__Group__0 ) ) ( ( rule__PutSome__Group__0 )* ) )
            {
            // InternalMymix.g:192:2: ( ( ( rule__PutSome__Group__0 ) ) ( ( rule__PutSome__Group__0 )* ) )
            // InternalMymix.g:193:3: ( ( rule__PutSome__Group__0 ) ) ( ( rule__PutSome__Group__0 )* )
            {
            // InternalMymix.g:193:3: ( ( rule__PutSome__Group__0 ) )
            // InternalMymix.g:194:4: ( rule__PutSome__Group__0 )
            {
             before(grammarAccess.getPutSomeAccess().getGroup()); 
            // InternalMymix.g:195:4: ( rule__PutSome__Group__0 )
            // InternalMymix.g:195:5: rule__PutSome__Group__0
            {
            pushFollow(FOLLOW_4);
            rule__PutSome__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPutSomeAccess().getGroup()); 

            }

            // InternalMymix.g:198:3: ( ( rule__PutSome__Group__0 )* )
            // InternalMymix.g:199:4: ( rule__PutSome__Group__0 )*
            {
             before(grammarAccess.getPutSomeAccess().getGroup()); 
            // InternalMymix.g:200:4: ( rule__PutSome__Group__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    int LA2_2 = input.LA(2);

                    if ( (LA2_2==RULE_INT) ) {
                        int LA2_4 = input.LA(3);

                        if ( (LA2_4==23) ) {
                            int LA2_5 = input.LA(4);

                            if ( (LA2_5==16) ) {
                                alt2=1;
                            }


                        }
                        else if ( (LA2_4==16) ) {
                            alt2=1;
                        }


                    }


                }
                else if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMymix.g:200:5: rule__PutSome__Group__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__PutSome__Group__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getPutSomeAccess().getGroup()); 

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
    // $ANTLR end "rulePutSome"


    // $ANTLR start "entryRulePutAll"
    // InternalMymix.g:210:1: entryRulePutAll : rulePutAll EOF ;
    public final void entryRulePutAll() throws RecognitionException {
        try {
            // InternalMymix.g:211:1: ( rulePutAll EOF )
            // InternalMymix.g:212:1: rulePutAll EOF
            {
             before(grammarAccess.getPutAllRule()); 
            pushFollow(FOLLOW_1);
            rulePutAll();

            state._fsp--;

             after(grammarAccess.getPutAllRule()); 
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
    // $ANTLR end "entryRulePutAll"


    // $ANTLR start "rulePutAll"
    // InternalMymix.g:219:1: rulePutAll : ( ( rule__PutAll__Group__0 ) ) ;
    public final void rulePutAll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:223:2: ( ( ( rule__PutAll__Group__0 ) ) )
            // InternalMymix.g:224:2: ( ( rule__PutAll__Group__0 ) )
            {
            // InternalMymix.g:224:2: ( ( rule__PutAll__Group__0 ) )
            // InternalMymix.g:225:3: ( rule__PutAll__Group__0 )
            {
             before(grammarAccess.getPutAllAccess().getGroup()); 
            // InternalMymix.g:226:3: ( rule__PutAll__Group__0 )
            // InternalMymix.g:226:4: rule__PutAll__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PutAll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPutAllAccess().getGroup()); 

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
    // $ANTLR end "rulePutAll"


    // $ANTLR start "entryRulePut"
    // InternalMymix.g:235:1: entryRulePut : rulePut EOF ;
    public final void entryRulePut() throws RecognitionException {
        try {
            // InternalMymix.g:236:1: ( rulePut EOF )
            // InternalMymix.g:237:1: rulePut EOF
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
    // InternalMymix.g:244:1: rulePut : ( ( rule__Put__Group__0 ) ) ;
    public final void rulePut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:248:2: ( ( ( rule__Put__Group__0 ) ) )
            // InternalMymix.g:249:2: ( ( rule__Put__Group__0 ) )
            {
            // InternalMymix.g:249:2: ( ( rule__Put__Group__0 ) )
            // InternalMymix.g:250:3: ( rule__Put__Group__0 )
            {
             before(grammarAccess.getPutAccess().getGroup()); 
            // InternalMymix.g:251:3: ( rule__Put__Group__0 )
            // InternalMymix.g:251:4: rule__Put__Group__0
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


    // $ANTLR start "entryRuleCheck"
    // InternalMymix.g:260:1: entryRuleCheck : ruleCheck EOF ;
    public final void entryRuleCheck() throws RecognitionException {
        try {
            // InternalMymix.g:261:1: ( ruleCheck EOF )
            // InternalMymix.g:262:1: ruleCheck EOF
            {
             before(grammarAccess.getCheckRule()); 
            pushFollow(FOLLOW_1);
            ruleCheck();

            state._fsp--;

             after(grammarAccess.getCheckRule()); 
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
    // $ANTLR end "entryRuleCheck"


    // $ANTLR start "ruleCheck"
    // InternalMymix.g:269:1: ruleCheck : ( ( rule__Check__Group__0 ) ) ;
    public final void ruleCheck() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:273:2: ( ( ( rule__Check__Group__0 ) ) )
            // InternalMymix.g:274:2: ( ( rule__Check__Group__0 ) )
            {
            // InternalMymix.g:274:2: ( ( rule__Check__Group__0 ) )
            // InternalMymix.g:275:3: ( rule__Check__Group__0 )
            {
             before(grammarAccess.getCheckAccess().getGroup()); 
            // InternalMymix.g:276:3: ( rule__Check__Group__0 )
            // InternalMymix.g:276:4: rule__Check__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getGroup()); 

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
    // $ANTLR end "ruleCheck"


    // $ANTLR start "entryRuleWait"
    // InternalMymix.g:285:1: entryRuleWait : ruleWait EOF ;
    public final void entryRuleWait() throws RecognitionException {
        try {
            // InternalMymix.g:286:1: ( ruleWait EOF )
            // InternalMymix.g:287:1: ruleWait EOF
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
    // InternalMymix.g:294:1: ruleWait : ( ( rule__Wait__Group__0 ) ) ;
    public final void ruleWait() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:298:2: ( ( ( rule__Wait__Group__0 ) ) )
            // InternalMymix.g:299:2: ( ( rule__Wait__Group__0 ) )
            {
            // InternalMymix.g:299:2: ( ( rule__Wait__Group__0 ) )
            // InternalMymix.g:300:3: ( rule__Wait__Group__0 )
            {
             before(grammarAccess.getWaitAccess().getGroup()); 
            // InternalMymix.g:301:3: ( rule__Wait__Group__0 )
            // InternalMymix.g:301:4: rule__Wait__Group__0
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


    // $ANTLR start "entryRuleResult"
    // InternalMymix.g:310:1: entryRuleResult : ruleResult EOF ;
    public final void entryRuleResult() throws RecognitionException {
        try {
            // InternalMymix.g:311:1: ( ruleResult EOF )
            // InternalMymix.g:312:1: ruleResult EOF
            {
             before(grammarAccess.getResultRule()); 
            pushFollow(FOLLOW_1);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getResultRule()); 
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
    // $ANTLR end "entryRuleResult"


    // $ANTLR start "ruleResult"
    // InternalMymix.g:319:1: ruleResult : ( ( rule__Result__Group__0 ) ) ;
    public final void ruleResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:323:2: ( ( ( rule__Result__Group__0 ) ) )
            // InternalMymix.g:324:2: ( ( rule__Result__Group__0 ) )
            {
            // InternalMymix.g:324:2: ( ( rule__Result__Group__0 ) )
            // InternalMymix.g:325:3: ( rule__Result__Group__0 )
            {
             before(grammarAccess.getResultAccess().getGroup()); 
            // InternalMymix.g:326:3: ( rule__Result__Group__0 )
            // InternalMymix.g:326:4: rule__Result__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Result__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getGroup()); 

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
    // $ANTLR end "ruleResult"


    // $ANTLR start "entryRuleFilter"
    // InternalMymix.g:335:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalMymix.g:336:1: ( ruleFilter EOF )
            // InternalMymix.g:337:1: ruleFilter EOF
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
    // InternalMymix.g:344:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:348:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalMymix.g:349:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalMymix.g:349:2: ( ( rule__Filter__Alternatives ) )
            // InternalMymix.g:350:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalMymix.g:351:3: ( rule__Filter__Alternatives )
            // InternalMymix.g:351:4: rule__Filter__Alternatives
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
    // InternalMymix.g:360:1: entryRuleCup : ruleCup EOF ;
    public final void entryRuleCup() throws RecognitionException {
        try {
            // InternalMymix.g:361:1: ( ruleCup EOF )
            // InternalMymix.g:362:1: ruleCup EOF
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
    // InternalMymix.g:369:1: ruleCup : ( ( rule__Cup__Group__0 ) ) ;
    public final void ruleCup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:373:2: ( ( ( rule__Cup__Group__0 ) ) )
            // InternalMymix.g:374:2: ( ( rule__Cup__Group__0 ) )
            {
            // InternalMymix.g:374:2: ( ( rule__Cup__Group__0 ) )
            // InternalMymix.g:375:3: ( rule__Cup__Group__0 )
            {
             before(grammarAccess.getCupAccess().getGroup()); 
            // InternalMymix.g:376:3: ( rule__Cup__Group__0 )
            // InternalMymix.g:376:4: rule__Cup__Group__0
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
    // InternalMymix.g:385:1: entryRuleQuantity : ruleQuantity EOF ;
    public final void entryRuleQuantity() throws RecognitionException {
        try {
            // InternalMymix.g:386:1: ( ruleQuantity EOF )
            // InternalMymix.g:387:1: ruleQuantity EOF
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
    // InternalMymix.g:394:1: ruleQuantity : ( ( rule__Quantity__Group__0 ) ) ;
    public final void ruleQuantity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:398:2: ( ( ( rule__Quantity__Group__0 ) ) )
            // InternalMymix.g:399:2: ( ( rule__Quantity__Group__0 ) )
            {
            // InternalMymix.g:399:2: ( ( rule__Quantity__Group__0 ) )
            // InternalMymix.g:400:3: ( rule__Quantity__Group__0 )
            {
             before(grammarAccess.getQuantityAccess().getGroup()); 
            // InternalMymix.g:401:3: ( rule__Quantity__Group__0 )
            // InternalMymix.g:401:4: rule__Quantity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getGroup()); 

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


    // $ANTLR start "entryRuleTime"
    // InternalMymix.g:410:1: entryRuleTime : ruleTime EOF ;
    public final void entryRuleTime() throws RecognitionException {
        try {
            // InternalMymix.g:411:1: ( ruleTime EOF )
            // InternalMymix.g:412:1: ruleTime EOF
            {
             before(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getTimeRule()); 
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
    // $ANTLR end "entryRuleTime"


    // $ANTLR start "ruleTime"
    // InternalMymix.g:419:1: ruleTime : ( ( rule__Time__Group__0 ) ) ;
    public final void ruleTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:423:2: ( ( ( rule__Time__Group__0 ) ) )
            // InternalMymix.g:424:2: ( ( rule__Time__Group__0 ) )
            {
            // InternalMymix.g:424:2: ( ( rule__Time__Group__0 ) )
            // InternalMymix.g:425:3: ( rule__Time__Group__0 )
            {
             before(grammarAccess.getTimeAccess().getGroup()); 
            // InternalMymix.g:426:3: ( rule__Time__Group__0 )
            // InternalMymix.g:426:4: rule__Time__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getGroup()); 

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
    // $ANTLR end "ruleTime"


    // $ANTLR start "rule__Operation__Alternatives"
    // InternalMymix.g:434:1: rule__Operation__Alternatives : ( ( ruleCheck ) | ( ruleWait ) | ( ruleTakeStuff ) );
    public final void rule__Operation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:438:1: ( ( ruleCheck ) | ( ruleWait ) | ( ruleTakeStuff ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt3=1;
                }
                break;
            case 19:
                {
                alt3=2;
                }
                break;
            case 12:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMymix.g:439:2: ( ruleCheck )
                    {
                    // InternalMymix.g:439:2: ( ruleCheck )
                    // InternalMymix.g:440:3: ruleCheck
                    {
                     before(grammarAccess.getOperationAccess().getCheckParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCheck();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getCheckParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:445:2: ( ruleWait )
                    {
                    // InternalMymix.g:445:2: ( ruleWait )
                    // InternalMymix.g:446:3: ruleWait
                    {
                     before(grammarAccess.getOperationAccess().getWaitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleWait();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getWaitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMymix.g:451:2: ( ruleTakeStuff )
                    {
                    // InternalMymix.g:451:2: ( ruleTakeStuff )
                    // InternalMymix.g:452:3: ruleTakeStuff
                    {
                     before(grammarAccess.getOperationAccess().getTakeStuffParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleTakeStuff();

                    state._fsp--;

                     after(grammarAccess.getOperationAccess().getTakeStuffParserRuleCall_2()); 

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


    // $ANTLR start "rule__TakeStuff__Alternatives_1"
    // InternalMymix.g:461:1: rule__TakeStuff__Alternatives_1 : ( ( ( rule__TakeStuff__BodyAssignment_1_0 ) ) | ( ( rule__TakeStuff__BodyAssignment_1_1 ) ) );
    public final void rule__TakeStuff__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:465:1: ( ( ( rule__TakeStuff__BodyAssignment_1_0 ) ) | ( ( rule__TakeStuff__BodyAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16||LA4_0==19) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMymix.g:466:2: ( ( rule__TakeStuff__BodyAssignment_1_0 ) )
                    {
                    // InternalMymix.g:466:2: ( ( rule__TakeStuff__BodyAssignment_1_0 ) )
                    // InternalMymix.g:467:3: ( rule__TakeStuff__BodyAssignment_1_0 )
                    {
                     before(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_0()); 
                    // InternalMymix.g:468:3: ( rule__TakeStuff__BodyAssignment_1_0 )
                    // InternalMymix.g:468:4: rule__TakeStuff__BodyAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TakeStuff__BodyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMymix.g:472:2: ( ( rule__TakeStuff__BodyAssignment_1_1 ) )
                    {
                    // InternalMymix.g:472:2: ( ( rule__TakeStuff__BodyAssignment_1_1 ) )
                    // InternalMymix.g:473:3: ( rule__TakeStuff__BodyAssignment_1_1 )
                    {
                     before(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_1()); 
                    // InternalMymix.g:474:3: ( rule__TakeStuff__BodyAssignment_1_1 )
                    // InternalMymix.g:474:4: rule__TakeStuff__BodyAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TakeStuff__BodyAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTakeStuffAccess().getBodyAssignment_1_1()); 

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
    // $ANTLR end "rule__TakeStuff__Alternatives_1"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalMymix.g:482:1: rule__Filter__Alternatives : ( ( ( rule__Filter__FilterAssignment_0 ) ) | ( ( rule__Filter__FilterAssignment_1 ) ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:486:1: ( ( ( rule__Filter__FilterAssignment_0 ) ) | ( ( rule__Filter__FilterAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMymix.g:487:2: ( ( rule__Filter__FilterAssignment_0 ) )
                    {
                    // InternalMymix.g:487:2: ( ( rule__Filter__FilterAssignment_0 ) )
                    // InternalMymix.g:488:3: ( rule__Filter__FilterAssignment_0 )
                    {
                     before(grammarAccess.getFilterAccess().getFilterAssignment_0()); 
                    // InternalMymix.g:489:3: ( rule__Filter__FilterAssignment_0 )
                    // InternalMymix.g:489:4: rule__Filter__FilterAssignment_0
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
                    // InternalMymix.g:493:2: ( ( rule__Filter__FilterAssignment_1 ) )
                    {
                    // InternalMymix.g:493:2: ( ( rule__Filter__FilterAssignment_1 ) )
                    // InternalMymix.g:494:3: ( rule__Filter__FilterAssignment_1 )
                    {
                     before(grammarAccess.getFilterAccess().getFilterAssignment_1()); 
                    // InternalMymix.g:495:3: ( rule__Filter__FilterAssignment_1 )
                    // InternalMymix.g:495:4: rule__Filter__FilterAssignment_1
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


    // $ANTLR start "rule__Procedure__Group__0"
    // InternalMymix.g:503:1: rule__Procedure__Group__0 : rule__Procedure__Group__0__Impl rule__Procedure__Group__1 ;
    public final void rule__Procedure__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:507:1: ( rule__Procedure__Group__0__Impl rule__Procedure__Group__1 )
            // InternalMymix.g:508:2: rule__Procedure__Group__0__Impl rule__Procedure__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Procedure__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__1();

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
    // $ANTLR end "rule__Procedure__Group__0"


    // $ANTLR start "rule__Procedure__Group__0__Impl"
    // InternalMymix.g:515:1: rule__Procedure__Group__0__Impl : ( 'procedure' ) ;
    public final void rule__Procedure__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:519:1: ( ( 'procedure' ) )
            // InternalMymix.g:520:1: ( 'procedure' )
            {
            // InternalMymix.g:520:1: ( 'procedure' )
            // InternalMymix.g:521:2: 'procedure'
            {
             before(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getProcedureKeyword_0()); 

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
    // $ANTLR end "rule__Procedure__Group__0__Impl"


    // $ANTLR start "rule__Procedure__Group__1"
    // InternalMymix.g:530:1: rule__Procedure__Group__1 : rule__Procedure__Group__1__Impl rule__Procedure__Group__2 ;
    public final void rule__Procedure__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:534:1: ( rule__Procedure__Group__1__Impl rule__Procedure__Group__2 )
            // InternalMymix.g:535:2: rule__Procedure__Group__1__Impl rule__Procedure__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Procedure__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__2();

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
    // $ANTLR end "rule__Procedure__Group__1"


    // $ANTLR start "rule__Procedure__Group__1__Impl"
    // InternalMymix.g:542:1: rule__Procedure__Group__1__Impl : ( ( rule__Procedure__NameAssignment_1 ) ) ;
    public final void rule__Procedure__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:546:1: ( ( ( rule__Procedure__NameAssignment_1 ) ) )
            // InternalMymix.g:547:1: ( ( rule__Procedure__NameAssignment_1 ) )
            {
            // InternalMymix.g:547:1: ( ( rule__Procedure__NameAssignment_1 ) )
            // InternalMymix.g:548:2: ( rule__Procedure__NameAssignment_1 )
            {
             before(grammarAccess.getProcedureAccess().getNameAssignment_1()); 
            // InternalMymix.g:549:2: ( rule__Procedure__NameAssignment_1 )
            // InternalMymix.g:549:3: rule__Procedure__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Procedure__Group__1__Impl"


    // $ANTLR start "rule__Procedure__Group__2"
    // InternalMymix.g:557:1: rule__Procedure__Group__2 : rule__Procedure__Group__2__Impl rule__Procedure__Group__3 ;
    public final void rule__Procedure__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:561:1: ( rule__Procedure__Group__2__Impl rule__Procedure__Group__3 )
            // InternalMymix.g:562:2: rule__Procedure__Group__2__Impl rule__Procedure__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Procedure__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3();

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
    // $ANTLR end "rule__Procedure__Group__2"


    // $ANTLR start "rule__Procedure__Group__2__Impl"
    // InternalMymix.g:569:1: rule__Procedure__Group__2__Impl : ( ( ( rule__Procedure__BodyAssignment_2 ) ) ( ( rule__Procedure__BodyAssignment_2 )* ) ) ;
    public final void rule__Procedure__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:573:1: ( ( ( ( rule__Procedure__BodyAssignment_2 ) ) ( ( rule__Procedure__BodyAssignment_2 )* ) ) )
            // InternalMymix.g:574:1: ( ( ( rule__Procedure__BodyAssignment_2 ) ) ( ( rule__Procedure__BodyAssignment_2 )* ) )
            {
            // InternalMymix.g:574:1: ( ( ( rule__Procedure__BodyAssignment_2 ) ) ( ( rule__Procedure__BodyAssignment_2 )* ) )
            // InternalMymix.g:575:2: ( ( rule__Procedure__BodyAssignment_2 ) ) ( ( rule__Procedure__BodyAssignment_2 )* )
            {
            // InternalMymix.g:575:2: ( ( rule__Procedure__BodyAssignment_2 ) )
            // InternalMymix.g:576:3: ( rule__Procedure__BodyAssignment_2 )
            {
             before(grammarAccess.getProcedureAccess().getBodyAssignment_2()); 
            // InternalMymix.g:577:3: ( rule__Procedure__BodyAssignment_2 )
            // InternalMymix.g:577:4: rule__Procedure__BodyAssignment_2
            {
            pushFollow(FOLLOW_8);
            rule__Procedure__BodyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getBodyAssignment_2()); 

            }

            // InternalMymix.g:580:2: ( ( rule__Procedure__BodyAssignment_2 )* )
            // InternalMymix.g:581:3: ( rule__Procedure__BodyAssignment_2 )*
            {
             before(grammarAccess.getProcedureAccess().getBodyAssignment_2()); 
            // InternalMymix.g:582:3: ( rule__Procedure__BodyAssignment_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12||LA6_0==17||LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMymix.g:582:4: rule__Procedure__BodyAssignment_2
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Procedure__BodyAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getProcedureAccess().getBodyAssignment_2()); 

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
    // $ANTLR end "rule__Procedure__Group__2__Impl"


    // $ANTLR start "rule__Procedure__Group__3"
    // InternalMymix.g:591:1: rule__Procedure__Group__3 : rule__Procedure__Group__3__Impl ;
    public final void rule__Procedure__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:595:1: ( rule__Procedure__Group__3__Impl )
            // InternalMymix.g:596:2: rule__Procedure__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__Group__3__Impl();

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
    // $ANTLR end "rule__Procedure__Group__3"


    // $ANTLR start "rule__Procedure__Group__3__Impl"
    // InternalMymix.g:602:1: rule__Procedure__Group__3__Impl : ( ( rule__Procedure__ResultAssignment_3 ) ) ;
    public final void rule__Procedure__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:606:1: ( ( ( rule__Procedure__ResultAssignment_3 ) ) )
            // InternalMymix.g:607:1: ( ( rule__Procedure__ResultAssignment_3 ) )
            {
            // InternalMymix.g:607:1: ( ( rule__Procedure__ResultAssignment_3 ) )
            // InternalMymix.g:608:2: ( rule__Procedure__ResultAssignment_3 )
            {
             before(grammarAccess.getProcedureAccess().getResultAssignment_3()); 
            // InternalMymix.g:609:2: ( rule__Procedure__ResultAssignment_3 )
            // InternalMymix.g:609:3: rule__Procedure__ResultAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Procedure__ResultAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProcedureAccess().getResultAssignment_3()); 

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
    // $ANTLR end "rule__Procedure__Group__3__Impl"


    // $ANTLR start "rule__TakeStuff__Group__0"
    // InternalMymix.g:618:1: rule__TakeStuff__Group__0 : rule__TakeStuff__Group__0__Impl rule__TakeStuff__Group__1 ;
    public final void rule__TakeStuff__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:622:1: ( rule__TakeStuff__Group__0__Impl rule__TakeStuff__Group__1 )
            // InternalMymix.g:623:2: rule__TakeStuff__Group__0__Impl rule__TakeStuff__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__TakeStuff__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TakeStuff__Group__1();

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
    // $ANTLR end "rule__TakeStuff__Group__0"


    // $ANTLR start "rule__TakeStuff__Group__0__Impl"
    // InternalMymix.g:630:1: rule__TakeStuff__Group__0__Impl : ( ( rule__TakeStuff__OpAssignment_0 ) ) ;
    public final void rule__TakeStuff__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:634:1: ( ( ( rule__TakeStuff__OpAssignment_0 ) ) )
            // InternalMymix.g:635:1: ( ( rule__TakeStuff__OpAssignment_0 ) )
            {
            // InternalMymix.g:635:1: ( ( rule__TakeStuff__OpAssignment_0 ) )
            // InternalMymix.g:636:2: ( rule__TakeStuff__OpAssignment_0 )
            {
             before(grammarAccess.getTakeStuffAccess().getOpAssignment_0()); 
            // InternalMymix.g:637:2: ( rule__TakeStuff__OpAssignment_0 )
            // InternalMymix.g:637:3: rule__TakeStuff__OpAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TakeStuff__OpAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTakeStuffAccess().getOpAssignment_0()); 

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
    // $ANTLR end "rule__TakeStuff__Group__0__Impl"


    // $ANTLR start "rule__TakeStuff__Group__1"
    // InternalMymix.g:645:1: rule__TakeStuff__Group__1 : rule__TakeStuff__Group__1__Impl ;
    public final void rule__TakeStuff__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:649:1: ( rule__TakeStuff__Group__1__Impl )
            // InternalMymix.g:650:2: rule__TakeStuff__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TakeStuff__Group__1__Impl();

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
    // $ANTLR end "rule__TakeStuff__Group__1"


    // $ANTLR start "rule__TakeStuff__Group__1__Impl"
    // InternalMymix.g:656:1: rule__TakeStuff__Group__1__Impl : ( ( rule__TakeStuff__Alternatives_1 ) ) ;
    public final void rule__TakeStuff__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:660:1: ( ( ( rule__TakeStuff__Alternatives_1 ) ) )
            // InternalMymix.g:661:1: ( ( rule__TakeStuff__Alternatives_1 ) )
            {
            // InternalMymix.g:661:1: ( ( rule__TakeStuff__Alternatives_1 ) )
            // InternalMymix.g:662:2: ( rule__TakeStuff__Alternatives_1 )
            {
             before(grammarAccess.getTakeStuffAccess().getAlternatives_1()); 
            // InternalMymix.g:663:2: ( rule__TakeStuff__Alternatives_1 )
            // InternalMymix.g:663:3: rule__TakeStuff__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__TakeStuff__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getTakeStuffAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__TakeStuff__Group__1__Impl"


    // $ANTLR start "rule__Take__Group__0"
    // InternalMymix.g:672:1: rule__Take__Group__0 : rule__Take__Group__0__Impl rule__Take__Group__1 ;
    public final void rule__Take__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:676:1: ( rule__Take__Group__0__Impl rule__Take__Group__1 )
            // InternalMymix.g:677:2: rule__Take__Group__0__Impl rule__Take__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Take__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Take__Group__1();

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
    // $ANTLR end "rule__Take__Group__0"


    // $ANTLR start "rule__Take__Group__0__Impl"
    // InternalMymix.g:684:1: rule__Take__Group__0__Impl : ( 'take' ) ;
    public final void rule__Take__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:688:1: ( ( 'take' ) )
            // InternalMymix.g:689:1: ( 'take' )
            {
            // InternalMymix.g:689:1: ( 'take' )
            // InternalMymix.g:690:2: 'take'
            {
             before(grammarAccess.getTakeAccess().getTakeKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTakeAccess().getTakeKeyword_0()); 

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
    // $ANTLR end "rule__Take__Group__0__Impl"


    // $ANTLR start "rule__Take__Group__1"
    // InternalMymix.g:699:1: rule__Take__Group__1 : rule__Take__Group__1__Impl rule__Take__Group__2 ;
    public final void rule__Take__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:703:1: ( rule__Take__Group__1__Impl rule__Take__Group__2 )
            // InternalMymix.g:704:2: rule__Take__Group__1__Impl rule__Take__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Take__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Take__Group__2();

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
    // $ANTLR end "rule__Take__Group__1"


    // $ANTLR start "rule__Take__Group__1__Impl"
    // InternalMymix.g:711:1: rule__Take__Group__1__Impl : ( ( rule__Take__QuantityAssignment_1 ) ) ;
    public final void rule__Take__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:715:1: ( ( ( rule__Take__QuantityAssignment_1 ) ) )
            // InternalMymix.g:716:1: ( ( rule__Take__QuantityAssignment_1 ) )
            {
            // InternalMymix.g:716:1: ( ( rule__Take__QuantityAssignment_1 ) )
            // InternalMymix.g:717:2: ( rule__Take__QuantityAssignment_1 )
            {
             before(grammarAccess.getTakeAccess().getQuantityAssignment_1()); 
            // InternalMymix.g:718:2: ( rule__Take__QuantityAssignment_1 )
            // InternalMymix.g:718:3: rule__Take__QuantityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Take__QuantityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTakeAccess().getQuantityAssignment_1()); 

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
    // $ANTLR end "rule__Take__Group__1__Impl"


    // $ANTLR start "rule__Take__Group__2"
    // InternalMymix.g:726:1: rule__Take__Group__2 : rule__Take__Group__2__Impl rule__Take__Group__3 ;
    public final void rule__Take__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:730:1: ( rule__Take__Group__2__Impl rule__Take__Group__3 )
            // InternalMymix.g:731:2: rule__Take__Group__2__Impl rule__Take__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Take__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Take__Group__3();

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
    // $ANTLR end "rule__Take__Group__2"


    // $ANTLR start "rule__Take__Group__2__Impl"
    // InternalMymix.g:738:1: rule__Take__Group__2__Impl : ( 'from' ) ;
    public final void rule__Take__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:742:1: ( ( 'from' ) )
            // InternalMymix.g:743:1: ( 'from' )
            {
            // InternalMymix.g:743:1: ( 'from' )
            // InternalMymix.g:744:2: 'from'
            {
             before(grammarAccess.getTakeAccess().getFromKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTakeAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__Take__Group__2__Impl"


    // $ANTLR start "rule__Take__Group__3"
    // InternalMymix.g:753:1: rule__Take__Group__3 : rule__Take__Group__3__Impl rule__Take__Group__4 ;
    public final void rule__Take__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:757:1: ( rule__Take__Group__3__Impl rule__Take__Group__4 )
            // InternalMymix.g:758:2: rule__Take__Group__3__Impl rule__Take__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Take__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Take__Group__4();

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
    // $ANTLR end "rule__Take__Group__3"


    // $ANTLR start "rule__Take__Group__3__Impl"
    // InternalMymix.g:765:1: rule__Take__Group__3__Impl : ( ( rule__Take__CupAssignment_3 ) ) ;
    public final void rule__Take__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:769:1: ( ( ( rule__Take__CupAssignment_3 ) ) )
            // InternalMymix.g:770:1: ( ( rule__Take__CupAssignment_3 ) )
            {
            // InternalMymix.g:770:1: ( ( rule__Take__CupAssignment_3 ) )
            // InternalMymix.g:771:2: ( rule__Take__CupAssignment_3 )
            {
             before(grammarAccess.getTakeAccess().getCupAssignment_3()); 
            // InternalMymix.g:772:2: ( rule__Take__CupAssignment_3 )
            // InternalMymix.g:772:3: rule__Take__CupAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Take__CupAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTakeAccess().getCupAssignment_3()); 

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
    // $ANTLR end "rule__Take__Group__3__Impl"


    // $ANTLR start "rule__Take__Group__4"
    // InternalMymix.g:780:1: rule__Take__Group__4 : rule__Take__Group__4__Impl ;
    public final void rule__Take__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:784:1: ( rule__Take__Group__4__Impl )
            // InternalMymix.g:785:2: rule__Take__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Take__Group__4__Impl();

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
    // $ANTLR end "rule__Take__Group__4"


    // $ANTLR start "rule__Take__Group__4__Impl"
    // InternalMymix.g:791:1: rule__Take__Group__4__Impl : ( ( rule__Take__Group_4__0 )? ) ;
    public final void rule__Take__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:795:1: ( ( ( rule__Take__Group_4__0 )? ) )
            // InternalMymix.g:796:1: ( ( rule__Take__Group_4__0 )? )
            {
            // InternalMymix.g:796:1: ( ( rule__Take__Group_4__0 )? )
            // InternalMymix.g:797:2: ( rule__Take__Group_4__0 )?
            {
             before(grammarAccess.getTakeAccess().getGroup_4()); 
            // InternalMymix.g:798:2: ( rule__Take__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMymix.g:798:3: rule__Take__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Take__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTakeAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Take__Group__4__Impl"


    // $ANTLR start "rule__Take__Group_4__0"
    // InternalMymix.g:807:1: rule__Take__Group_4__0 : rule__Take__Group_4__0__Impl rule__Take__Group_4__1 ;
    public final void rule__Take__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:811:1: ( rule__Take__Group_4__0__Impl rule__Take__Group_4__1 )
            // InternalMymix.g:812:2: rule__Take__Group_4__0__Impl rule__Take__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Take__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Take__Group_4__1();

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
    // $ANTLR end "rule__Take__Group_4__0"


    // $ANTLR start "rule__Take__Group_4__0__Impl"
    // InternalMymix.g:819:1: rule__Take__Group_4__0__Impl : ( 'filter' ) ;
    public final void rule__Take__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:823:1: ( ( 'filter' ) )
            // InternalMymix.g:824:1: ( 'filter' )
            {
            // InternalMymix.g:824:1: ( 'filter' )
            // InternalMymix.g:825:2: 'filter'
            {
             before(grammarAccess.getTakeAccess().getFilterKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTakeAccess().getFilterKeyword_4_0()); 

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
    // $ANTLR end "rule__Take__Group_4__0__Impl"


    // $ANTLR start "rule__Take__Group_4__1"
    // InternalMymix.g:834:1: rule__Take__Group_4__1 : rule__Take__Group_4__1__Impl ;
    public final void rule__Take__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:838:1: ( rule__Take__Group_4__1__Impl )
            // InternalMymix.g:839:2: rule__Take__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Take__Group_4__1__Impl();

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
    // $ANTLR end "rule__Take__Group_4__1"


    // $ANTLR start "rule__Take__Group_4__1__Impl"
    // InternalMymix.g:845:1: rule__Take__Group_4__1__Impl : ( ( rule__Take__FilterAssignment_4_1 ) ) ;
    public final void rule__Take__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:849:1: ( ( ( rule__Take__FilterAssignment_4_1 ) ) )
            // InternalMymix.g:850:1: ( ( rule__Take__FilterAssignment_4_1 ) )
            {
            // InternalMymix.g:850:1: ( ( rule__Take__FilterAssignment_4_1 ) )
            // InternalMymix.g:851:2: ( rule__Take__FilterAssignment_4_1 )
            {
             before(grammarAccess.getTakeAccess().getFilterAssignment_4_1()); 
            // InternalMymix.g:852:2: ( rule__Take__FilterAssignment_4_1 )
            // InternalMymix.g:852:3: rule__Take__FilterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Take__FilterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTakeAccess().getFilterAssignment_4_1()); 

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
    // $ANTLR end "rule__Take__Group_4__1__Impl"


    // $ANTLR start "rule__PutSome__Group__0"
    // InternalMymix.g:861:1: rule__PutSome__Group__0 : rule__PutSome__Group__0__Impl rule__PutSome__Group__1 ;
    public final void rule__PutSome__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:865:1: ( rule__PutSome__Group__0__Impl rule__PutSome__Group__1 )
            // InternalMymix.g:866:2: rule__PutSome__Group__0__Impl rule__PutSome__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__PutSome__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutSome__Group__1();

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
    // $ANTLR end "rule__PutSome__Group__0"


    // $ANTLR start "rule__PutSome__Group__0__Impl"
    // InternalMymix.g:873:1: rule__PutSome__Group__0__Impl : ( ( rule__PutSome__WaitAssignment_0 )? ) ;
    public final void rule__PutSome__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:877:1: ( ( ( rule__PutSome__WaitAssignment_0 )? ) )
            // InternalMymix.g:878:1: ( ( rule__PutSome__WaitAssignment_0 )? )
            {
            // InternalMymix.g:878:1: ( ( rule__PutSome__WaitAssignment_0 )? )
            // InternalMymix.g:879:2: ( rule__PutSome__WaitAssignment_0 )?
            {
             before(grammarAccess.getPutSomeAccess().getWaitAssignment_0()); 
            // InternalMymix.g:880:2: ( rule__PutSome__WaitAssignment_0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMymix.g:880:3: rule__PutSome__WaitAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PutSome__WaitAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPutSomeAccess().getWaitAssignment_0()); 

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
    // $ANTLR end "rule__PutSome__Group__0__Impl"


    // $ANTLR start "rule__PutSome__Group__1"
    // InternalMymix.g:888:1: rule__PutSome__Group__1 : rule__PutSome__Group__1__Impl ;
    public final void rule__PutSome__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:892:1: ( rule__PutSome__Group__1__Impl )
            // InternalMymix.g:893:2: rule__PutSome__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PutSome__Group__1__Impl();

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
    // $ANTLR end "rule__PutSome__Group__1"


    // $ANTLR start "rule__PutSome__Group__1__Impl"
    // InternalMymix.g:899:1: rule__PutSome__Group__1__Impl : ( ( rule__PutSome__PutAssignment_1 ) ) ;
    public final void rule__PutSome__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:903:1: ( ( ( rule__PutSome__PutAssignment_1 ) ) )
            // InternalMymix.g:904:1: ( ( rule__PutSome__PutAssignment_1 ) )
            {
            // InternalMymix.g:904:1: ( ( rule__PutSome__PutAssignment_1 ) )
            // InternalMymix.g:905:2: ( rule__PutSome__PutAssignment_1 )
            {
             before(grammarAccess.getPutSomeAccess().getPutAssignment_1()); 
            // InternalMymix.g:906:2: ( rule__PutSome__PutAssignment_1 )
            // InternalMymix.g:906:3: rule__PutSome__PutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PutSome__PutAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPutSomeAccess().getPutAssignment_1()); 

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
    // $ANTLR end "rule__PutSome__Group__1__Impl"


    // $ANTLR start "rule__PutAll__Group__0"
    // InternalMymix.g:915:1: rule__PutAll__Group__0 : rule__PutAll__Group__0__Impl rule__PutAll__Group__1 ;
    public final void rule__PutAll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:919:1: ( rule__PutAll__Group__0__Impl rule__PutAll__Group__1 )
            // InternalMymix.g:920:2: rule__PutAll__Group__0__Impl rule__PutAll__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PutAll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutAll__Group__1();

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
    // $ANTLR end "rule__PutAll__Group__0"


    // $ANTLR start "rule__PutAll__Group__0__Impl"
    // InternalMymix.g:927:1: rule__PutAll__Group__0__Impl : ( 'to' ) ;
    public final void rule__PutAll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:931:1: ( ( 'to' ) )
            // InternalMymix.g:932:1: ( 'to' )
            {
            // InternalMymix.g:932:1: ( 'to' )
            // InternalMymix.g:933:2: 'to'
            {
             before(grammarAccess.getPutAllAccess().getToKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPutAllAccess().getToKeyword_0()); 

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
    // $ANTLR end "rule__PutAll__Group__0__Impl"


    // $ANTLR start "rule__PutAll__Group__1"
    // InternalMymix.g:942:1: rule__PutAll__Group__1 : rule__PutAll__Group__1__Impl rule__PutAll__Group__2 ;
    public final void rule__PutAll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:946:1: ( rule__PutAll__Group__1__Impl rule__PutAll__Group__2 )
            // InternalMymix.g:947:2: rule__PutAll__Group__1__Impl rule__PutAll__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__PutAll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutAll__Group__2();

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
    // $ANTLR end "rule__PutAll__Group__1"


    // $ANTLR start "rule__PutAll__Group__1__Impl"
    // InternalMymix.g:954:1: rule__PutAll__Group__1__Impl : ( ( rule__PutAll__CupAssignment_1 ) ) ;
    public final void rule__PutAll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:958:1: ( ( ( rule__PutAll__CupAssignment_1 ) ) )
            // InternalMymix.g:959:1: ( ( rule__PutAll__CupAssignment_1 ) )
            {
            // InternalMymix.g:959:1: ( ( rule__PutAll__CupAssignment_1 ) )
            // InternalMymix.g:960:2: ( rule__PutAll__CupAssignment_1 )
            {
             before(grammarAccess.getPutAllAccess().getCupAssignment_1()); 
            // InternalMymix.g:961:2: ( rule__PutAll__CupAssignment_1 )
            // InternalMymix.g:961:3: rule__PutAll__CupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PutAll__CupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPutAllAccess().getCupAssignment_1()); 

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
    // $ANTLR end "rule__PutAll__Group__1__Impl"


    // $ANTLR start "rule__PutAll__Group__2"
    // InternalMymix.g:969:1: rule__PutAll__Group__2 : rule__PutAll__Group__2__Impl ;
    public final void rule__PutAll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:973:1: ( rule__PutAll__Group__2__Impl )
            // InternalMymix.g:974:2: rule__PutAll__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PutAll__Group__2__Impl();

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
    // $ANTLR end "rule__PutAll__Group__2"


    // $ANTLR start "rule__PutAll__Group__2__Impl"
    // InternalMymix.g:980:1: rule__PutAll__Group__2__Impl : ( ( rule__PutAll__Group_2__0 )? ) ;
    public final void rule__PutAll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:984:1: ( ( ( rule__PutAll__Group_2__0 )? ) )
            // InternalMymix.g:985:1: ( ( rule__PutAll__Group_2__0 )? )
            {
            // InternalMymix.g:985:1: ( ( rule__PutAll__Group_2__0 )? )
            // InternalMymix.g:986:2: ( rule__PutAll__Group_2__0 )?
            {
             before(grammarAccess.getPutAllAccess().getGroup_2()); 
            // InternalMymix.g:987:2: ( rule__PutAll__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMymix.g:987:3: rule__PutAll__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PutAll__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPutAllAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PutAll__Group__2__Impl"


    // $ANTLR start "rule__PutAll__Group_2__0"
    // InternalMymix.g:996:1: rule__PutAll__Group_2__0 : rule__PutAll__Group_2__0__Impl rule__PutAll__Group_2__1 ;
    public final void rule__PutAll__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1000:1: ( rule__PutAll__Group_2__0__Impl rule__PutAll__Group_2__1 )
            // InternalMymix.g:1001:2: rule__PutAll__Group_2__0__Impl rule__PutAll__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__PutAll__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PutAll__Group_2__1();

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
    // $ANTLR end "rule__PutAll__Group_2__0"


    // $ANTLR start "rule__PutAll__Group_2__0__Impl"
    // InternalMymix.g:1008:1: rule__PutAll__Group_2__0__Impl : ( 'filter' ) ;
    public final void rule__PutAll__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1012:1: ( ( 'filter' ) )
            // InternalMymix.g:1013:1: ( 'filter' )
            {
            // InternalMymix.g:1013:1: ( 'filter' )
            // InternalMymix.g:1014:2: 'filter'
            {
             before(grammarAccess.getPutAllAccess().getFilterKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPutAllAccess().getFilterKeyword_2_0()); 

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
    // $ANTLR end "rule__PutAll__Group_2__0__Impl"


    // $ANTLR start "rule__PutAll__Group_2__1"
    // InternalMymix.g:1023:1: rule__PutAll__Group_2__1 : rule__PutAll__Group_2__1__Impl ;
    public final void rule__PutAll__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1027:1: ( rule__PutAll__Group_2__1__Impl )
            // InternalMymix.g:1028:2: rule__PutAll__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PutAll__Group_2__1__Impl();

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
    // $ANTLR end "rule__PutAll__Group_2__1"


    // $ANTLR start "rule__PutAll__Group_2__1__Impl"
    // InternalMymix.g:1034:1: rule__PutAll__Group_2__1__Impl : ( ( rule__PutAll__FilterAssignment_2_1 ) ) ;
    public final void rule__PutAll__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1038:1: ( ( ( rule__PutAll__FilterAssignment_2_1 ) ) )
            // InternalMymix.g:1039:1: ( ( rule__PutAll__FilterAssignment_2_1 ) )
            {
            // InternalMymix.g:1039:1: ( ( rule__PutAll__FilterAssignment_2_1 ) )
            // InternalMymix.g:1040:2: ( rule__PutAll__FilterAssignment_2_1 )
            {
             before(grammarAccess.getPutAllAccess().getFilterAssignment_2_1()); 
            // InternalMymix.g:1041:2: ( rule__PutAll__FilterAssignment_2_1 )
            // InternalMymix.g:1041:3: rule__PutAll__FilterAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__PutAll__FilterAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getPutAllAccess().getFilterAssignment_2_1()); 

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
    // $ANTLR end "rule__PutAll__Group_2__1__Impl"


    // $ANTLR start "rule__Put__Group__0"
    // InternalMymix.g:1050:1: rule__Put__Group__0 : rule__Put__Group__0__Impl rule__Put__Group__1 ;
    public final void rule__Put__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1054:1: ( rule__Put__Group__0__Impl rule__Put__Group__1 )
            // InternalMymix.g:1055:2: rule__Put__Group__0__Impl rule__Put__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMymix.g:1062:1: rule__Put__Group__0__Impl : ( 'put' ) ;
    public final void rule__Put__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1066:1: ( ( 'put' ) )
            // InternalMymix.g:1067:1: ( 'put' )
            {
            // InternalMymix.g:1067:1: ( 'put' )
            // InternalMymix.g:1068:2: 'put'
            {
             before(grammarAccess.getPutAccess().getPutKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMymix.g:1077:1: rule__Put__Group__1 : rule__Put__Group__1__Impl rule__Put__Group__2 ;
    public final void rule__Put__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1081:1: ( rule__Put__Group__1__Impl rule__Put__Group__2 )
            // InternalMymix.g:1082:2: rule__Put__Group__1__Impl rule__Put__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalMymix.g:1089:1: rule__Put__Group__1__Impl : ( ( rule__Put__QuantityAssignment_1 ) ) ;
    public final void rule__Put__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1093:1: ( ( ( rule__Put__QuantityAssignment_1 ) ) )
            // InternalMymix.g:1094:1: ( ( rule__Put__QuantityAssignment_1 ) )
            {
            // InternalMymix.g:1094:1: ( ( rule__Put__QuantityAssignment_1 ) )
            // InternalMymix.g:1095:2: ( rule__Put__QuantityAssignment_1 )
            {
             before(grammarAccess.getPutAccess().getQuantityAssignment_1()); 
            // InternalMymix.g:1096:2: ( rule__Put__QuantityAssignment_1 )
            // InternalMymix.g:1096:3: rule__Put__QuantityAssignment_1
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
    // InternalMymix.g:1104:1: rule__Put__Group__2 : rule__Put__Group__2__Impl rule__Put__Group__3 ;
    public final void rule__Put__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1108:1: ( rule__Put__Group__2__Impl rule__Put__Group__3 )
            // InternalMymix.g:1109:2: rule__Put__Group__2__Impl rule__Put__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMymix.g:1116:1: rule__Put__Group__2__Impl : ( 'to' ) ;
    public final void rule__Put__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1120:1: ( ( 'to' ) )
            // InternalMymix.g:1121:1: ( 'to' )
            {
            // InternalMymix.g:1121:1: ( 'to' )
            // InternalMymix.g:1122:2: 'to'
            {
             before(grammarAccess.getPutAccess().getToKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getToKeyword_2()); 

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
    // InternalMymix.g:1131:1: rule__Put__Group__3 : rule__Put__Group__3__Impl rule__Put__Group__4 ;
    public final void rule__Put__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1135:1: ( rule__Put__Group__3__Impl rule__Put__Group__4 )
            // InternalMymix.g:1136:2: rule__Put__Group__3__Impl rule__Put__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalMymix.g:1143:1: rule__Put__Group__3__Impl : ( ( rule__Put__CupAssignment_3 ) ) ;
    public final void rule__Put__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1147:1: ( ( ( rule__Put__CupAssignment_3 ) ) )
            // InternalMymix.g:1148:1: ( ( rule__Put__CupAssignment_3 ) )
            {
            // InternalMymix.g:1148:1: ( ( rule__Put__CupAssignment_3 ) )
            // InternalMymix.g:1149:2: ( rule__Put__CupAssignment_3 )
            {
             before(grammarAccess.getPutAccess().getCupAssignment_3()); 
            // InternalMymix.g:1150:2: ( rule__Put__CupAssignment_3 )
            // InternalMymix.g:1150:3: rule__Put__CupAssignment_3
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
    // InternalMymix.g:1158:1: rule__Put__Group__4 : rule__Put__Group__4__Impl ;
    public final void rule__Put__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1162:1: ( rule__Put__Group__4__Impl )
            // InternalMymix.g:1163:2: rule__Put__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Put__Group__4__Impl();

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
    // InternalMymix.g:1169:1: rule__Put__Group__4__Impl : ( ( rule__Put__Group_4__0 )? ) ;
    public final void rule__Put__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1173:1: ( ( ( rule__Put__Group_4__0 )? ) )
            // InternalMymix.g:1174:1: ( ( rule__Put__Group_4__0 )? )
            {
            // InternalMymix.g:1174:1: ( ( rule__Put__Group_4__0 )? )
            // InternalMymix.g:1175:2: ( rule__Put__Group_4__0 )?
            {
             before(grammarAccess.getPutAccess().getGroup_4()); 
            // InternalMymix.g:1176:2: ( rule__Put__Group_4__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==14) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMymix.g:1176:3: rule__Put__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Put__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPutAccess().getGroup_4()); 

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


    // $ANTLR start "rule__Put__Group_4__0"
    // InternalMymix.g:1185:1: rule__Put__Group_4__0 : rule__Put__Group_4__0__Impl rule__Put__Group_4__1 ;
    public final void rule__Put__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1189:1: ( rule__Put__Group_4__0__Impl rule__Put__Group_4__1 )
            // InternalMymix.g:1190:2: rule__Put__Group_4__0__Impl rule__Put__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Put__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Put__Group_4__1();

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
    // $ANTLR end "rule__Put__Group_4__0"


    // $ANTLR start "rule__Put__Group_4__0__Impl"
    // InternalMymix.g:1197:1: rule__Put__Group_4__0__Impl : ( 'filter' ) ;
    public final void rule__Put__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1201:1: ( ( 'filter' ) )
            // InternalMymix.g:1202:1: ( 'filter' )
            {
            // InternalMymix.g:1202:1: ( 'filter' )
            // InternalMymix.g:1203:2: 'filter'
            {
             before(grammarAccess.getPutAccess().getFilterKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPutAccess().getFilterKeyword_4_0()); 

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
    // $ANTLR end "rule__Put__Group_4__0__Impl"


    // $ANTLR start "rule__Put__Group_4__1"
    // InternalMymix.g:1212:1: rule__Put__Group_4__1 : rule__Put__Group_4__1__Impl ;
    public final void rule__Put__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1216:1: ( rule__Put__Group_4__1__Impl )
            // InternalMymix.g:1217:2: rule__Put__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Put__Group_4__1__Impl();

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
    // $ANTLR end "rule__Put__Group_4__1"


    // $ANTLR start "rule__Put__Group_4__1__Impl"
    // InternalMymix.g:1223:1: rule__Put__Group_4__1__Impl : ( ( rule__Put__FilterAssignment_4_1 ) ) ;
    public final void rule__Put__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1227:1: ( ( ( rule__Put__FilterAssignment_4_1 ) ) )
            // InternalMymix.g:1228:1: ( ( rule__Put__FilterAssignment_4_1 ) )
            {
            // InternalMymix.g:1228:1: ( ( rule__Put__FilterAssignment_4_1 ) )
            // InternalMymix.g:1229:2: ( rule__Put__FilterAssignment_4_1 )
            {
             before(grammarAccess.getPutAccess().getFilterAssignment_4_1()); 
            // InternalMymix.g:1230:2: ( rule__Put__FilterAssignment_4_1 )
            // InternalMymix.g:1230:3: rule__Put__FilterAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Put__FilterAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPutAccess().getFilterAssignment_4_1()); 

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
    // $ANTLR end "rule__Put__Group_4__1__Impl"


    // $ANTLR start "rule__Check__Group__0"
    // InternalMymix.g:1239:1: rule__Check__Group__0 : rule__Check__Group__0__Impl rule__Check__Group__1 ;
    public final void rule__Check__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1243:1: ( rule__Check__Group__0__Impl rule__Check__Group__1 )
            // InternalMymix.g:1244:2: rule__Check__Group__0__Impl rule__Check__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Check__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__1();

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
    // $ANTLR end "rule__Check__Group__0"


    // $ANTLR start "rule__Check__Group__0__Impl"
    // InternalMymix.g:1251:1: rule__Check__Group__0__Impl : ( 'check' ) ;
    public final void rule__Check__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1255:1: ( ( 'check' ) )
            // InternalMymix.g:1256:1: ( 'check' )
            {
            // InternalMymix.g:1256:1: ( 'check' )
            // InternalMymix.g:1257:2: 'check'
            {
             before(grammarAccess.getCheckAccess().getCheckKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getCheckKeyword_0()); 

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
    // $ANTLR end "rule__Check__Group__0__Impl"


    // $ANTLR start "rule__Check__Group__1"
    // InternalMymix.g:1266:1: rule__Check__Group__1 : rule__Check__Group__1__Impl rule__Check__Group__2 ;
    public final void rule__Check__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1270:1: ( rule__Check__Group__1__Impl rule__Check__Group__2 )
            // InternalMymix.g:1271:2: rule__Check__Group__1__Impl rule__Check__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Check__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group__2();

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
    // $ANTLR end "rule__Check__Group__1"


    // $ANTLR start "rule__Check__Group__1__Impl"
    // InternalMymix.g:1278:1: rule__Check__Group__1__Impl : ( ( rule__Check__CupAssignment_1 ) ) ;
    public final void rule__Check__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1282:1: ( ( ( rule__Check__CupAssignment_1 ) ) )
            // InternalMymix.g:1283:1: ( ( rule__Check__CupAssignment_1 ) )
            {
            // InternalMymix.g:1283:1: ( ( rule__Check__CupAssignment_1 ) )
            // InternalMymix.g:1284:2: ( rule__Check__CupAssignment_1 )
            {
             before(grammarAccess.getCheckAccess().getCupAssignment_1()); 
            // InternalMymix.g:1285:2: ( rule__Check__CupAssignment_1 )
            // InternalMymix.g:1285:3: rule__Check__CupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__CupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getCupAssignment_1()); 

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
    // $ANTLR end "rule__Check__Group__1__Impl"


    // $ANTLR start "rule__Check__Group__2"
    // InternalMymix.g:1293:1: rule__Check__Group__2 : rule__Check__Group__2__Impl ;
    public final void rule__Check__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1297:1: ( rule__Check__Group__2__Impl )
            // InternalMymix.g:1298:2: rule__Check__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group__2__Impl();

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
    // $ANTLR end "rule__Check__Group__2"


    // $ANTLR start "rule__Check__Group__2__Impl"
    // InternalMymix.g:1304:1: rule__Check__Group__2__Impl : ( ( rule__Check__Group_2__0 )? ) ;
    public final void rule__Check__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1308:1: ( ( ( rule__Check__Group_2__0 )? ) )
            // InternalMymix.g:1309:1: ( ( rule__Check__Group_2__0 )? )
            {
            // InternalMymix.g:1309:1: ( ( rule__Check__Group_2__0 )? )
            // InternalMymix.g:1310:2: ( rule__Check__Group_2__0 )?
            {
             before(grammarAccess.getCheckAccess().getGroup_2()); 
            // InternalMymix.g:1311:2: ( rule__Check__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMymix.g:1311:3: rule__Check__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Check__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCheckAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Check__Group__2__Impl"


    // $ANTLR start "rule__Check__Group_2__0"
    // InternalMymix.g:1320:1: rule__Check__Group_2__0 : rule__Check__Group_2__0__Impl rule__Check__Group_2__1 ;
    public final void rule__Check__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1324:1: ( rule__Check__Group_2__0__Impl rule__Check__Group_2__1 )
            // InternalMymix.g:1325:2: rule__Check__Group_2__0__Impl rule__Check__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__Check__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Check__Group_2__1();

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
    // $ANTLR end "rule__Check__Group_2__0"


    // $ANTLR start "rule__Check__Group_2__0__Impl"
    // InternalMymix.g:1332:1: rule__Check__Group_2__0__Impl : ( 'forQuantity' ) ;
    public final void rule__Check__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1336:1: ( ( 'forQuantity' ) )
            // InternalMymix.g:1337:1: ( 'forQuantity' )
            {
            // InternalMymix.g:1337:1: ( 'forQuantity' )
            // InternalMymix.g:1338:2: 'forQuantity'
            {
             before(grammarAccess.getCheckAccess().getForQuantityKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCheckAccess().getForQuantityKeyword_2_0()); 

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
    // $ANTLR end "rule__Check__Group_2__0__Impl"


    // $ANTLR start "rule__Check__Group_2__1"
    // InternalMymix.g:1347:1: rule__Check__Group_2__1 : rule__Check__Group_2__1__Impl ;
    public final void rule__Check__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1351:1: ( rule__Check__Group_2__1__Impl )
            // InternalMymix.g:1352:2: rule__Check__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Check__Group_2__1__Impl();

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
    // $ANTLR end "rule__Check__Group_2__1"


    // $ANTLR start "rule__Check__Group_2__1__Impl"
    // InternalMymix.g:1358:1: rule__Check__Group_2__1__Impl : ( ( rule__Check__QuantityAssignment_2_1 ) ) ;
    public final void rule__Check__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1362:1: ( ( ( rule__Check__QuantityAssignment_2_1 ) ) )
            // InternalMymix.g:1363:1: ( ( rule__Check__QuantityAssignment_2_1 ) )
            {
            // InternalMymix.g:1363:1: ( ( rule__Check__QuantityAssignment_2_1 ) )
            // InternalMymix.g:1364:2: ( rule__Check__QuantityAssignment_2_1 )
            {
             before(grammarAccess.getCheckAccess().getQuantityAssignment_2_1()); 
            // InternalMymix.g:1365:2: ( rule__Check__QuantityAssignment_2_1 )
            // InternalMymix.g:1365:3: rule__Check__QuantityAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Check__QuantityAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCheckAccess().getQuantityAssignment_2_1()); 

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
    // $ANTLR end "rule__Check__Group_2__1__Impl"


    // $ANTLR start "rule__Wait__Group__0"
    // InternalMymix.g:1374:1: rule__Wait__Group__0 : rule__Wait__Group__0__Impl rule__Wait__Group__1 ;
    public final void rule__Wait__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1378:1: ( rule__Wait__Group__0__Impl rule__Wait__Group__1 )
            // InternalMymix.g:1379:2: rule__Wait__Group__0__Impl rule__Wait__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalMymix.g:1386:1: rule__Wait__Group__0__Impl : ( 'wait' ) ;
    public final void rule__Wait__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1390:1: ( ( 'wait' ) )
            // InternalMymix.g:1391:1: ( 'wait' )
            {
            // InternalMymix.g:1391:1: ( 'wait' )
            // InternalMymix.g:1392:2: 'wait'
            {
             before(grammarAccess.getWaitAccess().getWaitKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMymix.g:1401:1: rule__Wait__Group__1 : rule__Wait__Group__1__Impl ;
    public final void rule__Wait__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1405:1: ( rule__Wait__Group__1__Impl )
            // InternalMymix.g:1406:2: rule__Wait__Group__1__Impl
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
    // InternalMymix.g:1412:1: rule__Wait__Group__1__Impl : ( ( rule__Wait__TimeAssignment_1 ) ) ;
    public final void rule__Wait__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1416:1: ( ( ( rule__Wait__TimeAssignment_1 ) ) )
            // InternalMymix.g:1417:1: ( ( rule__Wait__TimeAssignment_1 ) )
            {
            // InternalMymix.g:1417:1: ( ( rule__Wait__TimeAssignment_1 ) )
            // InternalMymix.g:1418:2: ( rule__Wait__TimeAssignment_1 )
            {
             before(grammarAccess.getWaitAccess().getTimeAssignment_1()); 
            // InternalMymix.g:1419:2: ( rule__Wait__TimeAssignment_1 )
            // InternalMymix.g:1419:3: rule__Wait__TimeAssignment_1
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


    // $ANTLR start "rule__Result__Group__0"
    // InternalMymix.g:1428:1: rule__Result__Group__0 : rule__Result__Group__0__Impl rule__Result__Group__1 ;
    public final void rule__Result__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1432:1: ( rule__Result__Group__0__Impl rule__Result__Group__1 )
            // InternalMymix.g:1433:2: rule__Result__Group__0__Impl rule__Result__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Result__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Result__Group__1();

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
    // $ANTLR end "rule__Result__Group__0"


    // $ANTLR start "rule__Result__Group__0__Impl"
    // InternalMymix.g:1440:1: rule__Result__Group__0__Impl : ( 'result' ) ;
    public final void rule__Result__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1444:1: ( ( 'result' ) )
            // InternalMymix.g:1445:1: ( 'result' )
            {
            // InternalMymix.g:1445:1: ( 'result' )
            // InternalMymix.g:1446:2: 'result'
            {
             before(grammarAccess.getResultAccess().getResultKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResultAccess().getResultKeyword_0()); 

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
    // $ANTLR end "rule__Result__Group__0__Impl"


    // $ANTLR start "rule__Result__Group__1"
    // InternalMymix.g:1455:1: rule__Result__Group__1 : rule__Result__Group__1__Impl ;
    public final void rule__Result__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1459:1: ( rule__Result__Group__1__Impl )
            // InternalMymix.g:1460:2: rule__Result__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Result__Group__1__Impl();

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
    // $ANTLR end "rule__Result__Group__1"


    // $ANTLR start "rule__Result__Group__1__Impl"
    // InternalMymix.g:1466:1: rule__Result__Group__1__Impl : ( ( rule__Result__CupAssignment_1 ) ) ;
    public final void rule__Result__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1470:1: ( ( ( rule__Result__CupAssignment_1 ) ) )
            // InternalMymix.g:1471:1: ( ( rule__Result__CupAssignment_1 ) )
            {
            // InternalMymix.g:1471:1: ( ( rule__Result__CupAssignment_1 ) )
            // InternalMymix.g:1472:2: ( rule__Result__CupAssignment_1 )
            {
             before(grammarAccess.getResultAccess().getCupAssignment_1()); 
            // InternalMymix.g:1473:2: ( rule__Result__CupAssignment_1 )
            // InternalMymix.g:1473:3: rule__Result__CupAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Result__CupAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResultAccess().getCupAssignment_1()); 

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
    // $ANTLR end "rule__Result__Group__1__Impl"


    // $ANTLR start "rule__Cup__Group__0"
    // InternalMymix.g:1482:1: rule__Cup__Group__0 : rule__Cup__Group__0__Impl rule__Cup__Group__1 ;
    public final void rule__Cup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1486:1: ( rule__Cup__Group__0__Impl rule__Cup__Group__1 )
            // InternalMymix.g:1487:2: rule__Cup__Group__0__Impl rule__Cup__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMymix.g:1494:1: rule__Cup__Group__0__Impl : ( ( 'cup' )? ) ;
    public final void rule__Cup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1498:1: ( ( ( 'cup' )? ) )
            // InternalMymix.g:1499:1: ( ( 'cup' )? )
            {
            // InternalMymix.g:1499:1: ( ( 'cup' )? )
            // InternalMymix.g:1500:2: ( 'cup' )?
            {
             before(grammarAccess.getCupAccess().getCupKeyword_0()); 
            // InternalMymix.g:1501:2: ( 'cup' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==21) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMymix.g:1501:3: 'cup'
                    {
                    match(input,21,FOLLOW_2); 

                    }
                    break;

            }

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
    // InternalMymix.g:1509:1: rule__Cup__Group__1 : rule__Cup__Group__1__Impl ;
    public final void rule__Cup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1513:1: ( rule__Cup__Group__1__Impl )
            // InternalMymix.g:1514:2: rule__Cup__Group__1__Impl
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
    // InternalMymix.g:1520:1: rule__Cup__Group__1__Impl : ( ( rule__Cup__CupAssignment_1 ) ) ;
    public final void rule__Cup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1524:1: ( ( ( rule__Cup__CupAssignment_1 ) ) )
            // InternalMymix.g:1525:1: ( ( rule__Cup__CupAssignment_1 ) )
            {
            // InternalMymix.g:1525:1: ( ( rule__Cup__CupAssignment_1 ) )
            // InternalMymix.g:1526:2: ( rule__Cup__CupAssignment_1 )
            {
             before(grammarAccess.getCupAccess().getCupAssignment_1()); 
            // InternalMymix.g:1527:2: ( rule__Cup__CupAssignment_1 )
            // InternalMymix.g:1527:3: rule__Cup__CupAssignment_1
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


    // $ANTLR start "rule__Quantity__Group__0"
    // InternalMymix.g:1536:1: rule__Quantity__Group__0 : rule__Quantity__Group__0__Impl rule__Quantity__Group__1 ;
    public final void rule__Quantity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1540:1: ( rule__Quantity__Group__0__Impl rule__Quantity__Group__1 )
            // InternalMymix.g:1541:2: rule__Quantity__Group__0__Impl rule__Quantity__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Quantity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1();

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
    // $ANTLR end "rule__Quantity__Group__0"


    // $ANTLR start "rule__Quantity__Group__0__Impl"
    // InternalMymix.g:1548:1: rule__Quantity__Group__0__Impl : ( ( rule__Quantity__QuantityAssignment_0 ) ) ;
    public final void rule__Quantity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1552:1: ( ( ( rule__Quantity__QuantityAssignment_0 ) ) )
            // InternalMymix.g:1553:1: ( ( rule__Quantity__QuantityAssignment_0 ) )
            {
            // InternalMymix.g:1553:1: ( ( rule__Quantity__QuantityAssignment_0 ) )
            // InternalMymix.g:1554:2: ( rule__Quantity__QuantityAssignment_0 )
            {
             before(grammarAccess.getQuantityAccess().getQuantityAssignment_0()); 
            // InternalMymix.g:1555:2: ( rule__Quantity__QuantityAssignment_0 )
            // InternalMymix.g:1555:3: rule__Quantity__QuantityAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__QuantityAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQuantityAccess().getQuantityAssignment_0()); 

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
    // $ANTLR end "rule__Quantity__Group__0__Impl"


    // $ANTLR start "rule__Quantity__Group__1"
    // InternalMymix.g:1563:1: rule__Quantity__Group__1 : rule__Quantity__Group__1__Impl ;
    public final void rule__Quantity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1567:1: ( rule__Quantity__Group__1__Impl )
            // InternalMymix.g:1568:2: rule__Quantity__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Quantity__Group__1__Impl();

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
    // $ANTLR end "rule__Quantity__Group__1"


    // $ANTLR start "rule__Quantity__Group__1__Impl"
    // InternalMymix.g:1574:1: rule__Quantity__Group__1__Impl : ( ( 'mL' )? ) ;
    public final void rule__Quantity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1578:1: ( ( ( 'mL' )? ) )
            // InternalMymix.g:1579:1: ( ( 'mL' )? )
            {
            // InternalMymix.g:1579:1: ( ( 'mL' )? )
            // InternalMymix.g:1580:2: ( 'mL' )?
            {
             before(grammarAccess.getQuantityAccess().getMLKeyword_1()); 
            // InternalMymix.g:1581:2: ( 'mL' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMymix.g:1581:3: 'mL'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQuantityAccess().getMLKeyword_1()); 

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
    // $ANTLR end "rule__Quantity__Group__1__Impl"


    // $ANTLR start "rule__Time__Group__0"
    // InternalMymix.g:1590:1: rule__Time__Group__0 : rule__Time__Group__0__Impl rule__Time__Group__1 ;
    public final void rule__Time__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1594:1: ( rule__Time__Group__0__Impl rule__Time__Group__1 )
            // InternalMymix.g:1595:2: rule__Time__Group__0__Impl rule__Time__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Time__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Time__Group__1();

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
    // $ANTLR end "rule__Time__Group__0"


    // $ANTLR start "rule__Time__Group__0__Impl"
    // InternalMymix.g:1602:1: rule__Time__Group__0__Impl : ( ( rule__Time__TimeAssignment_0 ) ) ;
    public final void rule__Time__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1606:1: ( ( ( rule__Time__TimeAssignment_0 ) ) )
            // InternalMymix.g:1607:1: ( ( rule__Time__TimeAssignment_0 ) )
            {
            // InternalMymix.g:1607:1: ( ( rule__Time__TimeAssignment_0 ) )
            // InternalMymix.g:1608:2: ( rule__Time__TimeAssignment_0 )
            {
             before(grammarAccess.getTimeAccess().getTimeAssignment_0()); 
            // InternalMymix.g:1609:2: ( rule__Time__TimeAssignment_0 )
            // InternalMymix.g:1609:3: rule__Time__TimeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Time__TimeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeAccess().getTimeAssignment_0()); 

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
    // $ANTLR end "rule__Time__Group__0__Impl"


    // $ANTLR start "rule__Time__Group__1"
    // InternalMymix.g:1617:1: rule__Time__Group__1 : rule__Time__Group__1__Impl ;
    public final void rule__Time__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1621:1: ( rule__Time__Group__1__Impl )
            // InternalMymix.g:1622:2: rule__Time__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Time__Group__1__Impl();

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
    // $ANTLR end "rule__Time__Group__1"


    // $ANTLR start "rule__Time__Group__1__Impl"
    // InternalMymix.g:1628:1: rule__Time__Group__1__Impl : ( ( 'sec' )? ) ;
    public final void rule__Time__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1632:1: ( ( ( 'sec' )? ) )
            // InternalMymix.g:1633:1: ( ( 'sec' )? )
            {
            // InternalMymix.g:1633:1: ( ( 'sec' )? )
            // InternalMymix.g:1634:2: ( 'sec' )?
            {
             before(grammarAccess.getTimeAccess().getSecKeyword_1()); 
            // InternalMymix.g:1635:2: ( 'sec' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMymix.g:1635:3: 'sec'
                    {
                    match(input,23,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTimeAccess().getSecKeyword_1()); 

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
    // $ANTLR end "rule__Time__Group__1__Impl"


    // $ANTLR start "rule__Machine__ProceduresAssignment"
    // InternalMymix.g:1644:1: rule__Machine__ProceduresAssignment : ( ruleProcedure ) ;
    public final void rule__Machine__ProceduresAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1648:1: ( ( ruleProcedure ) )
            // InternalMymix.g:1649:2: ( ruleProcedure )
            {
            // InternalMymix.g:1649:2: ( ruleProcedure )
            // InternalMymix.g:1650:3: ruleProcedure
            {
             before(grammarAccess.getMachineAccess().getProceduresProcedureParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleProcedure();

            state._fsp--;

             after(grammarAccess.getMachineAccess().getProceduresProcedureParserRuleCall_0()); 

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
    // $ANTLR end "rule__Machine__ProceduresAssignment"


    // $ANTLR start "rule__Procedure__NameAssignment_1"
    // InternalMymix.g:1659:1: rule__Procedure__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Procedure__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1663:1: ( ( RULE_ID ) )
            // InternalMymix.g:1664:2: ( RULE_ID )
            {
            // InternalMymix.g:1664:2: ( RULE_ID )
            // InternalMymix.g:1665:3: RULE_ID
            {
             before(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProcedureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Procedure__NameAssignment_1"


    // $ANTLR start "rule__Procedure__BodyAssignment_2"
    // InternalMymix.g:1674:1: rule__Procedure__BodyAssignment_2 : ( ruleOperation ) ;
    public final void rule__Procedure__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1678:1: ( ( ruleOperation ) )
            // InternalMymix.g:1679:2: ( ruleOperation )
            {
            // InternalMymix.g:1679:2: ( ruleOperation )
            // InternalMymix.g:1680:3: ruleOperation
            {
             before(grammarAccess.getProcedureAccess().getBodyOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getBodyOperationParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Procedure__BodyAssignment_2"


    // $ANTLR start "rule__Procedure__ResultAssignment_3"
    // InternalMymix.g:1689:1: rule__Procedure__ResultAssignment_3 : ( ruleResult ) ;
    public final void rule__Procedure__ResultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1693:1: ( ( ruleResult ) )
            // InternalMymix.g:1694:2: ( ruleResult )
            {
            // InternalMymix.g:1694:2: ( ruleResult )
            // InternalMymix.g:1695:3: ruleResult
            {
             before(grammarAccess.getProcedureAccess().getResultResultParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleResult();

            state._fsp--;

             after(grammarAccess.getProcedureAccess().getResultResultParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Procedure__ResultAssignment_3"


    // $ANTLR start "rule__TakeStuff__OpAssignment_0"
    // InternalMymix.g:1704:1: rule__TakeStuff__OpAssignment_0 : ( ruleTake ) ;
    public final void rule__TakeStuff__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1708:1: ( ( ruleTake ) )
            // InternalMymix.g:1709:2: ( ruleTake )
            {
            // InternalMymix.g:1709:2: ( ruleTake )
            // InternalMymix.g:1710:3: ruleTake
            {
             before(grammarAccess.getTakeStuffAccess().getOpTakeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTake();

            state._fsp--;

             after(grammarAccess.getTakeStuffAccess().getOpTakeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__TakeStuff__OpAssignment_0"


    // $ANTLR start "rule__TakeStuff__BodyAssignment_1_0"
    // InternalMymix.g:1719:1: rule__TakeStuff__BodyAssignment_1_0 : ( rulePutSome ) ;
    public final void rule__TakeStuff__BodyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1723:1: ( ( rulePutSome ) )
            // InternalMymix.g:1724:2: ( rulePutSome )
            {
            // InternalMymix.g:1724:2: ( rulePutSome )
            // InternalMymix.g:1725:3: rulePutSome
            {
             before(grammarAccess.getTakeStuffAccess().getBodyPutSomeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            rulePutSome();

            state._fsp--;

             after(grammarAccess.getTakeStuffAccess().getBodyPutSomeParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__TakeStuff__BodyAssignment_1_0"


    // $ANTLR start "rule__TakeStuff__BodyAssignment_1_1"
    // InternalMymix.g:1734:1: rule__TakeStuff__BodyAssignment_1_1 : ( rulePutAll ) ;
    public final void rule__TakeStuff__BodyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1738:1: ( ( rulePutAll ) )
            // InternalMymix.g:1739:2: ( rulePutAll )
            {
            // InternalMymix.g:1739:2: ( rulePutAll )
            // InternalMymix.g:1740:3: rulePutAll
            {
             before(grammarAccess.getTakeStuffAccess().getBodyPutAllParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePutAll();

            state._fsp--;

             after(grammarAccess.getTakeStuffAccess().getBodyPutAllParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__TakeStuff__BodyAssignment_1_1"


    // $ANTLR start "rule__Take__QuantityAssignment_1"
    // InternalMymix.g:1749:1: rule__Take__QuantityAssignment_1 : ( ruleQuantity ) ;
    public final void rule__Take__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1753:1: ( ( ruleQuantity ) )
            // InternalMymix.g:1754:2: ( ruleQuantity )
            {
            // InternalMymix.g:1754:2: ( ruleQuantity )
            // InternalMymix.g:1755:3: ruleQuantity
            {
             before(grammarAccess.getTakeAccess().getQuantityQuantityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getTakeAccess().getQuantityQuantityParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Take__QuantityAssignment_1"


    // $ANTLR start "rule__Take__CupAssignment_3"
    // InternalMymix.g:1764:1: rule__Take__CupAssignment_3 : ( ruleCup ) ;
    public final void rule__Take__CupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1768:1: ( ( ruleCup ) )
            // InternalMymix.g:1769:2: ( ruleCup )
            {
            // InternalMymix.g:1769:2: ( ruleCup )
            // InternalMymix.g:1770:3: ruleCup
            {
             before(grammarAccess.getTakeAccess().getCupCupParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getTakeAccess().getCupCupParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Take__CupAssignment_3"


    // $ANTLR start "rule__Take__FilterAssignment_4_1"
    // InternalMymix.g:1779:1: rule__Take__FilterAssignment_4_1 : ( ruleFilter ) ;
    public final void rule__Take__FilterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1783:1: ( ( ruleFilter ) )
            // InternalMymix.g:1784:2: ( ruleFilter )
            {
            // InternalMymix.g:1784:2: ( ruleFilter )
            // InternalMymix.g:1785:3: ruleFilter
            {
             before(grammarAccess.getTakeAccess().getFilterFilterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getTakeAccess().getFilterFilterParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Take__FilterAssignment_4_1"


    // $ANTLR start "rule__PutSome__WaitAssignment_0"
    // InternalMymix.g:1794:1: rule__PutSome__WaitAssignment_0 : ( ruleWait ) ;
    public final void rule__PutSome__WaitAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1798:1: ( ( ruleWait ) )
            // InternalMymix.g:1799:2: ( ruleWait )
            {
            // InternalMymix.g:1799:2: ( ruleWait )
            // InternalMymix.g:1800:3: ruleWait
            {
             before(grammarAccess.getPutSomeAccess().getWaitWaitParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleWait();

            state._fsp--;

             after(grammarAccess.getPutSomeAccess().getWaitWaitParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PutSome__WaitAssignment_0"


    // $ANTLR start "rule__PutSome__PutAssignment_1"
    // InternalMymix.g:1809:1: rule__PutSome__PutAssignment_1 : ( rulePut ) ;
    public final void rule__PutSome__PutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1813:1: ( ( rulePut ) )
            // InternalMymix.g:1814:2: ( rulePut )
            {
            // InternalMymix.g:1814:2: ( rulePut )
            // InternalMymix.g:1815:3: rulePut
            {
             before(grammarAccess.getPutSomeAccess().getPutPutParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePut();

            state._fsp--;

             after(grammarAccess.getPutSomeAccess().getPutPutParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PutSome__PutAssignment_1"


    // $ANTLR start "rule__PutAll__CupAssignment_1"
    // InternalMymix.g:1824:1: rule__PutAll__CupAssignment_1 : ( ruleCup ) ;
    public final void rule__PutAll__CupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1828:1: ( ( ruleCup ) )
            // InternalMymix.g:1829:2: ( ruleCup )
            {
            // InternalMymix.g:1829:2: ( ruleCup )
            // InternalMymix.g:1830:3: ruleCup
            {
             before(grammarAccess.getPutAllAccess().getCupCupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getPutAllAccess().getCupCupParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PutAll__CupAssignment_1"


    // $ANTLR start "rule__PutAll__FilterAssignment_2_1"
    // InternalMymix.g:1839:1: rule__PutAll__FilterAssignment_2_1 : ( ruleFilter ) ;
    public final void rule__PutAll__FilterAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1843:1: ( ( ruleFilter ) )
            // InternalMymix.g:1844:2: ( ruleFilter )
            {
            // InternalMymix.g:1844:2: ( ruleFilter )
            // InternalMymix.g:1845:3: ruleFilter
            {
             before(grammarAccess.getPutAllAccess().getFilterFilterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPutAllAccess().getFilterFilterParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__PutAll__FilterAssignment_2_1"


    // $ANTLR start "rule__Put__QuantityAssignment_1"
    // InternalMymix.g:1854:1: rule__Put__QuantityAssignment_1 : ( ruleQuantity ) ;
    public final void rule__Put__QuantityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1858:1: ( ( ruleQuantity ) )
            // InternalMymix.g:1859:2: ( ruleQuantity )
            {
            // InternalMymix.g:1859:2: ( ruleQuantity )
            // InternalMymix.g:1860:3: ruleQuantity
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
    // InternalMymix.g:1869:1: rule__Put__CupAssignment_3 : ( ruleCup ) ;
    public final void rule__Put__CupAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1873:1: ( ( ruleCup ) )
            // InternalMymix.g:1874:2: ( ruleCup )
            {
            // InternalMymix.g:1874:2: ( ruleCup )
            // InternalMymix.g:1875:3: ruleCup
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


    // $ANTLR start "rule__Put__FilterAssignment_4_1"
    // InternalMymix.g:1884:1: rule__Put__FilterAssignment_4_1 : ( ruleFilter ) ;
    public final void rule__Put__FilterAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1888:1: ( ( ruleFilter ) )
            // InternalMymix.g:1889:2: ( ruleFilter )
            {
            // InternalMymix.g:1889:2: ( ruleFilter )
            // InternalMymix.g:1890:3: ruleFilter
            {
             before(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getPutAccess().getFilterFilterParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Put__FilterAssignment_4_1"


    // $ANTLR start "rule__Check__CupAssignment_1"
    // InternalMymix.g:1899:1: rule__Check__CupAssignment_1 : ( ruleCup ) ;
    public final void rule__Check__CupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1903:1: ( ( ruleCup ) )
            // InternalMymix.g:1904:2: ( ruleCup )
            {
            // InternalMymix.g:1904:2: ( ruleCup )
            // InternalMymix.g:1905:3: ruleCup
            {
             before(grammarAccess.getCheckAccess().getCupCupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getCupCupParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Check__CupAssignment_1"


    // $ANTLR start "rule__Check__QuantityAssignment_2_1"
    // InternalMymix.g:1914:1: rule__Check__QuantityAssignment_2_1 : ( ruleQuantity ) ;
    public final void rule__Check__QuantityAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1918:1: ( ( ruleQuantity ) )
            // InternalMymix.g:1919:2: ( ruleQuantity )
            {
            // InternalMymix.g:1919:2: ( ruleQuantity )
            // InternalMymix.g:1920:3: ruleQuantity
            {
             before(grammarAccess.getCheckAccess().getQuantityQuantityParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuantity();

            state._fsp--;

             after(grammarAccess.getCheckAccess().getQuantityQuantityParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Check__QuantityAssignment_2_1"


    // $ANTLR start "rule__Wait__TimeAssignment_1"
    // InternalMymix.g:1929:1: rule__Wait__TimeAssignment_1 : ( ruleTime ) ;
    public final void rule__Wait__TimeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1933:1: ( ( ruleTime ) )
            // InternalMymix.g:1934:2: ( ruleTime )
            {
            // InternalMymix.g:1934:2: ( ruleTime )
            // InternalMymix.g:1935:3: ruleTime
            {
             before(grammarAccess.getWaitAccess().getTimeTimeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTime();

            state._fsp--;

             after(grammarAccess.getWaitAccess().getTimeTimeParserRuleCall_1_0()); 

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


    // $ANTLR start "rule__Result__CupAssignment_1"
    // InternalMymix.g:1944:1: rule__Result__CupAssignment_1 : ( ruleCup ) ;
    public final void rule__Result__CupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1948:1: ( ( ruleCup ) )
            // InternalMymix.g:1949:2: ( ruleCup )
            {
            // InternalMymix.g:1949:2: ( ruleCup )
            // InternalMymix.g:1950:3: ruleCup
            {
             before(grammarAccess.getResultAccess().getCupCupParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCup();

            state._fsp--;

             after(grammarAccess.getResultAccess().getCupCupParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Result__CupAssignment_1"


    // $ANTLR start "rule__Filter__FilterAssignment_0"
    // InternalMymix.g:1959:1: rule__Filter__FilterAssignment_0 : ( ( 'A' ) ) ;
    public final void rule__Filter__FilterAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1963:1: ( ( ( 'A' ) ) )
            // InternalMymix.g:1964:2: ( ( 'A' ) )
            {
            // InternalMymix.g:1964:2: ( ( 'A' ) )
            // InternalMymix.g:1965:3: ( 'A' )
            {
             before(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 
            // InternalMymix.g:1966:3: ( 'A' )
            // InternalMymix.g:1967:4: 'A'
            {
             before(grammarAccess.getFilterAccess().getFilterAKeyword_0_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalMymix.g:1978:1: rule__Filter__FilterAssignment_1 : ( ( 'B' ) ) ;
    public final void rule__Filter__FilterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:1982:1: ( ( ( 'B' ) ) )
            // InternalMymix.g:1983:2: ( ( 'B' ) )
            {
            // InternalMymix.g:1983:2: ( ( 'B' ) )
            // InternalMymix.g:1984:3: ( 'B' )
            {
             before(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 
            // InternalMymix.g:1985:3: ( 'B' )
            // InternalMymix.g:1986:4: 'B'
            {
             before(grammarAccess.getFilterAccess().getFilterBKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalMymix.g:1997:1: rule__Cup__CupAssignment_1 : ( RULE_INT ) ;
    public final void rule__Cup__CupAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:2001:1: ( ( RULE_INT ) )
            // InternalMymix.g:2002:2: ( RULE_INT )
            {
            // InternalMymix.g:2002:2: ( RULE_INT )
            // InternalMymix.g:2003:3: RULE_INT
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


    // $ANTLR start "rule__Quantity__QuantityAssignment_0"
    // InternalMymix.g:2012:1: rule__Quantity__QuantityAssignment_0 : ( RULE_INT ) ;
    public final void rule__Quantity__QuantityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:2016:1: ( ( RULE_INT ) )
            // InternalMymix.g:2017:2: ( RULE_INT )
            {
            // InternalMymix.g:2017:2: ( RULE_INT )
            // InternalMymix.g:2018:3: RULE_INT
            {
             before(grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getQuantityAccess().getQuantityINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Quantity__QuantityAssignment_0"


    // $ANTLR start "rule__Time__TimeAssignment_0"
    // InternalMymix.g:2027:1: rule__Time__TimeAssignment_0 : ( RULE_INT ) ;
    public final void rule__Time__TimeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMymix.g:2031:1: ( ( RULE_INT ) )
            // InternalMymix.g:2032:2: ( RULE_INT )
            {
            // InternalMymix.g:2032:2: ( RULE_INT )
            // InternalMymix.g:2033:3: RULE_INT
            {
             before(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTimeAccess().getTimeINTTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Time__TimeAssignment_0"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000090002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A1000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000A1002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000098000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});

}