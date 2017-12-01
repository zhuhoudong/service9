package com.service.service9.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2017-12-01T06:31:02.544Z")


@RestSchema(schemaId = "service9")
@Path("/service9")

@Produces({ "application/json" })
public class Service9Impl  {

    @Autowired
    private Service9Delegate service9Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return service9Delegate.helloworld(name);
    }
}

