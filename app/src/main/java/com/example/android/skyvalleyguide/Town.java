package com.example.android.skyvalleyguide;

public class Town {

    /** Town name */
    private int mTownName;

    /** Date town established */
    private int mEstDate;

    /** Population of town */
    private int mPopulation;

    /** Blurb about town */
    private int mTownBlurb;

    /**
     * Create a new Town object
     *
     * @param name          String resource ID for the town name
     * @param established   String resource ID for the town establishment date
     * @param population    String resource ID for the town population
     * @param blurb         String resource iD for a blurb about the town
     */

    public Town(int name, int established, int population, int blurb) {
        mTownName = name;
        mEstDate = established;
        mPopulation = population;
        mTownBlurb = blurb;
    }

    public int getTownName() {
        return mTownName;
    }

    public int getEstDate() {
        return mEstDate;
    }

    public int getPopulation() {
        return mPopulation;
    }

    public int getTownBlurb() {
        return mTownBlurb;
    }
}
