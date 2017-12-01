package com.service.service9.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-12-01T06:54:29.402Z")

@RestSchema(schemaId = "service9")
@RequestMapping(path = "/service9", produces = MediaType.APPLICATION_JSON)
public class Service9Impl {

    @Autowired
    private Service9Delegate userService9Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userService9Delegate.helloworld(name);
    }

}
