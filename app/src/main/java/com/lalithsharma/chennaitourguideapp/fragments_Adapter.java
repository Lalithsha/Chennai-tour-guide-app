package com.lalithsharma.chennaitourguideapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.lalithsharma.chennaitourguideapp.View_Pager_Fragments.attraction_fragment;
import com.lalithsharma.chennaitourguideapp.View_Pager_Fragments.event_fragment;
import com.lalithsharma.chennaitourguideapp.View_Pager_Fragments.hotels_fragment;
import com.lalithsharma.chennaitourguideapp.View_Pager_Fragments.restaurants_fragment;

public class fragments_Adapter extends FragmentStateAdapter {
    public fragments_Adapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }


    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 1:
                return new restaurants_fragment();
            case 2:
                return new event_fragment();
            case 3:
                return new hotels_fragment();
        }
        return new attraction_fragment();

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
