package com.everteam.records.controller;

import java.io.File;
import com.everteam.records.model.Retention;
import com.everteam.records.model.RetentionInput;

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

@Api(value = "retentions", description = "the retentions API")
public interface RetentionsApi {

    @ApiOperation(value = "List Retention rules", notes = "List Retention rules", response = Retention.class, responseContainer = "List", tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Retention.class) })
    @RequestMapping(value = "/retentions",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Retention>> retentionsGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<Retention>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a Retention Rule", notes = "Delete a Retention Rule", response = Void.class, tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/retentions/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> retentionsIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Export a report of this Retention Rule", notes = "Export a report of this Retention Rule", response = File.class, tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully treated", response = File.class) })
    @RequestMapping(value = "/retentions/{id}/export",
        produces = { "application/pdf" }, 
        method = RequestMethod.POST)
    default ResponseEntity<File> retentionsIdExportPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "List Retention rules", notes = "List Retention rules", response = Retention.class, tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Retention.class) })
    @RequestMapping(value = "/retentions/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Retention> retentionsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Retention>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a Retention Rule", notes = "Modify a  Retention Rule", response = Void.class, tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/retentions/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> retentionsIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Retention rule object" ,required=true ) @RequestBody RetentionInput retentionRule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create/Duplicate a new Retention Rule", notes = "Create/Duplicate a new Retention Rule", response = Void.class, tags={ "Retention Rules", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/retentions",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> retentionsPost(@ApiParam(value = "Retention rule object" ,required=true ) @RequestBody RetentionInput retentionRule) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
