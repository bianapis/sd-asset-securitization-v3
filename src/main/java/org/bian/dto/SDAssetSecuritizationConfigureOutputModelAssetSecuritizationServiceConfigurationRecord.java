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
 * SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord
 */
public class SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord   {
  private String assetSecuritizationServiceConfigurationSettingDescription = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceSubscription assetSecuritizationServiceSubscription = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceAgreement assetSecuritizationServiceAgreement = null;

  private String assetSecuritizationServiceStatus = null;


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

