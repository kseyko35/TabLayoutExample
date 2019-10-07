package com.example.tablayoutexample;

import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {
    @BindView(R.id.tablayout)
    TabLayout mTablayout;
    @BindView(R.id.viewPager)
    ViewPager mViewPager;

    PagerAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        mPagerAdapter = new PageAdapter(getSupportFragmentManager(), mTablayout.getTabCount());
        mViewPager.setAdapter(mPagerAdapter);

        mTablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 1) {

                    mTablayout.setBackgroundColor(ContextCompat.getColor(getBaseContext(),
                            R.color.colorAccent));

                } else if (tab.getPosition() == 2) {

                    mTablayout.setBackgroundColor(ContextCompat.getColor(getBaseContext(),
                            android.R.color.darker_gray));

                } else {

                    mTablayout.setBackgroundColor(ContextCompat.getColor(getBaseContext(),
                            R.color.colorPrimary));

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
