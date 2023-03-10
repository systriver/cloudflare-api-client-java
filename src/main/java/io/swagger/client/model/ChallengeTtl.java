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
import io.swagger.client.model.ChallengeTtlValue;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Specify how long a visitor is allowed access to your site after successfully completing a challenge (such as a CAPTCHA). After the TTL has expired the visitor will have to complete a new challenge. We recommend a 15 - 45 minute setting and will attempt to honor any setting above 45 minutes. (https://support.cloudflare.com/hc/en-us/articles/200170136).
 */
@Schema(description = "Specify how long a visitor is allowed access to your site after successfully completing a challenge (such as a CAPTCHA). After the TTL has expired the visitor will have to complete a new challenge. We recommend a 15 - 45 minute setting and will attempt to honor any setting above 45 minutes. (https://support.cloudflare.com/hc/en-us/articles/200170136).")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ChallengeTtl extends SchemasBase implements Setting {
  @SerializedName("id")
  private String challengeTtlId = null;

  @SerializedName("value")
  private ChallengeTtlValue challengeTtlValue = null;

  public ChallengeTtl challengeTtlId(String challengeTtlId) {
    this.challengeTtlId = challengeTtlId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return challengeTtlId
  **/
  @Schema(example = "challenge_ttl", description = "ID of the zone setting.")
  public String getChallengeTtlId() {
    return challengeTtlId;
  }

  public void setChallengeTtlId(String challengeTtlId) {
    this.challengeTtlId = challengeTtlId;
  }

  public ChallengeTtl challengeTtlValue(ChallengeTtlValue challengeTtlValue) {
    this.challengeTtlValue = challengeTtlValue;
    return this;
  }

   /**
   * Get challengeTtlValue
   * @return challengeTtlValue
  **/
  @Schema(description = "")
  public ChallengeTtlValue getChallengeTtlValue() {
    return challengeTtlValue;
  }

  public void setChallengeTtlValue(ChallengeTtlValue challengeTtlValue) {
    this.challengeTtlValue = challengeTtlValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeTtl challengeTtl = (ChallengeTtl) o;
    return Objects.equals(this.challengeTtlId, challengeTtl.challengeTtlId) &&
        Objects.equals(this.challengeTtlValue, challengeTtl.challengeTtlValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(challengeTtlId, challengeTtlValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeTtl {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    challengeTtlId: ").append(toIndentedString(challengeTtlId)).append("\n");
    sb.append("    challengeTtlValue: ").append(toIndentedString(challengeTtlValue)).append("\n");
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
