package com.kulesko.colors.utils;

import com.kulesko.colors.json.ColorPuppy;
import org.apache.commons.imaging.color.ColorCieLab;
import org.apache.commons.imaging.color.ColorConversions;

import javax.inject.Singleton;
import java.awt.*;

@Singleton
public class ColorOps {

    private final static ColorOps instance = new ColorOps();

    public static ColorOps get() {
        return instance;
    }

    public ColorPuppy convert(String color) {
        Color jColor = Color.decode(color);
        ColorCieLab lab = ColorConversions.convertXYZtoCIELab(ColorConversions.convertRGBtoXYZ(jColor.getRGB()));
        return new ColorPuppy(lab.L, lab.a, lab.b);
    }

    public String toHex(ColorPuppy puppy) {
        int rgb = ColorConversions.convertXYZtoRGB(ColorConversions.convertCIELabtoXYZ(new ColorCieLab(puppy.L, puppy.a, puppy.b)));
        Color color = new Color(rgb);
        StringBuilder hexColorBuilder = new StringBuilder();
        String red = Integer.toHexString(color.getRed());
        String green = Integer.toHexString(color.getGreen());
        String blue = Integer.toHexString(color.getBlue());
        hexColorBuilder.append("#")
                .append(red.length() == 1 ? "0" + red : red)
                .append(green.length() == 1 ? "0" + green : green)
                .append(blue.length() == 1 ? "0" + blue : blue);
        return hexColorBuilder.toString();
    }

}
