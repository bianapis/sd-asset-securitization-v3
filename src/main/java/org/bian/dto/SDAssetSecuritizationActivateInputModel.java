package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationActivateInputModel
 */
public class SDAssetSecuritizationActivateInputModel   {
  private Object assetSecuritizationActivationActionTaskRecord = null;

  private String assetSecuritizationCenterReference = null;

  private String assetSecuritizationServiceReference = null;

  private SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return assetSecuritizationActivationActionTaskRecord
  **/

  public Object getAssetSecuritizationActivationActionTaskRecord() {
    return assetSecuritizationActivationActionTaskRecord;
  }

  public void setAssetSecuritizationActivationActionTaskRecord(Object assetSecuritizationActivationActionTaskRecord) {
    this.assetSecuritizationActivationActionTaskRecord = assetSecuritizationActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return assetSecuritizationCenterReference
  **/

  public String getAssetSecuritizationCenterReference() {
    return assetSecuritizationCenterReference;
  }

  public void setAssetSecuritizationCenterReference(String assetSecuritizationCenterReference) {
    this.assetSecuritizationCenterReference = assetSecuritizationCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return assetSecuritizationServiceReference
  **/

  public String getAssetSecuritizationServiceReference() {
    return assetSecuritizationServiceReference;
  }

  public void setAssetSecuritizationServiceReference(String assetSecuritizationServiceReference) {
    this.assetSecuritizationServiceReference = assetSecuritizationServiceReference;
  }


  /**
   * Get assetSecuritizationServiceConfigurationRecord
   * @return assetSecuritizationServiceConfigurationRecord
  **/

  public SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord getAssetSecuritizationServiceConfigurationRecord() {
    return assetSecuritizationServiceConfigurationRecord;
  }

  public void setAssetSecuritizationServiceConfigurationRecord(SDAssetSecuritizationActivateInputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord) {
    this.assetSecuritizationServiceConfigurationRecord = assetSecuritizationServiceConfigurationRecord;
  }


}

