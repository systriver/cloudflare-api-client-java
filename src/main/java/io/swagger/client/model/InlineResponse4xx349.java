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
import io.swagger.client.model.CustomHostnameResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx349
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx349 extends CustomHostnameResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx349Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx349Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx349Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx349Success = null;

  public InlineResponse4xx349 inlineResponse4xx349Errors(Object inlineResponse4xx349Errors) {
    this.inlineResponse4xx349Errors = inlineResponse4xx349Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx349Errors
   * @return inlineResponse4xx349Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx349Errors() {
    return inlineResponse4xx349Errors;
  }

  public void setInlineResponse4xx349Errors(Object inlineResponse4xx349Errors) {
    this.inlineResponse4xx349Errors = inlineResponse4xx349Errors;
  }

  public InlineResponse4xx349 inlineResponse4xx349Messages(Object inlineResponse4xx349Messages) {
    this.inlineResponse4xx349Messages = inlineResponse4xx349Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx349Messages
   * @return inlineResponse4xx349Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx349Messages() {
    return inlineResponse4xx349Messages;
  }

  public void setInlineResponse4xx349Messages(Object inlineResponse4xx349Messages) {
    this.inlineResponse4xx349Messages = inlineResponse4xx349Messages;
  }

  public InlineResponse4xx349 inlineResponse4xx349Result(Object inlineResponse4xx349Result) {
    this.inlineResponse4xx349Result = inlineResponse4xx349Result;
    return this;
  }

   /**
   * Get inlineResponse4xx349Result
   * @return inlineResponse4xx349Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx349Result() {
    return inlineResponse4xx349Result;
  }

  public void setInlineResponse4xx349Result(Object inlineResponse4xx349Result) {
    this.inlineResponse4xx349Result = inlineResponse4xx349Result;
  }

  public InlineResponse4xx349 inlineResponse4xx349Success(Boolean inlineResponse4xx349Success) {
    this.inlineResponse4xx349Success = inlineResponse4xx349Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx349Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx349Success() {
    return inlineResponse4xx349Success;
  }

  public void setInlineResponse4xx349Success(Boolean inlineResponse4xx349Success) {
    this.inlineResponse4xx349Success = inlineResponse4xx349Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx349 inlineResponse4xx349 = (InlineResponse4xx349) o;
    return Objects.equals(this.inlineResponse4xx349Errors, inlineResponse4xx349.inlineResponse4xx349Errors) &&
        Objects.equals(this.inlineResponse4xx349Messages, inlineResponse4xx349.inlineResponse4xx349Messages) &&
        Objects.equals(this.inlineResponse4xx349Result, inlineResponse4xx349.inlineResponse4xx349Result) &&
        Objects.equals(this.inlineResponse4xx349Success, inlineResponse4xx349.inlineResponse4xx349Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx349Errors, inlineResponse4xx349Messages, inlineResponse4xx349Result, inlineResponse4xx349Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx349 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx349Errors: ").append(toIndentedString(inlineResponse4xx349Errors)).append("\n");
    sb.append("    inlineResponse4xx349Messages: ").append(toIndentedString(inlineResponse4xx349Messages)).append("\n");
    sb.append("    inlineResponse4xx349Result: ").append(toIndentedString(inlineResponse4xx349Result)).append("\n");
    sb.append("    inlineResponse4xx349Success: ").append(toIndentedString(inlineResponse4xx349Success)).append("\n");
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
