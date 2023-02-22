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
import io.swagger.client.model.OriginErrorPagePassThruValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Cloudflare will proxy customer error pages on any 502,504 errors on origin server instead of showing a default Cloudflare error page. This does not apply to 522 errors and is limited to Enterprise Zones.
 */
@Schema(description = "Cloudflare will proxy customer error pages on any 502,504 errors on origin server instead of showing a default Cloudflare error page. This does not apply to 522 errors and is limited to Enterprise Zones.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class OriginErrorPagePassThru extends SchemasBase implements Setting {
  @SerializedName("id")
  private String originErrorPagePassThruId = null;

  @SerializedName("value")
  private OriginErrorPagePassThruValue originErrorPagePassThruValue = null;

  public OriginErrorPagePassThru originErrorPagePassThruId(String originErrorPagePassThruId) {
    this.originErrorPagePassThruId = originErrorPagePassThruId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return originErrorPagePassThruId
  **/
  @Schema(example = "origin_error_page_pass_thru", description = "ID of the zone setting.")
  public String getOriginErrorPagePassThruId() {
    return originErrorPagePassThruId;
  }

  public void setOriginErrorPagePassThruId(String originErrorPagePassThruId) {
    this.originErrorPagePassThruId = originErrorPagePassThruId;
  }

  public OriginErrorPagePassThru originErrorPagePassThruValue(OriginErrorPagePassThruValue originErrorPagePassThruValue) {
    this.originErrorPagePassThruValue = originErrorPagePassThruValue;
    return this;
  }

   /**
   * Get originErrorPagePassThruValue
   * @return originErrorPagePassThruValue
  **/
  @Schema(description = "")
  public OriginErrorPagePassThruValue getOriginErrorPagePassThruValue() {
    return originErrorPagePassThruValue;
  }

  public void setOriginErrorPagePassThruValue(OriginErrorPagePassThruValue originErrorPagePassThruValue) {
    this.originErrorPagePassThruValue = originErrorPagePassThruValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OriginErrorPagePassThru originErrorPagePassThru = (OriginErrorPagePassThru) o;
    return Objects.equals(this.originErrorPagePassThruId, originErrorPagePassThru.originErrorPagePassThruId) &&
        Objects.equals(this.originErrorPagePassThruValue, originErrorPagePassThru.originErrorPagePassThruValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originErrorPagePassThruId, originErrorPagePassThruValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OriginErrorPagePassThru {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    originErrorPagePassThruId: ").append(toIndentedString(originErrorPagePassThruId)).append("\n");
    sb.append("    originErrorPagePassThruValue: ").append(toIndentedString(originErrorPagePassThruValue)).append("\n");
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