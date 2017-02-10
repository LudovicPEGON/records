package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ETObjectCommon;
import com.everteam.records.model.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * ETObjectInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ETObjectInput extends ETObjectCommon  {
  @JsonProperty("typeId")
  private String typeId = null;

  public ETObjectInput typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @ApiModelProperty(value = "")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ETObjectInput etObjectInput = (ETObjectInput) o;
    return Objects.equals(this.typeId, etObjectInput.typeId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ETObjectInput {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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

