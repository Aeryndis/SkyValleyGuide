package com.example.android.skyvalleyguide;

public class Sight {

    /** Sight name */
    private int mSightName;

    /** Sight location */
    private int mSightLocation;

    /** Type of sight (walk, hike, point of interest */
    private int mSightType;

    /** Blurb about the sight */
    private int mSightBlurb;

    /**
     * Create a new Sight object
     *
     * @param name          String resource ID for the sight name
     * @param location      String resource ID for the sight location
     * @param type          String resource ID for the sight type
     * @param blurb         String resource iD for a blurb about the sight
     */

    public Sight(int name, int location, int type, int blurb) {
        mSightName = name;
        mSightLocation = location;
        mSightType = type;
        mSightBlurb = blurb;
    }

    public int getSightName() {
        return mSightName;
    }

    public int getSightLocation() {
        return mSightLocation;
    }

    public int getSightType() {
        return mSightType;
    }

    public int getSightBlurb() {
        return mSightBlurb;
    }
}