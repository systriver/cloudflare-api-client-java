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
/**
 * InlineResponse20078ResultSummary0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20078ResultSummary0 {
  @SerializedName("desktop")
  private String desktop = null;

  @SerializedName("mobile")
  private String mobile = null;

  @SerializedName("other")
  private String other = null;

  public InlineResponse20078ResultSummary0 desktop(String desktop) {
    this.desktop = desktop;
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @Schema(example = "65", required = true, description = "")
  public String getDesktop() {
    return desktop;
  }

  public void setDesktop(String desktop) {
    this.desktop = desktop;
  }

  public InlineResponse20078ResultSummary0 mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @Schema(example = "30", required = true, description = "")
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public InlineResponse20078ResultSummary0 other(String other) {
    this.other = other;
    return this;
  }

   /**
   * Get other
   * @return other
  **/
  @Schema(example = "5", required = true, description = "")
  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20078ResultSummary0 inlineResponse20078ResultSummary0 = (InlineResponse20078ResultSummary0) o;
    return Objects.equals(this.desktop, inlineResponse20078ResultSummary0.desktop) &&
        Objects.equals(this.mobile, inlineResponse20078ResultSummary0.mobile) &&
        Objects.equals(this.other, inlineResponse20078ResultSummary0.other);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, mobile, other);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20078ResultSummary0 {\n");
    
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    other: ").append(toIndentedString(other)).append("\n");
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