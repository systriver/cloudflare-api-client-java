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
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.client.model.PcapsSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx126
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx126 extends PcapsSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx126Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx126Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx126Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx126Success = null;

  public InlineResponse4xx126 inlineResponse4xx126Errors(Object inlineResponse4xx126Errors) {
    this.inlineResponse4xx126Errors = inlineResponse4xx126Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx126Errors
   * @return inlineResponse4xx126Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx126Errors() {
    return inlineResponse4xx126Errors;
  }

  public void setInlineResponse4xx126Errors(Object inlineResponse4xx126Errors) {
    this.inlineResponse4xx126Errors = inlineResponse4xx126Errors;
  }

  public InlineResponse4xx126 inlineResponse4xx126Messages(Object inlineResponse4xx126Messages) {
    this.inlineResponse4xx126Messages = inlineResponse4xx126Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx126Messages
   * @return inlineResponse4xx126Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx126Messages() {
    return inlineResponse4xx126Messages;
  }

  public void setInlineResponse4xx126Messages(Object inlineResponse4xx126Messages) {
    this.inlineResponse4xx126Messages = inlineResponse4xx126Messages;
  }

  public InlineResponse4xx126 inlineResponse4xx126Result(Object inlineResponse4xx126Result) {
    this.inlineResponse4xx126Result = inlineResponse4xx126Result;
    return this;
  }

   /**
   * Get inlineResponse4xx126Result
   * @return inlineResponse4xx126Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx126Result() {
    return inlineResponse4xx126Result;
  }

  public void setInlineResponse4xx126Result(Object inlineResponse4xx126Result) {
    this.inlineResponse4xx126Result = inlineResponse4xx126Result;
  }

  public InlineResponse4xx126 inlineResponse4xx126Success(Boolean inlineResponse4xx126Success) {
    this.inlineResponse4xx126Success = inlineResponse4xx126Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx126Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx126Success() {
    return inlineResponse4xx126Success;
  }

  public void setInlineResponse4xx126Success(Boolean inlineResponse4xx126Success) {
    this.inlineResponse4xx126Success = inlineResponse4xx126Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx126 inlineResponse4xx126 = (InlineResponse4xx126) o;
    return Objects.equals(this.inlineResponse4xx126Errors, inlineResponse4xx126.inlineResponse4xx126Errors) &&
        Objects.equals(this.inlineResponse4xx126Messages, inlineResponse4xx126.inlineResponse4xx126Messages) &&
        Objects.equals(this.inlineResponse4xx126Result, inlineResponse4xx126.inlineResponse4xx126Result) &&
        Objects.equals(this.inlineResponse4xx126Success, inlineResponse4xx126.inlineResponse4xx126Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx126Errors, inlineResponse4xx126Messages, inlineResponse4xx126Result, inlineResponse4xx126Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx126 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx126Errors: ").append(toIndentedString(inlineResponse4xx126Errors)).append("\n");
    sb.append("    inlineResponse4xx126Messages: ").append(toIndentedString(inlineResponse4xx126Messages)).append("\n");
    sb.append("    inlineResponse4xx126Result: ").append(toIndentedString(inlineResponse4xx126Result)).append("\n");
    sb.append("    inlineResponse4xx126Success: ").append(toIndentedString(inlineResponse4xx126Success)).append("\n");
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
