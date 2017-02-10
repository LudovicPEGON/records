package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Department;
import com.everteam.records.model.Role;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ProfileDepartmentsRole
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ProfileDepartmentsRole   {
  @JsonProperty("role")
  private Role role = null;

  @JsonProperty("department")
  private Department department = null;

  public ProfileDepartmentsRole role(Role role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public Role getRole() {
    return role;
  }

  public void setRole(Role role) {
    this.role = role;
  }

  public ProfileDepartmentsRole department(Department department) {
    this.department = department;
    return this;
  }

   /**
   * Get department
   * @return department
  **/
  @ApiModelProperty(value = "")
  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfileDepartmentsRole profileDepartmentsRole = (ProfileDepartmentsRole) o;
    return Objects.equals(this.role, profileDepartmentsRole.role) &&
        Objects.equals(this.department, profileDepartmentsRole.department);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, department);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProfileDepartmentsRole {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
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

