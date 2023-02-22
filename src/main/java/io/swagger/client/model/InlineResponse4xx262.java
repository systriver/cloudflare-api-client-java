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
import io.swagger.client.model.GatewayAccountDeviceSettingsResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx262
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx262 extends GatewayAccountDeviceSettingsResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx262Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx262Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx262Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx262Success = null;

  public InlineResponse4xx262 inlineResponse4xx262Errors(Object inlineResponse4xx262Errors) {
    this.inlineResponse4xx262Errors = inlineResponse4xx262Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx262Errors
   * @return inlineResponse4xx262Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx262Errors() {
    return inlineResponse4xx262Errors;
  }

  public void setInlineResponse4xx262Errors(Object inlineResponse4xx262Errors) {
    this.inlineResponse4xx262Errors = inlineResponse4xx262Errors;
  }

  public InlineResponse4xx262 inlineResponse4xx262Messages(Object inlineResponse4xx262Messages) {
    this.inlineResponse4xx262Messages = inlineResponse4xx262Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx262Messages
   * @return inlineResponse4xx262Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx262Messages() {
    return inlineResponse4xx262Messages;
  }

  public void setInlineResponse4xx262Messages(Object inlineResponse4xx262Messages) {
    this.inlineResponse4xx262Messages = inlineResponse4xx262Messages;
  }

  public InlineResponse4xx262 inlineResponse4xx262Result(Object inlineResponse4xx262Result) {
    this.inlineResponse4xx262Result = inlineResponse4xx262Result;
    return this;
  }

   /**
   * Get inlineResponse4xx262Result
   * @return inlineResponse4xx262Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx262Result() {
    return inlineResponse4xx262Result;
  }

  public void setInlineResponse4xx262Result(Object inlineResponse4xx262Result) {
    this.inlineResponse4xx262Result = inlineResponse4xx262Result;
  }

  public InlineResponse4xx262 inlineResponse4xx262Success(Boolean inlineResponse4xx262Success) {
    this.inlineResponse4xx262Success = inlineResponse4xx262Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx262Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx262Success() {
    return inlineResponse4xx262Success;
  }

  public void setInlineResponse4xx262Success(Boolean inlineResponse4xx262Success) {
    this.inlineResponse4xx262Success = inlineResponse4xx262Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx262 inlineResponse4xx262 = (InlineResponse4xx262) o;
    return Objects.equals(this.inlineResponse4xx262Errors, inlineResponse4xx262.inlineResponse4xx262Errors) &&
        Objects.equals(this.inlineResponse4xx262Messages, inlineResponse4xx262.inlineResponse4xx262Messages) &&
        Objects.equals(this.inlineResponse4xx262Result, inlineResponse4xx262.inlineResponse4xx262Result) &&
        Objects.equals(this.inlineResponse4xx262Success, inlineResponse4xx262.inlineResponse4xx262Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx262Errors, inlineResponse4xx262Messages, inlineResponse4xx262Result, inlineResponse4xx262Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx262 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx262Errors: ").append(toIndentedString(inlineResponse4xx262Errors)).append("\n");
    sb.append("    inlineResponse4xx262Messages: ").append(toIndentedString(inlineResponse4xx262Messages)).append("\n");
    sb.append("    inlineResponse4xx262Result: ").append(toIndentedString(inlineResponse4xx262Result)).append("\n");
    sb.append("    inlineResponse4xx262Success: ").append(toIndentedString(inlineResponse4xx262Success)).append("\n");
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