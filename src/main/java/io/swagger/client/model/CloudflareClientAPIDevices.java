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
import io.swagger.client.model.CloudflareClientAPIUser;
import io.swagger.client.model.Platform;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIDevices
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIDevices {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("device_type")
  private Platform deviceType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ip")
  private String ip = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("last_seen")
  private OffsetDateTime lastSeen = null;

  @SerializedName("mac_address")
  private String macAddress = null;

  @SerializedName("manufacturer")
  private String manufacturer = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("os_distro_name")
  private String osDistroName = null;

  @SerializedName("os_distro_revision")
  private String osDistroRevision = null;

  @SerializedName("os_version")
  private String osVersion = null;

  @SerializedName("revoked_at")
  private OffsetDateTime revokedAt = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  @SerializedName("updated")
  private OffsetDateTime updated = null;

  @SerializedName("user")
  private CloudflareClientAPIUser user = null;

  @SerializedName("version")
  private String version = null;

  public CloudflareClientAPIDevices created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public CloudflareClientAPIDevices deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean getDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public CloudflareClientAPIDevices deviceType(Platform deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Get deviceType
   * @return deviceType
  **/
  @Schema(description = "")
  public Platform getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(Platform deviceType) {
    this.deviceType = deviceType;
  }

  public CloudflareClientAPIDevices id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CloudflareClientAPIDevices ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * Get ip
   * @return ip
  **/
  @Schema(description = "")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public CloudflareClientAPIDevices key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CloudflareClientAPIDevices lastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * Get lastSeen
   * @return lastSeen
  **/
  @Schema(description = "")
  public OffsetDateTime getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(OffsetDateTime lastSeen) {
    this.lastSeen = lastSeen;
  }

  public CloudflareClientAPIDevices macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

   /**
   * Get macAddress
   * @return macAddress
  **/
  @Schema(description = "")
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public CloudflareClientAPIDevices manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Get manufacturer
   * @return manufacturer
  **/
  @Schema(description = "")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public CloudflareClientAPIDevices model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Get model
   * @return model
  **/
  @Schema(description = "")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public CloudflareClientAPIDevices name(String name) {
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

  public CloudflareClientAPIDevices osDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
    return this;
  }

   /**
   * Get osDistroName
   * @return osDistroName
  **/
  @Schema(description = "")
  public String getOsDistroName() {
    return osDistroName;
  }

  public void setOsDistroName(String osDistroName) {
    this.osDistroName = osDistroName;
  }

  public CloudflareClientAPIDevices osDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
    return this;
  }

   /**
   * Get osDistroRevision
   * @return osDistroRevision
  **/
  @Schema(description = "")
  public String getOsDistroRevision() {
    return osDistroRevision;
  }

  public void setOsDistroRevision(String osDistroRevision) {
    this.osDistroRevision = osDistroRevision;
  }

  public CloudflareClientAPIDevices osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Get osVersion
   * @return osVersion
  **/
  @Schema(description = "")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public CloudflareClientAPIDevices revokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
    return this;
  }

   /**
   * Get revokedAt
   * @return revokedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getRevokedAt() {
    return revokedAt;
  }

  public void setRevokedAt(OffsetDateTime revokedAt) {
    this.revokedAt = revokedAt;
  }

  public CloudflareClientAPIDevices serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Get serialNumber
   * @return serialNumber
  **/
  @Schema(description = "")
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public CloudflareClientAPIDevices updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }

  public CloudflareClientAPIDevices user(CloudflareClientAPIUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @Schema(description = "")
  public CloudflareClientAPIUser getUser() {
    return user;
  }

  public void setUser(CloudflareClientAPIUser user) {
    this.user = user;
  }

  public CloudflareClientAPIDevices version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(description = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIDevices cloudflareClientAPIDevices = (CloudflareClientAPIDevices) o;
    return Objects.equals(this.created, cloudflareClientAPIDevices.created) &&
        Objects.equals(this.deleted, cloudflareClientAPIDevices.deleted) &&
        Objects.equals(this.deviceType, cloudflareClientAPIDevices.deviceType) &&
        Objects.equals(this.id, cloudflareClientAPIDevices.id) &&
        Objects.equals(this.ip, cloudflareClientAPIDevices.ip) &&
        Objects.equals(this.key, cloudflareClientAPIDevices.key) &&
        Objects.equals(this.lastSeen, cloudflareClientAPIDevices.lastSeen) &&
        Objects.equals(this.macAddress, cloudflareClientAPIDevices.macAddress) &&
        Objects.equals(this.manufacturer, cloudflareClientAPIDevices.manufacturer) &&
        Objects.equals(this.model, cloudflareClientAPIDevices.model) &&
        Objects.equals(this.name, cloudflareClientAPIDevices.name) &&
        Objects.equals(this.osDistroName, cloudflareClientAPIDevices.osDistroName) &&
        Objects.equals(this.osDistroRevision, cloudflareClientAPIDevices.osDistroRevision) &&
        Objects.equals(this.osVersion, cloudflareClientAPIDevices.osVersion) &&
        Objects.equals(this.revokedAt, cloudflareClientAPIDevices.revokedAt) &&
        Objects.equals(this.serialNumber, cloudflareClientAPIDevices.serialNumber) &&
        Objects.equals(this.updated, cloudflareClientAPIDevices.updated) &&
        Objects.equals(this.user, cloudflareClientAPIDevices.user) &&
        Objects.equals(this.version, cloudflareClientAPIDevices.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, deleted, deviceType, id, ip, key, lastSeen, macAddress, manufacturer, model, name, osDistroName, osDistroRevision, osVersion, revokedAt, serialNumber, updated, user, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIDevices {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    osDistroName: ").append(toIndentedString(osDistroName)).append("\n");
    sb.append("    osDistroRevision: ").append(toIndentedString(osDistroRevision)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    revokedAt: ").append(toIndentedString(revokedAt)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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