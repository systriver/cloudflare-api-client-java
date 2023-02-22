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
import io.swagger.client.model.TransformRulesComponentsSchemasActionParameters;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TransformRulesComponentsSchemasRule
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class TransformRulesComponentsSchemasRule {
  @SerializedName("action")
  private Object action = null;

  @SerializedName("action_parameters")
  private TransformRulesComponentsSchemasActionParameters actionParameters = null;

  @SerializedName("description")
  private Object description = null;

  @SerializedName("expression")
  private Object expression = null;

  @SerializedName("id")
  private Object id = null;

  @SerializedName("version")
  private Object version = null;

  public TransformRulesComponentsSchemasRule action(Object action) {
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @Schema(example = "rewrite", description = "")
  public Object getAction() {
    return action;
  }

  public void setAction(Object action) {
    this.action = action;
  }

  public TransformRulesComponentsSchemasRule actionParameters(TransformRulesComponentsSchemasActionParameters actionParameters) {
    this.actionParameters = actionParameters;
    return this;
  }

   /**
   * Get actionParameters
   * @return actionParameters
  **/
  @Schema(description = "")
  public TransformRulesComponentsSchemasActionParameters getActionParameters() {
    return actionParameters;
  }

  public void setActionParameters(TransformRulesComponentsSchemasActionParameters actionParameters) {
    this.actionParameters = actionParameters;
  }

  public TransformRulesComponentsSchemasRule description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(example = "change request based on ip location", description = "")
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public TransformRulesComponentsSchemasRule expression(Object expression) {
    this.expression = expression;
    return this;
  }

   /**
   * Get expression
   * @return expression
  **/
  @Schema(example = "ip.geoip.country eq \"AL\"", description = "")
  public Object getExpression() {
    return expression;
  }

  public void setExpression(Object expression) {
    this.expression = expression;
  }

  public TransformRulesComponentsSchemasRule id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "3a03d665bac047339bb530ecb439a90d", description = "")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public TransformRulesComponentsSchemasRule version(Object version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @Schema(example = "1", description = "")
  public Object getVersion() {
    return version;
  }

  public void setVersion(Object version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransformRulesComponentsSchemasRule transformRulesComponentsSchemasRule = (TransformRulesComponentsSchemasRule) o;
    return Objects.equals(this.action, transformRulesComponentsSchemasRule.action) &&
        Objects.equals(this.actionParameters, transformRulesComponentsSchemasRule.actionParameters) &&
        Objects.equals(this.description, transformRulesComponentsSchemasRule.description) &&
        Objects.equals(this.expression, transformRulesComponentsSchemasRule.expression) &&
        Objects.equals(this.id, transformRulesComponentsSchemasRule.id) &&
        Objects.equals(this.version, transformRulesComponentsSchemasRule.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionParameters, description, expression, id, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransformRulesComponentsSchemasRule {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionParameters: ").append(toIndentedString(actionParameters)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
