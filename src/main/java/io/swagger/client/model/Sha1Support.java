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
import io.swagger.client.model.Sha1SupportValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Allow SHA1 support.
 */
@Schema(description = "Allow SHA1 support.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Sha1Support extends SchemasBase implements Setting {
  @SerializedName("id")
  private String sha1SupportId = null;

  @SerializedName("value")
  private Sha1SupportValue sha1SupportValue = null;

  public Sha1Support sha1SupportId(String sha1SupportId) {
    this.sha1SupportId = sha1SupportId;
    return this;
  }

   /**
   * Zone setting identifier.
   * @return sha1SupportId
  **/
  @Schema(example = "sha1_support", description = "Zone setting identifier.")
  public String getSha1SupportId() {
    return sha1SupportId;
  }

  public void setSha1SupportId(String sha1SupportId) {
    this.sha1SupportId = sha1SupportId;
  }

  public Sha1Support sha1SupportValue(Sha1SupportValue sha1SupportValue) {
    this.sha1SupportValue = sha1SupportValue;
    return this;
  }

   /**
   * Get sha1SupportValue
   * @return sha1SupportValue
  **/
  @Schema(description = "")
  public Sha1SupportValue getSha1SupportValue() {
    return sha1SupportValue;
  }

  public void setSha1SupportValue(Sha1SupportValue sha1SupportValue) {
    this.sha1SupportValue = sha1SupportValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sha1Support sha1Support = (Sha1Support) o;
    return Objects.equals(this.sha1SupportId, sha1Support.sha1SupportId) &&
        Objects.equals(this.sha1SupportValue, sha1Support.sha1SupportValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sha1SupportId, sha1SupportValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sha1Support {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sha1SupportId: ").append(toIndentedString(sha1SupportId)).append("\n");
    sb.append("    sha1SupportValue: ").append(toIndentedString(sha1SupportValue)).append("\n");
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