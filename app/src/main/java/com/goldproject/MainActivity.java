package com.goldproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private ViewPager mVpMain;
    private TabLayout mTlMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTlMain = findViewById(R.id.tl_main);
        mVpMain = findViewById(R.id.vp_main);

        MainTabAdapter adapter = new MainTabAdapter(this, getSupportFragmentManager());
        mVpMain.setAdapter(adapter);
        mTlMain.setupWithViewPager(mVpMain);
    }
}