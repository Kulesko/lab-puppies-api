package com.kulesko.colors.service;

import com.kulesko.colors.json.ColorPuppy;
import com.kulesko.colors.json.SearchQuery;
import org.apache.commons.imaging.color.ColorCieLab;
import org.apache.commons.imaging.color.ColorConversions;
import org.apache.commons.imaging.color.ColorXyz;

import javax.enterprise.context.ApplicationScoped;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@ApplicationScoped
public class ColorsService {
    private Random random = new Random(System.currentTimeMillis());

    public List<ColorPuppy> findMatchingColors(SearchQuery params) {
        final ColorPuppy reference = params.getReference();

        List<ColorPuppy> matches = new ArrayList<>();
        for (int i = 0; i < params.getSamples(); i++) {
            double[] sample = getRandomPointOnUnitSphere();
            double[] offset = {reference.L, reference.a, reference.b};
            for (int j = 0; j < sample.length; j++) {
                sample[j] = sample[j] * params.getDeltaE() + offset[j];
            }
            matches.add(ColorPuppy.of(sample));
        }

        return matches;
    }

    private double[] getRandomPointOnUnitSphere() {

        double[] cubeSample = {random.nextDouble() - .5d, random.nextDouble() - .5d, random.nextDouble() - .5d};
        double[] sphereSample = new double[3];
        // normalize to put sample point onto unit sphere
        double divisor = Math.sqrt(Arrays.stream(cubeSample).map(d -> d * d).sum());
        for (int i = 0; i < cubeSample.length; i++) {
            sphereSample[i] = cubeSample[i] / divisor;
        }
        return cubeSample;
    }

    private ColorCieLab convertColor2CieLab(String color) {
        ColorXyz colorXyz = ColorConversions.convertRGBtoXYZ(Color.decode(color).getRGB());
        return ColorConversions.convertXYZtoCIELab(colorXyz);
    }


}
