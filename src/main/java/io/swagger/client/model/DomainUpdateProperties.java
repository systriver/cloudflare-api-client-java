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
import io.swagger.client.model.NameServers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DomainUpdateProperties
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DomainUpdateProperties {
  @SerializedName("auto_renew")
  private Boolean autoRenew = null;

  @SerializedName("locked")
  private Boolean locked = null;

  @SerializedName("name_servers")
  private NameServers nameServers = null;

  @SerializedName("privacy")
  private Boolean privacy = null;

  public DomainUpdateProperties autoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

   /**
   * Get autoRenew
   * @return autoRenew
  **/
  @Schema(description = "")
  public Boolean getAutoRenew() {
    return autoRenew;
  }

  public void setAutoRenew(Boolean autoRenew) {
    this.autoRenew = autoRenew;
  }

  public DomainUpdateProperties locked(Boolean locked) {
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @Schema(description = "")
  public Boolean getLocked() {
    return locked;
  }

  public void setLocked(Boolean locked) {
    this.locked = locked;
  }

  public DomainUpdateProperties nameServers(NameServers nameServers) {
    this.nameServers = nameServers;
    return this;
  }

   /**
   * Get nameServers
   * @return nameServers
  **/
  @Schema(description = "")
  public NameServers getNameServers() {
    return nameServers;
  }

  public void setNameServers(NameServers nameServers) {
    this.nameServers = nameServers;
  }

  public DomainUpdateProperties privacy(Boolean privacy) {
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @Schema(description = "")
  public Boolean getPrivacy() {
    return privacy;
  }

  public void setPrivacy(Boolean privacy) {
    this.privacy = privacy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainUpdateProperties domainUpdateProperties = (DomainUpdateProperties) o;
    return Objects.equals(this.autoRenew, domainUpdateProperties.autoRenew) &&
        Objects.equals(this.locked, domainUpdateProperties.locked) &&
        Objects.equals(this.nameServers, domainUpdateProperties.nameServers) &&
        Objects.equals(this.privacy, domainUpdateProperties.privacy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRenew, locked, nameServers, privacy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainUpdateProperties {\n");
    
    sb.append("    autoRenew: ").append(toIndentedString(autoRenew)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    nameServers: ").append(toIndentedString(nameServers)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
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