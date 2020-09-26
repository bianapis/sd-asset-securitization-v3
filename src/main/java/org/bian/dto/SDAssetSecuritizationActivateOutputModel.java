package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationActivateOutputModel
 */
public class SDAssetSecuritizationActivateOutputModel   {
  private String assetSecuritizationActivationActionTaskReference = null;

  private Object assetSecuritizationActivationActionTaskRecord = null;

  private String assetSecuritizationServicingSessionReference = null;

  private Object assetSecuritizationServicingSessionRecord = null;

  private SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord = null;

  private String assetSecuritizationServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return assetSecuritizationActivationActionTaskReference
  **/

  public String getAssetSecuritizationActivationActionTaskReference() {
    return assetSecuritizationActivationActionTaskReference;
  }

  public void setAssetSecuritizationActivationActionTaskReference(String assetSecuritizationActivationActionTaskReference) {
    this.assetSecuritizationActivationActionTaskReference = assetSecuritizationActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return assetSecuritizationServicingSessionRecord
  **/

  public Object getAssetSecuritizationServicingSessionRecord() {
    return assetSecuritizationServicingSessionRecord;
  }

  public void setAssetSecuritizationServicingSessionRecord(Object assetSecuritizationServicingSessionRecord) {
    this.assetSecuritizationServicingSessionRecord = assetSecuritizationServicingSessionRecord;
  }


  /**
   * Get assetSecuritizationServiceConfigurationRecord
   * @return assetSecuritizationServiceConfigurationRecord
  **/

  public SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord getAssetSecuritizationServiceConfigurationRecord() {
    return assetSecuritizationServiceConfigurationRecord;
  }

  public void setAssetSecuritizationServiceConfigurationRecord(SDAssetSecuritizationActivateOutputModelAssetSecuritizationServiceConfigurationRecord assetSecuritizationServiceConfigurationRecord) {
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

