package com.example.android.skyvalleyguide;

public class Coffee {

    /**
     * Name of coffee place
     */
    private int mCoffeeName;

    /**
     * Address of coffee place
     */
    private int mCoffeeLocation;

    /**
     * Blurb about coffee place
     */
    private int mCoffeeBlurb;

    /**
     * Create a new Coffee object
     *
     * @param name     String resource ID for the coffee place name
     * @param location String resource ID for the coffee place address
     * @param blurb    String resource ID for a blurb about the coffee place
     */

    public Coffee(int name, int location, int blurb) {
        mCoffeeName = name;
        mCoffeeLocation = location;
        mCoffeeBlurb = blurb;
    }

    public int getCoffeeName() {
        return mCoffeeName;
    }

    public int getCoffeeLocation() {
        return mCoffeeLocation;
    }

    public int getCoffeeBlurb() {
        return mCoffeeBlurb;
    }

}