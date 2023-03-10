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
import io.swagger.client.model.AutomaticPlatformOptimization;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * [Automatic Platform Optimization for WordPress](https://developers.cloudflare.com/automatic-platform-optimization/) serves your WordPress site from Cloudflare&#x27;s edge network and caches third-party fonts.
 */
@Schema(description = "[Automatic Platform Optimization for WordPress](https://developers.cloudflare.com/automatic-platform-optimization/) serves your WordPress site from Cloudflare's edge network and caches third-party fonts.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasAutomaticPlatformOptimization extends SchemasBase implements Setting {
  @SerializedName("id")
  private String schemasAutomaticPlatformOptimizationId = null;

  @SerializedName("value")
  private AutomaticPlatformOptimization schemasAutomaticPlatformOptimizationValue = null;

  public SchemasAutomaticPlatformOptimization schemasAutomaticPlatformOptimizationId(String schemasAutomaticPlatformOptimizationId) {
    this.schemasAutomaticPlatformOptimizationId = schemasAutomaticPlatformOptimizationId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return schemasAutomaticPlatformOptimizationId
  **/
  @Schema(example = "automatic_platform_optimization", description = "ID of the zone setting.")
  public String getSchemasAutomaticPlatformOptimizationId() {
    return schemasAutomaticPlatformOptimizationId;
  }

  public void setSchemasAutomaticPlatformOptimizationId(String schemasAutomaticPlatformOptimizationId) {
    this.schemasAutomaticPlatformOptimizationId = schemasAutomaticPlatformOptimizationId;
  }

  public SchemasAutomaticPlatformOptimization schemasAutomaticPlatformOptimizationValue(AutomaticPlatformOptimization schemasAutomaticPlatformOptimizationValue) {
    this.schemasAutomaticPlatformOptimizationValue = schemasAutomaticPlatformOptimizationValue;
    return this;
  }

   /**
   * Get schemasAutomaticPlatformOptimizationValue
   * @return schemasAutomaticPlatformOptimizationValue
  **/
  @Schema(description = "")
  public AutomaticPlatformOptimization getSchemasAutomaticPlatformOptimizationValue() {
    return schemasAutomaticPlatformOptimizationValue;
  }

  public void setSchemasAutomaticPlatformOptimizationValue(AutomaticPlatformOptimization schemasAutomaticPlatformOptimizationValue) {
    this.schemasAutomaticPlatformOptimizationValue = schemasAutomaticPlatformOptimizationValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasAutomaticPlatformOptimization schemasAutomaticPlatformOptimization = (SchemasAutomaticPlatformOptimization) o;
    return Objects.equals(this.schemasAutomaticPlatformOptimizationId, schemasAutomaticPlatformOptimization.schemasAutomaticPlatformOptimizationId) &&
        Objects.equals(this.schemasAutomaticPlatformOptimizationValue, schemasAutomaticPlatformOptimization.schemasAutomaticPlatformOptimizationValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemasAutomaticPlatformOptimizationId, schemasAutomaticPlatformOptimizationValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasAutomaticPlatformOptimization {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    schemasAutomaticPlatformOptimizationId: ").append(toIndentedString(schemasAutomaticPlatformOptimizationId)).append("\n");
    sb.append("    schemasAutomaticPlatformOptimizationValue: ").append(toIndentedString(schemasAutomaticPlatformOptimizationValue)).append("\n");
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
