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
import io.swagger.client.model.ListMetadata;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * BulkWriteInner
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class BulkWriteInner {
  @SerializedName("base64")
  private Boolean base64 = false;

  @SerializedName("expiration")
  private BigDecimal expiration = null;

  @SerializedName("expiration_ttl")
  private BigDecimal expirationTtl = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("metadata")
  private ListMetadata metadata = null;

  @SerializedName("value")
  private String value = null;

  public BulkWriteInner base64(Boolean base64) {
    this.base64 = base64;
    return this;
  }

   /**
   * Whether or not the server should base64 decode the value before storing it. Useful for writing values that wouldn&#x27;t otherwise be valid JSON strings, such as images.
   * @return base64
  **/
  @Schema(description = "Whether or not the server should base64 decode the value before storing it. Useful for writing values that wouldn't otherwise be valid JSON strings, such as images.")
  public Boolean isBase64() {
    return base64;
  }

  public void setBase64(Boolean base64) {
    this.base64 = base64;
  }

  public BulkWriteInner expiration(BigDecimal expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @Schema(description = "")
  public BigDecimal getExpiration() {
    return expiration;
  }

  public void setExpiration(BigDecimal expiration) {
    this.expiration = expiration;
  }

  public BulkWriteInner expirationTtl(BigDecimal expirationTtl) {
    this.expirationTtl = expirationTtl;
    return this;
  }

   /**
   * Get expirationTtl
   * @return expirationTtl
  **/
  @Schema(description = "")
  public BigDecimal getExpirationTtl() {
    return expirationTtl;
  }

  public void setExpirationTtl(BigDecimal expirationTtl) {
    this.expirationTtl = expirationTtl;
  }

  public BulkWriteInner key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @Schema(description = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public BulkWriteInner metadata(ListMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @Schema(description = "")
  public ListMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ListMetadata metadata) {
    this.metadata = metadata;
  }

  public BulkWriteInner value(String value) {
    this.value = value;
    return this;
  }

   /**
   * A UTF-8 encoded string to be stored, up to 10 MB in length.
   * @return value
  **/
  @Schema(example = "Some string", description = "A UTF-8 encoded string to be stored, up to 10 MB in length.")
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
    BulkWriteInner bulkWriteInner = (BulkWriteInner) o;
    return Objects.equals(this.base64, bulkWriteInner.base64) &&
        Objects.equals(this.expiration, bulkWriteInner.expiration) &&
        Objects.equals(this.expirationTtl, bulkWriteInner.expirationTtl) &&
        Objects.equals(this.key, bulkWriteInner.key) &&
        Objects.equals(this.metadata, bulkWriteInner.metadata) &&
        Objects.equals(this.value, bulkWriteInner.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base64, expiration, expirationTtl, key, metadata, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkWriteInner {\n");
    
    sb.append("    base64: ").append(toIndentedString(base64)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    expirationTtl: ").append(toIndentedString(expirationTtl)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
