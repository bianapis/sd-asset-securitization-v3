package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord
 */
public class SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord   {
  private String assetSecuritizationServiceConfigurationSettingReference = null;

  private String assetSecuritizationServiceConfigurationSettingType = null;

  private SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup = null;


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

  public SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup getAssetSecuritizationServiceConfigurationSetup() {
    return assetSecuritizationServiceConfigurationSetup;
  }

  public void setAssetSecuritizationServiceConfigurationSetup(SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup assetSecuritizationServiceConfigurationSetup) {
    this.assetSecuritizationServiceConfigurationSetup = assetSecuritizationServiceConfigurationSetup;
  }


}

