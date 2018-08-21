package com.example.android.skyvalleyguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} for the Coffee screen
 */
public class CoffeeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of coffees
        final ArrayList<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(R.string.monroe_coffee_1, R.string.monroe_coffee_location_1,
                R.string.monroe_coffee_blurb_1));
        coffees.add(new Coffee(R.string.sultan_coffee_1, R.string.sultan_coffee_location_1,
                R.string.sultan_coffee_blurb_1));
        coffees.add(new Coffee(R.string.goldbar_coffee_1, R.string.goldbar_coffee_location_1,
                R.string.goldbar_coffee_blurb_1));
        coffees.add(new Coffee(R.string.index_coffee_1, R.string.index_coffee_location_1,
                R.string.index_coffee_blurb_1));

        CoffeeAdapter adapter = new CoffeeAdapter(getActivity(), coffees);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
