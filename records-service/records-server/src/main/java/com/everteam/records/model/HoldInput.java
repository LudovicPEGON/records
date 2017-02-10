package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * HoldInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class HoldInput   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("reason")
  private String reason = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  public HoldInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public HoldInput reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason of this hold
   * @return reason
  **/
  @ApiModelProperty(value = "Reason of this hold")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public HoldInput start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Start date for this hold
   * @return start
  **/
  @ApiModelProperty(value = "Start date for this hold")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public HoldInput end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * End date for this hold
   * @return end
  **/
  @ApiModelProperty(value = "End date for this hold")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldInput holdInput = (HoldInput) o;
    return Objects.equals(this.name, holdInput.name) &&
        Objects.equals(this.reason, holdInput.reason) &&
        Objects.equals(this.start, holdInput.start) &&
        Objects.equals(this.end, holdInput.end);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, reason, start, end);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

