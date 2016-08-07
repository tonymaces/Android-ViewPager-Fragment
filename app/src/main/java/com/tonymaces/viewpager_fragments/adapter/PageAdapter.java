package com.tonymaces.viewpager_fragments.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Tony Macavilca Estrada on 06/08/2016.
 * esta clase sirve para unir los Fragmes.
 * El PageAdapter es como si estubiera viendo los Fragmes.
 */
public class PageAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> mFragments;

    public PageAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.mFragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
