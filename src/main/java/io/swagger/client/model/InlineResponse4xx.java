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
import io.swagger.client.model.CloudflareClientAPIResponseCollection;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * InlineResponse4xx
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class InlineResponse4xx extends CloudflareClientAPIResponseCollection {
  @SerializedName("errors")
  private Object inlineResponse4xxErrors = null;

  @SerializedName("messages")
  private Object inlineResponse4xxMessages = null;

  @SerializedName("result")
  private Object inlineResponse4xxResult = null;

  @SerializedName("success")
  private Boolean inlineResponse4xxSuccess = null;

  public InlineResponse4xx inlineResponse4xxErrors(Object inlineResponse4xxErrors) {
    this.inlineResponse4xxErrors = inlineResponse4xxErrors;
    return this;
  }

   /**
   * Get inlineResponse4xxErrors
   * @return inlineResponse4xxErrors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public Object getInlineResponse4xxErrors() {
    return inlineResponse4xxErrors;
  }

  public void setInlineResponse4xxErrors(Object inlineResponse4xxErrors) {
    this.inlineResponse4xxErrors = inlineResponse4xxErrors;
  }

  public InlineResponse4xx inlineResponse4xxMessages(Object inlineResponse4xxMessages) {
    this.inlineResponse4xxMessages = inlineResponse4xxMessages;
    return this;
  }

   /**
   * Get inlineResponse4xxMessages
   * @return inlineResponse4xxMessages
  **/
  @Schema(example = "[]", required = true, description = "")
  public Object getInlineResponse4xxMessages() {
    return inlineResponse4xxMessages;
  }

  public void setInlineResponse4xxMessages(Object inlineResponse4xxMessages) {
    this.inlineResponse4xxMessages = inlineResponse4xxMessages;
  }

  public InlineResponse4xx inlineResponse4xxResult(Object inlineResponse4xxResult) {
    this.inlineResponse4xxResult = inlineResponse4xxResult;
    return this;
  }

   /**
   * Get inlineResponse4xxResult
   * @return inlineResponse4xxResult
  **/
  @Schema(required = true, description = "")
  public Object getInlineResponse4xxResult() {
    return inlineResponse4xxResult;
  }

  public void setInlineResponse4xxResult(Object inlineResponse4xxResult) {
    this.inlineResponse4xxResult = inlineResponse4xxResult;
  }

  public InlineResponse4xx inlineResponse4xxSuccess(Boolean inlineResponse4xxSuccess) {
    this.inlineResponse4xxSuccess = inlineResponse4xxSuccess;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return inlineResponse4xxSuccess
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean getInlineResponse4xxSuccess() {
    return inlineResponse4xxSuccess;
  }

  public void setInlineResponse4xxSuccess(Boolean inlineResponse4xxSuccess) {
    this.inlineResponse4xxSuccess = inlineResponse4xxSuccess;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse4xx inlineResponse4xx = (InlineResponse4xx) o;
    return Objects.equals(this.inlineResponse4xxErrors, inlineResponse4xx.inlineResponse4xxErrors) &&
        Objects.equals(this.inlineResponse4xxMessages, inlineResponse4xx.inlineResponse4xxMessages) &&
        Objects.equals(this.inlineResponse4xxResult, inlineResponse4xx.inlineResponse4xxResult) &&
        Objects.equals(this.inlineResponse4xxSuccess, inlineResponse4xx.inlineResponse4xxSuccess) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inlineResponse4xxErrors, inlineResponse4xxMessages, inlineResponse4xxResult, inlineResponse4xxSuccess, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse4xx {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    inlineResponse4xxErrors: ").append(toIndentedString(inlineResponse4xxErrors)).append("\n");
    sb.append("    inlineResponse4xxMessages: ").append(toIndentedString(inlineResponse4xxMessages)).append("\n");
    sb.append("    inlineResponse4xxResult: ").append(toIndentedString(inlineResponse4xxResult)).append("\n");
    sb.append("    inlineResponse4xxSuccess: ").append(toIndentedString(inlineResponse4xxSuccess)).append("\n");
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
