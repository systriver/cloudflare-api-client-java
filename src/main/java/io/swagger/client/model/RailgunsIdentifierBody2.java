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
 * RailgunsIdentifierBody2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class RailgunsIdentifierBody2 {
  @SerializedName("connected")
  private Boolean connected = null;

  public RailgunsIdentifierBody2 connected(Boolean connected) {
    this.connected = connected;
    return this;
  }

   /**
   * Get connected
   * @return connected
  **/
  @Schema(required = true, description = "")
  public Boolean getConnected() {
    return connected;
  }

  public void setConnected(Boolean connected) {
    this.connected = connected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RailgunsIdentifierBody2 railgunsIdentifierBody2 = (RailgunsIdentifierBody2) o;
    return Objects.equals(this.connected, railgunsIdentifierBody2.connected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connected);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RailgunsIdentifierBody2 {\n");
    
    sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
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
