package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSelectionRetrieveOutputModelSelectionInstanceReport
 */
public class BQSelectionRetrieveOutputModelSelectionInstanceReport   {
  private Object selectionInstanceReportRecord = null;

  private String selectionInstanceReportType = null;

  private String selectionInstanceReportParameters = null;

  private Object selectionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return selectionInstanceReportRecord
  **/

  public Object getSelectionInstanceReportRecord() {
    return selectionInstanceReportRecord;
  }

  public void setSelectionInstanceReportRecord(Object selectionInstanceReportRecord) {
    this.selectionInstanceReportRecord = selectionInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return selectionInstanceReportType
  **/

  public String getSelectionInstanceReportType() {
    return selectionInstanceReportType;
  }

  public void setSelectionInstanceReportType(String selectionInstanceReportType) {
    this.selectionInstanceReportType = selectionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return selectionInstanceReportParameters
  **/

  public String getSelectionInstanceReportParameters() {
    return selectionInstanceReportParameters;
  }

  public void setSelectionInstanceReportParameters(String selectionInstanceReportParameters) {
    this.selectionInstanceReportParameters = selectionInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return selectionInstanceReport
  **/

  public Object getSelectionInstanceReport() {
    return selectionInstanceReport;
  }

  public void setSelectionInstanceReport(Object selectionInstanceReport) {
    this.selectionInstanceReport = selectionInstanceReport;
  }


}

