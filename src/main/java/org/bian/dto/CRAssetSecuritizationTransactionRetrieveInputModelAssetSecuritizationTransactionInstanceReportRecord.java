package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord
 */
public class CRAssetSecuritizationTransactionRetrieveInputModelAssetSecuritizationTransactionInstanceReportRecord   {
  private String assetSecuritizationTransactionInstanceReportReference = null;

  private String assetSecuritizationTransactionInstanceReportType = null;

  private String assetSecuritizationTransactionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return assetSecuritizationTransactionInstanceReportReference
  **/

  public String getAssetSecuritizationTransactionInstanceReportReference() {
    return assetSecuritizationTransactionInstanceReportReference;
  }

  public void setAssetSecuritizationTransactionInstanceReportReference(String assetSecuritizationTransactionInstanceReportReference) {
    this.assetSecuritizationTransactionInstanceReportReference = assetSecuritizationTransactionInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return assetSecuritizationTransactionInstanceReportParameters
  **/

  public String getAssetSecuritizationTransactionInstanceReportParameters() {
    return assetSecuritizationTransactionInstanceReportParameters;
  }

  public void setAssetSecuritizationTransactionInstanceReportParameters(String assetSecuritizationTransactionInstanceReportParameters) {
    this.assetSecuritizationTransactionInstanceReportParameters = assetSecuritizationTransactionInstanceReportParameters;
  }


}

