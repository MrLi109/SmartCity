package com.example.utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentPager extends FragmentPagerAdapter {

    private final ArrayList<Fragment> list;

    public FragmentPager(@NonNull FragmentManager fm, ArrayList<Fragment> list) {
        super(fm);
        this.list=list;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}