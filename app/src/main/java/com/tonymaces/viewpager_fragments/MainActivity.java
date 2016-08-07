package com.tonymaces.viewpager_fragments;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tonymaces.viewpager_fragments.adapter.PageAdapter;
import com.tonymaces.viewpager_fragments.fragment.LeftFragment;
import com.tonymaces.viewpager_fragments.fragment.RightFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mTabLayout = (TabLayout) findViewById(R.id.tabLayout);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);

        setupViewPager();

        if (mToolbar != null){
            setSupportActionBar(mToolbar);
        }

    }

    private  ArrayList<Fragment> GetFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new LeftFragment());
        fragments.add(new RightFragment());
        return  fragments;
    }

    //pone en orvita los fragmes
    private  void  setupViewPager(){
        mViewPager.setAdapter(new PageAdapter(getSupportFragmentManager(),GetFragments()));
        mTabLayout.setupWithViewPager(mViewPager);

        mTabLayout.getTabAt(0).setIcon(R.drawable.ic_action_car);
        mTabLayout.getTabAt(1).setIcon(R.drawable.ic_action_import);
    }


}
