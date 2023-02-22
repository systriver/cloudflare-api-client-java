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
import io.swagger.client.model.CloudflareClientAPICheckRegions;
import io.swagger.client.model.LoadShedding;
import io.swagger.client.model.NotificationFilter;
import io.swagger.client.model.OriginSteering;
import io.swagger.client.model.Origins;
import io.swagger.client.model.SchemasMonitor;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * PoolsIdentifierBody3
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PoolsIdentifierBody3 {
  @SerializedName("check_regions")
  private CloudflareClientAPICheckRegions checkRegions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disabled_at")
  private OffsetDateTime disabledAt = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("latitude")
  private BigDecimal latitude = null;

  @SerializedName("load_shedding")
  private LoadShedding loadShedding = null;

  @SerializedName("longitude")
  private BigDecimal longitude = null;

  @SerializedName("minimum_origins")
  private Integer minimumOrigins = null;

  @SerializedName("monitor")
  private SchemasMonitor monitor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("notification_email")
  private String notificationEmail = null;

  @SerializedName("notification_filter")
  private NotificationFilter notificationFilter = null;

  @SerializedName("origin_steering")
  private OriginSteering originSteering = null;

  @SerializedName("origins")
  private Origins origins = null;

  public PoolsIdentifierBody3 checkRegions(CloudflareClientAPICheckRegions checkRegions) {
    this.checkRegions = checkRegions;
    return this;
  }

   /**
   * Get checkRegions
   * @return checkRegions
  **/
  @Schema(description = "")
  public CloudflareClientAPICheckRegions getCheckRegions() {
    return checkRegions;
  }

  public void setCheckRegions(CloudflareClientAPICheckRegions checkRegions) {
    this.checkRegions = checkRegions;
  }

  public PoolsIdentifierBody3 description(String description) {
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

  public PoolsIdentifierBody3 disabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
    return this;
  }

   /**
   * Get disabledAt
   * @return disabledAt
  **/
  @Schema(description = "")
  public OffsetDateTime getDisabledAt() {
    return disabledAt;
  }

  public void setDisabledAt(OffsetDateTime disabledAt) {
    this.disabledAt = disabledAt;
  }

  public PoolsIdentifierBody3 enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public PoolsIdentifierBody3 latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @Schema(description = "")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public PoolsIdentifierBody3 loadShedding(LoadShedding loadShedding) {
    this.loadShedding = loadShedding;
    return this;
  }

   /**
   * Get loadShedding
   * @return loadShedding
  **/
  @Schema(description = "")
  public LoadShedding getLoadShedding() {
    return loadShedding;
  }

  public void setLoadShedding(LoadShedding loadShedding) {
    this.loadShedding = loadShedding;
  }

  public PoolsIdentifierBody3 longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @Schema(description = "")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public PoolsIdentifierBody3 minimumOrigins(Integer minimumOrigins) {
    this.minimumOrigins = minimumOrigins;
    return this;
  }

   /**
   * Get minimumOrigins
   * @return minimumOrigins
  **/
  @Schema(description = "")
  public Integer getMinimumOrigins() {
    return minimumOrigins;
  }

  public void setMinimumOrigins(Integer minimumOrigins) {
    this.minimumOrigins = minimumOrigins;
  }

  public PoolsIdentifierBody3 monitor(SchemasMonitor monitor) {
    this.monitor = monitor;
    return this;
  }

   /**
   * Get monitor
   * @return monitor
  **/
  @Schema(description = "")
  public SchemasMonitor getMonitor() {
    return monitor;
  }

  public void setMonitor(SchemasMonitor monitor) {
    this.monitor = monitor;
  }

  public PoolsIdentifierBody3 name(String name) {
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

  public PoolsIdentifierBody3 notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

   /**
   * Get notificationEmail
   * @return notificationEmail
  **/
  @Schema(description = "")
  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }

  public PoolsIdentifierBody3 notificationFilter(NotificationFilter notificationFilter) {
    this.notificationFilter = notificationFilter;
    return this;
  }

   /**
   * Get notificationFilter
   * @return notificationFilter
  **/
  @Schema(description = "")
  public NotificationFilter getNotificationFilter() {
    return notificationFilter;
  }

  public void setNotificationFilter(NotificationFilter notificationFilter) {
    this.notificationFilter = notificationFilter;
  }

  public PoolsIdentifierBody3 originSteering(OriginSteering originSteering) {
    this.originSteering = originSteering;
    return this;
  }

   /**
   * Get originSteering
   * @return originSteering
  **/
  @Schema(description = "")
  public OriginSteering getOriginSteering() {
    return originSteering;
  }

  public void setOriginSteering(OriginSteering originSteering) {
    this.originSteering = originSteering;
  }

  public PoolsIdentifierBody3 origins(Origins origins) {
    this.origins = origins;
    return this;
  }

   /**
   * Get origins
   * @return origins
  **/
  @Schema(description = "")
  public Origins getOrigins() {
    return origins;
  }

  public void setOrigins(Origins origins) {
    this.origins = origins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoolsIdentifierBody3 poolsIdentifierBody3 = (PoolsIdentifierBody3) o;
    return Objects.equals(this.checkRegions, poolsIdentifierBody3.checkRegions) &&
        Objects.equals(this.description, poolsIdentifierBody3.description) &&
        Objects.equals(this.disabledAt, poolsIdentifierBody3.disabledAt) &&
        Objects.equals(this.enabled, poolsIdentifierBody3.enabled) &&
        Objects.equals(this.latitude, poolsIdentifierBody3.latitude) &&
        Objects.equals(this.loadShedding, poolsIdentifierBody3.loadShedding) &&
        Objects.equals(this.longitude, poolsIdentifierBody3.longitude) &&
        Objects.equals(this.minimumOrigins, poolsIdentifierBody3.minimumOrigins) &&
        Objects.equals(this.monitor, poolsIdentifierBody3.monitor) &&
        Objects.equals(this.name, poolsIdentifierBody3.name) &&
        Objects.equals(this.notificationEmail, poolsIdentifierBody3.notificationEmail) &&
        Objects.equals(this.notificationFilter, poolsIdentifierBody3.notificationFilter) &&
        Objects.equals(this.originSteering, poolsIdentifierBody3.originSteering) &&
        Objects.equals(this.origins, poolsIdentifierBody3.origins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkRegions, description, disabledAt, enabled, latitude, loadShedding, longitude, minimumOrigins, monitor, name, notificationEmail, notificationFilter, originSteering, origins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoolsIdentifierBody3 {\n");
    
    sb.append("    checkRegions: ").append(toIndentedString(checkRegions)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabledAt: ").append(toIndentedString(disabledAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    loadShedding: ").append(toIndentedString(loadShedding)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    minimumOrigins: ").append(toIndentedString(minimumOrigins)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    notificationFilter: ").append(toIndentedString(notificationFilter)).append("\n");
    sb.append("    originSteering: ").append(toIndentedString(originSteering)).append("\n");
    sb.append("    origins: ").append(toIndentedString(origins)).append("\n");
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
