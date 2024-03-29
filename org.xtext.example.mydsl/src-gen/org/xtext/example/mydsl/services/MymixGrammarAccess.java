/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MymixGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class MachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Machine");
		private final Assignment cOperationsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cOperationsOperationParserRuleCall_0 = (RuleCall)cOperationsAssignment.eContents().get(0);
		
		//Machine:
		//	operations+=Operation+ //La machine dispose de plusieurs procedures
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//operations+=Operation+
		public Assignment getOperationsAssignment() { return cOperationsAssignment; }
		
		//Operation
		public RuleCall getOperationsOperationParserRuleCall_0() { return cOperationsOperationParserRuleCall_0; }
	}
	public class OperationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Operation");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cWaitParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPutParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Operation:
		//	Wait | Put //3 types d'opérations : 
		//	//check (pour tester la quantité de l'échantillon)
		//	//Wait (pour l'attente)
		//	//Put (pour prelever et injecter un échantillon)
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Wait | Put
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Wait
		public RuleCall getWaitParserRuleCall_0() { return cWaitParserRuleCall_0; }
		
		//Put
		public RuleCall getPutParserRuleCall_1() { return cPutParserRuleCall_1; }
	}
	public class PutElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Put");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPutKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cQuantityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cQuantityQuantityParserRuleCall_1_0 = (RuleCall)cQuantityAssignment_1.eContents().get(0);
		private final Keyword cFromKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cCupAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cCupCupParserRuleCall_3_0 = (RuleCall)cCupAssignment_3.eContents().get(0);
		private final Keyword cToKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cCupAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cCupCupParserRuleCall_5_0 = (RuleCall)cCupAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cFilterKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cFilterAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cFilterFilterParserRuleCall_6_1_0 = (RuleCall)cFilterAssignment_6_1.eContents().get(0);
		private final Assignment cWaitAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cWaitWaitParserRuleCall_7_0 = (RuleCall)cWaitAssignment_7.eContents().get(0);
		
		//Put:
		//	'put' quantity=Quantity 'from' cup=Cup 'to' cup=Cup ('filter' filter=Filter)? wait+=Wait?;
		@Override public ParserRule getRule() { return rule; }
		
		//'put' quantity=Quantity 'from' cup=Cup 'to' cup=Cup ('filter' filter=Filter)? wait+=Wait?
		public Group getGroup() { return cGroup; }
		
		//'put'
		public Keyword getPutKeyword_0() { return cPutKeyword_0; }
		
		//quantity=Quantity
		public Assignment getQuantityAssignment_1() { return cQuantityAssignment_1; }
		
		//Quantity
		public RuleCall getQuantityQuantityParserRuleCall_1_0() { return cQuantityQuantityParserRuleCall_1_0; }
		
		//'from'
		public Keyword getFromKeyword_2() { return cFromKeyword_2; }
		
		//cup=Cup
		public Assignment getCupAssignment_3() { return cCupAssignment_3; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_3_0() { return cCupCupParserRuleCall_3_0; }
		
		//'to'
		public Keyword getToKeyword_4() { return cToKeyword_4; }
		
		//cup=Cup
		public Assignment getCupAssignment_5() { return cCupAssignment_5; }
		
		//Cup
		public RuleCall getCupCupParserRuleCall_5_0() { return cCupCupParserRuleCall_5_0; }
		
		//('filter' filter=Filter)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'filter'
		public Keyword getFilterKeyword_6_0() { return cFilterKeyword_6_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_6_1() { return cFilterAssignment_6_1; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_6_1_0() { return cFilterFilterParserRuleCall_6_1_0; }
		
		//wait+=Wait?
		public Assignment getWaitAssignment_7() { return cWaitAssignment_7; }
		
		//Wait
		public RuleCall getWaitWaitParserRuleCall_7_0() { return cWaitWaitParserRuleCall_7_0; }
	}
	public class WaitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Wait");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWaitKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cTimeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTimeINTTerminalRuleCall_1_0 = (RuleCall)cTimeAssignment_1.eContents().get(0);
		
		//Wait:
		//	'wait' time=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'wait' time=INT
		public Group getGroup() { return cGroup; }
		
		//'wait'
		public Keyword getWaitKeyword_0() { return cWaitKeyword_0; }
		
		//time=INT
		public Assignment getTimeAssignment_1() { return cTimeAssignment_1; }
		
		//INT
		public RuleCall getTimeINTTerminalRuleCall_1_0() { return cTimeINTTerminalRuleCall_1_0; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Filter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFilterAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cFilterAKeyword_0_0 = (Keyword)cFilterAssignment_0.eContents().get(0);
		private final Assignment cFilterAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cFilterBKeyword_1_0 = (Keyword)cFilterAssignment_1.eContents().get(0);
		
		//Filter:
		//	filter='A' | filter='B';
		@Override public ParserRule getRule() { return rule; }
		
		//filter='A' | filter='B'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//filter='A'
		public Assignment getFilterAssignment_0() { return cFilterAssignment_0; }
		
		//'A'
		public Keyword getFilterAKeyword_0_0() { return cFilterAKeyword_0_0; }
		
		//filter='B'
		public Assignment getFilterAssignment_1() { return cFilterAssignment_1; }
		
		//'B'
		public Keyword getFilterBKeyword_1_0() { return cFilterBKeyword_1_0; }
	}
	public class CupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Cup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCupKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCupAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cCupINTTerminalRuleCall_1_0 = (RuleCall)cCupAssignment_1.eContents().get(0);
		
		//Cup:
		//	'cup' cup=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//'cup' cup=INT
		public Group getGroup() { return cGroup; }
		
		//'cup'
		public Keyword getCupKeyword_0() { return cCupKeyword_0; }
		
		//cup=INT
		public Assignment getCupAssignment_1() { return cCupAssignment_1; }
		
		//INT
		public RuleCall getCupINTTerminalRuleCall_1_0() { return cCupINTTerminalRuleCall_1_0; }
	}
	public class QuantityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Mymix.Quantity");
		private final Assignment cQuantityAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cQuantityINTTerminalRuleCall_0 = (RuleCall)cQuantityAssignment.eContents().get(0);
		
		//Quantity:
		//	quantity=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//quantity=INT
		public Assignment getQuantityAssignment() { return cQuantityAssignment; }
		
		//INT
		public RuleCall getQuantityINTTerminalRuleCall_0() { return cQuantityINTTerminalRuleCall_0; }
	}
	
	
	private final MachineElements pMachine;
	private final OperationElements pOperation;
	private final PutElements pPut;
	private final WaitElements pWait;
	private final FilterElements pFilter;
	private final CupElements pCup;
	private final QuantityElements pQuantity;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MymixGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMachine = new MachineElements();
		this.pOperation = new OperationElements();
		this.pPut = new PutElements();
		this.pWait = new WaitElements();
		this.pFilter = new FilterElements();
		this.pCup = new CupElements();
		this.pQuantity = new QuantityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Mymix".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Machine:
	//	operations+=Operation+ //La machine dispose de plusieurs procedures
	//;
	public MachineElements getMachineAccess() {
		return pMachine;
	}
	
	public ParserRule getMachineRule() {
		return getMachineAccess().getRule();
	}
	
	//Operation:
	//	Wait | Put //3 types d'opérations : 
	//	//check (pour tester la quantité de l'échantillon)
	//	//Wait (pour l'attente)
	//	//Put (pour prelever et injecter un échantillon)
	//;
	public OperationElements getOperationAccess() {
		return pOperation;
	}
	
	public ParserRule getOperationRule() {
		return getOperationAccess().getRule();
	}
	
	//Put:
	//	'put' quantity=Quantity 'from' cup=Cup 'to' cup=Cup ('filter' filter=Filter)? wait+=Wait?;
	public PutElements getPutAccess() {
		return pPut;
	}
	
	public ParserRule getPutRule() {
		return getPutAccess().getRule();
	}
	
	//Wait:
	//	'wait' time=INT;
	public WaitElements getWaitAccess() {
		return pWait;
	}
	
	public ParserRule getWaitRule() {
		return getWaitAccess().getRule();
	}
	
	//Filter:
	//	filter='A' | filter='B';
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//Cup:
	//	'cup' cup=INT;
	public CupElements getCupAccess() {
		return pCup;
	}
	
	public ParserRule getCupRule() {
		return getCupAccess().getRule();
	}
	
	//Quantity:
	//	quantity=INT;
	public QuantityElements getQuantityAccess() {
		return pQuantity;
	}
	
	public ParserRule getQuantityRule() {
		return getQuantityAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
