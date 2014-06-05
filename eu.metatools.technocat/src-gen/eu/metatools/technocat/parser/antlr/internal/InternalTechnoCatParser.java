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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:76:1: ruleTechnologyCatalog returns [EObject current=null] : (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( (lv_modelElements_2_0= ruleElement ) )* ) ;
    public final EObject ruleTechnologyCatalog() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_modelElements_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:79:28: ( (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( (lv_modelElements_2_0= ruleElement ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( (lv_modelElements_2_0= ruleElement ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:1: (otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( (lv_modelElements_2_0= ruleElement ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:80:3: otherlv_0= 'model' ( (lv_name_1_0= ruleTCID ) ) ( (lv_modelElements_2_0= ruleElement ) )*
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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:102:2: ( (lv_modelElements_2_0= ruleElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)||(LA1_0>=9 && LA1_0<=10)||LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:103:1: (lv_modelElements_2_0= ruleElement )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:103:1: (lv_modelElements_2_0= ruleElement )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:104:3: lv_modelElements_2_0= ruleElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTechnologyCatalogAccess().getModelElementsElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElement_in_ruleTechnologyCatalog164);
            	    lv_modelElements_2_0=ruleElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTechnologyCatalogRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelElements",
            	            		lv_modelElements_2_0, 
            	            		"Element");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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


    // $ANTLR start "entryRuleElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:128:1: entryRuleElement returns [EObject current=null] : iv_ruleElement= ruleElement EOF ;
    public final EObject entryRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:129:2: (iv_ruleElement= ruleElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:130:2: iv_ruleElement= ruleElement EOF
            {
             newCompositeNode(grammarAccess.getElementRule()); 
            pushFollow(FOLLOW_ruleElement_in_entryRuleElement201);
            iv_ruleElement=ruleElement();

            state._fsp--;

             current =iv_ruleElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElement211); 

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
    // $ANTLR end "entryRuleElement"


    // $ANTLR start "ruleElement"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:137:1: ruleElement returns [EObject current=null] : (this_Import_0= ruleImport | this_ModelElement_1= ruleModelElement ) ;
    public final EObject ruleElement() throws RecognitionException {
        EObject current = null;

        EObject this_Import_0 = null;

        EObject this_ModelElement_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:140:28: ( (this_Import_0= ruleImport | this_ModelElement_1= ruleModelElement ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:141:1: (this_Import_0= ruleImport | this_ModelElement_1= ruleModelElement )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:141:1: (this_Import_0= ruleImport | this_ModelElement_1= ruleModelElement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==9) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_ID)||LA2_0==10||LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:142:5: this_Import_0= ruleImport
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getImportParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleImport_in_ruleElement258);
                    this_Import_0=ruleImport();

                    state._fsp--;

                     
                            current = this_Import_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:152:5: this_ModelElement_1= ruleModelElement
                    {
                     
                            newCompositeNode(grammarAccess.getElementAccess().getModelElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleModelElement_in_ruleElement285);
                    this_ModelElement_1=ruleModelElement();

                    state._fsp--;

                     
                            current = this_ModelElement_1; 
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
    // $ANTLR end "ruleElement"


    // $ANTLR start "entryRuleImport"
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:168:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:169:2: (iv_ruleImport= ruleImport EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:170:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport320);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport330); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:177:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( ( ruleTCID ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:180:28: ( (otherlv_0= 'import' ( ( ruleTCID ) ) ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:181:1: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:181:1: (otherlv_0= 'import' ( ( ruleTCID ) ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:181:3: otherlv_0= 'import' ( ( ruleTCID ) )
            {
            otherlv_0=(Token)match(input,9,FOLLOW_9_in_ruleImport367); 

                	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:185:1: ( ( ruleTCID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:186:1: ( ruleTCID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:186:1: ( ruleTCID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:187:3: ruleTCID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getImportRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getImportAccess().getRefTechnologyCatalogCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTCID_in_ruleImport390);
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:208:1: entryRuleModelElement returns [EObject current=null] : iv_ruleModelElement= ruleModelElement EOF ;
    public final EObject entryRuleModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:209:2: (iv_ruleModelElement= ruleModelElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:210:2: iv_ruleModelElement= ruleModelElement EOF
            {
             newCompositeNode(grammarAccess.getModelElementRule()); 
            pushFollow(FOLLOW_ruleModelElement_in_entryRuleModelElement426);
            iv_ruleModelElement=ruleModelElement();

            state._fsp--;

             current =iv_ruleModelElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelElement436); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:217:1: ruleModelElement returns [EObject current=null] : (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) ;
    public final EObject ruleModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionElement_0 = null;

        EObject this_InstanceElement_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:220:28: ( (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:221:1: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:221:1: (this_DefinitionElement_0= ruleDefinitionElement | this_InstanceElement_1= ruleInstanceElement )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==10||LA3_0==14) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_STRING && LA3_0<=RULE_ID)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:222:5: this_DefinitionElement_0= ruleDefinitionElement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getDefinitionElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDefinitionElement_in_ruleModelElement483);
                    this_DefinitionElement_0=ruleDefinitionElement();

                    state._fsp--;

                     
                            current = this_DefinitionElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:232:5: this_InstanceElement_1= ruleInstanceElement
                    {
                     
                            newCompositeNode(grammarAccess.getModelElementAccess().getInstanceElementParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInstanceElement_in_ruleModelElement510);
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:248:1: entryRuleDefinitionElement returns [EObject current=null] : iv_ruleDefinitionElement= ruleDefinitionElement EOF ;
    public final EObject entryRuleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:249:2: (iv_ruleDefinitionElement= ruleDefinitionElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:250:2: iv_ruleDefinitionElement= ruleDefinitionElement EOF
            {
             newCompositeNode(grammarAccess.getDefinitionElementRule()); 
            pushFollow(FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement545);
            iv_ruleDefinitionElement=ruleDefinitionElement();

            state._fsp--;

             current =iv_ruleDefinitionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinitionElement555); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:257:1: ruleDefinitionElement returns [EObject current=null] : (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) ;
    public final EObject ruleDefinitionElement() throws RecognitionException {
        EObject current = null;

        EObject this_ETD_0 = null;

        EObject this_RTD_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:260:28: ( (this_ETD_0= ruleETD | this_RTD_1= ruleRTD ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:261:1: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:261:1: (this_ETD_0= ruleETD | this_RTD_1= ruleRTD )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==10) ) {
                alt4=1;
            }
            else if ( (LA4_0==14) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:262:5: this_ETD_0= ruleETD
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionElementAccess().getETDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleETD_in_ruleDefinitionElement602);
                    this_ETD_0=ruleETD();

                    state._fsp--;

                     
                            current = this_ETD_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:272:5: this_RTD_1= ruleRTD
                    {
                     
                            newCompositeNode(grammarAccess.getDefinitionElementAccess().getRTDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRTD_in_ruleDefinitionElement629);
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:288:1: entryRuleInstanceElement returns [EObject current=null] : iv_ruleInstanceElement= ruleInstanceElement EOF ;
    public final EObject entryRuleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceElement = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:289:2: (iv_ruleInstanceElement= ruleInstanceElement EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:290:2: iv_ruleInstanceElement= ruleInstanceElement EOF
            {
             newCompositeNode(grammarAccess.getInstanceElementRule()); 
            pushFollow(FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement664);
            iv_ruleInstanceElement=ruleInstanceElement();

            state._fsp--;

             current =iv_ruleInstanceElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceElement674); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:297:1: ruleInstanceElement returns [EObject current=null] : (this_ED_0= ruleED | this_RD_1= ruleRD ) ;
    public final EObject ruleInstanceElement() throws RecognitionException {
        EObject current = null;

        EObject this_ED_0 = null;

        EObject this_RD_1 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:300:28: ( (this_ED_0= ruleED | this_RD_1= ruleRD ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:301:1: (this_ED_0= ruleED | this_RD_1= ruleRD )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:301:1: (this_ED_0= ruleED | this_RD_1= ruleRD )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=RULE_STRING && LA5_1<=RULE_ID)||LA5_1==13||(LA5_1>=17 && LA5_1<=49)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==16) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING) ) {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==16) ) {
                    alt5=1;
                }
                else if ( ((LA5_2>=RULE_STRING && LA5_2<=RULE_ID)||LA5_2==13||(LA5_2>=17 && LA5_2<=49)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:302:5: this_ED_0= ruleED
                    {
                     
                            newCompositeNode(grammarAccess.getInstanceElementAccess().getEDParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleED_in_ruleInstanceElement721);
                    this_ED_0=ruleED();

                    state._fsp--;

                     
                            current = this_ED_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:312:5: this_RD_1= ruleRD
                    {
                     
                            newCompositeNode(grammarAccess.getInstanceElementAccess().getRDParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRD_in_ruleInstanceElement748);
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:328:1: entryRuleETD returns [EObject current=null] : iv_ruleETD= ruleETD EOF ;
    public final EObject entryRuleETD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleETD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:329:2: (iv_ruleETD= ruleETD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:330:2: iv_ruleETD= ruleETD EOF
            {
             newCompositeNode(grammarAccess.getETDRule()); 
            pushFollow(FOLLOW_ruleETD_in_entryRuleETD783);
            iv_ruleETD=ruleETD();

            state._fsp--;

             current =iv_ruleETD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETD793); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:337:1: ruleETD returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) ;
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
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:340:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:341:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:341:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:341:3: otherlv_0= 'type' ( (lv_name_1_0= ruleETID ) ) (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,10,FOLLOW_10_in_ruleETD830); 

                	newLeafNode(otherlv_0, grammarAccess.getETDAccess().getTypeKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:345:1: ( (lv_name_1_0= ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:346:1: (lv_name_1_0= ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:346:1: (lv_name_1_0= ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:347:3: lv_name_1_0= ruleETID
            {
             
            	        newCompositeNode(grammarAccess.getETDAccess().getNameETIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleETD851);
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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:363:2: (otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==11) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:363:4: otherlv_2= 'from' ( ( ruleETID ) ) (otherlv_4= ',' ( ( ruleETID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleETD864); 

                        	newLeafNode(otherlv_2, grammarAccess.getETDAccess().getFromKeyword_2_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:367:1: ( ( ruleETID ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:368:1: ( ruleETID )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:368:1: ( ruleETID )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:369:3: ruleETID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getETDRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleETID_in_ruleETD887);
                    ruleETID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:382:2: (otherlv_4= ',' ( ( ruleETID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==12) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:382:4: otherlv_4= ',' ( ( ruleETID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleETD900); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getETDAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:386:1: ( ( ruleETID ) )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:387:1: ( ruleETID )
                    	    {
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:387:1: ( ruleETID )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:388:3: ruleETID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getETDRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getETDAccess().getBasesETDCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleETID_in_ruleETD923);
                    	    ruleETID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:401:6: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:401:8: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleETD940); 

                        	newLeafNode(otherlv_6, grammarAccess.getETDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:405:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:406:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:406:1: (lv_value_7_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:407:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleETD957); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:431:1: entryRuleRTD returns [EObject current=null] : iv_ruleRTD= ruleRTD EOF ;
    public final EObject entryRuleRTD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:432:2: (iv_ruleRTD= ruleRTD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:433:2: iv_ruleRTD= ruleRTD EOF
            {
             newCompositeNode(grammarAccess.getRTDRule()); 
            pushFollow(FOLLOW_ruleRTD_in_entryRuleRTD1000);
            iv_ruleRTD=ruleRTD();

            state._fsp--;

             current =iv_ruleRTD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTD1010); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:440:1: ruleRTD returns [EObject current=null] : (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) ;
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
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:443:28: ( (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:444:1: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:444:1: (otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:444:3: otherlv_0= 'relation' ( (lv_name_1_0= ruleRTID ) ) (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )? (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )? ( (lv_items_8_0= ruleRTDItem ) )*
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleRTD1047); 

                	newLeafNode(otherlv_0, grammarAccess.getRTDAccess().getRelationKeyword_0());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:448:1: ( (lv_name_1_0= ruleRTID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:449:1: (lv_name_1_0= ruleRTID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:449:1: (lv_name_1_0= ruleRTID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:450:3: lv_name_1_0= ruleRTID
            {
             
            	        newCompositeNode(grammarAccess.getRTDAccess().getNameRTIDParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRTID_in_ruleRTD1068);
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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:466:2: (otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==11) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:466:4: otherlv_2= 'from' ( ( ruleRTID ) ) (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    {
                    otherlv_2=(Token)match(input,11,FOLLOW_11_in_ruleRTD1081); 

                        	newLeafNode(otherlv_2, grammarAccess.getRTDAccess().getFromKeyword_2_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:470:1: ( ( ruleRTID ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:471:1: ( ruleRTID )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:471:1: ( ruleRTID )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:472:3: ruleRTID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRTDRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRTID_in_ruleRTD1104);
                    ruleRTID();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:485:2: (otherlv_4= ',' ( ( ruleRTID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==12) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:485:4: otherlv_4= ',' ( ( ruleRTID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,12,FOLLOW_12_in_ruleRTD1117); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRTDAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:489:1: ( ( ruleRTID ) )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:490:1: ( ruleRTID )
                    	    {
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:490:1: ( ruleRTID )
                    	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:491:3: ruleRTID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRTDRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRTDAccess().getBasesRTDCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRTID_in_ruleRTD1140);
                    	    ruleRTID();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:504:6: (otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:504:8: otherlv_6= '=' ( (lv_value_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRTD1157); 

                        	newLeafNode(otherlv_6, grammarAccess.getRTDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:508:1: ( (lv_value_7_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:509:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:509:1: (lv_value_7_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:510:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTD1174); 

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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:526:4: ( (lv_items_8_0= ruleRTDItem ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==15) ) {
                        alt12=1;
                    }


                }
                else if ( (LA12_0==RULE_STRING) ) {
                    int LA12_3 = input.LA(2);

                    if ( (LA12_3==15) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:527:1: (lv_items_8_0= ruleRTDItem )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:527:1: (lv_items_8_0= ruleRTDItem )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:528:3: lv_items_8_0= ruleRTDItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRTDAccess().getItemsRTDItemParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRTDItem_in_ruleRTD1202);
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
            	    break loop12;
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:552:1: entryRuleRTDItem returns [EObject current=null] : iv_ruleRTDItem= ruleRTDItem EOF ;
    public final EObject entryRuleRTDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRTDItem = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:553:2: (iv_ruleRTDItem= ruleRTDItem EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:554:2: iv_ruleRTDItem= ruleRTDItem EOF
            {
             newCompositeNode(grammarAccess.getRTDItemRule()); 
            pushFollow(FOLLOW_ruleRTDItem_in_entryRuleRTDItem1239);
            iv_ruleRTDItem=ruleRTDItem();

            state._fsp--;

             current =iv_ruleRTDItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTDItem1249); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:561:1: ruleRTDItem returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRTDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:564:28: ( ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:1: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:1: ( ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:2: ( ( ruleETID ) ) otherlv_1= '->' ( ( ruleETID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:565:2: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:566:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:566:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:567:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDItemRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRTDItemAccess().getDomainETDCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleRTDItem1297);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleRTDItem1309); 

                	newLeafNode(otherlv_1, grammarAccess.getRTDItemAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:584:1: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:585:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:585:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:586:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRTDItemRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRTDItemAccess().getCodomainETDCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleRTDItem1332);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:599:2: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:599:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRTDItem1345); 

                        	newLeafNode(otherlv_3, grammarAccess.getRTDItemAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:603:1: ( (lv_value_4_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:604:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:604:1: (lv_value_4_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:605:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTDItem1362); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:629:1: entryRuleED returns [EObject current=null] : iv_ruleED= ruleED EOF ;
    public final EObject entryRuleED() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleED = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:630:2: (iv_ruleED= ruleED EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:631:2: iv_ruleED= ruleED EOF
            {
             newCompositeNode(grammarAccess.getEDRule()); 
            pushFollow(FOLLOW_ruleED_in_entryRuleED1405);
            iv_ruleED=ruleED();

            state._fsp--;

             current =iv_ruleED; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleED1415); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:638:1: ruleED returns [EObject current=null] : ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) ;
    public final EObject ruleED() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_items_2_0 = null;

        EObject lv_items_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:641:28: ( ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:1: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:1: ( ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )* )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:2: ( ( ruleETID ) ) otherlv_1= ':' ( (lv_items_2_0= ruleEDItem ) ) (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:642:2: ( ( ruleETID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:643:1: ( ruleETID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:643:1: ( ruleETID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:644:3: ruleETID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEDAccess().getTypeETDCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleETID_in_ruleED1463);
            ruleETID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleED1475); 

                	newLeafNode(otherlv_1, grammarAccess.getEDAccess().getColonKeyword_1());
                
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:661:1: ( (lv_items_2_0= ruleEDItem ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:662:1: (lv_items_2_0= ruleEDItem )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:662:1: (lv_items_2_0= ruleEDItem )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:663:3: lv_items_2_0= ruleEDItem
            {
             
            	        newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEDItem_in_ruleED1496);
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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:679:2: (otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==12) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:679:4: otherlv_3= ',' ( (lv_items_4_0= ruleEDItem ) )
            	    {
            	    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleED1509); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEDAccess().getCommaKeyword_3_0());
            	        
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:683:1: ( (lv_items_4_0= ruleEDItem ) )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:684:1: (lv_items_4_0= ruleEDItem )
            	    {
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:684:1: (lv_items_4_0= ruleEDItem )
            	    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:685:3: lv_items_4_0= ruleEDItem
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEDAccess().getItemsEDItemParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEDItem_in_ruleED1530);
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
            	    break loop14;
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:709:1: entryRuleEDItem returns [EObject current=null] : iv_ruleEDItem= ruleEDItem EOF ;
    public final EObject entryRuleEDItem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDItem = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:710:2: (iv_ruleEDItem= ruleEDItem EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:711:2: iv_ruleEDItem= ruleEDItem EOF
            {
             newCompositeNode(grammarAccess.getEDItemRule()); 
            pushFollow(FOLLOW_ruleEDItem_in_entryRuleEDItem1568);
            iv_ruleEDItem=ruleEDItem();

            state._fsp--;

             current =iv_ruleEDItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEDItem1578); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:718:1: ruleEDItem returns [EObject current=null] : ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEDItem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:721:28: ( ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:1: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:1: ( ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:2: ( (lv_name_0_0= ruleEID ) ) (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:722:2: ( (lv_name_0_0= ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:723:1: (lv_name_0_0= ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:723:1: (lv_name_0_0= ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:724:3: lv_name_0_0= ruleEID
            {
             
            	        newCompositeNode(grammarAccess.getEDItemAccess().getNameEIDParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleEDItem1624);
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

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:740:2: (otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==13) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:740:4: otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleEDItem1637); 

                        	newLeafNode(otherlv_1, grammarAccess.getEDItemAccess().getEqualsSignKeyword_1_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:744:1: ( (lv_value_2_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:745:1: (lv_value_2_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:745:1: (lv_value_2_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:746:3: lv_value_2_0= RULE_STRING
                    {
                    lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEDItem1654); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:770:1: entryRuleRD returns [EObject current=null] : iv_ruleRD= ruleRD EOF ;
    public final EObject entryRuleRD() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRD = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:771:2: (iv_ruleRD= ruleRD EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:772:2: iv_ruleRD= ruleRD EOF
            {
             newCompositeNode(grammarAccess.getRDRule()); 
            pushFollow(FOLLOW_ruleRD_in_entryRuleRD1697);
            iv_ruleRD=ruleRD();

            state._fsp--;

             current =iv_ruleRD; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRD1707); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:779:1: ruleRD returns [EObject current=null] : ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleRD() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token lv_value_4_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:782:28: ( ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:1: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:1: ( ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )? )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:2: ( ( ruleEID ) ) ( ( ruleRTID ) ) ( ( ruleEID ) ) (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:783:2: ( ( ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:784:1: ( ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:784:1: ( ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:785:3: ruleEID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getLeftEDItemCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleRD1755);
            ruleEID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:798:2: ( ( ruleRTID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:799:1: ( ruleRTID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:799:1: ( ruleRTID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:800:3: ruleRTID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getRelationRTDCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleRTID_in_ruleRD1778);
            ruleRTID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:813:2: ( ( ruleEID ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:814:1: ( ruleEID )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:814:1: ( ruleEID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:815:3: ruleEID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRDRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRDAccess().getRightEDItemCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleEID_in_ruleRD1801);
            ruleEID();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:828:2: (otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==13) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:828:4: otherlv_3= '=' ( (lv_value_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRD1814); 

                        	newLeafNode(otherlv_3, grammarAccess.getRDAccess().getEqualsSignKeyword_3_0());
                        
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:832:1: ( (lv_value_4_0= RULE_STRING ) )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:833:1: (lv_value_4_0= RULE_STRING )
                    {
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:833:1: (lv_value_4_0= RULE_STRING )
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:834:3: lv_value_4_0= RULE_STRING
                    {
                    lv_value_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRD1831); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:858:1: entryRuleTCID returns [String current=null] : iv_ruleTCID= ruleTCID EOF ;
    public final String entryRuleTCID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTCID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:859:2: (iv_ruleTCID= ruleTCID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:860:2: iv_ruleTCID= ruleTCID EOF
            {
             newCompositeNode(grammarAccess.getTCIDRule()); 
            pushFollow(FOLLOW_ruleTCID_in_entryRuleTCID1875);
            iv_ruleTCID=ruleTCID();

            state._fsp--;

             current =iv_ruleTCID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTCID1886); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:867:1: ruleTCID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleTCID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:870:28: (this_ID_0= RULE_ID )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:871:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTCID1925); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:886:1: entryRuleRTID returns [String current=null] : iv_ruleRTID= ruleRTID EOF ;
    public final String entryRuleRTID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRTID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:887:2: (iv_ruleRTID= ruleRTID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:888:2: iv_ruleRTID= ruleRTID EOF
            {
             newCompositeNode(grammarAccess.getRTIDRule()); 
            pushFollow(FOLLOW_ruleRTID_in_entryRuleRTID1970);
            iv_ruleRTID=ruleRTID();

            state._fsp--;

             current =iv_ruleRTID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRTID1981); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:895:1: ruleRTID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) ;
    public final AntlrDatatypeRuleToken ruleRTID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;
        AntlrDatatypeRuleToken this_RSYM_2 = null;


         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:898:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:899:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:899:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING | this_RSYM_2= ruleRSYM )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case RULE_STRING:
                {
                alt17=2;
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
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:899:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRTID2021); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getRTIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:907:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRTID2047); 

                    		current.merge(this_STRING_1);
                        
                     
                        newLeafNode(this_STRING_1, grammarAccess.getRTIDAccess().getSTRINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:916:5: this_RSYM_2= ruleRSYM
                    {
                     
                            newCompositeNode(grammarAccess.getRTIDAccess().getRSYMParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRSYM_in_ruleRTID2080);
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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:934:1: entryRuleETID returns [String current=null] : iv_ruleETID= ruleETID EOF ;
    public final String entryRuleETID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleETID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:935:2: (iv_ruleETID= ruleETID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:936:2: iv_ruleETID= ruleETID EOF
            {
             newCompositeNode(grammarAccess.getETIDRule()); 
            pushFollow(FOLLOW_ruleETID_in_entryRuleETID2126);
            iv_ruleETID=ruleETID();

            state._fsp--;

             current =iv_ruleETID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleETID2137); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:943:1: ruleETID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleETID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:946:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:947:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:947:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
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
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:947:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleETID2177); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getETIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:955:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleETID2203); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:970:1: entryRuleEID returns [String current=null] : iv_ruleEID= ruleEID EOF ;
    public final String entryRuleEID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEID = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:971:2: (iv_ruleEID= ruleEID EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:972:2: iv_ruleEID= ruleEID EOF
            {
             newCompositeNode(grammarAccess.getEIDRule()); 
            pushFollow(FOLLOW_ruleEID_in_entryRuleEID2249);
            iv_ruleEID=ruleEID();

            state._fsp--;

             current =iv_ruleEID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEID2260); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:979:1: ruleEID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleEID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_STRING_1=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:982:28: ( (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:983:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:983:1: (this_ID_0= RULE_ID | this_STRING_1= RULE_STRING )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_STRING) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:983:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEID2300); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getEIDAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:991:10: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEID2326); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1006:1: entryRuleRSYM returns [String current=null] : iv_ruleRSYM= ruleRSYM EOF ;
    public final String entryRuleRSYM() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRSYM = null;


        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1007:2: (iv_ruleRSYM= ruleRSYM EOF )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1008:2: iv_ruleRSYM= ruleRSYM EOF
            {
             newCompositeNode(grammarAccess.getRSYMRule()); 
            pushFollow(FOLLOW_ruleRSYM_in_entryRuleRSYM2372);
            iv_ruleRSYM=ruleRSYM();

            state._fsp--;

             current =iv_ruleRSYM.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSYM2383); 

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
    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1015:1: ruleRSYM returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) ;
    public final AntlrDatatypeRuleToken ruleRSYM() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1018:28: ( (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' ) )
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1019:1: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            {
            // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1019:1: (kw= '=' | kw= '+' | kw= '-' | kw= '*' | kw= '/' | kw= '%' | kw= '++' | kw= '--' | kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' | kw= '!' | kw= '&&' | kw= '||' | kw= '~' | kw= '&' | kw= '|' | kw= '^' | kw= '<<' | kw= '>>' | kw= '+=' | kw= '-=' | kw= '*=' | kw= '/=' | kw= '%=' | kw= '&=' | kw= '|=' | kw= '^=' | kw= '<<=' | kw= '>>=' | kw= '?' )
            int alt20=34;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt20=1;
                }
                break;
            case 17:
                {
                alt20=2;
                }
                break;
            case 18:
                {
                alt20=3;
                }
                break;
            case 19:
                {
                alt20=4;
                }
                break;
            case 20:
                {
                alt20=5;
                }
                break;
            case 21:
                {
                alt20=6;
                }
                break;
            case 22:
                {
                alt20=7;
                }
                break;
            case 23:
                {
                alt20=8;
                }
                break;
            case 24:
                {
                alt20=9;
                }
                break;
            case 25:
                {
                alt20=10;
                }
                break;
            case 26:
                {
                alt20=11;
                }
                break;
            case 27:
                {
                alt20=12;
                }
                break;
            case 28:
                {
                alt20=13;
                }
                break;
            case 29:
                {
                alt20=14;
                }
                break;
            case 30:
                {
                alt20=15;
                }
                break;
            case 31:
                {
                alt20=16;
                }
                break;
            case 32:
                {
                alt20=17;
                }
                break;
            case 33:
                {
                alt20=18;
                }
                break;
            case 34:
                {
                alt20=19;
                }
                break;
            case 35:
                {
                alt20=20;
                }
                break;
            case 36:
                {
                alt20=21;
                }
                break;
            case 37:
                {
                alt20=22;
                }
                break;
            case 38:
                {
                alt20=23;
                }
                break;
            case 39:
                {
                alt20=24;
                }
                break;
            case 40:
                {
                alt20=25;
                }
                break;
            case 41:
                {
                alt20=26;
                }
                break;
            case 42:
                {
                alt20=27;
                }
                break;
            case 43:
                {
                alt20=28;
                }
                break;
            case 44:
                {
                alt20=29;
                }
                break;
            case 45:
                {
                alt20=30;
                }
                break;
            case 46:
                {
                alt20=31;
                }
                break;
            case 47:
                {
                alt20=32;
                }
                break;
            case 48:
                {
                alt20=33;
                }
                break;
            case 49:
                {
                alt20=34;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1020:2: kw= '='
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleRSYM2421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1027:2: kw= '+'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleRSYM2440); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1034:2: kw= '-'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleRSYM2459); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1041:2: kw= '*'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleRSYM2478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1048:2: kw= '/'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleRSYM2497); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1055:2: kw= '%'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleRSYM2516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1062:2: kw= '++'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleRSYM2535); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignPlusSignKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1069:2: kw= '--'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleRSYM2554); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusHyphenMinusKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1076:2: kw= '=='
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleRSYM2573); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getEqualsSignEqualsSignKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1083:2: kw= '!='
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleRSYM2592); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkEqualsSignKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1090:2: kw= '>'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleRSYM2611); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1097:2: kw= '<'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleRSYM2630); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1104:2: kw= '>='
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleRSYM2649); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignEqualsSignKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1111:2: kw= '<='
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleRSYM2668); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignEqualsSignKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1118:2: kw= '!'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleRSYM2687); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getExclamationMarkKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1125:2: kw= '&&'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleRSYM2706); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandAmpersandKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1132:2: kw= '||'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleRSYM2725); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineVerticalLineKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1139:2: kw= '~'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleRSYM2744); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getTildeKeyword_17()); 
                        

                    }
                    break;
                case 19 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1146:2: kw= '&'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleRSYM2763); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandKeyword_18()); 
                        

                    }
                    break;
                case 20 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1153:2: kw= '|'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleRSYM2782); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineKeyword_19()); 
                        

                    }
                    break;
                case 21 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1160:2: kw= '^'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleRSYM2801); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentKeyword_20()); 
                        

                    }
                    break;
                case 22 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1167:2: kw= '<<'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleRSYM2820); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignKeyword_21()); 
                        

                    }
                    break;
                case 23 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1174:2: kw= '>>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleRSYM2839); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignKeyword_22()); 
                        

                    }
                    break;
                case 24 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1181:2: kw= '+='
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleRSYM2858); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPlusSignEqualsSignKeyword_23()); 
                        

                    }
                    break;
                case 25 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1188:2: kw= '-='
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleRSYM2877); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getHyphenMinusEqualsSignKeyword_24()); 
                        

                    }
                    break;
                case 26 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1195:2: kw= '*='
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleRSYM2896); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAsteriskEqualsSignKeyword_25()); 
                        

                    }
                    break;
                case 27 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1202:2: kw= '/='
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleRSYM2915); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getSolidusEqualsSignKeyword_26()); 
                        

                    }
                    break;
                case 28 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1209:2: kw= '%='
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleRSYM2934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getPercentSignEqualsSignKeyword_27()); 
                        

                    }
                    break;
                case 29 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1216:2: kw= '&='
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleRSYM2953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getAmpersandEqualsSignKeyword_28()); 
                        

                    }
                    break;
                case 30 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1223:2: kw= '|='
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleRSYM2972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getVerticalLineEqualsSignKeyword_29()); 
                        

                    }
                    break;
                case 31 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1230:2: kw= '^='
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleRSYM2991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getCircumflexAccentEqualsSignKeyword_30()); 
                        

                    }
                    break;
                case 32 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1237:2: kw= '<<='
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleRSYM3010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getLessThanSignLessThanSignEqualsSignKeyword_31()); 
                        

                    }
                    break;
                case 33 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1244:2: kw= '>>='
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleRSYM3029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRSYMAccess().getGreaterThanSignGreaterThanSignEqualsSignKeyword_32()); 
                        

                    }
                    break;
                case 34 :
                    // ../eu.metatools.technocat/src-gen/eu/metatools/technocat/parser/antlr/internal/InternalTechnoCat.g:1251:2: kw= '?'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleRSYM3048); 

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
    public static final BitSet FOLLOW_ruleElement_in_ruleTechnologyCatalog164 = new BitSet(new long[]{0x0000000000004632L});
    public static final BitSet FOLLOW_ruleElement_in_entryRuleElement201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElement211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_ruleElement258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_ruleElement285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_ruleImport367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleTCID_in_ruleImport390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelElement_in_entryRuleModelElement426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelElement436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_ruleModelElement483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_ruleModelElement510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinitionElement_in_entryRuleDefinitionElement545 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinitionElement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_ruleDefinitionElement602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_ruleDefinitionElement629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceElement_in_entryRuleInstanceElement664 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceElement674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_ruleInstanceElement721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_ruleInstanceElement748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETD_in_entryRuleETD783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETD793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleETD830 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD851 = new BitSet(new long[]{0x0000000000002802L});
    public static final BitSet FOLLOW_11_in_ruleETD864 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD887 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_12_in_ruleETD900 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleETD923 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_13_in_ruleETD940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleETD957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTD_in_entryRuleRTD1000 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTD1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleRTD1047 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1068 = new BitSet(new long[]{0x0000000000002832L});
    public static final BitSet FOLLOW_11_in_ruleRTD1081 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1104 = new BitSet(new long[]{0x0000000000003032L});
    public static final BitSet FOLLOW_12_in_ruleRTD1117 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRTD1140 = new BitSet(new long[]{0x0000000000003032L});
    public static final BitSet FOLLOW_13_in_ruleRTD1157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTD1174 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRTDItem_in_ruleRTD1202 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRTDItem_in_entryRuleRTDItem1239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTDItem1249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_ruleRTDItem1297 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleRTDItem1309 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleETID_in_ruleRTDItem1332 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRTDItem1345 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTDItem1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleED_in_entryRuleED1405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleED1415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_ruleED1463 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleED1475 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEDItem_in_ruleED1496 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleED1509 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEDItem_in_ruleED1530 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleEDItem_in_entryRuleEDItem1568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEDItem1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_ruleEDItem1624 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleEDItem1637 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEDItem1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRD_in_entryRuleRD1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRD1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_ruleRD1755 = new BitSet(new long[]{0x0003FFFFFFFE2030L});
    public static final BitSet FOLLOW_ruleRTID_in_ruleRD1778 = new BitSet(new long[]{0x0000000000004630L});
    public static final BitSet FOLLOW_ruleEID_in_ruleRD1801 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleRD1814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRD1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTCID_in_entryRuleTCID1875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTCID1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTCID1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRTID_in_entryRuleRTID1970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRTID1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRTID2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRTID2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_ruleRTID2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleETID_in_entryRuleETID2126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleETID2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleETID2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleETID2203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEID_in_entryRuleEID2249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEID2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEID2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEID2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSYM_in_entryRuleRSYM2372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSYM2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleRSYM2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleRSYM2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRSYM2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleRSYM2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRSYM2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRSYM2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRSYM2535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleRSYM2554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleRSYM2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleRSYM2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleRSYM2611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleRSYM2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRSYM2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleRSYM2668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRSYM2687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleRSYM2706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleRSYM2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleRSYM2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleRSYM2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleRSYM2782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleRSYM2801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleRSYM2820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleRSYM2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleRSYM2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleRSYM2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleRSYM2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleRSYM2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRSYM2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRSYM2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRSYM2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleRSYM2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleRSYM3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleRSYM3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleRSYM3048 = new BitSet(new long[]{0x0000000000000002L});

}