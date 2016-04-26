package com.filipkesteli.fragmenti;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class HappyFragment extends Fragment {

    private Button btnGumb;

    public HappyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_happy, container, false);

        initWidgets(v);
        setupListeners();

        return v;
    }

    private void initWidgets(View view) {
        btnGumb = (Button) view.findViewById(R.id.btnGumb);
    }


    private void setupListeners() {
        btnGumb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Booook", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
