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


    // $ANTLR start "entryRuleImport"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:90:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:91:1: ( ruleImport EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:92:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport123);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport130); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:99:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:103:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:104:1: ( ( rule__Import__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:104:1: ( ( rule__Import__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:105:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:106:1: ( rule__Import__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:106:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport156);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:118:1: entryRuleModelElement : ruleModelElement EOF ;
    public final void entryRuleModelElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:119:1: ( ruleModelElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:120:1: ruleModelElement EOF
            {
             before(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement183);
            ruleModelElement();

            state._fsp--;

             after(grammarAccess.getModelElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement190); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:127:1: ruleModelElement : ( ( rule__ModelElement__Alternatives ) ) ;
    public final void ruleModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:131:2: ( ( ( rule__ModelElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:132:1: ( ( rule__ModelElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:132:1: ( ( rule__ModelElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:133:1: ( rule__ModelElement__Alternatives )
            {
             before(grammarAccess.getModelElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:134:1: ( rule__ModelElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:134:2: rule__ModelElement__Alternatives
            {
            pushFollow(FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement216);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:146:1: entryRuleDefinitionElement : ruleDefinitionElement EOF ;
    public final void entryRuleDefinitionElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:147:1: ( ruleDefinitionElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:148:1: ruleDefinitionElement EOF
            {
             before(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement243);
            ruleDefinitionElement();

            state._fsp--;

             after(grammarAccess.getDefinitionElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionElement250); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:155:1: ruleDefinitionElement : ( ( rule__DefinitionElement__Alternatives ) ) ;
    public final void ruleDefinitionElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:159:2: ( ( ( rule__DefinitionElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:160:1: ( ( rule__DefinitionElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:160:1: ( ( rule__DefinitionElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:161:1: ( rule__DefinitionElement__Alternatives )
            {
             before(grammarAccess.getDefinitionElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:162:1: ( rule__DefinitionElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:162:2: rule__DefinitionElement__Alternatives
            {
            pushFollow(FOLLOW_rule__DefinitionElement__Alternatives_in_ruleDefinitionElement276);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:174:1: entryRuleInstanceElement : ruleInstanceElement EOF ;
    public final void entryRuleInstanceElement() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:175:1: ( ruleInstanceElement EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:176:1: ruleInstanceElement EOF
            {
             before(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement303);
            ruleInstanceElement();

            state._fsp--;

             after(grammarAccess.getInstanceElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceElement310); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:183:1: ruleInstanceElement : ( ( rule__InstanceElement__Alternatives ) ) ;
    public final void ruleInstanceElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:187:2: ( ( ( rule__InstanceElement__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:188:1: ( ( rule__InstanceElement__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:188:1: ( ( rule__InstanceElement__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:189:1: ( rule__InstanceElement__Alternatives )
            {
             before(grammarAccess.getInstanceElementAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:190:1: ( rule__InstanceElement__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:190:2: rule__InstanceElement__Alternatives
            {
            pushFollow(FOLLOW_rule__InstanceElement__Alternatives_in_ruleInstanceElement336);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:202:1: entryRuleETD : ruleETD EOF ;
    public final void entryRuleETD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:203:1: ( ruleETD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:204:1: ruleETD EOF
            {
             before(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD363);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getETDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD370); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:211:1: ruleETD : ( ( rule__ETD__Group__0 ) ) ;
    public final void ruleETD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:215:2: ( ( ( rule__ETD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:216:1: ( ( rule__ETD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:216:1: ( ( rule__ETD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:217:1: ( rule__ETD__Group__0 )
            {
             before(grammarAccess.getETDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:218:1: ( rule__ETD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:218:2: rule__ETD__Group__0
            {
            pushFollow(FOLLOW_rule__ETD__Group__0_in_ruleETD396);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:230:1: entryRuleRTD : ruleRTD EOF ;
    public final void entryRuleRTD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:231:1: ( ruleRTD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:232:1: ruleRTD EOF
            {
             before(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD423);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getRTDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD430); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:239:1: ruleRTD : ( ( rule__RTD__Group__0 ) ) ;
    public final void ruleRTD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:243:2: ( ( ( rule__RTD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:244:1: ( ( rule__RTD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:244:1: ( ( rule__RTD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:245:1: ( rule__RTD__Group__0 )
            {
             before(grammarAccess.getRTDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:246:1: ( rule__RTD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:246:2: rule__RTD__Group__0
            {
            pushFollow(FOLLOW_rule__RTD__Group__0_in_ruleRTD456);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:258:1: entryRuleRTDItem : ruleRTDItem EOF ;
    public final void entryRuleRTDItem() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:259:1: ( ruleRTDItem EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:260:1: ruleRTDItem EOF
            {
             before(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_ruleRTDItem_in_entryRuleRTDItem483);
            ruleRTDItem();

            state._fsp--;

             after(grammarAccess.getRTDItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTDItem490); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:267:1: ruleRTDItem : ( ( rule__RTDItem__Group__0 ) ) ;
    public final void ruleRTDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:271:2: ( ( ( rule__RTDItem__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:272:1: ( ( rule__RTDItem__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:272:1: ( ( rule__RTDItem__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:273:1: ( rule__RTDItem__Group__0 )
            {
             before(grammarAccess.getRTDItemAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:274:1: ( rule__RTDItem__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:274:2: rule__RTDItem__Group__0
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__0_in_ruleRTDItem516);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:286:1: entryRuleED : ruleED EOF ;
    public final void entryRuleED() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:287:1: ( ruleED EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:288:1: ruleED EOF
            {
             before(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED543);
            ruleED();

            state._fsp--;

             after(grammarAccess.getEDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED550); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:295:1: ruleED : ( ( rule__ED__Group__0 ) ) ;
    public final void ruleED() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:299:2: ( ( ( rule__ED__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:300:1: ( ( rule__ED__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:300:1: ( ( rule__ED__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:301:1: ( rule__ED__Group__0 )
            {
             before(grammarAccess.getEDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:302:1: ( rule__ED__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:302:2: rule__ED__Group__0
            {
            pushFollow(FOLLOW_rule__ED__Group__0_in_ruleED576);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:314:1: entryRuleEDItem : ruleEDItem EOF ;
    public final void entryRuleEDItem() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:315:1: ( ruleEDItem EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:316:1: ruleEDItem EOF
            {
             before(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_ruleEDItem_in_entryRuleEDItem603);
            ruleEDItem();

            state._fsp--;

             after(grammarAccess.getEDItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDItem610); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:323:1: ruleEDItem : ( ( rule__EDItem__Group__0 ) ) ;
    public final void ruleEDItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:327:2: ( ( ( rule__EDItem__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:328:1: ( ( rule__EDItem__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:328:1: ( ( rule__EDItem__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:329:1: ( rule__EDItem__Group__0 )
            {
             before(grammarAccess.getEDItemAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:330:1: ( rule__EDItem__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:330:2: rule__EDItem__Group__0
            {
            pushFollow(FOLLOW_rule__EDItem__Group__0_in_ruleEDItem636);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:342:1: entryRuleRD : ruleRD EOF ;
    public final void entryRuleRD() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:343:1: ( ruleRD EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:344:1: ruleRD EOF
            {
             before(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD663);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getRDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD670); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:351:1: ruleRD : ( ( rule__RD__Group__0 ) ) ;
    public final void ruleRD() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:355:2: ( ( ( rule__RD__Group__0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:356:1: ( ( rule__RD__Group__0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:356:1: ( ( rule__RD__Group__0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:357:1: ( rule__RD__Group__0 )
            {
             before(grammarAccess.getRDAccess().getGroup()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:358:1: ( rule__RD__Group__0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:358:2: rule__RD__Group__0
            {
            pushFollow(FOLLOW_rule__RD__Group__0_in_ruleRD696);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:370:1: entryRuleTCID : ruleTCID EOF ;
    public final void entryRuleTCID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:371:1: ( ruleTCID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:372:1: ruleTCID EOF
            {
             before(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_ruleTCID_in_entryRuleTCID723);
            ruleTCID();

            state._fsp--;

             after(grammarAccess.getTCIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCID730); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:379:1: ruleTCID : ( RULE_ID ) ;
    public final void ruleTCID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:383:2: ( ( RULE_ID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:384:1: ( RULE_ID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:384:1: ( RULE_ID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:385:1: RULE_ID
            {
             before(grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTCID756); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:398:1: entryRuleRTID : ruleRTID EOF ;
    public final void entryRuleRTID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:399:1: ( ruleRTID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:400:1: ruleRTID EOF
            {
             before(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_ruleRTID_in_entryRuleRTID782);
            ruleRTID();

            state._fsp--;

             after(grammarAccess.getRTIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTID789); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:407:1: ruleRTID : ( ( rule__RTID__Alternatives ) ) ;
    public final void ruleRTID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:411:2: ( ( ( rule__RTID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:412:1: ( ( rule__RTID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:412:1: ( ( rule__RTID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:413:1: ( rule__RTID__Alternatives )
            {
             before(grammarAccess.getRTIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:414:1: ( rule__RTID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:414:2: rule__RTID__Alternatives
            {
            pushFollow(FOLLOW_rule__RTID__Alternatives_in_ruleRTID815);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:426:1: entryRuleETID : ruleETID EOF ;
    public final void entryRuleETID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:427:1: ( ruleETID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:428:1: ruleETID EOF
            {
             before(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_ruleETID_in_entryRuleETID842);
            ruleETID();

            state._fsp--;

             after(grammarAccess.getETIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETID849); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:435:1: ruleETID : ( ( rule__ETID__Alternatives ) ) ;
    public final void ruleETID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:439:2: ( ( ( rule__ETID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:440:1: ( ( rule__ETID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:440:1: ( ( rule__ETID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:441:1: ( rule__ETID__Alternatives )
            {
             before(grammarAccess.getETIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:442:1: ( rule__ETID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:442:2: rule__ETID__Alternatives
            {
            pushFollow(FOLLOW_rule__ETID__Alternatives_in_ruleETID875);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:454:1: entryRuleEID : ruleEID EOF ;
    public final void entryRuleEID() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:455:1: ( ruleEID EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:456:1: ruleEID EOF
            {
             before(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_ruleEID_in_entryRuleEID902);
            ruleEID();

            state._fsp--;

             after(grammarAccess.getEIDRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEID909); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:463:1: ruleEID : ( ( rule__EID__Alternatives ) ) ;
    public final void ruleEID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:467:2: ( ( ( rule__EID__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:468:1: ( ( rule__EID__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:468:1: ( ( rule__EID__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:469:1: ( rule__EID__Alternatives )
            {
             before(grammarAccess.getEIDAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:470:1: ( rule__EID__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:470:2: rule__EID__Alternatives
            {
            pushFollow(FOLLOW_rule__EID__Alternatives_in_ruleEID935);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:482:1: entryRuleRSYM : ruleRSYM EOF ;
    public final void entryRuleRSYM() throws RecognitionException {
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:483:1: ( ruleRSYM EOF )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:484:1: ruleRSYM EOF
            {
             before(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_ruleRSYM_in_entryRuleRSYM962);
            ruleRSYM();

            state._fsp--;

             after(grammarAccess.getRSYMRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSYM969); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:491:1: ruleRSYM : ( ( rule__RSYM__Alternatives ) ) ;
    public final void ruleRSYM() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:495:2: ( ( ( rule__RSYM__Alternatives ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:496:1: ( ( rule__RSYM__Alternatives ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:496:1: ( ( rule__RSYM__Alternatives ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:497:1: ( rule__RSYM__Alternatives )
            {
             before(grammarAccess.getRSYMAccess().getAlternatives()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:498:1: ( rule__RSYM__Alternatives )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:498:2: rule__RSYM__Alternatives
            {
            pushFollow(FOLLOW_rule__RSYM__Alternatives_in_ruleRSYM995);
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


    // $ANTLR start "rule__TechnologyCatalog__Alternatives_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:510:1: rule__TechnologyCatalog__Alternatives_2 : ( ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) ) | ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) ) | ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) ) | ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) ) | ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) ) );
    public final void rule__TechnologyCatalog__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:514:1: ( ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) ) | ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) ) | ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) ) | ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) ) | ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 44:
                {
                alt1=2;
                }
                break;
            case 47:
                {
                alt1=3;
                }
                break;
            case RULE_ID:
                {
                int LA1_4 = input.LA(2);

                if ( (LA1_4==49) ) {
                    alt1=4;
                }
                else if ( ((LA1_4>=RULE_ID && LA1_4<=RULE_STRING)||(LA1_4>=8 && LA1_4<=41)) ) {
                    alt1=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 4, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA1_5 = input.LA(2);

                if ( ((LA1_5>=RULE_ID && LA1_5<=RULE_STRING)||(LA1_5>=8 && LA1_5<=41)) ) {
                    alt1=5;
                }
                else if ( (LA1_5==49) ) {
                    alt1=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:515:1: ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:515:1: ( ( rule__TechnologyCatalog__ImportsAssignment_2_0 ) )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:516:1: ( rule__TechnologyCatalog__ImportsAssignment_2_0 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getImportsAssignment_2_0()); 
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:517:1: ( rule__TechnologyCatalog__ImportsAssignment_2_0 )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:517:2: rule__TechnologyCatalog__ImportsAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__TechnologyCatalog__ImportsAssignment_2_0_in_rule__TechnologyCatalog__Alternatives_21031);
                    rule__TechnologyCatalog__ImportsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getImportsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:521:6: ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:521:6: ( ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 ) )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:522:1: ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getEntityTypesAssignment_2_1()); 
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:523:1: ( rule__TechnologyCatalog__EntityTypesAssignment_2_1 )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:523:2: rule__TechnologyCatalog__EntityTypesAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__TechnologyCatalog__EntityTypesAssignment_2_1_in_rule__TechnologyCatalog__Alternatives_21049);
                    rule__TechnologyCatalog__EntityTypesAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getEntityTypesAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:527:6: ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:527:6: ( ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 ) )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:528:1: ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getRelationTypesAssignment_2_2()); 
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:529:1: ( rule__TechnologyCatalog__RelationTypesAssignment_2_2 )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:529:2: rule__TechnologyCatalog__RelationTypesAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__TechnologyCatalog__RelationTypesAssignment_2_2_in_rule__TechnologyCatalog__Alternatives_21067);
                    rule__TechnologyCatalog__RelationTypesAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getRelationTypesAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:533:6: ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:533:6: ( ( rule__TechnologyCatalog__EntitiesAssignment_2_3 ) )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:534:1: ( rule__TechnologyCatalog__EntitiesAssignment_2_3 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getEntitiesAssignment_2_3()); 
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:535:1: ( rule__TechnologyCatalog__EntitiesAssignment_2_3 )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:535:2: rule__TechnologyCatalog__EntitiesAssignment_2_3
                    {
                    pushFollow(FOLLOW_rule__TechnologyCatalog__EntitiesAssignment_2_3_in_rule__TechnologyCatalog__Alternatives_21085);
                    rule__TechnologyCatalog__EntitiesAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getEntitiesAssignment_2_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:539:6: ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:539:6: ( ( rule__TechnologyCatalog__RelationsAssignment_2_4 ) )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:540:1: ( rule__TechnologyCatalog__RelationsAssignment_2_4 )
                    {
                     before(grammarAccess.getTechnologyCatalogAccess().getRelationsAssignment_2_4()); 
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:541:1: ( rule__TechnologyCatalog__RelationsAssignment_2_4 )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:541:2: rule__TechnologyCatalog__RelationsAssignment_2_4
                    {
                    pushFollow(FOLLOW_rule__TechnologyCatalog__RelationsAssignment_2_4_in_rule__TechnologyCatalog__Alternatives_21103);
                    rule__TechnologyCatalog__RelationsAssignment_2_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getTechnologyCatalogAccess().getRelationsAssignment_2_4()); 

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
    // $ANTLR end "rule__TechnologyCatalog__Alternatives_2"


    // $ANTLR start "rule__ModelElement__Alternatives"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:551:1: rule__ModelElement__Alternatives : ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) );
    public final void rule__ModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:555:1: ( ( ruleDefinitionElement ) | ( ruleInstanceElement ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:556:1: ( ruleDefinitionElement )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:556:1: ( ruleDefinitionElement )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:557:1: ruleDefinitionElement
                    {
                     before(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefinitionElement_in_rule__ModelElement__Alternatives1137);
                    ruleDefinitionElement();

                    state._fsp--;

                     after(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:562:6: ( ruleInstanceElement )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:562:6: ( ruleInstanceElement )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:563:1: ruleInstanceElement
                    {
                     before(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleInstanceElement_in_rule__ModelElement__Alternatives1154);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:573:1: rule__DefinitionElement__Alternatives : ( ( ruleETD ) | ( ruleRTD ) );
    public final void rule__DefinitionElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:577:1: ( ( ruleETD ) | ( ruleRTD ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:578:1: ( ruleETD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:578:1: ( ruleETD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:579:1: ruleETD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleETD_in_rule__DefinitionElement__Alternatives1186);
                    ruleETD();

                    state._fsp--;

                     after(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:584:6: ( ruleRTD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:584:6: ( ruleRTD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:585:1: ruleRTD
                    {
                     before(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRTD_in_rule__DefinitionElement__Alternatives1203);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:595:1: rule__InstanceElement__Alternatives : ( ( ruleED ) | ( ruleRD ) );
    public final void rule__InstanceElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:599:1: ( ( ruleED ) | ( ruleRD ) )
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

                if ( ((LA4_2>=RULE_ID && LA4_2<=RULE_STRING)||(LA4_2>=8 && LA4_2<=41)) ) {
                    alt4=2;
                }
                else if ( (LA4_2==49) ) {
                    alt4=1;
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:600:1: ( ruleED )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:600:1: ( ruleED )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:601:1: ruleED
                    {
                     before(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleED_in_rule__InstanceElement__Alternatives1235);
                    ruleED();

                    state._fsp--;

                     after(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:606:6: ( ruleRD )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:606:6: ( ruleRD )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:607:1: ruleRD
                    {
                     before(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRD_in_rule__InstanceElement__Alternatives1252);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:617:1: rule__RTID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) );
    public final void rule__RTID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:621:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( ruleRSYM ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:622:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:622:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:623:1: RULE_ID
                    {
                     before(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RTID__Alternatives1284); 
                     after(grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:628:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:628:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:629:1: RULE_STRING
                    {
                     before(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTID__Alternatives1301); 
                     after(grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:634:6: ( ruleRSYM )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:634:6: ( ruleRSYM )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:635:1: ruleRSYM
                    {
                     before(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRSYM_in_rule__RTID__Alternatives1318);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:645:1: rule__ETID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ETID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:649:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:650:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:650:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:651:1: RULE_ID
                    {
                     before(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ETID__Alternatives1350); 
                     after(grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:656:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:656:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:657:1: RULE_STRING
                    {
                     before(grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ETID__Alternatives1367); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:667:1: rule__EID__Alternatives : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__EID__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:671:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:672:1: ( RULE_ID )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:672:1: ( RULE_ID )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:673:1: RULE_ID
                    {
                     before(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EID__Alternatives1399); 
                     after(grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:678:6: ( RULE_STRING )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:678:6: ( RULE_STRING )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:679:1: RULE_STRING
                    {
                     before(grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EID__Alternatives1416); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:689:1: rule__RSYM__Alternatives : ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) );
    public final void rule__RSYM__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:693:1: ( ( '=' ) | ( '+' ) | ( '-' ) | ( '*' ) | ( '/' ) | ( '%' ) | ( '++' ) | ( '--' ) | ( '==' ) | ( '!=' ) | ( '>' ) | ( '<' ) | ( '>=' ) | ( '<=' ) | ( '!' ) | ( '&&' ) | ( '||' ) | ( '~' ) | ( '&' ) | ( '|' ) | ( '^' ) | ( '<<' ) | ( '>>' ) | ( '+=' ) | ( '-=' ) | ( '*=' ) | ( '/=' ) | ( '%=' ) | ( '&=' ) | ( '|=' ) | ( '^=' ) | ( '<<=' ) | ( '>>=' ) | ( '?' ) )
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
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:694:1: ( '=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:694:1: ( '=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:695:1: '='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 
                    match(input,8,FOLLOW_8_in_rule__RSYM__Alternatives1449); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:702:6: ( '+' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:702:6: ( '+' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:703:1: '+'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 
                    match(input,9,FOLLOW_9_in_rule__RSYM__Alternatives1469); 
                     after(grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:710:6: ( '-' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:710:6: ( '-' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:711:1: '-'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 
                    match(input,10,FOLLOW_10_in_rule__RSYM__Alternatives1489); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:718:6: ( '*' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:718:6: ( '*' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:719:1: '*'
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 
                    match(input,11,FOLLOW_11_in_rule__RSYM__Alternatives1509); 
                     after(grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:726:6: ( '/' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:726:6: ( '/' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:727:1: '/'
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 
                    match(input,12,FOLLOW_12_in_rule__RSYM__Alternatives1529); 
                     after(grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:734:6: ( '%' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:734:6: ( '%' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:735:1: '%'
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 
                    match(input,13,FOLLOW_13_in_rule__RSYM__Alternatives1549); 
                     after(grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:742:6: ( '++' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:742:6: ( '++' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:743:1: '++'
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 
                    match(input,14,FOLLOW_14_in_rule__RSYM__Alternatives1569); 
                     after(grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:750:6: ( '--' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:750:6: ( '--' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:751:1: '--'
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 
                    match(input,15,FOLLOW_15_in_rule__RSYM__Alternatives1589); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:758:6: ( '==' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:758:6: ( '==' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:759:1: '=='
                    {
                     before(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 
                    match(input,16,FOLLOW_16_in_rule__RSYM__Alternatives1609); 
                     after(grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:766:6: ( '!=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:766:6: ( '!=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:767:1: '!='
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 
                    match(input,17,FOLLOW_17_in_rule__RSYM__Alternatives1629); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:774:6: ( '>' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:774:6: ( '>' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:775:1: '>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 
                    match(input,18,FOLLOW_18_in_rule__RSYM__Alternatives1649); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:782:6: ( '<' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:782:6: ( '<' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:783:1: '<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 
                    match(input,19,FOLLOW_19_in_rule__RSYM__Alternatives1669); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:790:6: ( '>=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:790:6: ( '>=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:791:1: '>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                    match(input,20,FOLLOW_20_in_rule__RSYM__Alternatives1689); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:798:6: ( '<=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:798:6: ( '<=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:799:1: '<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 
                    match(input,21,FOLLOW_21_in_rule__RSYM__Alternatives1709); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:806:6: ( '!' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:806:6: ( '!' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:807:1: '!'
                    {
                     before(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 
                    match(input,22,FOLLOW_22_in_rule__RSYM__Alternatives1729); 
                     after(grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:814:6: ( '&&' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:814:6: ( '&&' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:815:1: '&&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 
                    match(input,23,FOLLOW_23_in_rule__RSYM__Alternatives1749); 
                     after(grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:822:6: ( '||' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:822:6: ( '||' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:823:1: '||'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 
                    match(input,24,FOLLOW_24_in_rule__RSYM__Alternatives1769); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:830:6: ( '~' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:830:6: ( '~' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:831:1: '~'
                    {
                     before(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 
                    match(input,25,FOLLOW_25_in_rule__RSYM__Alternatives1789); 
                     after(grammarAccess.getRSYMAccess().getTildeKeyword_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:838:6: ( '&' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:838:6: ( '&' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:839:1: '&'
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 
                    match(input,26,FOLLOW_26_in_rule__RSYM__Alternatives1809); 
                     after(grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 

                    }


                    }
                    break;
                case 20 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:846:6: ( '|' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:846:6: ( '|' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:847:1: '|'
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 
                    match(input,27,FOLLOW_27_in_rule__RSYM__Alternatives1829); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 

                    }


                    }
                    break;
                case 21 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:854:6: ( '^' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:854:6: ( '^' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:855:1: '^'
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 
                    match(input,28,FOLLOW_28_in_rule__RSYM__Alternatives1849); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 

                    }


                    }
                    break;
                case 22 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:862:6: ( '<<' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:862:6: ( '<<' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:863:1: '<<'
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 
                    match(input,29,FOLLOW_29_in_rule__RSYM__Alternatives1869); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 

                    }


                    }
                    break;
                case 23 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:870:6: ( '>>' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:870:6: ( '>>' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:871:1: '>>'
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 
                    match(input,30,FOLLOW_30_in_rule__RSYM__Alternatives1889); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 

                    }


                    }
                    break;
                case 24 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:878:6: ( '+=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:878:6: ( '+=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:879:1: '+='
                    {
                     before(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 
                    match(input,31,FOLLOW_31_in_rule__RSYM__Alternatives1909); 
                     after(grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 

                    }


                    }
                    break;
                case 25 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:886:6: ( '-=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:886:6: ( '-=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:887:1: '-='
                    {
                     before(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 
                    match(input,32,FOLLOW_32_in_rule__RSYM__Alternatives1929); 
                     after(grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 

                    }


                    }
                    break;
                case 26 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:894:6: ( '*=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:894:6: ( '*=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:895:1: '*='
                    {
                     before(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 
                    match(input,33,FOLLOW_33_in_rule__RSYM__Alternatives1949); 
                     after(grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 

                    }


                    }
                    break;
                case 27 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:902:6: ( '/=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:902:6: ( '/=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:903:1: '/='
                    {
                     before(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 
                    match(input,34,FOLLOW_34_in_rule__RSYM__Alternatives1969); 
                     after(grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 

                    }


                    }
                    break;
                case 28 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:910:6: ( '%=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:910:6: ( '%=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:911:1: '%='
                    {
                     before(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 
                    match(input,35,FOLLOW_35_in_rule__RSYM__Alternatives1989); 
                     after(grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 

                    }


                    }
                    break;
                case 29 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:918:6: ( '&=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:918:6: ( '&=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:919:1: '&='
                    {
                     before(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 
                    match(input,36,FOLLOW_36_in_rule__RSYM__Alternatives2009); 
                     after(grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 

                    }


                    }
                    break;
                case 30 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:926:6: ( '|=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:926:6: ( '|=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:927:1: '|='
                    {
                     before(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 
                    match(input,37,FOLLOW_37_in_rule__RSYM__Alternatives2029); 
                     after(grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 

                    }


                    }
                    break;
                case 31 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:934:6: ( '^=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:934:6: ( '^=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:935:1: '^='
                    {
                     before(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 
                    match(input,38,FOLLOW_38_in_rule__RSYM__Alternatives2049); 
                     after(grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 

                    }


                    }
                    break;
                case 32 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:942:6: ( '<<=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:942:6: ( '<<=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:943:1: '<<='
                    {
                     before(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 
                    match(input,39,FOLLOW_39_in_rule__RSYM__Alternatives2069); 
                     after(grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 

                    }


                    }
                    break;
                case 33 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:950:6: ( '>>=' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:950:6: ( '>>=' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:951:1: '>>='
                    {
                     before(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 
                    match(input,40,FOLLOW_40_in_rule__RSYM__Alternatives2089); 
                     after(grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 

                    }


                    }
                    break;
                case 34 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:958:6: ( '?' )
                    {
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:958:6: ( '?' )
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:959:1: '?'
                    {
                     before(grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 
                    match(input,41,FOLLOW_41_in_rule__RSYM__Alternatives2109); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:973:1: rule__TechnologyCatalog__Group__0 : rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 ;
    public final void rule__TechnologyCatalog__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:977:1: ( rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:978:2: rule__TechnologyCatalog__Group__0__Impl rule__TechnologyCatalog__Group__1
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__0__Impl_in_rule__TechnologyCatalog__Group__02141);
            rule__TechnologyCatalog__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__1_in_rule__TechnologyCatalog__Group__02144);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:985:1: rule__TechnologyCatalog__Group__0__Impl : ( 'model' ) ;
    public final void rule__TechnologyCatalog__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:989:1: ( ( 'model' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:990:1: ( 'model' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:990:1: ( 'model' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:991:1: 'model'
            {
             before(grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__TechnologyCatalog__Group__0__Impl2172); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1004:1: rule__TechnologyCatalog__Group__1 : rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 ;
    public final void rule__TechnologyCatalog__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1008:1: ( rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1009:2: rule__TechnologyCatalog__Group__1__Impl rule__TechnologyCatalog__Group__2
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__1__Impl_in_rule__TechnologyCatalog__Group__12203);
            rule__TechnologyCatalog__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__2_in_rule__TechnologyCatalog__Group__12206);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1016:1: rule__TechnologyCatalog__Group__1__Impl : ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) ;
    public final void rule__TechnologyCatalog__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1020:1: ( ( ( rule__TechnologyCatalog__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1021:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1021:1: ( ( rule__TechnologyCatalog__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1022:1: ( rule__TechnologyCatalog__NameAssignment_1 )
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1023:1: ( rule__TechnologyCatalog__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1023:2: rule__TechnologyCatalog__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__NameAssignment_1_in_rule__TechnologyCatalog__Group__1__Impl2233);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1033:1: rule__TechnologyCatalog__Group__2 : rule__TechnologyCatalog__Group__2__Impl ;
    public final void rule__TechnologyCatalog__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1037:1: ( rule__TechnologyCatalog__Group__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1038:2: rule__TechnologyCatalog__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TechnologyCatalog__Group__2__Impl_in_rule__TechnologyCatalog__Group__22263);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1044:1: rule__TechnologyCatalog__Group__2__Impl : ( ( rule__TechnologyCatalog__Alternatives_2 )* ) ;
    public final void rule__TechnologyCatalog__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1048:1: ( ( ( rule__TechnologyCatalog__Alternatives_2 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1049:1: ( ( rule__TechnologyCatalog__Alternatives_2 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1049:1: ( ( rule__TechnologyCatalog__Alternatives_2 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1050:1: ( rule__TechnologyCatalog__Alternatives_2 )*
            {
             before(grammarAccess.getTechnologyCatalogAccess().getAlternatives_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1051:1: ( rule__TechnologyCatalog__Alternatives_2 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_STRING)||(LA9_0>=43 && LA9_0<=44)||LA9_0==47) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1051:2: rule__TechnologyCatalog__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__TechnologyCatalog__Alternatives_2_in_rule__TechnologyCatalog__Group__2__Impl2290);
            	    rule__TechnologyCatalog__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTechnologyCatalogAccess().getAlternatives_2()); 

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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1067:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1071:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1072:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02327);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02330);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1079:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1083:1: ( ( 'import' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1084:1: ( 'import' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1084:1: ( 'import' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1085:1: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Import__Group__0__Impl2358); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1098:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1102:1: ( rule__Import__Group__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1103:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12389);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1109:1: rule__Import__Group__1__Impl : ( ( rule__Import__RefAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1113:1: ( ( ( rule__Import__RefAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1114:1: ( ( rule__Import__RefAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1114:1: ( ( rule__Import__RefAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1115:1: ( rule__Import__RefAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getRefAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1116:1: ( rule__Import__RefAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1116:2: rule__Import__RefAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl2416);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1130:1: rule__ETD__Group__0 : rule__ETD__Group__0__Impl rule__ETD__Group__1 ;
    public final void rule__ETD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1134:1: ( rule__ETD__Group__0__Impl rule__ETD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1135:2: rule__ETD__Group__0__Impl rule__ETD__Group__1
            {
            pushFollow(FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__02450);
            rule__ETD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__02453);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1142:1: rule__ETD__Group__0__Impl : ( 'type' ) ;
    public final void rule__ETD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1146:1: ( ( 'type' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1147:1: ( 'type' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1147:1: ( 'type' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1148:1: 'type'
            {
             before(grammarAccess.getETDAccess().getTypeKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__ETD__Group__0__Impl2481); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1161:1: rule__ETD__Group__1 : rule__ETD__Group__1__Impl rule__ETD__Group__2 ;
    public final void rule__ETD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1165:1: ( rule__ETD__Group__1__Impl rule__ETD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1166:2: rule__ETD__Group__1__Impl rule__ETD__Group__2
            {
            pushFollow(FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__12512);
            rule__ETD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__12515);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1173:1: rule__ETD__Group__1__Impl : ( ( rule__ETD__NameAssignment_1 ) ) ;
    public final void rule__ETD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1177:1: ( ( ( rule__ETD__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1178:1: ( ( rule__ETD__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1178:1: ( ( rule__ETD__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1179:1: ( rule__ETD__NameAssignment_1 )
            {
             before(grammarAccess.getETDAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1180:1: ( rule__ETD__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1180:2: rule__ETD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl2542);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1190:1: rule__ETD__Group__2 : rule__ETD__Group__2__Impl rule__ETD__Group__3 ;
    public final void rule__ETD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1194:1: ( rule__ETD__Group__2__Impl rule__ETD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1195:2: rule__ETD__Group__2__Impl rule__ETD__Group__3
            {
            pushFollow(FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__22572);
            rule__ETD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group__3_in_rule__ETD__Group__22575);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1202:1: rule__ETD__Group__2__Impl : ( ( rule__ETD__Group_2__0 )? ) ;
    public final void rule__ETD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1206:1: ( ( ( rule__ETD__Group_2__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1207:1: ( ( rule__ETD__Group_2__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1207:1: ( ( rule__ETD__Group_2__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1208:1: ( rule__ETD__Group_2__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1209:1: ( rule__ETD__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==45) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1209:2: rule__ETD__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl2602);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1219:1: rule__ETD__Group__3 : rule__ETD__Group__3__Impl ;
    public final void rule__ETD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1223:1: ( rule__ETD__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1224:2: rule__ETD__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group__3__Impl_in_rule__ETD__Group__32633);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1230:1: rule__ETD__Group__3__Impl : ( ( rule__ETD__Group_3__0 )? ) ;
    public final void rule__ETD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1234:1: ( ( ( rule__ETD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1235:1: ( ( rule__ETD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1235:1: ( ( rule__ETD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1236:1: ( rule__ETD__Group_3__0 )?
            {
             before(grammarAccess.getETDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1237:1: ( rule__ETD__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==8) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1237:2: rule__ETD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__ETD__Group_3__0_in_rule__ETD__Group__3__Impl2660);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1255:1: rule__ETD__Group_2__0 : rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 ;
    public final void rule__ETD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1259:1: ( rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1260:2: rule__ETD__Group_2__0__Impl rule__ETD__Group_2__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__02699);
            rule__ETD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__02702);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1267:1: rule__ETD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__ETD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1271:1: ( ( 'from' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1272:1: ( 'from' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1272:1: ( 'from' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1273:1: 'from'
            {
             before(grammarAccess.getETDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__ETD__Group_2__0__Impl2730); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1286:1: rule__ETD__Group_2__1 : rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 ;
    public final void rule__ETD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1290:1: ( rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1291:2: rule__ETD__Group_2__1__Impl rule__ETD__Group_2__2
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__12761);
            rule__ETD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2__2_in_rule__ETD__Group_2__12764);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1298:1: rule__ETD__Group_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_1 ) ) ;
    public final void rule__ETD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1302:1: ( ( ( rule__ETD__BasesAssignment_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1303:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1303:1: ( ( rule__ETD__BasesAssignment_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1304:1: ( rule__ETD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1305:1: ( rule__ETD__BasesAssignment_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1305:2: rule__ETD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ETD__BasesAssignment_2_1_in_rule__ETD__Group_2__1__Impl2791);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1315:1: rule__ETD__Group_2__2 : rule__ETD__Group_2__2__Impl ;
    public final void rule__ETD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1319:1: ( rule__ETD__Group_2__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1320:2: rule__ETD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_2__2__Impl_in_rule__ETD__Group_2__22821);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1326:1: rule__ETD__Group_2__2__Impl : ( ( rule__ETD__Group_2_2__0 )* ) ;
    public final void rule__ETD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1330:1: ( ( ( rule__ETD__Group_2_2__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1331:1: ( ( rule__ETD__Group_2_2__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1331:1: ( ( rule__ETD__Group_2_2__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1332:1: ( rule__ETD__Group_2_2__0 )*
            {
             before(grammarAccess.getETDAccess().getGroup_2_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1333:1: ( rule__ETD__Group_2_2__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==46) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1333:2: rule__ETD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__ETD__Group_2_2__0_in_rule__ETD__Group_2__2__Impl2848);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1349:1: rule__ETD__Group_2_2__0 : rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 ;
    public final void rule__ETD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1353:1: ( rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1354:2: rule__ETD__Group_2_2__0__Impl rule__ETD__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_2_2__0__Impl_in_rule__ETD__Group_2_2__02885);
            rule__ETD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_2_2__1_in_rule__ETD__Group_2_2__02888);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1361:1: rule__ETD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ETD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1365:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1366:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1366:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1367:1: ','
            {
             before(grammarAccess.getETDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_46_in_rule__ETD__Group_2_2__0__Impl2916); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1380:1: rule__ETD__Group_2_2__1 : rule__ETD__Group_2_2__1__Impl ;
    public final void rule__ETD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1384:1: ( rule__ETD__Group_2_2__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1385:2: rule__ETD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_2_2__1__Impl_in_rule__ETD__Group_2_2__12947);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1391:1: rule__ETD__Group_2_2__1__Impl : ( ( rule__ETD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__ETD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1395:1: ( ( ( rule__ETD__BasesAssignment_2_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1396:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1396:1: ( ( rule__ETD__BasesAssignment_2_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1397:1: ( rule__ETD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getETDAccess().getBasesAssignment_2_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1398:1: ( rule__ETD__BasesAssignment_2_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1398:2: rule__ETD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ETD__BasesAssignment_2_2_1_in_rule__ETD__Group_2_2__1__Impl2974);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1412:1: rule__ETD__Group_3__0 : rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 ;
    public final void rule__ETD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1416:1: ( rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1417:2: rule__ETD__Group_3__0__Impl rule__ETD__Group_3__1
            {
            pushFollow(FOLLOW_rule__ETD__Group_3__0__Impl_in_rule__ETD__Group_3__03008);
            rule__ETD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ETD__Group_3__1_in_rule__ETD__Group_3__03011);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1424:1: rule__ETD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__ETD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1428:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1429:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1429:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1430:1: '='
            {
             before(grammarAccess.getETDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__ETD__Group_3__0__Impl3039); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1443:1: rule__ETD__Group_3__1 : rule__ETD__Group_3__1__Impl ;
    public final void rule__ETD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1447:1: ( rule__ETD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1448:2: rule__ETD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ETD__Group_3__1__Impl_in_rule__ETD__Group_3__13070);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1454:1: rule__ETD__Group_3__1__Impl : ( ( rule__ETD__ValueAssignment_3_1 ) ) ;
    public final void rule__ETD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1458:1: ( ( ( rule__ETD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1459:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1459:1: ( ( rule__ETD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1460:1: ( rule__ETD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getETDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1461:1: ( rule__ETD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1461:2: rule__ETD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ETD__ValueAssignment_3_1_in_rule__ETD__Group_3__1__Impl3097);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1475:1: rule__RTD__Group__0 : rule__RTD__Group__0__Impl rule__RTD__Group__1 ;
    public final void rule__RTD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1479:1: ( rule__RTD__Group__0__Impl rule__RTD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1480:2: rule__RTD__Group__0__Impl rule__RTD__Group__1
            {
            pushFollow(FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__03131);
            rule__RTD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__03134);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1487:1: rule__RTD__Group__0__Impl : ( 'relation' ) ;
    public final void rule__RTD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1491:1: ( ( 'relation' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1492:1: ( 'relation' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1492:1: ( 'relation' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1493:1: 'relation'
            {
             before(grammarAccess.getRTDAccess().getRelationKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__RTD__Group__0__Impl3162); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1506:1: rule__RTD__Group__1 : rule__RTD__Group__1__Impl rule__RTD__Group__2 ;
    public final void rule__RTD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1510:1: ( rule__RTD__Group__1__Impl rule__RTD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1511:2: rule__RTD__Group__1__Impl rule__RTD__Group__2
            {
            pushFollow(FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__13193);
            rule__RTD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__13196);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1518:1: rule__RTD__Group__1__Impl : ( ( rule__RTD__NameAssignment_1 ) ) ;
    public final void rule__RTD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1522:1: ( ( ( rule__RTD__NameAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1523:1: ( ( rule__RTD__NameAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1523:1: ( ( rule__RTD__NameAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1524:1: ( rule__RTD__NameAssignment_1 )
            {
             before(grammarAccess.getRTDAccess().getNameAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1525:1: ( rule__RTD__NameAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1525:2: rule__RTD__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl3223);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1535:1: rule__RTD__Group__2 : rule__RTD__Group__2__Impl rule__RTD__Group__3 ;
    public final void rule__RTD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1539:1: ( rule__RTD__Group__2__Impl rule__RTD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1540:2: rule__RTD__Group__2__Impl rule__RTD__Group__3
            {
            pushFollow(FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__23253);
            rule__RTD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__23256);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1547:1: rule__RTD__Group__2__Impl : ( ( rule__RTD__Group_2__0 )? ) ;
    public final void rule__RTD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1551:1: ( ( ( rule__RTD__Group_2__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1552:1: ( ( rule__RTD__Group_2__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1552:1: ( ( rule__RTD__Group_2__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1553:1: ( rule__RTD__Group_2__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1554:1: ( rule__RTD__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==45) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1554:2: rule__RTD__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__RTD__Group_2__0_in_rule__RTD__Group__2__Impl3283);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1564:1: rule__RTD__Group__3 : rule__RTD__Group__3__Impl rule__RTD__Group__4 ;
    public final void rule__RTD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1568:1: ( rule__RTD__Group__3__Impl rule__RTD__Group__4 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1569:2: rule__RTD__Group__3__Impl rule__RTD__Group__4
            {
            pushFollow(FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__33314);
            rule__RTD__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__33317);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1576:1: rule__RTD__Group__3__Impl : ( ( rule__RTD__Group_3__0 )? ) ;
    public final void rule__RTD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1580:1: ( ( ( rule__RTD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1581:1: ( ( rule__RTD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1581:1: ( ( rule__RTD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1582:1: ( rule__RTD__Group_3__0 )?
            {
             before(grammarAccess.getRTDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1583:1: ( rule__RTD__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==8) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1583:2: rule__RTD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RTD__Group_3__0_in_rule__RTD__Group__3__Impl3344);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1593:1: rule__RTD__Group__4 : rule__RTD__Group__4__Impl ;
    public final void rule__RTD__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1597:1: ( rule__RTD__Group__4__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1598:2: rule__RTD__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__43375);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1604:1: rule__RTD__Group__4__Impl : ( ( rule__RTD__ItemsAssignment_4 )* ) ;
    public final void rule__RTD__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1608:1: ( ( ( rule__RTD__ItemsAssignment_4 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1609:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1609:1: ( ( rule__RTD__ItemsAssignment_4 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1610:1: ( rule__RTD__ItemsAssignment_4 )*
            {
             before(grammarAccess.getRTDAccess().getItemsAssignment_4()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1611:1: ( rule__RTD__ItemsAssignment_4 )*
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
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1611:2: rule__RTD__ItemsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__RTD__ItemsAssignment_4_in_rule__RTD__Group__4__Impl3402);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1631:1: rule__RTD__Group_2__0 : rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 ;
    public final void rule__RTD__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1635:1: ( rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1636:2: rule__RTD__Group_2__0__Impl rule__RTD__Group_2__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__0__Impl_in_rule__RTD__Group_2__03443);
            rule__RTD__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2__1_in_rule__RTD__Group_2__03446);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1643:1: rule__RTD__Group_2__0__Impl : ( 'from' ) ;
    public final void rule__RTD__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1647:1: ( ( 'from' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1648:1: ( 'from' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1648:1: ( 'from' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1649:1: 'from'
            {
             before(grammarAccess.getRTDAccess().getFromKeyword_2_0()); 
            match(input,45,FOLLOW_45_in_rule__RTD__Group_2__0__Impl3474); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1662:1: rule__RTD__Group_2__1 : rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 ;
    public final void rule__RTD__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1666:1: ( rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1667:2: rule__RTD__Group_2__1__Impl rule__RTD__Group_2__2
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__1__Impl_in_rule__RTD__Group_2__13505);
            rule__RTD__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2__2_in_rule__RTD__Group_2__13508);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1674:1: rule__RTD__Group_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_1 ) ) ;
    public final void rule__RTD__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1678:1: ( ( ( rule__RTD__BasesAssignment_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1679:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1679:1: ( ( rule__RTD__BasesAssignment_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1680:1: ( rule__RTD__BasesAssignment_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1681:1: ( rule__RTD__BasesAssignment_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1681:2: rule__RTD__BasesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__RTD__BasesAssignment_2_1_in_rule__RTD__Group_2__1__Impl3535);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1691:1: rule__RTD__Group_2__2 : rule__RTD__Group_2__2__Impl ;
    public final void rule__RTD__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1695:1: ( rule__RTD__Group_2__2__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1696:2: rule__RTD__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_2__2__Impl_in_rule__RTD__Group_2__23565);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1702:1: rule__RTD__Group_2__2__Impl : ( ( rule__RTD__Group_2_2__0 )* ) ;
    public final void rule__RTD__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1706:1: ( ( ( rule__RTD__Group_2_2__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1707:1: ( ( rule__RTD__Group_2_2__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1707:1: ( ( rule__RTD__Group_2_2__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1708:1: ( rule__RTD__Group_2_2__0 )*
            {
             before(grammarAccess.getRTDAccess().getGroup_2_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1709:1: ( rule__RTD__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1709:2: rule__RTD__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_rule__RTD__Group_2_2__0_in_rule__RTD__Group_2__2__Impl3592);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1725:1: rule__RTD__Group_2_2__0 : rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 ;
    public final void rule__RTD__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1729:1: ( rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1730:2: rule__RTD__Group_2_2__0__Impl rule__RTD__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_2_2__0__Impl_in_rule__RTD__Group_2_2__03629);
            rule__RTD__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_2_2__1_in_rule__RTD__Group_2_2__03632);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1737:1: rule__RTD__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__RTD__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1741:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1742:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1742:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1743:1: ','
            {
             before(grammarAccess.getRTDAccess().getCommaKeyword_2_2_0()); 
            match(input,46,FOLLOW_46_in_rule__RTD__Group_2_2__0__Impl3660); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1756:1: rule__RTD__Group_2_2__1 : rule__RTD__Group_2_2__1__Impl ;
    public final void rule__RTD__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1760:1: ( rule__RTD__Group_2_2__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1761:2: rule__RTD__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_2_2__1__Impl_in_rule__RTD__Group_2_2__13691);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1767:1: rule__RTD__Group_2_2__1__Impl : ( ( rule__RTD__BasesAssignment_2_2_1 ) ) ;
    public final void rule__RTD__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1771:1: ( ( ( rule__RTD__BasesAssignment_2_2_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1772:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1772:1: ( ( rule__RTD__BasesAssignment_2_2_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1773:1: ( rule__RTD__BasesAssignment_2_2_1 )
            {
             before(grammarAccess.getRTDAccess().getBasesAssignment_2_2_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1774:1: ( rule__RTD__BasesAssignment_2_2_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1774:2: rule__RTD__BasesAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__RTD__BasesAssignment_2_2_1_in_rule__RTD__Group_2_2__1__Impl3718);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1788:1: rule__RTD__Group_3__0 : rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 ;
    public final void rule__RTD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1792:1: ( rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1793:2: rule__RTD__Group_3__0__Impl rule__RTD__Group_3__1
            {
            pushFollow(FOLLOW_rule__RTD__Group_3__0__Impl_in_rule__RTD__Group_3__03752);
            rule__RTD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTD__Group_3__1_in_rule__RTD__Group_3__03755);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1800:1: rule__RTD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1804:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1805:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1805:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1806:1: '='
            {
             before(grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RTD__Group_3__0__Impl3783); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1819:1: rule__RTD__Group_3__1 : rule__RTD__Group_3__1__Impl ;
    public final void rule__RTD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1823:1: ( rule__RTD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1824:2: rule__RTD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RTD__Group_3__1__Impl_in_rule__RTD__Group_3__13814);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1830:1: rule__RTD__Group_3__1__Impl : ( ( rule__RTD__ValueAssignment_3_1 ) ) ;
    public final void rule__RTD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1834:1: ( ( ( rule__RTD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1835:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1835:1: ( ( rule__RTD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1836:1: ( rule__RTD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1837:1: ( rule__RTD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1837:2: rule__RTD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RTD__ValueAssignment_3_1_in_rule__RTD__Group_3__1__Impl3841);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1851:1: rule__RTDItem__Group__0 : rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 ;
    public final void rule__RTDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1855:1: ( rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1856:2: rule__RTDItem__Group__0__Impl rule__RTDItem__Group__1
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__0__Impl_in_rule__RTDItem__Group__03875);
            rule__RTDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__1_in_rule__RTDItem__Group__03878);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1863:1: rule__RTDItem__Group__0__Impl : ( ( rule__RTDItem__DomainAssignment_0 ) ) ;
    public final void rule__RTDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1867:1: ( ( ( rule__RTDItem__DomainAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1868:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1868:1: ( ( rule__RTDItem__DomainAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1869:1: ( rule__RTDItem__DomainAssignment_0 )
            {
             before(grammarAccess.getRTDItemAccess().getDomainAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1870:1: ( rule__RTDItem__DomainAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1870:2: rule__RTDItem__DomainAssignment_0
            {
            pushFollow(FOLLOW_rule__RTDItem__DomainAssignment_0_in_rule__RTDItem__Group__0__Impl3905);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1880:1: rule__RTDItem__Group__1 : rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 ;
    public final void rule__RTDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1884:1: ( rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1885:2: rule__RTDItem__Group__1__Impl rule__RTDItem__Group__2
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__1__Impl_in_rule__RTDItem__Group__13935);
            rule__RTDItem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__2_in_rule__RTDItem__Group__13938);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1892:1: rule__RTDItem__Group__1__Impl : ( '->' ) ;
    public final void rule__RTDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1896:1: ( ( '->' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1897:1: ( '->' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1897:1: ( '->' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1898:1: '->'
            {
             before(grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__RTDItem__Group__1__Impl3966); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1911:1: rule__RTDItem__Group__2 : rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 ;
    public final void rule__RTDItem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1915:1: ( rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1916:2: rule__RTDItem__Group__2__Impl rule__RTDItem__Group__3
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__2__Impl_in_rule__RTDItem__Group__23997);
            rule__RTDItem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group__3_in_rule__RTDItem__Group__24000);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1923:1: rule__RTDItem__Group__2__Impl : ( ( rule__RTDItem__CodomainAssignment_2 ) ) ;
    public final void rule__RTDItem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1927:1: ( ( ( rule__RTDItem__CodomainAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1928:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1928:1: ( ( rule__RTDItem__CodomainAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1929:1: ( rule__RTDItem__CodomainAssignment_2 )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1930:1: ( rule__RTDItem__CodomainAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1930:2: rule__RTDItem__CodomainAssignment_2
            {
            pushFollow(FOLLOW_rule__RTDItem__CodomainAssignment_2_in_rule__RTDItem__Group__2__Impl4027);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1940:1: rule__RTDItem__Group__3 : rule__RTDItem__Group__3__Impl ;
    public final void rule__RTDItem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1944:1: ( rule__RTDItem__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1945:2: rule__RTDItem__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RTDItem__Group__3__Impl_in_rule__RTDItem__Group__34057);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1951:1: rule__RTDItem__Group__3__Impl : ( ( rule__RTDItem__Group_3__0 )? ) ;
    public final void rule__RTDItem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1955:1: ( ( ( rule__RTDItem__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1956:1: ( ( rule__RTDItem__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1956:1: ( ( rule__RTDItem__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1957:1: ( rule__RTDItem__Group_3__0 )?
            {
             before(grammarAccess.getRTDItemAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1958:1: ( rule__RTDItem__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==8) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1958:2: rule__RTDItem__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RTDItem__Group_3__0_in_rule__RTDItem__Group__3__Impl4084);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1976:1: rule__RTDItem__Group_3__0 : rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 ;
    public final void rule__RTDItem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1980:1: ( rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1981:2: rule__RTDItem__Group_3__0__Impl rule__RTDItem__Group_3__1
            {
            pushFollow(FOLLOW_rule__RTDItem__Group_3__0__Impl_in_rule__RTDItem__Group_3__04123);
            rule__RTDItem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RTDItem__Group_3__1_in_rule__RTDItem__Group_3__04126);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1988:1: rule__RTDItem__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RTDItem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1992:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1993:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1993:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:1994:1: '='
            {
             before(grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RTDItem__Group_3__0__Impl4154); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2007:1: rule__RTDItem__Group_3__1 : rule__RTDItem__Group_3__1__Impl ;
    public final void rule__RTDItem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2011:1: ( rule__RTDItem__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2012:2: rule__RTDItem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RTDItem__Group_3__1__Impl_in_rule__RTDItem__Group_3__14185);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2018:1: rule__RTDItem__Group_3__1__Impl : ( ( rule__RTDItem__ValueAssignment_3_1 ) ) ;
    public final void rule__RTDItem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2022:1: ( ( ( rule__RTDItem__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2023:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2023:1: ( ( rule__RTDItem__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2024:1: ( rule__RTDItem__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRTDItemAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2025:1: ( rule__RTDItem__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2025:2: rule__RTDItem__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RTDItem__ValueAssignment_3_1_in_rule__RTDItem__Group_3__1__Impl4212);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2039:1: rule__ED__Group__0 : rule__ED__Group__0__Impl rule__ED__Group__1 ;
    public final void rule__ED__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2043:1: ( rule__ED__Group__0__Impl rule__ED__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2044:2: rule__ED__Group__0__Impl rule__ED__Group__1
            {
            pushFollow(FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__04246);
            rule__ED__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__1_in_rule__ED__Group__04249);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2051:1: rule__ED__Group__0__Impl : ( ( rule__ED__TypeAssignment_0 ) ) ;
    public final void rule__ED__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2055:1: ( ( ( rule__ED__TypeAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2056:1: ( ( rule__ED__TypeAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2056:1: ( ( rule__ED__TypeAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2057:1: ( rule__ED__TypeAssignment_0 )
            {
             before(grammarAccess.getEDAccess().getTypeAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2058:1: ( rule__ED__TypeAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2058:2: rule__ED__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__ED__TypeAssignment_0_in_rule__ED__Group__0__Impl4276);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2068:1: rule__ED__Group__1 : rule__ED__Group__1__Impl rule__ED__Group__2 ;
    public final void rule__ED__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2072:1: ( rule__ED__Group__1__Impl rule__ED__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2073:2: rule__ED__Group__1__Impl rule__ED__Group__2
            {
            pushFollow(FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__14306);
            rule__ED__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__2_in_rule__ED__Group__14309);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2080:1: rule__ED__Group__1__Impl : ( ':' ) ;
    public final void rule__ED__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2084:1: ( ( ':' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2085:1: ( ':' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2085:1: ( ':' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2086:1: ':'
            {
             before(grammarAccess.getEDAccess().getColonKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__ED__Group__1__Impl4337); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2099:1: rule__ED__Group__2 : rule__ED__Group__2__Impl rule__ED__Group__3 ;
    public final void rule__ED__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2103:1: ( rule__ED__Group__2__Impl rule__ED__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2104:2: rule__ED__Group__2__Impl rule__ED__Group__3
            {
            pushFollow(FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__24368);
            rule__ED__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group__3_in_rule__ED__Group__24371);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2111:1: rule__ED__Group__2__Impl : ( ( rule__ED__ItemsAssignment_2 ) ) ;
    public final void rule__ED__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2115:1: ( ( ( rule__ED__ItemsAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2116:1: ( ( rule__ED__ItemsAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2116:1: ( ( rule__ED__ItemsAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2117:1: ( rule__ED__ItemsAssignment_2 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2118:1: ( rule__ED__ItemsAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2118:2: rule__ED__ItemsAssignment_2
            {
            pushFollow(FOLLOW_rule__ED__ItemsAssignment_2_in_rule__ED__Group__2__Impl4398);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2128:1: rule__ED__Group__3 : rule__ED__Group__3__Impl ;
    public final void rule__ED__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2132:1: ( rule__ED__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2133:2: rule__ED__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group__3__Impl_in_rule__ED__Group__34428);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2139:1: rule__ED__Group__3__Impl : ( ( rule__ED__Group_3__0 )* ) ;
    public final void rule__ED__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2143:1: ( ( ( rule__ED__Group_3__0 )* ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2144:1: ( ( rule__ED__Group_3__0 )* )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2144:1: ( ( rule__ED__Group_3__0 )* )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2145:1: ( rule__ED__Group_3__0 )*
            {
             before(grammarAccess.getEDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2146:1: ( rule__ED__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2146:2: rule__ED__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__ED__Group_3__0_in_rule__ED__Group__3__Impl4455);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2164:1: rule__ED__Group_3__0 : rule__ED__Group_3__0__Impl rule__ED__Group_3__1 ;
    public final void rule__ED__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2168:1: ( rule__ED__Group_3__0__Impl rule__ED__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2169:2: rule__ED__Group_3__0__Impl rule__ED__Group_3__1
            {
            pushFollow(FOLLOW_rule__ED__Group_3__0__Impl_in_rule__ED__Group_3__04494);
            rule__ED__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ED__Group_3__1_in_rule__ED__Group_3__04497);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2176:1: rule__ED__Group_3__0__Impl : ( ',' ) ;
    public final void rule__ED__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2180:1: ( ( ',' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2181:1: ( ',' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2181:1: ( ',' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2182:1: ','
            {
             before(grammarAccess.getEDAccess().getCommaKeyword_3_0()); 
            match(input,46,FOLLOW_46_in_rule__ED__Group_3__0__Impl4525); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2195:1: rule__ED__Group_3__1 : rule__ED__Group_3__1__Impl ;
    public final void rule__ED__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2199:1: ( rule__ED__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2200:2: rule__ED__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__ED__Group_3__1__Impl_in_rule__ED__Group_3__14556);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2206:1: rule__ED__Group_3__1__Impl : ( ( rule__ED__ItemsAssignment_3_1 ) ) ;
    public final void rule__ED__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2210:1: ( ( ( rule__ED__ItemsAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2211:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2211:1: ( ( rule__ED__ItemsAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2212:1: ( rule__ED__ItemsAssignment_3_1 )
            {
             before(grammarAccess.getEDAccess().getItemsAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2213:1: ( rule__ED__ItemsAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2213:2: rule__ED__ItemsAssignment_3_1
            {
            pushFollow(FOLLOW_rule__ED__ItemsAssignment_3_1_in_rule__ED__Group_3__1__Impl4583);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2227:1: rule__EDItem__Group__0 : rule__EDItem__Group__0__Impl rule__EDItem__Group__1 ;
    public final void rule__EDItem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2231:1: ( rule__EDItem__Group__0__Impl rule__EDItem__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2232:2: rule__EDItem__Group__0__Impl rule__EDItem__Group__1
            {
            pushFollow(FOLLOW_rule__EDItem__Group__0__Impl_in_rule__EDItem__Group__04617);
            rule__EDItem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDItem__Group__1_in_rule__EDItem__Group__04620);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2239:1: rule__EDItem__Group__0__Impl : ( ( rule__EDItem__NameAssignment_0 ) ) ;
    public final void rule__EDItem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2243:1: ( ( ( rule__EDItem__NameAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2244:1: ( ( rule__EDItem__NameAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2244:1: ( ( rule__EDItem__NameAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2245:1: ( rule__EDItem__NameAssignment_0 )
            {
             before(grammarAccess.getEDItemAccess().getNameAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2246:1: ( rule__EDItem__NameAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2246:2: rule__EDItem__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__EDItem__NameAssignment_0_in_rule__EDItem__Group__0__Impl4647);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2256:1: rule__EDItem__Group__1 : rule__EDItem__Group__1__Impl ;
    public final void rule__EDItem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2260:1: ( rule__EDItem__Group__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2261:2: rule__EDItem__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__EDItem__Group__1__Impl_in_rule__EDItem__Group__14677);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2267:1: rule__EDItem__Group__1__Impl : ( ( rule__EDItem__Group_1__0 )? ) ;
    public final void rule__EDItem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2271:1: ( ( ( rule__EDItem__Group_1__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2272:1: ( ( rule__EDItem__Group_1__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2272:1: ( ( rule__EDItem__Group_1__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2273:1: ( rule__EDItem__Group_1__0 )?
            {
             before(grammarAccess.getEDItemAccess().getGroup_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2274:1: ( rule__EDItem__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==8) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2274:2: rule__EDItem__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__EDItem__Group_1__0_in_rule__EDItem__Group__1__Impl4704);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2288:1: rule__EDItem__Group_1__0 : rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 ;
    public final void rule__EDItem__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2292:1: ( rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2293:2: rule__EDItem__Group_1__0__Impl rule__EDItem__Group_1__1
            {
            pushFollow(FOLLOW_rule__EDItem__Group_1__0__Impl_in_rule__EDItem__Group_1__04739);
            rule__EDItem__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__EDItem__Group_1__1_in_rule__EDItem__Group_1__04742);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2300:1: rule__EDItem__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EDItem__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2304:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2305:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2305:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2306:1: '='
            {
             before(grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0()); 
            match(input,8,FOLLOW_8_in_rule__EDItem__Group_1__0__Impl4770); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2319:1: rule__EDItem__Group_1__1 : rule__EDItem__Group_1__1__Impl ;
    public final void rule__EDItem__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2323:1: ( rule__EDItem__Group_1__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2324:2: rule__EDItem__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__EDItem__Group_1__1__Impl_in_rule__EDItem__Group_1__14801);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2330:1: rule__EDItem__Group_1__1__Impl : ( ( rule__EDItem__ValueAssignment_1_1 ) ) ;
    public final void rule__EDItem__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2334:1: ( ( ( rule__EDItem__ValueAssignment_1_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2335:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2335:1: ( ( rule__EDItem__ValueAssignment_1_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2336:1: ( rule__EDItem__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEDItemAccess().getValueAssignment_1_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2337:1: ( rule__EDItem__ValueAssignment_1_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2337:2: rule__EDItem__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__EDItem__ValueAssignment_1_1_in_rule__EDItem__Group_1__1__Impl4828);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2351:1: rule__RD__Group__0 : rule__RD__Group__0__Impl rule__RD__Group__1 ;
    public final void rule__RD__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2355:1: ( rule__RD__Group__0__Impl rule__RD__Group__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2356:2: rule__RD__Group__0__Impl rule__RD__Group__1
            {
            pushFollow(FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__04862);
            rule__RD__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__1_in_rule__RD__Group__04865);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2363:1: rule__RD__Group__0__Impl : ( ( rule__RD__LeftAssignment_0 ) ) ;
    public final void rule__RD__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2367:1: ( ( ( rule__RD__LeftAssignment_0 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2368:1: ( ( rule__RD__LeftAssignment_0 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2368:1: ( ( rule__RD__LeftAssignment_0 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2369:1: ( rule__RD__LeftAssignment_0 )
            {
             before(grammarAccess.getRDAccess().getLeftAssignment_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2370:1: ( rule__RD__LeftAssignment_0 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2370:2: rule__RD__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__RD__LeftAssignment_0_in_rule__RD__Group__0__Impl4892);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2380:1: rule__RD__Group__1 : rule__RD__Group__1__Impl rule__RD__Group__2 ;
    public final void rule__RD__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2384:1: ( rule__RD__Group__1__Impl rule__RD__Group__2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2385:2: rule__RD__Group__1__Impl rule__RD__Group__2
            {
            pushFollow(FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__14922);
            rule__RD__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__2_in_rule__RD__Group__14925);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2392:1: rule__RD__Group__1__Impl : ( ( rule__RD__RelationAssignment_1 ) ) ;
    public final void rule__RD__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2396:1: ( ( ( rule__RD__RelationAssignment_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2397:1: ( ( rule__RD__RelationAssignment_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2397:1: ( ( rule__RD__RelationAssignment_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2398:1: ( rule__RD__RelationAssignment_1 )
            {
             before(grammarAccess.getRDAccess().getRelationAssignment_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2399:1: ( rule__RD__RelationAssignment_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2399:2: rule__RD__RelationAssignment_1
            {
            pushFollow(FOLLOW_rule__RD__RelationAssignment_1_in_rule__RD__Group__1__Impl4952);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2409:1: rule__RD__Group__2 : rule__RD__Group__2__Impl rule__RD__Group__3 ;
    public final void rule__RD__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2413:1: ( rule__RD__Group__2__Impl rule__RD__Group__3 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2414:2: rule__RD__Group__2__Impl rule__RD__Group__3
            {
            pushFollow(FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__24982);
            rule__RD__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group__3_in_rule__RD__Group__24985);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2421:1: rule__RD__Group__2__Impl : ( ( rule__RD__RightAssignment_2 ) ) ;
    public final void rule__RD__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2425:1: ( ( ( rule__RD__RightAssignment_2 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2426:1: ( ( rule__RD__RightAssignment_2 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2426:1: ( ( rule__RD__RightAssignment_2 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2427:1: ( rule__RD__RightAssignment_2 )
            {
             before(grammarAccess.getRDAccess().getRightAssignment_2()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2428:1: ( rule__RD__RightAssignment_2 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2428:2: rule__RD__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__RD__RightAssignment_2_in_rule__RD__Group__2__Impl5012);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2438:1: rule__RD__Group__3 : rule__RD__Group__3__Impl ;
    public final void rule__RD__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2442:1: ( rule__RD__Group__3__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2443:2: rule__RD__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group__3__Impl_in_rule__RD__Group__35042);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2449:1: rule__RD__Group__3__Impl : ( ( rule__RD__Group_3__0 )? ) ;
    public final void rule__RD__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2453:1: ( ( ( rule__RD__Group_3__0 )? ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2454:1: ( ( rule__RD__Group_3__0 )? )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2454:1: ( ( rule__RD__Group_3__0 )? )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2455:1: ( rule__RD__Group_3__0 )?
            {
             before(grammarAccess.getRDAccess().getGroup_3()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2456:1: ( rule__RD__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==8) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2456:2: rule__RD__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RD__Group_3__0_in_rule__RD__Group__3__Impl5069);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2474:1: rule__RD__Group_3__0 : rule__RD__Group_3__0__Impl rule__RD__Group_3__1 ;
    public final void rule__RD__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2478:1: ( rule__RD__Group_3__0__Impl rule__RD__Group_3__1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2479:2: rule__RD__Group_3__0__Impl rule__RD__Group_3__1
            {
            pushFollow(FOLLOW_rule__RD__Group_3__0__Impl_in_rule__RD__Group_3__05108);
            rule__RD__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RD__Group_3__1_in_rule__RD__Group_3__05111);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2486:1: rule__RD__Group_3__0__Impl : ( '=' ) ;
    public final void rule__RD__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2490:1: ( ( '=' ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2491:1: ( '=' )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2491:1: ( '=' )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2492:1: '='
            {
             before(grammarAccess.getRDAccess().getEqualsSignKeyword_3_0()); 
            match(input,8,FOLLOW_8_in_rule__RD__Group_3__0__Impl5139); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2505:1: rule__RD__Group_3__1 : rule__RD__Group_3__1__Impl ;
    public final void rule__RD__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2509:1: ( rule__RD__Group_3__1__Impl )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2510:2: rule__RD__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RD__Group_3__1__Impl_in_rule__RD__Group_3__15170);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2516:1: rule__RD__Group_3__1__Impl : ( ( rule__RD__ValueAssignment_3_1 ) ) ;
    public final void rule__RD__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2520:1: ( ( ( rule__RD__ValueAssignment_3_1 ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2521:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2521:1: ( ( rule__RD__ValueAssignment_3_1 ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2522:1: ( rule__RD__ValueAssignment_3_1 )
            {
             before(grammarAccess.getRDAccess().getValueAssignment_3_1()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2523:1: ( rule__RD__ValueAssignment_3_1 )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2523:2: rule__RD__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_rule__RD__ValueAssignment_3_1_in_rule__RD__Group_3__1__Impl5197);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2538:1: rule__TechnologyCatalog__NameAssignment_1 : ( ruleTCID ) ;
    public final void rule__TechnologyCatalog__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2542:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2543:1: ( ruleTCID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2543:1: ( ruleTCID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2544:1: ruleTCID
            {
             before(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTCID_in_rule__TechnologyCatalog__NameAssignment_15236);
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


    // $ANTLR start "rule__TechnologyCatalog__ImportsAssignment_2_0"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2553:1: rule__TechnologyCatalog__ImportsAssignment_2_0 : ( ruleImport ) ;
    public final void rule__TechnologyCatalog__ImportsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2557:1: ( ( ruleImport ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2558:1: ( ruleImport )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2558:1: ( ruleImport )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2559:1: ruleImport
            {
             before(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__TechnologyCatalog__ImportsAssignment_2_05267);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__ImportsAssignment_2_0"


    // $ANTLR start "rule__TechnologyCatalog__EntityTypesAssignment_2_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2568:1: rule__TechnologyCatalog__EntityTypesAssignment_2_1 : ( ruleETD ) ;
    public final void rule__TechnologyCatalog__EntityTypesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2572:1: ( ( ruleETD ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2573:1: ( ruleETD )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2573:1: ( ruleETD )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2574:1: ruleETD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleETD_in_rule__TechnologyCatalog__EntityTypesAssignment_2_15298);
            ruleETD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__EntityTypesAssignment_2_1"


    // $ANTLR start "rule__TechnologyCatalog__RelationTypesAssignment_2_2"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2583:1: rule__TechnologyCatalog__RelationTypesAssignment_2_2 : ( ruleRTD ) ;
    public final void rule__TechnologyCatalog__RelationTypesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2587:1: ( ( ruleRTD ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2588:1: ( ruleRTD )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2588:1: ( ruleRTD )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2589:1: ruleRTD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleRTD_in_rule__TechnologyCatalog__RelationTypesAssignment_2_25329);
            ruleRTD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__RelationTypesAssignment_2_2"


    // $ANTLR start "rule__TechnologyCatalog__EntitiesAssignment_2_3"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2598:1: rule__TechnologyCatalog__EntitiesAssignment_2_3 : ( ruleED ) ;
    public final void rule__TechnologyCatalog__EntitiesAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2602:1: ( ( ruleED ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2603:1: ( ruleED )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2603:1: ( ruleED )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2604:1: ruleED
            {
             before(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleED_in_rule__TechnologyCatalog__EntitiesAssignment_2_35360);
            ruleED();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__EntitiesAssignment_2_3"


    // $ANTLR start "rule__TechnologyCatalog__RelationsAssignment_2_4"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2613:1: rule__TechnologyCatalog__RelationsAssignment_2_4 : ( ruleRD ) ;
    public final void rule__TechnologyCatalog__RelationsAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2617:1: ( ( ruleRD ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2618:1: ( ruleRD )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2618:1: ( ruleRD )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2619:1: ruleRD
            {
             before(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0()); 
            pushFollow(FOLLOW_ruleRD_in_rule__TechnologyCatalog__RelationsAssignment_2_45391);
            ruleRD();

            state._fsp--;

             after(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__TechnologyCatalog__RelationsAssignment_2_4"


    // $ANTLR start "rule__Import__RefAssignment_1"
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2628:1: rule__Import__RefAssignment_1 : ( ( ruleTCID ) ) ;
    public final void rule__Import__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2632:1: ( ( ( ruleTCID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2633:1: ( ( ruleTCID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2633:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2634:1: ( ruleTCID )
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2635:1: ( ruleTCID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2636:1: ruleTCID
            {
             before(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleTCID_in_rule__Import__RefAssignment_15426);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2647:1: rule__ETD__NameAssignment_1 : ( ruleETID ) ;
    public final void rule__ETD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2651:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2652:1: ( ruleETID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2652:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2653:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__NameAssignment_15461);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2662:1: rule__ETD__BasesAssignment_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2666:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2667:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2667:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2668:1: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2669:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2670:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_15496);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2681:1: rule__ETD__BasesAssignment_2_2_1 : ( ( ruleETID ) ) ;
    public final void rule__ETD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2685:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2686:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2686:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2687:1: ( ruleETID )
            {
             before(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2688:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2689:1: ruleETID
            {
             before(grammarAccess.getETDAccess().getBasesETDETIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_2_15535);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2700:1: rule__ETD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ETD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2704:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2705:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2705:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2706:1: RULE_STRING
            {
             before(grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ETD__ValueAssignment_3_15570); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2715:1: rule__RTD__NameAssignment_1 : ( ruleRTID ) ;
    public final void rule__RTD__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2719:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2720:1: ( ruleRTID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2720:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2721:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__NameAssignment_15601);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2730:1: rule__RTD__BasesAssignment_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2734:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2735:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2735:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2736:1: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2737:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2738:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_15636);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2749:1: rule__RTD__BasesAssignment_2_2_1 : ( ( ruleRTID ) ) ;
    public final void rule__RTD__BasesAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2753:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2754:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2754:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2755:1: ( ruleRTID )
            {
             before(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2756:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2757:1: ruleRTID
            {
             before(grammarAccess.getRTDAccess().getBasesRTDRTIDParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_2_15675);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2768:1: rule__RTD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2772:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2773:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2773:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2774:1: RULE_STRING
            {
             before(grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTD__ValueAssignment_3_15710); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2783:1: rule__RTD__ItemsAssignment_4 : ( ruleRTDItem ) ;
    public final void rule__RTD__ItemsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2787:1: ( ( ruleRTDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2788:1: ( ruleRTDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2788:1: ( ruleRTDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2789:1: ruleRTDItem
            {
             before(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleRTDItem_in_rule__RTD__ItemsAssignment_45741);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2798:1: rule__RTDItem__DomainAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__DomainAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2802:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2803:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2803:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2804:1: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2805:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2806:1: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getDomainETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__RTDItem__DomainAssignment_05776);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2817:1: rule__RTDItem__CodomainAssignment_2 : ( ( ruleETID ) ) ;
    public final void rule__RTDItem__CodomainAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2821:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2822:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2822:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2823:1: ( ruleETID )
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2824:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2825:1: ruleETID
            {
             before(grammarAccess.getRTDItemAccess().getCodomainETDETIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__RTDItem__CodomainAssignment_25815);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2836:1: rule__RTDItem__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RTDItem__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2840:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2841:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2841:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2842:1: RULE_STRING
            {
             before(grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RTDItem__ValueAssignment_3_15850); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2851:1: rule__ED__TypeAssignment_0 : ( ( ruleETID ) ) ;
    public final void rule__ED__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2855:1: ( ( ( ruleETID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2856:1: ( ( ruleETID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2856:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2857:1: ( ruleETID )
            {
             before(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2858:1: ( ruleETID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2859:1: ruleETID
            {
             before(grammarAccess.getEDAccess().getTypeETDETIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleETID_in_rule__ED__TypeAssignment_05885);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2870:1: rule__ED__ItemsAssignment_2 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2874:1: ( ( ruleEDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2875:1: ( ruleEDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2875:1: ( ruleEDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2876:1: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_25920);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2885:1: rule__ED__ItemsAssignment_3_1 : ( ruleEDItem ) ;
    public final void rule__ED__ItemsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2889:1: ( ( ruleEDItem ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2890:1: ( ruleEDItem )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2890:1: ( ruleEDItem )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2891:1: ruleEDItem
            {
             before(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_3_15951);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2900:1: rule__EDItem__NameAssignment_0 : ( ruleEID ) ;
    public final void rule__EDItem__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2904:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2905:1: ( ruleEID )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2905:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2906:1: ruleEID
            {
             before(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEID_in_rule__EDItem__NameAssignment_05982);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2915:1: rule__EDItem__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__EDItem__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2919:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2920:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2920:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2921:1: RULE_STRING
            {
             before(grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EDItem__ValueAssignment_1_16013); 
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2930:1: rule__RD__LeftAssignment_0 : ( ( ruleEID ) ) ;
    public final void rule__RD__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2934:1: ( ( ( ruleEID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2935:1: ( ( ruleEID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2935:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2936:1: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2937:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2938:1: ruleEID
            {
             before(grammarAccess.getRDAccess().getLeftEDItemEIDParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_ruleEID_in_rule__RD__LeftAssignment_06048);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2949:1: rule__RD__RelationAssignment_1 : ( ( ruleRTID ) ) ;
    public final void rule__RD__RelationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2953:1: ( ( ( ruleRTID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2954:1: ( ( ruleRTID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2954:1: ( ( ruleRTID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2955:1: ( ruleRTID )
            {
             before(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2956:1: ( ruleRTID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2957:1: ruleRTID
            {
             before(grammarAccess.getRDAccess().getRelationRTDRTIDParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleRTID_in_rule__RD__RelationAssignment_16087);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2968:1: rule__RD__RightAssignment_2 : ( ( ruleEID ) ) ;
    public final void rule__RD__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2972:1: ( ( ( ruleEID ) ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2973:1: ( ( ruleEID ) )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2973:1: ( ( ruleEID ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2974:1: ( ruleEID )
            {
             before(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2975:1: ( ruleEID )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2976:1: ruleEID
            {
             before(grammarAccess.getRDAccess().getRightEDItemEIDParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleEID_in_rule__RD__RightAssignment_26126);
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
    // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2987:1: rule__RD__ValueAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__RD__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2991:1: ( ( RULE_STRING ) )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2992:1: ( RULE_STRING )
            {
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2992:1: ( RULE_STRING )
            // ../eu.metatools.technocat.ui/src-gen/eu/metatools/technocat/ui/contentassist/antlr/internal/InternalTechnoCat.g:2993:1: RULE_STRING
            {
             before(grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__RD__ValueAssignment_3_16161); 
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
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelElement__Alternatives_in_ruleModelElement216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionElement250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefinitionElement__Alternatives_in_ruleDefinitionElement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceElement310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InstanceElement__Alternatives_in_ruleInstanceElement336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0_in_ruleETD396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0_in_ruleRTD456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTDItem_in_entryRuleRTDItem483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTDItem490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__0_in_ruleRTDItem516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0_in_ruleED576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_entryRuleEDItem603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDItem610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__0_in_ruleEDItem636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0_in_ruleRD696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_entryRuleTCID723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCID730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTCID756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_entryRuleRTID782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTID789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTID__Alternatives_in_ruleRTID815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_entryRuleETID842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETID849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETID__Alternatives_in_ruleETID875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_entryRuleEID902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEID909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EID__Alternatives_in_ruleEID935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_entryRuleRSYM962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSYM969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RSYM__Alternatives_in_ruleRSYM995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__ImportsAssignment_2_0_in_rule__TechnologyCatalog__Alternatives_21031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__EntityTypesAssignment_2_1_in_rule__TechnologyCatalog__Alternatives_21049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__RelationTypesAssignment_2_2_in_rule__TechnologyCatalog__Alternatives_21067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__EntitiesAssignment_2_3_in_rule__TechnologyCatalog__Alternatives_21085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__RelationsAssignment_2_4_in_rule__TechnologyCatalog__Alternatives_21103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_rule__ModelElement__Alternatives1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_rule__ModelElement__Alternatives1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__DefinitionElement__Alternatives1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__DefinitionElement__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__InstanceElement__Alternatives1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__InstanceElement__Alternatives1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RTID__Alternatives1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTID__Alternatives1301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_rule__RTID__Alternatives1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ETID__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ETID__Alternatives1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EID__Alternatives1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EID__Alternatives1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RSYM__Alternatives1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__RSYM__Alternatives1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__RSYM__Alternatives1489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RSYM__Alternatives1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RSYM__Alternatives1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RSYM__Alternatives1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RSYM__Alternatives1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RSYM__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RSYM__Alternatives1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RSYM__Alternatives1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RSYM__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RSYM__Alternatives1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RSYM__Alternatives1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RSYM__Alternatives1709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RSYM__Alternatives1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RSYM__Alternatives1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RSYM__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RSYM__Alternatives1789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RSYM__Alternatives1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RSYM__Alternatives1829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RSYM__Alternatives1849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RSYM__Alternatives1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RSYM__Alternatives1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RSYM__Alternatives1909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RSYM__Alternatives1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RSYM__Alternatives1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RSYM__Alternatives1969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RSYM__Alternatives1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RSYM__Alternatives2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RSYM__Alternatives2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RSYM__Alternatives2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RSYM__Alternatives2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RSYM__Alternatives2089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RSYM__Alternatives2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__0__Impl_in_rule__TechnologyCatalog__Group__02141 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__1_in_rule__TechnologyCatalog__Group__02144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__TechnologyCatalog__Group__0__Impl2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__1__Impl_in_rule__TechnologyCatalog__Group__12203 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__2_in_rule__TechnologyCatalog__Group__12206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__NameAssignment_1_in_rule__TechnologyCatalog__Group__1__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Group__2__Impl_in_rule__TechnologyCatalog__Group__22263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TechnologyCatalog__Alternatives_2_in_rule__TechnologyCatalog__Group__2__Impl2290 = new BitSet(new long[]{0x0000980000000032L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02327 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Import__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__RefAssignment_1_in_rule__Import__Group__1__Impl2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__0__Impl_in_rule__ETD__Group__02450 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group__1_in_rule__ETD__Group__02453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__ETD__Group__0__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__1__Impl_in_rule__ETD__Group__12512 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_rule__ETD__Group__2_in_rule__ETD__Group__12515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__NameAssignment_1_in_rule__ETD__Group__1__Impl2542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__2__Impl_in_rule__ETD__Group__22572 = new BitSet(new long[]{0x0000200000000100L});
    public static final BitSet FOLLOW_rule__ETD__Group__3_in_rule__ETD__Group__22575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0_in_rule__ETD__Group__2__Impl2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group__3__Impl_in_rule__ETD__Group__32633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__0_in_rule__ETD__Group__3__Impl2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__0__Impl_in_rule__ETD__Group_2__02699 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1_in_rule__ETD__Group_2__02702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__ETD__Group_2__0__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__1__Impl_in_rule__ETD__Group_2__12761 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__2_in_rule__ETD__Group_2__12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__BasesAssignment_2_1_in_rule__ETD__Group_2__1__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2__2__Impl_in_rule__ETD__Group_2__22821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__0_in_rule__ETD__Group_2__2__Impl2848 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__0__Impl_in_rule__ETD__Group_2_2__02885 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__1_in_rule__ETD__Group_2_2__02888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ETD__Group_2_2__0__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_2_2__1__Impl_in_rule__ETD__Group_2_2__12947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__BasesAssignment_2_2_1_in_rule__ETD__Group_2_2__1__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__0__Impl_in_rule__ETD__Group_3__03008 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__1_in_rule__ETD__Group_3__03011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__ETD__Group_3__0__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__Group_3__1__Impl_in_rule__ETD__Group_3__13070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ETD__ValueAssignment_3_1_in_rule__ETD__Group_3__1__Impl3097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__0__Impl_in_rule__RTD__Group__03131 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group__1_in_rule__RTD__Group__03134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__RTD__Group__0__Impl3162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__1__Impl_in_rule__RTD__Group__13193 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__2_in_rule__RTD__Group__13196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__NameAssignment_1_in_rule__RTD__Group__1__Impl3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__2__Impl_in_rule__RTD__Group__23253 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__3_in_rule__RTD__Group__23256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__0_in_rule__RTD__Group__2__Impl3283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__3__Impl_in_rule__RTD__Group__33314 = new BitSet(new long[]{0x0000200000000130L});
    public static final BitSet FOLLOW_rule__RTD__Group__4_in_rule__RTD__Group__33317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__0_in_rule__RTD__Group__3__Impl3344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group__4__Impl_in_rule__RTD__Group__43375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__ItemsAssignment_4_in_rule__RTD__Group__4__Impl3402 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__0__Impl_in_rule__RTD__Group_2__03443 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__1_in_rule__RTD__Group_2__03446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__RTD__Group_2__0__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__1__Impl_in_rule__RTD__Group_2__13505 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__2_in_rule__RTD__Group_2__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__BasesAssignment_2_1_in_rule__RTD__Group_2__1__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2__2__Impl_in_rule__RTD__Group_2__23565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__0_in_rule__RTD__Group_2__2__Impl3592 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__0__Impl_in_rule__RTD__Group_2_2__03629 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__1_in_rule__RTD__Group_2_2__03632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__RTD__Group_2_2__0__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_2_2__1__Impl_in_rule__RTD__Group_2_2__13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__BasesAssignment_2_2_1_in_rule__RTD__Group_2_2__1__Impl3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__0__Impl_in_rule__RTD__Group_3__03752 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__1_in_rule__RTD__Group_3__03755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RTD__Group_3__0__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__Group_3__1__Impl_in_rule__RTD__Group_3__13814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTD__ValueAssignment_3_1_in_rule__RTD__Group_3__1__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__0__Impl_in_rule__RTDItem__Group__03875 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__1_in_rule__RTDItem__Group__03878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__DomainAssignment_0_in_rule__RTDItem__Group__0__Impl3905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__1__Impl_in_rule__RTDItem__Group__13935 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__2_in_rule__RTDItem__Group__13938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__RTDItem__Group__1__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__2__Impl_in_rule__RTDItem__Group__23997 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__3_in_rule__RTDItem__Group__24000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__CodomainAssignment_2_in_rule__RTDItem__Group__2__Impl4027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group__3__Impl_in_rule__RTDItem__Group__34057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__0_in_rule__RTDItem__Group__3__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__0__Impl_in_rule__RTDItem__Group_3__04123 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__1_in_rule__RTDItem__Group_3__04126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RTDItem__Group_3__0__Impl4154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__Group_3__1__Impl_in_rule__RTDItem__Group_3__14185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RTDItem__ValueAssignment_3_1_in_rule__RTDItem__Group_3__1__Impl4212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__0__Impl_in_rule__ED__Group__04246 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__ED__Group__1_in_rule__ED__Group__04249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__TypeAssignment_0_in_rule__ED__Group__0__Impl4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__1__Impl_in_rule__ED__Group__14306 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__ED__Group__2_in_rule__ED__Group__14309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__ED__Group__1__Impl4337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__2__Impl_in_rule__ED__Group__24368 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__ED__Group__3_in_rule__ED__Group__24371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__ItemsAssignment_2_in_rule__ED__Group__2__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group__3__Impl_in_rule__ED__Group__34428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__0_in_rule__ED__Group__3__Impl4455 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__0__Impl_in_rule__ED__Group_3__04494 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__ED__Group_3__1_in_rule__ED__Group_3__04497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ED__Group_3__0__Impl4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__Group_3__1__Impl_in_rule__ED__Group_3__14556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ED__ItemsAssignment_3_1_in_rule__ED__Group_3__1__Impl4583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__0__Impl_in_rule__EDItem__Group__04617 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__EDItem__Group__1_in_rule__EDItem__Group__04620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__NameAssignment_0_in_rule__EDItem__Group__0__Impl4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group__1__Impl_in_rule__EDItem__Group__14677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__0_in_rule__EDItem__Group__1__Impl4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__0__Impl_in_rule__EDItem__Group_1__04739 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__1_in_rule__EDItem__Group_1__04742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__EDItem__Group_1__0__Impl4770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__Group_1__1__Impl_in_rule__EDItem__Group_1__14801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EDItem__ValueAssignment_1_1_in_rule__EDItem__Group_1__1__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__0__Impl_in_rule__RD__Group__04862 = new BitSet(new long[]{0x000003FFFFFFFF30L});
    public static final BitSet FOLLOW_rule__RD__Group__1_in_rule__RD__Group__04865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__LeftAssignment_0_in_rule__RD__Group__0__Impl4892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__1__Impl_in_rule__RD__Group__14922 = new BitSet(new long[]{0x0000980000000030L});
    public static final BitSet FOLLOW_rule__RD__Group__2_in_rule__RD__Group__14925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RelationAssignment_1_in_rule__RD__Group__1__Impl4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__2__Impl_in_rule__RD__Group__24982 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__RD__Group__3_in_rule__RD__Group__24985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__RightAssignment_2_in_rule__RD__Group__2__Impl5012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group__3__Impl_in_rule__RD__Group__35042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__0_in_rule__RD__Group__3__Impl5069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__0__Impl_in_rule__RD__Group_3__05108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RD__Group_3__1_in_rule__RD__Group_3__05111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__RD__Group_3__0__Impl5139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__Group_3__1__Impl_in_rule__RD__Group_3__15170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RD__ValueAssignment_3_1_in_rule__RD__Group_3__1__Impl5197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_rule__TechnologyCatalog__NameAssignment_15236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__TechnologyCatalog__ImportsAssignment_2_05267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_rule__TechnologyCatalog__EntityTypesAssignment_2_15298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_rule__TechnologyCatalog__RelationTypesAssignment_2_25329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_rule__TechnologyCatalog__EntitiesAssignment_2_35360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_rule__TechnologyCatalog__RelationsAssignment_2_45391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_rule__Import__RefAssignment_15426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__NameAssignment_15461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_15496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ETD__BasesAssignment_2_2_15535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ETD__ValueAssignment_3_15570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__NameAssignment_15601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_15636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RTD__BasesAssignment_2_2_15675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTD__ValueAssignment_3_15710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTDItem_in_rule__RTD__ItemsAssignment_45741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__RTDItem__DomainAssignment_05776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__RTDItem__CodomainAssignment_25815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RTDItem__ValueAssignment_3_15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_rule__ED__TypeAssignment_05885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_25920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEDItem_in_rule__ED__ItemsAssignment_3_15951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__EDItem__NameAssignment_05982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EDItem__ValueAssignment_1_16013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__RD__LeftAssignment_06048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_rule__RD__RelationAssignment_16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_rule__RD__RightAssignment_26126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__RD__ValueAssignment_3_16161 = new BitSet(new long[]{0x0000000000000002L});

}