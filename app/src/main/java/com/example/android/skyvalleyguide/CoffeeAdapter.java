package com.example.android.skyvalleyguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeAdapter extends ArrayAdapter<Coffee> {

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param coffees A List of Food objects to display in a list
     */
    public CoffeeAdapter(Activity context, ArrayList<Coffee> coffees) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, coffees);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.coffee_list_item, parent, false);
        }

        // Get the {@Link Coffee} object located at this position in the list
        Coffee currentCoffee = getItem(position);

        TextView coffeeNameTextView = listItemView.findViewById(R.id.coffee_name);
        coffeeNameTextView.setText(currentCoffee.getCoffeeName());

        TextView coffeeLocationTextView = listItemView.findViewById(R.id.coffee_location);
        coffeeLocationTextView.setText(currentCoffee.getCoffeeLocation());

        TextView coffeeBlurbTextView = listItemView.findViewById(R.id.coffee_blurb);
        coffeeBlurbTextView.setText(currentCoffee.getCoffeeBlurb());

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
