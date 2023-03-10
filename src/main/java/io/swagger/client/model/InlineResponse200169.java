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
import io.swagger.client.model.Websockets;
import io.swagger.client.model.ZoneSettingsResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200169
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse200169 extends ZoneSettingsResponseSingle {
  @SerializedName("result")
  private Websockets inlineResponse200169Result = null;

  public InlineResponse200169 inlineResponse200169Result(Websockets inlineResponse200169Result) {
    this.inlineResponse200169Result = inlineResponse200169Result;
    return this;
  }

   /**
   * Get inlineResponse200169Result
   * @return inlineResponse200169Result
  **/
  @Schema(description = "")
  public Websockets getInlineResponse200169Result() {
    return inlineResponse200169Result;
  }

  public void setInlineResponse200169Result(Websockets inlineResponse200169Result) {
    this.inlineResponse200169Result = inlineResponse200169Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200169 inlineResponse200169 = (InlineResponse200169) o;
    return Objects.equals(this.inlineResponse200169Result, inlineResponse200169.inlineResponse200169Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200169Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200169 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200169Result: ").append(toIndentedString(inlineResponse200169Result)).append("\n");
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
