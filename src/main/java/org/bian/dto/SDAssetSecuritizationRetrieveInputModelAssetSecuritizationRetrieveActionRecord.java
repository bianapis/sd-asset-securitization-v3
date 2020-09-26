package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis;
import org.bian.dto.SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord
 */
public class SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecord   {
  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis assetSecuritizationActivityAnalysis = null;

  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis assetSecuritizationPerformanceAnalysis = null;

  private SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get assetSecuritizationActivityAnalysis
   * @return assetSecuritizationActivityAnalysis
  **/

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis getAssetSecuritizationActivityAnalysis() {
    return assetSecuritizationActivityAnalysis;
  }

  public void setAssetSecuritizationActivityAnalysis(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationActivityAnalysis assetSecuritizationActivityAnalysis) {
    this.assetSecuritizationActivityAnalysis = assetSecuritizationActivityAnalysis;
  }


  /**
   * Get assetSecuritizationPerformanceAnalysis
   * @return assetSecuritizationPerformanceAnalysis
  **/

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis getAssetSecuritizationPerformanceAnalysis() {
    return assetSecuritizationPerformanceAnalysis;
  }

  public void setAssetSecuritizationPerformanceAnalysis(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordAssetSecuritizationPerformanceAnalysis assetSecuritizationPerformanceAnalysis) {
    this.assetSecuritizationPerformanceAnalysis = assetSecuritizationPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDAssetSecuritizationRetrieveInputModelAssetSecuritizationRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

