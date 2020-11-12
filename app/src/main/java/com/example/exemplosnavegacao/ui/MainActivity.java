package com.example.exemplosnavegacao.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.exemplosnavegacao.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonFragmentA;
    private Button buttonFragmentB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentA fragmentA = new FragmentA();
//        FragmentManager manager = getSupportFragmentManager();
//        FragmentTransaction transaction = manager.beginTransaction();
//        transaction.add(R.id.fragment_container,fragmentA);
//        transaction.commit();

        clickButton();

    }

    private void clickButton() {
        buttonFragmentA = findViewById(R.id.buttonA);
        buttonFragmentB = findViewById(R.id.buttonB);

        buttonFragmentA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentA fragmentA = new FragmentA();
                trocaFragment(fragmentA);

            }
        });

        buttonFragmentB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentB fragmentB = new FragmentB();
                trocaFragment(fragmentB);
            }
        });
    }

    void trocaFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.commit();
    }
}






