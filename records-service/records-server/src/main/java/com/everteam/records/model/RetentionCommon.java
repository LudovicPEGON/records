package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RetentionCommon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class RetentionCommon   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("period")
  private Long period = null;

  @JsonProperty("details")
  private String details = null;

  @JsonProperty("destruction")
  private Boolean destruction = null;

  public RetentionCommon name(String name) {
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

  public RetentionCommon description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RetentionCommon period(Long period) {
    this.period = period;
    return this;
  }

   /**
   * retention period in years
   * @return period
  **/
  @ApiModelProperty(value = "retention period in years")
  public Long getPeriod() {
    return period;
  }

  public void setPeriod(Long period) {
    this.period = period;
  }

  public RetentionCommon details(String details) {
    this.details = details;
    return this;
  }

   /**
   * regulation details
   * @return details
  **/
  @ApiModelProperty(value = "regulation details")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public RetentionCommon destruction(Boolean destruction) {
    this.destruction = destruction;
    return this;
  }

   /**
   * destruction options | true = automatic destruction at the end of the retention period. | false = asking for approval
   * @return destruction
  **/
  @ApiModelProperty(value = "destruction options | true = automatic destruction at the end of the retention period. | false = asking for approval")
  public Boolean getDestruction() {
    return destruction;
  }

  public void setDestruction(Boolean destruction) {
    this.destruction = destruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionCommon retentionCommon = (RetentionCommon) o;
    return Objects.equals(this.name, retentionCommon.name) &&
        Objects.equals(this.description, retentionCommon.description) &&
        Objects.equals(this.period, retentionCommon.period) &&
        Objects.equals(this.details, retentionCommon.details) &&
        Objects.equals(this.destruction, retentionCommon.destruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, period, details, destruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    destruction: ").append(toIndentedString(destruction)).append("\n");
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

