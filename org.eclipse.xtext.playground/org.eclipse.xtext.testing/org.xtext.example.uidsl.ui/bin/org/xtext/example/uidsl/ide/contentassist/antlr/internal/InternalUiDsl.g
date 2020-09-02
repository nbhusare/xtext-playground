/*
 * generated by Xtext 2.22.0
 */
grammar InternalUiDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.uidsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleUiModelFile
entryRuleUiModelFile
:
{ before(grammarAccess.getUiModelFileRule()); }
	 ruleUiModelFile
{ after(grammarAccess.getUiModelFileRule()); } 
	 EOF 
;

// Rule UiModelFile
ruleUiModelFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUiModelFileAccess().getUiModelsAssignment()); }
		(rule__UiModelFile__UiModelsAssignment)*
		{ after(grammarAccess.getUiModelFileAccess().getUiModelsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUiModel
entryRuleUiModel
:
{ before(grammarAccess.getUiModelRule()); }
	 ruleUiModel
{ after(grammarAccess.getUiModelRule()); } 
	 EOF 
;

// Rule UiModel
ruleUiModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUiModelAccess().getGroup()); }
		(rule__UiModel__Group__0)
		{ after(grammarAccess.getUiModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UiModel__Group__0__Impl
	rule__UiModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUiModelAccess().getUiKeyword_0()); }
	'ui'
	{ after(grammarAccess.getUiModelAccess().getUiKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UiModel__Group__1__Impl
	rule__UiModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUiModelAccess().getNameAssignment_1()); }
	(rule__UiModel__NameAssignment_1)
	{ after(grammarAccess.getUiModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UiModel__Group__2__Impl
	rule__UiModel__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUiModelAccess().getForKeyword_2()); }
	'for'
	{ after(grammarAccess.getUiModelAccess().getForKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__UiModel__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getUiModelAccess().getModelAssignment_3()); }
	(rule__UiModel__ModelAssignment_3)
	{ after(grammarAccess.getUiModelAccess().getModelAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__UiModelFile__UiModelsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUiModelFileAccess().getUiModelsUiModelParserRuleCall_0()); }
		ruleUiModel
		{ after(grammarAccess.getUiModelFileAccess().getUiModelsUiModelParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUiModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getUiModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UiModel__ModelAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUiModelAccess().getModelModelCrossReference_3_0()); }
		(
			{ before(grammarAccess.getUiModelAccess().getModelModelIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getUiModelAccess().getModelModelIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getUiModelAccess().getModelModelCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
