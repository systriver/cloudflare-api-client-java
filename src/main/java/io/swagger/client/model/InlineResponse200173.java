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
import io.swagger.client.model.RuleResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse200173
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse200173 extends RuleResponseSingle {
  @SerializedName("result")
  private Object inlineResponse200173Result = null;

  public InlineResponse200173 inlineResponse200173Result(Object inlineResponse200173Result) {
    this.inlineResponse200173Result = inlineResponse200173Result;
    return this;
  }

   /**
   * Get inlineResponse200173Result
   * @return inlineResponse200173Result
  **/
  @Schema(description = "")
  public Object getInlineResponse200173Result() {
    return inlineResponse200173Result;
  }

  public void setInlineResponse200173Result(Object inlineResponse200173Result) {
    this.inlineResponse200173Result = inlineResponse200173Result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200173 inlineResponse200173 = (InlineResponse200173) o;
    return Objects.equals(this.inlineResponse200173Result, inlineResponse200173.inlineResponse200173Result) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse200173Result, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200173 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse200173Result: ").append(toIndentedString(inlineResponse200173Result)).append("\n");
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