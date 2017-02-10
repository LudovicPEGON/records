package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.PropertyResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResultsHeader
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class SearchResultsHeader   {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("time")
  private Integer time = null;

  @JsonProperty("numFound")
  private Long numFound = null;

  @JsonProperty("start")
  private Long start = null;

  @JsonProperty("sort")
  private String sort = null;

  @JsonProperty("fields")
  private List<PropertyResult> fields = new ArrayList<PropertyResult>();

  public SearchResultsHeader status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public SearchResultsHeader time(Integer time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(value = "")
  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public SearchResultsHeader numFound(Long numFound) {
    this.numFound = numFound;
    return this;
  }

   /**
   * Get numFound
   * @return numFound
  **/
  @ApiModelProperty(value = "")
  public Long getNumFound() {
    return numFound;
  }

  public void setNumFound(Long numFound) {
    this.numFound = numFound;
  }

  public SearchResultsHeader start(Long start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public SearchResultsHeader sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * Get sort
   * @return sort
  **/
  @ApiModelProperty(value = "")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public SearchResultsHeader fields(List<PropertyResult> fields) {
    this.fields = fields;
    return this;
  }

  public SearchResultsHeader addFieldsItem(PropertyResult fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(value = "")
  public List<PropertyResult> getFields() {
    return fields;
  }

  public void setFields(List<PropertyResult> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsHeader searchResultsHeader = (SearchResultsHeader) o;
    return Objects.equals(this.status, searchResultsHeader.status) &&
        Objects.equals(this.time, searchResultsHeader.time) &&
        Objects.equals(this.numFound, searchResultsHeader.numFound) &&
        Objects.equals(this.start, searchResultsHeader.start) &&
        Objects.equals(this.sort, searchResultsHeader.sort) &&
        Objects.equals(this.fields, searchResultsHeader.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, time, numFound, start, sort, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsHeader {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    numFound: ").append(toIndentedString(numFound)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

