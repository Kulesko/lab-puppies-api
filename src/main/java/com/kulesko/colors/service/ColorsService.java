package com.kulesko.colors.service;

import com.kulesko.colors.json.ColorPuppy;
import com.kulesko.colors.json.SearchQuery;

import javax.enterprise.context.ApplicationScoped;
import java.awt.*;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class ColorsService {

    public List<ColorPuppy> getColor(SearchQuery params) {
        // TODO sample LAB Color Space for a visual cousin
        return Arrays.asList(toHex(Color.WHITE));
    }

    private ColorPuppy toHex(Color color) {
        StringBuilder hexColorBuilder = new StringBuilder();
        hexColorBuilder.append("#")
                .append(Integer.toHexString(color.getRed()))
                .append(Integer.toHexString(color.getGreen()))
                .append(Integer.toHexString(color.getGreen()));
        return new ColorPuppy(hexColorBuilder.toString());
    }

}
