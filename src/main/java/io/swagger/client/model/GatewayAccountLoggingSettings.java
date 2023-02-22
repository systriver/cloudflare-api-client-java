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
import io.swagger.client.model.GatewayaccountloggingsettingsSettingsByRuleType;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * GatewayAccountLoggingSettings
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class GatewayAccountLoggingSettings {
  @SerializedName("redact_pii")
  private Boolean redactPii = null;

  @SerializedName("settings_by_rule_type")
  private GatewayaccountloggingsettingsSettingsByRuleType settingsByRuleType = null;

  public GatewayAccountLoggingSettings redactPii(Boolean redactPii) {
    this.redactPii = redactPii;
    return this;
  }

   /**
   * Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).
   * @return redactPii
  **/
  @Schema(example = "true", description = "Redact personally identifiable information from activity logging (PII fields are: source IP, user email, user ID, device ID, URL, referrer, user agent).")
  public Boolean isRedactPii() {
    return redactPii;
  }

  public void setRedactPii(Boolean redactPii) {
    this.redactPii = redactPii;
  }

  public GatewayAccountLoggingSettings settingsByRuleType(GatewayaccountloggingsettingsSettingsByRuleType settingsByRuleType) {
    this.settingsByRuleType = settingsByRuleType;
    return this;
  }

   /**
   * Get settingsByRuleType
   * @return settingsByRuleType
  **/
  @Schema(description = "")
  public GatewayaccountloggingsettingsSettingsByRuleType getSettingsByRuleType() {
    return settingsByRuleType;
  }

  public void setSettingsByRuleType(GatewayaccountloggingsettingsSettingsByRuleType settingsByRuleType) {
    this.settingsByRuleType = settingsByRuleType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GatewayAccountLoggingSettings gatewayAccountLoggingSettings = (GatewayAccountLoggingSettings) o;
    return Objects.equals(this.redactPii, gatewayAccountLoggingSettings.redactPii) &&
        Objects.equals(this.settingsByRuleType, gatewayAccountLoggingSettings.settingsByRuleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redactPii, settingsByRuleType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GatewayAccountLoggingSettings {\n");
    
    sb.append("    redactPii: ").append(toIndentedString(redactPii)).append("\n");
    sb.append("    settingsByRuleType: ").append(toIndentedString(settingsByRuleType)).append("\n");
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
