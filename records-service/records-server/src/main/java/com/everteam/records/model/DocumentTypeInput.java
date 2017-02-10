package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.DocumentTypeBaseInput;
import com.everteam.records.model.PropertyDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * DocumentTypeInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class DocumentTypeInput extends DocumentTypeBaseInput  {
  @JsonProperty("propertyDefinitions")
  private List<PropertyDefinition> propertyDefinitions = new ArrayList<PropertyDefinition>();

  public DocumentTypeInput propertyDefinitions(List<PropertyDefinition> propertyDefinitions) {
    this.propertyDefinitions = propertyDefinitions;
    return this;
  }

  public DocumentTypeInput addPropertyDefinitionsItem(PropertyDefinition propertyDefinitionsItem) {
    this.propertyDefinitions.add(propertyDefinitionsItem);
    return this;
  }

   /**
   * all types properties definitions (like for example, retention...)
   * @return propertyDefinitions
  **/
  @ApiModelProperty(value = "all types properties definitions (like for example, retention...)")
  public List<PropertyDefinition> getPropertyDefinitions() {
    return propertyDefinitions;
  }

  public void setPropertyDefinitions(List<PropertyDefinition> propertyDefinitions) {
    this.propertyDefinitions = propertyDefinitions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentTypeInput documentTypeInput = (DocumentTypeInput) o;
    return Objects.equals(this.propertyDefinitions, documentTypeInput.propertyDefinitions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyDefinitions, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypeInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    propertyDefinitions: ").append(toIndentedString(propertyDefinitions)).append("\n");
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

