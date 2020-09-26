package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord
 */
public class CRAssetSecuritizationTransactionRetrieveOutputModelAssetSecuritizationTransactionInstanceReportRecord   {
  private String assetSecuritizationTransactionInstanceReportData = null;

  private String assetSecuritizationTransactionInstanceReportType = null;

  private Object assetSecuritizationTransactionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return assetSecuritizationTransactionInstanceReportData
  **/

  public String getAssetSecuritizationTransactionInstanceReportData() {
    return assetSecuritizationTransactionInstanceReportData;
  }

  public void setAssetSecuritizationTransactionInstanceReportData(String assetSecuritizationTransactionInstanceReportData) {
    this.assetSecuritizationTransactionInstanceReportData = assetSecuritizationTransactionInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return assetSecuritizationTransactionInstanceReportType
  **/

  public String getAssetSecuritizationTransactionInstanceReportType() {
    return assetSecuritizationTransactionInstanceReportType;
  }

  public void setAssetSecuritizationTransactionInstanceReportType(String assetSecuritizationTransactionInstanceReportType) {
    this.assetSecuritizationTransactionInstanceReportType = assetSecuritizationTransactionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return assetSecuritizationTransactionInstanceReport
  **/

  public Object getAssetSecuritizationTransactionInstanceReport() {
    return assetSecuritizationTransactionInstanceReport;
  }

  public void setAssetSecuritizationTransactionInstanceReport(Object assetSecuritizationTransactionInstanceReport) {
    this.assetSecuritizationTransactionInstanceReport = assetSecuritizationTransactionInstanceReport;
  }


}

