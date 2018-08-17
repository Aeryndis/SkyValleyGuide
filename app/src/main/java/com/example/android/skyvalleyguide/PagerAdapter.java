package com.example.android.skyvalleyguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    /** Context of the app */
    private Context mContext;

    /**
     * Create a new {@Link PagerAdapter} object.
     *
     * @param context is the context of the app
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     */
    public PagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new TownFragment();
        } else if (position == 1) {
            return new SightsFragment();
        } else if (position == 2){
            return new FoodFragment();
        } else {
            return new CoffeeFragment();
        }
    }

    /**
     *
     * @param position is the page number
     * @return the name of the page for any given position
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.town_fragment);
        } else if (position == 1) {
            return mContext.getString(R.string.sights_fragment);
        } else if (position == 2) {
            return mContext.getString(R.string.food_fragment);
        } else {
            return mContext.getString(R.string.coffee_fragment);
        }
    }

    /**
     *
     * @return the total number of pages
     */
    @Override
    public int getCount() {
        return 4;
    }
}
