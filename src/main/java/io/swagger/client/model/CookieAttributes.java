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
 * Configures cookie attributes for the waiting room cookie. This encrypted cookie stores a user&#x27;s status in the waiting room, such as queue position.
 */
@Schema(description = "Configures cookie attributes for the waiting room cookie. This encrypted cookie stores a user's status in the waiting room, such as queue position.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CookieAttributes {
  /**
   * Configures the SameSite attribute on the waiting room cookie. Value &#x60;auto&#x60; will be translated to &#x60;lax&#x60; or &#x60;none&#x60; depending if **Always Use HTTPS** is enabled. Note that when using value &#x60;none&#x60;, the secure attribute cannot be set to &#x60;never&#x60;.
   */
  @JsonAdapter(SamesiteEnum.Adapter.class)
  public enum SamesiteEnum {
    AUTO("auto"),
    LAX("lax"),
    NONE("none"),
    STRICT("strict");

    private String value;

    SamesiteEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SamesiteEnum fromValue(String input) {
      for (SamesiteEnum b : SamesiteEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SamesiteEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SamesiteEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SamesiteEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SamesiteEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("samesite")
  private SamesiteEnum samesite = SamesiteEnum.AUTO;

  /**
   * Configures the Secure attribute on the waiting room cookie. Value &#x60;always&#x60; indicates that the Secure attribute will be set in the Set-Cookie header, &#x60;never&#x60; indicates that the Secure attribute will not be set, and &#x60;auto&#x60; will set the Secure attribute depending if **Always Use HTTPS** is enabled.
   */
  @JsonAdapter(SecureEnum.Adapter.class)
  public enum SecureEnum {
    AUTO("auto"),
    ALWAYS("always"),
    NEVER("never");

    private String value;

    SecureEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static SecureEnum fromValue(String input) {
      for (SecureEnum b : SecureEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<SecureEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SecureEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public SecureEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return SecureEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("secure")
  private SecureEnum secure = SecureEnum.AUTO;

  public CookieAttributes samesite(SamesiteEnum samesite) {
    this.samesite = samesite;
    return this;
  }

   /**
   * Configures the SameSite attribute on the waiting room cookie. Value &#x60;auto&#x60; will be translated to &#x60;lax&#x60; or &#x60;none&#x60; depending if **Always Use HTTPS** is enabled. Note that when using value &#x60;none&#x60;, the secure attribute cannot be set to &#x60;never&#x60;.
   * @return samesite
  **/
  @Schema(example = "auto", description = "Configures the SameSite attribute on the waiting room cookie. Value `auto` will be translated to `lax` or `none` depending if **Always Use HTTPS** is enabled. Note that when using value `none`, the secure attribute cannot be set to `never`.")
  public SamesiteEnum getSamesite() {
    return samesite;
  }

  public void setSamesite(SamesiteEnum samesite) {
    this.samesite = samesite;
  }

  public CookieAttributes secure(SecureEnum secure) {
    this.secure = secure;
    return this;
  }

   /**
   * Configures the Secure attribute on the waiting room cookie. Value &#x60;always&#x60; indicates that the Secure attribute will be set in the Set-Cookie header, &#x60;never&#x60; indicates that the Secure attribute will not be set, and &#x60;auto&#x60; will set the Secure attribute depending if **Always Use HTTPS** is enabled.
   * @return secure
  **/
  @Schema(example = "auto", description = "Configures the Secure attribute on the waiting room cookie. Value `always` indicates that the Secure attribute will be set in the Set-Cookie header, `never` indicates that the Secure attribute will not be set, and `auto` will set the Secure attribute depending if **Always Use HTTPS** is enabled.")
  public SecureEnum getSecure() {
    return secure;
  }

  public void setSecure(SecureEnum secure) {
    this.secure = secure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CookieAttributes cookieAttributes = (CookieAttributes) o;
    return Objects.equals(this.samesite, cookieAttributes.samesite) &&
        Objects.equals(this.secure, cookieAttributes.secure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(samesite, secure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CookieAttributes {\n");
    
    sb.append("    samesite: ").append(toIndentedString(samesite)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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