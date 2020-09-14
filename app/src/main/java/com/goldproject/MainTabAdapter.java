package com.goldproject;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MainTabAdapter extends FragmentPagerAdapter {
    private static final int[] TAB_TITLES = new int[]{R.string.live_bhaw, R.string.contact, R.string.mcx, R.string.bank, R.string.gallery};
    private Context mContext;

    public MainTabAdapter(Context context, FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return LiveBhawFragment.newInstance(1);
            case 1:
                return ContactFragment.newInstance(1);
            case 2:
                return MCXFragment.newInstance(1);
            case 3:
                return BankFragment.newInstance(1);
            case 4:
                return GalleryFragment.newInstance(1);
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }
}
