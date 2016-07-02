package com.nashipaechepkurui.tabs2;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdaptor viewPagerAdaptor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        tabLayout= (TabLayout) findViewById(R.id.tablayout);
        viewPager= (ViewPager)findViewById(R.id.viewpager);
        viewPagerAdaptor = new ViewPagerAdaptor(getSupportFragmentManager());
        viewPagerAdaptor.addFragments(new HomeFragment(),"Home");
        viewPagerAdaptor.addFragments(new TopFreeFragment(),"Top Free");
        viewPagerAdaptor.addFragments(new TopPaidFragment(),"Top Paid");
        viewPager.setAdapter(viewPagerAdaptor);
        tabLayout.setupWithViewPager(viewPager);






    }
}
