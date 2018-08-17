package com.example.android.skyvalleyguide;

public class Food {

    /** Name of food place */
    private int mFoodName;

    /** Address of food place */
    private int mFoodLocation;

    /** Blurb about food place */
    private int mFoodBlurb;

    /** Website for food place */
    private int mFoodUrl;

    /**
     * Create a new Sight object
     *
     * @param name          String resource ID for the food place name
     * @param location      String resource ID for the food place address
     * @param blurb         String resource ID for a blurb about the food place
     * @param url           String resource iD for the food place website URL
     */

    public Food(int name, int location, int blurb, int url) {
        mFoodName = name;
        mFoodLocation = location;
        mFoodBlurb = blurb;
        mFoodUrl = url;
    }

    public int getFoodName() {
        return mFoodName;
    }

    public int getFoodLocation() {
        return mFoodLocation;
    }

    public int getFoodBlurb() {
        return mFoodBlurb;
    }

    public int getFoodUrl() {
        return mFoodUrl;
    }
}