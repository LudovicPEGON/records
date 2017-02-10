package com.everteam.records.controller;

import com.everteam.records.model.DocumentTypeBaseInput;
import com.everteam.records.model.Query;
import com.everteam.records.model.QueryInput;

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

@Api(value = "queries", description = "the queries API")
public interface QueriesApi {

    @ApiOperation(value = "List all Queries", notes = "List all Queries", response = Query.class, responseContainer = "List", tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Query.class) })
    @RequestMapping(value = "/queries",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Query>> queriesGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<Query>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a given Query", notes = "Delete a given Query", response = Void.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/queries/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> queriesIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a Query", notes = "Get a Query", response = Query.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Query.class) })
    @RequestMapping(value = "/queries/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Query> queriesIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Query>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a given Query", notes = "Modify a given Query", response = Void.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/queries/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> queriesIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Query object" ,required=true ) @RequestBody QueryInput query) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create automatically a Document Type from a Query", notes = "Create automatically a Document Type from a Query", response = Void.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/queries/{id}/types",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> queriesIdTypesPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Type object" ,required=true ) @RequestBody DocumentTypeBaseInput type) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create a new Query", notes = "Create a new Query", response = Void.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/queries",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> queriesPost(@ApiParam(value = "Query object" ,required=true ) @RequestBody QueryInput query) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "test a query on a CMIS server", notes = "test a query on a CMIS server", response = Boolean.class, tags={ "Queries", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Boolean.class) })
    @RequestMapping(value = "/queries/test",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Boolean> queriesTestGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "Connection id parameter") @RequestParam(value = "connectionId", required = false) String connectionId,
        @ApiParam(value = "(Optional) Offset parameter on list") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "(Optional) Count parameter on list") @RequestParam(value = "count", required = false) Integer count) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

}
