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
 * MultipleRouteDeleteResponseResult
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class MultipleRouteDeleteResponseResult {
  @SerializedName("deleted")
  private Boolean deleted = null;

  @SerializedName("deleted_routes")
  private Object deletedRoutes = null;

  public MultipleRouteDeleteResponseResult deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(example = "true", description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }

  public MultipleRouteDeleteResponseResult deletedRoutes(Object deletedRoutes) {
    this.deletedRoutes = deletedRoutes;
    return this;
  }

   /**
   * Get deletedRoutes
   * @return deletedRoutes
  **/
  @Schema(description = "")
  public Object getDeletedRoutes() {
    return deletedRoutes;
  }

  public void setDeletedRoutes(Object deletedRoutes) {
    this.deletedRoutes = deletedRoutes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleRouteDeleteResponseResult multipleRouteDeleteResponseResult = (MultipleRouteDeleteResponseResult) o;
    return Objects.equals(this.deleted, multipleRouteDeleteResponseResult.deleted) &&
        Objects.equals(this.deletedRoutes, multipleRouteDeleteResponseResult.deletedRoutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deleted, deletedRoutes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleRouteDeleteResponseResult {\n");
    
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    deletedRoutes: ").append(toIndentedString(deletedRoutes)).append("\n");
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
