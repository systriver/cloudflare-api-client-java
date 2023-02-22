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
import io.swagger.client.model.ComponentsSchemasVersion;
import io.swagger.client.model.Script;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * GetZoneScriptResponse
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class GetZoneScriptResponse extends Script {
  @SerializedName("versions")
  private List<ComponentsSchemasVersion> versions = null;

  public GetZoneScriptResponse versions(List<ComponentsSchemasVersion> versions) {
    this.versions = versions;
    return this;
  }

  public GetZoneScriptResponse addVersionsItem(ComponentsSchemasVersion versionsItem) {
    if (this.versions == null) {
      this.versions = new ArrayList<ComponentsSchemasVersion>();
    }
    this.versions.add(versionsItem);
    return this;
  }

   /**
   * Get versions
   * @return versions
  **/
  @Schema(example = "[{\"fetched_at\":\"2021-08-18T10:51:08Z\",\"hash\":\"e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b423\",\"js_integrity_score\":2}]", description = "")
  public List<ComponentsSchemasVersion> getVersions() {
    return versions;
  }

  public void setVersions(List<ComponentsSchemasVersion> versions) {
    this.versions = versions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetZoneScriptResponse getZoneScriptResponse = (GetZoneScriptResponse) o;
    return Objects.equals(this.versions, getZoneScriptResponse.versions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(versions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetZoneScriptResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
