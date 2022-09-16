package com.kulesko;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/colors")
public class ColorsResource {

    @Inject
    ColorsService colorsService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{hex}")
    public String matchColor(String hex) {
        return colorsService.getColor(hex);
    }

}