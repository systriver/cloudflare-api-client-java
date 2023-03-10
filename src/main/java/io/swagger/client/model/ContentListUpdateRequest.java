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
import io.swagger.client.model.ContentListAction;
import io.swagger.client.model.ContentListEntries;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * ContentListUpdateRequest
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ContentListUpdateRequest {
  @SerializedName("action")
  private ContentListAction action = null;

  @SerializedName("entries")
  private ContentListEntries entries = null;

  public ContentListUpdateRequest action(ContentListAction action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(required = true, description = "")
  public ContentListAction getAction() {
    return action;
  }

  public void setAction(ContentListAction action) {
    this.action = action;
  }

  public ContentListUpdateRequest entries(ContentListEntries entries) {
    this.entries = entries;
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @Schema(required = true, description = "")
  public ContentListEntries getEntries() {
    return entries;
  }

  public void setEntries(ContentListEntries entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentListUpdateRequest contentListUpdateRequest = (ContentListUpdateRequest) o;
    return Objects.equals(this.action, contentListUpdateRequest.action) &&
        Objects.equals(this.entries, contentListUpdateRequest.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentListUpdateRequest {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
