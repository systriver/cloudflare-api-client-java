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
import java.math.BigDecimal;
/**
 * Configures load shedding policies and percentages for the pool.
 */
@Schema(description = "Configures load shedding policies and percentages for the pool.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class LoadShedding {
  @SerializedName("default_percent")
  private BigDecimal defaultPercent = new BigDecimal(0);

  /**
   * The default policy to use when load shedding. A random policy randomly sheds a given percent of requests. A hash policy computes a hash over the CF-Connecting-IP address and sheds all requests originating from a percent of IPs.
   */
  @JsonAdapter(DefaultPolicyEnum.Adapter.class)
  public enum DefaultPolicyEnum {
    RANDOM("random"),
    HASH("hash");

    private String value;

    DefaultPolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static DefaultPolicyEnum fromValue(String input) {
      for (DefaultPolicyEnum b : DefaultPolicyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<DefaultPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultPolicyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public DefaultPolicyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return DefaultPolicyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("default_policy")
  private DefaultPolicyEnum defaultPolicy = DefaultPolicyEnum.RANDOM;

  @SerializedName("session_percent")
  private BigDecimal sessionPercent = new BigDecimal(0);

  /**
   * Only the hash policy is supported for existing sessions (to avoid exponential decay).
   */
  @JsonAdapter(SessionPolicyEnum.Adapter.class)
  public enum SessionPolicyEnum {
    HASH("hash");

    private String value;

    SessionPolicyEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SessionPolicyEnum fromValue(String input) {
      for (SessionPolicyEnum b : SessionPolicyEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SessionPolicyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SessionPolicyEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SessionPolicyEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SessionPolicyEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("session_policy")
  private SessionPolicyEnum sessionPolicy = SessionPolicyEnum.HASH;

  public LoadShedding defaultPercent(BigDecimal defaultPercent) {
    this.defaultPercent = defaultPercent;
    return this;
  }

   /**
   * The percent of traffic to shed from the pool, according to the default policy. Applies to new sessions and traffic without session affinity.
   * minimum: 0
   * maximum: 100
   * @return defaultPercent
  **/
  @Schema(description = "The percent of traffic to shed from the pool, according to the default policy. Applies to new sessions and traffic without session affinity.")
  public BigDecimal getDefaultPercent() {
    return defaultPercent;
  }

  public void setDefaultPercent(BigDecimal defaultPercent) {
    this.defaultPercent = defaultPercent;
  }

  public LoadShedding defaultPolicy(DefaultPolicyEnum defaultPolicy) {
    this.defaultPolicy = defaultPolicy;
    return this;
  }

   /**
   * The default policy to use when load shedding. A random policy randomly sheds a given percent of requests. A hash policy computes a hash over the CF-Connecting-IP address and sheds all requests originating from a percent of IPs.
   * @return defaultPolicy
  **/
  @Schema(description = "The default policy to use when load shedding. A random policy randomly sheds a given percent of requests. A hash policy computes a hash over the CF-Connecting-IP address and sheds all requests originating from a percent of IPs.")
  public DefaultPolicyEnum getDefaultPolicy() {
    return defaultPolicy;
  }

  public void setDefaultPolicy(DefaultPolicyEnum defaultPolicy) {
    this.defaultPolicy = defaultPolicy;
  }

  public LoadShedding sessionPercent(BigDecimal sessionPercent) {
    this.sessionPercent = sessionPercent;
    return this;
  }

   /**
   * The percent of existing sessions to shed from the pool, according to the session policy.
   * minimum: 0
   * maximum: 100
   * @return sessionPercent
  **/
  @Schema(description = "The percent of existing sessions to shed from the pool, according to the session policy.")
  public BigDecimal getSessionPercent() {
    return sessionPercent;
  }

  public void setSessionPercent(BigDecimal sessionPercent) {
    this.sessionPercent = sessionPercent;
  }

  public LoadShedding sessionPolicy(SessionPolicyEnum sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
    return this;
  }

   /**
   * Only the hash policy is supported for existing sessions (to avoid exponential decay).
   * @return sessionPolicy
  **/
  @Schema(description = "Only the hash policy is supported for existing sessions (to avoid exponential decay).")
  public SessionPolicyEnum getSessionPolicy() {
    return sessionPolicy;
  }

  public void setSessionPolicy(SessionPolicyEnum sessionPolicy) {
    this.sessionPolicy = sessionPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoadShedding loadShedding = (LoadShedding) o;
    return Objects.equals(this.defaultPercent, loadShedding.defaultPercent) &&
        Objects.equals(this.defaultPolicy, loadShedding.defaultPolicy) &&
        Objects.equals(this.sessionPercent, loadShedding.sessionPercent) &&
        Objects.equals(this.sessionPolicy, loadShedding.sessionPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultPercent, defaultPolicy, sessionPercent, sessionPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadShedding {\n");
    
    sb.append("    defaultPercent: ").append(toIndentedString(defaultPercent)).append("\n");
    sb.append("    defaultPolicy: ").append(toIndentedString(defaultPolicy)).append("\n");
    sb.append("    sessionPercent: ").append(toIndentedString(sessionPercent)).append("\n");
    sb.append("    sessionPolicy: ").append(toIndentedString(sessionPolicy)).append("\n");
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