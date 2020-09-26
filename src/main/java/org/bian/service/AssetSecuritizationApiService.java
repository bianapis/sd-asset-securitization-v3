/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AssetSecuritizationApiService {

	SDAssetSecuritizationActivateOutputModel activate(SDAssetSecuritizationActivateInputModel request);
	
	SDAssetSecuritizationConfigureOutputModel configure(String sdReferenceId, SDAssetSecuritizationConfigureInputModel request);
	
	CRAssetSecuritizationTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionControlInputModel request);
	
	BQPlacementExchangeOutputModel exchangePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementExchangeInputModel request);
	
	BQSecuritizationExchangeOutputModel exchangeSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationExchangeInputModel request);
	
	BQSelectionExchangeOutputModel exchangeSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionExchangeInputModel request);
	
	CRAssetSecuritizationTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionExchangeInputModel request);
	
	CRAssetSecuritizationTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionExecuteInputModel request);
	
	SDAssetSecuritizationFeedbackOutputModel feedback(String sdReferenceId, SDAssetSecuritizationFeedbackInputModel request);
	
	CRAssetSecuritizationTransactionInitiateOutputModel initiate(String sdReferenceId, CRAssetSecuritizationTransactionInitiateInputModel request);
	
	BQPlacementInitiateOutputModel initiatePlacement(String sdReferenceId, String crReferenceId, BQPlacementInitiateInputModel request);
	
	BQSecuritizationInitiateOutputModel initiateSecuritization(String sdReferenceId, String crReferenceId, BQSecuritizationInitiateInputModel request);
	
	BQSelectionInitiateOutputModel initiateSelection(String sdReferenceId, String crReferenceId, BQSelectionInitiateInputModel request);
	
	BQPlacementRequestOutputModel requestPlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementRequestInputModel request);
	
	BQSecuritizationRequestOutputModel requestSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationRequestInputModel request);
	
	BQSelectionRequestOutputModel requestSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionRequestInputModel request);
	
	CRAssetSecuritizationTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionRequestInputModel request);
	
	CRAssetSecuritizationTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQPlacementRetrieveOutputModel retrievePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSecuritizationRetrieveOutputModel retrieveSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQSelectionRetrieveOutputModel retrieveSelection(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	SDAssetSecuritizationRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRAssetSecuritizationTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionUpdateInputModel request);
	
	BQPlacementUpdateOutputModel updatePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementUpdateInputModel request);
	
	BQSecuritizationUpdateOutputModel updateSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationUpdateInputModel request);
	
	BQSelectionUpdateOutputModel updateSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionUpdateInputModel request);
	
}
