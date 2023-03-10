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
import io.swagger.client.model.SingleMembershipResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx288
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx288 extends SingleMembershipResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx288Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx288Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx288Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx288Success = null;

  public InlineResponse4xx288 inlineResponse4xx288Errors(Object inlineResponse4xx288Errors) {
    this.inlineResponse4xx288Errors = inlineResponse4xx288Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx288Errors
   * @return inlineResponse4xx288Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx288Errors() {
    return inlineResponse4xx288Errors;
  }

  public void setInlineResponse4xx288Errors(Object inlineResponse4xx288Errors) {
    this.inlineResponse4xx288Errors = inlineResponse4xx288Errors;
  }

  public InlineResponse4xx288 inlineResponse4xx288Messages(Object inlineResponse4xx288Messages) {
    this.inlineResponse4xx288Messages = inlineResponse4xx288Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx288Messages
   * @return inlineResponse4xx288Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx288Messages() {
    return inlineResponse4xx288Messages;
  }

  public void setInlineResponse4xx288Messages(Object inlineResponse4xx288Messages) {
    this.inlineResponse4xx288Messages = inlineResponse4xx288Messages;
  }

  public InlineResponse4xx288 inlineResponse4xx288Result(Object inlineResponse4xx288Result) {
    this.inlineResponse4xx288Result = inlineResponse4xx288Result;
    return this;
  }

   /**
   * Get inlineResponse4xx288Result
   * @return inlineResponse4xx288Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx288Result() {
    return inlineResponse4xx288Result;
  }

  public void setInlineResponse4xx288Result(Object inlineResponse4xx288Result) {
    this.inlineResponse4xx288Result = inlineResponse4xx288Result;
  }

  public InlineResponse4xx288 inlineResponse4xx288Success(Boolean inlineResponse4xx288Success) {
    this.inlineResponse4xx288Success = inlineResponse4xx288Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx288Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx288Success() {
    return inlineResponse4xx288Success;
  }

  public void setInlineResponse4xx288Success(Boolean inlineResponse4xx288Success) {
    this.inlineResponse4xx288Success = inlineResponse4xx288Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx288 inlineResponse4xx288 = (InlineResponse4xx288) o;
    return Objects.equals(this.inlineResponse4xx288Errors, inlineResponse4xx288.inlineResponse4xx288Errors) &&
        Objects.equals(this.inlineResponse4xx288Messages, inlineResponse4xx288.inlineResponse4xx288Messages) &&
        Objects.equals(this.inlineResponse4xx288Result, inlineResponse4xx288.inlineResponse4xx288Result) &&
        Objects.equals(this.inlineResponse4xx288Success, inlineResponse4xx288.inlineResponse4xx288Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx288Errors, inlineResponse4xx288Messages, inlineResponse4xx288Result, inlineResponse4xx288Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx288 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx288Errors: ").append(toIndentedString(inlineResponse4xx288Errors)).append("\n");
    sb.append("    inlineResponse4xx288Messages: ").append(toIndentedString(inlineResponse4xx288Messages)).append("\n");
    sb.append("    inlineResponse4xx288Result: ").append(toIndentedString(inlineResponse4xx288Result)).append("\n");
    sb.append("    inlineResponse4xx288Success: ").append(toIndentedString(inlineResponse4xx288Success)).append("\n");
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
