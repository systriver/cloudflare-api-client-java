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
import io.swagger.client.model.SchemasBase;
import io.swagger.client.model.SecurityLevelValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Choose the appropriate security profile for your website, which will automatically adjust each of the security settings. If you choose to customize an individual security setting, the profile will become Custom. (https://support.cloudflare.com/hc/en-us/articles/200170056).
 */
@Schema(description = "Choose the appropriate security profile for your website, which will automatically adjust each of the security settings. If you choose to customize an individual security setting, the profile will become Custom. (https://support.cloudflare.com/hc/en-us/articles/200170056).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SecurityLevel extends SchemasBase implements Setting {
  @SerializedName("id")
  private String securityLevelId = null;

  @SerializedName("value")
  private SecurityLevelValue securityLevelValue = null;

  public SecurityLevel securityLevelId(String securityLevelId) {
    this.securityLevelId = securityLevelId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return securityLevelId
  **/
  @Schema(example = "security_level", description = "ID of the zone setting.")
  public String getSecurityLevelId() {
    return securityLevelId;
  }

  public void setSecurityLevelId(String securityLevelId) {
    this.securityLevelId = securityLevelId;
  }

  public SecurityLevel securityLevelValue(SecurityLevelValue securityLevelValue) {
    this.securityLevelValue = securityLevelValue;
    return this;
  }

   /**
   * Get securityLevelValue
   * @return securityLevelValue
  **/
  @Schema(description = "")
  public SecurityLevelValue getSecurityLevelValue() {
    return securityLevelValue;
  }

  public void setSecurityLevelValue(SecurityLevelValue securityLevelValue) {
    this.securityLevelValue = securityLevelValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityLevel securityLevel = (SecurityLevel) o;
    return Objects.equals(this.securityLevelId, securityLevel.securityLevelId) &&
        Objects.equals(this.securityLevelValue, securityLevel.securityLevelValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityLevelId, securityLevelValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityLevel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    securityLevelId: ").append(toIndentedString(securityLevelId)).append("\n");
    sb.append("    securityLevelValue: ").append(toIndentedString(securityLevelValue)).append("\n");
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