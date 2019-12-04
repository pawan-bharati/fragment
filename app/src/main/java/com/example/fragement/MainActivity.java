package com.example.fragement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragement.fragments.AddFragment;
import com.example.fragement.fragments.FirstFragment;
import com.example.fragement.fragments.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFragment;
    private Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFragment = findViewById(R.id.btnfragment);
        btnFragment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (status) {
            AddFragment addFragment = new AddFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, addFragment);

            fragmentTransaction.commit();
            btnFragment.setText("Load Second Fragment");
            status = false;
        } else {
            SecondFragment secondFragment = new SecondFragment();
            fragmentTransaction.replace(R.id.fragmentContainer, secondFragment);
            fragmentTransaction.commit();
            btnFragment.setText("Load First Fragment");
            status = true;
        }
    }
}