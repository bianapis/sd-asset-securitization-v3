package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService
 */
public class SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService   {
  private String assetSecuritizationServiceReference = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord assetSecuritizationServiceRecord = null;


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
   * Get assetSecuritizationServiceRecord
   * @return assetSecuritizationServiceRecord
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord getAssetSecuritizationServiceRecord() {
    return assetSecuritizationServiceRecord;
  }

  public void setAssetSecuritizationServiceRecord(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord assetSecuritizationServiceRecord) {
    this.assetSecuritizationServiceRecord = assetSecuritizationServiceRecord;
  }


}

