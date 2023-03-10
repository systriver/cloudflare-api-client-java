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
import io.swagger.client.model.CloudflareClientAPISchemasResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx315
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx315 extends CloudflareClientAPISchemasResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx315Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx315Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx315Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx315Success = null;

  public InlineResponse4xx315 inlineResponse4xx315Errors(Object inlineResponse4xx315Errors) {
    this.inlineResponse4xx315Errors = inlineResponse4xx315Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx315Errors
   * @return inlineResponse4xx315Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx315Errors() {
    return inlineResponse4xx315Errors;
  }

  public void setInlineResponse4xx315Errors(Object inlineResponse4xx315Errors) {
    this.inlineResponse4xx315Errors = inlineResponse4xx315Errors;
  }

  public InlineResponse4xx315 inlineResponse4xx315Messages(Object inlineResponse4xx315Messages) {
    this.inlineResponse4xx315Messages = inlineResponse4xx315Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx315Messages
   * @return inlineResponse4xx315Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx315Messages() {
    return inlineResponse4xx315Messages;
  }

  public void setInlineResponse4xx315Messages(Object inlineResponse4xx315Messages) {
    this.inlineResponse4xx315Messages = inlineResponse4xx315Messages;
  }

  public InlineResponse4xx315 inlineResponse4xx315Result(Object inlineResponse4xx315Result) {
    this.inlineResponse4xx315Result = inlineResponse4xx315Result;
    return this;
  }

   /**
   * Get inlineResponse4xx315Result
   * @return inlineResponse4xx315Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx315Result() {
    return inlineResponse4xx315Result;
  }

  public void setInlineResponse4xx315Result(Object inlineResponse4xx315Result) {
    this.inlineResponse4xx315Result = inlineResponse4xx315Result;
  }

  public InlineResponse4xx315 inlineResponse4xx315Success(Boolean inlineResponse4xx315Success) {
    this.inlineResponse4xx315Success = inlineResponse4xx315Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx315Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx315Success() {
    return inlineResponse4xx315Success;
  }

  public void setInlineResponse4xx315Success(Boolean inlineResponse4xx315Success) {
    this.inlineResponse4xx315Success = inlineResponse4xx315Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx315 inlineResponse4xx315 = (InlineResponse4xx315) o;
    return Objects.equals(this.inlineResponse4xx315Errors, inlineResponse4xx315.inlineResponse4xx315Errors) &&
        Objects.equals(this.inlineResponse4xx315Messages, inlineResponse4xx315.inlineResponse4xx315Messages) &&
        Objects.equals(this.inlineResponse4xx315Result, inlineResponse4xx315.inlineResponse4xx315Result) &&
        Objects.equals(this.inlineResponse4xx315Success, inlineResponse4xx315.inlineResponse4xx315Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx315Errors, inlineResponse4xx315Messages, inlineResponse4xx315Result, inlineResponse4xx315Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx315 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx315Errors: ").append(toIndentedString(inlineResponse4xx315Errors)).append("\n");
    sb.append("    inlineResponse4xx315Messages: ").append(toIndentedString(inlineResponse4xx315Messages)).append("\n");
    sb.append("    inlineResponse4xx315Result: ").append(toIndentedString(inlineResponse4xx315Result)).append("\n");
    sb.append("    inlineResponse4xx315Success: ").append(toIndentedString(inlineResponse4xx315Success)).append("\n");
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
