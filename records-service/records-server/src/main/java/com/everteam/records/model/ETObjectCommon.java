package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * ETObjectCommon
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ETObjectCommon   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("modificationDate")
  private OffsetDateTime modificationDate = null;

  @JsonProperty("modifiedBy")
  private String modifiedBy = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  public ETObjectCommon name(String name) {
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

  public ETObjectCommon description(String description) {
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

  public ETObjectCommon creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * Get creationDate
   * @return creationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ETObjectCommon createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ETObjectCommon modificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
    return this;
  }

   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(OffsetDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public ETObjectCommon modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

   /**
   * Get modifiedBy
   * @return modifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public ETObjectCommon properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public ETObjectCommon addPropertiesItem(Property propertiesItem) {
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
    ETObjectCommon etObjectCommon = (ETObjectCommon) o;
    return Objects.equals(this.name, etObjectCommon.name) &&
        Objects.equals(this.description, etObjectCommon.description) &&
        Objects.equals(this.creationDate, etObjectCommon.creationDate) &&
        Objects.equals(this.createdBy, etObjectCommon.createdBy) &&
        Objects.equals(this.modificationDate, etObjectCommon.modificationDate) &&
        Objects.equals(this.modifiedBy, etObjectCommon.modifiedBy) &&
        Objects.equals(this.properties, etObjectCommon.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, creationDate, createdBy, modificationDate, modifiedBy, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETObjectCommon {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

