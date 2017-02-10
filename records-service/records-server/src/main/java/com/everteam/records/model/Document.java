package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ETObject;
import com.everteam.records.model.FileLink;
import com.everteam.records.model.ObjectLink;
import com.everteam.records.model.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Document
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Document extends ETObject  {
  @JsonProperty("hold")
  private Boolean hold = null;

  /**
   * Delete status of this document
   */
  public enum SysDeleteStatusEnum {
    UNDELETABLE("UNDELETABLE"),
    
    APPROVABLE("APPROVABLE"),
    
    DELETABLE("DELETABLE"),
    
    DELETED("DELETED");

    private String value;

    SysDeleteStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SysDeleteStatusEnum fromValue(String text) {
      for (SysDeleteStatusEnum b : SysDeleteStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sysDeleteStatus")
  private SysDeleteStatusEnum sysDeleteStatus = null;

  @JsonProperty("sysCreationDate")
  private OffsetDateTime sysCreationDate = null;

  @JsonProperty("sysCreatedBy")
  private String sysCreatedBy = null;

  @JsonProperty("sysModificationDate")
  private OffsetDateTime sysModificationDate = null;

  @JsonProperty("sysModifiedBy")
  private String sysModifiedBy = null;

  @JsonProperty("sysDeletionDate")
  private OffsetDateTime sysDeletionDate = null;

  @JsonProperty("files")
  private List<FileLink> files = new ArrayList<FileLink>();

  public Document hold(Boolean hold) {
    this.hold = hold;
    return this;
  }

   /**
   * Tell if this document is hold or not
   * @return hold
  **/
  @ApiModelProperty(value = "Tell if this document is hold or not")
  public Boolean getHold() {
    return hold;
  }

  public void setHold(Boolean hold) {
    this.hold = hold;
  }

  public Document sysDeleteStatus(SysDeleteStatusEnum sysDeleteStatus) {
    this.sysDeleteStatus = sysDeleteStatus;
    return this;
  }

   /**
   * Delete status of this document
   * @return sysDeleteStatus
  **/
  @ApiModelProperty(value = "Delete status of this document")
  public SysDeleteStatusEnum getSysDeleteStatus() {
    return sysDeleteStatus;
  }

  public void setSysDeleteStatus(SysDeleteStatusEnum sysDeleteStatus) {
    this.sysDeleteStatus = sysDeleteStatus;
  }

  public Document sysCreationDate(OffsetDateTime sysCreationDate) {
    this.sysCreationDate = sysCreationDate;
    return this;
  }

   /**
   * Get sysCreationDate
   * @return sysCreationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSysCreationDate() {
    return sysCreationDate;
  }

  public void setSysCreationDate(OffsetDateTime sysCreationDate) {
    this.sysCreationDate = sysCreationDate;
  }

  public Document sysCreatedBy(String sysCreatedBy) {
    this.sysCreatedBy = sysCreatedBy;
    return this;
  }

   /**
   * Get sysCreatedBy
   * @return sysCreatedBy
  **/
  @ApiModelProperty(value = "")
  public String getSysCreatedBy() {
    return sysCreatedBy;
  }

  public void setSysCreatedBy(String sysCreatedBy) {
    this.sysCreatedBy = sysCreatedBy;
  }

  public Document sysModificationDate(OffsetDateTime sysModificationDate) {
    this.sysModificationDate = sysModificationDate;
    return this;
  }

   /**
   * Get sysModificationDate
   * @return sysModificationDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getSysModificationDate() {
    return sysModificationDate;
  }

  public void setSysModificationDate(OffsetDateTime sysModificationDate) {
    this.sysModificationDate = sysModificationDate;
  }

  public Document sysModifiedBy(String sysModifiedBy) {
    this.sysModifiedBy = sysModifiedBy;
    return this;
  }

   /**
   * Get sysModifiedBy
   * @return sysModifiedBy
  **/
  @ApiModelProperty(value = "")
  public String getSysModifiedBy() {
    return sysModifiedBy;
  }

  public void setSysModifiedBy(String sysModifiedBy) {
    this.sysModifiedBy = sysModifiedBy;
  }

  public Document sysDeletionDate(OffsetDateTime sysDeletionDate) {
    this.sysDeletionDate = sysDeletionDate;
    return this;
  }

   /**
   * Deletion Date, date calculated from the retention rule never changed manually
   * @return sysDeletionDate
  **/
  @ApiModelProperty(value = "Deletion Date, date calculated from the retention rule never changed manually")
  public OffsetDateTime getSysDeletionDate() {
    return sysDeletionDate;
  }

  public void setSysDeletionDate(OffsetDateTime sysDeletionDate) {
    this.sysDeletionDate = sysDeletionDate;
  }

  public Document files(List<FileLink> files) {
    this.files = files;
    return this;
  }

  public Document addFilesItem(FileLink filesItem) {
    this.files.add(filesItem);
    return this;
  }

   /**
   * Get files
   * @return files
  **/
  @ApiModelProperty(value = "")
  public List<FileLink> getFiles() {
    return files;
  }

  public void setFiles(List<FileLink> files) {
    this.files = files;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.hold, document.hold) &&
        Objects.equals(this.sysDeleteStatus, document.sysDeleteStatus) &&
        Objects.equals(this.sysCreationDate, document.sysCreationDate) &&
        Objects.equals(this.sysCreatedBy, document.sysCreatedBy) &&
        Objects.equals(this.sysModificationDate, document.sysModificationDate) &&
        Objects.equals(this.sysModifiedBy, document.sysModifiedBy) &&
        Objects.equals(this.sysDeletionDate, document.sysDeletionDate) &&
        Objects.equals(this.files, document.files) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hold, sysDeleteStatus, sysCreationDate, sysCreatedBy, sysModificationDate, sysModifiedBy, sysDeletionDate, files, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    hold: ").append(toIndentedString(hold)).append("\n");
    sb.append("    sysDeleteStatus: ").append(toIndentedString(sysDeleteStatus)).append("\n");
    sb.append("    sysCreationDate: ").append(toIndentedString(sysCreationDate)).append("\n");
    sb.append("    sysCreatedBy: ").append(toIndentedString(sysCreatedBy)).append("\n");
    sb.append("    sysModificationDate: ").append(toIndentedString(sysModificationDate)).append("\n");
    sb.append("    sysModifiedBy: ").append(toIndentedString(sysModifiedBy)).append("\n");
    sb.append("    sysDeletionDate: ").append(toIndentedString(sysDeletionDate)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
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

