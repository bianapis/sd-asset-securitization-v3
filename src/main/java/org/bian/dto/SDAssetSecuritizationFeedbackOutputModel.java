package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationFeedbackOutputModelAssetSecuritizationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationFeedbackOutputModel
 */
public class SDAssetSecuritizationFeedbackOutputModel   {
  private String assetSecuritizationFeedbackActionTaskReference = null;

  private Object assetSecuritizationFeedbackActionTaskRecord = null;

  private SDAssetSecuritizationFeedbackOutputModelAssetSecuritizationFeedbackActionRecord assetSecuritizationFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return assetSecuritizationFeedbackActionTaskReference
  **/

  public String getAssetSecuritizationFeedbackActionTaskReference() {
    return assetSecuritizationFeedbackActionTaskReference;
  }

  public void setAssetSecuritizationFeedbackActionTaskReference(String assetSecuritizationFeedbackActionTaskReference) {
    this.assetSecuritizationFeedbackActionTaskReference = assetSecuritizationFeedbackActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return assetSecuritizationFeedbackActionTaskRecord
  **/

  public Object getAssetSecuritizationFeedbackActionTaskRecord() {
    return assetSecuritizationFeedbackActionTaskRecord;
  }

  public void setAssetSecuritizationFeedbackActionTaskRecord(Object assetSecuritizationFeedbackActionTaskRecord) {
    this.assetSecuritizationFeedbackActionTaskRecord = assetSecuritizationFeedbackActionTaskRecord;
  }


  /**
   * Get assetSecuritizationFeedbackActionRecord
   * @return assetSecuritizationFeedbackActionRecord
  **/

  public SDAssetSecuritizationFeedbackOutputModelAssetSecuritizationFeedbackActionRecord getAssetSecuritizationFeedbackActionRecord() {
    return assetSecuritizationFeedbackActionRecord;
  }

  public void setAssetSecuritizationFeedbackActionRecord(SDAssetSecuritizationFeedbackOutputModelAssetSecuritizationFeedbackActionRecord assetSecuritizationFeedbackActionRecord) {
    this.assetSecuritizationFeedbackActionRecord = assetSecuritizationFeedbackActionRecord;
  }


}

