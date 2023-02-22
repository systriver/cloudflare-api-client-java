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
import io.swagger.client.model.DeviceManagedNetworksComponentsSchemasType;
import io.swagger.client.model.SchemasConfigRequest;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * NetworksUuidBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class NetworksUuidBody {
  @SerializedName("config")
  private SchemasConfigRequest config = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private DeviceManagedNetworksComponentsSchemasType type = null;

  public NetworksUuidBody config(SchemasConfigRequest config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @Schema(description = "")
  public SchemasConfigRequest getConfig() {
    return config;
  }

  public void setConfig(SchemasConfigRequest config) {
    this.config = config;
  }

  public NetworksUuidBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworksUuidBody type(DeviceManagedNetworksComponentsSchemasType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @Schema(description = "")
  public DeviceManagedNetworksComponentsSchemasType getType() {
    return type;
  }

  public void setType(DeviceManagedNetworksComponentsSchemasType type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworksUuidBody networksUuidBody = (NetworksUuidBody) o;
    return Objects.equals(this.config, networksUuidBody.config) &&
        Objects.equals(this.name, networksUuidBody.name) &&
        Objects.equals(this.type, networksUuidBody.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworksUuidBody {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
