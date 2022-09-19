package com.kulesko.colors.rest;

import com.kulesko.colors.json.ColorPuppy;
import com.kulesko.colors.json.SearchQuery;
import com.kulesko.colors.service.ColorsService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;



@Path("/v1/colors")
public class ColorResource {

    @Inject
    ColorsService colorsService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<ColorPuppy> matchColors(SearchQuery body) {

        return colorsService.getColor(body);
    }


}