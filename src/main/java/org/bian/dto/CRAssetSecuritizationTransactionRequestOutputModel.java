package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRequestOutputModel
 */
public class CRAssetSecuritizationTransactionRequestOutputModel   {
  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionRequestActionTaskReference = null;

  private Object assetSecuritizationTransactionRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset Securitization Transaction instance request service call 
   * @return assetSecuritizationTransactionRequestActionTaskReference
  **/

  public String getAssetSecuritizationTransactionRequestActionTaskReference() {
    return assetSecuritizationTransactionRequestActionTaskReference;
  }

  public void setAssetSecuritizationTransactionRequestActionTaskReference(String assetSecuritizationTransactionRequestActionTaskReference) {
    this.assetSecuritizationTransactionRequestActionTaskReference = assetSecuritizationTransactionRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return assetSecuritizationTransactionRequestActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionRequestActionTaskRecord() {
    return assetSecuritizationTransactionRequestActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionRequestActionTaskRecord(Object assetSecuritizationTransactionRequestActionTaskRecord) {
    this.assetSecuritizationTransactionRequestActionTaskRecord = assetSecuritizationTransactionRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
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

