package com.example.android.skyvalleyguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link Fragment} for the Food screen
 */
public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of foods
        final ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food(R.string.monroe_food_1, R.string.monroe_food_location_1, R.string.monroe_food_blurb_1, R.string.monroe_food_url_1));
        foods.add(new Food(R.string.monroe_food_2, R.string.monroe_food_location_2, R.string.monroe_food_blurb_2, R.string.monroe_food_url_2));
        foods.add(new Food(R.string.sultan_food_1, R.string.sultan_food_location_1, R.string.sultan_food_blurb_1, R.string.sultan_food_url_1));
        foods.add(new Food(R.string.sultan_food_2, R.string.sultan_food_location_2, R.string.sultan_food_blurb_2, R.string.sultan_food_url_2));
        foods.add(new Food(R.string.goldbar_food_1, R.string.goldbar_food_location_1, R.string.goldbar_food_blurb_1, R.string.goldbar_food_1));
        foods.add(new Food(R.string.index_food_1, R.string.index_food_location_1, R.string.index_food_blurb_1, R.string.index_food_url_1));
        foods.add(new Food(R.string.skykomish_food_1, R.string.skykomish_food_location_1, R.string.skykomish_food_blurb_1, R.string.skykomish_food_url_1));

        FoodAdapter adapter = new FoodAdapter(getActivity(), foods);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
