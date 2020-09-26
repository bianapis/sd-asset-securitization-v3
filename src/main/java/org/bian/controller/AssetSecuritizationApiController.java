/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Transact;

@BianRestController
public class AssetSecuritizationApiController {

	@Autowired
	AssetSecuritizationApiService service;
	
	@Transact.Activate
	public BianResponse<SDAssetSecuritizationActivateOutputModel> activate(@RequestBody BianRequest<SDAssetSecuritizationActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Transact.Configure
	public BianResponse<SDAssetSecuritizationConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAssetSecuritizationConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Control
	public BianResponse<CRAssetSecuritizationTransactionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("placement")
	@Transact.Exchange
	public BianResponse<BQPlacementExchangeOutputModel> exchangePlacement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPlacementExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangePlacement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitization")
	@Transact.Exchange
	public BianResponse<BQSecuritizationExchangeOutputModel> exchangeSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritizationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSecuritization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("selection")
	@Transact.Exchange
	public BianResponse<BQSelectionExchangeOutputModel> exchangeSelection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSelectionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeSelection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Exchange
	public BianResponse<CRAssetSecuritizationTransactionExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Execute
	public BianResponse<CRAssetSecuritizationTransactionExecuteOutputModel> execute(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.execute(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Feedback
	public BianResponse<SDAssetSecuritizationFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDAssetSecuritizationFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Transact.Initiate
	public BianResponse<CRAssetSecuritizationTransactionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("placement")
	@Transact.Initiate
	public BianResponse<BQPlacementInitiateOutputModel> initiatePlacement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQPlacementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiatePlacement(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitization")
	@Transact.Initiate
	public BianResponse<BQSecuritizationInitiateOutputModel> initiateSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSecuritizationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSecuritization(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("selection")
	@Transact.Initiate
	public BianResponse<BQSelectionInitiateOutputModel> initiateSelection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQSelectionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateSelection(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("placement")
	@Transact.Request
	public BianResponse<BQPlacementRequestOutputModel> requestPlacement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPlacementRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestPlacement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitization")
	@Transact.Request
	public BianResponse<BQSecuritizationRequestOutputModel> requestSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritizationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSecuritization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("selection")
	@Transact.Request
	public BianResponse<BQSelectionRequestOutputModel> requestSelection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSelectionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSelection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Transact.Request
	public BianResponse<CRAssetSecuritizationTransactionRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Transact.Retrieve
	public BianResponse<CRAssetSecuritizationTransactionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Transact.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Transact.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Transact.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@BQ("placement")
	@Transact.Retrieve
	public BianResponse<BQPlacementRetrieveOutputModel> retrievePlacement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePlacement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("securitization")
	@Transact.Retrieve
	public BianResponse<BQSecuritizationRetrieveOutputModel> retrieveSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSecuritization(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("selection")
	@Transact.Retrieve
	public BianResponse<BQSelectionRetrieveOutputModel> retrieveSelection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSelection(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Transact.RetrieveSD
	public BianResponse<SDAssetSecuritizationRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Transact.Update
	public BianResponse<CRAssetSecuritizationTransactionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRAssetSecuritizationTransactionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("placement")
	@Transact.Update
	public BianResponse<BQPlacementUpdateOutputModel> updatePlacement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQPlacementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updatePlacement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("securitization")
	@Transact.Update
	public BianResponse<BQSecuritizationUpdateOutputModel> updateSecuritization(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSecuritizationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSecuritization(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("selection")
	@Transact.Update
	public BianResponse<BQSelectionUpdateOutputModel> updateSelection(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSelectionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSelection(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
