package com.example.fragement.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.fragement.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment implements View.OnClickListener{
private Button btncalc;
private EditText etfirst,etsecond;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_add, container, false);
        etfirst = view.findViewById(R.id.etfirst);
        etsecond = view.findViewById(R.id.etsecond);
        btncalc = view.findViewById(R.id.btncalc);

        btncalc.setOnClickListener(this);
        return view;
    }
            @Override
            public void onClick(View v) {
               int first = Integer.parseInt(etfirst.getText().toString());
               int second =Integer.parseInt(etsecond.getText().toString());
               int result = first+second;

                Toast.makeText((getActivity()), "Sum is :" + result, Toast.LENGTH_SHORT).show();
            }
        }

