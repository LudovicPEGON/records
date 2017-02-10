package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ObjectLink;
import com.everteam.records.model.Property;
import com.everteam.records.model.QueryCommon;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Query
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Query extends QueryCommon  {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("created")
  private OffsetDateTime created = null;

  @JsonProperty("connection")
  private ObjectLink connection = null;

  @JsonProperty("createdBy")
  private ObjectLink createdBy = null;

  @JsonProperty("documentType")
  private ObjectLink documentType = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  public Query id(String id) {
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

  public Query created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public Query connection(ObjectLink connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getConnection() {
    return connection;
  }

  public void setConnection(ObjectLink connection) {
    this.connection = connection;
  }

  public Query createdBy(ObjectLink createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(ObjectLink createdBy) {
    this.createdBy = createdBy;
  }

  public Query documentType(ObjectLink documentType) {
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

  public Query properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public Query addPropertiesItem(Property propertiesItem) {
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @ApiModelProperty(value = "")
  public List<Property> getProperties() {
    return properties;
  }

  public void setProperties(List<Property> properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.id, query.id) &&
        Objects.equals(this.created, query.created) &&
        Objects.equals(this.connection, query.connection) &&
        Objects.equals(this.createdBy, query.createdBy) &&
        Objects.equals(this.documentType, query.documentType) &&
        Objects.equals(this.properties, query.properties) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, connection, createdBy, documentType, properties, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

