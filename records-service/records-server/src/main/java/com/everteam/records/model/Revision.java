package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;

/**
 * Revision
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Revision   {
  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("user")
  private User user = null;

  /**
   * Type of the revision
   */
  public enum TypeEnum {
    CREATION("CREATION"),
    
    MODIFICATION("MODIFICATION"),
    
    DELETION("DELETION"),
    
    TRANSFER("TRANSFER");

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

  public Revision date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Date of the revision
   * @return date
  **/
  @ApiModelProperty(value = "Date of the revision")
  public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Revision user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Revision type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the revision
   * @return type
  **/
  @ApiModelProperty(value = "Type of the revision")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Revision revision = (Revision) o;
    return Objects.equals(this.date, revision.date) &&
        Objects.equals(this.user, revision.user) &&
        Objects.equals(this.type, revision.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, user, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Revision {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

