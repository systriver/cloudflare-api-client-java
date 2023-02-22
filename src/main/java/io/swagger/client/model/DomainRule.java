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
import io.swagger.client.model.DomainRuleEmailDomain;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Match an entire email domain.
 */
@Schema(description = "Match an entire email domain.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class DomainRule implements Rule, RuleComponentsSchemasRule {
  @SerializedName("email_domain")
  private DomainRuleEmailDomain emailDomain = null;

  public DomainRule emailDomain(DomainRuleEmailDomain emailDomain) {
    this.emailDomain = emailDomain;
    return this;
  }

   /**
   * Get emailDomain
   * @return emailDomain
  **/
  @Schema(required = true, description = "")
  public DomainRuleEmailDomain getEmailDomain() {
    return emailDomain;
  }

  public void setEmailDomain(DomainRuleEmailDomain emailDomain) {
    this.emailDomain = emailDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainRule domainRule = (DomainRule) o;
    return Objects.equals(this.emailDomain, domainRule.emailDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainRule {\n");
    
    sb.append("    emailDomain: ").append(toIndentedString(emailDomain)).append("\n");
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
