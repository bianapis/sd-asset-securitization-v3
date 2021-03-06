package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionExchangeInputModel
 */
public class CRAssetSecuritizationTransactionExchangeInputModel   {
  private String assetSecuritizationServicingSessionReference = null;

  private String assetSecuritizationTransactionInstanceReference = null;

  private String assetSecuritizationTransactionParameterType = null;

  private String assetSecuritizationTransactionSelectedOption = null;

  private String assetSecuritizationTransactionStatus = null;

  private String assetSecuritizationTransactionType = null;

  private String assetSecuritizationTransactionTransactionType = null;

  private Object assetSecuritizationTransactionExchangeActionTaskRecord = null;

  private CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest assetSecuritizationTransactionExchangeActionRequest = null;


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
   * Get assetSecuritizationTransactionExchangeActionRequest
   * @return assetSecuritizationTransactionExchangeActionRequest
  **/

  public CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest getAssetSecuritizationTransactionExchangeActionRequest() {
    return assetSecuritizationTransactionExchangeActionRequest;
  }

  public void setAssetSecuritizationTransactionExchangeActionRequest(CRAssetSecuritizationTransactionExchangeInputModelAssetSecuritizationTransactionExchangeActionRequest assetSecuritizationTransactionExchangeActionRequest) {
    this.assetSecuritizationTransactionExchangeActionRequest = assetSecuritizationTransactionExchangeActionRequest;
  }


}

