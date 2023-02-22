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
import io.swagger.client.model.ActionParametersSetConfigAutominify;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * The configuration parameters for the set_config action.
 */
@Schema(description = "The configuration parameters for the set_config action.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ActionParametersSetConfig implements ConfigRulesComponentsSchemasActionParameters {
  @SerializedName("automatic_https_rewrites")
  private Boolean automaticHttpsRewrites = null;

  @SerializedName("autominify")
  private ActionParametersSetConfigAutominify autominify = null;

  @SerializedName("bic")
  private Boolean bic = null;

  @SerializedName("disable_apps")
  private Boolean disableApps = null;

  @SerializedName("disable_railgun")
  private Boolean disableRailgun = null;

  @SerializedName("disable_zaraz")
  private Boolean disableZaraz = null;

  @SerializedName("email_obfuscation")
  private Boolean emailObfuscation = null;

  @SerializedName("hotlink_protection")
  private Boolean hotlinkProtection = null;

  @SerializedName("mirage")
  private Boolean mirage = null;

  @SerializedName("opportunistic_encryption")
  private Boolean opportunisticEncryption = null;

  @SerializedName("polish")
  private String polish = null;

  @SerializedName("rocket_loader")
  private Boolean rocketLoader = null;

  @SerializedName("security_level")
  private String securityLevel = null;

  @SerializedName("server_side_excludes")
  private Boolean serverSideExcludes = null;

  @SerializedName("ssl")
  private String ssl = null;

  @SerializedName("sxg")
  private Boolean sxg = null;

  public ActionParametersSetConfig automaticHttpsRewrites(Boolean automaticHttpsRewrites) {
    this.automaticHttpsRewrites = automaticHttpsRewrites;
    return this;
  }

   /**
   * Enable or disable Automatic HTTPS Rewrites for matching requests
   * @return automaticHttpsRewrites
  **/
  @Schema(example = "true", description = "Enable or disable Automatic HTTPS Rewrites for matching requests")
  public Boolean isAutomaticHttpsRewrites() {
    return automaticHttpsRewrites;
  }

  public void setAutomaticHttpsRewrites(Boolean automaticHttpsRewrites) {
    this.automaticHttpsRewrites = automaticHttpsRewrites;
  }

  public ActionParametersSetConfig autominify(ActionParametersSetConfigAutominify autominify) {
    this.autominify = autominify;
    return this;
  }

   /**
   * Get autominify
   * @return autominify
  **/
  @Schema(description = "")
  public ActionParametersSetConfigAutominify getAutominify() {
    return autominify;
  }

  public void setAutominify(ActionParametersSetConfigAutominify autominify) {
    this.autominify = autominify;
  }

  public ActionParametersSetConfig bic(Boolean bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Enable or disable Browser Integrity Check
   * @return bic
  **/
  @Schema(example = "true", description = "Enable or disable Browser Integrity Check")
  public Boolean isBic() {
    return bic;
  }

  public void setBic(Boolean bic) {
    this.bic = bic;
  }

  public ActionParametersSetConfig disableApps(Boolean disableApps) {
    this.disableApps = disableApps;
    return this;
  }

   /**
   * Disable all active Cloudflare Apps
   * @return disableApps
  **/
  @Schema(example = "true", description = "Disable all active Cloudflare Apps")
  public Boolean isDisableApps() {
    return disableApps;
  }

  public void setDisableApps(Boolean disableApps) {
    this.disableApps = disableApps;
  }

  public ActionParametersSetConfig disableRailgun(Boolean disableRailgun) {
    this.disableRailgun = disableRailgun;
    return this;
  }

   /**
   * Disable Cloudflare Railgun
   * @return disableRailgun
  **/
  @Schema(example = "true", description = "Disable Cloudflare Railgun")
  public Boolean isDisableRailgun() {
    return disableRailgun;
  }

  public void setDisableRailgun(Boolean disableRailgun) {
    this.disableRailgun = disableRailgun;
  }

  public ActionParametersSetConfig disableZaraz(Boolean disableZaraz) {
    this.disableZaraz = disableZaraz;
    return this;
  }

   /**
   * Disable Cloudflare Railgun
   * @return disableZaraz
  **/
  @Schema(example = "true", description = "Disable Cloudflare Railgun")
  public Boolean isDisableZaraz() {
    return disableZaraz;
  }

  public void setDisableZaraz(Boolean disableZaraz) {
    this.disableZaraz = disableZaraz;
  }

  public ActionParametersSetConfig emailObfuscation(Boolean emailObfuscation) {
    this.emailObfuscation = emailObfuscation;
    return this;
  }

   /**
   * Enable or disable Email Obfuscation
   * @return emailObfuscation
  **/
  @Schema(example = "false", description = "Enable or disable Email Obfuscation")
  public Boolean isEmailObfuscation() {
    return emailObfuscation;
  }

  public void setEmailObfuscation(Boolean emailObfuscation) {
    this.emailObfuscation = emailObfuscation;
  }

  public ActionParametersSetConfig hotlinkProtection(Boolean hotlinkProtection) {
    this.hotlinkProtection = hotlinkProtection;
    return this;
  }

   /**
   * Enable or disable Hotlink Protection
   * @return hotlinkProtection
  **/
  @Schema(example = "false", description = "Enable or disable Hotlink Protection")
  public Boolean isHotlinkProtection() {
    return hotlinkProtection;
  }

  public void setHotlinkProtection(Boolean hotlinkProtection) {
    this.hotlinkProtection = hotlinkProtection;
  }

  public ActionParametersSetConfig mirage(Boolean mirage) {
    this.mirage = mirage;
    return this;
  }

   /**
   * Enable or disable Mirage
   * @return mirage
  **/
  @Schema(example = "false", description = "Enable or disable Mirage")
  public Boolean isMirage() {
    return mirage;
  }

  public void setMirage(Boolean mirage) {
    this.mirage = mirage;
  }

  public ActionParametersSetConfig opportunisticEncryption(Boolean opportunisticEncryption) {
    this.opportunisticEncryption = opportunisticEncryption;
    return this;
  }

   /**
   * Enable or disableOpportunistic Encryption
   * @return opportunisticEncryption
  **/
  @Schema(example = "false", description = "Enable or disableOpportunistic Encryption")
  public Boolean isOpportunisticEncryption() {
    return opportunisticEncryption;
  }

  public void setOpportunisticEncryption(Boolean opportunisticEncryption) {
    this.opportunisticEncryption = opportunisticEncryption;
  }

  public ActionParametersSetConfig polish(String polish) {
    this.polish = polish;
    return this;
  }

   /**
   * Set Polish compression options
   * @return polish
  **/
  @Schema(example = "lossless", description = "Set Polish compression options")
  public String getPolish() {
    return polish;
  }

  public void setPolish(String polish) {
    this.polish = polish;
  }

  public ActionParametersSetConfig rocketLoader(Boolean rocketLoader) {
    this.rocketLoader = rocketLoader;
    return this;
  }

   /**
   * Enable or disable Rocket Loader
   * @return rocketLoader
  **/
  @Schema(example = "false", description = "Enable or disable Rocket Loader")
  public Boolean isRocketLoader() {
    return rocketLoader;
  }

  public void setRocketLoader(Boolean rocketLoader) {
    this.rocketLoader = rocketLoader;
  }

  public ActionParametersSetConfig securityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
    return this;
  }

   /**
   * Set the Security Level
   * @return securityLevel
  **/
  @Schema(example = "low", description = "Set the Security Level")
  public String getSecurityLevel() {
    return securityLevel;
  }

  public void setSecurityLevel(String securityLevel) {
    this.securityLevel = securityLevel;
  }

  public ActionParametersSetConfig serverSideExcludes(Boolean serverSideExcludes) {
    this.serverSideExcludes = serverSideExcludes;
    return this;
  }

   /**
   * Enable or disable Server Side Excludes
   * @return serverSideExcludes
  **/
  @Schema(example = "false", description = "Enable or disable Server Side Excludes")
  public Boolean isServerSideExcludes() {
    return serverSideExcludes;
  }

  public void setServerSideExcludes(Boolean serverSideExcludes) {
    this.serverSideExcludes = serverSideExcludes;
  }

  public ActionParametersSetConfig ssl(String ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Select the SSL encryption mode
   * @return ssl
  **/
  @Schema(example = "flexible", description = "Select the SSL encryption mode")
  public String getSsl() {
    return ssl;
  }

  public void setSsl(String ssl) {
    this.ssl = ssl;
  }

  public ActionParametersSetConfig sxg(Boolean sxg) {
    this.sxg = sxg;
    return this;
  }

   /**
   * Enable or disable Signed Exchangesn(SXG)
   * @return sxg
  **/
  @Schema(example = "false", description = "Enable or disable Signed Exchangesn(SXG)")
  public Boolean isSxg() {
    return sxg;
  }

  public void setSxg(Boolean sxg) {
    this.sxg = sxg;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionParametersSetConfig actionParametersSetConfig = (ActionParametersSetConfig) o;
    return Objects.equals(this.automaticHttpsRewrites, actionParametersSetConfig.automaticHttpsRewrites) &&
        Objects.equals(this.autominify, actionParametersSetConfig.autominify) &&
        Objects.equals(this.bic, actionParametersSetConfig.bic) &&
        Objects.equals(this.disableApps, actionParametersSetConfig.disableApps) &&
        Objects.equals(this.disableRailgun, actionParametersSetConfig.disableRailgun) &&
        Objects.equals(this.disableZaraz, actionParametersSetConfig.disableZaraz) &&
        Objects.equals(this.emailObfuscation, actionParametersSetConfig.emailObfuscation) &&
        Objects.equals(this.hotlinkProtection, actionParametersSetConfig.hotlinkProtection) &&
        Objects.equals(this.mirage, actionParametersSetConfig.mirage) &&
        Objects.equals(this.opportunisticEncryption, actionParametersSetConfig.opportunisticEncryption) &&
        Objects.equals(this.polish, actionParametersSetConfig.polish) &&
        Objects.equals(this.rocketLoader, actionParametersSetConfig.rocketLoader) &&
        Objects.equals(this.securityLevel, actionParametersSetConfig.securityLevel) &&
        Objects.equals(this.serverSideExcludes, actionParametersSetConfig.serverSideExcludes) &&
        Objects.equals(this.ssl, actionParametersSetConfig.ssl) &&
        Objects.equals(this.sxg, actionParametersSetConfig.sxg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automaticHttpsRewrites, autominify, bic, disableApps, disableRailgun, disableZaraz, emailObfuscation, hotlinkProtection, mirage, opportunisticEncryption, polish, rocketLoader, securityLevel, serverSideExcludes, ssl, sxg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionParametersSetConfig {\n");
    
    sb.append("    automaticHttpsRewrites: ").append(toIndentedString(automaticHttpsRewrites)).append("\n");
    sb.append("    autominify: ").append(toIndentedString(autominify)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    disableApps: ").append(toIndentedString(disableApps)).append("\n");
    sb.append("    disableRailgun: ").append(toIndentedString(disableRailgun)).append("\n");
    sb.append("    disableZaraz: ").append(toIndentedString(disableZaraz)).append("\n");
    sb.append("    emailObfuscation: ").append(toIndentedString(emailObfuscation)).append("\n");
    sb.append("    hotlinkProtection: ").append(toIndentedString(hotlinkProtection)).append("\n");
    sb.append("    mirage: ").append(toIndentedString(mirage)).append("\n");
    sb.append("    opportunisticEncryption: ").append(toIndentedString(opportunisticEncryption)).append("\n");
    sb.append("    polish: ").append(toIndentedString(polish)).append("\n");
    sb.append("    rocketLoader: ").append(toIndentedString(rocketLoader)).append("\n");
    sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
    sb.append("    serverSideExcludes: ").append(toIndentedString(serverSideExcludes)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sxg: ").append(toIndentedString(sxg)).append("\n");
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