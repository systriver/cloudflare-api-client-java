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
import io.swagger.client.model.ApiResponseSingle;
import io.swagger.client.model.MonitorComponentsschemasidResponseResult;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MonitorComponentsSchemasIdResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class MonitorComponentsSchemasIdResponse extends ApiResponseSingle {
  @SerializedName("result")
  private MonitorComponentsschemasidResponseResult monitorComponentsSchemasIdResponseResult = null;

  public MonitorComponentsSchemasIdResponse monitorComponentsSchemasIdResponseResult(MonitorComponentsschemasidResponseResult monitorComponentsSchemasIdResponseResult) {
    this.monitorComponentsSchemasIdResponseResult = monitorComponentsSchemasIdResponseResult;
    return this;
  }

   /**
   * Get monitorComponentsSchemasIdResponseResult
   * @return monitorComponentsSchemasIdResponseResult
  **/
  @Schema(description = "")
  public MonitorComponentsschemasidResponseResult getMonitorComponentsSchemasIdResponseResult() {
    return monitorComponentsSchemasIdResponseResult;
  }

  public void setMonitorComponentsSchemasIdResponseResult(MonitorComponentsschemasidResponseResult monitorComponentsSchemasIdResponseResult) {
    this.monitorComponentsSchemasIdResponseResult = monitorComponentsSchemasIdResponseResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorComponentsSchemasIdResponse monitorComponentsSchemasIdResponse = (MonitorComponentsSchemasIdResponse) o;
    return Objects.equals(this.monitorComponentsSchemasIdResponseResult, monitorComponentsSchemasIdResponse.monitorComponentsSchemasIdResponseResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorComponentsSchemasIdResponseResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorComponentsSchemasIdResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    monitorComponentsSchemasIdResponseResult: ").append(toIndentedString(monitorComponentsSchemasIdResponseResult)).append("\n");
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
