package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup;
import org.bian.dto.SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement;
import org.bian.dto.SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord
 */
public class SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord   {
  private String assetSecuritizationServiceConfigurationSettingReference = null;

  private String assetSecuritizationServiceConfigurationSettingDescription = null;

  private SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup = null;

  private SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription assetSecuritizationServiceSubscription = null;

  private SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement assetSecuritizationServiceAgreement = null;

  private String assetSecuritizationServiceStatus = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return assetSecuritizationServiceConfigurationSettingDescription
  **/

  public String getAssetSecuritizationServiceConfigurationSettingDescription() {
    return assetSecuritizationServiceConfigurationSettingDescription;
  }

  public void setAssetSecuritizationServiceConfigurationSettingDescription(String assetSecuritizationServiceConfigurationSettingDescription) {
    this.assetSecuritizationServiceConfigurationSettingDescription = assetSecuritizationServiceConfigurationSettingDescription;
  }


  /**
   * Get assetSecuritizationServiceConfigurationSetup
   * @return assetSecuritizationServiceConfigurationSetup
  **/

  public SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup getAssetSecuritizationServiceConfigurationSetup() {
    return assetSecuritizationServiceConfigurationSetup;
  }

  public void setAssetSecuritizationServiceConfigurationSetup(SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup) {
    this.assetSecuritizationServiceConfigurationSetup = assetSecuritizationServiceConfigurationSetup;
  }


  /**
   * Get assetSecuritizationServiceSubscription
   * @return assetSecuritizationServiceSubscription
  **/

  public SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription getAssetSecuritizationServiceSubscription() {
    return assetSecuritizationServiceSubscription;
  }

  public void setAssetSecuritizationServiceSubscription(SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription assetSecuritizationServiceSubscription) {
    this.assetSecuritizationServiceSubscription = assetSecuritizationServiceSubscription;
  }


  /**
   * Get assetSecuritizationServiceAgreement
   * @return assetSecuritizationServiceAgreement
  **/

  public SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement getAssetSecuritizationServiceAgreement() {
    return assetSecuritizationServiceAgreement;
  }

  public void setAssetSecuritizationServiceAgreement(SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement assetSecuritizationServiceAgreement) {
    this.assetSecuritizationServiceAgreement = assetSecuritizationServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return assetSecuritizationServiceStatus
  **/

  public String getAssetSecuritizationServiceStatus() {
    return assetSecuritizationServiceStatus;
  }

  public void setAssetSecuritizationServiceStatus(String assetSecuritizationServiceStatus) {
    this.assetSecuritizationServiceStatus = assetSecuritizationServiceStatus;
  }


}

