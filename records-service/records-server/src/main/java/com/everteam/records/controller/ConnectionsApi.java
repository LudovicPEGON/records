package com.everteam.records.controller;

import com.everteam.records.model.Connection;
import com.everteam.records.model.ConnectionInput;
import com.everteam.records.model.ConnectionStatus;
import com.everteam.records.model.Credentials;
import com.everteam.records.model.ETObject;
import java.io.File;
import com.everteam.records.model.ObjectType;

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

@Api(value = "connections", description = "the connections API")
public interface ConnectionsApi {

    @ApiOperation(value = "List all Connections", notes = "List all Connections", response = Connection.class, responseContainer = "List", tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Connection.class) })
    @RequestMapping(value = "/connections",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Connection>> connectionsGet(@ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<Connection>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get children of the root from the given repository", notes = "Get children of the root from the given repository repository (folders, documents, items, relationships, ...)", response = ETObject.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ETObject.class) })
    @RequestMapping(value = "/connections/{id}/children",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ETObject>> connectionsIdChildrenGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<ETObject>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Connect to a given connection", notes = "Connect to a given connection", response = Void.class, tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully connected", response = Void.class) })
    @RequestMapping(value = "/connections/{id}/connect",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> connectionsIdConnectPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Credentials object" ,required=true ) @RequestBody Credentials credentials) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Delete a given Connection", notes = "Delete a given Connection", response = Void.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully deleted", response = Void.class) })
    @RequestMapping(value = "/connections/{id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> connectionsIdDelete(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Disconnect to a given connection", notes = "Disconnect to a given connection", response = Void.class, tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully disconnected", response = Void.class) })
    @RequestMapping(value = "/connections/{id}/disconnect",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> connectionsIdDisconnectPost(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a Connection", notes = "Get a Connection", response = Connection.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Connection.class) })
    @RequestMapping(value = "/connections/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Connection> connectionsIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<Connection>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get children of the root from the given object", notes = "Get children of the root from the given object", response = ETObject.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ETObject.class) })
    @RequestMapping(value = "/connections/{id}/{objectId}/children",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ETObject>> connectionsIdObjectIdChildrenGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Object id",required=true ) @PathVariable("objectId") String objectId,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser) {
        // do some magic!
        return new ResponseEntity<List<ETObject>>(HttpStatus.OK);
    }


    @ApiOperation(value = "List distinct types of the children", notes = "List distinct types of the children of the given object", response = ObjectType.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ObjectType.class) })
    @RequestMapping(value = "/connections/{id}/{objectId}/children/types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ObjectType>> connectionsIdObjectIdChildrenTypesGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Object id",required=true ) @PathVariable("objectId") String objectId) {
        // do some magic!
        return new ResponseEntity<List<ObjectType>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get content of a specific File", notes = "Get content of a specific File", response = File.class, tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully retrieved", response = File.class) })
    @RequestMapping(value = "/connections/{id}/{objectId}/content",
        produces = { "application/octet-stream" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> connectionsIdObjectIdContentGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Object id",required=true ) @PathVariable("objectId") String objectId) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a given object", notes = "Get a given object", response = ETObject.class, tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ETObject.class) })
    @RequestMapping(value = "/connections/{id}/{objectId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ETObject> connectionsIdObjectIdGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Object id",required=true ) @PathVariable("objectId") String objectId) {
        // do some magic!
        return new ResponseEntity<ETObject>(HttpStatus.OK);
    }


    @ApiOperation(value = "List types of the given object", notes = "List types of the given object", response = ObjectType.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ObjectType.class) })
    @RequestMapping(value = "/connections/{id}/{objectId}/types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ObjectType>> connectionsIdObjectIdTypesGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Object id",required=true ) @PathVariable("objectId") String objectId) {
        // do some magic!
        return new ResponseEntity<List<ObjectType>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Modify a given Connection", notes = "Modify a given Connection", response = Void.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successfully modified", response = Void.class) })
    @RequestMapping(value = "/connections/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> connectionsIdPut(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id,
        @ApiParam(value = "Connection object" ,required=true ) @RequestBody ConnectionInput connection) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "List repositories for the given connection when connection created", notes = "List repositories for the given connection when connection created", response = ETObject.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ETObject.class) })
    @RequestMapping(value = "/connections/{id}/repositories",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ETObject>> connectionsIdRepositoriesGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<List<ETObject>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get a connection status", notes = "Get a connection status", response = ConnectionStatus.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ConnectionStatus.class) })
    @RequestMapping(value = "/connections/{id}/status",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<ConnectionStatus> connectionsIdStatusGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<ConnectionStatus>(HttpStatus.OK);
    }


    @ApiOperation(value = "List all types in the repository", notes = "List all types in the repository", response = ObjectType.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ObjectType.class) })
    @RequestMapping(value = "/connections/{id}/types",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<ObjectType>> connectionsIdTypesGet(@ApiParam(value = "Object alphanumeric id",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<List<ObjectType>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Create a new Connection", notes = "Create a new Connection", response = Void.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successfully created", response = Void.class) })
    @RequestMapping(value = "/connections",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> connectionsPost(@ApiParam(value = "Connection object" ,required=true ) @RequestBody ConnectionInput connection) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "List repositories for the given connection when creating connection", notes = "List repositories for the given connection when creating connection", response = ETObject.class, responseContainer = "List", tags={ "CMIS Client", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ETObject.class) })
    @RequestMapping(value = "/connections/repositories",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<List<ETObject>> connectionsRepositoriesPost(@ApiParam(value = "Connection object" ,required=true ) @RequestBody Connection connection) {
        // do some magic!
        return new ResponseEntity<List<ETObject>>(HttpStatus.OK);
    }


    @ApiOperation(value = "test a connection on a CMIS server", notes = "test a connection on a CMIS server", response = Boolean.class, tags={ "Connections", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Boolean.class) })
    @RequestMapping(value = "/connections/test",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Boolean> connectionsTestPost(@ApiParam(value = "Connection object" ,required=true ) @RequestBody ConnectionInput connection) {
        // do some magic!
        return new ResponseEntity<Boolean>(HttpStatus.OK);
    }

}
