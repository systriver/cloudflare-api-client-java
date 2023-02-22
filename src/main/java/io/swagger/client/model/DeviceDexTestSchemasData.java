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
 * The configuration object which contains the details for the WARP client to conduct the test.
 */
@Schema(description = "The configuration object which contains the details for the WARP client to conduct the test.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DeviceDexTestSchemasData {
  @SerializedName("host")
  private String host = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("method")
  private String method = null;

  public DeviceDexTestSchemasData host(String host) {
    this.host = host;
    return this;
  }

   /**
   * The desired endpoint to test.
   * @return host
  **/
  @Schema(example = "https://dash.cloudflare.com", description = "The desired endpoint to test.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public DeviceDexTestSchemasData kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * The type of test.
   * @return kind
  **/
  @Schema(example = "http", description = "The type of test.")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public DeviceDexTestSchemasData method(String method) {
    this.method = method;
    return this;
  }

   /**
   * The HTTP request method type.
   * @return method
  **/
  @Schema(example = "GET", description = "The HTTP request method type.")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceDexTestSchemasData deviceDexTestSchemasData = (DeviceDexTestSchemasData) o;
    return Objects.equals(this.host, deviceDexTestSchemasData.host) &&
        Objects.equals(this.kind, deviceDexTestSchemasData.kind) &&
        Objects.equals(this.method, deviceDexTestSchemasData.method);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, kind, method);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceDexTestSchemasData {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
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
