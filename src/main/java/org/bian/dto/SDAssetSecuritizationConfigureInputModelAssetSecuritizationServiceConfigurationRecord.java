package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement;
import org.bian.dto.SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup;
import org.bian.dto.SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord
 */
public class SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord   {
  private String assetSecuritizationServiceConfigurationSettingReference = null;

  private String assetSecuritizationServiceConfigurationSettingType = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription assetSecuritizationServiceSubscription = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement assetSecuritizationServiceAgreement = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return assetSecuritizationServiceConfigurationSettingReference
  **/

  public String getAssetSecuritizationServiceConfigurationSettingReference() {
    return assetSecuritizationServiceConfigurationSettingReference;
  }

  public void setAssetSecuritizationServiceConfigurationSettingReference(String assetSecuritizationServiceConfigurationSettingReference) {
    this.assetSecuritizationServiceConfigurationSettingReference = assetSecuritizationServiceConfigurationSettingReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return assetSecuritizationServiceConfigurationSettingType
  **/

  public String getAssetSecuritizationServiceConfigurationSettingType() {
    return assetSecuritizationServiceConfigurationSettingType;
  }

  public void setAssetSecuritizationServiceConfigurationSettingType(String assetSecuritizationServiceConfigurationSettingType) {
    this.assetSecuritizationServiceConfigurationSettingType = assetSecuritizationServiceConfigurationSettingType;
  }


  /**
   * Get assetSecuritizationServiceConfigurationSetup
   * @return assetSecuritizationServiceConfigurationSetup
  **/

  public SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup getAssetSecuritizationServiceConfigurationSetup() {
    return assetSecuritizationServiceConfigurationSetup;
  }

  public void setAssetSecuritizationServiceConfigurationSetup(SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup) {
    this.assetSecuritizationServiceConfigurationSetup = assetSecuritizationServiceConfigurationSetup;
  }


  /**
   * Get assetSecuritizationServiceSubscription
   * @return assetSecuritizationServiceSubscription
  **/

  public SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription getAssetSecuritizationServiceSubscription() {
    return assetSecuritizationServiceSubscription;
  }

  public void setAssetSecuritizationServiceSubscription(SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription assetSecuritizationServiceSubscription) {
    this.assetSecuritizationServiceSubscription = assetSecuritizationServiceSubscription;
  }


  /**
   * Get assetSecuritizationServiceAgreement
   * @return assetSecuritizationServiceAgreement
  **/

  public SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement getAssetSecuritizationServiceAgreement() {
    return assetSecuritizationServiceAgreement;
  }

  public void setAssetSecuritizationServiceAgreement(SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement assetSecuritizationServiceAgreement) {
    this.assetSecuritizationServiceAgreement = assetSecuritizationServiceAgreement;
  }


}

