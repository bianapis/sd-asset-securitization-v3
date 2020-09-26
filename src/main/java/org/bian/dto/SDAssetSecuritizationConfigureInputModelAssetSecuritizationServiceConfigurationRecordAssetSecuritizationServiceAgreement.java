package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement
 */
public class SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement   {
  private String assetSecuritizationServiceAgreementReference = null;

  private String assetSecuritizationServiceUserReference = null;

  private String assetSecuritizationServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return assetSecuritizationServiceAgreementReference
  **/

  public String getAssetSecuritizationServiceAgreementReference() {
    return assetSecuritizationServiceAgreementReference;
  }

  public void setAssetSecuritizationServiceAgreementReference(String assetSecuritizationServiceAgreementReference) {
    this.assetSecuritizationServiceAgreementReference = assetSecuritizationServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return assetSecuritizationServiceUserReference
  **/

  public String getAssetSecuritizationServiceUserReference() {
    return assetSecuritizationServiceUserReference;
  }

  public void setAssetSecuritizationServiceUserReference(String assetSecuritizationServiceUserReference) {
    this.assetSecuritizationServiceUserReference = assetSecuritizationServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return assetSecuritizationServiceAgreementTermsandConditions
  **/

  public String getAssetSecuritizationServiceAgreementTermsandConditions() {
    return assetSecuritizationServiceAgreementTermsandConditions;
  }

  public void setAssetSecuritizationServiceAgreementTermsandConditions(String assetSecuritizationServiceAgreementTermsandConditions) {
    this.assetSecuritizationServiceAgreementTermsandConditions = assetSecuritizationServiceAgreementTermsandConditions;
  }


}

