package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionInitiateOutputModel
 */
public class CRAssetSecuritizationTransactionInitiateOutputModel   {
  private String assetSecuritizationTransactionInstanceReference = null;

  private String assetSecuritizationTransactionInitiateActionReference = null;

  private Object assetSecuritizationTransactionInitiateActionRecord = null;

  private String assetSecuritizationTransactionInstanceStatus = null;

  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Asset Securitization Transaction instance 
   * @return assetSecuritizationTransactionInstanceReference
  **/

  public String getAssetSecuritizationTransactionInstanceReference() {
    return assetSecuritizationTransactionInstanceReference;
  }

  public void setAssetSecuritizationTransactionInstanceReference(String assetSecuritizationTransactionInstanceReference) {
    this.assetSecuritizationTransactionInstanceReference = assetSecuritizationTransactionInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return assetSecuritizationTransactionInitiateActionReference
  **/

  public String getAssetSecuritizationTransactionInitiateActionReference() {
    return assetSecuritizationTransactionInitiateActionReference;
  }

  public void setAssetSecuritizationTransactionInitiateActionReference(String assetSecuritizationTransactionInitiateActionReference) {
    this.assetSecuritizationTransactionInitiateActionReference = assetSecuritizationTransactionInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return assetSecuritizationTransactionInitiateActionRecord
  **/

  public Object getAssetSecuritizationTransactionInitiateActionRecord() {
    return assetSecuritizationTransactionInitiateActionRecord;
  }

  public void setAssetSecuritizationTransactionInitiateActionRecord(Object assetSecuritizationTransactionInitiateActionRecord) {
    this.assetSecuritizationTransactionInitiateActionRecord = assetSecuritizationTransactionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Asset Securitization Transaction instance (e.g. initialised, pending, active) 
   * @return assetSecuritizationTransactionInstanceStatus
  **/

  public String getAssetSecuritizationTransactionInstanceStatus() {
    return assetSecuritizationTransactionInstanceStatus;
  }

  public void setAssetSecuritizationTransactionInstanceStatus(String assetSecuritizationTransactionInstanceStatus) {
    this.assetSecuritizationTransactionInstanceStatus = assetSecuritizationTransactionInstanceStatus;
  }


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


}

