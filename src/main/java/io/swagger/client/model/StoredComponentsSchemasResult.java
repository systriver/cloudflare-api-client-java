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
import io.swagger.client.model.ComponentsSchemasQuery;
import io.swagger.client.model.SchemasResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * StoredComponentsSchemasResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class StoredComponentsSchemasResult extends SchemasResult {
  @SerializedName("data")
  private Object storedComponentsSchemasResultData = null;

  @SerializedName("max")
  private Object storedComponentsSchemasResultMax = null;

  @SerializedName("min")
  private Object storedComponentsSchemasResultMin = null;

  @SerializedName("query")
  private ComponentsSchemasQuery storedComponentsSchemasResultQuery = null;

  @SerializedName("totals")
  private Object storedComponentsSchemasResultTotals = null;

  public StoredComponentsSchemasResult storedComponentsSchemasResultData(Object storedComponentsSchemasResultData) {
    this.storedComponentsSchemasResultData = storedComponentsSchemasResultData;
    return this;
  }

   /**
   * Get storedComponentsSchemasResultData
   * @return storedComponentsSchemasResultData
  **/
  @Schema(example = "[{\"metrics\":[[2,4],[16,32]]}]", description = "")
  public Object getStoredComponentsSchemasResultData() {
    return storedComponentsSchemasResultData;
  }

  public void setStoredComponentsSchemasResultData(Object storedComponentsSchemasResultData) {
    this.storedComponentsSchemasResultData = storedComponentsSchemasResultData;
  }

  public StoredComponentsSchemasResult storedComponentsSchemasResultMax(Object storedComponentsSchemasResultMax) {
    this.storedComponentsSchemasResultMax = storedComponentsSchemasResultMax;
    return this;
  }

   /**
   * Get storedComponentsSchemasResultMax
   * @return storedComponentsSchemasResultMax
  **/
  @Schema(example = "{\"storedBytes\":32,\"storedKeys\":4}", description = "")
  public Object getStoredComponentsSchemasResultMax() {
    return storedComponentsSchemasResultMax;
  }

  public void setStoredComponentsSchemasResultMax(Object storedComponentsSchemasResultMax) {
    this.storedComponentsSchemasResultMax = storedComponentsSchemasResultMax;
  }

  public StoredComponentsSchemasResult storedComponentsSchemasResultMin(Object storedComponentsSchemasResultMin) {
    this.storedComponentsSchemasResultMin = storedComponentsSchemasResultMin;
    return this;
  }

   /**
   * Get storedComponentsSchemasResultMin
   * @return storedComponentsSchemasResultMin
  **/
  @Schema(example = "{\"storedBytes\":16,\"storedKeys\":2}", description = "")
  public Object getStoredComponentsSchemasResultMin() {
    return storedComponentsSchemasResultMin;
  }

  public void setStoredComponentsSchemasResultMin(Object storedComponentsSchemasResultMin) {
    this.storedComponentsSchemasResultMin = storedComponentsSchemasResultMin;
  }

  public StoredComponentsSchemasResult storedComponentsSchemasResultQuery(ComponentsSchemasQuery storedComponentsSchemasResultQuery) {
    this.storedComponentsSchemasResultQuery = storedComponentsSchemasResultQuery;
    return this;
  }

   /**
   * Get storedComponentsSchemasResultQuery
   * @return storedComponentsSchemasResultQuery
  **/
  @Schema(description = "")
  public ComponentsSchemasQuery getStoredComponentsSchemasResultQuery() {
    return storedComponentsSchemasResultQuery;
  }

  public void setStoredComponentsSchemasResultQuery(ComponentsSchemasQuery storedComponentsSchemasResultQuery) {
    this.storedComponentsSchemasResultQuery = storedComponentsSchemasResultQuery;
  }

  public StoredComponentsSchemasResult storedComponentsSchemasResultTotals(Object storedComponentsSchemasResultTotals) {
    this.storedComponentsSchemasResultTotals = storedComponentsSchemasResultTotals;
    return this;
  }

   /**
   * Get storedComponentsSchemasResultTotals
   * @return storedComponentsSchemasResultTotals
  **/
  @Schema(example = "{\"storedBytes\":48,\"storedKeys\":6}", description = "")
  public Object getStoredComponentsSchemasResultTotals() {
    return storedComponentsSchemasResultTotals;
  }

  public void setStoredComponentsSchemasResultTotals(Object storedComponentsSchemasResultTotals) {
    this.storedComponentsSchemasResultTotals = storedComponentsSchemasResultTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoredComponentsSchemasResult storedComponentsSchemasResult = (StoredComponentsSchemasResult) o;
    return Objects.equals(this.storedComponentsSchemasResultData, storedComponentsSchemasResult.storedComponentsSchemasResultData) &&
        Objects.equals(this.storedComponentsSchemasResultMax, storedComponentsSchemasResult.storedComponentsSchemasResultMax) &&
        Objects.equals(this.storedComponentsSchemasResultMin, storedComponentsSchemasResult.storedComponentsSchemasResultMin) &&
        Objects.equals(this.storedComponentsSchemasResultQuery, storedComponentsSchemasResult.storedComponentsSchemasResultQuery) &&
        Objects.equals(this.storedComponentsSchemasResultTotals, storedComponentsSchemasResult.storedComponentsSchemasResultTotals) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storedComponentsSchemasResultData, storedComponentsSchemasResultMax, storedComponentsSchemasResultMin, storedComponentsSchemasResultQuery, storedComponentsSchemasResultTotals, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoredComponentsSchemasResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    storedComponentsSchemasResultData: ").append(toIndentedString(storedComponentsSchemasResultData)).append("\n");
    sb.append("    storedComponentsSchemasResultMax: ").append(toIndentedString(storedComponentsSchemasResultMax)).append("\n");
    sb.append("    storedComponentsSchemasResultMin: ").append(toIndentedString(storedComponentsSchemasResultMin)).append("\n");
    sb.append("    storedComponentsSchemasResultQuery: ").append(toIndentedString(storedComponentsSchemasResultQuery)).append("\n");
    sb.append("    storedComponentsSchemasResultTotals: ").append(toIndentedString(storedComponentsSchemasResultTotals)).append("\n");
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
