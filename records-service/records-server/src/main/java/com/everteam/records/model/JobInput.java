package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.JobCommon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * JobInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class JobInput extends JobCommon  {
  @JsonProperty("queryId")
  private String queryId = null;

  @JsonProperty("documentTypeId")
  private String documentTypeId = null;

  public JobInput queryId(String queryId) {
    this.queryId = queryId;
    return this;
  }

   /**
   * Get queryId
   * @return queryId
  **/
  @ApiModelProperty(value = "")
  public String getQueryId() {
    return queryId;
  }

  public void setQueryId(String queryId) {
    this.queryId = queryId;
  }

  public JobInput documentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
    return this;
  }

   /**
   * Get documentTypeId
   * @return documentTypeId
  **/
  @ApiModelProperty(value = "")
  public String getDocumentTypeId() {
    return documentTypeId;
  }

  public void setDocumentTypeId(String documentTypeId) {
    this.documentTypeId = documentTypeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobInput jobInput = (JobInput) o;
    return Objects.equals(this.queryId, jobInput.queryId) &&
        Objects.equals(this.documentTypeId, jobInput.documentTypeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryId, documentTypeId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
    sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
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

