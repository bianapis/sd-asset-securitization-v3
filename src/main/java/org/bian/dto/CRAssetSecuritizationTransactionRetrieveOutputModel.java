package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis;
import org.bian.dto.CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveOutputModel
 */
public class CRAssetSecuritizationTransactionRetrieveOutputModel   {
  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionType = null;

  private String assetSecuritizationTransactionTransactionType = null;

  private String assetSecuritizationTransactionRetrieveActionTaskReference = null;

  private Object assetSecuritizationTransactionRetrieveActionTaskRecord = null;

  private String assetSecuritizationTransactionRetrieveActionResponse = null;

  private CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord assetSecuritizationTransactionInstanceReportRecord = null;

  private CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis assetSecuritizationTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between business sercice transaction within Asset Securitization Transaction 
   * @return assetSecuritizationTransactionParameterType
  **/

  public String getAssetSecuritizationTransactionParameterType() {
    return assetSecuritizationTransactionParameterType;
  }

  public void setAssetSecuritizationTransactionParameterType(String assetSecuritizationTransactionParameterType) {
    this.assetSecuritizationTransactionParameterType = assetSecuritizationTransactionParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service as subject matter of Asset Securitization Transaction 
   * @return assetSecuritizationTransactionSelectedOption
  **/

  public String getAssetSecuritizationTransactionSelectedOption() {
    return assetSecuritizationTransactionSelectedOption;
  }

  public void setAssetSecuritizationTransactionSelectedOption(String assetSecuritizationTransactionSelectedOption) {
    this.assetSecuritizationTransactionSelectedOption = assetSecuritizationTransactionSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Asset Securitization Transaction 
   * @return assetSecuritizationTransactionStatus
  **/

  public String getAssetSecuritizationTransactionStatus() {
    return assetSecuritizationTransactionStatus;
  }

  public void setAssetSecuritizationTransactionStatus(String assetSecuritizationTransactionStatus) {
    this.assetSecuritizationTransactionStatus = assetSecuritizationTransactionStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of business action for this Asset Securitization Transaction 
   * @return assetSecuritizationTransactionType
  **/

  public String getAssetSecuritizationTransactionType() {
    return assetSecuritizationTransactionType;
  }

  public void setAssetSecuritizationTransactionType(String assetSecuritizationTransactionType) {
    this.assetSecuritizationTransactionType = assetSecuritizationTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that specifies type of transaction for this Asset Securitization Transaction 
   * @return assetSecuritizationTransactionTransactionType
  **/

  public String getAssetSecuritizationTransactionTransactionType() {
    return assetSecuritizationTransactionTransactionType;
  }

  public void setAssetSecuritizationTransactionTransactionType(String assetSecuritizationTransactionTransactionType) {
    this.assetSecuritizationTransactionTransactionType = assetSecuritizationTransactionTransactionType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset Securitization Transaction instance retrieve service call 
   * @return assetSecuritizationTransactionRetrieveActionTaskReference
  **/

  public String getAssetSecuritizationTransactionRetrieveActionTaskReference() {
    return assetSecuritizationTransactionRetrieveActionTaskReference;
  }

  public void setAssetSecuritizationTransactionRetrieveActionTaskReference(String assetSecuritizationTransactionRetrieveActionTaskReference) {
    this.assetSecuritizationTransactionRetrieveActionTaskReference = assetSecuritizationTransactionRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assetSecuritizationTransactionRetrieveActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionRetrieveActionTaskRecord() {
    return assetSecuritizationTransactionRetrieveActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionRetrieveActionTaskRecord(Object assetSecuritizationTransactionRetrieveActionTaskRecord) {
    this.assetSecuritizationTransactionRetrieveActionTaskRecord = assetSecuritizationTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assetSecuritizationTransactionRetrieveActionResponse
  **/

  public String getAssetSecuritizationTransactionRetrieveActionResponse() {
    return assetSecuritizationTransactionRetrieveActionResponse;
  }

  public void setAssetSecuritizationTransactionRetrieveActionResponse(String assetSecuritizationTransactionRetrieveActionResponse) {
    this.assetSecuritizationTransactionRetrieveActionResponse = assetSecuritizationTransactionRetrieveActionResponse;
  }


  /**
   * Get assetSecuritizationTransactionInstanceReportRecord
   * @return assetSecuritizationTransactionInstanceReportRecord
  **/

  public CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord getAssetSecuritizationTransactionInstanceReportRecord() {
    return assetSecuritizationTransactionInstanceReportRecord;
  }

  public void setAssetSecuritizationTransactionInstanceReportRecord(CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord assetSecuritizationTransactionInstanceReportRecord) {
    this.assetSecuritizationTransactionInstanceReportRecord = assetSecuritizationTransactionInstanceReportRecord;
  }


  /**
   * Get assetSecuritizationTransactionInstanceAnalysis
   * @return assetSecuritizationTransactionInstanceAnalysis
  **/

  public CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis getAssetSecuritizationTransactionInstanceAnalysis() {
    return assetSecuritizationTransactionInstanceAnalysis;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysis(CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis assetSecuritizationTransactionInstanceAnalysis) {
    this.assetSecuritizationTransactionInstanceAnalysis = assetSecuritizationTransactionInstanceAnalysis;
  }


}

