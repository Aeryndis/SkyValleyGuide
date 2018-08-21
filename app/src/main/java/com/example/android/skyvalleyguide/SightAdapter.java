package com.example.android.skyvalleyguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SightAdapter extends ArrayAdapter<Sight> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context       The current context. Used to inflate the layout file.
     * @param sights        A List of Sight objects to display in a list
     */
    public SightAdapter(Activity context, ArrayList<Sight> sights) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for four TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, sights);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position      The position in the list of data that should be displayed in the
     *                      list item view.
     * @param convertView   The recycled view to populate.
     * @param parent        The parent ViewGroup that is used for inflation.
     * @return              The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.sights_list_item, parent, false);
        }

        // Get the {@Link Sight} object located at this position in the list
        Sight currentSight = getItem(position);

        TextView sightNameTextView = listItemView.findViewById(R.id.sight_name);
        sightNameTextView.setText(currentSight.getSightName());

        TextView sightLocationTextView = listItemView.findViewById(R.id.sight_location);
        sightLocationTextView.setText(currentSight.getSightLocation());

        TextView sightTypeTextView = listItemView.findViewById(R.id.sight_type);
        sightTypeTextView.setText(currentSight.getSightType());

        TextView sightBlurbTextView = listItemView.findViewById(R.id.sight_blurb);
        sightBlurbTextView.setText(currentSight.getSightBlurb());

        // Return the whole list item layout (containing 4 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
