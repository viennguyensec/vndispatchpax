package com.lv.vndispatchpax.views.fagment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lv.vndispatchpax.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogBookingFragment extends Fragment {


    public LogBookingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log_booking, container, false);
    }

}
