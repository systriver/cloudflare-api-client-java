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
 * AuditlogsActor
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class AuditlogsActor {
  @SerializedName("email")
  private String email = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ip")
  private String ip = null;

  /**
   * The type of actor, whether a User, Cloudflare Admin, or an Automated System.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    USER("user"),
    ADMIN("admin"),
    CLOUDFLARE("Cloudflare");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String input) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  public AuditlogsActor email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email of the user that performed the action.
   * @return email
  **/
  @Schema(example = "michelle@example.com", description = "The email of the user that performed the action.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public AuditlogsActor id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the actor that performed the action. If a user performed the action, this will be their User ID.
   * @return id
  **/
  @Schema(example = "f6b5de0326bb5182b8a4840ee01ec774", description = "The ID of the actor that performed the action. If a user performed the action, this will be their User ID.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AuditlogsActor ip(String ip) {
    this.ip = ip;
    return this;
  }

   /**
   * The IP address of the request that performed the action.
   * @return ip
  **/
  @Schema(example = "198.41.129.166", description = "The IP address of the request that performed the action.")
  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }

  public AuditlogsActor type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of actor, whether a User, Cloudflare Admin, or an Automated System.
   * @return type
  **/
  @Schema(example = "user", description = "The type of actor, whether a User, Cloudflare Admin, or an Automated System.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
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
    AuditlogsActor auditlogsActor = (AuditlogsActor) o;
    return Objects.equals(this.email, auditlogsActor.email) &&
        Objects.equals(this.id, auditlogsActor.id) &&
        Objects.equals(this.ip, auditlogsActor.ip) &&
        Objects.equals(this.type, auditlogsActor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, ip, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditlogsActor {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
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
