package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSelectionInitiateOutputModel
 */
public class BQSelectionInitiateOutputModel   {
  private String securitizationPreconditions = null;

  private String securitizationTaskSchedule = null;

  private String businessService = null;

  private String securitizationPostconditions = null;

  private String securitizationServiceType = null;

  private String securitizationServiceDescription = null;

  private String securitizationServiceInputsandOuputs = null;

  private String securitizationServiceWorkProduct = null;

  private String selectionInstanceReference = null;

  private String selectionInitiateActionReference = null;

  private Object selectionInitiateActionRecord = null;

  private String selectionInstanceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return selectionInitiateActionReference
  **/

  public String getSelectionInitiateActionReference() {
    return selectionInitiateActionReference;
  }

  public void setSelectionInitiateActionReference(String selectionInitiateActionReference) {
    this.selectionInitiateActionReference = selectionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return selectionInitiateActionRecord
  **/

  public Object getSelectionInitiateActionRecord() {
    return selectionInitiateActionRecord;
  }

  public void setSelectionInitiateActionRecord(Object selectionInitiateActionRecord) {
    this.selectionInitiateActionRecord = selectionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Selection instance (e.g. initialised, pending, active) 
   * @return selectionInstanceStatus
  **/

  public String getSelectionInstanceStatus() {
    return selectionInstanceStatus;
  }

  public void setSelectionInstanceStatus(String selectionInstanceStatus) {
    this.selectionInstanceStatus = selectionInstanceStatus;
  }


}

