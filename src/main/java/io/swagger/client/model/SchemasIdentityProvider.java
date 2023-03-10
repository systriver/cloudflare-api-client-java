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
import io.swagger.client.model.SchemasidentityproviderScimConfig;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * SchemasIdentityProvider
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasIdentityProvider {
  @SerializedName("config")
  private Object config = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("scim_config")
  private SchemasidentityproviderScimConfig scimConfig = null;

  @SerializedName("type")
  private String type = null;

  public SchemasIdentityProvider config(Object config) {
    this.config = config;
    return this;
  }

   /**
   * The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
   * @return config
  **/
  @Schema(required = true, description = "The configuration parameters for the identity provider. To view the required parameters for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).")
  public Object getConfig() {
    return config;
  }

  public void setConfig(Object config) {
    this.config = config;
  }

  public SchemasIdentityProvider id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SchemasIdentityProvider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchemasIdentityProvider scimConfig(SchemasidentityproviderScimConfig scimConfig) {
    this.scimConfig = scimConfig;
    return this;
  }

   /**
   * Get scimConfig
   * @return scimConfig
  **/
  @Schema(description = "")
  public SchemasidentityproviderScimConfig getScimConfig() {
    return scimConfig;
  }

  public void setScimConfig(SchemasidentityproviderScimConfig scimConfig) {
    this.scimConfig = scimConfig;
  }

  public SchemasIdentityProvider type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).
   * @return type
  **/
  @Schema(example = "onetimepin", required = true, description = "The type of identity provider. To determine the value for a specific provider, refer to our [developer documentation](https://developers.cloudflare.com/cloudflare-one/identity/idp-integration/).")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
    SchemasIdentityProvider schemasIdentityProvider = (SchemasIdentityProvider) o;
    return Objects.equals(this.config, schemasIdentityProvider.config) &&
        Objects.equals(this.id, schemasIdentityProvider.id) &&
        Objects.equals(this.name, schemasIdentityProvider.name) &&
        Objects.equals(this.scimConfig, schemasIdentityProvider.scimConfig) &&
        Objects.equals(this.type, schemasIdentityProvider.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, id, name, scimConfig, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasIdentityProvider {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scimConfig: ").append(toIndentedString(scimConfig)).append("\n");
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
