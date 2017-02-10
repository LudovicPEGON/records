package com.everteam.records.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SearchResultsClusters
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class SearchResultsClusters   {
  @JsonProperty("labels")
  private List<String> labels = new ArrayList<String>();

  @JsonProperty("score")
  private Float score = null;

  @JsonProperty("docIds")
  private List<String> docIds = new ArrayList<String>();

  public SearchResultsClusters labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public SearchResultsClusters addLabelsItem(String labelsItem) {
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public SearchResultsClusters score(Float score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(value = "")
  public Float getScore() {
    return score;
  }

  public void setScore(Float score) {
    this.score = score;
  }

  public SearchResultsClusters docIds(List<String> docIds) {
    this.docIds = docIds;
    return this;
  }

  public SearchResultsClusters addDocIdsItem(String docIdsItem) {
    this.docIds.add(docIdsItem);
    return this;
  }

   /**
   * Get docIds
   * @return docIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getDocIds() {
    return docIds;
  }

  public void setDocIds(List<String> docIds) {
    this.docIds = docIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchResultsClusters searchResultsClusters = (SearchResultsClusters) o;
    return Objects.equals(this.labels, searchResultsClusters.labels) &&
        Objects.equals(this.score, searchResultsClusters.score) &&
        Objects.equals(this.docIds, searchResultsClusters.docIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labels, score, docIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResultsClusters {\n");
    
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    docIds: ").append(toIndentedString(docIds)).append("\n");
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

