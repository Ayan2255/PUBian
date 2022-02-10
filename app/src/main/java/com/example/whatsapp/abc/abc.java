package com.example.whatsapp.abc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.whatsapp.Fragment.All_routine;
import com.example.whatsapp.Fragment.Day_routine;
import com.example.whatsapp.Fragment.Present_routine;

public class abc extends FragmentPagerAdapter {
    public abc(@NonNull FragmentManager fm) {
        super(fm);
    }

    public abc(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:return new Present_routine();
            case 1:return new Day_routine();
            case 2:return new All_routine();
            default:return new Present_routine();

        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;
        if (position==0){title="Chats";}
        if (position==1){title="Day Routine";}
        if (position==2){title="Routine";}
        return title;

    }
}
