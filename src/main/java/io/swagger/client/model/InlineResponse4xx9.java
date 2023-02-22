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
import io.swagger.client.model.AdvertisedResponse;
import io.swagger.client.model.ApiResponseCommonFailure;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx9
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx9 extends AdvertisedResponse {
  @SerializedName("errors")
  private Object inlineResponse4xx9Errors = null;

  @SerializedName("messages")
  private Object inlineResponse4xx9Messages = null;

  @SerializedName("result")
  private Object inlineResponse4xx9Result = null;

  @SerializedName("success")
  private Boolean inlineResponse4xx9Success = null;

  public InlineResponse4xx9 inlineResponse4xx9Errors(Object inlineResponse4xx9Errors) {
    this.inlineResponse4xx9Errors = inlineResponse4xx9Errors;
    return this;
  }

   /**
   * Get inlineResponse4xx9Errors
   * @return inlineResponse4xx9Errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xx9Errors() {
    return inlineResponse4xx9Errors;
  }

  public void setInlineResponse4xx9Errors(Object inlineResponse4xx9Errors) {
    this.inlineResponse4xx9Errors = inlineResponse4xx9Errors;
  }

  public InlineResponse4xx9 inlineResponse4xx9Messages(Object inlineResponse4xx9Messages) {
    this.inlineResponse4xx9Messages = inlineResponse4xx9Messages;
    return this;
  }

   /**
   * Get inlineResponse4xx9Messages
   * @return inlineResponse4xx9Messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xx9Messages() {
    return inlineResponse4xx9Messages;
  }

  public void setInlineResponse4xx9Messages(Object inlineResponse4xx9Messages) {
    this.inlineResponse4xx9Messages = inlineResponse4xx9Messages;
  }

  public InlineResponse4xx9 inlineResponse4xx9Result(Object inlineResponse4xx9Result) {
    this.inlineResponse4xx9Result = inlineResponse4xx9Result;
    return this;
  }

   /**
   * Get inlineResponse4xx9Result
   * @return inlineResponse4xx9Result
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xx9Result() {
    return inlineResponse4xx9Result;
  }

  public void setInlineResponse4xx9Result(Object inlineResponse4xx9Result) {
    this.inlineResponse4xx9Result = inlineResponse4xx9Result;
  }

  public InlineResponse4xx9 inlineResponse4xx9Success(Boolean inlineResponse4xx9Success) {
    this.inlineResponse4xx9Success = inlineResponse4xx9Success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xx9Success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xx9Success() {
    return inlineResponse4xx9Success;
  }

  public void setInlineResponse4xx9Success(Boolean inlineResponse4xx9Success) {
    this.inlineResponse4xx9Success = inlineResponse4xx9Success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx9 inlineResponse4xx9 = (InlineResponse4xx9) o;
    return Objects.equals(this.inlineResponse4xx9Errors, inlineResponse4xx9.inlineResponse4xx9Errors) &&
        Objects.equals(this.inlineResponse4xx9Messages, inlineResponse4xx9.inlineResponse4xx9Messages) &&
        Objects.equals(this.inlineResponse4xx9Result, inlineResponse4xx9.inlineResponse4xx9Result) &&
        Objects.equals(this.inlineResponse4xx9Success, inlineResponse4xx9.inlineResponse4xx9Success) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xx9Errors, inlineResponse4xx9Messages, inlineResponse4xx9Result, inlineResponse4xx9Success, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx9 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xx9Errors: ").append(toIndentedString(inlineResponse4xx9Errors)).append("\n");
    sb.append("    inlineResponse4xx9Messages: ").append(toIndentedString(inlineResponse4xx9Messages)).append("\n");
    sb.append("    inlineResponse4xx9Result: ").append(toIndentedString(inlineResponse4xx9Result)).append("\n");
    sb.append("    inlineResponse4xx9Success: ").append(toIndentedString(inlineResponse4xx9Success)).append("\n");
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
