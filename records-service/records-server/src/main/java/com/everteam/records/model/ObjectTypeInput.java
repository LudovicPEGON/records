package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ObjectTypeInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ObjectTypeInput   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  /**
   * Get the type's base type, if the type is a derived (non-base) type.
   */
  public enum BaseTypeEnum {
    DOCUMENT("DOCUMENT"),
    
    FOLDER("FOLDER"),
    
    POLICY("POLICY"),
    
    RELATIONSHIP("RELATIONSHIP"),
    
    ITEM("ITEM");

    private String value;

    BaseTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BaseTypeEnum fromValue(String text) {
      for (BaseTypeEnum b : BaseTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("baseType")
  private BaseTypeEnum baseType = null;

  public ObjectTypeInput name(String name) {
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

  public ObjectTypeInput description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of the Retention Rule
   * @return description
  **/
  @ApiModelProperty(value = "Short description of the Retention Rule")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ObjectTypeInput baseType(BaseTypeEnum baseType) {
    this.baseType = baseType;
    return this;
  }

   /**
   * Get the type's base type, if the type is a derived (non-base) type.
   * @return baseType
  **/
  @ApiModelProperty(value = "Get the type's base type, if the type is a derived (non-base) type.")
  public BaseTypeEnum getBaseType() {
    return baseType;
  }

  public void setBaseType(BaseTypeEnum baseType) {
    this.baseType = baseType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectTypeInput objectTypeInput = (ObjectTypeInput) o;
    return Objects.equals(this.name, objectTypeInput.name) &&
        Objects.equals(this.description, objectTypeInput.description) &&
        Objects.equals(this.baseType, objectTypeInput.baseType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, baseType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectTypeInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
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

