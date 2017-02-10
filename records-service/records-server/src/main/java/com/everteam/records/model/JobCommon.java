package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobCommon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class JobCommon   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("active")
  private Boolean active = true;

  @JsonProperty("frequency")
  private Integer frequency = null;

  /**
   * Frequency and period tell us when to schedule the job
   */
  public enum PeriodEnum {
    MINUTES("minutes"),
    
    HOURS("hours"),
    
    DAYS("days"),
    
    WEEKS("weeks"),
    
    MONTHS("months"),
    
    YEARS("years");

    private String value;

    PeriodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PeriodEnum fromValue(String text) {
      for (PeriodEnum b : PeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("period")
  private PeriodEnum period = null;

  @JsonProperty("moveFiles")
  private Boolean moveFiles = false;

  public JobCommon name(String name) {
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

  public JobCommon active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Tell if this Job is active
   * @return active
  **/
  @ApiModelProperty(value = "Tell if this Job is active")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public JobCommon frequency(Integer frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * Frequency and period tell us when to schedule the job
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "Frequency and period tell us when to schedule the job")
  public Integer getFrequency() {
    return frequency;
  }

  public void setFrequency(Integer frequency) {
    this.frequency = frequency;
  }

  public JobCommon period(PeriodEnum period) {
    this.period = period;
    return this;
  }

   /**
   * Frequency and period tell us when to schedule the job
   * @return period
  **/
  @ApiModelProperty(required = true, value = "Frequency and period tell us when to schedule the job")
  public PeriodEnum getPeriod() {
    return period;
  }

  public void setPeriod(PeriodEnum period) {
    this.period = period;
  }

  public JobCommon moveFiles(Boolean moveFiles) {
    this.moveFiles = moveFiles;
    return this;
  }

   /**
   * Tell if we have to import also the files
   * @return moveFiles
  **/
  @ApiModelProperty(value = "Tell if we have to import also the files")
  public Boolean getMoveFiles() {
    return moveFiles;
  }

  public void setMoveFiles(Boolean moveFiles) {
    this.moveFiles = moveFiles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobCommon jobCommon = (JobCommon) o;
    return Objects.equals(this.name, jobCommon.name) &&
        Objects.equals(this.active, jobCommon.active) &&
        Objects.equals(this.frequency, jobCommon.frequency) &&
        Objects.equals(this.period, jobCommon.period) &&
        Objects.equals(this.moveFiles, jobCommon.moveFiles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, active, frequency, period, moveFiles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    moveFiles: ").append(toIndentedString(moveFiles)).append("\n");
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

