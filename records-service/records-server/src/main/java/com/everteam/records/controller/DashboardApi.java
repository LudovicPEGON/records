package com.everteam.records.controller;

import com.everteam.records.model.DashboardJobInfo;
import com.everteam.records.model.SearchResultsFacets;

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

@Api(value = "dashboard", description = "the dashboard API")
public interface DashboardApi {

    @ApiOperation(value = "Get jobs for dashboard", notes = "Get jobs for dashboard", response = DashboardJobInfo.class, responseContainer = "List", tags={ "Dashboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DashboardJobInfo.class) })
    @RequestMapping(value = "/dashboard/jobs",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<DashboardJobInfo>> dashboardJobsGet(@ApiParam(value = "Status") @RequestParam(value = "status", required = false) String status) {
        // do some magic!
        return new ResponseEntity<List<DashboardJobInfo>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get stats for dashboard", notes = "Get stats for dashboard", response = SearchResultsFacets.class, tags={ "Dashboard", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SearchResultsFacets.class) })
    @RequestMapping(value = "/dashboard/stats",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SearchResultsFacets> dashboardStatsGet() {
        // do some magic!
        return new ResponseEntity<SearchResultsFacets>(HttpStatus.OK);
    }

}
