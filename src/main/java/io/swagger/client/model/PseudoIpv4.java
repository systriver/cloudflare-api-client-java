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
import io.swagger.client.model.PseudoIpv4Value;
import io.swagger.client.model.SchemasBase;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * The value set for the Pseudo IPv4 setting.
 */
@Schema(description = "The value set for the Pseudo IPv4 setting.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PseudoIpv4 extends SchemasBase implements Setting {
  @SerializedName("id")
  private String pseudoIpv4Id = pseudo_ipv4;

  @SerializedName("value")
  private PseudoIpv4Value pseudoIpv4Value = null;

  public PseudoIpv4 pseudoIpv4Id(String pseudoIpv4Id) {
    this.pseudoIpv4Id = pseudoIpv4Id;
    return this;
  }

   /**
   * Value of the Pseudo IPv4 setting.
   * @return pseudoIpv4Id
  **/
  @Schema(description = "Value of the Pseudo IPv4 setting.")
  public String getPseudoIpv4Id() {
    return pseudoIpv4Id;
  }

  public void setPseudoIpv4Id(String pseudoIpv4Id) {
    this.pseudoIpv4Id = pseudoIpv4Id;
  }

  public PseudoIpv4 pseudoIpv4Value(PseudoIpv4Value pseudoIpv4Value) {
    this.pseudoIpv4Value = pseudoIpv4Value;
    return this;
  }

   /**
   * Get pseudoIpv4Value
   * @return pseudoIpv4Value
  **/
  @Schema(description = "")
  public PseudoIpv4Value getPseudoIpv4Value() {
    return pseudoIpv4Value;
  }

  public void setPseudoIpv4Value(PseudoIpv4Value pseudoIpv4Value) {
    this.pseudoIpv4Value = pseudoIpv4Value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PseudoIpv4 pseudoIpv4 = (PseudoIpv4) o;
    return Objects.equals(this.pseudoIpv4Id, pseudoIpv4.pseudoIpv4Id) &&
        Objects.equals(this.pseudoIpv4Value, pseudoIpv4.pseudoIpv4Value) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pseudoIpv4Id, pseudoIpv4Value, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PseudoIpv4 {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pseudoIpv4Id: ").append(toIndentedString(pseudoIpv4Id)).append("\n");
    sb.append("    pseudoIpv4Value: ").append(toIndentedString(pseudoIpv4Value)).append("\n");
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