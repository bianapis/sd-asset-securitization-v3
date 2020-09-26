package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionUpdateInputModel
 */
public class CRAssetSecuritizationTransactionUpdateInputModel   {
  private String assetSecuritizationServicingSessionReference = null;

  private String assetSecuritizationTransactionInstanceReference = null;

  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionType = null;

  private String assetSecuritizationTransactionTransactionType = null;

  private Object assetSecuritizationTransactionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return assetSecuritizationServicingSessionReference
  **/

  public String getAssetSecuritizationServicingSessionReference() {
    return assetSecuritizationServicingSessionReference;
  }

  public void setAssetSecuritizationServicingSessionReference(String assetSecuritizationServicingSessionReference) {
    this.assetSecuritizationServicingSessionReference = assetSecuritizationServicingSessionReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return assetSecuritizationTransactionUpdateActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionUpdateActionTaskRecord() {
    return assetSecuritizationTransactionUpdateActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionUpdateActionTaskRecord(Object assetSecuritizationTransactionUpdateActionTaskRecord) {
    this.assetSecuritizationTransactionUpdateActionTaskRecord = assetSecuritizationTransactionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

