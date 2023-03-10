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
 * SchemasBookmarkProps
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasBookmarkProps {
  @SerializedName("app_launcher_visible")
  private Object appLauncherVisible = true;

  @SerializedName("domain")
  private Object domain = null;

  @SerializedName("logo_url")
  private String logoUrl = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  public SchemasBookmarkProps appLauncherVisible(Object appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
    return this;
  }

   /**
   * Get appLauncherVisible
   * @return appLauncherVisible
  **/
  @Schema(description = "")
  public Object getAppLauncherVisible() {
    return appLauncherVisible;
  }

  public void setAppLauncherVisible(Object appLauncherVisible) {
    this.appLauncherVisible = appLauncherVisible;
  }

  public SchemasBookmarkProps domain(Object domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The URL or domain of the bookmark.
   * @return domain
  **/
  @Schema(example = "https://mybookmark.com", required = true, description = "The URL or domain of the bookmark.")
  public Object getDomain() {
    return domain;
  }

  public void setDomain(Object domain) {
    this.domain = domain;
  }

  public SchemasBookmarkProps logoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
    return this;
  }

   /**
   * Get logoUrl
   * @return logoUrl
  **/
  @Schema(description = "")
  public String getLogoUrl() {
    return logoUrl;
  }

  public void setLogoUrl(String logoUrl) {
    this.logoUrl = logoUrl;
  }

  public SchemasBookmarkProps name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SchemasBookmarkProps type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The application type.
   * @return type
  **/
  @Schema(example = "bookmark", required = true, description = "The application type.")
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
    SchemasBookmarkProps schemasBookmarkProps = (SchemasBookmarkProps) o;
    return Objects.equals(this.appLauncherVisible, schemasBookmarkProps.appLauncherVisible) &&
        Objects.equals(this.domain, schemasBookmarkProps.domain) &&
        Objects.equals(this.logoUrl, schemasBookmarkProps.logoUrl) &&
        Objects.equals(this.name, schemasBookmarkProps.name) &&
        Objects.equals(this.type, schemasBookmarkProps.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLauncherVisible, domain, logoUrl, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasBookmarkProps {\n");
    
    sb.append("    appLauncherVisible: ").append(toIndentedString(appLauncherVisible)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
