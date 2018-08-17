package com.example.android.skyvalleyguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays the list of towns that make up Sky Valley, WA, USA
 */
public class TownFragment extends Fragment {

    public TownFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of towns
        final ArrayList<Town> towns = new ArrayList<>();
        towns.add(new Town(R.string.monroe_name, R.string.monroe_est_date, R.string.monroe_population, R.string.monroe_blurb));
        towns.add(new Town(R.string.sultan_name, R.string.sultan_est_date, R.string.sultan_population, R.string.sultan_blurb));
        towns.add(new Town(R.string.goldbar_name, R.string.goldbar_est_date, R.string.goldbar_population, R.string.goldbar_blurb));
        towns.add(new Town(R.string.index_name, R.string.index_est_date, R.string.index_population, R.string.index_blurb));
        towns.add(new Town(R.string.skykomish_name, R.string.skykomish_est_date, R.string.skykomish_population, R.string.skykomish_blurb));

        TownAdapter adapter = new TownAdapter(getActivity(), towns);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
