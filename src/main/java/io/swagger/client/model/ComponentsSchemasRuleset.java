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
import io.swagger.client.model.DynamicRedirectRulesComponentsSchemasRule;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * ComponentsSchemasRuleset
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class ComponentsSchemasRuleset {
  @SerializedName("description")
  private Object description = null;

  @SerializedName("id")
  private Object id = null;

  @SerializedName("kind")
  private Object kind = null;

  @SerializedName("name")
  private Object name = null;

  @SerializedName("phase")
  private Object phase = null;

  @SerializedName("rules")
  private List<DynamicRedirectRulesComponentsSchemasRule> rules = null;

  public ComponentsSchemasRuleset description(Object description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public Object getDescription() {
    return description;
  }

  public void setDescription(Object description) {
    this.description = description;
  }

  public ComponentsSchemasRuleset id(Object id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(example = "2f2feab2026849078ba485f918791bdc", description = "")
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public ComponentsSchemasRuleset kind(Object kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @Schema(example = "zone", description = "")
  public Object getKind() {
    return kind;
  }

  public void setKind(Object kind) {
    this.kind = kind;
  }

  public ComponentsSchemasRuleset name(Object name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(example = "default", description = "")
  public Object getName() {
    return name;
  }

  public void setName(Object name) {
    this.name = name;
  }

  public ComponentsSchemasRuleset phase(Object phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @Schema(example = "http_request_dynamic_redirect", description = "")
  public Object getPhase() {
    return phase;
  }

  public void setPhase(Object phase) {
    this.phase = phase;
  }

  public ComponentsSchemasRuleset rules(List<DynamicRedirectRulesComponentsSchemasRule> rules) {
    this.rules = rules;
    return this;
  }

  public ComponentsSchemasRuleset addRulesItem(DynamicRedirectRulesComponentsSchemasRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<DynamicRedirectRulesComponentsSchemasRule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * The rules in the ruleset.
   * @return rules
  **/
  @Schema(description = "The rules in the ruleset.")
  public List<DynamicRedirectRulesComponentsSchemasRule> getRules() {
    return rules;
  }

  public void setRules(List<DynamicRedirectRulesComponentsSchemasRule> rules) {
    this.rules = rules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentsSchemasRuleset componentsSchemasRuleset = (ComponentsSchemasRuleset) o;
    return Objects.equals(this.description, componentsSchemasRuleset.description) &&
        Objects.equals(this.id, componentsSchemasRuleset.id) &&
        Objects.equals(this.kind, componentsSchemasRuleset.kind) &&
        Objects.equals(this.name, componentsSchemasRuleset.name) &&
        Objects.equals(this.phase, componentsSchemasRuleset.phase) &&
        Objects.equals(this.rules, componentsSchemasRuleset.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, kind, name, phase, rules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentsSchemasRuleset {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
