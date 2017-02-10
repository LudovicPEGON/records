package com.everteam.records.model;

import java.util.Objects;
import com.everteam.records.model.Connection;
import com.everteam.records.model.Job;
import com.everteam.records.model.JobStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DashboardJobInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

public class DashboardJobInfo   {
  @JsonProperty("job")
  private Job job = null;

  @JsonProperty("jobStatus")
  private JobStatus jobStatus = null;

  @JsonProperty("connection")
  private Connection connection = null;

  public DashboardJobInfo job(Job job) {
    this.job = job;
    return this;
  }

   /**
   * Get job
   * @return job
  **/
  @ApiModelProperty(value = "")
  public Job getJob() {
    return job;
  }

  public void setJob(Job job) {
    this.job = job;
  }

  public DashboardJobInfo jobStatus(JobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

   /**
   * Get jobStatus
   * @return jobStatus
  **/
  @ApiModelProperty(value = "")
  public JobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(JobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }

  public DashboardJobInfo connection(Connection connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public Connection getConnection() {
    return connection;
  }

  public void setConnection(Connection connection) {
    this.connection = connection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardJobInfo dashboardJobInfo = (DashboardJobInfo) o;
    return Objects.equals(this.job, dashboardJobInfo.job) &&
        Objects.equals(this.jobStatus, dashboardJobInfo.jobStatus) &&
        Objects.equals(this.connection, dashboardJobInfo.connection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(job, jobStatus, connection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardJobInfo {\n");
    
    sb.append("    job: ").append(toIndentedString(job)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
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

