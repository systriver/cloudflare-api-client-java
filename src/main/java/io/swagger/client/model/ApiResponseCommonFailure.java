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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ApiResponseCommonFailure
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ApiResponseCommonFailure {
  @SerializedName("errors")
  private AllOfapiResponseCommonFailureErrors errors = null;

  @SerializedName("messages")
  private AllOfapiResponseCommonFailureMessages messages = null;

  @SerializedName("result")
  private Object result = null;

  @SerializedName("success")
  private Boolean success = null;

  public ApiResponseCommonFailure errors(AllOfapiResponseCommonFailureErrors errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @Schema(example = "[{\"code\":7003,\"message\":\"No route for the URI\"}]", required = true, description = "")
  public AllOfapiResponseCommonFailureErrors getErrors() {
    return errors;
  }

  public void setErrors(AllOfapiResponseCommonFailureErrors errors) {
    this.errors = errors;
  }

  public ApiResponseCommonFailure messages(AllOfapiResponseCommonFailureMessages messages) {
    this.messages = messages;
    return this;
  }

   /**
   * Get messages
   * @return messages
  **/
  @Schema(example = "[]", required = true, description = "")
  public AllOfapiResponseCommonFailureMessages getMessages() {
    return messages;
  }

  public void setMessages(AllOfapiResponseCommonFailureMessages messages) {
    this.messages = messages;
  }

  public ApiResponseCommonFailure result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Get result
   * @return result
  **/
  @Schema(required = true, description = "")
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  public ApiResponseCommonFailure success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Whether the API call was successful
   * @return success
  **/
  @Schema(example = "false", required = true, description = "Whether the API call was successful")
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiResponseCommonFailure apiResponseCommonFailure = (ApiResponseCommonFailure) o;
    return Objects.equals(this.errors, apiResponseCommonFailure.errors) &&
        Objects.equals(this.messages, apiResponseCommonFailure.messages) &&
        Objects.equals(this.result, apiResponseCommonFailure.result) &&
        Objects.equals(this.success, apiResponseCommonFailure.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, messages, result, success);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiResponseCommonFailure {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
