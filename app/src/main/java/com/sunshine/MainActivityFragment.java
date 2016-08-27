package com.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecast = {
                "Today - Sunny - 88/51",
                "Today - Sunny - 88/51",
                "Today - Sunny - 88/51",
                "Today - Sunny - 88/51",
                "Today - Sunny - 88/51"
        };



        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                        getActivity(),
                        R.layout.list_item_forecast,
                        R.id.list_item_forecast_textview,
                        forecast);
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView lv = (ListView) rootView.findViewById(R.id.listview_forecast);
        lv.setAdapter(adapter);

        return rootView;
    }
}
