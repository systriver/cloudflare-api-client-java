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
import io.swagger.client.model.OrangeToOrange;
import io.swagger.client.model.ZoneSettingsResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200148
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse200148 extends ZoneSettingsResponseSingle {
  @SerializedName("result")
  private OrangeToOrange inlineResponse200148Result = null;

  public InlineResponse200148 inlineResponse200148Result(OrangeToOrange inlineResponse200148Result) {
    this.inlineResponse200148Result = inlineResponse200148Result;
    return this;
  }

   /**
   * Get inlineResponse200148Result
   * @return inlineResponse200148Result
  **/
  @Schema(description = "")
  public OrangeToOrange getInlineResponse200148Result() {
    return inlineResponse200148Result;
  }

  public void setInlineResponse200148Result(OrangeToOrange inlineResponse200148Result) {
    this.inlineResponse200148Result = inlineResponse200148Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200148 inlineResponse200148 = (InlineResponse200148) o;
    return Objects.equals(this.inlineResponse200148Result, inlineResponse200148.inlineResponse200148Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200148Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200148 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200148Result: ").append(toIndentedString(inlineResponse200148Result)).append("\n");
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
