package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * HoldDocumentsContainer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class HoldDocumentsContainer   {
  @JsonProperty("holdId")
  private String holdId = null;

  @JsonProperty("documentsId")
  private List<String> documentsId = new ArrayList<String>();

  @JsonProperty("reason")
  private String reason = null;

  public HoldDocumentsContainer holdId(String holdId) {
    this.holdId = holdId;
    return this;
  }

   /**
   * Get holdId
   * @return holdId
  **/
  @ApiModelProperty(value = "")
  public String getHoldId() {
    return holdId;
  }

  public void setHoldId(String holdId) {
    this.holdId = holdId;
  }

  public HoldDocumentsContainer documentsId(List<String> documentsId) {
    this.documentsId = documentsId;
    return this;
  }

  public HoldDocumentsContainer addDocumentsIdItem(String documentsIdItem) {
    this.documentsId.add(documentsIdItem);
    return this;
  }

   /**
   * Get documentsId
   * @return documentsId
  **/
  @ApiModelProperty(value = "")
  public List<String> getDocumentsId() {
    return documentsId;
  }

  public void setDocumentsId(List<String> documentsId) {
    this.documentsId = documentsId;
  }

  public HoldDocumentsContainer reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HoldDocumentsContainer holdDocumentsContainer = (HoldDocumentsContainer) o;
    return Objects.equals(this.holdId, holdDocumentsContainer.holdId) &&
        Objects.equals(this.documentsId, holdDocumentsContainer.documentsId) &&
        Objects.equals(this.reason, holdDocumentsContainer.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(holdId, documentsId, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HoldDocumentsContainer {\n");
    
    sb.append("    holdId: ").append(toIndentedString(holdId)).append("\n");
    sb.append("    documentsId: ").append(toIndentedString(documentsId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

