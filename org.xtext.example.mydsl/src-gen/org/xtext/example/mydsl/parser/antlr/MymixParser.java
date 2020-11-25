/*
 * generated by Xtext 2.23.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMymixParser;
import org.xtext.example.mydsl.services.MymixGrammarAccess;

public class MymixParser extends AbstractAntlrParser {

	@Inject
	private MymixGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMymixParser createParser(XtextTokenStream stream) {
		return new InternalMymixParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Machine";
	}

	public MymixGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MymixGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}