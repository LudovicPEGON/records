package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.ProfileDepartmentsRole;
import com.everteam.records.model.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Profile Object
 */
@ApiModel(description = "Profile Object")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Profile   {
  @JsonProperty("user")
  private User user = null;

  @JsonProperty("picture")
  private String picture = null;

  @JsonProperty("departmentsRole")
  private List<ProfileDepartmentsRole> departmentsRole = new ArrayList<ProfileDepartmentsRole>();

  public Profile user(User user) {
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

  public Profile picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Get picture
   * @return picture
  **/
  @ApiModelProperty(value = "")
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Profile departmentsRole(List<ProfileDepartmentsRole> departmentsRole) {
    this.departmentsRole = departmentsRole;
    return this;
  }

  public Profile addDepartmentsRoleItem(ProfileDepartmentsRole departmentsRoleItem) {
    this.departmentsRole.add(departmentsRoleItem);
    return this;
  }

   /**
   * Get departmentsRole
   * @return departmentsRole
  **/
  @ApiModelProperty(value = "")
  public List<ProfileDepartmentsRole> getDepartmentsRole() {
    return departmentsRole;
  }

  public void setDepartmentsRole(List<ProfileDepartmentsRole> departmentsRole) {
    this.departmentsRole = departmentsRole;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.user, profile.user) &&
        Objects.equals(this.picture, profile.picture) &&
        Objects.equals(this.departmentsRole, profile.departmentsRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, picture, departmentsRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    departmentsRole: ").append(toIndentedString(departmentsRole)).append("\n");
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

