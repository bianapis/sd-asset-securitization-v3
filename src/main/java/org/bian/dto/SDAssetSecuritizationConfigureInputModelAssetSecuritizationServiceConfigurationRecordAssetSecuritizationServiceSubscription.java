package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription
 */
public class SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription   {
  private String assetSecuritizationServiceSubscriberReference = null;

  private String assetSecuritizationServiceSubscriberAccessProfile = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Maintains reference to allowed users or subscribers to the service which can be any known party 
   * @return assetSecuritizationServiceSubscriberReference
  **/

  public String getAssetSecuritizationServiceSubscriberReference() {
    return assetSecuritizationServiceSubscriberReference;
  }

  public void setAssetSecuritizationServiceSubscriberReference(String assetSecuritizationServiceSubscriberReference) {
    this.assetSecuritizationServiceSubscriberReference = assetSecuritizationServiceSubscriberReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allowed service access for a user or subscriber to the service which can be any known party 
   * @return assetSecuritizationServiceSubscriberAccessProfile
  **/

  public String getAssetSecuritizationServiceSubscriberAccessProfile() {
    return assetSecuritizationServiceSubscriberAccessProfile;
  }

  public void setAssetSecuritizationServiceSubscriberAccessProfile(String assetSecuritizationServiceSubscriberAccessProfile) {
    this.assetSecuritizationServiceSubscriberAccessProfile = assetSecuritizationServiceSubscriberAccessProfile;
  }


}

