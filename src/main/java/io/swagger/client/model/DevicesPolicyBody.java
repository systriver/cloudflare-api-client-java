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
import io.swagger.client.model.ServiceModeV2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * DevicesPolicyBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DevicesPolicyBody {
  @SerializedName("allow_mode_switch")
  private Boolean allowModeSwitch = null;

  @SerializedName("allow_updates")
  private Boolean allowUpdates = null;

  @SerializedName("allowed_to_leave")
  private Boolean allowedToLeave = null;

  @SerializedName("auto_connect")
  private BigDecimal autoConnect = null;

  @SerializedName("captive_portal")
  private BigDecimal captivePortal = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disable_auto_fallback")
  private Boolean disableAutoFallback = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("exclude_office_ips")
  private Boolean excludeOfficeIps = null;

  @SerializedName("match")
  private String match = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("precedence")
  private BigDecimal precedence = null;

  @SerializedName("service_mode_v2")
  private ServiceModeV2 serviceModeV2 = null;

  @SerializedName("support_url")
  private String supportUrl = null;

  @SerializedName("switch_locked")
  private Boolean switchLocked = null;

  public DevicesPolicyBody allowModeSwitch(Boolean allowModeSwitch) {
    this.allowModeSwitch = allowModeSwitch;
    return this;
  }

   /**
   * Get allowModeSwitch
   * @return allowModeSwitch
  **/
  @Schema(description = "")
  public Boolean getAllowModeSwitch() {
    return allowModeSwitch;
  }

  public void setAllowModeSwitch(Boolean allowModeSwitch) {
    this.allowModeSwitch = allowModeSwitch;
  }

  public DevicesPolicyBody allowUpdates(Boolean allowUpdates) {
    this.allowUpdates = allowUpdates;
    return this;
  }

   /**
   * Get allowUpdates
   * @return allowUpdates
  **/
  @Schema(description = "")
  public Boolean getAllowUpdates() {
    return allowUpdates;
  }

  public void setAllowUpdates(Boolean allowUpdates) {
    this.allowUpdates = allowUpdates;
  }

  public DevicesPolicyBody allowedToLeave(Boolean allowedToLeave) {
    this.allowedToLeave = allowedToLeave;
    return this;
  }

   /**
   * Get allowedToLeave
   * @return allowedToLeave
  **/
  @Schema(description = "")
  public Boolean getAllowedToLeave() {
    return allowedToLeave;
  }

  public void setAllowedToLeave(Boolean allowedToLeave) {
    this.allowedToLeave = allowedToLeave;
  }

  public DevicesPolicyBody autoConnect(BigDecimal autoConnect) {
    this.autoConnect = autoConnect;
    return this;
  }

   /**
   * Get autoConnect
   * @return autoConnect
  **/
  @Schema(description = "")
  public BigDecimal getAutoConnect() {
    return autoConnect;
  }

  public void setAutoConnect(BigDecimal autoConnect) {
    this.autoConnect = autoConnect;
  }

  public DevicesPolicyBody captivePortal(BigDecimal captivePortal) {
    this.captivePortal = captivePortal;
    return this;
  }

   /**
   * Get captivePortal
   * @return captivePortal
  **/
  @Schema(description = "")
  public BigDecimal getCaptivePortal() {
    return captivePortal;
  }

  public void setCaptivePortal(BigDecimal captivePortal) {
    this.captivePortal = captivePortal;
  }

  public DevicesPolicyBody description(String description) {
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

  public DevicesPolicyBody disableAutoFallback(Boolean disableAutoFallback) {
    this.disableAutoFallback = disableAutoFallback;
    return this;
  }

   /**
   * Get disableAutoFallback
   * @return disableAutoFallback
  **/
  @Schema(description = "")
  public Boolean getDisableAutoFallback() {
    return disableAutoFallback;
  }

  public void setDisableAutoFallback(Boolean disableAutoFallback) {
    this.disableAutoFallback = disableAutoFallback;
  }

  public DevicesPolicyBody enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the policy will be applied to matching devices.
   * @return enabled
  **/
  @Schema(example = "true", description = "Whether the policy will be applied to matching devices.")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public DevicesPolicyBody excludeOfficeIps(Boolean excludeOfficeIps) {
    this.excludeOfficeIps = excludeOfficeIps;
    return this;
  }

   /**
   * Get excludeOfficeIps
   * @return excludeOfficeIps
  **/
  @Schema(description = "")
  public Boolean getExcludeOfficeIps() {
    return excludeOfficeIps;
  }

  public void setExcludeOfficeIps(Boolean excludeOfficeIps) {
    this.excludeOfficeIps = excludeOfficeIps;
  }

  public DevicesPolicyBody match(String match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(required = true, description = "")
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public DevicesPolicyBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device settings policy.
   * @return name
  **/
  @Schema(example = "Allow Developers", required = true, description = "The name of the device settings policy.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DevicesPolicyBody precedence(BigDecimal precedence) {
    this.precedence = precedence;
    return this;
  }

   /**
   * Get precedence
   * @return precedence
  **/
  @Schema(required = true, description = "")
  public BigDecimal getPrecedence() {
    return precedence;
  }

  public void setPrecedence(BigDecimal precedence) {
    this.precedence = precedence;
  }

  public DevicesPolicyBody serviceModeV2(ServiceModeV2 serviceModeV2) {
    this.serviceModeV2 = serviceModeV2;
    return this;
  }

   /**
   * Get serviceModeV2
   * @return serviceModeV2
  **/
  @Schema(description = "")
  public ServiceModeV2 getServiceModeV2() {
    return serviceModeV2;
  }

  public void setServiceModeV2(ServiceModeV2 serviceModeV2) {
    this.serviceModeV2 = serviceModeV2;
  }

  public DevicesPolicyBody supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * Get supportUrl
   * @return supportUrl
  **/
  @Schema(description = "")
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }

  public DevicesPolicyBody switchLocked(Boolean switchLocked) {
    this.switchLocked = switchLocked;
    return this;
  }

   /**
   * Get switchLocked
   * @return switchLocked
  **/
  @Schema(description = "")
  public Boolean getSwitchLocked() {
    return switchLocked;
  }

  public void setSwitchLocked(Boolean switchLocked) {
    this.switchLocked = switchLocked;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevicesPolicyBody devicesPolicyBody = (DevicesPolicyBody) o;
    return Objects.equals(this.allowModeSwitch, devicesPolicyBody.allowModeSwitch) &&
        Objects.equals(this.allowUpdates, devicesPolicyBody.allowUpdates) &&
        Objects.equals(this.allowedToLeave, devicesPolicyBody.allowedToLeave) &&
        Objects.equals(this.autoConnect, devicesPolicyBody.autoConnect) &&
        Objects.equals(this.captivePortal, devicesPolicyBody.captivePortal) &&
        Objects.equals(this.description, devicesPolicyBody.description) &&
        Objects.equals(this.disableAutoFallback, devicesPolicyBody.disableAutoFallback) &&
        Objects.equals(this.enabled, devicesPolicyBody.enabled) &&
        Objects.equals(this.excludeOfficeIps, devicesPolicyBody.excludeOfficeIps) &&
        Objects.equals(this.match, devicesPolicyBody.match) &&
        Objects.equals(this.name, devicesPolicyBody.name) &&
        Objects.equals(this.precedence, devicesPolicyBody.precedence) &&
        Objects.equals(this.serviceModeV2, devicesPolicyBody.serviceModeV2) &&
        Objects.equals(this.supportUrl, devicesPolicyBody.supportUrl) &&
        Objects.equals(this.switchLocked, devicesPolicyBody.switchLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowModeSwitch, allowUpdates, allowedToLeave, autoConnect, captivePortal, description, disableAutoFallback, enabled, excludeOfficeIps, match, name, precedence, serviceModeV2, supportUrl, switchLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevicesPolicyBody {\n");
    
    sb.append("    allowModeSwitch: ").append(toIndentedString(allowModeSwitch)).append("\n");
    sb.append("    allowUpdates: ").append(toIndentedString(allowUpdates)).append("\n");
    sb.append("    allowedToLeave: ").append(toIndentedString(allowedToLeave)).append("\n");
    sb.append("    autoConnect: ").append(toIndentedString(autoConnect)).append("\n");
    sb.append("    captivePortal: ").append(toIndentedString(captivePortal)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableAutoFallback: ").append(toIndentedString(disableAutoFallback)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    excludeOfficeIps: ").append(toIndentedString(excludeOfficeIps)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
    sb.append("    serviceModeV2: ").append(toIndentedString(serviceModeV2)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    switchLocked: ").append(toIndentedString(switchLocked)).append("\n");
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