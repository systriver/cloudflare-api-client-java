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
import io.swagger.client.model.CloudflareClientAPIComponentsSchemasSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx152
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx152 extends CloudflareClientAPIComponentsSchemasSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx152Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx152Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx152Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx152Success = null;

  public InlineResponse4xx152 inlineResponse4xx152Errors(Object inlineResponse4xx152Errors) {
    this.inlineResponse4xx152Errors = inlineResponse4xx152Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx152Errors
   * @return inlineResponse4xx152Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx152Errors() {
    return inlineResponse4xx152Errors;
  }

  public void setInlineResponse4xx152Errors(Object inlineResponse4xx152Errors) {
    this.inlineResponse4xx152Errors = inlineResponse4xx152Errors;
  }

  public InlineResponse4xx152 inlineResponse4xx152Messages(Object inlineResponse4xx152Messages) {
    this.inlineResponse4xx152Messages = inlineResponse4xx152Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx152Messages
   * @return inlineResponse4xx152Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx152Messages() {
    return inlineResponse4xx152Messages;
  }

  public void setInlineResponse4xx152Messages(Object inlineResponse4xx152Messages) {
    this.inlineResponse4xx152Messages = inlineResponse4xx152Messages;
  }

  public InlineResponse4xx152 inlineResponse4xx152Result(Object inlineResponse4xx152Result) {
    this.inlineResponse4xx152Result = inlineResponse4xx152Result;
    return this;
  }

   /**
   * Get inlineResponse4xx152Result
   * @return inlineResponse4xx152Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx152Result() {
    return inlineResponse4xx152Result;
  }

  public void setInlineResponse4xx152Result(Object inlineResponse4xx152Result) {
    this.inlineResponse4xx152Result = inlineResponse4xx152Result;
  }

  public InlineResponse4xx152 inlineResponse4xx152Success(Boolean inlineResponse4xx152Success) {
    this.inlineResponse4xx152Success = inlineResponse4xx152Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx152Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx152Success() {
    return inlineResponse4xx152Success;
  }

  public void setInlineResponse4xx152Success(Boolean inlineResponse4xx152Success) {
    this.inlineResponse4xx152Success = inlineResponse4xx152Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx152 inlineResponse4xx152 = (InlineResponse4xx152) o;
    return Objects.equals(this.inlineResponse4xx152Errors, inlineResponse4xx152.inlineResponse4xx152Errors) &&
        Objects.equals(this.inlineResponse4xx152Messages, inlineResponse4xx152.inlineResponse4xx152Messages) &&
        Objects.equals(this.inlineResponse4xx152Result, inlineResponse4xx152.inlineResponse4xx152Result) &&
        Objects.equals(this.inlineResponse4xx152Success, inlineResponse4xx152.inlineResponse4xx152Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx152Errors, inlineResponse4xx152Messages, inlineResponse4xx152Result, inlineResponse4xx152Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx152 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx152Errors: ").append(toIndentedString(inlineResponse4xx152Errors)).append("\n");
    sb.append("    inlineResponse4xx152Messages: ").append(toIndentedString(inlineResponse4xx152Messages)).append("\n");
    sb.append("    inlineResponse4xx152Result: ").append(toIndentedString(inlineResponse4xx152Result)).append("\n");
    sb.append("    inlineResponse4xx152Success: ").append(toIndentedString(inlineResponse4xx152Success)).append("\n");
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
