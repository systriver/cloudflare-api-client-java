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
import io.swagger.client.model.MonitorComponentsSchemasIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * CloudflareClientAPIPreviewResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIPreviewResponseResult {
  @SerializedName("pools")
  private Map<String, Object> pools = null;

  @SerializedName("preview_id")
  private MonitorComponentsSchemasIdentifier previewId = null;

  public CloudflareClientAPIPreviewResponseResult pools(Map<String, Object> pools) {
    this.pools = pools;
    return this;
  }

  public CloudflareClientAPIPreviewResponseResult putPoolsItem(String key, Object poolsItem) {
    if (this.pools == null) {
      this.pools = new HashMap<String, Object>();
    }
    this.pools.put(key, poolsItem);
    return this;
  }

   /**
   * Get pools
   * @return pools
  **/
  @Schema(example = "{\"abwlnp5jbqn45ecgxd03erbgtxtqai0d\":\"WNAM Datacenter\",\"ve8h9lrcip5n5bbga9yqmdws28ay5d0l\":\"EEU Datacenter\"}", description = "")
  public Map<String, Object> getPools() {
    return pools;
  }

  public void setPools(Map<String, Object> pools) {
    this.pools = pools;
  }

  public CloudflareClientAPIPreviewResponseResult previewId(MonitorComponentsSchemasIdentifier previewId) {
    this.previewId = previewId;
    return this;
  }

   /**
   * Get previewId
   * @return previewId
  **/
  @Schema(description = "")
  public MonitorComponentsSchemasIdentifier getPreviewId() {
    return previewId;
  }

  public void setPreviewId(MonitorComponentsSchemasIdentifier previewId) {
    this.previewId = previewId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIPreviewResponseResult cloudflareClientAPIPreviewResponseResult = (CloudflareClientAPIPreviewResponseResult) o;
    return Objects.equals(this.pools, cloudflareClientAPIPreviewResponseResult.pools) &&
        Objects.equals(this.previewId, cloudflareClientAPIPreviewResponseResult.previewId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pools, previewId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIPreviewResponseResult {\n");
    
    sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
    sb.append("    previewId: ").append(toIndentedString(previewId)).append("\n");
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
