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
import io.swagger.client.model.CloudflareClientAPIExclude;
import io.swagger.client.model.CloudflareClientAPIInclude;
import io.swagger.client.model.FallbackDomains;
import io.swagger.client.model.ServiceModeV2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * DeviceSettingsPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DeviceSettingsPolicy {
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

  @SerializedName("default")
  private Boolean _default = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("disable_auto_fallback")
  private Boolean disableAutoFallback = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("exclude")
  private CloudflareClientAPIExclude exclude = null;

  @SerializedName("exclude_office_ips")
  private Boolean excludeOfficeIps = null;

  @SerializedName("fallback_domains")
  private FallbackDomains fallbackDomains = null;

  @SerializedName("gateway_unique_id")
  private String gatewayUniqueId = null;

  @SerializedName("include")
  private CloudflareClientAPIInclude include = null;

  @SerializedName("match")
  private String match = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("policy_id")
  private String policyId = null;

  @SerializedName("precedence")
  private BigDecimal precedence = null;

  @SerializedName("service_mode_v2")
  private ServiceModeV2 serviceModeV2 = null;

  @SerializedName("support_url")
  private String supportUrl = null;

  @SerializedName("switch_locked")
  private Boolean switchLocked = null;

  public DeviceSettingsPolicy allowModeSwitch(Boolean allowModeSwitch) {
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

  public DeviceSettingsPolicy allowUpdates(Boolean allowUpdates) {
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

  public DeviceSettingsPolicy allowedToLeave(Boolean allowedToLeave) {
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

  public DeviceSettingsPolicy autoConnect(BigDecimal autoConnect) {
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

  public DeviceSettingsPolicy captivePortal(BigDecimal captivePortal) {
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

  public DeviceSettingsPolicy _default(Boolean _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(description = "")
  public Boolean getDefault() {
    return _default;
  }

  public void setDefault(Boolean _default) {
    this._default = _default;
  }

  public DeviceSettingsPolicy description(String description) {
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

  public DeviceSettingsPolicy disableAutoFallback(Boolean disableAutoFallback) {
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

  public DeviceSettingsPolicy enabled(Boolean enabled) {
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

  public DeviceSettingsPolicy exclude(CloudflareClientAPIExclude exclude) {
    this.exclude = exclude;
    return this;
  }

   /**
   * Get exclude
   * @return exclude
  **/
  @Schema(description = "")
  public CloudflareClientAPIExclude getExclude() {
    return exclude;
  }

  public void setExclude(CloudflareClientAPIExclude exclude) {
    this.exclude = exclude;
  }

  public DeviceSettingsPolicy excludeOfficeIps(Boolean excludeOfficeIps) {
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

  public DeviceSettingsPolicy fallbackDomains(FallbackDomains fallbackDomains) {
    this.fallbackDomains = fallbackDomains;
    return this;
  }

   /**
   * Get fallbackDomains
   * @return fallbackDomains
  **/
  @Schema(description = "")
  public FallbackDomains getFallbackDomains() {
    return fallbackDomains;
  }

  public void setFallbackDomains(FallbackDomains fallbackDomains) {
    this.fallbackDomains = fallbackDomains;
  }

  public DeviceSettingsPolicy gatewayUniqueId(String gatewayUniqueId) {
    this.gatewayUniqueId = gatewayUniqueId;
    return this;
  }

   /**
   * Get gatewayUniqueId
   * @return gatewayUniqueId
  **/
  @Schema(description = "")
  public String getGatewayUniqueId() {
    return gatewayUniqueId;
  }

  public void setGatewayUniqueId(String gatewayUniqueId) {
    this.gatewayUniqueId = gatewayUniqueId;
  }

  public DeviceSettingsPolicy include(CloudflareClientAPIInclude include) {
    this.include = include;
    return this;
  }

   /**
   * Get include
   * @return include
  **/
  @Schema(description = "")
  public CloudflareClientAPIInclude getInclude() {
    return include;
  }

  public void setInclude(CloudflareClientAPIInclude include) {
    this.include = include;
  }

  public DeviceSettingsPolicy match(String match) {
    this.match = match;
    return this;
  }

   /**
   * Get match
   * @return match
  **/
  @Schema(description = "")
  public String getMatch() {
    return match;
  }

  public void setMatch(String match) {
    this.match = match;
  }

  public DeviceSettingsPolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the device settings policy.
   * @return name
  **/
  @Schema(example = "Allow Developers", description = "The name of the device settings policy.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceSettingsPolicy policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @Schema(description = "")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public DeviceSettingsPolicy precedence(BigDecimal precedence) {
    this.precedence = precedence;
    return this;
  }

   /**
   * Get precedence
   * @return precedence
  **/
  @Schema(description = "")
  public BigDecimal getPrecedence() {
    return precedence;
  }

  public void setPrecedence(BigDecimal precedence) {
    this.precedence = precedence;
  }

  public DeviceSettingsPolicy serviceModeV2(ServiceModeV2 serviceModeV2) {
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

  public DeviceSettingsPolicy supportUrl(String supportUrl) {
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

  public DeviceSettingsPolicy switchLocked(Boolean switchLocked) {
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
    DeviceSettingsPolicy deviceSettingsPolicy = (DeviceSettingsPolicy) o;
    return Objects.equals(this.allowModeSwitch, deviceSettingsPolicy.allowModeSwitch) &&
        Objects.equals(this.allowUpdates, deviceSettingsPolicy.allowUpdates) &&
        Objects.equals(this.allowedToLeave, deviceSettingsPolicy.allowedToLeave) &&
        Objects.equals(this.autoConnect, deviceSettingsPolicy.autoConnect) &&
        Objects.equals(this.captivePortal, deviceSettingsPolicy.captivePortal) &&
        Objects.equals(this._default, deviceSettingsPolicy._default) &&
        Objects.equals(this.description, deviceSettingsPolicy.description) &&
        Objects.equals(this.disableAutoFallback, deviceSettingsPolicy.disableAutoFallback) &&
        Objects.equals(this.enabled, deviceSettingsPolicy.enabled) &&
        Objects.equals(this.exclude, deviceSettingsPolicy.exclude) &&
        Objects.equals(this.excludeOfficeIps, deviceSettingsPolicy.excludeOfficeIps) &&
        Objects.equals(this.fallbackDomains, deviceSettingsPolicy.fallbackDomains) &&
        Objects.equals(this.gatewayUniqueId, deviceSettingsPolicy.gatewayUniqueId) &&
        Objects.equals(this.include, deviceSettingsPolicy.include) &&
        Objects.equals(this.match, deviceSettingsPolicy.match) &&
        Objects.equals(this.name, deviceSettingsPolicy.name) &&
        Objects.equals(this.policyId, deviceSettingsPolicy.policyId) &&
        Objects.equals(this.precedence, deviceSettingsPolicy.precedence) &&
        Objects.equals(this.serviceModeV2, deviceSettingsPolicy.serviceModeV2) &&
        Objects.equals(this.supportUrl, deviceSettingsPolicy.supportUrl) &&
        Objects.equals(this.switchLocked, deviceSettingsPolicy.switchLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowModeSwitch, allowUpdates, allowedToLeave, autoConnect, captivePortal, _default, description, disableAutoFallback, enabled, exclude, excludeOfficeIps, fallbackDomains, gatewayUniqueId, include, match, name, policyId, precedence, serviceModeV2, supportUrl, switchLocked);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceSettingsPolicy {\n");
    
    sb.append("    allowModeSwitch: ").append(toIndentedString(allowModeSwitch)).append("\n");
    sb.append("    allowUpdates: ").append(toIndentedString(allowUpdates)).append("\n");
    sb.append("    allowedToLeave: ").append(toIndentedString(allowedToLeave)).append("\n");
    sb.append("    autoConnect: ").append(toIndentedString(autoConnect)).append("\n");
    sb.append("    captivePortal: ").append(toIndentedString(captivePortal)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disableAutoFallback: ").append(toIndentedString(disableAutoFallback)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    exclude: ").append(toIndentedString(exclude)).append("\n");
    sb.append("    excludeOfficeIps: ").append(toIndentedString(excludeOfficeIps)).append("\n");
    sb.append("    fallbackDomains: ").append(toIndentedString(fallbackDomains)).append("\n");
    sb.append("    gatewayUniqueId: ").append(toIndentedString(gatewayUniqueId)).append("\n");
    sb.append("    include: ").append(toIndentedString(include)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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
