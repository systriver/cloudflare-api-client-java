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
import io.swagger.client.model.SchemasQuery;
import io.swagger.client.model.SchemasResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * ComponentsSchemasResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasResult extends SchemasResult {
  @SerializedName("data")
  private Object componentsSchemasResultData = null;

  @SerializedName("max")
  private Object componentsSchemasResultMax = null;

  @SerializedName("min")
  private Object componentsSchemasResultMin = null;

  @SerializedName("query")
  private SchemasQuery componentsSchemasResultQuery = null;

  @SerializedName("totals")
  private Object componentsSchemasResultTotals = null;

  public ComponentsSchemasResult componentsSchemasResultData(Object componentsSchemasResultData) {
    this.componentsSchemasResultData = componentsSchemasResultData;
    return this;
  }

   /**
   * Get componentsSchemasResultData
   * @return componentsSchemasResultData
  **/
  @Schema(example = "[{\"metrics\":[[2,4],[16,32]]}]", description = "")
  public Object getComponentsSchemasResultData() {
    return componentsSchemasResultData;
  }

  public void setComponentsSchemasResultData(Object componentsSchemasResultData) {
    this.componentsSchemasResultData = componentsSchemasResultData;
  }

  public ComponentsSchemasResult componentsSchemasResultMax(Object componentsSchemasResultMax) {
    this.componentsSchemasResultMax = componentsSchemasResultMax;
    return this;
  }

   /**
   * Get componentsSchemasResultMax
   * @return componentsSchemasResultMax
  **/
  @Schema(example = "{\"readKiB\":32,\"requests\":4}", description = "")
  public Object getComponentsSchemasResultMax() {
    return componentsSchemasResultMax;
  }

  public void setComponentsSchemasResultMax(Object componentsSchemasResultMax) {
    this.componentsSchemasResultMax = componentsSchemasResultMax;
  }

  public ComponentsSchemasResult componentsSchemasResultMin(Object componentsSchemasResultMin) {
    this.componentsSchemasResultMin = componentsSchemasResultMin;
    return this;
  }

   /**
   * Get componentsSchemasResultMin
   * @return componentsSchemasResultMin
  **/
  @Schema(example = "{\"readKiB\":16,\"requests\":2}", description = "")
  public Object getComponentsSchemasResultMin() {
    return componentsSchemasResultMin;
  }

  public void setComponentsSchemasResultMin(Object componentsSchemasResultMin) {
    this.componentsSchemasResultMin = componentsSchemasResultMin;
  }

  public ComponentsSchemasResult componentsSchemasResultQuery(SchemasQuery componentsSchemasResultQuery) {
    this.componentsSchemasResultQuery = componentsSchemasResultQuery;
    return this;
  }

   /**
   * Get componentsSchemasResultQuery
   * @return componentsSchemasResultQuery
  **/
  @Schema(description = "")
  public SchemasQuery getComponentsSchemasResultQuery() {
    return componentsSchemasResultQuery;
  }

  public void setComponentsSchemasResultQuery(SchemasQuery componentsSchemasResultQuery) {
    this.componentsSchemasResultQuery = componentsSchemasResultQuery;
  }

  public ComponentsSchemasResult componentsSchemasResultTotals(Object componentsSchemasResultTotals) {
    this.componentsSchemasResultTotals = componentsSchemasResultTotals;
    return this;
  }

   /**
   * Get componentsSchemasResultTotals
   * @return componentsSchemasResultTotals
  **/
  @Schema(example = "{\"readKiB\":48,\"requests\":6}", description = "")
  public Object getComponentsSchemasResultTotals() {
    return componentsSchemasResultTotals;
  }

  public void setComponentsSchemasResultTotals(Object componentsSchemasResultTotals) {
    this.componentsSchemasResultTotals = componentsSchemasResultTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsSchemasResult componentsSchemasResult = (ComponentsSchemasResult) o;
    return Objects.equals(this.componentsSchemasResultData, componentsSchemasResult.componentsSchemasResultData) &&
        Objects.equals(this.componentsSchemasResultMax, componentsSchemasResult.componentsSchemasResultMax) &&
        Objects.equals(this.componentsSchemasResultMin, componentsSchemasResult.componentsSchemasResultMin) &&
        Objects.equals(this.componentsSchemasResultQuery, componentsSchemasResult.componentsSchemasResultQuery) &&
        Objects.equals(this.componentsSchemasResultTotals, componentsSchemasResult.componentsSchemasResultTotals) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsSchemasResultData, componentsSchemasResultMax, componentsSchemasResultMin, componentsSchemasResultQuery, componentsSchemasResultTotals, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    componentsSchemasResultData: ").append(toIndentedString(componentsSchemasResultData)).append("\n");
    sb.append("    componentsSchemasResultMax: ").append(toIndentedString(componentsSchemasResultMax)).append("\n");
    sb.append("    componentsSchemasResultMin: ").append(toIndentedString(componentsSchemasResultMin)).append("\n");
    sb.append("    componentsSchemasResultQuery: ").append(toIndentedString(componentsSchemasResultQuery)).append("\n");
    sb.append("    componentsSchemasResultTotals: ").append(toIndentedString(componentsSchemasResultTotals)).append("\n");
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
