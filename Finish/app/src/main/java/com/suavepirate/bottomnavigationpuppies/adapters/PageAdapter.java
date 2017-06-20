package com.suavepirate.bottomnavigationpuppies.adapters;

/**
 * Created by adunn on 6/18/17.
 */

import android.content.Context;
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

    private  Context context;
    public PageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PuppyListFragment.newInstance(PuppyListType.All, context);
            case 1:
                return PuppyListFragment.newInstance(PuppyListType.Big, context);
            case 2:
                return PuppyListFragment.newInstance(PuppyListType.Small, context);
            case 3:
                return PuppyListFragment.newInstance(PuppyListType.LeashTrained, context);
            case 4:
                return PuppyListFragment.newInstance(PuppyListType.Active, context);
        }
        return PuppyListFragment.newInstance(PuppyListType.All, context);
    }

    @Override
    public int getCount() {
        // Show 5 total pages.
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // return empty to show no title. Delete this line to show tab titles
        return null;
       /* switch (position) {
            case 0:
                return "All";
            case 1:
                return "Big";
            case 2:
                return "Small";
            case 3:
                return "Trained";
            case 4:
                return "Active";
        }
        return null;*/
    }

}
