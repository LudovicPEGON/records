package com.everteam.records.controller;

import java.io.File;
import com.everteam.records.model.Profile;

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

@Api(value = "profile", description = "the profile API")
public interface ProfileApi {

    @ApiOperation(value = "Get user profile parameters", notes = "Get user profile parameters", response = Profile.class, tags={ "Administration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Profile.class) })
    @RequestMapping(value = "/profile",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Profile> profileGet() {
        // do some magic!
        return new ResponseEntity<Profile>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get picture of connected user", notes = "Get picture of connected user", response = File.class, tags={ "Administration", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = File.class) })
    @RequestMapping(value = "/profile/picture",
        produces = { "image/png" }, 
        method = RequestMethod.GET)
    default ResponseEntity<File> profilePictureGet() {
        // do some magic!
        return new ResponseEntity<File>(HttpStatus.OK);
    }

}
