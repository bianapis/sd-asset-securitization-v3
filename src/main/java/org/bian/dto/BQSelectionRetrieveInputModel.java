package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSelectionRetrieveInputModelSelectionInstanceAnalysis;
import org.bian.dto.BQSelectionRetrieveInputModelSelectionInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSelectionRetrieveInputModel
 */
public class BQSelectionRetrieveInputModel   {
  private Object selectionRetrieveActionTaskRecord = null;

  private String selectionRetrieveActionRequest = null;

  private BQSelectionRetrieveInputModelSelectionInstanceReport selectionInstanceReport = null;

  private BQSelectionRetrieveInputModelSelectionInstanceAnalysis selectionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return selectionRetrieveActionTaskRecord
  **/

  public Object getSelectionRetrieveActionTaskRecord() {
    return selectionRetrieveActionTaskRecord;
  }

  public void setSelectionRetrieveActionTaskRecord(Object selectionRetrieveActionTaskRecord) {
    this.selectionRetrieveActionTaskRecord = selectionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return selectionRetrieveActionRequest
  **/

  public String getSelectionRetrieveActionRequest() {
    return selectionRetrieveActionRequest;
  }

  public void setSelectionRetrieveActionRequest(String selectionRetrieveActionRequest) {
    this.selectionRetrieveActionRequest = selectionRetrieveActionRequest;
  }


  /**
   * Get selectionInstanceReport
   * @return selectionInstanceReport
  **/

  public BQSelectionRetrieveInputModelSelectionInstanceReport getSelectionInstanceReport() {
    return selectionInstanceReport;
  }

  public void setSelectionInstanceReport(BQSelectionRetrieveInputModelSelectionInstanceReport selectionInstanceReport) {
    this.selectionInstanceReport = selectionInstanceReport;
  }


  /**
   * Get selectionInstanceAnalysis
   * @return selectionInstanceAnalysis
  **/

  public BQSelectionRetrieveInputModelSelectionInstanceAnalysis getSelectionInstanceAnalysis() {
    return selectionInstanceAnalysis;
  }

  public void setSelectionInstanceAnalysis(BQSelectionRetrieveInputModelSelectionInstanceAnalysis selectionInstanceAnalysis) {
    this.selectionInstanceAnalysis = selectionInstanceAnalysis;
  }


}

