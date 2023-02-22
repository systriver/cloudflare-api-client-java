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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;
/**
 * ComponentsSchemasZone
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasZone {
  @SerializedName("activated_on")
  private OffsetDateTime activatedOn = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  @SerializedName("development_mode")
  private BigDecimal developmentMode = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("original_dnshost")
  private String originalDnshost = null;

  @SerializedName("original_name_servers")
  private List<String> originalNameServers = new ArrayList<String>();

  @SerializedName("original_registrar")
  private String originalRegistrar = null;

   /**
   * The last time proof of ownership was detected and the zone was made active
   * @return activatedOn
  **/
  @Schema(example = "2014-01-02T00:01:00.123450Z", required = true, description = "The last time proof of ownership was detected and the zone was made active")
  public OffsetDateTime getActivatedOn() {
    return activatedOn;
  }

   /**
   * When the zone was created
   * @return createdOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", required = true, description = "When the zone was created")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

   /**
   * The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is 0.
   * @return developmentMode
  **/
  @Schema(example = "7200", required = true, description = "The interval (in seconds) from when development mode expires (positive integer) or last expired (negative integer) for the domain. If development mode has never been enabled, this value is 0.")
  public BigDecimal getDevelopmentMode() {
    return developmentMode;
  }

  public ComponentsSchemasZone id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

   /**
   * When the zone was last modified
   * @return modifiedOn
  **/
  @Schema(example = "2014-01-01T05:20:00.123450Z", required = true, description = "When the zone was last modified")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

   /**
   * The domain name
   * @return name
  **/
  @Schema(example = "example.com", required = true, description = "The domain name")
  public String getName() {
    return name;
  }

   /**
   * DNS host at the time of switching to Cloudflare
   * @return originalDnshost
  **/
  @Schema(example = "NameCheap", required = true, description = "DNS host at the time of switching to Cloudflare")
  public String getOriginalDnshost() {
    return originalDnshost;
  }

   /**
   * Original name servers before moving to Cloudflare Notes: Is this only available for full zones?
   * @return originalNameServers
  **/
  @Schema(example = "[\"ns1.originaldnshost.com\",\"ns2.originaldnshost.com\"]", required = true, description = "Original name servers before moving to Cloudflare Notes: Is this only available for full zones?")
  public List<String> getOriginalNameServers() {
    return originalNameServers;
  }

   /**
   * Registrar for the domain at the time of switching to Cloudflare
   * @return originalRegistrar
  **/
  @Schema(example = "GoDaddy", required = true, description = "Registrar for the domain at the time of switching to Cloudflare")
  public String getOriginalRegistrar() {
    return originalRegistrar;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsSchemasZone componentsSchemasZone = (ComponentsSchemasZone) o;
    return Objects.equals(this.activatedOn, componentsSchemasZone.activatedOn) &&
        Objects.equals(this.createdOn, componentsSchemasZone.createdOn) &&
        Objects.equals(this.developmentMode, componentsSchemasZone.developmentMode) &&
        Objects.equals(this.id, componentsSchemasZone.id) &&
        Objects.equals(this.modifiedOn, componentsSchemasZone.modifiedOn) &&
        Objects.equals(this.name, componentsSchemasZone.name) &&
        Objects.equals(this.originalDnshost, componentsSchemasZone.originalDnshost) &&
        Objects.equals(this.originalNameServers, componentsSchemasZone.originalNameServers) &&
        Objects.equals(this.originalRegistrar, componentsSchemasZone.originalRegistrar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activatedOn, createdOn, developmentMode, id, modifiedOn, name, originalDnshost, originalNameServers, originalRegistrar);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasZone {\n");
    
    sb.append("    activatedOn: ").append(toIndentedString(activatedOn)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    developmentMode: ").append(toIndentedString(developmentMode)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalDnshost: ").append(toIndentedString(originalDnshost)).append("\n");
    sb.append("    originalNameServers: ").append(toIndentedString(originalNameServers)).append("\n");
    sb.append("    originalRegistrar: ").append(toIndentedString(originalRegistrar)).append("\n");
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