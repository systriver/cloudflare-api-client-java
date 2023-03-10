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
import io.swagger.client.model.CloudflareClientAPIRulesResponseCollection;
import io.swagger.client.model.CloudflareClientAPIRulesResponseCollectionResultInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx362
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx362 extends CloudflareClientAPIRulesResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xx362Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx362Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx362Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx362Success = null;

  public InlineResponse4xx362 inlineResponse4xx362Errors(Object inlineResponse4xx362Errors) {
    this.inlineResponse4xx362Errors = inlineResponse4xx362Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx362Errors
   * @return inlineResponse4xx362Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx362Errors() {
    return inlineResponse4xx362Errors;
  }

  public void setInlineResponse4xx362Errors(Object inlineResponse4xx362Errors) {
    this.inlineResponse4xx362Errors = inlineResponse4xx362Errors;
  }

  public InlineResponse4xx362 inlineResponse4xx362Messages(Object inlineResponse4xx362Messages) {
    this.inlineResponse4xx362Messages = inlineResponse4xx362Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx362Messages
   * @return inlineResponse4xx362Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx362Messages() {
    return inlineResponse4xx362Messages;
  }

  public void setInlineResponse4xx362Messages(Object inlineResponse4xx362Messages) {
    this.inlineResponse4xx362Messages = inlineResponse4xx362Messages;
  }

  public InlineResponse4xx362 inlineResponse4xx362Result(Object inlineResponse4xx362Result) {
    this.inlineResponse4xx362Result = inlineResponse4xx362Result;
    return this;
  }

   /**
   * Get inlineResponse4xx362Result
   * @return inlineResponse4xx362Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx362Result() {
    return inlineResponse4xx362Result;
  }

  public void setInlineResponse4xx362Result(Object inlineResponse4xx362Result) {
    this.inlineResponse4xx362Result = inlineResponse4xx362Result;
  }

  public InlineResponse4xx362 inlineResponse4xx362Success(Boolean inlineResponse4xx362Success) {
    this.inlineResponse4xx362Success = inlineResponse4xx362Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx362Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx362Success() {
    return inlineResponse4xx362Success;
  }

  public void setInlineResponse4xx362Success(Boolean inlineResponse4xx362Success) {
    this.inlineResponse4xx362Success = inlineResponse4xx362Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx362 inlineResponse4xx362 = (InlineResponse4xx362) o;
    return Objects.equals(this.inlineResponse4xx362Errors, inlineResponse4xx362.inlineResponse4xx362Errors) &&
        Objects.equals(this.inlineResponse4xx362Messages, inlineResponse4xx362.inlineResponse4xx362Messages) &&
        Objects.equals(this.inlineResponse4xx362Result, inlineResponse4xx362.inlineResponse4xx362Result) &&
        Objects.equals(this.inlineResponse4xx362Success, inlineResponse4xx362.inlineResponse4xx362Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx362Errors, inlineResponse4xx362Messages, inlineResponse4xx362Result, inlineResponse4xx362Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx362 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx362Errors: ").append(toIndentedString(inlineResponse4xx362Errors)).append("\n");
    sb.append("    inlineResponse4xx362Messages: ").append(toIndentedString(inlineResponse4xx362Messages)).append("\n");
    sb.append("    inlineResponse4xx362Result: ").append(toIndentedString(inlineResponse4xx362Result)).append("\n");
    sb.append("    inlineResponse4xx362Success: ").append(toIndentedString(inlineResponse4xx362Success)).append("\n");
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
