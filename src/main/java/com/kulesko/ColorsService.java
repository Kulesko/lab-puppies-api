package com.kulesko;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ColorsService {

    public String getColor(String baseColorHex) {
        return "yellow";
    }

}
