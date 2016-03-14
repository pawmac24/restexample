package com.pawelm.plugin.rest;

import com.atlassian.plugins.rest.common.security.AnonymousAllowed;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * A resource of message.
 */
@Path("/xxx")
//http://localhost:2990/jira/rest/myrest/1.0/xxx
public class MyRest {

    @GET
    @AnonymousAllowed
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response getXXX()
    {
       return Response.ok(new SecondModel("Hello World from MyRest")).build();
    }
}