package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord
 */
public class SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord   {
  private String assetSecuritizationServiceType = null;

  private String assetSecuritizationServiceVersion = null;

  private String assetSecuritizationServiceDescription = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines assetSecuritizationServicePoliciesandGuidelines = null;

  private String assetSecuritizationServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Refers to the different types of services offered 
   * @return assetSecuritizationServiceType
  **/

  public String getAssetSecuritizationServiceType() {
    return assetSecuritizationServiceType;
  }

  public void setAssetSecuritizationServiceType(String assetSecuritizationServiceType) {
    this.assetSecuritizationServiceType = assetSecuritizationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The version details of the service when appropriate 
   * @return assetSecuritizationServiceVersion
  **/

  public String getAssetSecuritizationServiceVersion() {
    return assetSecuritizationServiceVersion;
  }

  public void setAssetSecuritizationServiceVersion(String assetSecuritizationServiceVersion) {
    this.assetSecuritizationServiceVersion = assetSecuritizationServiceVersion;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the offered service  
   * @return assetSecuritizationServiceDescription
  **/

  public String getAssetSecuritizationServiceDescription() {
    return assetSecuritizationServiceDescription;
  }

  public void setAssetSecuritizationServiceDescription(String assetSecuritizationServiceDescription) {
    this.assetSecuritizationServiceDescription = assetSecuritizationServiceDescription;
  }


  /**
   * Get assetSecuritizationServicePoliciesandGuidelines
   * @return assetSecuritizationServicePoliciesandGuidelines
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines getAssetSecuritizationServicePoliciesandGuidelines() {
    return assetSecuritizationServicePoliciesandGuidelines;
  }

  public void setAssetSecuritizationServicePoliciesandGuidelines(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecordAssetSecuritizationServicePoliciesandGuidelines assetSecuritizationServicePoliciesandGuidelines) {
    this.assetSecuritizationServicePoliciesandGuidelines = assetSecuritizationServicePoliciesandGuidelines;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Schedule defining when the accessed service is available 
   * @return assetSecuritizationServiceSchedule
  **/

  public String getAssetSecuritizationServiceSchedule() {
    return assetSecuritizationServiceSchedule;
  }

  public void setAssetSecuritizationServiceSchedule(String assetSecuritizationServiceSchedule) {
    this.assetSecuritizationServiceSchedule = assetSecuritizationServiceSchedule;
  }


}

