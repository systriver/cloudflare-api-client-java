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
 * InlineResponse20082ResultSummary0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20082ResultSummary0 {
  @SerializedName("ANDROID")
  private String ANDROID = null;

  @SerializedName("IOS")
  private String IOS = null;

  public InlineResponse20082ResultSummary0 ANDROID(String ANDROID) {
    this.ANDROID = ANDROID;
    return this;
  }

   /**
   * Get ANDROID
   * @return ANDROID
  **/
  @Schema(example = "65", required = true, description = "")
  public String getANDROID() {
    return ANDROID;
  }

  public void setANDROID(String ANDROID) {
    this.ANDROID = ANDROID;
  }

  public InlineResponse20082ResultSummary0 IOS(String IOS) {
    this.IOS = IOS;
    return this;
  }

   /**
   * Get IOS
   * @return IOS
  **/
  @Schema(example = "35", required = true, description = "")
  public String getIOS() {
    return IOS;
  }

  public void setIOS(String IOS) {
    this.IOS = IOS;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20082ResultSummary0 inlineResponse20082ResultSummary0 = (InlineResponse20082ResultSummary0) o;
    return Objects.equals(this.ANDROID, inlineResponse20082ResultSummary0.ANDROID) &&
        Objects.equals(this.IOS, inlineResponse20082ResultSummary0.IOS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ANDROID, IOS);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20082ResultSummary0 {\n");
    
    sb.append("    ANDROID: ").append(toIndentedString(ANDROID)).append("\n");
    sb.append("    IOS: ").append(toIndentedString(IOS)).append("\n");
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
