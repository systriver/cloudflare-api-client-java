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
import io.swagger.client.model.ApiResponseCollection;
import io.swagger.client.model.ResultInfo;
import io.swagger.client.model.ZoneComponentsSchemasZone;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * CloudflareClientAPIComponentsSchemasResponseCollection
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIComponentsSchemasResponseCollection extends ApiResponseCollection {
  @SerializedName("result")
  private List<ZoneComponentsSchemasZone> cloudflareClientAPIComponentsSchemasResponseCollectionResult = null;

  public CloudflareClientAPIComponentsSchemasResponseCollection cloudflareClientAPIComponentsSchemasResponseCollectionResult(List<ZoneComponentsSchemasZone> cloudflareClientAPIComponentsSchemasResponseCollectionResult) {
    this.cloudflareClientAPIComponentsSchemasResponseCollectionResult = cloudflareClientAPIComponentsSchemasResponseCollectionResult;
    return this;
  }

  public CloudflareClientAPIComponentsSchemasResponseCollection addCloudflareClientAPIComponentsSchemasResponseCollectionResultItem(ZoneComponentsSchemasZone cloudflareClientAPIComponentsSchemasResponseCollectionResultItem) {
    if (this.cloudflareClientAPIComponentsSchemasResponseCollectionResult == null) {
      this.cloudflareClientAPIComponentsSchemasResponseCollectionResult = new ArrayList<ZoneComponentsSchemasZone>();
    }
    this.cloudflareClientAPIComponentsSchemasResponseCollectionResult.add(cloudflareClientAPIComponentsSchemasResponseCollectionResultItem);
    return this;
  }

   /**
   * Get cloudflareClientAPIComponentsSchemasResponseCollectionResult
   * @return cloudflareClientAPIComponentsSchemasResponseCollectionResult
  **/
  @Schema(description = "")
  public List<ZoneComponentsSchemasZone> getCloudflareClientAPIComponentsSchemasResponseCollectionResult() {
    return cloudflareClientAPIComponentsSchemasResponseCollectionResult;
  }

  public void setCloudflareClientAPIComponentsSchemasResponseCollectionResult(List<ZoneComponentsSchemasZone> cloudflareClientAPIComponentsSchemasResponseCollectionResult) {
    this.cloudflareClientAPIComponentsSchemasResponseCollectionResult = cloudflareClientAPIComponentsSchemasResponseCollectionResult;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIComponentsSchemasResponseCollection cloudflareClientAPIComponentsSchemasResponseCollection = (CloudflareClientAPIComponentsSchemasResponseCollection) o;
    return Objects.equals(this.cloudflareClientAPIComponentsSchemasResponseCollectionResult, cloudflareClientAPIComponentsSchemasResponseCollection.cloudflareClientAPIComponentsSchemasResponseCollectionResult) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudflareClientAPIComponentsSchemasResponseCollectionResult, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIComponentsSchemasResponseCollection {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    cloudflareClientAPIComponentsSchemasResponseCollectionResult: ").append(toIndentedString(cloudflareClientAPIComponentsSchemasResponseCollectionResult)).append("\n");
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
