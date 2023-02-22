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
import io.swagger.client.model.AlwaysUseHttpsValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Reply to all requests for URLs that use \&quot;http\&quot; with a 301 redirect to the equivalent \&quot;https\&quot; URL. If you only want to redirect for a subset of requests, consider creating an \&quot;Always use HTTPS\&quot; page rule.
 */
@Schema(description = "Reply to all requests for URLs that use \"http\" with a 301 redirect to the equivalent \"https\" URL. If you only want to redirect for a subset of requests, consider creating an \"Always use HTTPS\" page rule.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AlwaysUseHttps extends SchemasBase implements Setting {
  @SerializedName("id")
  private String alwaysUseHttpsId = null;

  @SerializedName("value")
  private AlwaysUseHttpsValue alwaysUseHttpsValue = null;

  public AlwaysUseHttps alwaysUseHttpsId(String alwaysUseHttpsId) {
    this.alwaysUseHttpsId = alwaysUseHttpsId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return alwaysUseHttpsId
  **/
  @Schema(example = "always_use_https", description = "ID of the zone setting.")
  public String getAlwaysUseHttpsId() {
    return alwaysUseHttpsId;
  }

  public void setAlwaysUseHttpsId(String alwaysUseHttpsId) {
    this.alwaysUseHttpsId = alwaysUseHttpsId;
  }

  public AlwaysUseHttps alwaysUseHttpsValue(AlwaysUseHttpsValue alwaysUseHttpsValue) {
    this.alwaysUseHttpsValue = alwaysUseHttpsValue;
    return this;
  }

   /**
   * Get alwaysUseHttpsValue
   * @return alwaysUseHttpsValue
  **/
  @Schema(description = "")
  public AlwaysUseHttpsValue getAlwaysUseHttpsValue() {
    return alwaysUseHttpsValue;
  }

  public void setAlwaysUseHttpsValue(AlwaysUseHttpsValue alwaysUseHttpsValue) {
    this.alwaysUseHttpsValue = alwaysUseHttpsValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlwaysUseHttps alwaysUseHttps = (AlwaysUseHttps) o;
    return Objects.equals(this.alwaysUseHttpsId, alwaysUseHttps.alwaysUseHttpsId) &&
        Objects.equals(this.alwaysUseHttpsValue, alwaysUseHttps.alwaysUseHttpsValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alwaysUseHttpsId, alwaysUseHttpsValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlwaysUseHttps {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alwaysUseHttpsId: ").append(toIndentedString(alwaysUseHttpsId)).append("\n");
    sb.append("    alwaysUseHttpsValue: ").append(toIndentedString(alwaysUseHttpsValue)).append("\n");
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