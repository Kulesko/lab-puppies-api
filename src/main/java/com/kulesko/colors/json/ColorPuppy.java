package com.kulesko.colors.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.kulesko.colors.utils.ColorOps;

public class ColorPuppy {

    @JsonIgnore
    public final double L;
    @JsonIgnore
    public final double a;
    @JsonIgnore
    public final double b;

    @JsonCreator
    public ColorPuppy(@JsonProperty("color") String color) {
        ColorPuppy convert = ColorOps.get().convert(color);
        this.L = convert.L;
        this.a = convert.a;
        this.b = convert.b;
    }

    public ColorPuppy(double L, double a, double b) {
        this.L = L;
        this.a = a;
        this.b = b;
    }

    public static ColorPuppy of(String color) {
        return ColorOps.get().convert(color);
    }

    public static ColorPuppy of(double... lab) {
        return new ColorPuppy(lab[0], lab[1], lab[2]);
    }

    @JsonProperty("color")
    public String getHex() {
        return ColorOps.get().toHex(this);
    }


}
