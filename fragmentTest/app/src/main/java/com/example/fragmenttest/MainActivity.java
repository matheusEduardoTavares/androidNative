package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ItemOneFragment myFirstFragment;
    ItemTwoFragment myTwoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFirstFragment =  new ItemOneFragment();
        myTwoFragment = new ItemTwoFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frameLayout, myFirstFragment);

        transaction.commit();
    }

    public void firstItem(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frameLayout, myFirstFragment);
        transaction.commit();
    }

    public void secondItem(View view) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        transaction.replace(R.id.frameLayout, myTwoFragment);
        transaction.commit();
    }
}