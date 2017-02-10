package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PropertyDefinition
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class PropertyDefinition   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("label")
  private String label = null;

  /**
   * type of the metadata. Has to be defined with Cmis specs
   */
  public enum TypeEnum {
    BOOLEAN("BOOLEAN"),
    
    DATETIME("DATETIME"),
    
    DECIMAL("DECIMAL"),
    
    INTEGER("INTEGER"),
    
    STRING("STRING"),
    
    URI("URI");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("default")
  private Object _default = null;

  @JsonProperty("properties")
  private List<Property> properties = new ArrayList<Property>();

  public PropertyDefinition name(String name) {
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

  public PropertyDefinition label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public PropertyDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * type of the metadata. Has to be defined with Cmis specs
   * @return type
  **/
  @ApiModelProperty(value = "type of the metadata. Has to be defined with Cmis specs")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PropertyDefinition size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PropertyDefinition _default(Object _default) {
    this._default = _default;
    return this;
  }

   /**
   * Default value
   * @return _default
  **/
  @ApiModelProperty(value = "Default value")
  public Object getDefault() {
    return _default;
  }

  public void setDefault(Object _default) {
    this._default = _default;
  }

  public PropertyDefinition properties(List<Property> properties) {
    this.properties = properties;
    return this;
  }

  public PropertyDefinition addPropertiesItem(Property propertiesItem) {
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
    PropertyDefinition propertyDefinition = (PropertyDefinition) o;
    return Objects.equals(this.name, propertyDefinition.name) &&
        Objects.equals(this.label, propertyDefinition.label) &&
        Objects.equals(this.type, propertyDefinition.type) &&
        Objects.equals(this.size, propertyDefinition.size) &&
        Objects.equals(this._default, propertyDefinition._default) &&
        Objects.equals(this.properties, propertyDefinition.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, label, type, size, _default, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyDefinition {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

