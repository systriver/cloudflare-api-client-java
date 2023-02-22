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
import io.swagger.client.model.Trace;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * List of steps acting on request/response
 */
@Schema(description = "List of steps acting on request/response")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class TraceInner {
  @SerializedName("action")
  private String action = null;

  @SerializedName("action_parameters")
  private Object actionParameters = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("expression")
  private String expression = null;

  @SerializedName("kind")
  private String kind = null;

  @SerializedName("matched")
  private Boolean matched = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("step_name")
  private String stepName = null;

  @SerializedName("trace")
  private Trace trace = null;

  @SerializedName("type")
  private String type = null;

  public TraceInner action(String action) {
    this.action = action;
    return this;
  }

   /**
   * If step type is rule, then action performed by this rule
   * @return action
  **/
  @Schema(example = "execute", description = "If step type is rule, then action performed by this rule")
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public TraceInner actionParameters(Object actionParameters) {
    this.actionParameters = actionParameters;
    return this;
  }

   /**
   * If step type is rule, then action parameters of this rule as JSON
   * @return actionParameters
  **/
  @Schema(example = "{\"id\":\"4814384a9e5d4991b9815dcfc25d2f1f\"}", description = "If step type is rule, then action parameters of this rule as JSON")
  public Object getActionParameters() {
    return actionParameters;
  }

  public void setActionParameters(Object actionParameters) {
    this.actionParameters = actionParameters;
  }

  public TraceInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * If step type is rule or ruleset, the description of this entity
   * @return description
  **/
  @Schema(example = "some rule", description = "If step type is rule or ruleset, the description of this entity")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TraceInner expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * If step type is rule, then expression used to match for this rule
   * @return expression
  **/
  @Schema(example = "ip.src ne 1.1.1.1", description = "If step type is rule, then expression used to match for this rule")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public TraceInner kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * If step type is ruleset, then kind of this ruleset
   * @return kind
  **/
  @Schema(example = "zone", description = "If step type is ruleset, then kind of this ruleset")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public TraceInner matched(Boolean matched) {
    this.matched = matched;
    return this;
  }

   /**
   * Whether tracing step affected tracing request/response
   * @return matched
  **/
  @Schema(example = "true", description = "Whether tracing step affected tracing request/response")
  public Boolean isMatched() {
    return matched;
  }

  public void setMatched(Boolean matched) {
    this.matched = matched;
  }

  public TraceInner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * If step type is ruleset, then name of this ruleset
   * @return name
  **/
  @Schema(example = "some ruleset name", description = "If step type is ruleset, then name of this ruleset")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TraceInner stepName(String stepName) {
    this.stepName = stepName;
    return this;
  }

   /**
   * Tracing step identifying name
   * @return stepName
  **/
  @Schema(example = "rule_id01", description = "Tracing step identifying name")
  public String getStepName() {
    return stepName;
  }

  public void setStepName(String stepName) {
    this.stepName = stepName;
  }

  public TraceInner trace(Trace trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Get trace
   * @return trace
  **/
  @Schema(description = "")
  public Trace getTrace() {
    return trace;
  }

  public void setTrace(Trace trace) {
    this.trace = trace;
  }

  public TraceInner type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Tracing step type
   * @return type
  **/
  @Schema(example = "rule", description = "Tracing step type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TraceInner traceInner = (TraceInner) o;
    return Objects.equals(this.action, traceInner.action) &&
        Objects.equals(this.actionParameters, traceInner.actionParameters) &&
        Objects.equals(this.description, traceInner.description) &&
        Objects.equals(this.expression, traceInner.expression) &&
        Objects.equals(this.kind, traceInner.kind) &&
        Objects.equals(this.matched, traceInner.matched) &&
        Objects.equals(this.name, traceInner.name) &&
        Objects.equals(this.stepName, traceInner.stepName) &&
        Objects.equals(this.trace, traceInner.trace) &&
        Objects.equals(this.type, traceInner.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionParameters, description, expression, kind, matched, name, stepName, trace, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TraceInner {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionParameters: ").append(toIndentedString(actionParameters)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    matched: ").append(toIndentedString(matched)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
