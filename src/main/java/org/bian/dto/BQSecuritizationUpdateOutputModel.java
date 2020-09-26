package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSecuritizationUpdateOutputModel
 */
public class BQSecuritizationUpdateOutputModel   {
  private String securitizationUpdateActionTaskReference = null;

  private Object securitizationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;

  private String selectionPreconditions = null;

  private String selectionTaskSchedule = null;

  private String assetSelection = null;

  private String selectionPostconditions = null;

  private String selectionAssetSelectionServiceType = null;

  private String selectionAssetSelectionServiceDescription = null;

  private String selectionAssetSelectionServiceInputsandOuputs = null;

  private String selectionAssetSelectionServiceWorkProduct = null;

  private String selectionAssetSelectionServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return securitizationUpdateActionTaskReference
  **/

  public String getSecuritizationUpdateActionTaskReference() {
    return securitizationUpdateActionTaskReference;
  }

  public void setSecuritizationUpdateActionTaskReference(String securitizationUpdateActionTaskReference) {
    this.securitizationUpdateActionTaskReference = securitizationUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return securitizationUpdateActionTaskRecord
  **/

  public Object getSecuritizationUpdateActionTaskRecord() {
    return securitizationUpdateActionTaskRecord;
  }

  public void setSecuritizationUpdateActionTaskRecord(Object securitizationUpdateActionTaskRecord) {
    this.securitizationUpdateActionTaskRecord = securitizationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation prior to the execution of the task 
   * @return selectionPreconditions
  **/

  public String getSelectionPreconditions() {
    return selectionPreconditions;
  }

  public void setSelectionPreconditions(String selectionPreconditions) {
    this.selectionPreconditions = selectionPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the transaction task 
   * @return selectionTaskSchedule
  **/

  public String getSelectionTaskSchedule() {
    return selectionTaskSchedule;
  }

  public void setSelectionTaskSchedule(String selectionTaskSchedule) {
    this.selectionTaskSchedule = selectionTaskSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Asset Securitization Transaction specific Business Service 
   * @return assetSelection
  **/

  public String getAssetSelection() {
    return assetSelection;
  }

  public void setAssetSelection(String assetSelection) {
    this.assetSelection = assetSelection;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status and any triggered/dependent actions once the task has been completed 
   * @return selectionPostconditions
  **/

  public String getSelectionPostconditions() {
    return selectionPostconditions;
  }

  public void setSelectionPostconditions(String selectionPostconditions) {
    this.selectionPostconditions = selectionPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return selectionAssetSelectionServiceType
  **/

  public String getSelectionAssetSelectionServiceType() {
    return selectionAssetSelectionServiceType;
  }

  public void setSelectionAssetSelectionServiceType(String selectionAssetSelectionServiceType) {
    this.selectionAssetSelectionServiceType = selectionAssetSelectionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return selectionAssetSelectionServiceDescription
  **/

  public String getSelectionAssetSelectionServiceDescription() {
    return selectionAssetSelectionServiceDescription;
  }

  public void setSelectionAssetSelectionServiceDescription(String selectionAssetSelectionServiceDescription) {
    this.selectionAssetSelectionServiceDescription = selectionAssetSelectionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return selectionAssetSelectionServiceInputsandOuputs
  **/

  public String getSelectionAssetSelectionServiceInputsandOuputs() {
    return selectionAssetSelectionServiceInputsandOuputs;
  }

  public void setSelectionAssetSelectionServiceInputsandOuputs(String selectionAssetSelectionServiceInputsandOuputs) {
    this.selectionAssetSelectionServiceInputsandOuputs = selectionAssetSelectionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return selectionAssetSelectionServiceWorkProduct
  **/

  public String getSelectionAssetSelectionServiceWorkProduct() {
    return selectionAssetSelectionServiceWorkProduct;
  }

  public void setSelectionAssetSelectionServiceWorkProduct(String selectionAssetSelectionServiceWorkProduct) {
    this.selectionAssetSelectionServiceWorkProduct = selectionAssetSelectionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return selectionAssetSelectionServiceName
  **/

  public String getSelectionAssetSelectionServiceName() {
    return selectionAssetSelectionServiceName;
  }

  public void setSelectionAssetSelectionServiceName(String selectionAssetSelectionServiceName) {
    this.selectionAssetSelectionServiceName = selectionAssetSelectionServiceName;
  }


}

