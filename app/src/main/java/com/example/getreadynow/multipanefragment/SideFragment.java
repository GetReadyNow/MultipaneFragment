package com.example.getreadynow.multipanefragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by AlHassaneAgne on 1/26/16.
 */
public class SideFragment extends android.app.Fragment {
    @Nullable
    @Override
    //Create a view for the side panel
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_side_panel, container, false);
        return view;
    }
}