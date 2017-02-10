package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ObjectLink;
import com.everteam.records.model.Revision;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * History
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class History   {
  @JsonProperty("object")
  private ObjectLink object = null;

  @JsonProperty("revisions")
  private List<Revision> revisions = new ArrayList<Revision>();

  public History object(ObjectLink object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  @ApiModelProperty(value = "")
  public ObjectLink getObject() {
    return object;
  }

  public void setObject(ObjectLink object) {
    this.object = object;
  }

  public History revisions(List<Revision> revisions) {
    this.revisions = revisions;
    return this;
  }

  public History addRevisionsItem(Revision revisionsItem) {
    this.revisions.add(revisionsItem);
    return this;
  }

   /**
   * Get revisions
   * @return revisions
  **/
  @ApiModelProperty(value = "")
  public List<Revision> getRevisions() {
    return revisions;
  }

  public void setRevisions(List<Revision> revisions) {
    this.revisions = revisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    History history = (History) o;
    return Objects.equals(this.object, history.object) &&
        Objects.equals(this.revisions, history.revisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, revisions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class History {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    revisions: ").append(toIndentedString(revisions)).append("\n");
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

