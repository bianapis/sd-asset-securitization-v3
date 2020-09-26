package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQPlacementRequestOutputModel
 */
public class BQPlacementRequestOutputModel   {
  private String placementPreconditions = null;

  private String placementTaskSchedule = null;

  private String businessService = null;

  private String placementPostconditions = null;

  private String placementServiceType = null;

  private String placementServiceDescription = null;

  private String placementServiceInputsandOuputs = null;

  private String placementServiceWorkProduct = null;

  private String placementServiceName = null;

  private String placementRequestActionTaskReference = null;

  private Object placementRequestActionTaskRecord = null;

  private String placementRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return placementPreconditions
  **/

  public String getPlacementPreconditions() {
    return placementPreconditions;
  }

  public void setPlacementPreconditions(String placementPreconditions) {
    this.placementPreconditions = placementPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return placementTaskSchedule
  **/

  public String getPlacementTaskSchedule() {
    return placementTaskSchedule;
  }

  public void setPlacementTaskSchedule(String placementTaskSchedule) {
    this.placementTaskSchedule = placementTaskSchedule;
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
   * @return placementPostconditions
  **/

  public String getPlacementPostconditions() {
    return placementPostconditions;
  }

  public void setPlacementPostconditions(String placementPostconditions) {
    this.placementPostconditions = placementPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return placementServiceType
  **/

  public String getPlacementServiceType() {
    return placementServiceType;
  }

  public void setPlacementServiceType(String placementServiceType) {
    this.placementServiceType = placementServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return placementServiceDescription
  **/

  public String getPlacementServiceDescription() {
    return placementServiceDescription;
  }

  public void setPlacementServiceDescription(String placementServiceDescription) {
    this.placementServiceDescription = placementServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return placementServiceInputsandOuputs
  **/

  public String getPlacementServiceInputsandOuputs() {
    return placementServiceInputsandOuputs;
  }

  public void setPlacementServiceInputsandOuputs(String placementServiceInputsandOuputs) {
    this.placementServiceInputsandOuputs = placementServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return placementServiceWorkProduct
  **/

  public String getPlacementServiceWorkProduct() {
    return placementServiceWorkProduct;
  }

  public void setPlacementServiceWorkProduct(String placementServiceWorkProduct) {
    this.placementServiceWorkProduct = placementServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return placementServiceName
  **/

  public String getPlacementServiceName() {
    return placementServiceName;
  }

  public void setPlacementServiceName(String placementServiceName) {
    this.placementServiceName = placementServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Placement instance request service call 
   * @return placementRequestActionTaskReference
  **/

  public String getPlacementRequestActionTaskReference() {
    return placementRequestActionTaskReference;
  }

  public void setPlacementRequestActionTaskReference(String placementRequestActionTaskReference) {
    this.placementRequestActionTaskReference = placementRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return placementRequestActionTaskRecord
  **/

  public Object getPlacementRequestActionTaskRecord() {
    return placementRequestActionTaskRecord;
  }

  public void setPlacementRequestActionTaskRecord(Object placementRequestActionTaskRecord) {
    this.placementRequestActionTaskRecord = placementRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Placement service request record 
   * @return placementRequestRecordReference
  **/

  public String getPlacementRequestRecordReference() {
    return placementRequestRecordReference;
  }

  public void setPlacementRequestRecordReference(String placementRequestRecordReference) {
    this.placementRequestRecordReference = placementRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

