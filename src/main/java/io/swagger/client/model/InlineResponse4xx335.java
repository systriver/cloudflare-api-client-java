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
import io.swagger.client.model.ZoneSubscriptionResponseSingle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx335
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx335 extends ZoneSubscriptionResponseSingle {
  @SerializedName("errors")
  private Object inlineResponse4xx335Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx335Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx335Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx335Success = null;

  public InlineResponse4xx335 inlineResponse4xx335Errors(Object inlineResponse4xx335Errors) {
    this.inlineResponse4xx335Errors = inlineResponse4xx335Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx335Errors
   * @return inlineResponse4xx335Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx335Errors() {
    return inlineResponse4xx335Errors;
  }

  public void setInlineResponse4xx335Errors(Object inlineResponse4xx335Errors) {
    this.inlineResponse4xx335Errors = inlineResponse4xx335Errors;
  }

  public InlineResponse4xx335 inlineResponse4xx335Messages(Object inlineResponse4xx335Messages) {
    this.inlineResponse4xx335Messages = inlineResponse4xx335Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx335Messages
   * @return inlineResponse4xx335Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx335Messages() {
    return inlineResponse4xx335Messages;
  }

  public void setInlineResponse4xx335Messages(Object inlineResponse4xx335Messages) {
    this.inlineResponse4xx335Messages = inlineResponse4xx335Messages;
  }

  public InlineResponse4xx335 inlineResponse4xx335Result(Object inlineResponse4xx335Result) {
    this.inlineResponse4xx335Result = inlineResponse4xx335Result;
    return this;
  }

   /**
   * Get inlineResponse4xx335Result
   * @return inlineResponse4xx335Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx335Result() {
    return inlineResponse4xx335Result;
  }

  public void setInlineResponse4xx335Result(Object inlineResponse4xx335Result) {
    this.inlineResponse4xx335Result = inlineResponse4xx335Result;
  }

  public InlineResponse4xx335 inlineResponse4xx335Success(Boolean inlineResponse4xx335Success) {
    this.inlineResponse4xx335Success = inlineResponse4xx335Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx335Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx335Success() {
    return inlineResponse4xx335Success;
  }

  public void setInlineResponse4xx335Success(Boolean inlineResponse4xx335Success) {
    this.inlineResponse4xx335Success = inlineResponse4xx335Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx335 inlineResponse4xx335 = (InlineResponse4xx335) o;
    return Objects.equals(this.inlineResponse4xx335Errors, inlineResponse4xx335.inlineResponse4xx335Errors) &&
        Objects.equals(this.inlineResponse4xx335Messages, inlineResponse4xx335.inlineResponse4xx335Messages) &&
        Objects.equals(this.inlineResponse4xx335Result, inlineResponse4xx335.inlineResponse4xx335Result) &&
        Objects.equals(this.inlineResponse4xx335Success, inlineResponse4xx335.inlineResponse4xx335Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx335Errors, inlineResponse4xx335Messages, inlineResponse4xx335Result, inlineResponse4xx335Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx335 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx335Errors: ").append(toIndentedString(inlineResponse4xx335Errors)).append("\n");
    sb.append("    inlineResponse4xx335Messages: ").append(toIndentedString(inlineResponse4xx335Messages)).append("\n");
    sb.append("    inlineResponse4xx335Result: ").append(toIndentedString(inlineResponse4xx335Result)).append("\n");
    sb.append("    inlineResponse4xx335Success: ").append(toIndentedString(inlineResponse4xx335Success)).append("\n");
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
