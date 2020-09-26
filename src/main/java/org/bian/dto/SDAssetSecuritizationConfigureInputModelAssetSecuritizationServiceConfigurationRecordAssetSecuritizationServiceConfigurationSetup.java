package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup
 */
public class SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecordAssetSecuritizationServiceConfigurationSetup   {
  private String assetSecuritizationServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The requested and current activation values for the service configuration parameter  
   * @return assetSecuritizationServiceConfigurationParameter
  **/

  public String getAssetSecuritizationServiceConfigurationParameter() {
    return assetSecuritizationServiceConfigurationParameter;
  }

  public void setAssetSecuritizationServiceConfigurationParameter(String assetSecuritizationServiceConfigurationParameter) {
    this.assetSecuritizationServiceConfigurationParameter = assetSecuritizationServiceConfigurationParameter;
  }


}

