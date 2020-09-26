package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis
 */
public class CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceAnalysis   {
  private String assetSecuritizationTransactionInstanceAnalysisData = null;

  private String assetSecuritizationTransactionInstanceAnalysisReportType = null;

  private Object assetSecuritizationTransactionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return assetSecuritizationTransactionInstanceAnalysisData
  **/

  public String getAssetSecuritizationTransactionInstanceAnalysisData() {
    return assetSecuritizationTransactionInstanceAnalysisData;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysisData(String assetSecuritizationTransactionInstanceAnalysisData) {
    this.assetSecuritizationTransactionInstanceAnalysisData = assetSecuritizationTransactionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return assetSecuritizationTransactionInstanceAnalysisReportType
  **/

  public String getAssetSecuritizationTransactionInstanceAnalysisReportType() {
    return assetSecuritizationTransactionInstanceAnalysisReportType;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysisReportType(String assetSecuritizationTransactionInstanceAnalysisReportType) {
    this.assetSecuritizationTransactionInstanceAnalysisReportType = assetSecuritizationTransactionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return assetSecuritizationTransactionInstanceAnalysisReport
  **/

  public Object getAssetSecuritizationTransactionInstanceAnalysisReport() {
    return assetSecuritizationTransactionInstanceAnalysisReport;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysisReport(Object assetSecuritizationTransactionInstanceAnalysisReport) {
    this.assetSecuritizationTransactionInstanceAnalysisReport = assetSecuritizationTransactionInstanceAnalysisReport;
  }


}

