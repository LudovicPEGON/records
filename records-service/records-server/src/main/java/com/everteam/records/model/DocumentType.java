package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ObjectLink;
import com.everteam.records.model.ObjectType;
import com.everteam.records.model.PropertyDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * DocumentType
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class DocumentType extends ObjectType  {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("department")
  private ObjectLink department = null;

  @JsonProperty("retention")
  private ObjectLink retention = null;

  @JsonProperty("icon")
  private ObjectLink icon = null;

  /**
   * Source from newly created document type
   */
  public enum SourceEnum {
    CMIS("CMIS"),
    
    NONE("NONE");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SourceEnum fromValue(String text) {
      for (SourceEnum b : SourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("source")
  private SourceEnum source = null;

  public DocumentType code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public DocumentType department(ObjectLink department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getDepartment() {
    return department;
  }

  public void setDepartment(ObjectLink department) {
    this.department = department;
  }

  public DocumentType retention(ObjectLink retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getRetention() {
    return retention;
  }

  public void setRetention(ObjectLink retention) {
    this.retention = retention;
  }

  public DocumentType icon(ObjectLink icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getIcon() {
    return icon;
  }

  public void setIcon(ObjectLink icon) {
    this.icon = icon;
  }

  public DocumentType source(SourceEnum source) {
    this.source = source;
    return this;
  }

   /**
   * Source from newly created document type
   * @return source
  **/
  @ApiModelProperty(value = "Source from newly created document type")
  public SourceEnum getSource() {
    return source;
  }

  public void setSource(SourceEnum source) {
    this.source = source;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentType documentType = (DocumentType) o;
    return Objects.equals(this.code, documentType.code) &&
        Objects.equals(this.department, documentType.department) &&
        Objects.equals(this.retention, documentType.retention) &&
        Objects.equals(this.icon, documentType.icon) &&
        Objects.equals(this.source, documentType.source) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, department, retention, icon, source, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

