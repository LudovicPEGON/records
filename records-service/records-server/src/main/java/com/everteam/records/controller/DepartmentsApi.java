package com.everteam.records.controller;

import com.everteam.records.model.Department;

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

@Api(value = "departments", description = "the departments API")
public interface DepartmentsApi {

    @ApiOperation(value = "List Departments", notes = "List Departments", response = Department.class, responseContainer = "List", tags={ "Administration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Department.class) })
    @RequestMapping(value = "/departments",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Department>> departmentsGet() {
        // do some magic!
        return new ResponseEntity<List<Department>>(HttpStatus.OK);
    }

}
