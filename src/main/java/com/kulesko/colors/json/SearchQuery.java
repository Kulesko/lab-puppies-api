package com.kulesko.colors.json;

public class SearchQuery {
    private ColorPuppy reference;
    private int deltaE;
    private int samples;

    public SearchQuery() {
    }

    public SearchQuery(ColorPuppy reference, int deltaE, int samples) {
        this.reference = reference;
        this.deltaE = deltaE;
        this.samples = samples;
    }

    public ColorPuppy getReference() {
        return reference;
    }

    public void setReference(ColorPuppy reference) {
        this.reference = reference;
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
