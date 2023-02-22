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
import io.swagger.client.model.ImageResizing;
import io.swagger.client.model.ZoneSettingsResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200138
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse200138 extends ZoneSettingsResponseSingle {
  @SerializedName("result")
  private ImageResizing inlineResponse200138Result = null;

  public InlineResponse200138 inlineResponse200138Result(ImageResizing inlineResponse200138Result) {
    this.inlineResponse200138Result = inlineResponse200138Result;
    return this;
  }

   /**
   * Get inlineResponse200138Result
   * @return inlineResponse200138Result
  **/
  @Schema(description = "")
  public ImageResizing getInlineResponse200138Result() {
    return inlineResponse200138Result;
  }

  public void setInlineResponse200138Result(ImageResizing inlineResponse200138Result) {
    this.inlineResponse200138Result = inlineResponse200138Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200138 inlineResponse200138 = (InlineResponse200138) o;
    return Objects.equals(this.inlineResponse200138Result, inlineResponse200138.inlineResponse200138Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200138Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200138 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200138Result: ").append(toIndentedString(inlineResponse200138Result)).append("\n");
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