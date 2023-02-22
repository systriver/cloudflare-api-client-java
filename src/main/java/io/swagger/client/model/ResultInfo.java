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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ResultInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ResultInfo {
  @SerializedName("count")
  private BigDecimal count = null;

  @SerializedName("page")
  private BigDecimal page = null;

  @SerializedName("per_page")
  private BigDecimal perPage = null;

  @SerializedName("total_count")
  private BigDecimal totalCount = null;

  public ResultInfo count(BigDecimal count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of results for the requested service
   * @return count
  **/
  @Schema(example = "1", description = "Total number of results for the requested service")
  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public ResultInfo page(BigDecimal page) {
    this.page = page;
    return this;
  }

   /**
   * Current page within paginated list of results
   * @return page
  **/
  @Schema(example = "1", description = "Current page within paginated list of results")
  public BigDecimal getPage() {
    return page;
  }

  public void setPage(BigDecimal page) {
    this.page = page;
  }

  public ResultInfo perPage(BigDecimal perPage) {
    this.perPage = perPage;
    return this;
  }

   /**
   * Number of results per page of results
   * @return perPage
  **/
  @Schema(example = "20", description = "Number of results per page of results")
  public BigDecimal getPerPage() {
    return perPage;
  }

  public void setPerPage(BigDecimal perPage) {
    this.perPage = perPage;
  }

  public ResultInfo totalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Total results available without any search parameters
   * @return totalCount
  **/
  @Schema(example = "2000", description = "Total results available without any search parameters")
  public BigDecimal getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(BigDecimal totalCount) {
    this.totalCount = totalCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResultInfo resultInfo = (ResultInfo) o;
    return Objects.equals(this.count, resultInfo.count) &&
        Objects.equals(this.page, resultInfo.page) &&
        Objects.equals(this.perPage, resultInfo.perPage) &&
        Objects.equals(this.totalCount, resultInfo.totalCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, page, perPage, totalCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResultInfo {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
