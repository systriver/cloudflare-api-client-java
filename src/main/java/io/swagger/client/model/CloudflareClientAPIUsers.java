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
import io.swagger.client.model.SeatUid;
import io.swagger.client.model.Uid;
import io.swagger.client.model.UsersComponentsSchemasId;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import org.threeten.bp.OffsetDateTime;
/**
 * CloudflareClientAPIUsers
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-02-22T14:44:19.166727222+09:00[Asia/Tokyo]")
public class CloudflareClientAPIUsers {
  @SerializedName("access_seat")
  private Boolean accessSeat = null;

  @SerializedName("active_device_count")
  private BigDecimal activeDeviceCount = null;

  @SerializedName("created_at")
  private OffsetDateTime createdAt = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("gateway_seat")
  private Boolean gatewaySeat = null;

  @SerializedName("id")
  private UsersComponentsSchemasId id = null;

  @SerializedName("last_successful_login")
  private OffsetDateTime lastSuccessfulLogin = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("seat_uid")
  private SeatUid seatUid = null;

  @SerializedName("uid")
  private Uid uid = null;

  @SerializedName("updated_at")
  private OffsetDateTime updatedAt = null;

  public CloudflareClientAPIUsers accessSeat(Boolean accessSeat) {
    this.accessSeat = accessSeat;
    return this;
  }

   /**
   * Get accessSeat
   * @return accessSeat
  **/
  @Schema(description = "")
  public Boolean getAccessSeat() {
    return accessSeat;
  }

  public void setAccessSeat(Boolean accessSeat) {
    this.accessSeat = accessSeat;
  }

  public CloudflareClientAPIUsers activeDeviceCount(BigDecimal activeDeviceCount) {
    this.activeDeviceCount = activeDeviceCount;
    return this;
  }

   /**
   * Get activeDeviceCount
   * @return activeDeviceCount
  **/
  @Schema(description = "")
  public BigDecimal getActiveDeviceCount() {
    return activeDeviceCount;
  }

  public void setActiveDeviceCount(BigDecimal activeDeviceCount) {
    this.activeDeviceCount = activeDeviceCount;
  }

  public CloudflareClientAPIUsers createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public CloudflareClientAPIUsers email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CloudflareClientAPIUsers gatewaySeat(Boolean gatewaySeat) {
    this.gatewaySeat = gatewaySeat;
    return this;
  }

   /**
   * Get gatewaySeat
   * @return gatewaySeat
  **/
  @Schema(description = "")
  public Boolean getGatewaySeat() {
    return gatewaySeat;
  }

  public void setGatewaySeat(Boolean gatewaySeat) {
    this.gatewaySeat = gatewaySeat;
  }

  public CloudflareClientAPIUsers id(UsersComponentsSchemasId id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UsersComponentsSchemasId getId() {
    return id;
  }

  public void setId(UsersComponentsSchemasId id) {
    this.id = id;
  }

  public CloudflareClientAPIUsers lastSuccessfulLogin(OffsetDateTime lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
    return this;
  }

   /**
   * Get lastSuccessfulLogin
   * @return lastSuccessfulLogin
  **/
  @Schema(description = "")
  public OffsetDateTime getLastSuccessfulLogin() {
    return lastSuccessfulLogin;
  }

  public void setLastSuccessfulLogin(OffsetDateTime lastSuccessfulLogin) {
    this.lastSuccessfulLogin = lastSuccessfulLogin;
  }

  public CloudflareClientAPIUsers name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudflareClientAPIUsers seatUid(SeatUid seatUid) {
    this.seatUid = seatUid;
    return this;
  }

   /**
   * Get seatUid
   * @return seatUid
  **/
  @Schema(description = "")
  public SeatUid getSeatUid() {
    return seatUid;
  }

  public void setSeatUid(SeatUid seatUid) {
    this.seatUid = seatUid;
  }

  public CloudflareClientAPIUsers uid(Uid uid) {
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @Schema(description = "")
  public Uid getUid() {
    return uid;
  }

  public void setUid(Uid uid) {
    this.uid = uid;
  }

  public CloudflareClientAPIUsers updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudflareClientAPIUsers cloudflareClientAPIUsers = (CloudflareClientAPIUsers) o;
    return Objects.equals(this.accessSeat, cloudflareClientAPIUsers.accessSeat) &&
        Objects.equals(this.activeDeviceCount, cloudflareClientAPIUsers.activeDeviceCount) &&
        Objects.equals(this.createdAt, cloudflareClientAPIUsers.createdAt) &&
        Objects.equals(this.email, cloudflareClientAPIUsers.email) &&
        Objects.equals(this.gatewaySeat, cloudflareClientAPIUsers.gatewaySeat) &&
        Objects.equals(this.id, cloudflareClientAPIUsers.id) &&
        Objects.equals(this.lastSuccessfulLogin, cloudflareClientAPIUsers.lastSuccessfulLogin) &&
        Objects.equals(this.name, cloudflareClientAPIUsers.name) &&
        Objects.equals(this.seatUid, cloudflareClientAPIUsers.seatUid) &&
        Objects.equals(this.uid, cloudflareClientAPIUsers.uid) &&
        Objects.equals(this.updatedAt, cloudflareClientAPIUsers.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessSeat, activeDeviceCount, createdAt, email, gatewaySeat, id, lastSuccessfulLogin, name, seatUid, uid, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudflareClientAPIUsers {\n");
    
    sb.append("    accessSeat: ").append(toIndentedString(accessSeat)).append("\n");
    sb.append("    activeDeviceCount: ").append(toIndentedString(activeDeviceCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    gatewaySeat: ").append(toIndentedString(gatewaySeat)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastSuccessfulLogin: ").append(toIndentedString(lastSuccessfulLogin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seatUid: ").append(toIndentedString(seatUid)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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