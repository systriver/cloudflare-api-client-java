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
import io.swagger.client.model.RulesetResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx197
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx197 extends RulesetResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx197Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx197Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx197Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx197Success = null;

  public InlineResponse4xx197 inlineResponse4xx197Errors(Object inlineResponse4xx197Errors) {
    this.inlineResponse4xx197Errors = inlineResponse4xx197Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx197Errors
   * @return inlineResponse4xx197Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx197Errors() {
    return inlineResponse4xx197Errors;
  }

  public void setInlineResponse4xx197Errors(Object inlineResponse4xx197Errors) {
    this.inlineResponse4xx197Errors = inlineResponse4xx197Errors;
  }

  public InlineResponse4xx197 inlineResponse4xx197Messages(Object inlineResponse4xx197Messages) {
    this.inlineResponse4xx197Messages = inlineResponse4xx197Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx197Messages
   * @return inlineResponse4xx197Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx197Messages() {
    return inlineResponse4xx197Messages;
  }

  public void setInlineResponse4xx197Messages(Object inlineResponse4xx197Messages) {
    this.inlineResponse4xx197Messages = inlineResponse4xx197Messages;
  }

  public InlineResponse4xx197 inlineResponse4xx197Result(Object inlineResponse4xx197Result) {
    this.inlineResponse4xx197Result = inlineResponse4xx197Result;
    return this;
  }

   /**
   * Get inlineResponse4xx197Result
   * @return inlineResponse4xx197Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx197Result() {
    return inlineResponse4xx197Result;
  }

  public void setInlineResponse4xx197Result(Object inlineResponse4xx197Result) {
    this.inlineResponse4xx197Result = inlineResponse4xx197Result;
  }

  public InlineResponse4xx197 inlineResponse4xx197Success(Boolean inlineResponse4xx197Success) {
    this.inlineResponse4xx197Success = inlineResponse4xx197Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx197Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx197Success() {
    return inlineResponse4xx197Success;
  }

  public void setInlineResponse4xx197Success(Boolean inlineResponse4xx197Success) {
    this.inlineResponse4xx197Success = inlineResponse4xx197Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx197 inlineResponse4xx197 = (InlineResponse4xx197) o;
    return Objects.equals(this.inlineResponse4xx197Errors, inlineResponse4xx197.inlineResponse4xx197Errors) &&
        Objects.equals(this.inlineResponse4xx197Messages, inlineResponse4xx197.inlineResponse4xx197Messages) &&
        Objects.equals(this.inlineResponse4xx197Result, inlineResponse4xx197.inlineResponse4xx197Result) &&
        Objects.equals(this.inlineResponse4xx197Success, inlineResponse4xx197.inlineResponse4xx197Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx197Errors, inlineResponse4xx197Messages, inlineResponse4xx197Result, inlineResponse4xx197Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx197 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx197Errors: ").append(toIndentedString(inlineResponse4xx197Errors)).append("\n");
    sb.append("    inlineResponse4xx197Messages: ").append(toIndentedString(inlineResponse4xx197Messages)).append("\n");
    sb.append("    inlineResponse4xx197Result: ").append(toIndentedString(inlineResponse4xx197Result)).append("\n");
    sb.append("    inlineResponse4xx197Success: ").append(toIndentedString(inlineResponse4xx197Success)).append("\n");
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
