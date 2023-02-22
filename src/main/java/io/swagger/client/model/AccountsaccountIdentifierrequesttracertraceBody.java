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
 * AccountsaccountIdentifierrequesttracertraceBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AccountsaccountIdentifierrequesttracertraceBody {
  @SerializedName("base64")
  private String base64 = null;

  @SerializedName("json")
  private Object json = null;

  @SerializedName("plain_text")
  private String plainText = null;

  public AccountsaccountIdentifierrequesttracertraceBody base64(String base64) {
    this.base64 = base64;
    return this;
  }

   /**
   * Base64 encoded request body
   * @return base64
  **/
  @Schema(example = "c29tZV9yZXF1ZXN0X2JvZHk=", description = "Base64 encoded request body")
  public String getBase64() {
    return base64;
  }

  public void setBase64(String base64) {
    this.base64 = base64;
  }

  public AccountsaccountIdentifierrequesttracertraceBody json(Object json) {
    this.json = json;
    return this;
  }

   /**
   * Arbitrary json as request body
   * @return json
  **/
  @Schema(description = "Arbitrary json as request body")
  public Object getJson() {
    return json;
  }

  public void setJson(Object json) {
    this.json = json;
  }

  public AccountsaccountIdentifierrequesttracertraceBody plainText(String plainText) {
    this.plainText = plainText;
    return this;
  }

   /**
   * Request body as plain text
   * @return plainText
  **/
  @Schema(description = "Request body as plain text")
  public String getPlainText() {
    return plainText;
  }

  public void setPlainText(String plainText) {
    this.plainText = plainText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsaccountIdentifierrequesttracertraceBody accountsaccountIdentifierrequesttracertraceBody = (AccountsaccountIdentifierrequesttracertraceBody) o;
    return Objects.equals(this.base64, accountsaccountIdentifierrequesttracertraceBody.base64) &&
        Objects.equals(this.json, accountsaccountIdentifierrequesttracertraceBody.json) &&
        Objects.equals(this.plainText, accountsaccountIdentifierrequesttracertraceBody.plainText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64, json, plainText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsaccountIdentifierrequesttracertraceBody {\n");
    
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    plainText: ").append(toIndentedString(plainText)).append("\n");
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