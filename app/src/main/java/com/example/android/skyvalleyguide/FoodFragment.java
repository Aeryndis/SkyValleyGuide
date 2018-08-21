package com.example.android.skyvalleyguide;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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
        foods.add(new Food(R.string.monroe_food_1, R.string.monroe_food_location_1,
                R.string.monroe_food_blurb_1, R.drawable.mi_tierra, R.string.monroe_food_url_1));
        foods.add(new Food(R.string.monroe_food_2, R.string.monroe_food_location_2,
                R.string.monroe_food_blurb_2, R.drawable.benjarong, R.string.monroe_food_url_2));
        foods.add(new Food(R.string.sultan_food_1, R.string.sultan_food_location_1,
                R.string.sultan_food_blurb_1, R.drawable.timbermonster, R.string.sultan_food_url_1));
        foods.add(new Food(R.string.sultan_food_2, R.string.sultan_food_location_2,
                R.string.sultan_food_blurb_2, R.drawable.vicksburger, R.string.sultan_food_url_2));
        foods.add(new Food(R.string.goldbar_food_1, R.string.goldbar_food_location_1,
                R.string.goldbar_food_blurb_1, R.drawable.zekesdrivein, R.string.goldbar_food_url_1));
        foods.add(new Food(R.string.index_food_1, R.string.index_food_location_1,
                R.string.index_food_blurb_1, R.drawable.riverhouse, R.string.index_food_url_1));
        foods.add(new Food(R.string.skykomish_food_1, R.string.skykomish_food_location_1,
                R.string.skykomish_food_blurb_1, R.drawable.cascadia, R.string.skykomish_food_url_1));

        FoodAdapter adapter = new FoodAdapter(getActivity(), foods);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Set a click listener to open a link when a list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                // Get the {@Link Food} object at the position the user clicked on
                Food food = foods.get(position);
                String url = getString(food.getFoodUrl());
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);
            }
        });
        return rootView;
    }
}
