package com.example.phiiphiroberts.megasave;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.phiiphiroberts.megasave.Fragments.DownlinerFragment;
import com.example.phiiphiroberts.megasave.Fragments.HomeFragment;
import com.example.phiiphiroberts.megasave.Fragments.TransactionFragment;

public class tabPager extends FragmentStatePagerAdapter {

    String[] titles = new String[]{"HOME","DOWNLINER","TRANSACTION"};

    public tabPager(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
            case 1:
                DownlinerFragment downlinerFragment = new DownlinerFragment();
                return downlinerFragment;
            case 2:
                TransactionFragment transactionFragment = new TransactionFragment();
                return transactionFragment;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
