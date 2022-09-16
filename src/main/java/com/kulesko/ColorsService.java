package com.kulesko;

import javax.enterprise.context.ApplicationScoped;
import java.awt.*;

@ApplicationScoped
public class ColorsService {

    public String getColor(String baseColorHex) {
        // TODO sample LAB Color Space for a visual cousin
        return toHex(Color.WHITE);
    }

    private String toHex(Color color) {
        StringBuilder hexColorBuilder = new StringBuilder();
        hexColorBuilder.append("#")
                .append(Integer.toHexString(color.getRed()))
                .append(Integer.toHexString(color.getGreen()))
                .append(Integer.toHexString(color.getGreen()));
        return hexColorBuilder.toString();
    }

}
