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
 * InlineResponse20096ResultSerie0
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse20096ResultSerie0 {
  @SerializedName("&lt;domain name&gt;")
  private List<Integer> domainName = new ArrayList<Integer>();

  @SerializedName("timestamps")
  private List<String> timestamps = new ArrayList<String>();

  public InlineResponse20096ResultSerie0 domainName(List<Integer> domainName) {
    this.domainName = domainName;
    return this;
  }

  public InlineResponse20096ResultSerie0 addDomainNameItem(Integer domainNameItem) {
    this.domainName.add(domainNameItem);
    return this;
  }

   /**
   * Get domainName
   * @return domainName
  **/
  @Schema(required = true, description = "")
  public List<Integer> getDomainName() {
    return domainName;
  }

  public void setDomainName(List<Integer> domainName) {
    this.domainName = domainName;
  }

  public InlineResponse20096ResultSerie0 timestamps(List<String> timestamps) {
    this.timestamps = timestamps;
    return this;
  }

  public InlineResponse20096ResultSerie0 addTimestampsItem(String timestampsItem) {
    this.timestamps.add(timestampsItem);
    return this;
  }

   /**
   * Get timestamps
   * @return timestamps
  **/
  @Schema(required = true, description = "")
  public List<String> getTimestamps() {
    return timestamps;
  }

  public void setTimestamps(List<String> timestamps) {
    this.timestamps = timestamps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20096ResultSerie0 inlineResponse20096ResultSerie0 = (InlineResponse20096ResultSerie0) o;
    return Objects.equals(this.domainName, inlineResponse20096ResultSerie0.domainName) &&
        Objects.equals(this.timestamps, inlineResponse20096ResultSerie0.timestamps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domainName, timestamps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20096ResultSerie0 {\n");
    
    sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
    sb.append("    timestamps: ").append(toIndentedString(timestamps)).append("\n");
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
