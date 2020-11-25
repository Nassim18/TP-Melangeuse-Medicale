/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.MymixGrammarAccess;

@SuppressWarnings("all")
public class MymixSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MymixGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Cup_CupKeyword_0_q;
	protected AbstractElementAlias match_Quantity_MLKeyword_1_q;
	protected AbstractElementAlias match_Time_SecKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MymixGrammarAccess) access;
		match_Cup_CupKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCupAccess().getCupKeyword_0());
		match_Quantity_MLKeyword_1_q = new TokenAlias(false, true, grammarAccess.getQuantityAccess().getMLKeyword_1());
		match_Time_SecKeyword_1_q = new TokenAlias(false, true, grammarAccess.getTimeAccess().getSecKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Cup_CupKeyword_0_q.equals(syntax))
				emit_Cup_CupKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Quantity_MLKeyword_1_q.equals(syntax))
				emit_Quantity_MLKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Time_SecKeyword_1_q.equals(syntax))
				emit_Time_SecKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'cup'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) cup=INT
	 */
	protected void emit_Cup_CupKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'mL'?
	 *
	 * This ambiguous syntax occurs at:
	 *     quantity=INT (ambiguity) (rule end)
	 */
	protected void emit_Quantity_MLKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'sec'?
	 *
	 * This ambiguous syntax occurs at:
	 *     time=INT (ambiguity) (rule end)
	 */
	protected void emit_Time_SecKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}