package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveOutputModel
 */
public class SDAssetSecuritizationRetrieveOutputModel   {
  private String assetSecuritizationRetrieveActionTaskReference = null;

  private Object assetSecuritizationRetrieveActionTaskRecord = null;

  private String assetSecuritizationRetrieveActionResponse = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord assetSecuritizationRetrieveActionRecord = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService assetSecuritizationOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return assetSecuritizationRetrieveActionTaskReference
  **/

  public String getAssetSecuritizationRetrieveActionTaskReference() {
    return assetSecuritizationRetrieveActionTaskReference;
  }

  public void setAssetSecuritizationRetrieveActionTaskReference(String assetSecuritizationRetrieveActionTaskReference) {
    this.assetSecuritizationRetrieveActionTaskReference = assetSecuritizationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return assetSecuritizationRetrieveActionResponse
  **/

  public String getAssetSecuritizationRetrieveActionResponse() {
    return assetSecuritizationRetrieveActionResponse;
  }

  public void setAssetSecuritizationRetrieveActionResponse(String assetSecuritizationRetrieveActionResponse) {
    this.assetSecuritizationRetrieveActionResponse = assetSecuritizationRetrieveActionResponse;
  }


  /**
   * Get assetSecuritizationRetrieveActionRecord
   * @return assetSecuritizationRetrieveActionRecord
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord getAssetSecuritizationRetrieveActionRecord() {
    return assetSecuritizationRetrieveActionRecord;
  }

  public void setAssetSecuritizationRetrieveActionRecord(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord assetSecuritizationRetrieveActionRecord) {
    this.assetSecuritizationRetrieveActionRecord = assetSecuritizationRetrieveActionRecord;
  }


  /**
   * Get assetSecuritizationOfferedService
   * @return assetSecuritizationOfferedService
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService getAssetSecuritizationOfferedService() {
    return assetSecuritizationOfferedService;
  }

  public void setAssetSecuritizationOfferedService(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationOfferedService assetSecuritizationOfferedService) {
    this.assetSecuritizationOfferedService = assetSecuritizationOfferedService;
  }


}

