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
import io.swagger.client.model.DnsSecondarySecondaryZoneComponentsSchemasIdentifier;
import io.swagger.client.model.Peers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * CloudflareClientAPISingleResponseIncomingResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPISingleResponseIncomingResult {
  @SerializedName("auto_refresh_seconds")
  private BigDecimal autoRefreshSeconds = null;

  @SerializedName("checked_time")
  private String checkedTime = null;

  @SerializedName("created_time")
  private String createdTime = null;

  @SerializedName("id")
  private DnsSecondarySecondaryZoneComponentsSchemasIdentifier id = null;

  @SerializedName("modified_time")
  private String modifiedTime = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("peers")
  private Peers peers = null;

  @SerializedName("soa_serial")
  private BigDecimal soaSerial = null;

  public CloudflareClientAPISingleResponseIncomingResult autoRefreshSeconds(BigDecimal autoRefreshSeconds) {
    this.autoRefreshSeconds = autoRefreshSeconds;
    return this;
  }

   /**
   * Get autoRefreshSeconds
   * @return autoRefreshSeconds
  **/
  @Schema(description = "")
  public BigDecimal getAutoRefreshSeconds() {
    return autoRefreshSeconds;
  }

  public void setAutoRefreshSeconds(BigDecimal autoRefreshSeconds) {
    this.autoRefreshSeconds = autoRefreshSeconds;
  }

  public CloudflareClientAPISingleResponseIncomingResult checkedTime(String checkedTime) {
    this.checkedTime = checkedTime;
    return this;
  }

   /**
   * Get checkedTime
   * @return checkedTime
  **/
  @Schema(description = "")
  public String getCheckedTime() {
    return checkedTime;
  }

  public void setCheckedTime(String checkedTime) {
    this.checkedTime = checkedTime;
  }

  public CloudflareClientAPISingleResponseIncomingResult createdTime(String createdTime) {
    this.createdTime = createdTime;
    return this;
  }

   /**
   * Get createdTime
   * @return createdTime
  **/
  @Schema(description = "")
  public String getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(String createdTime) {
    this.createdTime = createdTime;
  }

  public CloudflareClientAPISingleResponseIncomingResult id(DnsSecondarySecondaryZoneComponentsSchemasIdentifier id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public DnsSecondarySecondaryZoneComponentsSchemasIdentifier getId() {
    return id;
  }

  public void setId(DnsSecondarySecondaryZoneComponentsSchemasIdentifier id) {
    this.id = id;
  }

  public CloudflareClientAPISingleResponseIncomingResult modifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
    return this;
  }

   /**
   * Get modifiedTime
   * @return modifiedTime
  **/
  @Schema(description = "")
  public String getModifiedTime() {
    return modifiedTime;
  }

  public void setModifiedTime(String modifiedTime) {
    this.modifiedTime = modifiedTime;
  }

  public CloudflareClientAPISingleResponseIncomingResult name(String name) {
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

  public CloudflareClientAPISingleResponseIncomingResult peers(Peers peers) {
    this.peers = peers;
    return this;
  }

   /**
   * Get peers
   * @return peers
  **/
  @Schema(description = "")
  public Peers getPeers() {
    return peers;
  }

  public void setPeers(Peers peers) {
    this.peers = peers;
  }

  public CloudflareClientAPISingleResponseIncomingResult soaSerial(BigDecimal soaSerial) {
    this.soaSerial = soaSerial;
    return this;
  }

   /**
   * Get soaSerial
   * @return soaSerial
  **/
  @Schema(description = "")
  public BigDecimal getSoaSerial() {
    return soaSerial;
  }

  public void setSoaSerial(BigDecimal soaSerial) {
    this.soaSerial = soaSerial;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPISingleResponseIncomingResult cloudflareClientAPISingleResponseIncomingResult = (CloudflareClientAPISingleResponseIncomingResult) o;
    return Objects.equals(this.autoRefreshSeconds, cloudflareClientAPISingleResponseIncomingResult.autoRefreshSeconds) &&
        Objects.equals(this.checkedTime, cloudflareClientAPISingleResponseIncomingResult.checkedTime) &&
        Objects.equals(this.createdTime, cloudflareClientAPISingleResponseIncomingResult.createdTime) &&
        Objects.equals(this.id, cloudflareClientAPISingleResponseIncomingResult.id) &&
        Objects.equals(this.modifiedTime, cloudflareClientAPISingleResponseIncomingResult.modifiedTime) &&
        Objects.equals(this.name, cloudflareClientAPISingleResponseIncomingResult.name) &&
        Objects.equals(this.peers, cloudflareClientAPISingleResponseIncomingResult.peers) &&
        Objects.equals(this.soaSerial, cloudflareClientAPISingleResponseIncomingResult.soaSerial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRefreshSeconds, checkedTime, createdTime, id, modifiedTime, name, peers, soaSerial);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPISingleResponseIncomingResult {\n");
    
    sb.append("    autoRefreshSeconds: ").append(toIndentedString(autoRefreshSeconds)).append("\n");
    sb.append("    checkedTime: ").append(toIndentedString(checkedTime)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedTime: ").append(toIndentedString(modifiedTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    peers: ").append(toIndentedString(peers)).append("\n");
    sb.append("    soaSerial: ").append(toIndentedString(soaSerial)).append("\n");
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
