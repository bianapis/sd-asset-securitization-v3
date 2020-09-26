package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines
 */
public class SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines   {
  private String assetSecuritizationServiceEligibility = null;

  private String assetSecuritizationServiceIntendedUses = null;

  private String assetSecuritizationServicePricingandTerms = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Policies and rules governing access to the offered service, includes eligibility and qualifications 
   * @return assetSecuritizationServiceEligibility
  **/

  public String getAssetSecuritizationServiceEligibility() {
    return assetSecuritizationServiceEligibility;
  }

  public void setAssetSecuritizationServiceEligibility(String assetSecuritizationServiceEligibility) {
    this.assetSecuritizationServiceEligibility = assetSecuritizationServiceEligibility;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Guidelines covering allowed, intended use of the service 
   * @return assetSecuritizationServiceIntendedUses
  **/

  public String getAssetSecuritizationServiceIntendedUses() {
    return assetSecuritizationServiceIntendedUses;
  }

  public void setAssetSecuritizationServiceIntendedUses(String assetSecuritizationServiceIntendedUses) {
    this.assetSecuritizationServiceIntendedUses = assetSecuritizationServiceIntendedUses;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms, prices, penalties associated with use of the service 
   * @return assetSecuritizationServicePricingandTerms
  **/

  public String getAssetSecuritizationServicePricingandTerms() {
    return assetSecuritizationServicePricingandTerms;
  }

  public void setAssetSecuritizationServicePricingandTerms(String assetSecuritizationServicePricingandTerms) {
    this.assetSecuritizationServicePricingandTerms = assetSecuritizationServicePricingandTerms;
  }


}

