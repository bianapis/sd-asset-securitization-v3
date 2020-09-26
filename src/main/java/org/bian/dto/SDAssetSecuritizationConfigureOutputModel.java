package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationConfigureOutputModel
 */
public class SDAssetSecuritizationConfigureOutputModel   {
  private String assetSecuritizationConfigurationActionTaskReference = null;

  private Object assetSecuritizationConfigurationActionTaskRecord = null;

  private SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord = null;

  private String assetSecuritizationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return assetSecuritizationConfigurationActionTaskReference
  **/

  public String getAssetSecuritizationConfigurationActionTaskReference() {
    return assetSecuritizationConfigurationActionTaskReference;
  }

  public void setAssetSecuritizationConfigurationActionTaskReference(String assetSecuritizationConfigurationActionTaskReference) {
    this.assetSecuritizationConfigurationActionTaskReference = assetSecuritizationConfigurationActionTaskReference;
  }


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
   * Get assetSecuritizationServiceConfigurationRecord
   * @return assetSecuritizationServiceConfigurationRecord
  **/

  public SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord getAssetSecuritizationServiceConfigurationRecord() {
    return assetSecuritizationServiceConfigurationRecord;
  }

  public void setAssetSecuritizationServiceConfigurationRecord(SDAssetSecuritizationConfigureOutputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord) {
    this.assetSecuritizationServiceConfigurationRecord = assetSecuritizationServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return assetSecuritizationServicingSessionStatus
  **/

  public String getAssetSecuritizationServicingSessionStatus() {
    return assetSecuritizationServicingSessionStatus;
  }

  public void setAssetSecuritizationServicingSessionStatus(String assetSecuritizationServicingSessionStatus) {
    this.assetSecuritizationServicingSessionStatus = assetSecuritizationServicingSessionStatus;
  }


}

