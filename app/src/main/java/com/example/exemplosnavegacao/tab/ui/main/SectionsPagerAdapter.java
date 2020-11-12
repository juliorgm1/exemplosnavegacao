package com.example.exemplosnavegacao.tab.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.exemplosnavegacao.R;
import com.example.exemplosnavegacao.ui.FragmentA;
import com.example.exemplosnavegacao.ui.FragmentB;
import com.example.exemplosnavegacao.ui.FragmentC;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1
            , R.string.tab_text_2
            , R.string.tab_text_3};
    public static final int TAB_2 = 1;
    public static final int TAB_3 = 2;

    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case TAB_2: return new FragmentB();
            case TAB_3: return new FragmentC();
            default:return new FragmentA();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}