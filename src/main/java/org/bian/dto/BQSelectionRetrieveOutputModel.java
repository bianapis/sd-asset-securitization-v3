package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSelectionRetrieveOutputModelSelectionInstanceAnalysis;
import org.bian.dto.BQSelectionRetrieveOutputModelSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSelectionRetrieveOutputModel
 */
public class BQSelectionRetrieveOutputModel   {
  private String securitizationPreconditions = null;

  private String securitizationTaskSchedule = null;

  private String businessService = null;

  private String securitizationPostconditions = null;

  private String securitizationServiceType = null;

  private String securitizationServiceDescription = null;

  private String securitizationServiceInputsandOuputs = null;

  private String securitizationServiceWorkProduct = null;

  private String selectionRetrieveActionTaskReference = null;

  private Object selectionRetrieveActionTaskRecord = null;

  private String selectionRetrieveActionResponse = null;

  private BQSelectionRetrieveOutputModelSelectionInstanceReport selectionInstanceReport = null;

  private BQSelectionRetrieveOutputModelSelectionInstanceAnalysis selectionInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Selection instance retrieve service call 
   * @return selectionRetrieveActionTaskReference
  **/

  public String getSelectionRetrieveActionTaskReference() {
    return selectionRetrieveActionTaskReference;
  }

  public void setSelectionRetrieveActionTaskReference(String selectionRetrieveActionTaskReference) {
    this.selectionRetrieveActionTaskReference = selectionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return selectionRetrieveActionTaskRecord
  **/

  public Object getSelectionRetrieveActionTaskRecord() {
    return selectionRetrieveActionTaskRecord;
  }

  public void setSelectionRetrieveActionTaskRecord(Object selectionRetrieveActionTaskRecord) {
    this.selectionRetrieveActionTaskRecord = selectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return selectionRetrieveActionResponse
  **/

  public String getSelectionRetrieveActionResponse() {
    return selectionRetrieveActionResponse;
  }

  public void setSelectionRetrieveActionResponse(String selectionRetrieveActionResponse) {
    this.selectionRetrieveActionResponse = selectionRetrieveActionResponse;
  }


  /**
   * Get selectionInstanceReport
   * @return selectionInstanceReport
  **/

  public BQSelectionRetrieveOutputModelSelectionInstanceReport getSelectionInstanceReport() {
    return selectionInstanceReport;
  }

  public void setSelectionInstanceReport(BQSelectionRetrieveOutputModelSelectionInstanceReport selectionInstanceReport) {
    this.selectionInstanceReport = selectionInstanceReport;
  }


  /**
   * Get selectionInstanceAnalysis
   * @return selectionInstanceAnalysis
  **/

  public BQSelectionRetrieveOutputModelSelectionInstanceAnalysis getSelectionInstanceAnalysis() {
    return selectionInstanceAnalysis;
  }

  public void setSelectionInstanceAnalysis(BQSelectionRetrieveOutputModelSelectionInstanceAnalysis selectionInstanceAnalysis) {
    this.selectionInstanceAnalysis = selectionInstanceAnalysis;
  }


}

