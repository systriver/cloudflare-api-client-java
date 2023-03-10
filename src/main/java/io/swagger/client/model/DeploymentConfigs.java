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
 * Configs for deployments in a project.
 */
@Schema(description = "Configs for deployments in a project.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DeploymentConfigs {
  @SerializedName("preview")
  private AnyOfdeploymentConfigsPreview preview = null;

  @SerializedName("production")
  private AnyOfdeploymentConfigsProduction production = null;

  public DeploymentConfigs preview(AnyOfdeploymentConfigsPreview preview) {
    this.preview = preview;
    return this;
  }

   /**
   * Configs for preview deploys.
   * @return preview
  **/
  @Schema(description = "Configs for preview deploys.")
  public AnyOfdeploymentConfigsPreview getPreview() {
    return preview;
  }

  public void setPreview(AnyOfdeploymentConfigsPreview preview) {
    this.preview = preview;
  }

  public DeploymentConfigs production(AnyOfdeploymentConfigsProduction production) {
    this.production = production;
    return this;
  }

   /**
   * Configs for production deploys.
   * @return production
  **/
  @Schema(description = "Configs for production deploys.")
  public AnyOfdeploymentConfigsProduction getProduction() {
    return production;
  }

  public void setProduction(AnyOfdeploymentConfigsProduction production) {
    this.production = production;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentConfigs deploymentConfigs = (DeploymentConfigs) o;
    return Objects.equals(this.preview, deploymentConfigs.preview) &&
        Objects.equals(this.production, deploymentConfigs.production);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preview, production);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentConfigs {\n");
    
    sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
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
