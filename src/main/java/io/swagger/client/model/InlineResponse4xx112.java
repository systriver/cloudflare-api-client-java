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
import io.swagger.client.model.CertificateResponseSinglePost;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx112
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx112 extends CertificateResponseSinglePost {
  @SerializedName("errors")
  private Object inlineResponse4xx112Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx112Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx112Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx112Success = null;

  public InlineResponse4xx112 inlineResponse4xx112Errors(Object inlineResponse4xx112Errors) {
    this.inlineResponse4xx112Errors = inlineResponse4xx112Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx112Errors
   * @return inlineResponse4xx112Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx112Errors() {
    return inlineResponse4xx112Errors;
  }

  public void setInlineResponse4xx112Errors(Object inlineResponse4xx112Errors) {
    this.inlineResponse4xx112Errors = inlineResponse4xx112Errors;
  }

  public InlineResponse4xx112 inlineResponse4xx112Messages(Object inlineResponse4xx112Messages) {
    this.inlineResponse4xx112Messages = inlineResponse4xx112Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx112Messages
   * @return inlineResponse4xx112Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx112Messages() {
    return inlineResponse4xx112Messages;
  }

  public void setInlineResponse4xx112Messages(Object inlineResponse4xx112Messages) {
    this.inlineResponse4xx112Messages = inlineResponse4xx112Messages;
  }

  public InlineResponse4xx112 inlineResponse4xx112Result(Object inlineResponse4xx112Result) {
    this.inlineResponse4xx112Result = inlineResponse4xx112Result;
    return this;
  }

   /**
   * Get inlineResponse4xx112Result
   * @return inlineResponse4xx112Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx112Result() {
    return inlineResponse4xx112Result;
  }

  public void setInlineResponse4xx112Result(Object inlineResponse4xx112Result) {
    this.inlineResponse4xx112Result = inlineResponse4xx112Result;
  }

  public InlineResponse4xx112 inlineResponse4xx112Success(Boolean inlineResponse4xx112Success) {
    this.inlineResponse4xx112Success = inlineResponse4xx112Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx112Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx112Success() {
    return inlineResponse4xx112Success;
  }

  public void setInlineResponse4xx112Success(Boolean inlineResponse4xx112Success) {
    this.inlineResponse4xx112Success = inlineResponse4xx112Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx112 inlineResponse4xx112 = (InlineResponse4xx112) o;
    return Objects.equals(this.inlineResponse4xx112Errors, inlineResponse4xx112.inlineResponse4xx112Errors) &&
        Objects.equals(this.inlineResponse4xx112Messages, inlineResponse4xx112.inlineResponse4xx112Messages) &&
        Objects.equals(this.inlineResponse4xx112Result, inlineResponse4xx112.inlineResponse4xx112Result) &&
        Objects.equals(this.inlineResponse4xx112Success, inlineResponse4xx112.inlineResponse4xx112Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx112Errors, inlineResponse4xx112Messages, inlineResponse4xx112Result, inlineResponse4xx112Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx112 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx112Errors: ").append(toIndentedString(inlineResponse4xx112Errors)).append("\n");
    sb.append("    inlineResponse4xx112Messages: ").append(toIndentedString(inlineResponse4xx112Messages)).append("\n");
    sb.append("    inlineResponse4xx112Result: ").append(toIndentedString(inlineResponse4xx112Result)).append("\n");
    sb.append("    inlineResponse4xx112Success: ").append(toIndentedString(inlineResponse4xx112Success)).append("\n");
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
