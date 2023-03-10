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
import io.swagger.client.model.CertificatePackQuotaResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx466
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx466 extends CertificatePackQuotaResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx466Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx466Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx466Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx466Success = null;

  public InlineResponse4xx466 inlineResponse4xx466Errors(Object inlineResponse4xx466Errors) {
    this.inlineResponse4xx466Errors = inlineResponse4xx466Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx466Errors
   * @return inlineResponse4xx466Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx466Errors() {
    return inlineResponse4xx466Errors;
  }

  public void setInlineResponse4xx466Errors(Object inlineResponse4xx466Errors) {
    this.inlineResponse4xx466Errors = inlineResponse4xx466Errors;
  }

  public InlineResponse4xx466 inlineResponse4xx466Messages(Object inlineResponse4xx466Messages) {
    this.inlineResponse4xx466Messages = inlineResponse4xx466Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx466Messages
   * @return inlineResponse4xx466Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx466Messages() {
    return inlineResponse4xx466Messages;
  }

  public void setInlineResponse4xx466Messages(Object inlineResponse4xx466Messages) {
    this.inlineResponse4xx466Messages = inlineResponse4xx466Messages;
  }

  public InlineResponse4xx466 inlineResponse4xx466Result(Object inlineResponse4xx466Result) {
    this.inlineResponse4xx466Result = inlineResponse4xx466Result;
    return this;
  }

   /**
   * Get inlineResponse4xx466Result
   * @return inlineResponse4xx466Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx466Result() {
    return inlineResponse4xx466Result;
  }

  public void setInlineResponse4xx466Result(Object inlineResponse4xx466Result) {
    this.inlineResponse4xx466Result = inlineResponse4xx466Result;
  }

  public InlineResponse4xx466 inlineResponse4xx466Success(Boolean inlineResponse4xx466Success) {
    this.inlineResponse4xx466Success = inlineResponse4xx466Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx466Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx466Success() {
    return inlineResponse4xx466Success;
  }

  public void setInlineResponse4xx466Success(Boolean inlineResponse4xx466Success) {
    this.inlineResponse4xx466Success = inlineResponse4xx466Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx466 inlineResponse4xx466 = (InlineResponse4xx466) o;
    return Objects.equals(this.inlineResponse4xx466Errors, inlineResponse4xx466.inlineResponse4xx466Errors) &&
        Objects.equals(this.inlineResponse4xx466Messages, inlineResponse4xx466.inlineResponse4xx466Messages) &&
        Objects.equals(this.inlineResponse4xx466Result, inlineResponse4xx466.inlineResponse4xx466Result) &&
        Objects.equals(this.inlineResponse4xx466Success, inlineResponse4xx466.inlineResponse4xx466Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx466Errors, inlineResponse4xx466Messages, inlineResponse4xx466Result, inlineResponse4xx466Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx466 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx466Errors: ").append(toIndentedString(inlineResponse4xx466Errors)).append("\n");
    sb.append("    inlineResponse4xx466Messages: ").append(toIndentedString(inlineResponse4xx466Messages)).append("\n");
    sb.append("    inlineResponse4xx466Result: ").append(toIndentedString(inlineResponse4xx466Result)).append("\n");
    sb.append("    inlineResponse4xx466Success: ").append(toIndentedString(inlineResponse4xx466Success)).append("\n");
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
