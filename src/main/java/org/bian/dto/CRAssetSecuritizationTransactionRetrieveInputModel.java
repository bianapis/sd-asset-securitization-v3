package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis;
import org.bian.dto.CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveInputModel
 */
public class CRAssetSecuritizationTransactionRetrieveInputModel   {
  private Object assetSecuritizationTransactionRetrieveActionTaskRecord = null;

  private String assetSecuritizationTransactionRetrieveActionRequest = null;

  private CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord assetSecuritizationTransactionInstanceReportRecord = null;

  private CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis assetSecuritizationTransactionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return assetSecuritizationTransactionRetrieveActionTaskRecord
  **/

  public Object getAssetSecuritizationTransactionRetrieveActionTaskRecord() {
    return assetSecuritizationTransactionRetrieveActionTaskRecord;
  }

  public void setAssetSecuritizationTransactionRetrieveActionTaskRecord(Object assetSecuritizationTransactionRetrieveActionTaskRecord) {
    this.assetSecuritizationTransactionRetrieveActionTaskRecord = assetSecuritizationTransactionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return assetSecuritizationTransactionRetrieveActionRequest
  **/

  public String getAssetSecuritizationTransactionRetrieveActionRequest() {
    return assetSecuritizationTransactionRetrieveActionRequest;
  }

  public void setAssetSecuritizationTransactionRetrieveActionRequest(String assetSecuritizationTransactionRetrieveActionRequest) {
    this.assetSecuritizationTransactionRetrieveActionRequest = assetSecuritizationTransactionRetrieveActionRequest;
  }


  /**
   * Get assetSecuritizationTransactionInstanceReportRecord
   * @return assetSecuritizationTransactionInstanceReportRecord
  **/

  public CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord getAssetSecuritizationTransactionInstanceReportRecord() {
    return assetSecuritizationTransactionInstanceReportRecord;
  }

  public void setAssetSecuritizationTransactionInstanceReportRecord(CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord assetSecuritizationTransactionInstanceReportRecord) {
    this.assetSecuritizationTransactionInstanceReportRecord = assetSecuritizationTransactionInstanceReportRecord;
  }


  /**
   * Get assetSecuritizationTransactionInstanceAnalysis
   * @return assetSecuritizationTransactionInstanceAnalysis
  **/

  public CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis getAssetSecuritizationTransactionInstanceAnalysis() {
    return assetSecuritizationTransactionInstanceAnalysis;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysis(CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis assetSecuritizationTransactionInstanceAnalysis) {
    this.assetSecuritizationTransactionInstanceAnalysis = assetSecuritizationTransactionInstanceAnalysis;
  }


}

