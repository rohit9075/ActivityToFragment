package com.rohit.android.activitytofragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleFragment extends Fragment {
    public static final String MESSAGE_KEY = "message_key";

    public SimpleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple, container, false);

        // getting the bundle argumnet
        Bundle arguments = getArguments();
        if (arguments != null) {

            // getting the string from the bundle arguments using key
            String message = arguments.getString(MESSAGE_KEY);

            // getting the reference of the textview
            TextView tvMessage = view.findViewById(R.id.message);

            // setting the sting into the textview.
            tvMessage.setText(message);

        }


        return view;
    }

}
