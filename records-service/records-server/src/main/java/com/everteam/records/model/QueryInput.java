package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.QueryCommon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QueryInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class QueryInput extends QueryCommon  {
  @JsonProperty("connectionId")
  private String connectionId = null;

  public QueryInput connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * Get connectionId
   * @return connectionId
  **/
  @ApiModelProperty(value = "")
  public String getConnectionId() {
    return connectionId;
  }

  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryInput queryInput = (QueryInput) o;
    return Objects.equals(this.connectionId, queryInput.connectionId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
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

