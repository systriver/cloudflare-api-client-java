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
import io.swagger.client.model.LiveInputMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * LiveInputObjectWithoutUrl
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class LiveInputObjectWithoutUrl {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("meta")
  private LiveInputMetadata meta = null;

  @SerializedName("modified")
  private OffsetDateTime modified = null;

  @SerializedName("uid")
  private String uid = null;

  public LiveInputObjectWithoutUrl created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @Schema(description = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public LiveInputObjectWithoutUrl meta(LiveInputMetadata meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @Schema(description = "")
  public LiveInputMetadata getMeta() {
    return meta;
  }

  public void setMeta(LiveInputMetadata meta) {
    this.meta = meta;
  }

  public LiveInputObjectWithoutUrl modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @Schema(description = "")
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
  }

  public LiveInputObjectWithoutUrl uid(String uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LiveInputObjectWithoutUrl liveInputObjectWithoutUrl = (LiveInputObjectWithoutUrl) o;
    return Objects.equals(this.created, liveInputObjectWithoutUrl.created) &&
        Objects.equals(this.meta, liveInputObjectWithoutUrl.meta) &&
        Objects.equals(this.modified, liveInputObjectWithoutUrl.modified) &&
        Objects.equals(this.uid, liveInputObjectWithoutUrl.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, meta, modified, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LiveInputObjectWithoutUrl {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
