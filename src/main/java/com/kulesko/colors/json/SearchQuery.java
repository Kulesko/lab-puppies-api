package com.kulesko.colors.json;

public class SearchQuery {
    private ColorPuppy origin;
    private int deltaE;
    private int samples;

    public SearchQuery() {
    }

    public SearchQuery(ColorPuppy origin, int deltaE, int samples) {
        this.origin = origin;
        this.deltaE = deltaE;
        this.samples = samples;
    }

    public ColorPuppy getOrigin() {
        return origin;
    }

    public void setOrigin(ColorPuppy origin) {
        this.origin = origin;
    }

    public int getDeltaE() {
        return deltaE;
    }

    public void setDeltaE(int deltaE) {
        this.deltaE = deltaE;
    }

    public int getSamples() {
        return samples;
    }

    public void setSamples(int samples) {
        this.samples = samples;
    }
}
