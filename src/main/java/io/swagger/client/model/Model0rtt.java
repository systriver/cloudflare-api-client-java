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
import io.swagger.client.model.Model0rttValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * 0-RTT session resumption enabled for this zone.
 */
@Schema(description = "0-RTT session resumption enabled for this zone.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Model0rtt extends SchemasBase implements Setting {
  @SerializedName("id")
  private String _0rttId = null;

  @SerializedName("value")
  private Model0rttValue _0rttValue = null;

  public Model0rtt _0rttId(String _0rttId) {
    this._0rttId = _0rttId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return _0rttId
  **/
  @Schema(example = "0rtt", description = "ID of the zone setting.")
  public String get0rttId() {
    return _0rttId;
  }

  public void set0rttId(String _0rttId) {
    this._0rttId = _0rttId;
  }

  public Model0rtt _0rttValue(Model0rttValue _0rttValue) {
    this._0rttValue = _0rttValue;
    return this;
  }

   /**
   * Get _0rttValue
   * @return _0rttValue
  **/
  @Schema(description = "")
  public Model0rttValue get0rttValue() {
    return _0rttValue;
  }

  public void set0rttValue(Model0rttValue _0rttValue) {
    this._0rttValue = _0rttValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model0rtt _0rtt = (Model0rtt) o;
    return Objects.equals(this._0rttId, _0rtt._0rttId) &&
        Objects.equals(this._0rttValue, _0rtt._0rttValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_0rttId, _0rttValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model0rtt {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    _0rttId: ").append(toIndentedString(_0rttId)).append("\n");
    sb.append("    _0rttValue: ").append(toIndentedString(_0rttValue)).append("\n");
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
