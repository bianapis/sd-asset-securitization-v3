package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveInputModel
 */
public class SDAssetSecuritizationRetrieveInputModel   {
  private Object assetSecuritizationRetrieveActionTaskRecord = null;

  private String assetSecuritizationRetrieveActionRequest = null;

  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord assetSecuritizationRetrieveActionRecord = null;

  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService assetSecuritizationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assetSecuritizationRetrieveActionTaskRecord
  **/

  public Object getAssetSecuritizationRetrieveActionTaskRecord() {
    return assetSecuritizationRetrieveActionTaskRecord;
  }

  public void setAssetSecuritizationRetrieveActionTaskRecord(Object assetSecuritizationRetrieveActionTaskRecord) {
    this.assetSecuritizationRetrieveActionTaskRecord = assetSecuritizationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assetSecuritizationRetrieveActionRequest
  **/

  public String getAssetSecuritizationRetrieveActionRequest() {
    return assetSecuritizationRetrieveActionRequest;
  }

  public void setAssetSecuritizationRetrieveActionRequest(String assetSecuritizationRetrieveActionRequest) {
    this.assetSecuritizationRetrieveActionRequest = assetSecuritizationRetrieveActionRequest;
  }


  /**
   * Get assetSecuritizationRetrieveActionRecord
   * @return assetSecuritizationRetrieveActionRecord
  **/

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord getAssetSecuritizationRetrieveActionRecord() {
    return assetSecuritizationRetrieveActionRecord;
  }

  public void setAssetSecuritizationRetrieveActionRecord(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord assetSecuritizationRetrieveActionRecord) {
    this.assetSecuritizationRetrieveActionRecord = assetSecuritizationRetrieveActionRecord;
  }


  /**
   * Get assetSecuritizationOfferedService
   * @return assetSecuritizationOfferedService
  **/

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService getAssetSecuritizationOfferedService() {
    return assetSecuritizationOfferedService;
  }

  public void setAssetSecuritizationOfferedService(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationOfferedService assetSecuritizationOfferedService) {
    this.assetSecuritizationOfferedService = assetSecuritizationOfferedService;
  }


}

