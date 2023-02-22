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
import io.swagger.client.model.SchemasBase;
import io.swagger.client.model.SortQueryStringForCacheValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * Cloudflare will treat files with the same query strings as the same file in cache, regardless of the order of the query strings. This is limited to Enterprise Zones.
 */
@Schema(description = "Cloudflare will treat files with the same query strings as the same file in cache, regardless of the order of the query strings. This is limited to Enterprise Zones.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SortQueryStringForCache extends SchemasBase implements Setting {
  @SerializedName("id")
  private String sortQueryStringForCacheId = null;

  @SerializedName("value")
  private SortQueryStringForCacheValue sortQueryStringForCacheValue = null;

  public SortQueryStringForCache sortQueryStringForCacheId(String sortQueryStringForCacheId) {
    this.sortQueryStringForCacheId = sortQueryStringForCacheId;
    return this;
  }

   /**
   * ID of the zone setting.
   * @return sortQueryStringForCacheId
  **/
  @Schema(example = "sort_query_string_for_cache", description = "ID of the zone setting.")
  public String getSortQueryStringForCacheId() {
    return sortQueryStringForCacheId;
  }

  public void setSortQueryStringForCacheId(String sortQueryStringForCacheId) {
    this.sortQueryStringForCacheId = sortQueryStringForCacheId;
  }

  public SortQueryStringForCache sortQueryStringForCacheValue(SortQueryStringForCacheValue sortQueryStringForCacheValue) {
    this.sortQueryStringForCacheValue = sortQueryStringForCacheValue;
    return this;
  }

   /**
   * Get sortQueryStringForCacheValue
   * @return sortQueryStringForCacheValue
  **/
  @Schema(description = "")
  public SortQueryStringForCacheValue getSortQueryStringForCacheValue() {
    return sortQueryStringForCacheValue;
  }

  public void setSortQueryStringForCacheValue(SortQueryStringForCacheValue sortQueryStringForCacheValue) {
    this.sortQueryStringForCacheValue = sortQueryStringForCacheValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortQueryStringForCache sortQueryStringForCache = (SortQueryStringForCache) o;
    return Objects.equals(this.sortQueryStringForCacheId, sortQueryStringForCache.sortQueryStringForCacheId) &&
        Objects.equals(this.sortQueryStringForCacheValue, sortQueryStringForCache.sortQueryStringForCacheValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortQueryStringForCacheId, sortQueryStringForCacheValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortQueryStringForCache {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sortQueryStringForCacheId: ").append(toIndentedString(sortQueryStringForCacheId)).append("\n");
    sb.append("    sortQueryStringForCacheValue: ").append(toIndentedString(sortQueryStringForCacheValue)).append("\n");
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