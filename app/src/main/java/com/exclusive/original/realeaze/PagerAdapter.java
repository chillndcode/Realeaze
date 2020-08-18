package com.exclusive.original.realeaze;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.exclusive.original.realeaze.Fragments.AmenitiesFragment;
import com.exclusive.original.realeaze.Fragments.OverviewFragment;
import com.exclusive.original.realeaze.Fragments.ProjectViewFragment;
import com.exclusive.original.realeaze.Fragments.ReviewFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new OverviewFragment();
        }else if(position == 1){
            return new AmenitiesFragment();
        }else if(position == 2){
            return new ProjectViewFragment();
        }else if(position == 3){
            return new ReviewFragment();
        }
        return null;
    }



    @Override
    public int getCount() {
        return 4;
    }
}
