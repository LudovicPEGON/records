package com.everteam.records.controller;

import com.everteam.records.model.Job;
import com.everteam.records.model.JobInput;
import com.everteam.records.model.JobStatus;
import com.everteam.records.model.Query;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-02-10T13:08:13.873Z")

@Api(value = "jobs", description = "the jobs API")
public interface JobsApi {

    @ApiOperation(value = "List all Jobs", notes = "List all Jobs", response = Job.class, responseContainer = "List", tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Job.class) })
    @RequestMapping(value = "/jobs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Job>> jobsGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<Job>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a given Job", notes = "Delete a given Job", response = Void.class, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/jobs/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> jobsIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a job", notes = "Get a job", response = Job.class, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Job.class) })
    @RequestMapping(value = "/jobs/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Job> jobsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Job>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a given Job", notes = "Modify a given Job", response = Void.class, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/jobs/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> jobsIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Job object" ,required=true ) @RequestBody JobInput job) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a job status", notes = "Get a job status", response = JobStatus.class, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = JobStatus.class) })
    @RequestMapping(value = "/jobs/{id}/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<JobStatus> jobsIdStatusGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<JobStatus>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create a new Job", notes = "Create a new Job", response = Void.class, tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/jobs",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> jobsPost(@ApiParam(value = "Job object" ,required=true ) @RequestBody JobInput job) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get all queries that has not been associated with existing job", notes = "Get a job status", response = Query.class, responseContainer = "List", tags={ "Jobs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Query.class) })
    @RequestMapping(value = "/jobs/queries/unused",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Query>> jobsQueriesUnusedGet() {
        // do some magic!
        return new ResponseEntity<List<Query>>(HttpStatus.OK);
    }

}
