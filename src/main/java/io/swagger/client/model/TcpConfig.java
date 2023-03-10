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
 * Parameters specific to TCP health check.
 */
@Schema(description = "Parameters specific to TCP health check.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class TcpConfig {
  /**
   * The TCP connection method to use for the health check.
   */
  @JsonAdapter(MethodEnum.Adapter.class)
  public enum MethodEnum {
    CONNECTION_ESTABLISHED("connection_established");

    private String value;

    MethodEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static MethodEnum fromValue(String input) {
      for (MethodEnum b : MethodEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<MethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MethodEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public MethodEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return MethodEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("method")
  private MethodEnum method = MethodEnum.CONNECTION_ESTABLISHED;

  @SerializedName("port")
  private Integer port = 80;

  public TcpConfig method(MethodEnum method) {
    this.method = method;
    return this;
  }

   /**
   * The TCP connection method to use for the health check.
   * @return method
  **/
  @Schema(description = "The TCP connection method to use for the health check.")
  public MethodEnum getMethod() {
    return method;
  }

  public void setMethod(MethodEnum method) {
    this.method = method;
  }

  public TcpConfig port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number to connect to for the health check. Defaults to 80.
   * @return port
  **/
  @Schema(description = "Port number to connect to for the health check. Defaults to 80.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TcpConfig tcpConfig = (TcpConfig) o;
    return Objects.equals(this.method, tcpConfig.method) &&
        Objects.equals(this.port, tcpConfig.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(method, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TcpConfig {\n");
    
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
