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
import io.swagger.client.model.KeysComponentsSchemasIdentifier;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIKeyResponseCollectionResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T13:40:27.702461541+09:00[Asia/Tokyo]")
public class CloudflareClientAPIKeyResponseCollectionResult {
  @SerializedName("created")
  private OffsetDateTime created = null;

  @SerializedName("id")
  private KeysComponentsSchemasIdentifier id = null;

  public CloudflareClientAPIKeyResponseCollectionResult created(OffsetDateTime created) {
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

  public CloudflareClientAPIKeyResponseCollectionResult id(KeysComponentsSchemasIdentifier id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public KeysComponentsSchemasIdentifier getId() {
    return id;
  }

  public void setId(KeysComponentsSchemasIdentifier id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIKeyResponseCollectionResult cloudflareClientAPIKeyResponseCollectionResult = (CloudflareClientAPIKeyResponseCollectionResult) o;
    return Objects.equals(this.created, cloudflareClientAPIKeyResponseCollectionResult.created) &&
        Objects.equals(this.id, cloudflareClientAPIKeyResponseCollectionResult.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIKeyResponseCollectionResult {\n");
    
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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