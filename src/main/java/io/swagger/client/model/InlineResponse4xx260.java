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
import io.swagger.client.model.DevicePostureIntegrationsComponentsSchemasIdResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx260
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx260 extends DevicePostureIntegrationsComponentsSchemasIdResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx260Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx260Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx260Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx260Success = null;

  public InlineResponse4xx260 inlineResponse4xx260Errors(Object inlineResponse4xx260Errors) {
    this.inlineResponse4xx260Errors = inlineResponse4xx260Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx260Errors
   * @return inlineResponse4xx260Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx260Errors() {
    return inlineResponse4xx260Errors;
  }

  public void setInlineResponse4xx260Errors(Object inlineResponse4xx260Errors) {
    this.inlineResponse4xx260Errors = inlineResponse4xx260Errors;
  }

  public InlineResponse4xx260 inlineResponse4xx260Messages(Object inlineResponse4xx260Messages) {
    this.inlineResponse4xx260Messages = inlineResponse4xx260Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx260Messages
   * @return inlineResponse4xx260Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx260Messages() {
    return inlineResponse4xx260Messages;
  }

  public void setInlineResponse4xx260Messages(Object inlineResponse4xx260Messages) {
    this.inlineResponse4xx260Messages = inlineResponse4xx260Messages;
  }

  public InlineResponse4xx260 inlineResponse4xx260Result(Object inlineResponse4xx260Result) {
    this.inlineResponse4xx260Result = inlineResponse4xx260Result;
    return this;
  }

   /**
   * Get inlineResponse4xx260Result
   * @return inlineResponse4xx260Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx260Result() {
    return inlineResponse4xx260Result;
  }

  public void setInlineResponse4xx260Result(Object inlineResponse4xx260Result) {
    this.inlineResponse4xx260Result = inlineResponse4xx260Result;
  }

  public InlineResponse4xx260 inlineResponse4xx260Success(Boolean inlineResponse4xx260Success) {
    this.inlineResponse4xx260Success = inlineResponse4xx260Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx260Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx260Success() {
    return inlineResponse4xx260Success;
  }

  public void setInlineResponse4xx260Success(Boolean inlineResponse4xx260Success) {
    this.inlineResponse4xx260Success = inlineResponse4xx260Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx260 inlineResponse4xx260 = (InlineResponse4xx260) o;
    return Objects.equals(this.inlineResponse4xx260Errors, inlineResponse4xx260.inlineResponse4xx260Errors) &&
        Objects.equals(this.inlineResponse4xx260Messages, inlineResponse4xx260.inlineResponse4xx260Messages) &&
        Objects.equals(this.inlineResponse4xx260Result, inlineResponse4xx260.inlineResponse4xx260Result) &&
        Objects.equals(this.inlineResponse4xx260Success, inlineResponse4xx260.inlineResponse4xx260Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx260Errors, inlineResponse4xx260Messages, inlineResponse4xx260Result, inlineResponse4xx260Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx260 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx260Errors: ").append(toIndentedString(inlineResponse4xx260Errors)).append("\n");
    sb.append("    inlineResponse4xx260Messages: ").append(toIndentedString(inlineResponse4xx260Messages)).append("\n");
    sb.append("    inlineResponse4xx260Result: ").append(toIndentedString(inlineResponse4xx260Result)).append("\n");
    sb.append("    inlineResponse4xx260Success: ").append(toIndentedString(inlineResponse4xx260Success)).append("\n");
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
