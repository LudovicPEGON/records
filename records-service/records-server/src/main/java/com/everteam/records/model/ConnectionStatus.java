package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * ConnectionStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ConnectionStatus   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("latestPing")
  private OffsetDateTime latestPing = null;

  /**
   * Connection status
   */
  public enum StatusEnum {
    ONLINE("ONLINE"),
    
    OFFLINE("OFFLINE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public ConnectionStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ConnectionStatus latestPing(OffsetDateTime latestPing) {
    this.latestPing = latestPing;
    return this;
  }

   /**
   * Get latestPing
   * @return latestPing
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getLatestPing() {
    return latestPing;
  }

  public void setLatestPing(OffsetDateTime latestPing) {
    this.latestPing = latestPing;
  }

  public ConnectionStatus status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Connection status
   * @return status
  **/
  @ApiModelProperty(value = "Connection status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStatus connectionStatus = (ConnectionStatus) o;
    return Objects.equals(this.id, connectionStatus.id) &&
        Objects.equals(this.latestPing, connectionStatus.latestPing) &&
        Objects.equals(this.status, connectionStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, latestPing, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    latestPing: ").append(toIndentedString(latestPing)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

