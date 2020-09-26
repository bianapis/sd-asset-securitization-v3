package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService
 */
public class SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService   {
  private String assetSecuritizationServiceReference = null;

  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord assetSecuritizationServiceRecord = null;


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

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord getAssetSecuritizationServiceRecord() {
    return assetSecuritizationServiceRecord;
  }

  public void setAssetSecuritizationServiceRecord(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedServiceAssetSecuritizationServiceRecord assetSecuritizationServiceRecord) {
    this.assetSecuritizationServiceRecord = assetSecuritizationServiceRecord;
  }


}

