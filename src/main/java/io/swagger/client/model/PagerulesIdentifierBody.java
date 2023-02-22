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
import io.swagger.client.model.PageRuleComponentsSchemasStatus;
import io.swagger.client.model.SchemasActions;
import io.swagger.client.model.Targets;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * PagerulesIdentifierBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PagerulesIdentifierBody {
  @SerializedName("actions")
  private SchemasActions actions = null;

  @SerializedName("priority")
  private Integer priority = null;

  @SerializedName("status")
  private PageRuleComponentsSchemasStatus status = null;

  @SerializedName("targets")
  private Targets targets = null;

  public PagerulesIdentifierBody actions(SchemasActions actions) {
    this.actions = actions;
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @Schema(required = true, description = "")
  public SchemasActions getActions() {
    return actions;
  }

  public void setActions(SchemasActions actions) {
    this.actions = actions;
  }

  public PagerulesIdentifierBody priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @Schema(description = "")
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PagerulesIdentifierBody status(PageRuleComponentsSchemasStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(description = "")
  public PageRuleComponentsSchemasStatus getStatus() {
    return status;
  }

  public void setStatus(PageRuleComponentsSchemasStatus status) {
    this.status = status;
  }

  public PagerulesIdentifierBody targets(Targets targets) {
    this.targets = targets;
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @Schema(required = true, description = "")
  public Targets getTargets() {
    return targets;
  }

  public void setTargets(Targets targets) {
    this.targets = targets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagerulesIdentifierBody pagerulesIdentifierBody = (PagerulesIdentifierBody) o;
    return Objects.equals(this.actions, pagerulesIdentifierBody.actions) &&
        Objects.equals(this.priority, pagerulesIdentifierBody.priority) &&
        Objects.equals(this.status, pagerulesIdentifierBody.status) &&
        Objects.equals(this.targets, pagerulesIdentifierBody.targets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actions, priority, status, targets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagerulesIdentifierBody {\n");
    
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
