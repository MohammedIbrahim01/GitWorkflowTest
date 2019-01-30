package com.abdelazim.x.gitworkflowtest.apartment_details;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.abdelazim.x.gitworkflowtest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApartemtFragment extends Fragment {


    EditText editText;

    public ApartemtFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_apartemt, container, false);


    }

}
