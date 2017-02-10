package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.HoldInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Hold
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Hold extends HoldInput  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("documentsCount")
  private Integer documentsCount = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  /**
   * Status of this hold
   */
  public enum StatusEnum {
    COMPLETED("COMPLETED"),
    
    INPROGRESS("INPROGRESS");

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

  public Hold id(String id) {
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

  public Hold documentsCount(Integer documentsCount) {
    this.documentsCount = documentsCount;
    return this;
  }

   /**
   * Get documentsCount
   * @return documentsCount
  **/
  @ApiModelProperty(value = "")
  public Integer getDocumentsCount() {
    return documentsCount;
  }

  public void setDocumentsCount(Integer documentsCount) {
    this.documentsCount = documentsCount;
  }

  public Hold createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Hold status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of this hold
   * @return status
  **/
  @ApiModelProperty(value = "Status of this hold")
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
    Hold hold = (Hold) o;
    return Objects.equals(this.id, hold.id) &&
        Objects.equals(this.documentsCount, hold.documentsCount) &&
        Objects.equals(this.createdBy, hold.createdBy) &&
        Objects.equals(this.status, hold.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentsCount, createdBy, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Hold {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentsCount: ").append(toIndentedString(documentsCount)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

