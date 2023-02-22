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
import io.swagger.client.model.CloudflareClientAPIApiResponseCommonFailure;
import io.swagger.client.model.DeploymentResponseDetails;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx121
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx121 extends DeploymentResponseDetails {
  @SerializedName("errors")
  private Object inlineResponse4xx121Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx121Messages = null;

  @SerializedName("result")
  private String inlineResponse4xx121Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx121Success = null;

  public InlineResponse4xx121 inlineResponse4xx121Errors(Object inlineResponse4xx121Errors) {
    this.inlineResponse4xx121Errors = inlineResponse4xx121Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx121Errors
   * @return inlineResponse4xx121Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx121Errors() {
    return inlineResponse4xx121Errors;
  }

  public void setInlineResponse4xx121Errors(Object inlineResponse4xx121Errors) {
    this.inlineResponse4xx121Errors = inlineResponse4xx121Errors;
  }

  public InlineResponse4xx121 inlineResponse4xx121Messages(Object inlineResponse4xx121Messages) {
    this.inlineResponse4xx121Messages = inlineResponse4xx121Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx121Messages
   * @return inlineResponse4xx121Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx121Messages() {
    return inlineResponse4xx121Messages;
  }

  public void setInlineResponse4xx121Messages(Object inlineResponse4xx121Messages) {
    this.inlineResponse4xx121Messages = inlineResponse4xx121Messages;
  }

  public InlineResponse4xx121 inlineResponse4xx121Result(String inlineResponse4xx121Result) {
    this.inlineResponse4xx121Result = inlineResponse4xx121Result;
    return this;
  }

   /**
   * Get inlineResponse4xx121Result
   * @return inlineResponse4xx121Result
  **/
  @Schema(required = true, description = "")
  public String getInlineResponse4xx121Result() {
    return inlineResponse4xx121Result;
  }

  public void setInlineResponse4xx121Result(String inlineResponse4xx121Result) {
    this.inlineResponse4xx121Result = inlineResponse4xx121Result;
  }

  public InlineResponse4xx121 inlineResponse4xx121Success(Boolean inlineResponse4xx121Success) {
    this.inlineResponse4xx121Success = inlineResponse4xx121Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx121Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx121Success() {
    return inlineResponse4xx121Success;
  }

  public void setInlineResponse4xx121Success(Boolean inlineResponse4xx121Success) {
    this.inlineResponse4xx121Success = inlineResponse4xx121Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx121 inlineResponse4xx121 = (InlineResponse4xx121) o;
    return Objects.equals(this.inlineResponse4xx121Errors, inlineResponse4xx121.inlineResponse4xx121Errors) &&
        Objects.equals(this.inlineResponse4xx121Messages, inlineResponse4xx121.inlineResponse4xx121Messages) &&
        Objects.equals(this.inlineResponse4xx121Result, inlineResponse4xx121.inlineResponse4xx121Result) &&
        Objects.equals(this.inlineResponse4xx121Success, inlineResponse4xx121.inlineResponse4xx121Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx121Errors, inlineResponse4xx121Messages, inlineResponse4xx121Result, inlineResponse4xx121Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx121 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx121Errors: ").append(toIndentedString(inlineResponse4xx121Errors)).append("\n");
    sb.append("    inlineResponse4xx121Messages: ").append(toIndentedString(inlineResponse4xx121Messages)).append("\n");
    sb.append("    inlineResponse4xx121Result: ").append(toIndentedString(inlineResponse4xx121Result)).append("\n");
    sb.append("    inlineResponse4xx121Success: ").append(toIndentedString(inlineResponse4xx121Success)).append("\n");
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
