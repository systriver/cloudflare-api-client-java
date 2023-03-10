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
 * ArgoTunnelComponentsSchemasConnection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ArgoTunnelComponentsSchemasConnection {
  @SerializedName("colo_name")
  private String coloName = null;

  @SerializedName("is_pending_reconnect")
  private Boolean isPendingReconnect = null;

  @SerializedName("uuid")
  private String uuid = null;

  public ArgoTunnelComponentsSchemasConnection coloName(String coloName) {
    this.coloName = coloName;
    return this;
  }

   /**
   * Get coloName
   * @return coloName
  **/
  @Schema(description = "")
  public String getColoName() {
    return coloName;
  }

  public void setColoName(String coloName) {
    this.coloName = coloName;
  }

  public ArgoTunnelComponentsSchemasConnection isPendingReconnect(Boolean isPendingReconnect) {
    this.isPendingReconnect = isPendingReconnect;
    return this;
  }

   /**
   * Get isPendingReconnect
   * @return isPendingReconnect
  **/
  @Schema(description = "")
  public Boolean getIsPendingReconnect() {
    return isPendingReconnect;
  }

  public void setIsPendingReconnect(Boolean isPendingReconnect) {
    this.isPendingReconnect = isPendingReconnect;
  }

  public ArgoTunnelComponentsSchemasConnection uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }

   /**
   * Get uuid
   * @return uuid
  **/
  @Schema(description = "")
  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArgoTunnelComponentsSchemasConnection argoTunnelComponentsSchemasConnection = (ArgoTunnelComponentsSchemasConnection) o;
    return Objects.equals(this.coloName, argoTunnelComponentsSchemasConnection.coloName) &&
        Objects.equals(this.isPendingReconnect, argoTunnelComponentsSchemasConnection.isPendingReconnect) &&
        Objects.equals(this.uuid, argoTunnelComponentsSchemasConnection.uuid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coloName, isPendingReconnect, uuid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArgoTunnelComponentsSchemasConnection {\n");
    
    sb.append("    coloName: ").append(toIndentedString(coloName)).append("\n");
    sb.append("    isPendingReconnect: ").append(toIndentedString(isPendingReconnect)).append("\n");
    sb.append("    uuid: ").append(toIndentedString(uuid)).append("\n");
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
