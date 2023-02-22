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
import io.swagger.client.model.MonitorComponentsSchemasSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx307
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx307 extends MonitorComponentsSchemasSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx307Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx307Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx307Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx307Success = null;

  public InlineResponse4xx307 inlineResponse4xx307Errors(Object inlineResponse4xx307Errors) {
    this.inlineResponse4xx307Errors = inlineResponse4xx307Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx307Errors
   * @return inlineResponse4xx307Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx307Errors() {
    return inlineResponse4xx307Errors;
  }

  public void setInlineResponse4xx307Errors(Object inlineResponse4xx307Errors) {
    this.inlineResponse4xx307Errors = inlineResponse4xx307Errors;
  }

  public InlineResponse4xx307 inlineResponse4xx307Messages(Object inlineResponse4xx307Messages) {
    this.inlineResponse4xx307Messages = inlineResponse4xx307Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx307Messages
   * @return inlineResponse4xx307Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx307Messages() {
    return inlineResponse4xx307Messages;
  }

  public void setInlineResponse4xx307Messages(Object inlineResponse4xx307Messages) {
    this.inlineResponse4xx307Messages = inlineResponse4xx307Messages;
  }

  public InlineResponse4xx307 inlineResponse4xx307Result(Object inlineResponse4xx307Result) {
    this.inlineResponse4xx307Result = inlineResponse4xx307Result;
    return this;
  }

   /**
   * Get inlineResponse4xx307Result
   * @return inlineResponse4xx307Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx307Result() {
    return inlineResponse4xx307Result;
  }

  public void setInlineResponse4xx307Result(Object inlineResponse4xx307Result) {
    this.inlineResponse4xx307Result = inlineResponse4xx307Result;
  }

  public InlineResponse4xx307 inlineResponse4xx307Success(Boolean inlineResponse4xx307Success) {
    this.inlineResponse4xx307Success = inlineResponse4xx307Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx307Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx307Success() {
    return inlineResponse4xx307Success;
  }

  public void setInlineResponse4xx307Success(Boolean inlineResponse4xx307Success) {
    this.inlineResponse4xx307Success = inlineResponse4xx307Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx307 inlineResponse4xx307 = (InlineResponse4xx307) o;
    return Objects.equals(this.inlineResponse4xx307Errors, inlineResponse4xx307.inlineResponse4xx307Errors) &&
        Objects.equals(this.inlineResponse4xx307Messages, inlineResponse4xx307.inlineResponse4xx307Messages) &&
        Objects.equals(this.inlineResponse4xx307Result, inlineResponse4xx307.inlineResponse4xx307Result) &&
        Objects.equals(this.inlineResponse4xx307Success, inlineResponse4xx307.inlineResponse4xx307Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx307Errors, inlineResponse4xx307Messages, inlineResponse4xx307Result, inlineResponse4xx307Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx307 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx307Errors: ").append(toIndentedString(inlineResponse4xx307Errors)).append("\n");
    sb.append("    inlineResponse4xx307Messages: ").append(toIndentedString(inlineResponse4xx307Messages)).append("\n");
    sb.append("    inlineResponse4xx307Result: ").append(toIndentedString(inlineResponse4xx307Result)).append("\n");
    sb.append("    inlineResponse4xx307Success: ").append(toIndentedString(inlineResponse4xx307Success)).append("\n");
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
