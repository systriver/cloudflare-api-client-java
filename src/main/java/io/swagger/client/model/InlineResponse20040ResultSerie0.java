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
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse20040ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20040ResultSerie0 {
  @SerializedName("NOT_SUPPORTED")
  private List<String> NOT_SUPPORTED = new ArrayList<String>();

  @SerializedName("SUPPORTED")
  private List<String> SUPPORTED = new ArrayList<String>();

  public InlineResponse20040ResultSerie0 NOT_SUPPORTED(List<String> NOT_SUPPORTED) {
    this.NOT_SUPPORTED = NOT_SUPPORTED;
    return this;
  }

  public InlineResponse20040ResultSerie0 addNOTSUPPORTEDItem(String NOT_SUPPORTEDItem) {
    this.NOT_SUPPORTED.add(NOT_SUPPORTEDItem);
    return this;
  }

   /**
   * Get NOT_SUPPORTED
   * @return NOT_SUPPORTED
  **/
  @Schema(required = true, description = "")
  public List<String> getNOTSUPPORTED() {
    return NOT_SUPPORTED;
  }

  public void setNOTSUPPORTED(List<String> NOT_SUPPORTED) {
    this.NOT_SUPPORTED = NOT_SUPPORTED;
  }

  public InlineResponse20040ResultSerie0 SUPPORTED(List<String> SUPPORTED) {
    this.SUPPORTED = SUPPORTED;
    return this;
  }

  public InlineResponse20040ResultSerie0 addSUPPORTEDItem(String SUPPORTEDItem) {
    this.SUPPORTED.add(SUPPORTEDItem);
    return this;
  }

   /**
   * Get SUPPORTED
   * @return SUPPORTED
  **/
  @Schema(required = true, description = "")
  public List<String> getSUPPORTED() {
    return SUPPORTED;
  }

  public void setSUPPORTED(List<String> SUPPORTED) {
    this.SUPPORTED = SUPPORTED;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20040ResultSerie0 inlineResponse20040ResultSerie0 = (InlineResponse20040ResultSerie0) o;
    return Objects.equals(this.NOT_SUPPORTED, inlineResponse20040ResultSerie0.NOT_SUPPORTED) &&
        Objects.equals(this.SUPPORTED, inlineResponse20040ResultSerie0.SUPPORTED);
  }

  @Override
  public int hashCode() {
    return Objects.hash(NOT_SUPPORTED, SUPPORTED);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20040ResultSerie0 {\n");
    
    sb.append("    NOT_SUPPORTED: ").append(toIndentedString(NOT_SUPPORTED)).append("\n");
    sb.append("    SUPPORTED: ").append(toIndentedString(SUPPORTED)).append("\n");
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
