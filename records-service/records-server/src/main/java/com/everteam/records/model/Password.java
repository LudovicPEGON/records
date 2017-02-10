package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Password
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class Password   {
  @JsonProperty("password")
  private String password = null;

  @JsonProperty("passtrans")
  private String passtrans = null;

  public Password password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Password passtrans(String passtrans) {
    this.passtrans = passtrans;
    return this;
  }

   /**
   * Get passtrans
   * @return passtrans
  **/
  @ApiModelProperty(value = "")
  public String getPasstrans() {
    return passtrans;
  }

  public void setPasstrans(String passtrans) {
    this.passtrans = passtrans;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Password password = (Password) o;
    return Objects.equals(this.password, password.password) &&
        Objects.equals(this.passtrans, password.passtrans);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, passtrans);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Password {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    passtrans: ").append(toIndentedString(passtrans)).append("\n");
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

