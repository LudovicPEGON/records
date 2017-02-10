package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.SearchResultsClusters;
import com.everteam.records.model.SearchResultsFacets;
import com.everteam.records.model.SearchResultsHeader;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResults
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class SearchResults   {
  @JsonProperty("header")
  private SearchResultsHeader header = null;

  @JsonProperty("objects")
  private List<Object> objects = new ArrayList<Object>();

  @JsonProperty("facets")
  private List<SearchResultsFacets> facets = new ArrayList<SearchResultsFacets>();

  @JsonProperty("clusters")
  private List<SearchResultsClusters> clusters = new ArrayList<SearchResultsClusters>();

  public SearchResults header(SearchResultsHeader header) {
    this.header = header;
    return this;
  }

   /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")
  public SearchResultsHeader getHeader() {
    return header;
  }

  public void setHeader(SearchResultsHeader header) {
    this.header = header;
  }

  public SearchResults objects(List<Object> objects) {
    this.objects = objects;
    return this;
  }

  public SearchResults addObjectsItem(Object objectsItem) {
    this.objects.add(objectsItem);
    return this;
  }

   /**
   * Get objects
   * @return objects
  **/
  @ApiModelProperty(value = "")
  public List<Object> getObjects() {
    return objects;
  }

  public void setObjects(List<Object> objects) {
    this.objects = objects;
  }

  public SearchResults facets(List<SearchResultsFacets> facets) {
    this.facets = facets;
    return this;
  }

  public SearchResults addFacetsItem(SearchResultsFacets facetsItem) {
    this.facets.add(facetsItem);
    return this;
  }

   /**
   * Get facets
   * @return facets
  **/
  @ApiModelProperty(value = "")
  public List<SearchResultsFacets> getFacets() {
    return facets;
  }

  public void setFacets(List<SearchResultsFacets> facets) {
    this.facets = facets;
  }

  public SearchResults clusters(List<SearchResultsClusters> clusters) {
    this.clusters = clusters;
    return this;
  }

  public SearchResults addClustersItem(SearchResultsClusters clustersItem) {
    this.clusters.add(clustersItem);
    return this;
  }

   /**
   * Get clusters
   * @return clusters
  **/
  @ApiModelProperty(value = "")
  public List<SearchResultsClusters> getClusters() {
    return clusters;
  }

  public void setClusters(List<SearchResultsClusters> clusters) {
    this.clusters = clusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.header, searchResults.header) &&
        Objects.equals(this.objects, searchResults.objects) &&
        Objects.equals(this.facets, searchResults.facets) &&
        Objects.equals(this.clusters, searchResults.clusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, objects, facets, clusters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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

