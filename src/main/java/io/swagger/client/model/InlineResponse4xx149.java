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
import io.swagger.client.model.PeerComponentsSchemasSingleResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx149
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx149 extends PeerComponentsSchemasSingleResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx149Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx149Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx149Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx149Success = null;

  public InlineResponse4xx149 inlineResponse4xx149Errors(Object inlineResponse4xx149Errors) {
    this.inlineResponse4xx149Errors = inlineResponse4xx149Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx149Errors
   * @return inlineResponse4xx149Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx149Errors() {
    return inlineResponse4xx149Errors;
  }

  public void setInlineResponse4xx149Errors(Object inlineResponse4xx149Errors) {
    this.inlineResponse4xx149Errors = inlineResponse4xx149Errors;
  }

  public InlineResponse4xx149 inlineResponse4xx149Messages(Object inlineResponse4xx149Messages) {
    this.inlineResponse4xx149Messages = inlineResponse4xx149Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx149Messages
   * @return inlineResponse4xx149Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx149Messages() {
    return inlineResponse4xx149Messages;
  }

  public void setInlineResponse4xx149Messages(Object inlineResponse4xx149Messages) {
    this.inlineResponse4xx149Messages = inlineResponse4xx149Messages;
  }

  public InlineResponse4xx149 inlineResponse4xx149Result(Object inlineResponse4xx149Result) {
    this.inlineResponse4xx149Result = inlineResponse4xx149Result;
    return this;
  }

   /**
   * Get inlineResponse4xx149Result
   * @return inlineResponse4xx149Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx149Result() {
    return inlineResponse4xx149Result;
  }

  public void setInlineResponse4xx149Result(Object inlineResponse4xx149Result) {
    this.inlineResponse4xx149Result = inlineResponse4xx149Result;
  }

  public InlineResponse4xx149 inlineResponse4xx149Success(Boolean inlineResponse4xx149Success) {
    this.inlineResponse4xx149Success = inlineResponse4xx149Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx149Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx149Success() {
    return inlineResponse4xx149Success;
  }

  public void setInlineResponse4xx149Success(Boolean inlineResponse4xx149Success) {
    this.inlineResponse4xx149Success = inlineResponse4xx149Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx149 inlineResponse4xx149 = (InlineResponse4xx149) o;
    return Objects.equals(this.inlineResponse4xx149Errors, inlineResponse4xx149.inlineResponse4xx149Errors) &&
        Objects.equals(this.inlineResponse4xx149Messages, inlineResponse4xx149.inlineResponse4xx149Messages) &&
        Objects.equals(this.inlineResponse4xx149Result, inlineResponse4xx149.inlineResponse4xx149Result) &&
        Objects.equals(this.inlineResponse4xx149Success, inlineResponse4xx149.inlineResponse4xx149Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx149Errors, inlineResponse4xx149Messages, inlineResponse4xx149Result, inlineResponse4xx149Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx149 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx149Errors: ").append(toIndentedString(inlineResponse4xx149Errors)).append("\n");
    sb.append("    inlineResponse4xx149Messages: ").append(toIndentedString(inlineResponse4xx149Messages)).append("\n");
    sb.append("    inlineResponse4xx149Result: ").append(toIndentedString(inlineResponse4xx149Result)).append("\n");
    sb.append("    inlineResponse4xx149Success: ").append(toIndentedString(inlineResponse4xx149Success)).append("\n");
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
