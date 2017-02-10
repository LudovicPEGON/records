package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * JobStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class JobStatus   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("start")
  private OffsetDateTime start = null;

  @JsonProperty("end")
  private OffsetDateTime end = null;

  @JsonProperty("duration")
  private String duration = null;

  @JsonProperty("next")
  private OffsetDateTime next = null;

  @JsonProperty("errors")
  private List<String> errors = new ArrayList<String>();

  public JobStatus id(String id) {
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

  public JobStatus start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public JobStatus end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public JobStatus duration(String duration) {
    this.duration = duration;
    return this;
  }

   /**
   * Human readable localized message for the duration
   * @return duration
  **/
  @ApiModelProperty(value = "Human readable localized message for the duration")
  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }

  public JobStatus next(OffsetDateTime next) {
    this.next = next;
    return this;
  }

   /**
   * Get next
   * @return next
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getNext() {
    return next;
  }

  public void setNext(OffsetDateTime next) {
    this.next = next;
  }

  public JobStatus errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public JobStatus addErrorsItem(String errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobStatus jobStatus = (JobStatus) o;
    return Objects.equals(this.id, jobStatus.id) &&
        Objects.equals(this.start, jobStatus.start) &&
        Objects.equals(this.end, jobStatus.end) &&
        Objects.equals(this.duration, jobStatus.duration) &&
        Objects.equals(this.next, jobStatus.next) &&
        Objects.equals(this.errors, jobStatus.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, start, end, duration, next, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

