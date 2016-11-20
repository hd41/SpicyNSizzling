package com.example.lenovopc.spicynsizzling;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by lenovo Pc on 8/28/2016.
 */
public class fragmentPageAdapter extends FragmentPagerAdapter {

    public fragmentPageAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }

    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        switch(arg0){
            case 0:
                return new starters();
            case 1:
                return new main_course();
            case 2:
                return new desserts();
            default:
                break;
        }
        return null;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3;
    }

}
