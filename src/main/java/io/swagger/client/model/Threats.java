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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Breakdown of totals for threats.
 */
@Schema(description = "Breakdown of totals for threats.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Threats {
  @SerializedName("all")
  private Integer all = null;

  @SerializedName("country")
  private Object country = null;

  @SerializedName("type")
  private Object type = null;

  public Threats all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * The total number of identifiable threats received over the time frame.
   * @return all
  **/
  @Schema(description = "The total number of identifiable threats received over the time frame.")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public Threats country(Object country) {
    this.country = country;
    return this;
  }

   /**
   * A list of key/value pairs where the key is a two-digit country code and the value is the number of malicious requests received from that country.
   * @return country
  **/
  @Schema(example = "{\"AU\":91,\"CN\":523423,\"US\":123}", description = "A list of key/value pairs where the key is a two-digit country code and the value is the number of malicious requests received from that country.")
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public Threats type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * The list of key/value pairs where the key is a threat category and the value is the number of requests.
   * @return type
  **/
  @Schema(example = "{\"hot.ban.unknown\":5324,\"macro.chl.captchaErr\":1341,\"macro.chl.jschlErr\":5323,\"user.ban.ip\":123}", description = "The list of key/value pairs where the key is a threat category and the value is the number of requests.")
  public Object getType() {
    return type;
  }

  public void setType(Object type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Threats threats = (Threats) o;
    return Objects.equals(this.all, threats.all) &&
        Objects.equals(this.country, threats.country) &&
        Objects.equals(this.type, threats.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, country, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Threats {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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