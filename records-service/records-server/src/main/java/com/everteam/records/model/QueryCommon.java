package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * QueryCommon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class QueryCommon   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("query")
  private String query = null;

  public QueryCommon name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Query name
   * @return name
  **/
  @ApiModelProperty(value = "Query name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public QueryCommon query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query string to run
   * @return query
  **/
  @ApiModelProperty(value = "The query string to run")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryCommon queryCommon = (QueryCommon) o;
    return Objects.equals(this.name, queryCommon.name) &&
        Objects.equals(this.query, queryCommon.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

