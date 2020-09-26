package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionExchangeOutputModel
 */
public class CRAssetSecuritizationTransactionExchangeOutputModel   {
  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionExchangeActionTaskReference = null;

  private Object assetSecuritizationTransactionExchangeActionTaskRecord = null;

  private String assetSecuritizationTransactionExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset Securitization Transaction instance exchange service call 
   * @return assetSecuritizationTransactionExchangeActionTaskReference
  **/

  public String getAssetSecuritizationTransactionExchangeActionTaskReference() {
    return assetSecuritizationTransactionExchangeActionTaskReference;
  }

  public void setAssetSecuritizationTransactionExchangeActionTaskReference(String assetSecuritizationTransactionExchangeActionTaskReference) {
    this.assetSecuritizationTransactionExchangeActionTaskReference = assetSecuritizationTransactionExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return assetSecuritizationTransactionExchangeActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionExchangeActionTaskRecord() {
    return assetSecuritizationTransactionExchangeActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionExchangeActionTaskRecord(Object assetSecuritizationTransactionExchangeActionTaskRecord) {
    this.assetSecuritizationTransactionExchangeActionTaskRecord = assetSecuritizationTransactionExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return assetSecuritizationTransactionExchangeActionResponse
  **/

  public String getAssetSecuritizationTransactionExchangeActionResponse() {
    return assetSecuritizationTransactionExchangeActionResponse;
  }

  public void setAssetSecuritizationTransactionExchangeActionResponse(String assetSecuritizationTransactionExchangeActionResponse) {
    this.assetSecuritizationTransactionExchangeActionResponse = assetSecuritizationTransactionExchangeActionResponse;
  }


}

