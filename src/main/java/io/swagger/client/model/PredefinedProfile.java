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
import io.swagger.client.model.PredefinedEntry;
import io.swagger.client.model.ProfileId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/**
 * PredefinedProfile
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class PredefinedProfile implements Profiles {
  @SerializedName("allowed_match_count")
  private BigDecimal allowedMatchCount = null;

  @SerializedName("entries")
  private List<PredefinedEntry> entries = null;

  @SerializedName("id")
  private ProfileId id = null;

  @SerializedName("name")
  private String name = null;

  /**
   * The type of the profile.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PREDEFINED("predefined");

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

  public PredefinedProfile allowedMatchCount(BigDecimal allowedMatchCount) {
    this.allowedMatchCount = allowedMatchCount;
    return this;
  }

   /**
   * Get allowedMatchCount
   * @return allowedMatchCount
  **/
  @Schema(description = "")
  public BigDecimal getAllowedMatchCount() {
    return allowedMatchCount;
  }

  public void setAllowedMatchCount(BigDecimal allowedMatchCount) {
    this.allowedMatchCount = allowedMatchCount;
  }

  public PredefinedProfile entries(List<PredefinedEntry> entries) {
    this.entries = entries;
    return this;
  }

  public PredefinedProfile addEntriesItem(PredefinedEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<PredefinedEntry>();
    }
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * The entries for this profile.
   * @return entries
  **/
  @Schema(description = "The entries for this profile.")
  public List<PredefinedEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<PredefinedEntry> entries) {
    this.entries = entries;
  }

  public PredefinedProfile id(ProfileId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public ProfileId getId() {
    return id;
  }

  public void setId(ProfileId id) {
    this.id = id;
  }

  public PredefinedProfile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the profile.
   * @return name
  **/
  @Schema(example = "Generic CVV Card Number", description = "The name of the profile.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PredefinedProfile type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the profile.
   * @return type
  **/
  @Schema(example = "predefined", description = "The type of the profile.")
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
    PredefinedProfile predefinedProfile = (PredefinedProfile) o;
    return Objects.equals(this.allowedMatchCount, predefinedProfile.allowedMatchCount) &&
        Objects.equals(this.entries, predefinedProfile.entries) &&
        Objects.equals(this.id, predefinedProfile.id) &&
        Objects.equals(this.name, predefinedProfile.name) &&
        Objects.equals(this.type, predefinedProfile.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedMatchCount, entries, id, name, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredefinedProfile {\n");
    
    sb.append("    allowedMatchCount: ").append(toIndentedString(allowedMatchCount)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
