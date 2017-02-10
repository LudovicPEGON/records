package com.everteam.records.controller;

import com.everteam.records.model.Hold;
import com.everteam.records.model.HoldDocumentsContainer;
import com.everteam.records.model.HoldInput;
import com.everteam.records.model.ObjectLink;

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

@Api(value = "holds", description = "the holds API")
public interface HoldsApi {

    @ApiOperation(value = "List all Holds", notes = "List all Holds", response = Hold.class, responseContainer = "List", tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Hold.class) })
    @RequestMapping(value = "/holds",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Hold>> holdsGet(@ApiParam(value = "(Optional) Count parameter on list") @RequestParam(value = "count", required = false) Integer count,
        @ApiParam(value = "(Optional) Offset parameter on list") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<Hold>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Close this hold (and all the records it contains, ie. release them)", notes = "Close this hold (and all the records it contains, ie. release them)", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully closed", response = Void.class) })
    @RequestMapping(value = "/holds/{id}/close",
        method = RequestMethod.POST)
    default ResponseEntity<Void> holdsIdClosePost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a given Hold", notes = "Delete a given Hold", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/holds/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> holdsIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Close/Release some documents from this hold", notes = "Close/Release some documents from this hold", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully closed", response = Void.class) })
    @RequestMapping(value = "/holds/{id}/documents/close",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> holdsIdDocumentsClosePost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = ""  ) @RequestBody HoldDocumentsContainer holdDocuments) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get documents of this hold", notes = "Get documents of this hold", response = ObjectLink.class, responseContainer = "List", tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ObjectLink.class) })
    @RequestMapping(value = "/holds/{id}/documents",
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<ObjectLink>> holdsIdDocumentsGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<List<ObjectLink>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Add documents to this hold", notes = "Add documents to this hold", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully added", response = Void.class) })
    @RequestMapping(value = "/holds/{id}/documents",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> holdsIdDocumentsPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = ""  ) @RequestBody HoldDocumentsContainer holdDocuments) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a Hold", notes = "Get a Hold", response = Hold.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Hold.class) })
    @RequestMapping(value = "/holds/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Hold> holdsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Hold>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a given Hold", notes = "Modify a given Hold", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/holds/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> holdsIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Hold object" ,required=true ) @RequestBody HoldInput hold) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create a new Hold", notes = "Create a new Hold", response = Void.class, tags={ "Holds", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/holds",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> holdsPost(@ApiParam(value = "Hold object" ,required=true ) @RequestBody HoldInput hold) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
