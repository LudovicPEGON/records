package com.everteam.records.controller;

import com.everteam.records.model.AlphaKeys;
import com.everteam.records.model.Document;
import com.everteam.records.model.DocumentInput;
import java.io.File;
import com.everteam.records.model.History;
import com.everteam.records.model.SearchResults;

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

@Api(value = "documents", description = "the documents API")
public interface DocumentsApi {

    @ApiOperation(value = "Approve destruction for selected Documents", notes = "Approve destruction for selected Documents", response = Void.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully destructed", response = Void.class) })
    @RequestMapping(value = "/documents/destroy",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> documentsDestroyPost(@ApiParam(value = ""  ) @RequestBody AlphaKeys ids) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Export the given Document Objects", notes = "Export the given Document Objects", response = File.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully treated", response = File.class) })
    @RequestMapping(value = "/documents/export",
        produces = { "application/octet-stream" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<File> documentsExportPost(@ApiParam(value = "" ,required=true ) @RequestBody AlphaKeys ids,
        @ApiParam(value = "Tell which format  you want (PDF, CSV or XLS)"  , allowableValues="PDF, XLS, CSV", defaultValue="PDF") @RequestHeader(value="format", required=false) String format,
        @ApiParam(value = "Tell if we want to download or not"  , defaultValue="false") @RequestHeader(value="attachement", required=false) Boolean attachement,
        @ApiParam(value = "the template name to download"  ) @RequestHeader(value="template", required=false) String template) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "List Document objects", notes = "List Document objects", response = SearchResults.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SearchResults.class) })
    @RequestMapping(value = "/documents",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SearchResults> documentsGet(@ApiParam(value = "Document type code", required = true) @RequestParam(value = "documentType", required = true) String documentType,
        @ApiParam(value = "(Optional) Count parameter on list") @RequestParam(value = "count", required = false) Integer count,
        @ApiParam(value = "(Optional) Offset parameter on list") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Filter Query parameter on list") @RequestParam(value = "filterQuery", required = false) List<String> filterQuery,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser,
        @ApiParam(value = "(Optional) Sort parameter on list") @RequestParam(value = "sort", required = false) String sort) {
        // do some magic!
        return new ResponseEntity<SearchResults>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a Document", notes = "Delete a Document", response = Void.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/documents/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> documentsIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a specific File", notes = "Get a specific File", response = File.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved", response = File.class) })
    @RequestMapping(value = "/documents/{id}/files/{fileId}",
        produces = { "application/octet-stream" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> documentsIdFilesFileIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "File's id",required=true ) @PathVariable("fileId") String fileId) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get the thumbnail of the File", notes = "Get the thumbnail of the File", response = File.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved", response = File.class) })
    @RequestMapping(value = "/documents/{id}/files/{fileId}/thumbnail",
        produces = { "image/png" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> documentsIdFilesFileIdThumbnailGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "File's id",required=true ) @PathVariable("fileId") String fileId) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Set/Replace a file to the given Document", notes = "Set/Replace a file to the given Document", response = Void.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully added", response = Void.class) })
    @RequestMapping(value = "/documents/{id}/files",
        consumes = { "multipart/form-data" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> documentsIdFilesPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "file detail") @RequestPart("file") MultipartFile file) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get the given Document", notes = "Get the given Document", response = Document.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Document.class) })
    @RequestMapping(value = "/documents/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Document> documentsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Document>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get an history of a Document", notes = "Get history of a Document (Date and user for creation and modifications).", response = History.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = History.class) })
    @RequestMapping(value = "/documents/{id}/history",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<History> documentsIdHistoryGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<History>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a Document", notes = "Modify a Document", response = Void.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/documents/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> documentsIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "" ,required=true ) @RequestBody DocumentInput object) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a thumbnail", notes = "Get a thumbnail of the first page of his first document attached if there is one.", response = File.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = File.class) })
    @RequestMapping(value = "/documents/{id}/thumbnail",
        produces = { "image/png" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> documentsIdThumbnailGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create a Document", notes = "Create a Document", response = Void.class, tags={ "Documents", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/documents",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> documentsPost(@ApiParam(value = ""  ) @RequestBody DocumentInput object) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
