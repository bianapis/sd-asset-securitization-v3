package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis;
import org.bian.dto.SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord
 */
public class SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecord   {
  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis assetSecuritizationActivityAnalysis = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis assetSecuritizationPerformanceAnalysis = null;

  private SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get assetSecuritizationActivityAnalysis
   * @return assetSecuritizationActivityAnalysis
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis getAssetSecuritizationActivityAnalysis() {
    return assetSecuritizationActivityAnalysis;
  }

  public void setAssetSecuritizationActivityAnalysis(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis assetSecuritizationActivityAnalysis) {
    this.assetSecuritizationActivityAnalysis = assetSecuritizationActivityAnalysis;
  }


  /**
   * Get assetSecuritizationPerformanceAnalysis
   * @return assetSecuritizationPerformanceAnalysis
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis getAssetSecuritizationPerformanceAnalysis() {
    return assetSecuritizationPerformanceAnalysis;
  }

  public void setAssetSecuritizationPerformanceAnalysis(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis assetSecuritizationPerformanceAnalysis) {
    this.assetSecuritizationPerformanceAnalysis = assetSecuritizationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDAssetSecuritizationRetrieveOutputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

