package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionControlOutputModel
 */
public class CRAssetSecuritizationTransactionControlOutputModel   {
  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionControlActionTaskReference = null;

  private Object assetSecuritizationTransactionControlActionTaskRecord = null;

  private String assetSecuritizationTransactionControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset Securitization Transaction instance control processing service call 
   * @return assetSecuritizationTransactionControlActionTaskReference
  **/

  public String getAssetSecuritizationTransactionControlActionTaskReference() {
    return assetSecuritizationTransactionControlActionTaskReference;
  }

  public void setAssetSecuritizationTransactionControlActionTaskReference(String assetSecuritizationTransactionControlActionTaskReference) {
    this.assetSecuritizationTransactionControlActionTaskReference = assetSecuritizationTransactionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return assetSecuritizationTransactionControlActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionControlActionTaskRecord() {
    return assetSecuritizationTransactionControlActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionControlActionTaskRecord(Object assetSecuritizationTransactionControlActionTaskRecord) {
    this.assetSecuritizationTransactionControlActionTaskRecord = assetSecuritizationTransactionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return assetSecuritizationTransactionControlActionResponse
  **/

  public String getAssetSecuritizationTransactionControlActionResponse() {
    return assetSecuritizationTransactionControlActionResponse;
  }

  public void setAssetSecuritizationTransactionControlActionResponse(String assetSecuritizationTransactionControlActionResponse) {
    this.assetSecuritizationTransactionControlActionResponse = assetSecuritizationTransactionControlActionResponse;
  }


}

