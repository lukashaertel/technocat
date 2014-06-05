package eu.metatools.technocat.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import eu.metatools.technocat.services.TechnoCatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechnoCatParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_SL_COMMENT", "RULE_WS", "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'||'", "'~'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'?'", "'model'", "'import'", "'type'", "'from'", "','", "'relation'", "'->'", "':'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__10=10;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTechnoCatParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTechnoCatParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTechnoCatParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g"; }


     
     	private TechnoCatGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TechnoCatGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleTechnologyCatalog"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:60:1: entryRuleTechnologyCatalog : ruleTechnologyCatalog EOF ;
    public final void entryRuleTechnologyCatalog() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:61:1: ( ruleTechnologyCatalog EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:62:1: ruleTechnologyCatalog EOF
            {
             before(grammarAccess.getTechnologyCatalogRule()); 
            pushFollow(FOLLOW_ruleTechnologyCatalog_in_entryRuleTechnologyCatalog61);
            ruleTechnologyCatalog();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTechnologyCatalog68); 

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
    // $ANTLR end "entryRuleTechnologyCatalog"


    // $ANTLR start "ruleTechnologyCatalog"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:69:1: ruleTechnologyCatalog : ( ( rule__TechnologyCatalog__Group__0 ) ) ;
    public final void ruleTechnologyCatalog() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:73:2: ( ( ( rule__TechnologyCatalog__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:74:1: ( ( rule__TechnologyCatalog__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:74:1: ( ( rule__TechnologyCatalog__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:75:1: ( rule__TechnologyCatalog__Group__0 )
            {
             before(grammarAccess.getTechnologyCatalogAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:76:1: ( rule__TechnologyCatalog__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:76:2: rule__TechnologyCatalog__Group__0
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__0_in_ruleTechnologyCatalog94);
            rule__TechnologyCatalog__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyCatalogAccess().getGroup()); 

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
    // $ANTLR end "ruleTechnologyCatalog"


    // $ANTLR start "entryRuleElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:88:1: entryRuleElement : ruleElement EOF ;
    public final void entryRuleElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:89:1: ( ruleElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:90:1: ruleElement EOF
            {
             before(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement121);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement128); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:97:1: ruleElement : ( ( rule__Element__Alternatives ) ) ;
    public final void ruleElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:101:2: ( ( ( rule__Element__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:102:1: ( ( rule__Element__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:102:1: ( ( rule__Element__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:103:1: ( rule__Element__Alternatives )
            {
             before(grammarAccess.getElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:104:1: ( rule__Element__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:104:2: rule__Element__Alternatives
            {
            pushFollow(FOLLOW_rule__Element__Alternatives_in_ruleElement154);
            rule__Element__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImport"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:116:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:117:1: ( ruleImport EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:118:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport181);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport188); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:125:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:129:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:130:1: ( ( rule__Import__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:130:1: ( ( rule__Import__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:131:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:132:1: ( rule__Import__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:132:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport214);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:144:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:145:1: ( ruleModelElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:146:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement241);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement248); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:153:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:157:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:158:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:158:1: ( ( rule__ModelElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:159:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:160:1: ( rule__ModelElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:160:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement274);
            rule__ModelElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getModelElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:172:1: entryRuleDefinitionElement : ruleDefinitionElement EOF ;
    public final void entryRuleDefinitionElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:173:1: ( ruleDefinitionElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:174:1: ruleDefinitionElement EOF
            {
             before(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement301);
            ruleDefinitionElement();

            state._fsp--;

             after(grammarAccess.getDefinitionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionElement308); 

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
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:181:1: ruleDefinitionElement : ( ( rule__DefinitionElement__Alternatives ) ) ;
    public final void ruleDefinitionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:185:2: ( ( ( rule__DefinitionElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:186:1: ( ( rule__DefinitionElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:186:1: ( ( rule__DefinitionElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:187:1: ( rule__DefinitionElement__Alternatives )
            {
             before(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:188:1: ( rule__DefinitionElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:188:2: rule__DefinitionElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DefinitionElement__Alternatives_in_ruleDefinitionElement334);
            rule__DefinitionElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleInstanceElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:200:1: entryRuleInstanceElement : ruleInstanceElement EOF ;
    public final void entryRuleInstanceElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:201:1: ( ruleInstanceElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:202:1: ruleInstanceElement EOF
            {
             before(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement361);
            ruleInstanceElement();

            state._fsp--;

             after(grammarAccess.getInstanceElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceElement368); 

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
    // $ANTLR end "entryRuleInstanceElement"


    // $ANTLR start "ruleInstanceElement"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:209:1: ruleInstanceElement : ( ( rule__InstanceElement__Alternatives ) ) ;
    public final void ruleInstanceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:213:2: ( ( ( rule__InstanceElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:214:1: ( ( rule__InstanceElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:214:1: ( ( rule__InstanceElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:215:1: ( rule__InstanceElement__Alternatives )
            {
             before(grammarAccess.getInstanceElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:216:1: ( rule__InstanceElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:216:2: rule__InstanceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__InstanceElement__Alternatives_in_ruleInstanceElement394);
            rule__InstanceElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getInstanceElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleInstanceElement"


    // $ANTLR start "entryRuleETD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:228:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:229:1: ( ruleETD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:230:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD421);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD428); 

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
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:237:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:241:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:242:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:242:1: ( ( rule__ETD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:243:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:244:1: ( rule__ETD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:244:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD454);
            rule__ETD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getGroup()); 

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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:256:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:257:1: ( ruleRTD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:258:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD481);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD488); 

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
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:265:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:269:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:270:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:270:1: ( ( rule__RTD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:271:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:272:1: ( rule__RTD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:272:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD514);
            rule__RTD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getGroup()); 

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
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleRTDItem"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:284:1: entryRuleRTDItem : ruleRTDItem EOF ;
    public final void entryRuleRTDItem() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:285:1: ( ruleRTDItem EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:286:1: ruleRTDItem EOF
            {
             before(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_ruleRTDItem_in_entryRuleRTDItem541);
            ruleRTDItem();

            state._fsp--;

             after(grammarAccess.getRTDItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTDItem548); 

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
    // $ANTLR end "entryRuleRTDItem"


    // $ANTLR start "ruleRTDItem"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:293:1: ruleRTDItem : ( ( rule__RTDItem__Group__0 ) ) ;
    public final void ruleRTDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:297:2: ( ( ( rule__RTDItem__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:298:1: ( ( rule__RTDItem__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:298:1: ( ( rule__RTDItem__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:299:1: ( rule__RTDItem__Group__0 )
            {
             before(grammarAccess.getRTDItemAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:300:1: ( rule__RTDItem__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:300:2: rule__RTDItem__Group__0
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__0_in_ruleRTDItem574);
            rule__RTDItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getGroup()); 

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
    // $ANTLR end "ruleRTDItem"


    // $ANTLR start "entryRuleED"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:312:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:313:1: ( ruleED EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:314:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED601);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED608); 

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
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:321:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:325:2: ( ( ( rule__ED__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:326:1: ( ( rule__ED__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:326:1: ( ( rule__ED__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:327:1: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:328:1: ( rule__ED__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:328:2: rule__ED__Group__0
            {
            pushFollow(FOLLOW_rule__ED__Group__0_in_ruleED634);
            rule__ED__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getGroup()); 

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
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleEDItem"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:340:1: entryRuleEDItem : ruleEDItem EOF ;
    public final void entryRuleEDItem() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:341:1: ( ruleEDItem EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:342:1: ruleEDItem EOF
            {
             before(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_ruleEDItem_in_entryRuleEDItem661);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDItem668); 

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
    // $ANTLR end "entryRuleEDItem"


    // $ANTLR start "ruleEDItem"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:349:1: ruleEDItem : ( ( rule__EDItem__Group__0 ) ) ;
    public final void ruleEDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:353:2: ( ( ( rule__EDItem__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:354:1: ( ( rule__EDItem__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:354:1: ( ( rule__EDItem__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:355:1: ( rule__EDItem__Group__0 )
            {
             before(grammarAccess.getEDItemAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:356:1: ( rule__EDItem__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:356:2: rule__EDItem__Group__0
            {
            pushFollow(FOLLOW_rule__EDItem__Group__0_in_ruleEDItem694);
            rule__EDItem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getGroup()); 

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
    // $ANTLR end "ruleEDItem"


    // $ANTLR start "entryRuleRD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:368:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:369:1: ( ruleRD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:370:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD721);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD728); 

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
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:377:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:381:2: ( ( ( rule__RD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:382:1: ( ( rule__RD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:382:1: ( ( rule__RD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:383:1: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:384:1: ( rule__RD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:384:2: rule__RD__Group__0
            {
            pushFollow(FOLLOW_rule__RD__Group__0_in_ruleRD754);
            rule__RD__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getGroup()); 

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
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleTCID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:396:1: entryRuleTCID : ruleTCID EOF ;
    public final void entryRuleTCID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:397:1: ( ruleTCID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:398:1: ruleTCID EOF
            {
             before(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_ruleTCID_in_entryRuleTCID781);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getTCIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCID788); 

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
    // $ANTLR end "entryRuleTCID"


    // $ANTLR start "ruleTCID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:405:1: ruleTCID : ( RULE_ID ) ;
    public final void ruleTCID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:409:2: ( ( RULE_ID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:410:1: ( RULE_ID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:410:1: ( RULE_ID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:411:1: RULE_ID
            {
             before(grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTCID814); 
             after(grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 

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
    // $ANTLR end "ruleTCID"


    // $ANTLR start "entryRuleRTID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:424:1: entryRuleRTID : ruleRTID EOF ;
    public final void entryRuleRTID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:425:1: ( ruleRTID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:426:1: ruleRTID EOF
            {
             before(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_ruleRTID_in_entryRuleRTID840);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTID847); 

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
    // $ANTLR end "entryRuleRTID"


    // $ANTLR start "ruleRTID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:433:1: ruleRTID : ( ( rule__RTID__Alternatives ) ) ;
    public final void ruleRTID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:437:2: ( ( ( rule__RTID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:438:1: ( ( rule__RTID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:438:1: ( ( rule__RTID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:439:1: ( rule__RTID__Alternatives )
            {
             before(grammarAccess.getRTIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:440:1: ( rule__RTID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:440:2: rule__RTID__Alternatives
            {
            pushFollow(FOLLOW_rule__RTID__Alternatives_in_ruleRTID873);
            rule__RTID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRTIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRTID"


    // $ANTLR start "entryRuleETID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:452:1: entryRuleETID : ruleETID EOF ;
    public final void entryRuleETID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:453:1: ( ruleETID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:454:1: ruleETID EOF
            {
             before(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_ruleETID_in_entryRuleETID900);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETID907); 

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
    // $ANTLR end "entryRuleETID"


    // $ANTLR start "ruleETID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:461:1: ruleETID : ( ( rule__ETID__Alternatives ) ) ;
    public final void ruleETID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:465:2: ( ( ( rule__ETID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:466:1: ( ( rule__ETID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:466:1: ( ( rule__ETID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:467:1: ( rule__ETID__Alternatives )
            {
             before(grammarAccess.getETIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:468:1: ( rule__ETID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:468:2: rule__ETID__Alternatives
            {
            pushFollow(FOLLOW_rule__ETID__Alternatives_in_ruleETID933);
            rule__ETID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getETIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleETID"


    // $ANTLR start "entryRuleEID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:480:1: entryRuleEID : ruleEID EOF ;
    public final void entryRuleEID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:481:1: ( ruleEID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:482:1: ruleEID EOF
            {
             before(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_ruleEID_in_entryRuleEID960);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getEIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEID967); 

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
    // $ANTLR end "entryRuleEID"


    // $ANTLR start "ruleEID"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:489:1: ruleEID : ( ( rule__EID__Alternatives ) ) ;
    public final void ruleEID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:493:2: ( ( ( rule__EID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:494:1: ( ( rule__EID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:494:1: ( ( rule__EID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:495:1: ( rule__EID__Alternatives )
            {
             before(grammarAccess.getEIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:496:1: ( rule__EID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:496:2: rule__EID__Alternatives
            {
            pushFollow(FOLLOW_rule__EID__Alternatives_in_ruleEID993);
            rule__EID__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEIDAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEID"


    // $ANTLR start "entryRuleRSYM"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:508:1: entryRuleRSYM : ruleRSYM EOF ;
    public final void entryRuleRSYM() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:509:1: ( ruleRSYM EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:510:1: ruleRSYM EOF
            {
             before(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_ruleRSYM_in_entryRuleRSYM1020);
            ruleRSYM();

            state._fsp--;

             after(grammarAccess.getRSYMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSYM1027); 

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
    // $ANTLR end "entryRuleRSYM"


    // $ANTLR start "ruleRSYM"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:517:1: ruleRSYM : ( ( rule__RSYM__Alternatives ) ) ;
    public final void ruleRSYM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:521:2: ( ( ( rule__RSYM__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:522:1: ( ( rule__RSYM__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:522:1: ( ( rule__RSYM__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:523:1: ( rule__RSYM__Alternatives )
            {
             before(grammarAccess.getRSYMAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:524:1: ( rule__RSYM__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:524:2: rule__RSYM__Alternatives
            {
            pushFollow(FOLLOW_rule__RSYM__Alternatives_in_ruleRSYM1053);
            rule__RSYM__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRSYMAccess().getAlternatives()); 

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
    // $ANTLR end "ruleRSYM"


    // $ANTLR start "rule__Element__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:536:1: rule__Element__Alternatives : ( ( ruleImport ) | ( ruleModelElement ) );
    public final void rule__Element__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:540:1: ( ( ruleImport ) | ( ruleModelElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==43) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)||LA1_0==44||LA1_0==47) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:541:1: ( ruleImport )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:541:1: ( ruleImport )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:542:1: ruleImport
                    {
                     before(grammarAccess.getElementAccess().getImportParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleImport_in_rule__Element__Alternatives1089);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getImportParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:547:6: ( ruleModelElement )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:547:6: ( ruleModelElement )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:548:1: ruleModelElement
                    {
                     before(grammarAccess.getElementAccess().getModelElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleModelElement_in_rule__Element__Alternatives1106);
                    ruleModelElement();

                    state._fsp--;

                     after(grammarAccess.getElementAccess().getModelElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__Element__Alternatives"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:558:1: rule__ModelElement__Alternatives : ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:562:1: ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==44||LA2_0==47) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_STRING)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:563:1: ( ruleDefinitionElement )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:563:1: ( ruleDefinitionElement )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:564:1: ruleDefinitionElement
                    {
                     before(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinitionElement_in_rule__ModelElement__Alternatives1138);
                    ruleDefinitionElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:569:6: ( ruleInstanceElement )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:569:6: ( ruleInstanceElement )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:570:1: ruleInstanceElement
                    {
                     before(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInstanceElement_in_rule__ModelElement__Alternatives1155);
                    ruleInstanceElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 

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
    // $ANTLR end "rule__ModelElement__Alternatives"


    // $ANTLR start "rule__DefinitionElement__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:580:1: rule__DefinitionElement__Alternatives : ( ( ruleETD ) | ( ruleRTD ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:584:1: ( ( ruleETD ) | ( ruleRTD ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==44) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:585:1: ( ruleETD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:585:1: ( ruleETD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:586:1: ruleETD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleETD_in_rule__DefinitionElement__Alternatives1187);
                    ruleETD();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:591:6: ( ruleRTD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:591:6: ( ruleRTD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:592:1: ruleRTD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRTD_in_rule__DefinitionElement__Alternatives1204);
                    ruleRTD();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 

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
    // $ANTLR end "rule__DefinitionElement__Alternatives"


    // $ANTLR start "rule__InstanceElement__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:602:1: rule__InstanceElement__Alternatives : ( ( ruleED ) | ( ruleRD ) );
    public final void rule__InstanceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:606:1: ( ( ruleED ) | ( ruleRD ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_ID && LA4_1<=RULE_STRING)||(LA4_1>=8 && LA4_1<=41)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==49) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING) ) {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==49) ) {
                    alt4=1;
                }
                else if ( ((LA4_2>=RULE_ID && LA4_2<=RULE_STRING)||(LA4_2>=8 && LA4_2<=41)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:607:1: ( ruleED )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:607:1: ( ruleED )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:608:1: ruleED
                    {
                     before(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleED_in_rule__InstanceElement__Alternatives1236);
                    ruleED();

                    state._fsp--;

                     after(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:613:6: ( ruleRD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:613:6: ( ruleRD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:614:1: ruleRD
                    {
                     before(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRD_in_rule__InstanceElement__Alternatives1253);
                    ruleRD();

                    state._fsp--;

                     after(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 

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
    // $ANTLR end "rule__InstanceElement__Alternatives"


    // $ANTLR start "rule__RTID__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:624:1: rule__RTID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) );
    public final void rule__RTID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:628:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt5=1;
                }
                break;
            case RULE_STRING:
                {
                alt5=2;
                }
                break;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:629:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:629:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:630:1: RULE_ID
                    {
                     before(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTID__Alternatives1285); 
                     after(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:635:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:635:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:636:1: RULE_STRING
                    {
                     before(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTID__Alternatives1302); 
                     after(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:641:6: ( ruleRSYM )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:641:6: ( ruleRSYM )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:642:1: ruleRSYM
                    {
                     before(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRSYM_in_rule__RTID__Alternatives1319);
                    ruleRSYM();

                    state._fsp--;

                     after(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 

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
    // $ANTLR end "rule__RTID__Alternatives"


    // $ANTLR start "rule__ETID__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:652:1: rule__ETID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ETID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:656:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:657:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:657:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:658:1: RULE_ID
                    {
                     before(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETID__Alternatives1351); 
                     after(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:663:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:663:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:664:1: RULE_STRING
                    {
                     before(grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ETID__Alternatives1368); 
                     after(grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__ETID__Alternatives"


    // $ANTLR start "rule__EID__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:674:1: rule__EID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:678:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:679:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:679:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:680:1: RULE_ID
                    {
                     before(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EID__Alternatives1400); 
                     after(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:685:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:685:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:686:1: RULE_STRING
                    {
                     before(grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EID__Alternatives1417); 
                     after(grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EID__Alternatives"


    // $ANTLR start "rule__RSYM__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:696:1: rule__RSYM__Alternatives : ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) );
    public final void rule__RSYM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:700:1: ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) )
            int alt8=34;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt8=1;
                }
                break;
            case 9:
                {
                alt8=2;
                }
                break;
            case 10:
                {
                alt8=3;
                }
                break;
            case 11:
                {
                alt8=4;
                }
                break;
            case 12:
                {
                alt8=5;
                }
                break;
            case 13:
                {
                alt8=6;
                }
                break;
            case 14:
                {
                alt8=7;
                }
                break;
            case 15:
                {
                alt8=8;
                }
                break;
            case 16:
                {
                alt8=9;
                }
                break;
            case 17:
                {
                alt8=10;
                }
                break;
            case 18:
                {
                alt8=11;
                }
                break;
            case 19:
                {
                alt8=12;
                }
                break;
            case 20:
                {
                alt8=13;
                }
                break;
            case 21:
                {
                alt8=14;
                }
                break;
            case 22:
                {
                alt8=15;
                }
                break;
            case 23:
                {
                alt8=16;
                }
                break;
            case 24:
                {
                alt8=17;
                }
                break;
            case 25:
                {
                alt8=18;
                }
                break;
            case 26:
                {
                alt8=19;
                }
                break;
            case 27:
                {
                alt8=20;
                }
                break;
            case 28:
                {
                alt8=21;
                }
                break;
            case 29:
                {
                alt8=22;
                }
                break;
            case 30:
                {
                alt8=23;
                }
                break;
            case 31:
                {
                alt8=24;
                }
                break;
            case 32:
                {
                alt8=25;
                }
                break;
            case 33:
                {
                alt8=26;
                }
                break;
            case 34:
                {
                alt8=27;
                }
                break;
            case 35:
                {
                alt8=28;
                }
                break;
            case 36:
                {
                alt8=29;
                }
                break;
            case 37:
                {
                alt8=30;
                }
                break;
            case 38:
                {
                alt8=31;
                }
                break;
            case 39:
                {
                alt8=32;
                }
                break;
            case 40:
                {
                alt8=33;
                }
                break;
            case 41:
                {
                alt8=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:701:1: ( '=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:701:1: ( '=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:702:1: '='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 
                    match(input,8,FOLLOW_8_in_rule__RSYM__Alternatives1450); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:709:6: ( '+' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:709:6: ( '+' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:710:1: '+'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 
                    match(input,9,FOLLOW_9_in_rule__RSYM__Alternatives1470); 
                     after(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:717:6: ( '-' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:717:6: ( '-' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:718:1: '-'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 
                    match(input,10,FOLLOW_10_in_rule__RSYM__Alternatives1490); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:725:6: ( '*' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:725:6: ( '*' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:726:1: '*'
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 
                    match(input,11,FOLLOW_11_in_rule__RSYM__Alternatives1510); 
                     after(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:733:6: ( '/' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:733:6: ( '/' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:734:1: '/'
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 
                    match(input,12,FOLLOW_12_in_rule__RSYM__Alternatives1530); 
                     after(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:741:6: ( '%' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:741:6: ( '%' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:742:1: '%'
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 
                    match(input,13,FOLLOW_13_in_rule__RSYM__Alternatives1550); 
                     after(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:749:6: ( '++' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:749:6: ( '++' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:750:1: '++'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 
                    match(input,14,FOLLOW_14_in_rule__RSYM__Alternatives1570); 
                     after(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:757:6: ( '--' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:757:6: ( '--' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:758:1: '--'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 
                    match(input,15,FOLLOW_15_in_rule__RSYM__Alternatives1590); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:765:6: ( '==' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:765:6: ( '==' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:766:1: '=='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 
                    match(input,16,FOLLOW_16_in_rule__RSYM__Alternatives1610); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:773:6: ( '!=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:773:6: ( '!=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:774:1: '!='
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 
                    match(input,17,FOLLOW_17_in_rule__RSYM__Alternatives1630); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:781:6: ( '>' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:781:6: ( '>' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:782:1: '>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 
                    match(input,18,FOLLOW_18_in_rule__RSYM__Alternatives1650); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:789:6: ( '<' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:789:6: ( '<' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:790:1: '<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 
                    match(input,19,FOLLOW_19_in_rule__RSYM__Alternatives1670); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:797:6: ( '>=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:797:6: ( '>=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:798:1: '>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                    match(input,20,FOLLOW_20_in_rule__RSYM__Alternatives1690); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:805:6: ( '<=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:805:6: ( '<=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:806:1: '<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 
                    match(input,21,FOLLOW_21_in_rule__RSYM__Alternatives1710); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:813:6: ( '!' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:813:6: ( '!' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:814:1: '!'
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 
                    match(input,22,FOLLOW_22_in_rule__RSYM__Alternatives1730); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:821:6: ( '&&' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:821:6: ( '&&' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:822:1: '&&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 
                    match(input,23,FOLLOW_23_in_rule__RSYM__Alternatives1750); 
                     after(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:829:6: ( '||' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:829:6: ( '||' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:830:1: '||'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 
                    match(input,24,FOLLOW_24_in_rule__RSYM__Alternatives1770); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:837:6: ( '~' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:837:6: ( '~' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:838:1: '~'
                    {
                     before(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 
                    match(input,25,FOLLOW_25_in_rule__RSYM__Alternatives1790); 
                     after(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:845:6: ( '&' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:845:6: ( '&' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:846:1: '&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 
                    match(input,26,FOLLOW_26_in_rule__RSYM__Alternatives1810); 
                     after(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:853:6: ( '|' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:853:6: ( '|' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:854:1: '|'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 
                    match(input,27,FOLLOW_27_in_rule__RSYM__Alternatives1830); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:861:6: ( '^' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:861:6: ( '^' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:862:1: '^'
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 
                    match(input,28,FOLLOW_28_in_rule__RSYM__Alternatives1850); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:869:6: ( '<<' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:869:6: ( '<<' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:870:1: '<<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 
                    match(input,29,FOLLOW_29_in_rule__RSYM__Alternatives1870); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:877:6: ( '>>' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:877:6: ( '>>' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:878:1: '>>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 
                    match(input,30,FOLLOW_30_in_rule__RSYM__Alternatives1890); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:885:6: ( '+=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:885:6: ( '+=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:886:1: '+='
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 
                    match(input,31,FOLLOW_31_in_rule__RSYM__Alternatives1910); 
                     after(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:893:6: ( '-=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:893:6: ( '-=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:894:1: '-='
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 
                    match(input,32,FOLLOW_32_in_rule__RSYM__Alternatives1930); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:901:6: ( '*=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:901:6: ( '*=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:902:1: '*='
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 
                    match(input,33,FOLLOW_33_in_rule__RSYM__Alternatives1950); 
                     after(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:909:6: ( '/=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:909:6: ( '/=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:910:1: '/='
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 
                    match(input,34,FOLLOW_34_in_rule__RSYM__Alternatives1970); 
                     after(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:917:6: ( '%=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:917:6: ( '%=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:918:1: '%='
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 
                    match(input,35,FOLLOW_35_in_rule__RSYM__Alternatives1990); 
                     after(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:925:6: ( '&=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:925:6: ( '&=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:926:1: '&='
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 
                    match(input,36,FOLLOW_36_in_rule__RSYM__Alternatives2010); 
                     after(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:933:6: ( '|=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:933:6: ( '|=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:934:1: '|='
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 
                    match(input,37,FOLLOW_37_in_rule__RSYM__Alternatives2030); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:941:6: ( '^=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:941:6: ( '^=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:942:1: '^='
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 
                    match(input,38,FOLLOW_38_in_rule__RSYM__Alternatives2050); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:949:6: ( '<<=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:949:6: ( '<<=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:950:1: '<<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 
                    match(input,39,FOLLOW_39_in_rule__RSYM__Alternatives2070); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:957:6: ( '>>=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:957:6: ( '>>=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:958:1: '>>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,40,FOLLOW_40_in_rule__RSYM__Alternatives2090); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:965:6: ( '?' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:965:6: ( '?' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:966:1: '?'
                    {
                     before(grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 
                    match(input,41,FOLLOW_41_in_rule__RSYM__Alternatives2110); 
                     after(grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 

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
    // $ANTLR end "rule__RSYM__Alternatives"


    // $ANTLR start "rule__TechnologyCatalog__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:980:1: rule__TechnologyCatalog__Group__0 : rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 ;
    public final void rule__TechnologyCatalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:984:1: ( rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:985:2: rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__0__Impl_in_rule__TechnologyCatalog__Group__02142);
            rule__TechnologyCatalog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__1_in_rule__TechnologyCatalog__Group__02145);
            rule__TechnologyCatalog__Group__1();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__0"


    // $ANTLR start "rule__TechnologyCatalog__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:992:1: rule__TechnologyCatalog__Group__0__Impl : ( 'model' ) ;
    public final void rule__TechnologyCatalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:996:1: ( ( 'model' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:997:1: ( 'model' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:997:1: ( 'model' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:998:1: 'model'
            {
             before(grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__TechnologyCatalog__Group__0__Impl2173); 
             after(grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__0__Impl"


    // $ANTLR start "rule__TechnologyCatalog__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1011:1: rule__TechnologyCatalog__Group__1 : rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 ;
    public final void rule__TechnologyCatalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1015:1: ( rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1016:2: rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__1__Impl_in_rule__TechnologyCatalog__Group__12204);
            rule__TechnologyCatalog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__2_in_rule__TechnologyCatalog__Group__12207);
            rule__TechnologyCatalog__Group__2();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__1"


    // $ANTLR start "rule__TechnologyCatalog__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1023:1: rule__TechnologyCatalog__Group__1__Impl : ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) ;
    public final void rule__TechnologyCatalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1027:1: ( ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1028:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1028:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1029:1: ( rule__TechnologyCatalog__NameAssignment_1 )
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1030:1: ( rule__TechnologyCatalog__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1030:2: rule__TechnologyCatalog__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__NameAssignment_1_in_rule__TechnologyCatalog__Group__1__Impl2234);
            rule__TechnologyCatalog__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTechnologyCatalogAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__1__Impl"


    // $ANTLR start "rule__TechnologyCatalog__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1040:1: rule__TechnologyCatalog__Group__2 : rule__TechnologyCatalog__Group__2__Impl ;
    public final void rule__TechnologyCatalog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1044:1: ( rule__TechnologyCatalog__Group__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1045:2: rule__TechnologyCatalog__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__2__Impl_in_rule__TechnologyCatalog__Group__22264);
            rule__TechnologyCatalog__Group__2__Impl();

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
    // $ANTLR end "rule__TechnologyCatalog__Group__2"


    // $ANTLR start "rule__TechnologyCatalog__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1051:1: rule__TechnologyCatalog__Group__2__Impl : ( ( rule__TechnologyCatalog__ModelElementsAssignment_2 )* ) ;
    public final void rule__TechnologyCatalog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1055:1: ( ( ( rule__TechnologyCatalog__ModelElementsAssignment_2 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1056:1: ( ( rule__TechnologyCatalog__ModelElementsAssignment_2 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1056:1: ( ( rule__TechnologyCatalog__ModelElementsAssignment_2 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1057:1: ( rule__TechnologyCatalog__ModelElementsAssignment_2 )*
            {
             before(grammarAccess.getTechnologyCatalogAccess().getModelElementsAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1058:1: ( rule__TechnologyCatalog__ModelElementsAssignment_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=43 && LA9_0<=44)||LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1058:2: rule__TechnologyCatalog__ModelElementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__TechnologyCatalog__ModelElementsAssignment_2_in_rule__TechnologyCatalog__Group__2__Impl2291);
            	    rule__TechnologyCatalog__ModelElementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTechnologyCatalogAccess().getModelElementsAssignment_2()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Group__2__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1074:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1078:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1079:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02328);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02331);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1086:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1090:1: ( ( 'import' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1091:1: ( 'import' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1091:1: ( 'import' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1092:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Import__Group__0__Impl2359); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1105:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1109:1: ( rule__Import__Group__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1110:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12390);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1116:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1120:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1121:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1121:1: ( ( rule__Import__RefAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1122:1: ( rule__Import__RefAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1123:1: ( rule__Import__RefAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1123:2: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl2417);
            rule__Import__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1137:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1141:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1142:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__02451);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__02454);
            rule__ETD__Group__1();

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
    // $ANTLR end "rule__ETD__Group__0"


    // $ANTLR start "rule__ETD__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1149:1: rule__ETD__Group__0__Impl : ( 'type' ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1153:1: ( ( 'type' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1154:1: ( 'type' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1154:1: ( 'type' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1155:1: 'type'
            {
             before(grammarAccess.getETDAccess().getTypeKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__ETD__Group__0__Impl2482); 
             after(grammarAccess.getETDAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__ETD__Group__0__Impl"


    // $ANTLR start "rule__ETD__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1168:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1172:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1173:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__12513);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__12516);
            rule__ETD__Group__2();

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
    // $ANTLR end "rule__ETD__Group__1"


    // $ANTLR start "rule__ETD__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1180:1: rule__ETD__Group__1__Impl : ( ( rule__ETD__NameAssignment_1 ) ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1184:1: ( ( ( rule__ETD__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1185:1: ( ( rule__ETD__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1185:1: ( ( rule__ETD__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1186:1: ( rule__ETD__NameAssignment_1 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1187:1: ( rule__ETD__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1187:2: rule__ETD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl2543);
            rule__ETD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ETD__Group__1__Impl"


    // $ANTLR start "rule__ETD__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1197:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl rule__ETD__Group__3 ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1201:1: ( rule__ETD__Group__2__Impl rule__ETD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1202:2: rule__ETD__Group__2__Impl rule__ETD__Group__3
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__22573);
            rule__ETD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__3_in_rule__ETD__Group__22576);
            rule__ETD__Group__3();

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
    // $ANTLR end "rule__ETD__Group__2"


    // $ANTLR start "rule__ETD__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1209:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__Group_2__0 )? ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1213:1: ( ( ( rule__ETD__Group_2__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1214:1: ( ( rule__ETD__Group_2__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1214:1: ( ( rule__ETD__Group_2__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1215:1: ( rule__ETD__Group_2__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1216:1: ( rule__ETD__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1216:2: rule__ETD__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl2603);
                    rule__ETD__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getETDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__ETD__Group__2__Impl"


    // $ANTLR start "rule__ETD__Group__3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1226:1: rule__ETD__Group__3 : rule__ETD__Group__3__Impl ;
    public final void rule__ETD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1230:1: ( rule__ETD__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1231:2: rule__ETD__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__3__Impl_in_rule__ETD__Group__32634);
            rule__ETD__Group__3__Impl();

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
    // $ANTLR end "rule__ETD__Group__3"


    // $ANTLR start "rule__ETD__Group__3__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1237:1: rule__ETD__Group__3__Impl : ( ( rule__ETD__Group_3__0 )? ) ;
    public final void rule__ETD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1241:1: ( ( ( rule__ETD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1242:1: ( ( rule__ETD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1242:1: ( ( rule__ETD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1243:1: ( rule__ETD__Group_3__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1244:1: ( rule__ETD__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==8) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1244:2: rule__ETD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ETD__Group_3__0_in_rule__ETD__Group__3__Impl2661);
                    rule__ETD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getETDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ETD__Group__3__Impl"


    // $ANTLR start "rule__ETD__Group_2__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1262:1: rule__ETD__Group_2__0 : rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 ;
    public final void rule__ETD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1266:1: ( rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1267:2: rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__02700);
            rule__ETD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__02703);
            rule__ETD__Group_2__1();

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
    // $ANTLR end "rule__ETD__Group_2__0"


    // $ANTLR start "rule__ETD__Group_2__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1274:1: rule__ETD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__ETD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1278:1: ( ( 'from' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1279:1: ( 'from' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1279:1: ( 'from' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1280:1: 'from'
            {
             before(grammarAccess.getETDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__ETD__Group_2__0__Impl2731); 
             after(grammarAccess.getETDAccess().getFromKeyword_2_0()); 

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
    // $ANTLR end "rule__ETD__Group_2__0__Impl"


    // $ANTLR start "rule__ETD__Group_2__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1293:1: rule__ETD__Group_2__1 : rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 ;
    public final void rule__ETD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1297:1: ( rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1298:2: rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__12762);
            rule__ETD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2__2_in_rule__ETD__Group_2__12765);
            rule__ETD__Group_2__2();

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
    // $ANTLR end "rule__ETD__Group_2__1"


    // $ANTLR start "rule__ETD__Group_2__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1305:1: rule__ETD__Group_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_1 ) ) ;
    public final void rule__ETD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1309:1: ( ( ( rule__ETD__BasesAssignment_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1310:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1310:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1311:1: ( rule__ETD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1312:1: ( rule__ETD__BasesAssignment_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1312:2: rule__ETD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ETD__BasesAssignment_2_1_in_rule__ETD__Group_2__1__Impl2792);
            rule__ETD__BasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getBasesAssignment_2_1()); 

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
    // $ANTLR end "rule__ETD__Group_2__1__Impl"


    // $ANTLR start "rule__ETD__Group_2__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1322:1: rule__ETD__Group_2__2 : rule__ETD__Group_2__2__Impl ;
    public final void rule__ETD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1326:1: ( rule__ETD__Group_2__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1327:2: rule__ETD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__2__Impl_in_rule__ETD__Group_2__22822);
            rule__ETD__Group_2__2__Impl();

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
    // $ANTLR end "rule__ETD__Group_2__2"


    // $ANTLR start "rule__ETD__Group_2__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1333:1: rule__ETD__Group_2__2__Impl : ( ( rule__ETD__Group_2_2__0 )* ) ;
    public final void rule__ETD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1337:1: ( ( ( rule__ETD__Group_2_2__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1338:1: ( ( rule__ETD__Group_2_2__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1338:1: ( ( rule__ETD__Group_2_2__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1339:1: ( rule__ETD__Group_2_2__0 )*
            {
             before(grammarAccess.getETDAccess().getGroup_2_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1340:1: ( rule__ETD__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1340:2: rule__ETD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ETD__Group_2_2__0_in_rule__ETD__Group_2__2__Impl2849);
            	    rule__ETD__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getETDAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__ETD__Group_2__2__Impl"


    // $ANTLR start "rule__ETD__Group_2_2__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1356:1: rule__ETD__Group_2_2__0 : rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 ;
    public final void rule__ETD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1360:1: ( rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1361:2: rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_2_2__0__Impl_in_rule__ETD__Group_2_2__02886);
            rule__ETD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2_2__1_in_rule__ETD__Group_2_2__02889);
            rule__ETD__Group_2_2__1();

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
    // $ANTLR end "rule__ETD__Group_2_2__0"


    // $ANTLR start "rule__ETD__Group_2_2__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1368:1: rule__ETD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ETD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1372:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1373:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1373:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1374:1: ','
            {
             before(grammarAccess.getETDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_46_in_rule__ETD__Group_2_2__0__Impl2917); 
             after(grammarAccess.getETDAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__ETD__Group_2_2__0__Impl"


    // $ANTLR start "rule__ETD__Group_2_2__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1387:1: rule__ETD__Group_2_2__1 : rule__ETD__Group_2_2__1__Impl ;
    public final void rule__ETD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1391:1: ( rule__ETD__Group_2_2__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1392:2: rule__ETD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_2_2__1__Impl_in_rule__ETD__Group_2_2__12948);
            rule__ETD__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__ETD__Group_2_2__1"


    // $ANTLR start "rule__ETD__Group_2_2__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1398:1: rule__ETD__Group_2_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__ETD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1402:1: ( ( ( rule__ETD__BasesAssignment_2_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1403:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1403:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1404:1: ( rule__ETD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1405:1: ( rule__ETD__BasesAssignment_2_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1405:2: rule__ETD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ETD__BasesAssignment_2_2_1_in_rule__ETD__Group_2_2__1__Impl2975);
            rule__ETD__BasesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getBasesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__ETD__Group_2_2__1__Impl"


    // $ANTLR start "rule__ETD__Group_3__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1419:1: rule__ETD__Group_3__0 : rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 ;
    public final void rule__ETD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1423:1: ( rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1424:2: rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_3__0__Impl_in_rule__ETD__Group_3__03009);
            rule__ETD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_3__1_in_rule__ETD__Group_3__03012);
            rule__ETD__Group_3__1();

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
    // $ANTLR end "rule__ETD__Group_3__0"


    // $ANTLR start "rule__ETD__Group_3__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1431:1: rule__ETD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ETD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1435:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1436:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1436:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1437:1: '='
            {
             before(grammarAccess.getETDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__ETD__Group_3__0__Impl3040); 
             after(grammarAccess.getETDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__ETD__Group_3__0__Impl"


    // $ANTLR start "rule__ETD__Group_3__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1450:1: rule__ETD__Group_3__1 : rule__ETD__Group_3__1__Impl ;
    public final void rule__ETD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1454:1: ( rule__ETD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1455:2: rule__ETD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_3__1__Impl_in_rule__ETD__Group_3__13071);
            rule__ETD__Group_3__1__Impl();

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
    // $ANTLR end "rule__ETD__Group_3__1"


    // $ANTLR start "rule__ETD__Group_3__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1461:1: rule__ETD__Group_3__1__Impl : ( ( rule__ETD__ValueAssignment_3_1 ) ) ;
    public final void rule__ETD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1465:1: ( ( ( rule__ETD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1466:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1466:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1467:1: ( rule__ETD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getETDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1468:1: ( rule__ETD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1468:2: rule__ETD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ETD__ValueAssignment_3_1_in_rule__ETD__Group_3__1__Impl3098);
            rule__ETD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getETDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__ETD__Group_3__1__Impl"


    // $ANTLR start "rule__RTD__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1482:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1486:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1487:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__03132);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__03135);
            rule__RTD__Group__1();

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
    // $ANTLR end "rule__RTD__Group__0"


    // $ANTLR start "rule__RTD__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1494:1: rule__RTD__Group__0__Impl : ( 'relation' ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1498:1: ( ( 'relation' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1499:1: ( 'relation' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1499:1: ( 'relation' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1500:1: 'relation'
            {
             before(grammarAccess.getRTDAccess().getRelationKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__RTD__Group__0__Impl3163); 
             after(grammarAccess.getRTDAccess().getRelationKeyword_0()); 

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
    // $ANTLR end "rule__RTD__Group__0__Impl"


    // $ANTLR start "rule__RTD__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1513:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1517:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1518:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__13194);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__13197);
            rule__RTD__Group__2();

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
    // $ANTLR end "rule__RTD__Group__1"


    // $ANTLR start "rule__RTD__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1525:1: rule__RTD__Group__1__Impl : ( ( rule__RTD__NameAssignment_1 ) ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1529:1: ( ( ( rule__RTD__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1530:1: ( ( rule__RTD__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1530:1: ( ( rule__RTD__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1531:1: ( rule__RTD__NameAssignment_1 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1532:1: ( rule__RTD__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1532:2: rule__RTD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl3224);
            rule__RTD__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RTD__Group__1__Impl"


    // $ANTLR start "rule__RTD__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1542:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1546:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1547:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__23254);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__23257);
            rule__RTD__Group__3();

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
    // $ANTLR end "rule__RTD__Group__2"


    // $ANTLR start "rule__RTD__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1554:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__Group_2__0 )? ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1558:1: ( ( ( rule__RTD__Group_2__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1559:1: ( ( rule__RTD__Group_2__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1559:1: ( ( rule__RTD__Group_2__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1560:1: ( rule__RTD__Group_2__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1561:1: ( rule__RTD__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1561:2: rule__RTD__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RTD__Group_2__0_in_rule__RTD__Group__2__Impl3284);
                    rule__RTD__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDAccess().getGroup_2()); 

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
    // $ANTLR end "rule__RTD__Group__2__Impl"


    // $ANTLR start "rule__RTD__Group__3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1571:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1575:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1576:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__33315);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__33318);
            rule__RTD__Group__4();

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
    // $ANTLR end "rule__RTD__Group__3"


    // $ANTLR start "rule__RTD__Group__3__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1583:1: rule__RTD__Group__3__Impl : ( ( rule__RTD__Group_3__0 )? ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1587:1: ( ( ( rule__RTD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1588:1: ( ( rule__RTD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1588:1: ( ( rule__RTD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1589:1: ( rule__RTD__Group_3__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1590:1: ( rule__RTD__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==8) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1590:2: rule__RTD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RTD__Group_3__0_in_rule__RTD__Group__3__Impl3345);
                    rule__RTD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RTD__Group__3__Impl"


    // $ANTLR start "rule__RTD__Group__4"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1600:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1604:1: ( rule__RTD__Group__4__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1605:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__43376);
            rule__RTD__Group__4__Impl();

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
    // $ANTLR end "rule__RTD__Group__4"


    // $ANTLR start "rule__RTD__Group__4__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1611:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__ItemsAssignment_4 )* ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1615:1: ( ( ( rule__RTD__ItemsAssignment_4 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1616:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1616:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1617:1: ( rule__RTD__ItemsAssignment_4 )*
            {
             before(grammarAccess.getRTDAccess().getItemsAssignment_4()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1618:1: ( rule__RTD__ItemsAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==48) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_STRING) ) {
                    int LA15_3 = input.LA(2);

                    if ( (LA15_3==48) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1618:2: rule__RTD__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RTD__ItemsAssignment_4_in_rule__RTD__Group__4__Impl3403);
            	    rule__RTD__ItemsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRTDAccess().getItemsAssignment_4()); 

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
    // $ANTLR end "rule__RTD__Group__4__Impl"


    // $ANTLR start "rule__RTD__Group_2__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1638:1: rule__RTD__Group_2__0 : rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 ;
    public final void rule__RTD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1642:1: ( rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1643:2: rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__0__Impl_in_rule__RTD__Group_2__03444);
            rule__RTD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2__1_in_rule__RTD__Group_2__03447);
            rule__RTD__Group_2__1();

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
    // $ANTLR end "rule__RTD__Group_2__0"


    // $ANTLR start "rule__RTD__Group_2__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1650:1: rule__RTD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__RTD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1654:1: ( ( 'from' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1655:1: ( 'from' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1655:1: ( 'from' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1656:1: 'from'
            {
             before(grammarAccess.getRTDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__RTD__Group_2__0__Impl3475); 
             after(grammarAccess.getRTDAccess().getFromKeyword_2_0()); 

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
    // $ANTLR end "rule__RTD__Group_2__0__Impl"


    // $ANTLR start "rule__RTD__Group_2__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1669:1: rule__RTD__Group_2__1 : rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 ;
    public final void rule__RTD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1673:1: ( rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1674:2: rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__1__Impl_in_rule__RTD__Group_2__13506);
            rule__RTD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2__2_in_rule__RTD__Group_2__13509);
            rule__RTD__Group_2__2();

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
    // $ANTLR end "rule__RTD__Group_2__1"


    // $ANTLR start "rule__RTD__Group_2__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1681:1: rule__RTD__Group_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_1 ) ) ;
    public final void rule__RTD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1685:1: ( ( ( rule__RTD__BasesAssignment_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1686:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1686:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1687:1: ( rule__RTD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1688:1: ( rule__RTD__BasesAssignment_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1688:2: rule__RTD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RTD__BasesAssignment_2_1_in_rule__RTD__Group_2__1__Impl3536);
            rule__RTD__BasesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getBasesAssignment_2_1()); 

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
    // $ANTLR end "rule__RTD__Group_2__1__Impl"


    // $ANTLR start "rule__RTD__Group_2__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1698:1: rule__RTD__Group_2__2 : rule__RTD__Group_2__2__Impl ;
    public final void rule__RTD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1702:1: ( rule__RTD__Group_2__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1703:2: rule__RTD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__2__Impl_in_rule__RTD__Group_2__23566);
            rule__RTD__Group_2__2__Impl();

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
    // $ANTLR end "rule__RTD__Group_2__2"


    // $ANTLR start "rule__RTD__Group_2__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1709:1: rule__RTD__Group_2__2__Impl : ( ( rule__RTD__Group_2_2__0 )* ) ;
    public final void rule__RTD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1713:1: ( ( ( rule__RTD__Group_2_2__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1714:1: ( ( rule__RTD__Group_2_2__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1714:1: ( ( rule__RTD__Group_2_2__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1715:1: ( rule__RTD__Group_2_2__0 )*
            {
             before(grammarAccess.getRTDAccess().getGroup_2_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1716:1: ( rule__RTD__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1716:2: rule__RTD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RTD__Group_2_2__0_in_rule__RTD__Group_2__2__Impl3593);
            	    rule__RTD__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRTDAccess().getGroup_2_2()); 

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
    // $ANTLR end "rule__RTD__Group_2__2__Impl"


    // $ANTLR start "rule__RTD__Group_2_2__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1732:1: rule__RTD__Group_2_2__0 : rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 ;
    public final void rule__RTD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1736:1: ( rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1737:2: rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_2_2__0__Impl_in_rule__RTD__Group_2_2__03630);
            rule__RTD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2_2__1_in_rule__RTD__Group_2_2__03633);
            rule__RTD__Group_2_2__1();

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
    // $ANTLR end "rule__RTD__Group_2_2__0"


    // $ANTLR start "rule__RTD__Group_2_2__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1744:1: rule__RTD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RTD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1748:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1749:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1749:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1750:1: ','
            {
             before(grammarAccess.getRTDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_46_in_rule__RTD__Group_2_2__0__Impl3661); 
             after(grammarAccess.getRTDAccess().getCommaKeyword_2_2_0()); 

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
    // $ANTLR end "rule__RTD__Group_2_2__0__Impl"


    // $ANTLR start "rule__RTD__Group_2_2__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1763:1: rule__RTD__Group_2_2__1 : rule__RTD__Group_2_2__1__Impl ;
    public final void rule__RTD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1767:1: ( rule__RTD__Group_2_2__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1768:2: rule__RTD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_2_2__1__Impl_in_rule__RTD__Group_2_2__13692);
            rule__RTD__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__RTD__Group_2_2__1"


    // $ANTLR start "rule__RTD__Group_2_2__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1774:1: rule__RTD__Group_2_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__RTD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1778:1: ( ( ( rule__RTD__BasesAssignment_2_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1779:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1779:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1780:1: ( rule__RTD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1781:1: ( rule__RTD__BasesAssignment_2_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1781:2: rule__RTD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__RTD__BasesAssignment_2_2_1_in_rule__RTD__Group_2_2__1__Impl3719);
            rule__RTD__BasesAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getBasesAssignment_2_2_1()); 

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
    // $ANTLR end "rule__RTD__Group_2_2__1__Impl"


    // $ANTLR start "rule__RTD__Group_3__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1795:1: rule__RTD__Group_3__0 : rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 ;
    public final void rule__RTD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1799:1: ( rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1800:2: rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_3__0__Impl_in_rule__RTD__Group_3__03753);
            rule__RTD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_3__1_in_rule__RTD__Group_3__03756);
            rule__RTD__Group_3__1();

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
    // $ANTLR end "rule__RTD__Group_3__0"


    // $ANTLR start "rule__RTD__Group_3__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1807:1: rule__RTD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1811:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1812:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1812:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1813:1: '='
            {
             before(grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RTD__Group_3__0__Impl3784); 
             after(grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RTD__Group_3__0__Impl"


    // $ANTLR start "rule__RTD__Group_3__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1826:1: rule__RTD__Group_3__1 : rule__RTD__Group_3__1__Impl ;
    public final void rule__RTD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1830:1: ( rule__RTD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1831:2: rule__RTD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_3__1__Impl_in_rule__RTD__Group_3__13815);
            rule__RTD__Group_3__1__Impl();

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
    // $ANTLR end "rule__RTD__Group_3__1"


    // $ANTLR start "rule__RTD__Group_3__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1837:1: rule__RTD__Group_3__1__Impl : ( ( rule__RTD__ValueAssignment_3_1 ) ) ;
    public final void rule__RTD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1841:1: ( ( ( rule__RTD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1842:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1842:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1843:1: ( rule__RTD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1844:1: ( rule__RTD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1844:2: rule__RTD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RTD__ValueAssignment_3_1_in_rule__RTD__Group_3__1__Impl3842);
            rule__RTD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RTD__Group_3__1__Impl"


    // $ANTLR start "rule__RTDItem__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1858:1: rule__RTDItem__Group__0 : rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 ;
    public final void rule__RTDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1862:1: ( rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1863:2: rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__0__Impl_in_rule__RTDItem__Group__03876);
            rule__RTDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__1_in_rule__RTDItem__Group__03879);
            rule__RTDItem__Group__1();

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
    // $ANTLR end "rule__RTDItem__Group__0"


    // $ANTLR start "rule__RTDItem__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1870:1: rule__RTDItem__Group__0__Impl : ( ( rule__RTDItem__DomainAssignment_0 ) ) ;
    public final void rule__RTDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1874:1: ( ( ( rule__RTDItem__DomainAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1875:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1875:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1876:1: ( rule__RTDItem__DomainAssignment_0 )
            {
             before(grammarAccess.getRTDItemAccess().getDomainAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1877:1: ( rule__RTDItem__DomainAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1877:2: rule__RTDItem__DomainAssignment_0
            {
            pushFollow(FOLLOW_rule__RTDItem__DomainAssignment_0_in_rule__RTDItem__Group__0__Impl3906);
            rule__RTDItem__DomainAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getDomainAssignment_0()); 

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
    // $ANTLR end "rule__RTDItem__Group__0__Impl"


    // $ANTLR start "rule__RTDItem__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1887:1: rule__RTDItem__Group__1 : rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 ;
    public final void rule__RTDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1891:1: ( rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1892:2: rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__1__Impl_in_rule__RTDItem__Group__13936);
            rule__RTDItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__2_in_rule__RTDItem__Group__13939);
            rule__RTDItem__Group__2();

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
    // $ANTLR end "rule__RTDItem__Group__1"


    // $ANTLR start "rule__RTDItem__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1899:1: rule__RTDItem__Group__1__Impl : ( '->' ) ;
    public final void rule__RTDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1903:1: ( ( '->' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1904:1: ( '->' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1904:1: ( '->' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1905:1: '->'
            {
             before(grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__RTDItem__Group__1__Impl3967); 
             after(grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

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
    // $ANTLR end "rule__RTDItem__Group__1__Impl"


    // $ANTLR start "rule__RTDItem__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1918:1: rule__RTDItem__Group__2 : rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 ;
    public final void rule__RTDItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1922:1: ( rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1923:2: rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__2__Impl_in_rule__RTDItem__Group__23998);
            rule__RTDItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__3_in_rule__RTDItem__Group__24001);
            rule__RTDItem__Group__3();

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
    // $ANTLR end "rule__RTDItem__Group__2"


    // $ANTLR start "rule__RTDItem__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1930:1: rule__RTDItem__Group__2__Impl : ( ( rule__RTDItem__CodomainAssignment_2 ) ) ;
    public final void rule__RTDItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1934:1: ( ( ( rule__RTDItem__CodomainAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1935:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1935:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1936:1: ( rule__RTDItem__CodomainAssignment_2 )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1937:1: ( rule__RTDItem__CodomainAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1937:2: rule__RTDItem__CodomainAssignment_2
            {
            pushFollow(FOLLOW_rule__RTDItem__CodomainAssignment_2_in_rule__RTDItem__Group__2__Impl4028);
            rule__RTDItem__CodomainAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getCodomainAssignment_2()); 

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
    // $ANTLR end "rule__RTDItem__Group__2__Impl"


    // $ANTLR start "rule__RTDItem__Group__3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1947:1: rule__RTDItem__Group__3 : rule__RTDItem__Group__3__Impl ;
    public final void rule__RTDItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1951:1: ( rule__RTDItem__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1952:2: rule__RTDItem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__3__Impl_in_rule__RTDItem__Group__34058);
            rule__RTDItem__Group__3__Impl();

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
    // $ANTLR end "rule__RTDItem__Group__3"


    // $ANTLR start "rule__RTDItem__Group__3__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1958:1: rule__RTDItem__Group__3__Impl : ( ( rule__RTDItem__Group_3__0 )? ) ;
    public final void rule__RTDItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1962:1: ( ( ( rule__RTDItem__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1963:1: ( ( rule__RTDItem__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1963:1: ( ( rule__RTDItem__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1964:1: ( rule__RTDItem__Group_3__0 )?
            {
             before(grammarAccess.getRTDItemAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1965:1: ( rule__RTDItem__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==8) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1965:2: rule__RTDItem__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RTDItem__Group_3__0_in_rule__RTDItem__Group__3__Impl4085);
                    rule__RTDItem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRTDItemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RTDItem__Group__3__Impl"


    // $ANTLR start "rule__RTDItem__Group_3__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1983:1: rule__RTDItem__Group_3__0 : rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 ;
    public final void rule__RTDItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1987:1: ( rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1988:2: rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1
            {
            pushFollow(FOLLOW_rule__RTDItem__Group_3__0__Impl_in_rule__RTDItem__Group_3__04124);
            rule__RTDItem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group_3__1_in_rule__RTDItem__Group_3__04127);
            rule__RTDItem__Group_3__1();

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
    // $ANTLR end "rule__RTDItem__Group_3__0"


    // $ANTLR start "rule__RTDItem__Group_3__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1995:1: rule__RTDItem__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTDItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1999:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2000:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2000:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2001:1: '='
            {
             before(grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RTDItem__Group_3__0__Impl4155); 
             after(grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RTDItem__Group_3__0__Impl"


    // $ANTLR start "rule__RTDItem__Group_3__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2014:1: rule__RTDItem__Group_3__1 : rule__RTDItem__Group_3__1__Impl ;
    public final void rule__RTDItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2018:1: ( rule__RTDItem__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2019:2: rule__RTDItem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RTDItem__Group_3__1__Impl_in_rule__RTDItem__Group_3__14186);
            rule__RTDItem__Group_3__1__Impl();

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
    // $ANTLR end "rule__RTDItem__Group_3__1"


    // $ANTLR start "rule__RTDItem__Group_3__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2025:1: rule__RTDItem__Group_3__1__Impl : ( ( rule__RTDItem__ValueAssignment_3_1 ) ) ;
    public final void rule__RTDItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2029:1: ( ( ( rule__RTDItem__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2030:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2030:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2031:1: ( rule__RTDItem__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDItemAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2032:1: ( rule__RTDItem__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2032:2: rule__RTDItem__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RTDItem__ValueAssignment_3_1_in_rule__RTDItem__Group_3__1__Impl4213);
            rule__RTDItem__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRTDItemAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RTDItem__Group_3__1__Impl"


    // $ANTLR start "rule__ED__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2046:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2050:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2051:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__04247);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__1_in_rule__ED__Group__04250);
            rule__ED__Group__1();

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
    // $ANTLR end "rule__ED__Group__0"


    // $ANTLR start "rule__ED__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2058:1: rule__ED__Group__0__Impl : ( ( rule__ED__TypeAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2062:1: ( ( ( rule__ED__TypeAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2063:1: ( ( rule__ED__TypeAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2063:1: ( ( rule__ED__TypeAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2064:1: ( rule__ED__TypeAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2065:1: ( rule__ED__TypeAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2065:2: rule__ED__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ED__TypeAssignment_0_in_rule__ED__Group__0__Impl4277);
            rule__ED__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__ED__Group__0__Impl"


    // $ANTLR start "rule__ED__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2075:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2079:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2080:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__14307);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__2_in_rule__ED__Group__14310);
            rule__ED__Group__2();

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
    // $ANTLR end "rule__ED__Group__1"


    // $ANTLR start "rule__ED__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2087:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2091:1: ( ( ':' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2092:1: ( ':' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2092:1: ( ':' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2093:1: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__ED__Group__1__Impl4338); 
             after(grammarAccess.getEDAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__ED__Group__1__Impl"


    // $ANTLR start "rule__ED__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2106:1: rule__ED__Group__2 : rule__ED__Group__2__Impl rule__ED__Group__3 ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2110:1: ( rule__ED__Group__2__Impl rule__ED__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2111:2: rule__ED__Group__2__Impl rule__ED__Group__3
            {
            pushFollow(FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__24369);
            rule__ED__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__3_in_rule__ED__Group__24372);
            rule__ED__Group__3();

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
    // $ANTLR end "rule__ED__Group__2"


    // $ANTLR start "rule__ED__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2118:1: rule__ED__Group__2__Impl : ( ( rule__ED__ItemsAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2122:1: ( ( ( rule__ED__ItemsAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2123:1: ( ( rule__ED__ItemsAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2123:1: ( ( rule__ED__ItemsAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2124:1: ( rule__ED__ItemsAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2125:1: ( rule__ED__ItemsAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2125:2: rule__ED__ItemsAssignment_2
            {
            pushFollow(FOLLOW_rule__ED__ItemsAssignment_2_in_rule__ED__Group__2__Impl4399);
            rule__ED__ItemsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getItemsAssignment_2()); 

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
    // $ANTLR end "rule__ED__Group__2__Impl"


    // $ANTLR start "rule__ED__Group__3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2135:1: rule__ED__Group__3 : rule__ED__Group__3__Impl ;
    public final void rule__ED__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2139:1: ( rule__ED__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2140:2: rule__ED__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group__3__Impl_in_rule__ED__Group__34429);
            rule__ED__Group__3__Impl();

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
    // $ANTLR end "rule__ED__Group__3"


    // $ANTLR start "rule__ED__Group__3__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2146:1: rule__ED__Group__3__Impl : ( ( rule__ED__Group_3__0 )* ) ;
    public final void rule__ED__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2150:1: ( ( ( rule__ED__Group_3__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2151:1: ( ( rule__ED__Group_3__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2151:1: ( ( rule__ED__Group_3__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2152:1: ( rule__ED__Group_3__0 )*
            {
             before(grammarAccess.getEDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2153:1: ( rule__ED__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2153:2: rule__ED__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ED__Group_3__0_in_rule__ED__Group__3__Impl4456);
            	    rule__ED__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getEDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__ED__Group__3__Impl"


    // $ANTLR start "rule__ED__Group_3__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2171:1: rule__ED__Group_3__0 : rule__ED__Group_3__0__Impl rule__ED__Group_3__1 ;
    public final void rule__ED__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2175:1: ( rule__ED__Group_3__0__Impl rule__ED__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2176:2: rule__ED__Group_3__0__Impl rule__ED__Group_3__1
            {
            pushFollow(FOLLOW_rule__ED__Group_3__0__Impl_in_rule__ED__Group_3__04495);
            rule__ED__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group_3__1_in_rule__ED__Group_3__04498);
            rule__ED__Group_3__1();

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
    // $ANTLR end "rule__ED__Group_3__0"


    // $ANTLR start "rule__ED__Group_3__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2183:1: rule__ED__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ED__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2187:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2188:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2188:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2189:1: ','
            {
             before(grammarAccess.getEDAccess().getCommaKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__ED__Group_3__0__Impl4526); 
             after(grammarAccess.getEDAccess().getCommaKeyword_3_0()); 

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
    // $ANTLR end "rule__ED__Group_3__0__Impl"


    // $ANTLR start "rule__ED__Group_3__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2202:1: rule__ED__Group_3__1 : rule__ED__Group_3__1__Impl ;
    public final void rule__ED__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2206:1: ( rule__ED__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2207:2: rule__ED__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group_3__1__Impl_in_rule__ED__Group_3__14557);
            rule__ED__Group_3__1__Impl();

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
    // $ANTLR end "rule__ED__Group_3__1"


    // $ANTLR start "rule__ED__Group_3__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2213:1: rule__ED__Group_3__1__Impl : ( ( rule__ED__ItemsAssignment_3_1 ) ) ;
    public final void rule__ED__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2217:1: ( ( ( rule__ED__ItemsAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2218:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2218:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2219:1: ( rule__ED__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2220:1: ( rule__ED__ItemsAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2220:2: rule__ED__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ED__ItemsAssignment_3_1_in_rule__ED__Group_3__1__Impl4584);
            rule__ED__ItemsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEDAccess().getItemsAssignment_3_1()); 

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
    // $ANTLR end "rule__ED__Group_3__1__Impl"


    // $ANTLR start "rule__EDItem__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2234:1: rule__EDItem__Group__0 : rule__EDItem__Group__0__Impl rule__EDItem__Group__1 ;
    public final void rule__EDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2238:1: ( rule__EDItem__Group__0__Impl rule__EDItem__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2239:2: rule__EDItem__Group__0__Impl rule__EDItem__Group__1
            {
            pushFollow(FOLLOW_rule__EDItem__Group__0__Impl_in_rule__EDItem__Group__04618);
            rule__EDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDItem__Group__1_in_rule__EDItem__Group__04621);
            rule__EDItem__Group__1();

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
    // $ANTLR end "rule__EDItem__Group__0"


    // $ANTLR start "rule__EDItem__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2246:1: rule__EDItem__Group__0__Impl : ( ( rule__EDItem__NameAssignment_0 ) ) ;
    public final void rule__EDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2250:1: ( ( ( rule__EDItem__NameAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2251:1: ( ( rule__EDItem__NameAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2251:1: ( ( rule__EDItem__NameAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2252:1: ( rule__EDItem__NameAssignment_0 )
            {
             before(grammarAccess.getEDItemAccess().getNameAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2253:1: ( rule__EDItem__NameAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2253:2: rule__EDItem__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EDItem__NameAssignment_0_in_rule__EDItem__Group__0__Impl4648);
            rule__EDItem__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__EDItem__Group__0__Impl"


    // $ANTLR start "rule__EDItem__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2263:1: rule__EDItem__Group__1 : rule__EDItem__Group__1__Impl ;
    public final void rule__EDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2267:1: ( rule__EDItem__Group__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2268:2: rule__EDItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EDItem__Group__1__Impl_in_rule__EDItem__Group__14678);
            rule__EDItem__Group__1__Impl();

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
    // $ANTLR end "rule__EDItem__Group__1"


    // $ANTLR start "rule__EDItem__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2274:1: rule__EDItem__Group__1__Impl : ( ( rule__EDItem__Group_1__0 )? ) ;
    public final void rule__EDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2278:1: ( ( ( rule__EDItem__Group_1__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2279:1: ( ( rule__EDItem__Group_1__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2279:1: ( ( rule__EDItem__Group_1__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2280:1: ( rule__EDItem__Group_1__0 )?
            {
             before(grammarAccess.getEDItemAccess().getGroup_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2281:1: ( rule__EDItem__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2281:2: rule__EDItem__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EDItem__Group_1__0_in_rule__EDItem__Group__1__Impl4705);
                    rule__EDItem__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDItemAccess().getGroup_1()); 

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
    // $ANTLR end "rule__EDItem__Group__1__Impl"


    // $ANTLR start "rule__EDItem__Group_1__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2295:1: rule__EDItem__Group_1__0 : rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 ;
    public final void rule__EDItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2299:1: ( rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2300:2: rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1
            {
            pushFollow(FOLLOW_rule__EDItem__Group_1__0__Impl_in_rule__EDItem__Group_1__04740);
            rule__EDItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDItem__Group_1__1_in_rule__EDItem__Group_1__04743);
            rule__EDItem__Group_1__1();

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
    // $ANTLR end "rule__EDItem__Group_1__0"


    // $ANTLR start "rule__EDItem__Group_1__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2307:1: rule__EDItem__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EDItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2311:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2312:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2312:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2313:1: '='
            {
             before(grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0()); 
            match(input,8,FOLLOW_8_in_rule__EDItem__Group_1__0__Impl4771); 
             after(grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0()); 

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
    // $ANTLR end "rule__EDItem__Group_1__0__Impl"


    // $ANTLR start "rule__EDItem__Group_1__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2326:1: rule__EDItem__Group_1__1 : rule__EDItem__Group_1__1__Impl ;
    public final void rule__EDItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2330:1: ( rule__EDItem__Group_1__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2331:2: rule__EDItem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EDItem__Group_1__1__Impl_in_rule__EDItem__Group_1__14802);
            rule__EDItem__Group_1__1__Impl();

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
    // $ANTLR end "rule__EDItem__Group_1__1"


    // $ANTLR start "rule__EDItem__Group_1__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2337:1: rule__EDItem__Group_1__1__Impl : ( ( rule__EDItem__ValueAssignment_1_1 ) ) ;
    public final void rule__EDItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2341:1: ( ( ( rule__EDItem__ValueAssignment_1_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2342:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2342:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2343:1: ( rule__EDItem__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEDItemAccess().getValueAssignment_1_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2344:1: ( rule__EDItem__ValueAssignment_1_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2344:2: rule__EDItem__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EDItem__ValueAssignment_1_1_in_rule__EDItem__Group_1__1__Impl4829);
            rule__EDItem__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEDItemAccess().getValueAssignment_1_1()); 

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
    // $ANTLR end "rule__EDItem__Group_1__1__Impl"


    // $ANTLR start "rule__RD__Group__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2358:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2362:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2363:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__04863);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__04866);
            rule__RD__Group__1();

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
    // $ANTLR end "rule__RD__Group__0"


    // $ANTLR start "rule__RD__Group__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2370:1: rule__RD__Group__0__Impl : ( ( rule__RD__LeftAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2374:1: ( ( ( rule__RD__LeftAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2375:1: ( ( rule__RD__LeftAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2375:1: ( ( rule__RD__LeftAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2376:1: ( rule__RD__LeftAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getLeftAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2377:1: ( rule__RD__LeftAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2377:2: rule__RD__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__LeftAssignment_0_in_rule__RD__Group__0__Impl4893);
            rule__RD__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__RD__Group__0__Impl"


    // $ANTLR start "rule__RD__Group__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2387:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2391:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2392:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__14923);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__14926);
            rule__RD__Group__2();

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
    // $ANTLR end "rule__RD__Group__1"


    // $ANTLR start "rule__RD__Group__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2399:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelationAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2403:1: ( ( ( rule__RD__RelationAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2404:1: ( ( rule__RD__RelationAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2404:1: ( ( rule__RD__RelationAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2405:1: ( rule__RD__RelationAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelationAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2406:1: ( rule__RD__RelationAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2406:2: rule__RD__RelationAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelationAssignment_1_in_rule__RD__Group__1__Impl4953);
            rule__RD__RelationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getRelationAssignment_1()); 

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
    // $ANTLR end "rule__RD__Group__1__Impl"


    // $ANTLR start "rule__RD__Group__2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2416:1: rule__RD__Group__2 : rule__RD__Group__2__Impl rule__RD__Group__3 ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2420:1: ( rule__RD__Group__2__Impl rule__RD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2421:2: rule__RD__Group__2__Impl rule__RD__Group__3
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__24983);
            rule__RD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__3_in_rule__RD__Group__24986);
            rule__RD__Group__3();

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
    // $ANTLR end "rule__RD__Group__2"


    // $ANTLR start "rule__RD__Group__2__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2428:1: rule__RD__Group__2__Impl : ( ( rule__RD__RightAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2432:1: ( ( ( rule__RD__RightAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2433:1: ( ( rule__RD__RightAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2433:1: ( ( rule__RD__RightAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2434:1: ( rule__RD__RightAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getRightAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2435:1: ( rule__RD__RightAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2435:2: rule__RD__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__RightAssignment_2_in_rule__RD__Group__2__Impl5013);
            rule__RD__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__RD__Group__2__Impl"


    // $ANTLR start "rule__RD__Group__3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2445:1: rule__RD__Group__3 : rule__RD__Group__3__Impl ;
    public final void rule__RD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2449:1: ( rule__RD__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2450:2: rule__RD__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__3__Impl_in_rule__RD__Group__35043);
            rule__RD__Group__3__Impl();

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
    // $ANTLR end "rule__RD__Group__3"


    // $ANTLR start "rule__RD__Group__3__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2456:1: rule__RD__Group__3__Impl : ( ( rule__RD__Group_3__0 )? ) ;
    public final void rule__RD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2460:1: ( ( ( rule__RD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2461:1: ( ( rule__RD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2461:1: ( ( rule__RD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2462:1: ( rule__RD__Group_3__0 )?
            {
             before(grammarAccess.getRDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2463:1: ( rule__RD__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==8) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2463:2: rule__RD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RD__Group_3__0_in_rule__RD__Group__3__Impl5070);
                    rule__RD__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRDAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RD__Group__3__Impl"


    // $ANTLR start "rule__RD__Group_3__0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2481:1: rule__RD__Group_3__0 : rule__RD__Group_3__0__Impl rule__RD__Group_3__1 ;
    public final void rule__RD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2485:1: ( rule__RD__Group_3__0__Impl rule__RD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2486:2: rule__RD__Group_3__0__Impl rule__RD__Group_3__1
            {
            pushFollow(FOLLOW_rule__RD__Group_3__0__Impl_in_rule__RD__Group_3__05109);
            rule__RD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group_3__1_in_rule__RD__Group_3__05112);
            rule__RD__Group_3__1();

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
    // $ANTLR end "rule__RD__Group_3__0"


    // $ANTLR start "rule__RD__Group_3__0__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2493:1: rule__RD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2497:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2498:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2498:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2499:1: '='
            {
             before(grammarAccess.getRDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RD__Group_3__0__Impl5140); 
             after(grammarAccess.getRDAccess().getEqualsSignKeyword_3_0()); 

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
    // $ANTLR end "rule__RD__Group_3__0__Impl"


    // $ANTLR start "rule__RD__Group_3__1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2512:1: rule__RD__Group_3__1 : rule__RD__Group_3__1__Impl ;
    public final void rule__RD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2516:1: ( rule__RD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2517:2: rule__RD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group_3__1__Impl_in_rule__RD__Group_3__15171);
            rule__RD__Group_3__1__Impl();

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
    // $ANTLR end "rule__RD__Group_3__1"


    // $ANTLR start "rule__RD__Group_3__1__Impl"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2523:1: rule__RD__Group_3__1__Impl : ( ( rule__RD__ValueAssignment_3_1 ) ) ;
    public final void rule__RD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2527:1: ( ( ( rule__RD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2528:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2528:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2529:1: ( rule__RD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2530:1: ( rule__RD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2530:2: rule__RD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RD__ValueAssignment_3_1_in_rule__RD__Group_3__1__Impl5198);
            rule__RD__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRDAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end "rule__RD__Group_3__1__Impl"


    // $ANTLR start "rule__TechnologyCatalog__NameAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2545:1: rule__TechnologyCatalog__NameAssignment_1 : ( ruleTCID ) ;
    public final void rule__TechnologyCatalog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2549:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2550:1: ( ruleTCID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2550:1: ( ruleTCID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2551:1: ruleTCID
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTCID_in_rule__TechnologyCatalog__NameAssignment_15237);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__NameAssignment_1"


    // $ANTLR start "rule__TechnologyCatalog__ModelElementsAssignment_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2560:1: rule__TechnologyCatalog__ModelElementsAssignment_2 : ( ruleElement ) ;
    public final void rule__TechnologyCatalog__ModelElementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2564:1: ( ( ruleElement ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2565:1: ( ruleElement )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2565:1: ( ruleElement )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2566:1: ruleElement
            {
             before(grammarAccess.getTechnologyCatalogAccess().getModelElementsElementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleElement_in_rule__TechnologyCatalog__ModelElementsAssignment_25268);
            ruleElement();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getModelElementsElementParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__ModelElementsAssignment_2"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2575:1: rule__Import__RefAssignment_1 : ( ( ruleTCID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2579:1: ( ( ( ruleTCID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2580:1: ( ( ruleTCID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2580:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2581:1: ( ruleTCID )
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2582:1: ( ruleTCID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2583:1: ruleTCID
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleTCID_in_rule__Import__RefAssignment_15303);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 

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
    // $ANTLR end "rule__Import__RefAssignment_1"


    // $ANTLR start "rule__ETD__NameAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2594:1: rule__ETD__NameAssignment_1 : ( ruleETID ) ;
    public final void rule__ETD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2598:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2599:1: ( ruleETID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2599:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2600:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__NameAssignment_15338);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__ETD__NameAssignment_1"


    // $ANTLR start "rule__ETD__BasesAssignment_2_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2609:1: rule__ETD__BasesAssignment_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2613:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2614:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2614:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2615:1: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2616:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2617:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_15373);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__ETD__BasesAssignment_2_1"


    // $ANTLR start "rule__ETD__BasesAssignment_2_2_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2628:1: rule__ETD__BasesAssignment_2_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2632:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2633:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2633:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2634:1: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2635:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2636:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_2_15412);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__ETD__BasesAssignment_2_2_1"


    // $ANTLR start "rule__ETD__ValueAssignment_3_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2647:1: rule__ETD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ETD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2651:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2652:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2652:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2653:1: RULE_STRING
            {
             before(grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ETD__ValueAssignment_3_15447); 
             after(grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ETD__ValueAssignment_3_1"


    // $ANTLR start "rule__RTD__NameAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2662:1: rule__RTD__NameAssignment_1 : ( ruleRTID ) ;
    public final void rule__RTD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2666:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2667:1: ( ruleRTID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2667:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2668:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__NameAssignment_15478);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RTD__NameAssignment_1"


    // $ANTLR start "rule__RTD__BasesAssignment_2_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2677:1: rule__RTD__BasesAssignment_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2681:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2682:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2682:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2683:1: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2684:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2685:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_15513);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__RTD__BasesAssignment_2_1"


    // $ANTLR start "rule__RTD__BasesAssignment_2_2_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2696:1: rule__RTD__BasesAssignment_2_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2700:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2701:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2701:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2702:1: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2703:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2704:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_2_15552);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 

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
    // $ANTLR end "rule__RTD__BasesAssignment_2_2_1"


    // $ANTLR start "rule__RTD__ValueAssignment_3_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2715:1: rule__RTD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2719:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2720:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2720:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2721:1: RULE_STRING
            {
             before(grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTD__ValueAssignment_3_15587); 
             after(grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RTD__ValueAssignment_3_1"


    // $ANTLR start "rule__RTD__ItemsAssignment_4"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2730:1: rule__RTD__ItemsAssignment_4 : ( ruleRTDItem ) ;
    public final void rule__RTD__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2734:1: ( ( ruleRTDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2735:1: ( ruleRTDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2735:1: ( ruleRTDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2736:1: ruleRTDItem
            {
             before(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRTDItem_in_rule__RTD__ItemsAssignment_45618);
            ruleRTDItem();

            state._fsp--;

             after(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__RTD__ItemsAssignment_4"


    // $ANTLR start "rule__RTDItem__DomainAssignment_0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2745:1: rule__RTDItem__DomainAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2749:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2750:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2750:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2751:1: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2752:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2753:1: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__RTDItem__DomainAssignment_05653);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getRTDItemAccess().getDomainETDETIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 

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
    // $ANTLR end "rule__RTDItem__DomainAssignment_0"


    // $ANTLR start "rule__RTDItem__CodomainAssignment_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2764:1: rule__RTDItem__CodomainAssignment_2 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__CodomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2768:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2769:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2769:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2770:1: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2771:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2772:1: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDETIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__RTDItem__CodomainAssignment_25692);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getRTDItemAccess().getCodomainETDETIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 

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
    // $ANTLR end "rule__RTDItem__CodomainAssignment_2"


    // $ANTLR start "rule__RTDItem__ValueAssignment_3_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2783:1: rule__RTDItem__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTDItem__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2787:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2788:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2788:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2789:1: RULE_STRING
            {
             before(grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTDItem__ValueAssignment_3_15727); 
             after(grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RTDItem__ValueAssignment_3_1"


    // $ANTLR start "rule__ED__TypeAssignment_0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2798:1: rule__ED__TypeAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__ED__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2802:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2803:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2803:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2804:1: ( ruleETID )
            {
             before(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2805:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2806:1: ruleETID
            {
             before(grammarAccess.getEDAccess().getTypeETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ED__TypeAssignment_05762);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getEDAccess().getTypeETDETIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 

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
    // $ANTLR end "rule__ED__TypeAssignment_0"


    // $ANTLR start "rule__ED__ItemsAssignment_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2817:1: rule__ED__ItemsAssignment_2 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2821:1: ( ( ruleEDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2822:1: ( ruleEDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2822:1: ( ruleEDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2823:1: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_25797);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ED__ItemsAssignment_2"


    // $ANTLR start "rule__ED__ItemsAssignment_3_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2832:1: rule__ED__ItemsAssignment_3_1 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2836:1: ( ( ruleEDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2837:1: ( ruleEDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2837:1: ( ruleEDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2838:1: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_3_15828);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__ED__ItemsAssignment_3_1"


    // $ANTLR start "rule__EDItem__NameAssignment_0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2847:1: rule__EDItem__NameAssignment_0 : ( ruleEID ) ;
    public final void rule__EDItem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2851:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2852:1: ( ruleEID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2852:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2853:1: ruleEID
            {
             before(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEID_in_rule__EDItem__NameAssignment_05859);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__EDItem__NameAssignment_0"


    // $ANTLR start "rule__EDItem__ValueAssignment_1_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2862:1: rule__EDItem__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EDItem__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2866:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2867:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2867:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2868:1: RULE_STRING
            {
             before(grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EDItem__ValueAssignment_1_15890); 
             after(grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__EDItem__ValueAssignment_1_1"


    // $ANTLR start "rule__RD__LeftAssignment_0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2877:1: rule__RD__LeftAssignment_0 : ( ( ruleEID ) ) ;
    public final void rule__RD__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2881:1: ( ( ( ruleEID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2882:1: ( ( ruleEID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2882:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2883:1: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2884:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2885:1: ruleEID
            {
             before(grammarAccess.getRDAccess().getLeftEDItemEIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleEID_in_rule__RD__LeftAssignment_05925);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getLeftEDItemEIDParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 

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
    // $ANTLR end "rule__RD__LeftAssignment_0"


    // $ANTLR start "rule__RD__RelationAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2896:1: rule__RD__RelationAssignment_1 : ( ( ruleRTID ) ) ;
    public final void rule__RD__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2900:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2901:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2901:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2902:1: ( ruleRTID )
            {
             before(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2903:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2904:1: ruleRTID
            {
             before(grammarAccess.getRDAccess().getRelationRTDRTIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RD__RelationAssignment_15964);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getRelationRTDRTIDParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 

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
    // $ANTLR end "rule__RD__RelationAssignment_1"


    // $ANTLR start "rule__RD__RightAssignment_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2915:1: rule__RD__RightAssignment_2 : ( ( ruleEID ) ) ;
    public final void rule__RD__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2919:1: ( ( ( ruleEID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2920:1: ( ( ruleEID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2920:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2921:1: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2922:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2923:1: ruleEID
            {
             before(grammarAccess.getRDAccess().getRightEDItemEIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEID_in_rule__RD__RightAssignment_26003);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getRDAccess().getRightEDItemEIDParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 

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
    // $ANTLR end "rule__RD__RightAssignment_2"


    // $ANTLR start "rule__RD__ValueAssignment_3_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2934:1: rule__RD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2938:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2939:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2939:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2940:1: RULE_STRING
            {
             before(grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RD__ValueAssignment_3_16038); 
             after(grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RD__ValueAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTechnologyCatalog_in_entryRuleTechnologyCatalog61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTechnologyCatalog68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__0_in_ruleTechnologyCatalog94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Element__Alternatives_in_ruleElement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionElement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionElement__Alternatives_in_ruleDefinitionElement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceElement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceElement__Alternatives_in_ruleInstanceElement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTDItem_in_entryRuleRTDItem541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTDItem548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__0_in_ruleRTDItem574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0_in_ruleED634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_entryRuleEDItem661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDItem668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__0_in_ruleEDItem694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_entryRuleTCID781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCID788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTCID814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_entryRuleRTID840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTID847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTID__Alternatives_in_ruleRTID873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_entryRuleETID900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETID907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETID__Alternatives_in_ruleETID933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_entryRuleEID960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEID967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EID__Alternatives_in_ruleEID993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_entryRuleRSYM1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSYM1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RSYM__Alternatives_in_ruleRSYM1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Element__Alternatives1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_rule__Element__Alternatives1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_rule__ModelElement__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_rule__ModelElement__Alternatives1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__DefinitionElement__Alternatives1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__DefinitionElement__Alternatives1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__InstanceElement__Alternatives1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__InstanceElement__Alternatives1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTID__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTID__Alternatives1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_rule__RTID__Alternatives1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETID__Alternatives1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ETID__Alternatives1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EID__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EID__Alternatives1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RSYM__Alternatives1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__RSYM__Alternatives1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RSYM__Alternatives1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RSYM__Alternatives1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RSYM__Alternatives1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RSYM__Alternatives1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RSYM__Alternatives1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RSYM__Alternatives1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RSYM__Alternatives1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RSYM__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RSYM__Alternatives1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RSYM__Alternatives1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RSYM__Alternatives1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RSYM__Alternatives1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RSYM__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RSYM__Alternatives1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RSYM__Alternatives1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RSYM__Alternatives1790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RSYM__Alternatives1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RSYM__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RSYM__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RSYM__Alternatives1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RSYM__Alternatives1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RSYM__Alternatives1910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RSYM__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RSYM__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RSYM__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RSYM__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RSYM__Alternatives2010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RSYM__Alternatives2030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RSYM__Alternatives2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RSYM__Alternatives2070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RSYM__Alternatives2090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RSYM__Alternatives2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__0__Impl_in_rule__TechnologyCatalog__Group__02142 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__1_in_rule__TechnologyCatalog__Group__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TechnologyCatalog__Group__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__1__Impl_in_rule__TechnologyCatalog__Group__12204 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__2_in_rule__TechnologyCatalog__Group__12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__NameAssignment_1_in_rule__TechnologyCatalog__Group__1__Impl2234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__2__Impl_in_rule__TechnologyCatalog__Group__22264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__ModelElementsAssignment_2_in_rule__TechnologyCatalog__Group__2__Impl2291 = new BitSet(new long[]{0x0000980000000032L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Import__Group__0__Impl2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__02451 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__02454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ETD__Group__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__12513 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__22573 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_rule__ETD__Group__3_in_rule__ETD__Group__22576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl2603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__3__Impl_in_rule__ETD__Group__32634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__0_in_rule__ETD__Group__3__Impl2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__02700 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__02703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ETD__Group_2__0__Impl2731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__12762 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__2_in_rule__ETD__Group_2__12765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__BasesAssignment_2_1_in_rule__ETD__Group_2__1__Impl2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__2__Impl_in_rule__ETD__Group_2__22822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__0_in_rule__ETD__Group_2__2__Impl2849 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__0__Impl_in_rule__ETD__Group_2_2__02886 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__1_in_rule__ETD__Group_2_2__02889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ETD__Group_2_2__0__Impl2917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__1__Impl_in_rule__ETD__Group_2_2__12948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__BasesAssignment_2_2_1_in_rule__ETD__Group_2_2__1__Impl2975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__0__Impl_in_rule__ETD__Group_3__03009 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__1_in_rule__ETD__Group_3__03012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__ETD__Group_3__0__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__1__Impl_in_rule__ETD__Group_3__13071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__ValueAssignment_3_1_in_rule__ETD__Group_3__1__Impl3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__03132 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__03135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RTD__Group__0__Impl3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__13194 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__13197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl3224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__23254 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__23257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__0_in_rule__RTD__Group__2__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__33315 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__33318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__0_in_rule__RTD__Group__3__Impl3345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__43376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__ItemsAssignment_4_in_rule__RTD__Group__4__Impl3403 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__0__Impl_in_rule__RTD__Group_2__03444 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__1_in_rule__RTD__Group_2__03447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RTD__Group_2__0__Impl3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__1__Impl_in_rule__RTD__Group_2__13506 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__2_in_rule__RTD__Group_2__13509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__BasesAssignment_2_1_in_rule__RTD__Group_2__1__Impl3536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__2__Impl_in_rule__RTD__Group_2__23566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__0_in_rule__RTD__Group_2__2__Impl3593 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__0__Impl_in_rule__RTD__Group_2_2__03630 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__1_in_rule__RTD__Group_2_2__03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RTD__Group_2_2__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__1__Impl_in_rule__RTD__Group_2_2__13692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__BasesAssignment_2_2_1_in_rule__RTD__Group_2_2__1__Impl3719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__0__Impl_in_rule__RTD__Group_3__03753 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__1_in_rule__RTD__Group_3__03756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RTD__Group_3__0__Impl3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__1__Impl_in_rule__RTD__Group_3__13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__ValueAssignment_3_1_in_rule__RTD__Group_3__1__Impl3842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__0__Impl_in_rule__RTDItem__Group__03876 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__1_in_rule__RTDItem__Group__03879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__DomainAssignment_0_in_rule__RTDItem__Group__0__Impl3906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__1__Impl_in_rule__RTDItem__Group__13936 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__2_in_rule__RTDItem__Group__13939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RTDItem__Group__1__Impl3967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__2__Impl_in_rule__RTDItem__Group__23998 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__3_in_rule__RTDItem__Group__24001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__CodomainAssignment_2_in_rule__RTDItem__Group__2__Impl4028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__3__Impl_in_rule__RTDItem__Group__34058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__0_in_rule__RTDItem__Group__3__Impl4085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__0__Impl_in_rule__RTDItem__Group_3__04124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__1_in_rule__RTDItem__Group_3__04127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RTDItem__Group_3__0__Impl4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__1__Impl_in_rule__RTDItem__Group_3__14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__ValueAssignment_3_1_in_rule__RTDItem__Group_3__1__Impl4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__04247 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ED__Group__1_in_rule__ED__Group__04250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__TypeAssignment_0_in_rule__ED__Group__0__Impl4277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__14307 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__ED__Group__2_in_rule__ED__Group__14310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ED__Group__1__Impl4338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__24369 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ED__Group__3_in_rule__ED__Group__24372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__ItemsAssignment_2_in_rule__ED__Group__2__Impl4399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__3__Impl_in_rule__ED__Group__34429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__0_in_rule__ED__Group__3__Impl4456 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__0__Impl_in_rule__ED__Group_3__04495 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__ED__Group_3__1_in_rule__ED__Group_3__04498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ED__Group_3__0__Impl4526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__1__Impl_in_rule__ED__Group_3__14557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__ItemsAssignment_3_1_in_rule__ED__Group_3__1__Impl4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__0__Impl_in_rule__EDItem__Group__04618 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EDItem__Group__1_in_rule__EDItem__Group__04621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__NameAssignment_0_in_rule__EDItem__Group__0__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__1__Impl_in_rule__EDItem__Group__14678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__0_in_rule__EDItem__Group__1__Impl4705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__0__Impl_in_rule__EDItem__Group_1__04740 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__1_in_rule__EDItem__Group_1__04743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__EDItem__Group_1__0__Impl4771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__1__Impl_in_rule__EDItem__Group_1__14802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__ValueAssignment_1_1_in_rule__EDItem__Group_1__1__Impl4829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__04863 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__04866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__LeftAssignment_0_in_rule__RD__Group__0__Impl4893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__14923 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelationAssignment_1_in_rule__RD__Group__1__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__24983 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RD__Group__3_in_rule__RD__Group__24986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RightAssignment_2_in_rule__RD__Group__2__Impl5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__3__Impl_in_rule__RD__Group__35043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__0_in_rule__RD__Group__3__Impl5070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__0__Impl_in_rule__RD__Group_3__05109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RD__Group_3__1_in_rule__RD__Group_3__05112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RD__Group_3__0__Impl5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__1__Impl_in_rule__RD__Group_3__15171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__ValueAssignment_3_1_in_rule__RD__Group_3__1__Impl5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_rule__TechnologyCatalog__NameAssignment_15237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElement_in_rule__TechnologyCatalog__ModelElementsAssignment_25268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_rule__Import__RefAssignment_15303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__NameAssignment_15338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_15373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_2_15412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ETD__ValueAssignment_3_15447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__NameAssignment_15478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_15513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_2_15552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTD__ValueAssignment_3_15587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTDItem_in_rule__RTD__ItemsAssignment_45618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__RTDItem__DomainAssignment_05653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__RTDItem__CodomainAssignment_25692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTDItem__ValueAssignment_3_15727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ED__TypeAssignment_05762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_25797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_3_15828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__EDItem__NameAssignment_05859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EDItem__ValueAssignment_1_15890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__RD__LeftAssignment_05925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RD__RelationAssignment_15964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__RD__RightAssignment_26003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RD__ValueAssignment_3_16038 = new BitSet(new long[]{0x0000000000000002L});

}