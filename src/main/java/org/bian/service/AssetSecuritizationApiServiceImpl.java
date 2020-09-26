/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AssetSecuritizationApiServiceImpl implements AssetSecuritizationApiService {

	public SDAssetSecuritizationActivateOutputModel activate(SDAssetSecuritizationActivateInputModel request){
		return JsonReader.read("activate-SDAssetSecuritizationActivateOutputModel.json",new TypeReference<SDAssetSecuritizationActivateOutputModel>(){});
	}
	
	public SDAssetSecuritizationConfigureOutputModel configure(String sdReferenceId, SDAssetSecuritizationConfigureInputModel request){
		return JsonReader.read("configure-SDAssetSecuritizationConfigureOutputModel.json",new TypeReference<SDAssetSecuritizationConfigureOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionControlOutputModel control(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionControlInputModel request){
		return JsonReader.read("control-CRAssetSecuritizationTransactionControlOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionControlOutputModel>(){});
	}
	
	public BQPlacementExchangeOutputModel exchangePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementExchangeInputModel request){
		return JsonReader.read("exchange-BQPlacementExchangeOutputModel.json",new TypeReference<BQPlacementExchangeOutputModel>(){});
	}
	
	public BQSecuritizationExchangeOutputModel exchangeSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationExchangeInputModel request){
		return JsonReader.read("exchange-BQSecuritizationExchangeOutputModel.json",new TypeReference<BQSecuritizationExchangeOutputModel>(){});
	}
	
	public BQSelectionExchangeOutputModel exchangeSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionExchangeInputModel request){
		return JsonReader.read("exchange-BQSelectionExchangeOutputModel.json",new TypeReference<BQSelectionExchangeOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionExchangeInputModel request){
		return JsonReader.read("exchange-CRAssetSecuritizationTransactionExchangeOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionExchangeOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionExecuteOutputModel execute(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionExecuteInputModel request){
		return JsonReader.read("execute-CRAssetSecuritizationTransactionExecuteOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionExecuteOutputModel>(){});
	}
	
	public SDAssetSecuritizationFeedbackOutputModel feedback(String sdReferenceId, SDAssetSecuritizationFeedbackInputModel request){
		return JsonReader.read("feedback-SDAssetSecuritizationFeedbackOutputModel.json",new TypeReference<SDAssetSecuritizationFeedbackOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionInitiateOutputModel initiate(String sdReferenceId, CRAssetSecuritizationTransactionInitiateInputModel request){
		return JsonReader.read("initiate-CRAssetSecuritizationTransactionInitiateOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionInitiateOutputModel>(){});
	}
	
	public BQPlacementInitiateOutputModel initiatePlacement(String sdReferenceId, String crReferenceId, BQPlacementInitiateInputModel request){
		return JsonReader.read("initiate-BQPlacementInitiateOutputModel.json",new TypeReference<BQPlacementInitiateOutputModel>(){});
	}
	
	public BQSecuritizationInitiateOutputModel initiateSecuritization(String sdReferenceId, String crReferenceId, BQSecuritizationInitiateInputModel request){
		return JsonReader.read("initiate-BQSecuritizationInitiateOutputModel.json",new TypeReference<BQSecuritizationInitiateOutputModel>(){});
	}
	
	public BQSelectionInitiateOutputModel initiateSelection(String sdReferenceId, String crReferenceId, BQSelectionInitiateInputModel request){
		return JsonReader.read("initiate-BQSelectionInitiateOutputModel.json",new TypeReference<BQSelectionInitiateOutputModel>(){});
	}
	
	public BQPlacementRequestOutputModel requestPlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementRequestInputModel request){
		return JsonReader.read("request-BQPlacementRequestOutputModel.json",new TypeReference<BQPlacementRequestOutputModel>(){});
	}
	
	public BQSecuritizationRequestOutputModel requestSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationRequestInputModel request){
		return JsonReader.read("request-BQSecuritizationRequestOutputModel.json",new TypeReference<BQSecuritizationRequestOutputModel>(){});
	}
	
	public BQSelectionRequestOutputModel requestSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionRequestInputModel request){
		return JsonReader.read("request-BQSelectionRequestOutputModel.json",new TypeReference<BQSelectionRequestOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionRequestOutputModel request(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionRequestInputModel request){
		return JsonReader.read("request-CRAssetSecuritizationTransactionRequestOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionRequestOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRAssetSecuritizationTransactionRetrieveOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQPlacementRetrieveOutputModel retrievePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQPlacementRetrieveOutputModel.json",new TypeReference<BQPlacementRetrieveOutputModel>(){});
	}
	
	public BQSecuritizationRetrieveOutputModel retrieveSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSecuritizationRetrieveOutputModel.json",new TypeReference<BQSecuritizationRetrieveOutputModel>(){});
	}
	
	public BQSelectionRetrieveOutputModel retrieveSelection(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQSelectionRetrieveOutputModel.json",new TypeReference<BQSelectionRetrieveOutputModel>(){});
	}
	
	public SDAssetSecuritizationRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAssetSecuritizationRetrieveOutputModel.json",new TypeReference<SDAssetSecuritizationRetrieveOutputModel>(){});
	}
	
	public CRAssetSecuritizationTransactionUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRAssetSecuritizationTransactionUpdateInputModel request){
		return JsonReader.read("update-CRAssetSecuritizationTransactionUpdateOutputModel.json",new TypeReference<CRAssetSecuritizationTransactionUpdateOutputModel>(){});
	}
	
	public BQPlacementUpdateOutputModel updatePlacement(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPlacementUpdateInputModel request){
		return JsonReader.read("update-BQPlacementUpdateOutputModel.json",new TypeReference<BQPlacementUpdateOutputModel>(){});
	}
	
	public BQSecuritizationUpdateOutputModel updateSecuritization(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSecuritizationUpdateInputModel request){
		return JsonReader.read("update-BQSecuritizationUpdateOutputModel.json",new TypeReference<BQSecuritizationUpdateOutputModel>(){});
	}
	
	public BQSelectionUpdateOutputModel updateSelection(String sdReferenceId, String crReferenceId, String bqReferenceId, BQSelectionUpdateInputModel request){
		return JsonReader.read("update-BQSelectionUpdateOutputModel.json",new TypeReference<BQSelectionUpdateOutputModel>(){});
	}
	
}
