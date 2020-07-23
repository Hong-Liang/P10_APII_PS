package com.myapplicationdev.android.p10_apii_ps;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class Frag2 extends Fragment {

    Button btnCG2;
    LinearLayout ly2;

    public Frag2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

            btnCG2 = view.findViewById(R.id.btnCG2);
            ly2 = view.findViewById(R.id.ly2);

            btnCG2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Random rnd = new Random();
                    int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                    ly2.setBackgroundColor(color);
                }
            });
        return view;
    }
}
