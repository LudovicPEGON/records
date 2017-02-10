package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ObjectTypeInput;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocumentTypeBaseInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class DocumentTypeBaseInput extends ObjectTypeInput  {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("departmentId")
  private String departmentId = null;

  @JsonProperty("retentionId")
  private String retentionId = null;

  @JsonProperty("iconId")
  private String iconId = null;

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

  public DocumentTypeBaseInput code(String code) {
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

  public DocumentTypeBaseInput departmentId(String departmentId) {
    this.departmentId = departmentId;
    return this;
  }

   /**
   * Get departmentId
   * @return departmentId
  **/
  @ApiModelProperty(value = "")
  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public DocumentTypeBaseInput retentionId(String retentionId) {
    this.retentionId = retentionId;
    return this;
  }

   /**
   * Get retentionId
   * @return retentionId
  **/
  @ApiModelProperty(value = "")
  public String getRetentionId() {
    return retentionId;
  }

  public void setRetentionId(String retentionId) {
    this.retentionId = retentionId;
  }

  public DocumentTypeBaseInput iconId(String iconId) {
    this.iconId = iconId;
    return this;
  }

   /**
   * Get iconId
   * @return iconId
  **/
  @ApiModelProperty(value = "")
  public String getIconId() {
    return iconId;
  }

  public void setIconId(String iconId) {
    this.iconId = iconId;
  }

  public DocumentTypeBaseInput source(SourceEnum source) {
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
    DocumentTypeBaseInput documentTypeBaseInput = (DocumentTypeBaseInput) o;
    return Objects.equals(this.code, documentTypeBaseInput.code) &&
        Objects.equals(this.departmentId, documentTypeBaseInput.departmentId) &&
        Objects.equals(this.retentionId, documentTypeBaseInput.retentionId) &&
        Objects.equals(this.iconId, documentTypeBaseInput.iconId) &&
        Objects.equals(this.source, documentTypeBaseInput.source) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, departmentId, retentionId, iconId, source, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentTypeBaseInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    departmentId: ").append(toIndentedString(departmentId)).append("\n");
    sb.append("    retentionId: ").append(toIndentedString(retentionId)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
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

