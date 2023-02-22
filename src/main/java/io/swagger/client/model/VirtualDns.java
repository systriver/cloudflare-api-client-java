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
import io.swagger.client.model.OriginIps;
import io.swagger.client.model.VirtualDnsIps;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * VirtualDns
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class VirtualDns {
  @SerializedName("deprecate_any_requests")
  private Boolean deprecateAnyRequests = null;

  @SerializedName("ecs_fallback")
  private Boolean ecsFallback = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("maximum_cache_ttl")
  private BigDecimal maximumCacheTtl = null;

  @SerializedName("minimum_cache_ttl")
  private BigDecimal minimumCacheTtl = null;

  @SerializedName("modified_on")
  private OffsetDateTime modifiedOn = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("negative_cache_ttl")
  private BigDecimal negativeCacheTtl = null;

  @SerializedName("origin_ips")
  private OriginIps originIps = null;

  @SerializedName("ratelimit")
  private BigDecimal ratelimit = null;

  @SerializedName("virtual_dns_ips")
  private VirtualDnsIps virtualDnsIps = null;

  public VirtualDns deprecateAnyRequests(Boolean deprecateAnyRequests) {
    this.deprecateAnyRequests = deprecateAnyRequests;
    return this;
  }

   /**
   * Get deprecateAnyRequests
   * @return deprecateAnyRequests
  **/
  @Schema(required = true, description = "")
  public Boolean getDeprecateAnyRequests() {
    return deprecateAnyRequests;
  }

  public void setDeprecateAnyRequests(Boolean deprecateAnyRequests) {
    this.deprecateAnyRequests = deprecateAnyRequests;
  }

  public VirtualDns ecsFallback(Boolean ecsFallback) {
    this.ecsFallback = ecsFallback;
    return this;
  }

   /**
   * Get ecsFallback
   * @return ecsFallback
  **/
  @Schema(required = true, description = "")
  public Boolean getEcsFallback() {
    return ecsFallback;
  }

  public void setEcsFallback(Boolean ecsFallback) {
    this.ecsFallback = ecsFallback;
  }

  public VirtualDns id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(required = true, description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VirtualDns maximumCacheTtl(BigDecimal maximumCacheTtl) {
    this.maximumCacheTtl = maximumCacheTtl;
    return this;
  }

   /**
   * Get maximumCacheTtl
   * @return maximumCacheTtl
  **/
  @Schema(required = true, description = "")
  public BigDecimal getMaximumCacheTtl() {
    return maximumCacheTtl;
  }

  public void setMaximumCacheTtl(BigDecimal maximumCacheTtl) {
    this.maximumCacheTtl = maximumCacheTtl;
  }

  public VirtualDns minimumCacheTtl(BigDecimal minimumCacheTtl) {
    this.minimumCacheTtl = minimumCacheTtl;
    return this;
  }

   /**
   * Get minimumCacheTtl
   * @return minimumCacheTtl
  **/
  @Schema(required = true, description = "")
  public BigDecimal getMinimumCacheTtl() {
    return minimumCacheTtl;
  }

  public void setMinimumCacheTtl(BigDecimal minimumCacheTtl) {
    this.minimumCacheTtl = minimumCacheTtl;
  }

  public VirtualDns modifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

   /**
   * Get modifiedOn
   * @return modifiedOn
  **/
  @Schema(required = true, description = "")
  public OffsetDateTime getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(OffsetDateTime modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public VirtualDns name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VirtualDns negativeCacheTtl(BigDecimal negativeCacheTtl) {
    this.negativeCacheTtl = negativeCacheTtl;
    return this;
  }

   /**
   * Get negativeCacheTtl
   * @return negativeCacheTtl
  **/
  @Schema(description = "")
  public BigDecimal getNegativeCacheTtl() {
    return negativeCacheTtl;
  }

  public void setNegativeCacheTtl(BigDecimal negativeCacheTtl) {
    this.negativeCacheTtl = negativeCacheTtl;
  }

  public VirtualDns originIps(OriginIps originIps) {
    this.originIps = originIps;
    return this;
  }

   /**
   * Get originIps
   * @return originIps
  **/
  @Schema(required = true, description = "")
  public OriginIps getOriginIps() {
    return originIps;
  }

  public void setOriginIps(OriginIps originIps) {
    this.originIps = originIps;
  }

  public VirtualDns ratelimit(BigDecimal ratelimit) {
    this.ratelimit = ratelimit;
    return this;
  }

   /**
   * Get ratelimit
   * @return ratelimit
  **/
  @Schema(description = "")
  public BigDecimal getRatelimit() {
    return ratelimit;
  }

  public void setRatelimit(BigDecimal ratelimit) {
    this.ratelimit = ratelimit;
  }

  public VirtualDns virtualDnsIps(VirtualDnsIps virtualDnsIps) {
    this.virtualDnsIps = virtualDnsIps;
    return this;
  }

   /**
   * Get virtualDnsIps
   * @return virtualDnsIps
  **/
  @Schema(required = true, description = "")
  public VirtualDnsIps getVirtualDnsIps() {
    return virtualDnsIps;
  }

  public void setVirtualDnsIps(VirtualDnsIps virtualDnsIps) {
    this.virtualDnsIps = virtualDnsIps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VirtualDns virtualDns = (VirtualDns) o;
    return Objects.equals(this.deprecateAnyRequests, virtualDns.deprecateAnyRequests) &&
        Objects.equals(this.ecsFallback, virtualDns.ecsFallback) &&
        Objects.equals(this.id, virtualDns.id) &&
        Objects.equals(this.maximumCacheTtl, virtualDns.maximumCacheTtl) &&
        Objects.equals(this.minimumCacheTtl, virtualDns.minimumCacheTtl) &&
        Objects.equals(this.modifiedOn, virtualDns.modifiedOn) &&
        Objects.equals(this.name, virtualDns.name) &&
        Objects.equals(this.negativeCacheTtl, virtualDns.negativeCacheTtl) &&
        Objects.equals(this.originIps, virtualDns.originIps) &&
        Objects.equals(this.ratelimit, virtualDns.ratelimit) &&
        Objects.equals(this.virtualDnsIps, virtualDns.virtualDnsIps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deprecateAnyRequests, ecsFallback, id, maximumCacheTtl, minimumCacheTtl, modifiedOn, name, negativeCacheTtl, originIps, ratelimit, virtualDnsIps);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VirtualDns {\n");
    
    sb.append("    deprecateAnyRequests: ").append(toIndentedString(deprecateAnyRequests)).append("\n");
    sb.append("    ecsFallback: ").append(toIndentedString(ecsFallback)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maximumCacheTtl: ").append(toIndentedString(maximumCacheTtl)).append("\n");
    sb.append("    minimumCacheTtl: ").append(toIndentedString(minimumCacheTtl)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    negativeCacheTtl: ").append(toIndentedString(negativeCacheTtl)).append("\n");
    sb.append("    originIps: ").append(toIndentedString(originIps)).append("\n");
    sb.append("    ratelimit: ").append(toIndentedString(ratelimit)).append("\n");
    sb.append("    virtualDnsIps: ").append(toIndentedString(virtualDnsIps)).append("\n");
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
