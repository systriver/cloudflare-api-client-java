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
import io.swagger.client.model.LogpushJobResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx78
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx78 extends LogpushJobResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx78Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx78Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx78Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx78Success = null;

  public InlineResponse4xx78 inlineResponse4xx78Errors(Object inlineResponse4xx78Errors) {
    this.inlineResponse4xx78Errors = inlineResponse4xx78Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx78Errors
   * @return inlineResponse4xx78Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx78Errors() {
    return inlineResponse4xx78Errors;
  }

  public void setInlineResponse4xx78Errors(Object inlineResponse4xx78Errors) {
    this.inlineResponse4xx78Errors = inlineResponse4xx78Errors;
  }

  public InlineResponse4xx78 inlineResponse4xx78Messages(Object inlineResponse4xx78Messages) {
    this.inlineResponse4xx78Messages = inlineResponse4xx78Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx78Messages
   * @return inlineResponse4xx78Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx78Messages() {
    return inlineResponse4xx78Messages;
  }

  public void setInlineResponse4xx78Messages(Object inlineResponse4xx78Messages) {
    this.inlineResponse4xx78Messages = inlineResponse4xx78Messages;
  }

  public InlineResponse4xx78 inlineResponse4xx78Result(Object inlineResponse4xx78Result) {
    this.inlineResponse4xx78Result = inlineResponse4xx78Result;
    return this;
  }

   /**
   * Get inlineResponse4xx78Result
   * @return inlineResponse4xx78Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx78Result() {
    return inlineResponse4xx78Result;
  }

  public void setInlineResponse4xx78Result(Object inlineResponse4xx78Result) {
    this.inlineResponse4xx78Result = inlineResponse4xx78Result;
  }

  public InlineResponse4xx78 inlineResponse4xx78Success(Boolean inlineResponse4xx78Success) {
    this.inlineResponse4xx78Success = inlineResponse4xx78Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx78Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx78Success() {
    return inlineResponse4xx78Success;
  }

  public void setInlineResponse4xx78Success(Boolean inlineResponse4xx78Success) {
    this.inlineResponse4xx78Success = inlineResponse4xx78Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx78 inlineResponse4xx78 = (InlineResponse4xx78) o;
    return Objects.equals(this.inlineResponse4xx78Errors, inlineResponse4xx78.inlineResponse4xx78Errors) &&
        Objects.equals(this.inlineResponse4xx78Messages, inlineResponse4xx78.inlineResponse4xx78Messages) &&
        Objects.equals(this.inlineResponse4xx78Result, inlineResponse4xx78.inlineResponse4xx78Result) &&
        Objects.equals(this.inlineResponse4xx78Success, inlineResponse4xx78.inlineResponse4xx78Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx78Errors, inlineResponse4xx78Messages, inlineResponse4xx78Result, inlineResponse4xx78Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx78 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx78Errors: ").append(toIndentedString(inlineResponse4xx78Errors)).append("\n");
    sb.append("    inlineResponse4xx78Messages: ").append(toIndentedString(inlineResponse4xx78Messages)).append("\n");
    sb.append("    inlineResponse4xx78Result: ").append(toIndentedString(inlineResponse4xx78Result)).append("\n");
    sb.append("    inlineResponse4xx78Success: ").append(toIndentedString(inlineResponse4xx78Success)).append("\n");
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
