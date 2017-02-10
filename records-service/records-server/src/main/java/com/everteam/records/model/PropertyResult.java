package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Property;
import com.everteam.records.model.PropertyDefinition;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

/**
 * PropertyResult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class PropertyResult extends PropertyDefinition  {
  @JsonProperty("sortable")
  private Boolean sortable = null;

  public PropertyResult sortable(Boolean sortable) {
    this.sortable = sortable;
    return this;
  }

   /**
   * Get sortable
   * @return sortable
  **/
  @ApiModelProperty(value = "")
  public Boolean getSortable() {
    return sortable;
  }

  public void setSortable(Boolean sortable) {
    this.sortable = sortable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyResult propertyResult = (PropertyResult) o;
    return Objects.equals(this.sortable, propertyResult.sortable) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sortable, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyResult {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    sortable: ").append(toIndentedString(sortable)).append("\n");
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

