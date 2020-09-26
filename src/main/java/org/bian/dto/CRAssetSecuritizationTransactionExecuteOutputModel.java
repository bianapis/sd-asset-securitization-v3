package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionExecuteOutputModel
 */
public class CRAssetSecuritizationTransactionExecuteOutputModel   {
  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionExecuteActionTaskReference = null;

  private Object assetSecuritizationTransactionExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Asset Securitization Transaction instance execute service call 
   * @return assetSecuritizationTransactionExecuteActionTaskReference
  **/

  public String getAssetSecuritizationTransactionExecuteActionTaskReference() {
    return assetSecuritizationTransactionExecuteActionTaskReference;
  }

  public void setAssetSecuritizationTransactionExecuteActionTaskReference(String assetSecuritizationTransactionExecuteActionTaskReference) {
    this.assetSecuritizationTransactionExecuteActionTaskReference = assetSecuritizationTransactionExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return assetSecuritizationTransactionExecuteActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionExecuteActionTaskRecord() {
    return assetSecuritizationTransactionExecuteActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionExecuteActionTaskRecord(Object assetSecuritizationTransactionExecuteActionTaskRecord) {
    this.assetSecuritizationTransactionExecuteActionTaskRecord = assetSecuritizationTransactionExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

