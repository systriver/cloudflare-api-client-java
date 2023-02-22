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
 * InlineResponse20054ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class InlineResponse20054ResultSerie0 {
  @SerializedName("FAIL")
  private List<String> FAIL = new ArrayList<String>();

  @SerializedName("NONE")
  private List<String> NONE = new ArrayList<String>();

  @SerializedName("PASS")
  private List<String> PASS = new ArrayList<String>();

  public InlineResponse20054ResultSerie0 FAIL(List<String> FAIL) {
    this.FAIL = FAIL;
    return this;
  }

  public InlineResponse20054ResultSerie0 addFAILItem(String FAILItem) {
    this.FAIL.add(FAILItem);
    return this;
  }

   /**
   * Get FAIL
   * @return FAIL
  **/
  @Schema(required = true, description = "")
  public List<String> getFAIL() {
    return FAIL;
  }

  public void setFAIL(List<String> FAIL) {
    this.FAIL = FAIL;
  }

  public InlineResponse20054ResultSerie0 NONE(List<String> NONE) {
    this.NONE = NONE;
    return this;
  }

  public InlineResponse20054ResultSerie0 addNONEItem(String NONEItem) {
    this.NONE.add(NONEItem);
    return this;
  }

   /**
   * Get NONE
   * @return NONE
  **/
  @Schema(required = true, description = "")
  public List<String> getNONE() {
    return NONE;
  }

  public void setNONE(List<String> NONE) {
    this.NONE = NONE;
  }

  public InlineResponse20054ResultSerie0 PASS(List<String> PASS) {
    this.PASS = PASS;
    return this;
  }

  public InlineResponse20054ResultSerie0 addPASSItem(String PASSItem) {
    this.PASS.add(PASSItem);
    return this;
  }

   /**
   * Get PASS
   * @return PASS
  **/
  @Schema(required = true, description = "")
  public List<String> getPASS() {
    return PASS;
  }

  public void setPASS(List<String> PASS) {
    this.PASS = PASS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20054ResultSerie0 inlineResponse20054ResultSerie0 = (InlineResponse20054ResultSerie0) o;
    return Objects.equals(this.FAIL, inlineResponse20054ResultSerie0.FAIL) &&
        Objects.equals(this.NONE, inlineResponse20054ResultSerie0.NONE) &&
        Objects.equals(this.PASS, inlineResponse20054ResultSerie0.PASS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FAIL, NONE, PASS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20054ResultSerie0 {\n");
    
    sb.append("    FAIL: ").append(toIndentedString(FAIL)).append("\n");
    sb.append("    NONE: ").append(toIndentedString(NONE)).append("\n");
    sb.append("    PASS: ").append(toIndentedString(PASS)).append("\n");
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
