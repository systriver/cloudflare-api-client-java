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
 * Breakdown of totals for bandwidth in the form of bytes.
 */
@Schema(description = "Breakdown of totals for bandwidth in the form of bytes.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class BandwidthByColo {
  @SerializedName("all")
  private Integer all = null;

  @SerializedName("cached")
  private Integer cached = null;

  @SerializedName("uncached")
  private Integer uncached = null;

  public BandwidthByColo all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * The total number of bytes served within the time frame.
   * @return all
  **/
  @Schema(description = "The total number of bytes served within the time frame.")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public BandwidthByColo cached(Integer cached) {
    this.cached = cached;
    return this;
  }

   /**
   * The number of bytes that were cached (and served) by Cloudflare.
   * @return cached
  **/
  @Schema(description = "The number of bytes that were cached (and served) by Cloudflare.")
  public Integer getCached() {
    return cached;
  }

  public void setCached(Integer cached) {
    this.cached = cached;
  }

  public BandwidthByColo uncached(Integer uncached) {
    this.uncached = uncached;
    return this;
  }

   /**
   * The number of bytes that were fetched and served from the origin server.
   * @return uncached
  **/
  @Schema(description = "The number of bytes that were fetched and served from the origin server.")
  public Integer getUncached() {
    return uncached;
  }

  public void setUncached(Integer uncached) {
    this.uncached = uncached;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BandwidthByColo bandwidthByColo = (BandwidthByColo) o;
    return Objects.equals(this.all, bandwidthByColo.all) &&
        Objects.equals(this.cached, bandwidthByColo.cached) &&
        Objects.equals(this.uncached, bandwidthByColo.uncached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, cached, uncached);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BandwidthByColo {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    uncached: ").append(toIndentedString(uncached)).append("\n");
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
