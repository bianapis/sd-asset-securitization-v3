package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQSelectionExchangeInputModel
 */
public class BQSelectionExchangeInputModel   {
  private String securitizationPreconditions = null;

  private String securitizationTaskSchedule = null;

  private String businessService = null;

  private String securitizationPostconditions = null;

  private String securitizationServiceType = null;

  private String securitizationServiceDescription = null;

  private String securitizationServiceInputsandOuputs = null;

  private String securitizationServiceWorkProduct = null;

  private String assetSecuritizationTransactionInstanceReference = null;

  private String selectionInstanceReference = null;

  private Object selectionExchangeActionTaskRecord = null;

  private CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest selectionExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return securitizationPreconditions
  **/

  public String getSecuritizationPreconditions() {
    return securitizationPreconditions;
  }

  public void setSecuritizationPreconditions(String securitizationPreconditions) {
    this.securitizationPreconditions = securitizationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return securitizationTaskSchedule
  **/

  public String getSecuritizationTaskSchedule() {
    return securitizationTaskSchedule;
  }

  public void setSecuritizationTaskSchedule(String securitizationTaskSchedule) {
    this.securitizationTaskSchedule = securitizationTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Asset Securitization Transaction specific Business Service 
   * @return businessService
  **/

  public String getBusinessService() {
    return businessService;
  }

  public void setBusinessService(String businessService) {
    this.businessService = businessService;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return securitizationPostconditions
  **/

  public String getSecuritizationPostconditions() {
    return securitizationPostconditions;
  }

  public void setSecuritizationPostconditions(String securitizationPostconditions) {
    this.securitizationPostconditions = securitizationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return securitizationServiceType
  **/

  public String getSecuritizationServiceType() {
    return securitizationServiceType;
  }

  public void setSecuritizationServiceType(String securitizationServiceType) {
    this.securitizationServiceType = securitizationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return securitizationServiceDescription
  **/

  public String getSecuritizationServiceDescription() {
    return securitizationServiceDescription;
  }

  public void setSecuritizationServiceDescription(String securitizationServiceDescription) {
    this.securitizationServiceDescription = securitizationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return securitizationServiceInputsandOuputs
  **/

  public String getSecuritizationServiceInputsandOuputs() {
    return securitizationServiceInputsandOuputs;
  }

  public void setSecuritizationServiceInputsandOuputs(String securitizationServiceInputsandOuputs) {
    this.securitizationServiceInputsandOuputs = securitizationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return securitizationServiceWorkProduct
  **/

  public String getSecuritizationServiceWorkProduct() {
    return securitizationServiceWorkProduct;
  }

  public void setSecuritizationServiceWorkProduct(String securitizationServiceWorkProduct) {
    this.securitizationServiceWorkProduct = securitizationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Asset Securitization Transaction instance 
   * @return assetSecuritizationTransactionInstanceReference
  **/

  public String getAssetSecuritizationTransactionInstanceReference() {
    return assetSecuritizationTransactionInstanceReference;
  }

  public void setAssetSecuritizationTransactionInstanceReference(String assetSecuritizationTransactionInstanceReference) {
    this.assetSecuritizationTransactionInstanceReference = assetSecuritizationTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Selection instance 
   * @return selectionInstanceReference
  **/

  public String getSelectionInstanceReference() {
    return selectionInstanceReference;
  }

  public void setSelectionInstanceReference(String selectionInstanceReference) {
    this.selectionInstanceReference = selectionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return selectionExchangeActionTaskRecord
  **/

  public Object getSelectionExchangeActionTaskRecord() {
    return selectionExchangeActionTaskRecord;
  }

  public void setSelectionExchangeActionTaskRecord(Object selectionExchangeActionTaskRecord) {
    this.selectionExchangeActionTaskRecord = selectionExchangeActionTaskRecord;
  }


  /**
   * Get selectionExchangeActionRequest
   * @return selectionExchangeActionRequest
  **/

  public CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest getSelectionExchangeActionRequest() {
    return selectionExchangeActionRequest;
  }

  public void setSelectionExchangeActionRequest(CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest selectionExchangeActionRequest) {
    this.selectionExchangeActionRequest = selectionExchangeActionRequest;
  }


}

