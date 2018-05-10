package com.example.timot.assignment1;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPageAdapter extends FragmentStatePagerAdapter {

    String[] tabArray = new String[]{"View Security Report", "Create Security Reports", "Find Security Kiosk"};
    Integer tabNumber = 3;

    public TabPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabArray[position];
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                ViewReports view = new ViewReports();
                return view;


            case 1:
                CreateReport create = new CreateReport();
                return create;
            case 2:
                FindKiosk find = new FindKiosk();
                return find;


        }


        return null;
    }

    @Override
    public int getCount() {
        return tabNumber;
    }
}
