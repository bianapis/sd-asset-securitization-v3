package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis
 */
public class CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceAnalysis   {
  private String assetSecuritizationTransactionInstanceAnalysisReference = null;

  private String assetSecuritizationTransactionInstanceAnalysisReportType = null;

  private String assetSecuritizationTransactionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return assetSecuritizationTransactionInstanceAnalysisReference
  **/

  public String getAssetSecuritizationTransactionInstanceAnalysisReference() {
    return assetSecuritizationTransactionInstanceAnalysisReference;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysisReference(String assetSecuritizationTransactionInstanceAnalysisReference) {
    this.assetSecuritizationTransactionInstanceAnalysisReference = assetSecuritizationTransactionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return assetSecuritizationTransactionInstanceAnalysisParameters
  **/

  public String getAssetSecuritizationTransactionInstanceAnalysisParameters() {
    return assetSecuritizationTransactionInstanceAnalysisParameters;
  }

  public void setAssetSecuritizationTransactionInstanceAnalysisParameters(String assetSecuritizationTransactionInstanceAnalysisParameters) {
    this.assetSecuritizationTransactionInstanceAnalysisParameters = assetSecuritizationTransactionInstanceAnalysisParameters;
  }


}

