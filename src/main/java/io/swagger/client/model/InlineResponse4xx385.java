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
import io.swagger.client.model.RuleGroupResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx385
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx385 extends RuleGroupResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx385Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx385Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx385Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx385Success = null;

  public InlineResponse4xx385 inlineResponse4xx385Errors(Object inlineResponse4xx385Errors) {
    this.inlineResponse4xx385Errors = inlineResponse4xx385Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx385Errors
   * @return inlineResponse4xx385Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx385Errors() {
    return inlineResponse4xx385Errors;
  }

  public void setInlineResponse4xx385Errors(Object inlineResponse4xx385Errors) {
    this.inlineResponse4xx385Errors = inlineResponse4xx385Errors;
  }

  public InlineResponse4xx385 inlineResponse4xx385Messages(Object inlineResponse4xx385Messages) {
    this.inlineResponse4xx385Messages = inlineResponse4xx385Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx385Messages
   * @return inlineResponse4xx385Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx385Messages() {
    return inlineResponse4xx385Messages;
  }

  public void setInlineResponse4xx385Messages(Object inlineResponse4xx385Messages) {
    this.inlineResponse4xx385Messages = inlineResponse4xx385Messages;
  }

  public InlineResponse4xx385 inlineResponse4xx385Result(Object inlineResponse4xx385Result) {
    this.inlineResponse4xx385Result = inlineResponse4xx385Result;
    return this;
  }

   /**
   * Get inlineResponse4xx385Result
   * @return inlineResponse4xx385Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx385Result() {
    return inlineResponse4xx385Result;
  }

  public void setInlineResponse4xx385Result(Object inlineResponse4xx385Result) {
    this.inlineResponse4xx385Result = inlineResponse4xx385Result;
  }

  public InlineResponse4xx385 inlineResponse4xx385Success(Boolean inlineResponse4xx385Success) {
    this.inlineResponse4xx385Success = inlineResponse4xx385Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx385Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx385Success() {
    return inlineResponse4xx385Success;
  }

  public void setInlineResponse4xx385Success(Boolean inlineResponse4xx385Success) {
    this.inlineResponse4xx385Success = inlineResponse4xx385Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx385 inlineResponse4xx385 = (InlineResponse4xx385) o;
    return Objects.equals(this.inlineResponse4xx385Errors, inlineResponse4xx385.inlineResponse4xx385Errors) &&
        Objects.equals(this.inlineResponse4xx385Messages, inlineResponse4xx385.inlineResponse4xx385Messages) &&
        Objects.equals(this.inlineResponse4xx385Result, inlineResponse4xx385.inlineResponse4xx385Result) &&
        Objects.equals(this.inlineResponse4xx385Success, inlineResponse4xx385.inlineResponse4xx385Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx385Errors, inlineResponse4xx385Messages, inlineResponse4xx385Result, inlineResponse4xx385Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx385 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx385Errors: ").append(toIndentedString(inlineResponse4xx385Errors)).append("\n");
    sb.append("    inlineResponse4xx385Messages: ").append(toIndentedString(inlineResponse4xx385Messages)).append("\n");
    sb.append("    inlineResponse4xx385Result: ").append(toIndentedString(inlineResponse4xx385Result)).append("\n");
    sb.append("    inlineResponse4xx385Success: ").append(toIndentedString(inlineResponse4xx385Success)).append("\n");
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
