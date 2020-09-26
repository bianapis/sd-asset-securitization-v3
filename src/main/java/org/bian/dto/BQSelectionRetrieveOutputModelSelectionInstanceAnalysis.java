package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSelectionRetrieveOutputModelSelectionInstanceAnalysis
 */
public class BQSelectionRetrieveOutputModelSelectionInstanceAnalysis   {
  private Object selectionInstanceAnalysisRecord = null;

  private String selectionInstanceAnalysisReportType = null;

  private String selectionInstanceAnalysisParameters = null;

  private Object selectionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return selectionInstanceAnalysisRecord
  **/

  public Object getSelectionInstanceAnalysisRecord() {
    return selectionInstanceAnalysisRecord;
  }

  public void setSelectionInstanceAnalysisRecord(Object selectionInstanceAnalysisRecord) {
    this.selectionInstanceAnalysisRecord = selectionInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return selectionInstanceAnalysisReportType
  **/

  public String getSelectionInstanceAnalysisReportType() {
    return selectionInstanceAnalysisReportType;
  }

  public void setSelectionInstanceAnalysisReportType(String selectionInstanceAnalysisReportType) {
    this.selectionInstanceAnalysisReportType = selectionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return selectionInstanceAnalysisParameters
  **/

  public String getSelectionInstanceAnalysisParameters() {
    return selectionInstanceAnalysisParameters;
  }

  public void setSelectionInstanceAnalysisParameters(String selectionInstanceAnalysisParameters) {
    this.selectionInstanceAnalysisParameters = selectionInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return selectionInstanceAnalysisReport
  **/

  public Object getSelectionInstanceAnalysisReport() {
    return selectionInstanceAnalysisReport;
  }

  public void setSelectionInstanceAnalysisReport(Object selectionInstanceAnalysisReport) {
    this.selectionInstanceAnalysisReport = selectionInstanceAnalysisReport;
  }


}

