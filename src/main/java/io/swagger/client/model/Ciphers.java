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
import io.swagger.client.model.CiphersValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format.
 */
@Schema(description = "An allowlist of ciphers for TLS termination. These ciphers must be in the BoringSSL format.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Ciphers extends SchemasBase implements Setting {
  @SerializedName("id")
  private String ciphersId = null;

  @SerializedName("value")
  private CiphersValue ciphersValue = null;

  public Ciphers ciphersId(String ciphersId) {
    this.ciphersId = ciphersId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return ciphersId
  **/
  @Schema(example = "ciphers", description = "ID of the zone setting.")
  public String getCiphersId() {
    return ciphersId;
  }

  public void setCiphersId(String ciphersId) {
    this.ciphersId = ciphersId;
  }

  public Ciphers ciphersValue(CiphersValue ciphersValue) {
    this.ciphersValue = ciphersValue;
    return this;
  }

   /**
   * Get ciphersValue
   * @return ciphersValue
  **/
  @Schema(description = "")
  public CiphersValue getCiphersValue() {
    return ciphersValue;
  }

  public void setCiphersValue(CiphersValue ciphersValue) {
    this.ciphersValue = ciphersValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ciphers ciphers = (Ciphers) o;
    return Objects.equals(this.ciphersId, ciphers.ciphersId) &&
        Objects.equals(this.ciphersValue, ciphers.ciphersValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ciphersId, ciphersValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ciphers {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ciphersId: ").append(toIndentedString(ciphersId)).append("\n");
    sb.append("    ciphersValue: ").append(toIndentedString(ciphersValue)).append("\n");
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