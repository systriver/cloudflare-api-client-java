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
import io.swagger.client.model.WafRewriteAction;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Specifies that, when a WAF rule matches, its configured action will be replaced by the action configured in this object.
 */
@Schema(description = "Specifies that, when a WAF rule matches, its configured action will be replaced by the action configured in this object.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class RewriteAction {
  @SerializedName("block")
  private WafRewriteAction block = null;

  @SerializedName("challenge")
  private Object challenge = null;

  @SerializedName("default")
  private Object _default = null;

  @SerializedName("disable")
  private WafRewriteAction disable = null;

  @SerializedName("simulate")
  private Object simulate = null;

  public RewriteAction block(WafRewriteAction block) {
    this.block = block;
    return this;
  }

   /**
   * Get block
   * @return block
  **/
  @Schema(description = "")
  public WafRewriteAction getBlock() {
    return block;
  }

  public void setBlock(WafRewriteAction block) {
    this.block = block;
  }

  public RewriteAction challenge(Object challenge) {
    this.challenge = challenge;
    return this;
  }

   /**
   * Get challenge
   * @return challenge
  **/
  @Schema(example = "block", description = "")
  public Object getChallenge() {
    return challenge;
  }

  public void setChallenge(Object challenge) {
    this.challenge = challenge;
  }

  public RewriteAction _default(Object _default) {
    this._default = _default;
    return this;
  }

   /**
   * Get _default
   * @return _default
  **/
  @Schema(example = "block", description = "")
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public RewriteAction disable(WafRewriteAction disable) {
    this.disable = disable;
    return this;
  }

   /**
   * Get disable
   * @return disable
  **/
  @Schema(description = "")
  public WafRewriteAction getDisable() {
    return disable;
  }

  public void setDisable(WafRewriteAction disable) {
    this.disable = disable;
  }

  public RewriteAction simulate(Object simulate) {
    this.simulate = simulate;
    return this;
  }

   /**
   * Get simulate
   * @return simulate
  **/
  @Schema(example = "disable", description = "")
  public Object getSimulate() {
    return simulate;
  }

  public void setSimulate(Object simulate) {
    this.simulate = simulate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RewriteAction rewriteAction = (RewriteAction) o;
    return Objects.equals(this.block, rewriteAction.block) &&
        Objects.equals(this.challenge, rewriteAction.challenge) &&
        Objects.equals(this._default, rewriteAction._default) &&
        Objects.equals(this.disable, rewriteAction.disable) &&
        Objects.equals(this.simulate, rewriteAction.simulate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(block, challenge, _default, disable, simulate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RewriteAction {\n");
    
    sb.append("    block: ").append(toIndentedString(block)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    simulate: ").append(toIndentedString(simulate)).append("\n");
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
