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
 * SchemasCidrConfiguration
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasCidrConfiguration implements AnyOfconfigurationsItems {
  @SerializedName("target")
  private String target = null;

  @SerializedName("value")
  private String value = null;

  public SchemasCidrConfiguration target(String target) {
    this.target = target;
    return this;
  }

   /**
   * The configuration target. You must set the target to &#x60;ip_range&#x60; when specifying an IP address range in the Zone Lockdown rule.
   * @return target
  **/
  @Schema(example = "ip_range", description = "The configuration target. You must set the target to `ip_range` when specifying an IP address range in the Zone Lockdown rule.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public SchemasCidrConfiguration value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The IP address range to match. You can only use prefix lengths &#x60;/16&#x60; and &#x60;/24&#x60;.
   * @return value
  **/
  @Schema(example = "198.51.100.4/16", description = "The IP address range to match. You can only use prefix lengths `/16` and `/24`.")
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
    SchemasCidrConfiguration schemasCidrConfiguration = (SchemasCidrConfiguration) o;
    return Objects.equals(this.target, schemasCidrConfiguration.target) &&
        Objects.equals(this.value, schemasCidrConfiguration.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasCidrConfiguration {\n");
    
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
