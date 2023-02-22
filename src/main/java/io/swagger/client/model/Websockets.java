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
import io.swagger.client.model.SchemasBase;
import io.swagger.client.model.WebsocketsValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * WebSockets are open connections sustained between the client and the origin server. Inside a WebSockets connection, the client and the origin can pass data back and forth without having to reestablish sessions. This makes exchanging data within a WebSockets connection fast. WebSockets are often used for real-time applications such as live chat and gaming. For more information refer to [Can I use Cloudflare with Websockets](https://support.cloudflare.com/hc/en-us/articles/200169466-Can-I-use-Cloudflare-with-WebSockets-).
 */
@Schema(description = "WebSockets are open connections sustained between the client and the origin server. Inside a WebSockets connection, the client and the origin can pass data back and forth without having to reestablish sessions. This makes exchanging data within a WebSockets connection fast. WebSockets are often used for real-time applications such as live chat and gaming. For more information refer to [Can I use Cloudflare with Websockets](https://support.cloudflare.com/hc/en-us/articles/200169466-Can-I-use-Cloudflare-with-WebSockets-).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Websockets extends SchemasBase implements Setting {
  @SerializedName("id")
  private String websocketsId = null;

  @SerializedName("value")
  private WebsocketsValue websocketsValue = null;

  public Websockets websocketsId(String websocketsId) {
    this.websocketsId = websocketsId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return websocketsId
  **/
  @Schema(example = "websockets", description = "ID of the zone setting.")
  public String getWebsocketsId() {
    return websocketsId;
  }

  public void setWebsocketsId(String websocketsId) {
    this.websocketsId = websocketsId;
  }

  public Websockets websocketsValue(WebsocketsValue websocketsValue) {
    this.websocketsValue = websocketsValue;
    return this;
  }

   /**
   * Get websocketsValue
   * @return websocketsValue
  **/
  @Schema(description = "")
  public WebsocketsValue getWebsocketsValue() {
    return websocketsValue;
  }

  public void setWebsocketsValue(WebsocketsValue websocketsValue) {
    this.websocketsValue = websocketsValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Websockets websockets = (Websockets) o;
    return Objects.equals(this.websocketsId, websockets.websocketsId) &&
        Objects.equals(this.websocketsValue, websockets.websocketsValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(websocketsId, websocketsValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Websockets {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    websocketsId: ").append(toIndentedString(websocketsId)).append("\n");
    sb.append("    websocketsValue: ").append(toIndentedString(websocketsValue)).append("\n");
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