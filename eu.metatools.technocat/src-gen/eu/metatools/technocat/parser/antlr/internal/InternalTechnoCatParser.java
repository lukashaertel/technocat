package eu.metatools.technocat.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.metatools.technocat.services.TechnoCatGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTechnoCatParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_SL_COMMENT", "RULE_WS", "'model'", "'import'", "'type'", "'from'", "','", "'='", "'relation'", "'->'", "':'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'!'", "'&&'", "'||'", "'~'", "'&'", "'|'", "'^'", "'<<'", "'>>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'&='", "'|='", "'^='", "'<<='", "'>>='", "'?'"
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
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g"; }



     	private TechnoCatGrammarAccess grammarAccess;
     	
        public InternalTechnoCatParser(TokenStream input, TechnoCatGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "TechnologyCatalog";	
       	}
       	
       	@Override
       	protected TechnoCatGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleTechnologyCatalog"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:67:1: entryRuleTechnologyCatalog returns [EObject current=null] : iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF ;
    public final EObject entryRuleTechnologyCatalog() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTechnologyCatalog = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:68:2: (iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:69:2: iv_ruleTechnologyCatalog= ruleTechnologyCatalog EOF
            {
             newCompositeNode(grammarAccess.getTechnologyCatalogRule()); 
            pushFollow(FOLLOW_ruleTechnologyCatalog_in_entryRuleTechnologyCatalog75);
            iv_ruleTechnologyCatalog=ruleTechnologyCatalog();

            state._fsp--;

             current =iv_ruleTechnologyCatalog; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTechnologyCatalog85); 

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
    // $ANTLR end "entryRuleTechnologyCatalog"


    // $ANTLR start "ruleTechnologyCatalog"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:76:1: ruleTechnologyCatalog returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* ) ;
    public final EObject ruleTechnologyCatalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_entityTypes_3_0 = null;

        EObject lv_relationTypes_4_0 = null;

        EObject lv_entities_5_0 = null;

        EObject lv_relations_6_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )*
            {
            otherlv_0=(Token)match(input,8,FOLLOW_8_in_ruleTechnologyCatalog122); 

                	newLeafNode(otherlv_0, grammarAccess.getTechnologyCatalogAccess().getModelKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:84:1: ( (lv_name_1_0= ruleTCID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:85:1: (lv_name_1_0= ruleTCID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:85:1: (lv_name_1_0= ruleTCID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:86:3: lv_name_1_0= ruleTCID
            {
             
            	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getNameTCIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTCID_in_ruleTechnologyCatalog143);
            lv_name_1_0=ruleTCID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"TCID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:102:2: ( ( (lv_imports_2_0= ruleImport ) ) | ( (lv_entityTypes_3_0= ruleETD ) ) | ( (lv_relationTypes_4_0= ruleRTD ) ) | ( (lv_entities_5_0= ruleED ) ) | ( (lv_relations_6_0= ruleRD ) ) )*
            loop1:
            do {
                int alt1=6;
                switch ( input.LA(1) ) {
                case 9:
                    {
                    alt1=1;
                    }
                    break;
                case 10:
                    {
                    alt1=2;
                    }
                    break;
                case 14:
                    {
                    alt1=3;
                    }
                    break;
                case RULE_ID:
                    {
                    int LA1_5 = input.LA(2);

                    if ( ((LA1_5>=RULE_STRING && LA1_5<=RULE_ID)||LA1_5==13||(LA1_5>=17 && LA1_5<=49)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_5==16) ) {
                        alt1=4;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA1_6 = input.LA(2);

                    if ( ((LA1_6>=RULE_STRING && LA1_6<=RULE_ID)||LA1_6==13||(LA1_6>=17 && LA1_6<=49)) ) {
                        alt1=5;
                    }
                    else if ( (LA1_6==16) ) {
                        alt1=4;
                    }


                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:102:3: ( (lv_imports_2_0= ruleImport ) )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:102:3: ( (lv_imports_2_0= ruleImport ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:103:1: (lv_imports_2_0= ruleImport )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:103:1: (lv_imports_2_0= ruleImport )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:104:3: lv_imports_2_0= ruleImport
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getImportsImportParserRuleCall_2_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImport_in_ruleTechnologyCatalog165);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"imports",
            	            		lv_imports_2_0, 
            	            		"Import");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:121:6: ( (lv_entityTypes_3_0= ruleETD ) )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:121:6: ( (lv_entityTypes_3_0= ruleETD ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:122:1: (lv_entityTypes_3_0= ruleETD )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:122:1: (lv_entityTypes_3_0= ruleETD )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:123:3: lv_entityTypes_3_0= ruleETD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getEntityTypesETDParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleETD_in_ruleTechnologyCatalog192);
            	    lv_entityTypes_3_0=ruleETD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entityTypes",
            	            		lv_entityTypes_3_0, 
            	            		"ETD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:140:6: ( (lv_relationTypes_4_0= ruleRTD ) )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:140:6: ( (lv_relationTypes_4_0= ruleRTD ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:141:1: (lv_relationTypes_4_0= ruleRTD )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:141:1: (lv_relationTypes_4_0= ruleRTD )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:142:3: lv_relationTypes_4_0= ruleRTD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getRelationTypesRTDParserRuleCall_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTD_in_ruleTechnologyCatalog219);
            	    lv_relationTypes_4_0=ruleRTD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relationTypes",
            	            		lv_relationTypes_4_0, 
            	            		"RTD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:159:6: ( (lv_entities_5_0= ruleED ) )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:159:6: ( (lv_entities_5_0= ruleED ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:160:1: (lv_entities_5_0= ruleED )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:160:1: (lv_entities_5_0= ruleED )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:161:3: lv_entities_5_0= ruleED
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getEntitiesEDParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleED_in_ruleTechnologyCatalog246);
            	    lv_entities_5_0=ruleED();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"entities",
            	            		lv_entities_5_0, 
            	            		"ED");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:178:6: ( (lv_relations_6_0= ruleRD ) )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:178:6: ( (lv_relations_6_0= ruleRD ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:179:1: (lv_relations_6_0= ruleRD )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:179:1: (lv_relations_6_0= ruleRD )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:180:3: lv_relations_6_0= ruleRD
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getRelationsRDParserRuleCall_2_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRD_in_ruleTechnologyCatalog273);
            	    lv_relations_6_0=ruleRD();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relations",
            	            		lv_relations_6_0, 
            	            		"RD");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTechnologyCatalog"


    // $ANTLR start "entryRuleImport"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:206:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:207:2: (iv_ruleImport= ruleImport EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:208:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport313);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport323); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:215:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleTCID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:218:28: ( (otherlv_0= 'import' ( ( ruleTCID ) ) ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:219:1: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:219:1: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:219:3: otherlv_0= 'import' ( ( ruleTCID ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleImport360); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:223:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:224:1: ( ruleTCID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:224:1: ( ruleTCID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:225:3: ruleTCID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTCID_in_ruleImport383);
            ruleTCID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleModelElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:246:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:247:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:248:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement419);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement429); 

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
    // $ANTLR end "entryRuleModelElement"


    // $ANTLR start "ruleModelElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:255:1: ruleModelElement returns [EObject current=null] : (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionElement_0 = null;

        EObject this_InstanceElement_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:258:28: ( (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:259:1: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:259:1: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==10||LA2_0==14) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:260:5: this_DefinitionElement_0= ruleDefinitionElement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinitionElement_in_ruleModelElement476);
                    this_DefinitionElement_0=ruleDefinitionElement();

                    state._fsp--;

                     
                            current = this_DefinitionElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:270:5: this_InstanceElement_1= ruleInstanceElement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInstanceElement_in_ruleModelElement503);
                    this_InstanceElement_1=ruleInstanceElement();

                    state._fsp--;

                     
                            current = this_InstanceElement_1; 
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
    // $ANTLR end "ruleModelElement"


    // $ANTLR start "entryRuleDefinitionElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:286:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:287:2: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:288:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
            {
             newCompositeNode(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement538);
            iv_ruleDefinitionElement=ruleDefinitionElement();

            state._fsp--;

             current =iv_ruleDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionElement548); 

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
    // $ANTLR end "entryRuleDefinitionElement"


    // $ANTLR start "ruleDefinitionElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:295:1: ruleDefinitionElement returns [EObject current=null] : (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_ETD_0 = null;

        EObject this_RTD_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:298:28: ( (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:299:1: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:299:1: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:300:5: this_ETD_0= ruleETD
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETD_in_ruleDefinitionElement595);
                    this_ETD_0=ruleETD();

                    state._fsp--;

                     
                            current = this_ETD_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:310:5: this_RTD_1= ruleRTD
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRTD_in_ruleDefinitionElement622);
                    this_RTD_1=ruleRTD();

                    state._fsp--;

                     
                            current = this_RTD_1; 
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
    // $ANTLR end "ruleDefinitionElement"


    // $ANTLR start "entryRuleInstanceElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:326:1: entryRuleInstanceElement returns [EObject current=null] : iv_ruleInstanceElement= ruleInstanceElement EOF ;
    public final EObject entryRuleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:327:2: (iv_ruleInstanceElement= ruleInstanceElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:328:2: iv_ruleInstanceElement= ruleInstanceElement EOF
            {
             newCompositeNode(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement657);
            iv_ruleInstanceElement=ruleInstanceElement();

            state._fsp--;

             current =iv_ruleInstanceElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceElement667); 

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
    // $ANTLR end "entryRuleInstanceElement"


    // $ANTLR start "ruleInstanceElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:335:1: ruleInstanceElement returns [EObject current=null] : (this_ED_0= ruleED | this_RD_1= ruleRD ) ;
    public final EObject ruleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ED_0 = null;

        EObject this_RD_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:338:28: ( (this_ED_0= ruleED | this_RD_1= ruleRD ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:339:1: (this_ED_0= ruleED | this_RD_1= ruleRD )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:339:1: (this_ED_0= ruleED | this_RD_1= ruleRD )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( ((LA4_1>=RULE_STRING && LA4_1<=RULE_ID)||LA4_1==13||(LA4_1>=17 && LA4_1<=49)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==16) ) {
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

                if ( (LA4_2==16) ) {
                    alt4=1;
                }
                else if ( ((LA4_2>=RULE_STRING && LA4_2<=RULE_ID)||LA4_2==13||(LA4_2>=17 && LA4_2<=49)) ) {
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
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:340:5: this_ED_0= ruleED
                    {
                     
                            newCompositeNode(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleED_in_ruleInstanceElement714);
                    this_ED_0=ruleED();

                    state._fsp--;

                     
                            current = this_ED_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:350:5: this_RD_1= ruleRD
                    {
                     
                            newCompositeNode(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRD_in_ruleInstanceElement741);
                    this_RD_1=ruleRD();

                    state._fsp--;

                     
                            current = this_RD_1; 
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
    // $ANTLR end "ruleInstanceElement"


    // $ANTLR start "entryRuleETD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:366:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:367:2: (iv_ruleETD= ruleETD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:368:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD776);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD786); 

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
    // $ANTLR end "entryRuleETD"


    // $ANTLR start "ruleETD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:375:1: ruleETD returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleETD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:378:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:379:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:379:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:379:3: otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleETD823); 

                	newLeafNode(otherlv_0, grammarAccess.getETDAccess().getTypeKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:383:1: ( (lv_name_1_0= ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:384:1: (lv_name_1_0= ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:384:1: (lv_name_1_0= ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:385:3: lv_name_1_0= ruleETID
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleETD844);
            lv_name_1_0=ruleETID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getETDRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ETID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:401:2: (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:401:4: otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleETD857); 

                        	newLeafNode(otherlv_2, grammarAccess.getETDAccess().getFromKeyword_2_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:405:1: ( ( ruleETID ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:406:1: ( ruleETID )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:406:1: ( ruleETID )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:407:3: ruleETID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getETDRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETID_in_ruleETD880);
                    ruleETID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:420:2: (otherlv_4= ',' ( ( ruleETID ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==12) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:420:4: otherlv_4= ',' ( ( ruleETID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleETD893); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getETDAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:424:1: ( ( ruleETID ) )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:425:1: ( ruleETID )
                    	    {
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:425:1: ( ruleETID )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:426:3: ruleETID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getETDRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETID_in_ruleETD916);
                    	    ruleETID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:439:6: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:439:8: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleETD933); 

                        	newLeafNode(otherlv_6, grammarAccess.getETDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:443:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:444:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:444:1: (lv_value_7_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:445:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleETD950); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getETDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getETDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleETD"


    // $ANTLR start "entryRuleRTD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:469:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:470:2: (iv_ruleRTD= ruleRTD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:471:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD993);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD1003); 

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
    // $ANTLR end "entryRuleRTD"


    // $ANTLR start "ruleRTD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:478:1: ruleRTD returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) ;
    public final EObject ruleRTD() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token lv_value_7_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_items_8_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:481:28: ( (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:482:1: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:482:1: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:482:3: otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRTD1040); 

                	newLeafNode(otherlv_0, grammarAccess.getRTDAccess().getRelationKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:486:1: ( (lv_name_1_0= ruleRTID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:487:1: (lv_name_1_0= ruleRTID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:487:1: (lv_name_1_0= ruleRTID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:488:3: lv_name_1_0= ruleRTID
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRTID_in_ruleRTD1061);
            lv_name_1_0=ruleRTID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"RTID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:504:2: (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:504:4: otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleRTD1074); 

                        	newLeafNode(otherlv_2, grammarAccess.getRTDAccess().getFromKeyword_2_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:508:1: ( ( ruleRTID ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:509:1: ( ruleRTID )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:509:1: ( ruleRTID )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:510:3: ruleRTID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRTDRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRTID_in_ruleRTD1097);
                    ruleRTID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:523:2: (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==12) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:523:4: otherlv_4= ',' ( ( ruleRTID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRTD1110); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRTDAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:527:1: ( ( ruleRTID ) )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:528:1: ( ruleRTID )
                    	    {
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:528:1: ( ruleRTID )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:529:3: ruleRTID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRTDRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRTID_in_ruleRTD1133);
                    	    ruleRTID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:542:6: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==13) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:542:8: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRTD1150); 

                        	newLeafNode(otherlv_6, grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:546:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:547:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:547:1: (lv_value_7_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:548:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTD1167); 

                    			newLeafNode(lv_value_7_0, grammarAccess.getRTDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRTDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:564:4: ( (lv_items_8_0= ruleRTDItem ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==15) ) {
                        alt11=1;
                    }


                }
                else if ( (LA11_0==RULE_STRING) ) {
                    int LA11_3 = input.LA(2);

                    if ( (LA11_3==15) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:1: (lv_items_8_0= ruleRTDItem )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:1: (lv_items_8_0= ruleRTDItem )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:566:3: lv_items_8_0= ruleRTDItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTDItem_in_ruleRTD1195);
            	    lv_items_8_0=ruleRTDItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRTDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_8_0, 
            	            		"RTDItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


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
    // $ANTLR end "ruleRTD"


    // $ANTLR start "entryRuleRTDItem"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:590:1: entryRuleRTDItem returns [EObject current=null] : iv_ruleRTDItem= ruleRTDItem EOF ;
    public final EObject entryRuleRTDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTDItem = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:591:2: (iv_ruleRTDItem= ruleRTDItem EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:592:2: iv_ruleRTDItem= ruleRTDItem EOF
            {
             newCompositeNode(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_ruleRTDItem_in_entryRuleRTDItem1232);
            iv_ruleRTDItem=ruleRTDItem();

            state._fsp--;

             current =iv_ruleRTDItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTDItem1242); 

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
    // $ANTLR end "entryRuleRTDItem"


    // $ANTLR start "ruleRTDItem"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:599:1: ruleRTDItem returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRTDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:602:28: ( ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:603:1: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:603:1: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:603:2: ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:603:2: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:604:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:604:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:605:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDItemRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleRTDItem1290);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRTDItem1302); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:622:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:623:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:623:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:624:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDItemRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleRTDItem1325);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:637:2: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:637:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRTDItem1338); 

                        	newLeafNode(otherlv_3, grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:641:1: ( (lv_value_4_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:1: (lv_value_4_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:643:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTDItem1355); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getRTDItemAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRTDItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleRTDItem"


    // $ANTLR start "entryRuleED"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:667:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:668:2: (iv_ruleED= ruleED EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:669:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED1398);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1408); 

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
    // $ANTLR end "entryRuleED"


    // $ANTLR start "ruleED"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:676:1: ruleED returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:679:28: ( ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:680:1: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:680:1: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:680:2: ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:680:2: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:681:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:681:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:682:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleED1456);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleED1468); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:699:1: ( (lv_items_2_0= ruleEDItem ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:700:1: (lv_items_2_0= ruleEDItem )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:700:1: (lv_items_2_0= ruleEDItem )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:701:3: lv_items_2_0= ruleEDItem
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEDItem_in_ruleED1489);
            lv_items_2_0=ruleEDItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDRule());
            	        }
                   		add(
                   			current, 
                   			"items",
                    		lv_items_2_0, 
                    		"EDItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:717:2: (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==12) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:717:4: otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleED1502); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEDAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:721:1: ( (lv_items_4_0= ruleEDItem ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:1: (lv_items_4_0= ruleEDItem )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:1: (lv_items_4_0= ruleEDItem )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:723:3: lv_items_4_0= ruleEDItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEDItem_in_ruleED1523);
            	    lv_items_4_0=ruleEDItem();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEDRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"items",
            	            		lv_items_4_0, 
            	            		"EDItem");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleED"


    // $ANTLR start "entryRuleEDItem"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:747:1: entryRuleEDItem returns [EObject current=null] : iv_ruleEDItem= ruleEDItem EOF ;
    public final EObject entryRuleEDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDItem = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:748:2: (iv_ruleEDItem= ruleEDItem EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:749:2: iv_ruleEDItem= ruleEDItem EOF
            {
             newCompositeNode(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_ruleEDItem_in_entryRuleEDItem1561);
            iv_ruleEDItem=ruleEDItem();

            state._fsp--;

             current =iv_ruleEDItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDItem1571); 

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
    // $ANTLR end "entryRuleEDItem"


    // $ANTLR start "ruleEDItem"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:756:1: ruleEDItem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:759:28: ( ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:760:1: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:760:1: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:760:2: ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:760:2: ( (lv_name_0_0= ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:761:1: (lv_name_0_0= ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:761:1: (lv_name_0_0= ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:762:3: lv_name_0_0= ruleEID
            {
             
            	        newCompositeNode(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleEDItem1617);
            lv_name_0_0=ruleEID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getEDItemRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:778:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:778:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEDItem1630); 

                        	newLeafNode(otherlv_1, grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:782:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:1: (lv_value_2_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:784:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEDItem1647); 

                    			newLeafNode(lv_value_2_0, grammarAccess.getEDItemAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEDItemRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleEDItem"


    // $ANTLR start "entryRuleRD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:808:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:809:2: (iv_ruleRD= ruleRD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:810:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1690);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1700); 

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
    // $ANTLR end "entryRuleRD"


    // $ANTLR start "ruleRD"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:817:1: ruleRD returns [EObject current=null] : ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:820:28: ( ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:821:1: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:821:1: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:821:2: ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:821:2: ( ( ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:822:1: ( ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:822:1: ( ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:823:3: ruleEID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleRD1748);
            ruleEID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:836:2: ( ( ruleRTID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:837:1: ( ruleRTID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:837:1: ( ruleRTID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:838:3: ruleRTID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRTID_in_ruleRD1771);
            ruleRTID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:851:2: ( ( ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:852:1: ( ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:852:1: ( ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:853:3: ruleEID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleRD1794);
            ruleEID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:866:2: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:866:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRD1807); 

                        	newLeafNode(otherlv_3, grammarAccess.getRDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:870:1: ( (lv_value_4_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:871:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:871:1: (lv_value_4_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:872:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRD1824); 

                    			newLeafNode(lv_value_4_0, grammarAccess.getRDAccess().getValueSTRINGTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRDRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"STRING");
                    	    

                    }


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
    // $ANTLR end "ruleRD"


    // $ANTLR start "entryRuleTCID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:896:1: entryRuleTCID returns [String current=null] : iv_ruleTCID= ruleTCID EOF ;
    public final String entryRuleTCID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTCID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:897:2: (iv_ruleTCID= ruleTCID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:898:2: iv_ruleTCID= ruleTCID EOF
            {
             newCompositeNode(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_ruleTCID_in_entryRuleTCID1868);
            iv_ruleTCID=ruleTCID();

            state._fsp--;

             current =iv_ruleTCID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCID1879); 

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
    // $ANTLR end "entryRuleTCID"


    // $ANTLR start "ruleTCID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:905:1: ruleTCID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTCID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:908:28: (this_ID_0= RULE_ID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:909:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTCID1918); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getTCIDAccess().getIDTerminalRuleCall()); 
                

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
    // $ANTLR end "ruleTCID"


    // $ANTLR start "entryRuleRTID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:924:1: entryRuleRTID returns [String current=null] : iv_ruleRTID= ruleRTID EOF ;
    public final String entryRuleRTID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRTID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:925:2: (iv_ruleRTID= ruleRTID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:926:2: iv_ruleRTID= ruleRTID EOF
            {
             newCompositeNode(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_ruleRTID_in_entryRuleRTID1963);
            iv_ruleRTID=ruleRTID();

            state._fsp--;

             current =iv_ruleRTID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTID1974); 

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
    // $ANTLR end "entryRuleRTID"


    // $ANTLR start "ruleRTID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:933:1: ruleRTID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) ;
    public final AntlrDatatypeRuleToken ruleRTID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_RSYM_2 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:936:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:937:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:937:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            int alt16=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt16=1;
                }
                break;
            case RULE_STRING:
                {
                alt16=2;
                }
                break;
            case 13:
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
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:937:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTID2014); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:945:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTID2040); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:954:5: this_RSYM_2= ruleRSYM
                    {
                     
                            newCompositeNode(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRSYM_in_ruleRTID2073);
                    this_RSYM_2=ruleRSYM();

                    state._fsp--;


                    		current.merge(this_RSYM_2);
                        
                     
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
    // $ANTLR end "ruleRTID"


    // $ANTLR start "entryRuleETID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:972:1: entryRuleETID returns [String current=null] : iv_ruleETID= ruleETID EOF ;
    public final String entryRuleETID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:973:2: (iv_ruleETID= ruleETID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:974:2: iv_ruleETID= ruleETID EOF
            {
             newCompositeNode(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_ruleETID_in_entryRuleETID2119);
            iv_ruleETID=ruleETID();

            state._fsp--;

             current =iv_ruleETID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETID2130); 

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
    // $ANTLR end "entryRuleETID"


    // $ANTLR start "ruleETID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:981:1: ruleETID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleETID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:984:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:985:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:985:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:985:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETID2170); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:993:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleETID2196); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getETIDAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleETID"


    // $ANTLR start "entryRuleEID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1008:1: entryRuleEID returns [String current=null] : iv_ruleEID= ruleEID EOF ;
    public final String entryRuleEID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1009:2: (iv_ruleEID= ruleEID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1010:2: iv_ruleEID= ruleEID EOF
            {
             newCompositeNode(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_ruleEID_in_entryRuleEID2242);
            iv_ruleEID=ruleEID();

            state._fsp--;

             current =iv_ruleEID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEID2253); 

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
    // $ANTLR end "entryRuleEID"


    // $ANTLR start "ruleEID"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1017:1: ruleEID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleEID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1020:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1021:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1021:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1021:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEID2293); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1029:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEID2319); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getEIDAccess().getSTRINGTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEID"


    // $ANTLR start "entryRuleRSYM"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1044:1: entryRuleRSYM returns [String current=null] : iv_ruleRSYM= ruleRSYM EOF ;
    public final String entryRuleRSYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSYM = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1045:2: (iv_ruleRSYM= ruleRSYM EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1046:2: iv_ruleRSYM= ruleRSYM EOF
            {
             newCompositeNode(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_ruleRSYM_in_entryRuleRSYM2365);
            iv_ruleRSYM=ruleRSYM();

            state._fsp--;

             current =iv_ruleRSYM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSYM2376); 

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
    // $ANTLR end "entryRuleRSYM"


    // $ANTLR start "ruleRSYM"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1053:1: ruleRSYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) ;
    public final AntlrDatatypeRuleToken ruleRSYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1056:28: ( (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1057:1: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1057:1: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            int alt19=34;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt19=1;
                }
                break;
            case 17:
                {
                alt19=2;
                }
                break;
            case 18:
                {
                alt19=3;
                }
                break;
            case 19:
                {
                alt19=4;
                }
                break;
            case 20:
                {
                alt19=5;
                }
                break;
            case 21:
                {
                alt19=6;
                }
                break;
            case 22:
                {
                alt19=7;
                }
                break;
            case 23:
                {
                alt19=8;
                }
                break;
            case 24:
                {
                alt19=9;
                }
                break;
            case 25:
                {
                alt19=10;
                }
                break;
            case 26:
                {
                alt19=11;
                }
                break;
            case 27:
                {
                alt19=12;
                }
                break;
            case 28:
                {
                alt19=13;
                }
                break;
            case 29:
                {
                alt19=14;
                }
                break;
            case 30:
                {
                alt19=15;
                }
                break;
            case 31:
                {
                alt19=16;
                }
                break;
            case 32:
                {
                alt19=17;
                }
                break;
            case 33:
                {
                alt19=18;
                }
                break;
            case 34:
                {
                alt19=19;
                }
                break;
            case 35:
                {
                alt19=20;
                }
                break;
            case 36:
                {
                alt19=21;
                }
                break;
            case 37:
                {
                alt19=22;
                }
                break;
            case 38:
                {
                alt19=23;
                }
                break;
            case 39:
                {
                alt19=24;
                }
                break;
            case 40:
                {
                alt19=25;
                }
                break;
            case 41:
                {
                alt19=26;
                }
                break;
            case 42:
                {
                alt19=27;
                }
                break;
            case 43:
                {
                alt19=28;
                }
                break;
            case 44:
                {
                alt19=29;
                }
                break;
            case 45:
                {
                alt19=30;
                }
                break;
            case 46:
                {
                alt19=31;
                }
                break;
            case 47:
                {
                alt19=32;
                }
                break;
            case 48:
                {
                alt19=33;
                }
                break;
            case 49:
                {
                alt19=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1058:2: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleRSYM2414); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1065:2: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleRSYM2433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1072:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleRSYM2452); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1079:2: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleRSYM2471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1086:2: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleRSYM2490); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1093:2: kw= '%'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleRSYM2509); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1100:2: kw= '++'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleRSYM2528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1107:2: kw= '--'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleRSYM2547); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1114:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleRSYM2566); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1121:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleRSYM2585); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1128:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleRSYM2604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1135:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRSYM2623); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1142:2: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleRSYM2642); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1149:2: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleRSYM2661); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1156:2: kw= '!'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleRSYM2680); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1163:2: kw= '&&'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleRSYM2699); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1170:2: kw= '||'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleRSYM2718); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1177:2: kw= '~'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleRSYM2737); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getTildeKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1184:2: kw= '&'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleRSYM2756); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1191:2: kw= '|'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleRSYM2775); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1198:2: kw= '^'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleRSYM2794); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1205:2: kw= '<<'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleRSYM2813); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1212:2: kw= '>>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleRSYM2832); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1219:2: kw= '+='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleRSYM2851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1226:2: kw= '-='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleRSYM2870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1233:2: kw= '*='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRSYM2889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1240:2: kw= '/='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleRSYM2908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1247:2: kw= '%='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleRSYM2927); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1254:2: kw= '&='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleRSYM2946); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1261:2: kw= '|='
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleRSYM2965); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1268:2: kw= '^='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleRSYM2984); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1275:2: kw= '<<='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleRSYM3003); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1282:2: kw= '>>='
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleRSYM3022); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1289:2: kw= '?'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleRSYM3041); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getQuestionMarkKeyword_33()); 
                        

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
    // $ANTLR end "ruleRSYM"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleTechnologyCatalog_in_entryRuleTechnologyCatalog75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTechnologyCatalog85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_ruleTechnologyCatalog122 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTCID_in_ruleTechnologyCatalog143 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleImport_in_ruleTechnologyCatalog165 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleETD_in_ruleTechnologyCatalog192 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleTechnologyCatalog219 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleED_in_ruleTechnologyCatalog246 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleRD_in_ruleTechnologyCatalog273 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport313 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleImport360 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTCID_in_ruleImport383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_ruleModelElement476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_ruleModelElement503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionElement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_ruleDefinitionElement595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleDefinitionElement622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceElement667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_ruleInstanceElement714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_ruleInstanceElement741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleETD823 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD844 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_11_in_ruleETD857 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD880 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleETD893 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD916 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleETD933 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleETD950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRTD1040 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1061 = new BitSet(new long[]{0x0000000000002832L});
    public static final BitSet FOLLOW_11_in_ruleRTD1074 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1097 = new BitSet(new long[]{0x0000000000003032L});
    public static final BitSet FOLLOW_12_in_ruleRTD1110 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1133 = new BitSet(new long[]{0x0000000000003032L});
    public static final BitSet FOLLOW_13_in_ruleRTD1150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTD1167 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRTDItem_in_ruleRTD1195 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRTDItem_in_entryRuleRTDItem1232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTDItem1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_ruleRTDItem1290 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRTDItem1302 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleRTDItem1325 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRTDItem1338 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTDItem1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_ruleED1456 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleED1468 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEDItem_in_ruleED1489 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleED1502 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEDItem_in_ruleED1523 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleEDItem_in_entryRuleEDItem1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDItem1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_ruleEDItem1617 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEDItem1630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEDItem1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_ruleRD1748 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRD1771 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEID_in_ruleRD1794 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRD1807 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRD1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_entryRuleTCID1868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCID1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTCID1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_entryRuleRTID1963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTID1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTID2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTID2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_ruleRTID2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_entryRuleETID2119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETID2130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETID2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleETID2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_entryRuleEID2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEID2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEID2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEID2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_entryRuleRSYM2365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSYM2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRSYM2414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRSYM2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRSYM2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRSYM2471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRSYM2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRSYM2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRSYM2528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRSYM2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRSYM2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRSYM2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRSYM2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRSYM2623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRSYM2642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRSYM2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRSYM2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRSYM2699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRSYM2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRSYM2737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRSYM2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRSYM2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRSYM2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRSYM2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRSYM2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRSYM2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRSYM2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRSYM2889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRSYM2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRSYM2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRSYM2946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRSYM2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRSYM2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRSYM3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRSYM3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRSYM3041 = new BitSet(new long[]{0x0000000000000002L});

}