package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.JobCommon;
import com.everteam.records.model.ObjectLink;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Job
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Job extends JobCommon  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("query")
  private ObjectLink query = null;

  @JsonProperty("documentType")
  private ObjectLink documentType = null;

  public Job id(String id) {
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

  public Job query(ObjectLink query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getQuery() {
    return query;
  }

  public void setQuery(ObjectLink query) {
    this.query = query;
  }

  public Job documentType(ObjectLink documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Get documentType
   * @return documentType
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getDocumentType() {
    return documentType;
  }

  public void setDocumentType(ObjectLink documentType) {
    this.documentType = documentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Job job = (Job) o;
    return Objects.equals(this.id, job.id) &&
        Objects.equals(this.query, job.query) &&
        Objects.equals(this.documentType, job.documentType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, query, documentType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Job {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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

