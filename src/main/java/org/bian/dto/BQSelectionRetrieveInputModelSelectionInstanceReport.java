package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSelectionRetrieveInputModelSelectionInstanceReport
 */
public class BQSelectionRetrieveInputModelSelectionInstanceReport   {
  private String selectionInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return selectionInstanceReportReference
  **/

  public String getSelectionInstanceReportReference() {
    return selectionInstanceReportReference;
  }

  public void setSelectionInstanceReportReference(String selectionInstanceReportReference) {
    this.selectionInstanceReportReference = selectionInstanceReportReference;
  }


}

