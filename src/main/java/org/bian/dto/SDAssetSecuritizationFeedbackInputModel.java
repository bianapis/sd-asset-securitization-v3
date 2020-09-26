package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationFeedbackInputModelAssetSecuritizationFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationFeedbackInputModel
 */
public class SDAssetSecuritizationFeedbackInputModel   {
  private Object assetSecuritizationFeedbackActionTaskRecord = null;

  private SDAssetSecuritizationFeedbackInputModelAssetSecuritizationFeedbackActionRecord assetSecuritizationFeedbackActionRecord = null;


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

  public SDAssetSecuritizationFeedbackInputModelAssetSecuritizationFeedbackActionRecord getAssetSecuritizationFeedbackActionRecord() {
    return assetSecuritizationFeedbackActionRecord;
  }

  public void setAssetSecuritizationFeedbackActionRecord(SDAssetSecuritizationFeedbackInputModelAssetSecuritizationFeedbackActionRecord assetSecuritizationFeedbackActionRecord) {
    this.assetSecuritizationFeedbackActionRecord = assetSecuritizationFeedbackActionRecord;
  }


}

