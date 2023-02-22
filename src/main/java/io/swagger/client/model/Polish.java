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
import io.swagger.client.model.PolishValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Removes metadata and compresses your images for faster page load times. Basic (Lossless): Reduce the size of PNG, JPEG, and GIF files - no impact on visual quality. Basic + JPEG (Lossy): Further reduce the size of JPEG files for faster image loading. Larger JPEGs are converted to progressive images, loading a lower-resolution image first and ending in a higher-resolution version. Not recommended for hi-res photography sites.
 */
@Schema(description = "Removes metadata and compresses your images for faster page load times. Basic (Lossless): Reduce the size of PNG, JPEG, and GIF files - no impact on visual quality. Basic + JPEG (Lossy): Further reduce the size of JPEG files for faster image loading. Larger JPEGs are converted to progressive images, loading a lower-resolution image first and ending in a higher-resolution version. Not recommended for hi-res photography sites.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Polish extends SchemasBase implements Setting {
  @SerializedName("id")
  private String polishId = null;

  @SerializedName("value")
  private PolishValue polishValue = null;

  public Polish polishId(String polishId) {
    this.polishId = polishId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return polishId
  **/
  @Schema(example = "polish", description = "ID of the zone setting.")
  public String getPolishId() {
    return polishId;
  }

  public void setPolishId(String polishId) {
    this.polishId = polishId;
  }

  public Polish polishValue(PolishValue polishValue) {
    this.polishValue = polishValue;
    return this;
  }

   /**
   * Get polishValue
   * @return polishValue
  **/
  @Schema(description = "")
  public PolishValue getPolishValue() {
    return polishValue;
  }

  public void setPolishValue(PolishValue polishValue) {
    this.polishValue = polishValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Polish polish = (Polish) o;
    return Objects.equals(this.polishId, polish.polishId) &&
        Objects.equals(this.polishValue, polish.polishValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(polishId, polishValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Polish {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    polishId: ").append(toIndentedString(polishId)).append("\n");
    sb.append("    polishValue: ").append(toIndentedString(polishValue)).append("\n");
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