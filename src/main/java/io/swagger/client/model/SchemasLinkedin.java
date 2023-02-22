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
import io.swagger.client.model.GenericOauthConfig;
import io.swagger.client.model.SchemasIdentityProvider;
import io.swagger.client.model.SchemasidentityproviderScimConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SchemasLinkedin
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasLinkedin extends SchemasIdentityProvider implements SchemasIdentityProviders {
  @SerializedName("config")
  private GenericOauthConfig schemasLinkedinConfig = null;

  public SchemasLinkedin schemasLinkedinConfig(GenericOauthConfig schemasLinkedinConfig) {
    this.schemasLinkedinConfig = schemasLinkedinConfig;
    return this;
  }

   /**
   * Get schemasLinkedinConfig
   * @return schemasLinkedinConfig
  **/
  @Schema(description = "")
  public GenericOauthConfig getSchemasLinkedinConfig() {
    return schemasLinkedinConfig;
  }

  public void setSchemasLinkedinConfig(GenericOauthConfig schemasLinkedinConfig) {
    this.schemasLinkedinConfig = schemasLinkedinConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SchemasLinkedin schemasLinkedin = (SchemasLinkedin) o;
    return Objects.equals(this.schemasLinkedinConfig, schemasLinkedin.schemasLinkedinConfig) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemasLinkedinConfig, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasLinkedin {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    schemasLinkedinConfig: ").append(toIndentedString(schemasLinkedinConfig)).append("\n");
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
