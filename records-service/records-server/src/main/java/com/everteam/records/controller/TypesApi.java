package com.everteam.records.controller;

import com.everteam.records.model.DocumentType;
import com.everteam.records.model.DocumentTypeInput;
import java.io.File;
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

@Api(value = "types", description = "the types API")
public interface TypesApi {

    @ApiOperation(value = "List Document types", notes = "List Document types", response = DocumentType.class, responseContainer = "List", tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DocumentType.class) })
    @RequestMapping(value = "/types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<DocumentType>> typesGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<DocumentType>>(HttpStatus.OK);
    }


    @ApiOperation(value = "List icons for Document Types", notes = "List icons for Document Types", response = ObjectLink.class, responseContainer = "List", tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful Response", response = ObjectLink.class) })
    @RequestMapping(value = "/types/icons",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ObjectLink>> typesIconsGet() {
        // do some magic!
        return new ResponseEntity<List<ObjectLink>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get the icon file", notes = "Get the icon file", response = File.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = File.class) })
    @RequestMapping(value = "/types/icons/{id}",
        produces = { "image/png" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> typesIconsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a Document Type", notes = "Delete a Document Type", response = Void.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/types/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> typesIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a Document type", notes = "Get a Document type", response = DocumentType.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DocumentType.class) })
    @RequestMapping(value = "/types/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<DocumentType> typesIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<DocumentType>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a given Document type", notes = "Modify a given Document type", response = Void.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/types/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> typesIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Document type object" ,required=true ) @RequestBody DocumentTypeInput objectType) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create automatically a Query from a Document Type", notes = "Create automatically a Query from a Document Type", response = Void.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/types/{id}/queries",
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> typesIdQueriesPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Connection Id", required=true ) @RequestPart(value="connectionId", required=true)  String connectionId,
        @ApiParam(value = "Source Folder Id", required=true ) @RequestPart(value="sourceFolderId", required=true)  String sourceFolderId,
        @ApiParam(value = "Source Type Id", required=true ) @RequestPart(value="sourceTypeId", required=true)  String sourceTypeId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create/Duplicate a Document Type", notes = "Create/Duplicate a Document Type", response = Void.class, tags={ "Document Types", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/types",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> typesPost(@ApiParam(value = "Document type object" ,required=true ) @RequestBody DocumentTypeInput recordType) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
