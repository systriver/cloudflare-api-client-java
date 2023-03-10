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
import io.swagger.client.model.SchemasForceResponse;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx333
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx333 extends SchemasForceResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx333Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx333Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx333Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx333Success = null;

  public InlineResponse4xx333 inlineResponse4xx333Errors(Object inlineResponse4xx333Errors) {
    this.inlineResponse4xx333Errors = inlineResponse4xx333Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx333Errors
   * @return inlineResponse4xx333Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx333Errors() {
    return inlineResponse4xx333Errors;
  }

  public void setInlineResponse4xx333Errors(Object inlineResponse4xx333Errors) {
    this.inlineResponse4xx333Errors = inlineResponse4xx333Errors;
  }

  public InlineResponse4xx333 inlineResponse4xx333Messages(Object inlineResponse4xx333Messages) {
    this.inlineResponse4xx333Messages = inlineResponse4xx333Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx333Messages
   * @return inlineResponse4xx333Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx333Messages() {
    return inlineResponse4xx333Messages;
  }

  public void setInlineResponse4xx333Messages(Object inlineResponse4xx333Messages) {
    this.inlineResponse4xx333Messages = inlineResponse4xx333Messages;
  }

  public InlineResponse4xx333 inlineResponse4xx333Result(Object inlineResponse4xx333Result) {
    this.inlineResponse4xx333Result = inlineResponse4xx333Result;
    return this;
  }

   /**
   * Get inlineResponse4xx333Result
   * @return inlineResponse4xx333Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx333Result() {
    return inlineResponse4xx333Result;
  }

  public void setInlineResponse4xx333Result(Object inlineResponse4xx333Result) {
    this.inlineResponse4xx333Result = inlineResponse4xx333Result;
  }

  public InlineResponse4xx333 inlineResponse4xx333Success(Boolean inlineResponse4xx333Success) {
    this.inlineResponse4xx333Success = inlineResponse4xx333Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx333Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx333Success() {
    return inlineResponse4xx333Success;
  }

  public void setInlineResponse4xx333Success(Boolean inlineResponse4xx333Success) {
    this.inlineResponse4xx333Success = inlineResponse4xx333Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx333 inlineResponse4xx333 = (InlineResponse4xx333) o;
    return Objects.equals(this.inlineResponse4xx333Errors, inlineResponse4xx333.inlineResponse4xx333Errors) &&
        Objects.equals(this.inlineResponse4xx333Messages, inlineResponse4xx333.inlineResponse4xx333Messages) &&
        Objects.equals(this.inlineResponse4xx333Result, inlineResponse4xx333.inlineResponse4xx333Result) &&
        Objects.equals(this.inlineResponse4xx333Success, inlineResponse4xx333.inlineResponse4xx333Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx333Errors, inlineResponse4xx333Messages, inlineResponse4xx333Result, inlineResponse4xx333Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx333 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx333Errors: ").append(toIndentedString(inlineResponse4xx333Errors)).append("\n");
    sb.append("    inlineResponse4xx333Messages: ").append(toIndentedString(inlineResponse4xx333Messages)).append("\n");
    sb.append("    inlineResponse4xx333Result: ").append(toIndentedString(inlineResponse4xx333Result)).append("\n");
    sb.append("    inlineResponse4xx333Success: ").append(toIndentedString(inlineResponse4xx333Success)).append("\n");
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
