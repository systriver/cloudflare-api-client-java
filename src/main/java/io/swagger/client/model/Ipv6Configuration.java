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
 * Ipv6Configuration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class Ipv6Configuration implements SchemasConfiguration {
  @SerializedName("target")
  private String target = null;

  @SerializedName("value")
  private String value = null;

  public Ipv6Configuration target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The configuration target. You must set the target to &#x60;ip6&#x60; when specifying an IPv6 address in the rule.
   * @return target
  **/
  @Schema(example = "ip6", description = "The configuration target. You must set the target to `ip6` when specifying an IPv6 address in the rule.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Ipv6Configuration value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The IPv6 address to match.
   * @return value
  **/
  @Schema(example = "2001:DB8:100::CF", description = "The IPv6 address to match.")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ipv6Configuration ipv6Configuration = (Ipv6Configuration) o;
    return Objects.equals(this.target, ipv6Configuration.target) &&
        Objects.equals(this.value, ipv6Configuration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ipv6Configuration {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
