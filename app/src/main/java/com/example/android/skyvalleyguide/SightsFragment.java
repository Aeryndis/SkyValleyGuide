package com.example.android.skyvalleyguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A {@link Fragment} that displays a list of sights in Sky Valley, WA, USA
 */
public class SightsFragment extends Fragment {

    public SightsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        // Create a list of sights
        final ArrayList<Sight> sights = new ArrayList<>();
        sights.add(new Sight(R.string.monroe_sight_1, R.string.monroe_sight_location_1, R.string.monroe_sight_type_1, R.string.monroe_sight_blurb_1));
        sights.add(new Sight(R.string.monroe_sight_2, R.string.monroe_sight_location_2, R.string.monroe_sight_type_2, R.string.monroe_sight_blurb_2));
        sights.add(new Sight(R.string.sultan_sight_1, R.string.sultan_sight_location_1, R.string.sultan_sight_type_1, R.string.sultan_sight_blurb_1));
        sights.add(new Sight(R.string.sultan_sight_2, R.string.sultan_sight_location_2, R.string.sultan_sight_type_2, R.string.sultan_sight_blurb_2));
        sights.add(new Sight(R.string.goldbar_sight_1, R.string.goldbar_sight_location_1, R.string.goldbar_sight_type_1, R.string.goldbar_sight_blurb_1));
        sights.add(new Sight(R.string.index_sight_1, R.string.index_sight_location_1, R.string.index_sight_type_1, R.string.index_sight_blurb_1));
        sights.add(new Sight(R.string.skykomish_sight_1, R.string.skykomish_sight_location_1, R.string.skykomish_sight_type_1, R.string.skykomish_sight_blurb_1));

        SightAdapter adapter = new SightAdapter(getActivity(), sights);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
