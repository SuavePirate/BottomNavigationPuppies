package com.suavepirate.bottomnavigationpuppies.adapters;

/**
 * Created by adunn on 6/18/17.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.suavepirate.bottomnavigationpuppies.activities.MainActivity;
import com.suavepirate.bottomnavigationpuppies.fragments.PuppyListFragment;
import com.suavepirate.bottomnavigationpuppies.models.PuppyListType;

/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class PageAdapter extends FragmentPagerAdapter {

    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PuppyListFragment.newInstance(PuppyListType.All);
            case 1:
                return PuppyListFragment.newInstance(PuppyListType.Big);
            case 2:
                return PuppyListFragment.newInstance(PuppyListType.Small);
            case 3:
                return PuppyListFragment.newInstance(PuppyListType.LeashTrained);
            case 4:
                return PuppyListFragment.newInstance(PuppyListType.Active);
        }
        return PuppyListFragment.newInstance(PuppyListType.All);
    }

    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "All";
            case 1:
                return "Big";
            case 2:
                return "Small";
            case 3:
                return "Leash Trained";
            case 4:
                return "Active";
        }
        return null;
    }
}
