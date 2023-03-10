/*
 * Cloudflare API
 * Interact with Cloudflare's products and services via the Cloudflare API. For more information on how to create and troubleshoot API tokens, refer to our [API fundamentals](https://developers.cloudflare.com/fundamentals/api/).  Totally new to Cloudflare? [Start here](https://developers.cloudflare.com/fundamentals/get-started/).
 *
 * OpenAPI spec version: 4.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.ResultData;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * Result
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Result {
  @SerializedName("data")
  private List<ResultData> data = new ArrayList<ResultData>();

  @SerializedName("data_lag")
  private BigDecimal dataLag = null;

  @SerializedName("max")
  private Object max = null;

  @SerializedName("min")
  private Object min = null;

  @SerializedName("rows")
  private BigDecimal rows = null;

  @SerializedName("totals")
  private Object totals = null;

  public Result data(List<ResultData> data) {
    this.data = data;
    return this;
  }

  public Result addDataItem(ResultData dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<ResultData> getData() {
    return data;
  }

  public void setData(List<ResultData> data) {
    this.data = data;
  }

  public Result dataLag(BigDecimal dataLag) {
    this.dataLag = dataLag;
    return this;
  }

   /**
   * Number of seconds between current time and last processed event, in another words how many seconds of data could be missing.
   * minimum: 0
   * @return dataLag
  **/
  @Schema(example = "60", description = "Number of seconds between current time and last processed event, in another words how many seconds of data could be missing.")
  public BigDecimal getDataLag() {
    return dataLag;
  }

  public void setDataLag(BigDecimal dataLag) {
    this.dataLag = dataLag;
  }

  public Result max(Object max) {
    this.max = max;
    return this;
  }

   /**
   * Maximum results for each metric.
   * @return max
  **/
  @Schema(description = "Maximum results for each metric.")
  public Object getMax() {
    return max;
  }

  public void setMax(Object max) {
    this.max = max;
  }

  public Result min(Object min) {
    this.min = min;
    return this;
  }

   /**
   * Minimum results for each metric.
   * @return min
  **/
  @Schema(description = "Minimum results for each metric.")
  public Object getMin() {
    return min;
  }

  public void setMin(Object min) {
    this.min = min;
  }

  public Result rows(BigDecimal rows) {
    this.rows = rows;
    return this;
  }

   /**
   * Total number of rows in the result.
   * minimum: 0
   * @return rows
  **/
  @Schema(example = "100", required = true, description = "Total number of rows in the result.")
  public BigDecimal getRows() {
    return rows;
  }

  public void setRows(BigDecimal rows) {
    this.rows = rows;
  }

  public Result totals(Object totals) {
    this.totals = totals;
    return this;
  }

   /**
   * Total results for metrics across all data.
   * @return totals
  **/
  @Schema(required = true, description = "Total results for metrics across all data.")
  public Object getTotals() {
    return totals;
  }

  public void setTotals(Object totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Result result = (Result) o;
    return Objects.equals(this.data, result.data) &&
        Objects.equals(this.dataLag, result.dataLag) &&
        Objects.equals(this.max, result.max) &&
        Objects.equals(this.min, result.min) &&
        Objects.equals(this.rows, result.rows) &&
        Objects.equals(this.totals, result.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, dataLag, max, min, rows, totals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Result {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    dataLag: ").append(toIndentedString(dataLag)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
