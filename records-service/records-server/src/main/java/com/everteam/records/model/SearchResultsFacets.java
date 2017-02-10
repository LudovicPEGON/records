package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.FacetResults;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * SearchResultsFacets
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class SearchResultsFacets   {
  @JsonProperty("facetId")
  private String facetId = null;

  @JsonProperty("label")
  private String label = null;

  /**
   * facet type representation
   */
  public enum TypeEnum {
    PIE("PIE"),
    
    BAR("BAR"),
    
    TREEMAP("TREEMAP");

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

  @JsonProperty("gap")
  private String gap = null;

  @JsonProperty("values")
  private FacetResults values = null;

  public SearchResultsFacets facetId(String facetId) {
    this.facetId = facetId;
    return this;
  }

   /**
   * Get facetId
   * @return facetId
  **/
  @ApiModelProperty(value = "")
  public String getFacetId() {
    return facetId;
  }

  public void setFacetId(String facetId) {
    this.facetId = facetId;
  }

  public SearchResultsFacets label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public SearchResultsFacets type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * facet type representation
   * @return type
  **/
  @ApiModelProperty(value = "facet type representation")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SearchResultsFacets gap(String gap) {
    this.gap = gap;
    return this;
  }

   /**
   * Get gap
   * @return gap
  **/
  @ApiModelProperty(value = "")
  public String getGap() {
    return gap;
  }

  public void setGap(String gap) {
    this.gap = gap;
  }

  public SearchResultsFacets values(FacetResults values) {
    this.values = values;
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  public FacetResults getValues() {
    return values;
  }

  public void setValues(FacetResults values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsFacets searchResultsFacets = (SearchResultsFacets) o;
    return Objects.equals(this.facetId, searchResultsFacets.facetId) &&
        Objects.equals(this.label, searchResultsFacets.label) &&
        Objects.equals(this.type, searchResultsFacets.type) &&
        Objects.equals(this.gap, searchResultsFacets.gap) &&
        Objects.equals(this.values, searchResultsFacets.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(facetId, label, type, gap, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsFacets {\n");
    
    sb.append("    facetId: ").append(toIndentedString(facetId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gap: ").append(toIndentedString(gap)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

