package com.exclusive.original.realeaze;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter adapter;

    String [] tabTitle = new String[]{ "Overview", "Amenities", "Project View", "Reviews" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        adapter = new PagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        createCustomTab();

    }

    private void createCustomTab() {

        int tabCount = tabLayout.getTabCount();
        for(int i = 0; i< tabCount; i++){
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(R.layout.custom_tab);
            View view = tab.getCustomView();
            TextView title = view.findViewById(R.id.title);
            title.setText(tabTitle[i]);
        }

    }


}