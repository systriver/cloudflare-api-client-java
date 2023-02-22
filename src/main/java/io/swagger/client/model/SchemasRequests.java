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
import io.swagger.client.model.BandwidthSslProtocols;
import io.swagger.client.model.SchemasrequestsSsl;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Breakdown of totals for requests.
 */
@Schema(description = "Breakdown of totals for requests.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class SchemasRequests {
  @SerializedName("all")
  private Integer all = null;

  @SerializedName("cached")
  private Integer cached = null;

  @SerializedName("content_type")
  private Object contentType = null;

  @SerializedName("country")
  private Object country = null;

  @SerializedName("http_status")
  private Map<String, Object> httpStatus = null;

  @SerializedName("ssl")
  private SchemasrequestsSsl ssl = null;

  @SerializedName("ssl_protocols")
  private BandwidthSslProtocols sslProtocols = null;

  @SerializedName("uncached")
  private Integer uncached = null;

  public SchemasRequests all(Integer all) {
    this.all = all;
    return this;
  }

   /**
   * Total number of requests served.
   * @return all
  **/
  @Schema(description = "Total number of requests served.")
  public Integer getAll() {
    return all;
  }

  public void setAll(Integer all) {
    this.all = all;
  }

  public SchemasRequests cached(Integer cached) {
    this.cached = cached;
    return this;
  }

   /**
   * Total number of cached requests served.
   * @return cached
  **/
  @Schema(description = "Total number of cached requests served.")
  public Integer getCached() {
    return cached;
  }

  public void setCached(Integer cached) {
    this.cached = cached;
  }

  public SchemasRequests contentType(Object contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * A variable list of key/value pairs where the key represents the type of content served, and the value is the number of requests.
   * @return contentType
  **/
  @Schema(example = "{\"css\":15343,\"gif\":23178,\"html\":1234213,\"javascript\":318236,\"jpeg\":1982048}", description = "A variable list of key/value pairs where the key represents the type of content served, and the value is the number of requests.")
  public Object getContentType() {
    return contentType;
  }

  public void setContentType(Object contentType) {
    this.contentType = contentType;
  }

  public SchemasRequests country(Object country) {
    this.country = country;
    return this;
  }

   /**
   * A variable list of key/value pairs where the key is a two-digit country code and the value is the number of requests served to that country.
   * @return country
  **/
  @Schema(example = "{\"AG\":37298,\"GI\":293846,\"US\":4181364}", description = "A variable list of key/value pairs where the key is a two-digit country code and the value is the number of requests served to that country.")
  public Object getCountry() {
    return country;
  }

  public void setCountry(Object country) {
    this.country = country;
  }

  public SchemasRequests httpStatus(Map<String, Object> httpStatus) {
    this.httpStatus = httpStatus;
    return this;
  }

  public SchemasRequests putHttpStatusItem(String key, Object httpStatusItem) {
    if (this.httpStatus == null) {
      this.httpStatus = new HashMap<String, Object>();
    }
    this.httpStatus.put(key, httpStatusItem);
    return this;
  }

   /**
   * Key/value pairs where the key is a HTTP status code and the value is the number of requests served with that code.
   * @return httpStatus
  **/
  @Schema(example = "{\"200\":13496983,\"301\":283,\"400\":187936,\"402\":1828,\"404\":1293}", description = "Key/value pairs where the key is a HTTP status code and the value is the number of requests served with that code.")
  public Map<String, Object> getHttpStatus() {
    return httpStatus;
  }

  public void setHttpStatus(Map<String, Object> httpStatus) {
    this.httpStatus = httpStatus;
  }

  public SchemasRequests ssl(SchemasrequestsSsl ssl) {
    this.ssl = ssl;
    return this;
  }

   /**
   * Get ssl
   * @return ssl
  **/
  @Schema(description = "")
  public SchemasrequestsSsl getSsl() {
    return ssl;
  }

  public void setSsl(SchemasrequestsSsl ssl) {
    this.ssl = ssl;
  }

  public SchemasRequests sslProtocols(BandwidthSslProtocols sslProtocols) {
    this.sslProtocols = sslProtocols;
    return this;
  }

   /**
   * Get sslProtocols
   * @return sslProtocols
  **/
  @Schema(description = "")
  public BandwidthSslProtocols getSslProtocols() {
    return sslProtocols;
  }

  public void setSslProtocols(BandwidthSslProtocols sslProtocols) {
    this.sslProtocols = sslProtocols;
  }

  public SchemasRequests uncached(Integer uncached) {
    this.uncached = uncached;
    return this;
  }

   /**
   * Total number of requests served from the origin.
   * @return uncached
  **/
  @Schema(description = "Total number of requests served from the origin.")
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
    SchemasRequests schemasRequests = (SchemasRequests) o;
    return Objects.equals(this.all, schemasRequests.all) &&
        Objects.equals(this.cached, schemasRequests.cached) &&
        Objects.equals(this.contentType, schemasRequests.contentType) &&
        Objects.equals(this.country, schemasRequests.country) &&
        Objects.equals(this.httpStatus, schemasRequests.httpStatus) &&
        Objects.equals(this.ssl, schemasRequests.ssl) &&
        Objects.equals(this.sslProtocols, schemasRequests.sslProtocols) &&
        Objects.equals(this.uncached, schemasRequests.uncached);
  }

  @Override
  public int hashCode() {
    return Objects.hash(all, cached, contentType, country, httpStatus, ssl, sslProtocols, uncached);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchemasRequests {\n");
    
    sb.append("    all: ").append(toIndentedString(all)).append("\n");
    sb.append("    cached: ").append(toIndentedString(cached)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    httpStatus: ").append(toIndentedString(httpStatus)).append("\n");
    sb.append("    ssl: ").append(toIndentedString(ssl)).append("\n");
    sb.append("    sslProtocols: ").append(toIndentedString(sslProtocols)).append("\n");
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
