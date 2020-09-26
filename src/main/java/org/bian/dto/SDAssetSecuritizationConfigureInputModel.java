package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureInputModel
 */
public class SDAssetSecuritizationConfigureInputModel   {
  private Object assetSecuritizationConfigurationActionTaskRecord = null;

  private String assetSecuritizationServicingSessionReference = null;

  private String assetSecuritizationServiceReference = null;

  private SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return assetSecuritizationConfigurationActionTaskRecord
  **/

  public Object getAssetSecuritizationConfigurationActionTaskRecord() {
    return assetSecuritizationConfigurationActionTaskRecord;
  }

  public void setAssetSecuritizationConfigurationActionTaskRecord(Object assetSecuritizationConfigurationActionTaskRecord) {
    this.assetSecuritizationConfigurationActionTaskRecord = assetSecuritizationConfigurationActionTaskRecord;
  }


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

  public SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord getAssetSecuritizationServiceConfigurationRecord() {
    return assetSecuritizationServiceConfigurationRecord;
  }

  public void setAssetSecuritizationServiceConfigurationRecord(SDAssetSecuritizationConfigureInputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord) {
    this.assetSecuritizationServiceConfigurationRecord = assetSecuritizationServiceConfigurationRecord;
  }


}

