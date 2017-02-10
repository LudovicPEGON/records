package com.everteam.records.controller;

import java.io.File;
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

@Api(value = "search", description = "the search API")
public interface SearchApi {

    @ApiOperation(value = "Global analytics export on anything", notes = "Global analytics export on anything", response = File.class, tags={ "Search", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successfully treated", response = File.class) })
    @RequestMapping(value = "/search/export",
        produces = { "application/octet-stream" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> searchExportGet(@ApiParam(value = "(Optional) Count parameter on list") @RequestParam(value = "count", required = false) Integer count,
        @ApiParam(value = "(Optional) Offset parameter on list") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Filter Query parameter on list") @RequestParam(value = "filterQuery", required = false) List<String> filterQuery,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser,
        @ApiParam(value = "(Optional) Sort parameter on list") @RequestParam(value = "sort", required = false) String sort,
        @ApiParam(value = "Tell which format  you want (PDF, CSV or XLS)", allowableValues = "PDF, XLS, CSV", defaultValue = "PDF") @RequestParam(value = "format", required = false, defaultValue="PDF") String format,
        @ApiParam(value = "Tell if we want to download or not", defaultValue = "false") @RequestParam(value = "attachement", required = false, defaultValue="false") Boolean attachement,
        @ApiParam(value = "the template name to download"  ) @RequestHeader(value="template", required=false) String template) {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }


    @ApiOperation(value = "Global analytics search on anything", notes = "Global analytics search on anything", response = SearchResults.class, tags={ "Search", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = SearchResults.class) })
    @RequestMapping(value = "/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<SearchResults> searchGet(@ApiParam(value = "(Optional) Count parameter on list") @RequestParam(value = "count", required = false) Integer count,
        @ApiParam(value = "(Optional) Offset parameter on list") @RequestParam(value = "offset", required = false) Integer offset,
        @ApiParam(value = "Query parameter on list") @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "(Optional) Filter Query parameter on list") @RequestParam(value = "filterQuery", required = false) List<String> filterQuery,
        @ApiParam(value = "(Optional) Parser parameter on list (default = rql)", allowableValues = "RQL, FT", defaultValue = "RQL") @RequestParam(value = "parser", required = false, defaultValue="RQL") String parser,
        @ApiParam(value = "(Optional) Sort parameter on list") @RequestParam(value = "sort", required = false) String sort) {
        // do some magic!
        return new ResponseEntity<SearchResults>(HttpStatus.OK);
    }

}
