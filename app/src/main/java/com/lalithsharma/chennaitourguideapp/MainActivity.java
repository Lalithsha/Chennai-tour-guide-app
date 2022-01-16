package com.lalithsharma.chennaitourguideapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;


import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;
import com.lalithsharma.chennaitourguideapp.View_Pager_Fragments.attraction_fragment;

public class MainActivity extends AppCompatActivity {

    TabLayout mTabLayout;
    ViewPager2 mPager2;
    fragments_Adapter adapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTabLayout = findViewById(R.id.tab_layout);
        mPager2 = findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new fragments_Adapter(fm,getLifecycle());
        mPager2.setAdapter(adapter);

       /* mTabLayout= findViewById(R.id.tab_layout);
        mTabLayout.setupWithViewPager(viewPager);*/


        mTabLayout.addTab(mTabLayout.newTab().setText("Attractions"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Restaurants"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Events"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Hotels"));

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mTabLayout.selectTab(mTabLayout.getTabAt(position));
            }
        });

    //    getSupportFragmentManager().beginTransaction().replace(R.id.container,new attraction_fragment()).commit();


    }
}