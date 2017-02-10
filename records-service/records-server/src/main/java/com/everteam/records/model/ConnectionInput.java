package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Credentials;
import com.everteam.records.model.Property;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * ConnectionInput
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class ConnectionInput   {
  @JsonProperty("name")
  private String name = null;

  /**
   * connection's protocol
   */
  public enum ProtocolEnum {
    ATOMPUB("ATOMPUB"),
    
    WEBSERVICES("WEBSERVICES"),
    
    BROWSER("BROWSER");

    private String value;

    ProtocolEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProtocolEnum fromValue(String text) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("protocol")
  private ProtocolEnum protocol = null;

  @JsonProperty("credentials")
  private Credentials credentials = null;

  @JsonProperty("url")
  private String url = null;

  @JsonProperty("repository")
  private List<Property> repository = new ArrayList<Property>();

  /**
   * Authentification mode used for connection to this cmis server
   */
  public enum AuthenticationEnum {
    NONE("NONE"),
    
    STANDARD("STANDARD"),
    
    NTLM("NTLM"),
    
    OAUTH2("OAUTH2");

    private String value;

    AuthenticationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AuthenticationEnum fromValue(String text) {
      for (AuthenticationEnum b : AuthenticationEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("authentication")
  private AuthenticationEnum authentication = null;

  public ConnectionInput name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConnectionInput protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * connection's protocol
   * @return protocol
  **/
  @ApiModelProperty(value = "connection's protocol")
  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public ConnectionInput credentials(Credentials credentials) {
    this.credentials = credentials;
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @ApiModelProperty(value = "")
  public Credentials getCredentials() {
    return credentials;
  }

  public void setCredentials(Credentials credentials) {
    this.credentials = credentials;
  }

  public ConnectionInput url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public ConnectionInput repository(List<Property> repository) {
    this.repository = repository;
    return this;
  }

  public ConnectionInput addRepositoryItem(Property repositoryItem) {
    this.repository.add(repositoryItem);
    return this;
  }

   /**
   * Get repository
   * @return repository
  **/
  @ApiModelProperty(value = "")
  public List<Property> getRepository() {
    return repository;
  }

  public void setRepository(List<Property> repository) {
    this.repository = repository;
  }

  public ConnectionInput authentication(AuthenticationEnum authentication) {
    this.authentication = authentication;
    return this;
  }

   /**
   * Authentification mode used for connection to this cmis server
   * @return authentication
  **/
  @ApiModelProperty(value = "Authentification mode used for connection to this cmis server")
  public AuthenticationEnum getAuthentication() {
    return authentication;
  }

  public void setAuthentication(AuthenticationEnum authentication) {
    this.authentication = authentication;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionInput connectionInput = (ConnectionInput) o;
    return Objects.equals(this.name, connectionInput.name) &&
        Objects.equals(this.protocol, connectionInput.protocol) &&
        Objects.equals(this.credentials, connectionInput.credentials) &&
        Objects.equals(this.url, connectionInput.url) &&
        Objects.equals(this.repository, connectionInput.repository) &&
        Objects.equals(this.authentication, connectionInput.authentication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, protocol, credentials, url, repository, authentication);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionInput {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    authentication: ").append(toIndentedString(authentication)).append("\n");
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

