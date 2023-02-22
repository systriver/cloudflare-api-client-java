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
import io.swagger.client.model.AllowedModesDenyTraditional;
import io.swagger.client.model.DefaultMode;
import io.swagger.client.model.ModeDenyTraditional;
import io.swagger.client.model.RuleComponentsSchemasBase2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * When triggered, traditional WAF rules cause the firewall to immediately act upon the request based on the configuration of the rule. A &#x27;deny&#x27; rule will immediately respond to the request based on the configured rule action/mode (for example, &#x27;block&#x27;) and no other rules will be processed.
 */
@Schema(description = "When triggered, traditional WAF rules cause the firewall to immediately act upon the request based on the configuration of the rule. A 'deny' rule will immediately respond to the request based on the configured rule action/mode (for example, 'block') and no other rules will be processed.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class TraditionalDenyRule extends RuleComponentsSchemasBase2 implements ComponentsSchemasRule {
  @SerializedName("allowed_modes")
  private AllowedModesDenyTraditional allowedModes = null;

  @SerializedName("default_mode")
  private DefaultMode defaultMode = null;

  @SerializedName("mode")
  private ModeDenyTraditional mode = null;

  public TraditionalDenyRule allowedModes(AllowedModesDenyTraditional allowedModes) {
    this.allowedModes = allowedModes;
    return this;
  }

   /**
   * Get allowedModes
   * @return allowedModes
  **/
  @Schema(required = true, description = "")
  public AllowedModesDenyTraditional getAllowedModes() {
    return allowedModes;
  }

  public void setAllowedModes(AllowedModesDenyTraditional allowedModes) {
    this.allowedModes = allowedModes;
  }

  public TraditionalDenyRule defaultMode(DefaultMode defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * Get defaultMode
   * @return defaultMode
  **/
  @Schema(required = true, description = "")
  public DefaultMode getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(DefaultMode defaultMode) {
    this.defaultMode = defaultMode;
  }

  public TraditionalDenyRule mode(ModeDenyTraditional mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @Schema(required = true, description = "")
  public ModeDenyTraditional getMode() {
    return mode;
  }

  public void setMode(ModeDenyTraditional mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraditionalDenyRule traditionalDenyRule = (TraditionalDenyRule) o;
    return Objects.equals(this.allowedModes, traditionalDenyRule.allowedModes) &&
        Objects.equals(this.defaultMode, traditionalDenyRule.defaultMode) &&
        Objects.equals(this.mode, traditionalDenyRule.mode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedModes, defaultMode, mode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraditionalDenyRule {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    allowedModes: ").append(toIndentedString(allowedModes)).append("\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
