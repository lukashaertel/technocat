package eu.metatools.technocat.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.metatools.technocat.services.TechnoCatGrammarAccess;
import eu.metatools.technocat.technoCat.ED;
import eu.metatools.technocat.technoCat.EDItem;
import eu.metatools.technocat.technoCat.ETD;
import eu.metatools.technocat.technoCat.Import;
import eu.metatools.technocat.technoCat.RD;
import eu.metatools.technocat.technoCat.RTD;
import eu.metatools.technocat.technoCat.RTDItem;
import eu.metatools.technocat.technoCat.TechnoCatPackage;
import eu.metatools.technocat.technoCat.TechnologyCatalog;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TechnoCatSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TechnoCatGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TechnoCatPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TechnoCatPackage.ED:
				if(context == grammarAccess.getEDRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getInstanceElementRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_ED(context, (ED) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.ED_ITEM:
				if(context == grammarAccess.getEDItemRule()) {
					sequence_EDItem(context, (EDItem) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.ETD:
				if(context == grammarAccess.getDefinitionElementRule() ||
				   context == grammarAccess.getETDRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getModelElementRule()) {
					sequence_ETD(context, (ETD) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.IMPORT:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.RD:
				if(context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getInstanceElementRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getRDRule()) {
					sequence_RD(context, (RD) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.RTD:
				if(context == grammarAccess.getDefinitionElementRule() ||
				   context == grammarAccess.getElementRule() ||
				   context == grammarAccess.getModelElementRule() ||
				   context == grammarAccess.getRTDRule()) {
					sequence_RTD(context, (RTD) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.RTD_ITEM:
				if(context == grammarAccess.getRTDItemRule()) {
					sequence_RTDItem(context, (RTDItem) semanticObject); 
					return; 
				}
				else break;
			case TechnoCatPackage.TECHNOLOGY_CATALOG:
				if(context == grammarAccess.getTechnologyCatalogRule()) {
					sequence_TechnologyCatalog(context, (TechnologyCatalog) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=EID value=STRING?)
	 */
	protected void sequence_EDItem(EObject context, EDItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=[ETD|ETID] items+=EDItem items+=EDItem*)
	 */
	protected void sequence_ED(EObject context, ED semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ETID (bases+=[ETD|ETID] bases+=[ETD|ETID]*)? value=STRING?)
	 */
	protected void sequence_ETD(EObject context, ETD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ref=[TechnologyCatalog|TCID]
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TechnoCatPackage.Literals.IMPORT__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TechnoCatPackage.Literals.IMPORT__REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getRefTechnologyCatalogTCIDParserRuleCall_1_0_1(), semanticObject.getRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=[EDItem|EID] relation=[RTD|RTID] right=[EDItem|EID] value=STRING?)
	 */
	protected void sequence_RD(EObject context, RD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (domain=[ETD|ETID] codomain=[ETD|ETID] value=STRING?)
	 */
	protected void sequence_RTDItem(EObject context, RTDItem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=RTID (bases+=[RTD|RTID] bases+=[RTD|RTID]*)? value=STRING? items+=RTDItem*)
	 */
	protected void sequence_RTD(EObject context, RTD semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=TCID (imports+=Import | entityTypes+=ETD | relationTypes+=RTD | entities+=ED | relations+=RD)*)
	 */
	protected void sequence_TechnologyCatalog(EObject context, TechnologyCatalog semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
