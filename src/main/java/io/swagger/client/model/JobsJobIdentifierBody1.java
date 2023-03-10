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
import io.swagger.client.model.Frequency;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * JobsJobIdentifierBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class JobsJobIdentifierBody1 {
  @SerializedName("destination_conf")
  private String destinationConf = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("frequency")
  private Frequency frequency = null;

  @SerializedName("logpull_options")
  private String logpullOptions = null;

  @SerializedName("ownership_challenge")
  private String ownershipChallenge = null;

  public JobsJobIdentifierBody1 destinationConf(String destinationConf) {
    this.destinationConf = destinationConf;
    return this;
  }

   /**
   * Get destinationConf
   * @return destinationConf
  **/
  @Schema(description = "")
  public String getDestinationConf() {
    return destinationConf;
  }

  public void setDestinationConf(String destinationConf) {
    this.destinationConf = destinationConf;
  }

  public JobsJobIdentifierBody1 enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @Schema(description = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public JobsJobIdentifierBody1 frequency(Frequency frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Get frequency
   * @return frequency
  **/
  @Schema(description = "")
  public Frequency getFrequency() {
    return frequency;
  }

  public void setFrequency(Frequency frequency) {
    this.frequency = frequency;
  }

  public JobsJobIdentifierBody1 logpullOptions(String logpullOptions) {
    this.logpullOptions = logpullOptions;
    return this;
  }

   /**
   * Get logpullOptions
   * @return logpullOptions
  **/
  @Schema(description = "")
  public String getLogpullOptions() {
    return logpullOptions;
  }

  public void setLogpullOptions(String logpullOptions) {
    this.logpullOptions = logpullOptions;
  }

  public JobsJobIdentifierBody1 ownershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
    return this;
  }

   /**
   * Get ownershipChallenge
   * @return ownershipChallenge
  **/
  @Schema(description = "")
  public String getOwnershipChallenge() {
    return ownershipChallenge;
  }

  public void setOwnershipChallenge(String ownershipChallenge) {
    this.ownershipChallenge = ownershipChallenge;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobsJobIdentifierBody1 jobsJobIdentifierBody1 = (JobsJobIdentifierBody1) o;
    return Objects.equals(this.destinationConf, jobsJobIdentifierBody1.destinationConf) &&
        Objects.equals(this.enabled, jobsJobIdentifierBody1.enabled) &&
        Objects.equals(this.frequency, jobsJobIdentifierBody1.frequency) &&
        Objects.equals(this.logpullOptions, jobsJobIdentifierBody1.logpullOptions) &&
        Objects.equals(this.ownershipChallenge, jobsJobIdentifierBody1.ownershipChallenge);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationConf, enabled, frequency, logpullOptions, ownershipChallenge);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobsJobIdentifierBody1 {\n");
    
    sb.append("    destinationConf: ").append(toIndentedString(destinationConf)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    logpullOptions: ").append(toIndentedString(logpullOptions)).append("\n");
    sb.append("    ownershipChallenge: ").append(toIndentedString(ownershipChallenge)).append("\n");
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
