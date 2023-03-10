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
import io.swagger.client.model.Gre;
import io.swagger.client.model.SchemasHealthCheck;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ComponentsSchemasTunnelUpdateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasTunnelUpdateRequest {
  @SerializedName("description")
  private String description = null;

  @SerializedName("gre")
  private Gre gre = null;

  @SerializedName("health_check")
  private SchemasHealthCheck healthCheck = null;

  @SerializedName("interface_address")
  private String interfaceAddress = null;

  @SerializedName("mtu")
  private Integer mtu = null;

  public ComponentsSchemasTunnelUpdateRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ComponentsSchemasTunnelUpdateRequest gre(Gre gre) {
    this.gre = gre;
    return this;
  }

   /**
   * Get gre
   * @return gre
  **/
  @Schema(description = "")
  public Gre getGre() {
    return gre;
  }

  public void setGre(Gre gre) {
    this.gre = gre;
  }

  public ComponentsSchemasTunnelUpdateRequest healthCheck(SchemasHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
    return this;
  }

   /**
   * Get healthCheck
   * @return healthCheck
  **/
  @Schema(description = "")
  public SchemasHealthCheck getHealthCheck() {
    return healthCheck;
  }

  public void setHealthCheck(SchemasHealthCheck healthCheck) {
    this.healthCheck = healthCheck;
  }

  public ComponentsSchemasTunnelUpdateRequest interfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
    return this;
  }

   /**
   * Get interfaceAddress
   * @return interfaceAddress
  **/
  @Schema(description = "")
  public String getInterfaceAddress() {
    return interfaceAddress;
  }

  public void setInterfaceAddress(String interfaceAddress) {
    this.interfaceAddress = interfaceAddress;
  }

  public ComponentsSchemasTunnelUpdateRequest mtu(Integer mtu) {
    this.mtu = mtu;
    return this;
  }

   /**
   * Get mtu
   * @return mtu
  **/
  @Schema(description = "")
  public Integer getMtu() {
    return mtu;
  }

  public void setMtu(Integer mtu) {
    this.mtu = mtu;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsSchemasTunnelUpdateRequest componentsSchemasTunnelUpdateRequest = (ComponentsSchemasTunnelUpdateRequest) o;
    return Objects.equals(this.description, componentsSchemasTunnelUpdateRequest.description) &&
        Objects.equals(this.gre, componentsSchemasTunnelUpdateRequest.gre) &&
        Objects.equals(this.healthCheck, componentsSchemasTunnelUpdateRequest.healthCheck) &&
        Objects.equals(this.interfaceAddress, componentsSchemasTunnelUpdateRequest.interfaceAddress) &&
        Objects.equals(this.mtu, componentsSchemasTunnelUpdateRequest.mtu);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, gre, healthCheck, interfaceAddress, mtu);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasTunnelUpdateRequest {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    gre: ").append(toIndentedString(gre)).append("\n");
    sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
    sb.append("    interfaceAddress: ").append(toIndentedString(interfaceAddress)).append("\n");
    sb.append("    mtu: ").append(toIndentedString(mtu)).append("\n");
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
