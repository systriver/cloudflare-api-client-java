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
import io.swagger.client.model.RoutesCollectionResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx101
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx101 extends RoutesCollectionResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx101Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx101Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx101Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx101Success = null;

  public InlineResponse4xx101 inlineResponse4xx101Errors(Object inlineResponse4xx101Errors) {
    this.inlineResponse4xx101Errors = inlineResponse4xx101Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx101Errors
   * @return inlineResponse4xx101Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx101Errors() {
    return inlineResponse4xx101Errors;
  }

  public void setInlineResponse4xx101Errors(Object inlineResponse4xx101Errors) {
    this.inlineResponse4xx101Errors = inlineResponse4xx101Errors;
  }

  public InlineResponse4xx101 inlineResponse4xx101Messages(Object inlineResponse4xx101Messages) {
    this.inlineResponse4xx101Messages = inlineResponse4xx101Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx101Messages
   * @return inlineResponse4xx101Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx101Messages() {
    return inlineResponse4xx101Messages;
  }

  public void setInlineResponse4xx101Messages(Object inlineResponse4xx101Messages) {
    this.inlineResponse4xx101Messages = inlineResponse4xx101Messages;
  }

  public InlineResponse4xx101 inlineResponse4xx101Result(Object inlineResponse4xx101Result) {
    this.inlineResponse4xx101Result = inlineResponse4xx101Result;
    return this;
  }

   /**
   * Get inlineResponse4xx101Result
   * @return inlineResponse4xx101Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx101Result() {
    return inlineResponse4xx101Result;
  }

  public void setInlineResponse4xx101Result(Object inlineResponse4xx101Result) {
    this.inlineResponse4xx101Result = inlineResponse4xx101Result;
  }

  public InlineResponse4xx101 inlineResponse4xx101Success(Boolean inlineResponse4xx101Success) {
    this.inlineResponse4xx101Success = inlineResponse4xx101Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx101Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx101Success() {
    return inlineResponse4xx101Success;
  }

  public void setInlineResponse4xx101Success(Boolean inlineResponse4xx101Success) {
    this.inlineResponse4xx101Success = inlineResponse4xx101Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx101 inlineResponse4xx101 = (InlineResponse4xx101) o;
    return Objects.equals(this.inlineResponse4xx101Errors, inlineResponse4xx101.inlineResponse4xx101Errors) &&
        Objects.equals(this.inlineResponse4xx101Messages, inlineResponse4xx101.inlineResponse4xx101Messages) &&
        Objects.equals(this.inlineResponse4xx101Result, inlineResponse4xx101.inlineResponse4xx101Result) &&
        Objects.equals(this.inlineResponse4xx101Success, inlineResponse4xx101.inlineResponse4xx101Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx101Errors, inlineResponse4xx101Messages, inlineResponse4xx101Result, inlineResponse4xx101Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx101 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx101Errors: ").append(toIndentedString(inlineResponse4xx101Errors)).append("\n");
    sb.append("    inlineResponse4xx101Messages: ").append(toIndentedString(inlineResponse4xx101Messages)).append("\n");
    sb.append("    inlineResponse4xx101Result: ").append(toIndentedString(inlineResponse4xx101Result)).append("\n");
    sb.append("    inlineResponse4xx101Success: ").append(toIndentedString(inlineResponse4xx101Success)).append("\n");
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
