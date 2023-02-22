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
import io.swagger.client.model.ZonelockdownResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx369
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx369 extends ZonelockdownResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx369Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx369Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx369Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx369Success = null;

  public InlineResponse4xx369 inlineResponse4xx369Errors(Object inlineResponse4xx369Errors) {
    this.inlineResponse4xx369Errors = inlineResponse4xx369Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx369Errors
   * @return inlineResponse4xx369Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx369Errors() {
    return inlineResponse4xx369Errors;
  }

  public void setInlineResponse4xx369Errors(Object inlineResponse4xx369Errors) {
    this.inlineResponse4xx369Errors = inlineResponse4xx369Errors;
  }

  public InlineResponse4xx369 inlineResponse4xx369Messages(Object inlineResponse4xx369Messages) {
    this.inlineResponse4xx369Messages = inlineResponse4xx369Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx369Messages
   * @return inlineResponse4xx369Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx369Messages() {
    return inlineResponse4xx369Messages;
  }

  public void setInlineResponse4xx369Messages(Object inlineResponse4xx369Messages) {
    this.inlineResponse4xx369Messages = inlineResponse4xx369Messages;
  }

  public InlineResponse4xx369 inlineResponse4xx369Result(Object inlineResponse4xx369Result) {
    this.inlineResponse4xx369Result = inlineResponse4xx369Result;
    return this;
  }

   /**
   * Get inlineResponse4xx369Result
   * @return inlineResponse4xx369Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx369Result() {
    return inlineResponse4xx369Result;
  }

  public void setInlineResponse4xx369Result(Object inlineResponse4xx369Result) {
    this.inlineResponse4xx369Result = inlineResponse4xx369Result;
  }

  public InlineResponse4xx369 inlineResponse4xx369Success(Boolean inlineResponse4xx369Success) {
    this.inlineResponse4xx369Success = inlineResponse4xx369Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx369Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx369Success() {
    return inlineResponse4xx369Success;
  }

  public void setInlineResponse4xx369Success(Boolean inlineResponse4xx369Success) {
    this.inlineResponse4xx369Success = inlineResponse4xx369Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx369 inlineResponse4xx369 = (InlineResponse4xx369) o;
    return Objects.equals(this.inlineResponse4xx369Errors, inlineResponse4xx369.inlineResponse4xx369Errors) &&
        Objects.equals(this.inlineResponse4xx369Messages, inlineResponse4xx369.inlineResponse4xx369Messages) &&
        Objects.equals(this.inlineResponse4xx369Result, inlineResponse4xx369.inlineResponse4xx369Result) &&
        Objects.equals(this.inlineResponse4xx369Success, inlineResponse4xx369.inlineResponse4xx369Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx369Errors, inlineResponse4xx369Messages, inlineResponse4xx369Result, inlineResponse4xx369Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx369 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx369Errors: ").append(toIndentedString(inlineResponse4xx369Errors)).append("\n");
    sb.append("    inlineResponse4xx369Messages: ").append(toIndentedString(inlineResponse4xx369Messages)).append("\n");
    sb.append("    inlineResponse4xx369Result: ").append(toIndentedString(inlineResponse4xx369Result)).append("\n");
    sb.append("    inlineResponse4xx369Success: ").append(toIndentedString(inlineResponse4xx369Success)).append("\n");
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
