package com.example.viewpagerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.viewPager);
        ArrayList<Integer> imageList = new ArrayList<>();
        imageList.add(R.drawable.france);
        imageList.add(R.drawable.canada);
        imageList.add(R.drawable.germany);
        MyAdapter myAdapter = new MyAdapter(imageList);
        viewPager2.setAdapter(myAdapter);
    }
}