package com.example.android.skyvalleyguide;

public class Food {

    /** Name of food place */
    private int mFoodName;

    /** Address of food place */
    private int mFoodLocation;

    /** Blurb about food place */
    private int mFoodBlurb;

    /**
     * Image thumbnail for the food place
     */
    private int mFoodThumb;

    /** Website for food place */
    private int mFoodUrl;

    /**
     * Create a new Food object
     *
     * @param name          String resource ID for the food place name
     * @param location      String resource ID for the food place address
     * @param blurb         String resource ID for a blurb about the food place
     * @param thumb         String resource ID for a thumbnail of the food place
     * @param url           String resource iD for the food place website URL
     */

    public Food(int name, int location, int blurb, int thumb, int url) {
        mFoodName = name;
        mFoodLocation = location;
        mFoodBlurb = blurb;
        mFoodThumb = thumb;
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

    public int getFoodThumb() {
        return mFoodThumb;
    }

    public int getFoodUrl() {
        return mFoodUrl;
    }
}