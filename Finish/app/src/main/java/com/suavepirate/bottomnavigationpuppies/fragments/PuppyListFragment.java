package com.suavepirate.bottomnavigationpuppies.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.suavepirate.bottomnavigationpuppies.R;
import com.suavepirate.bottomnavigationpuppies.adapters.PuppyAdapter;
import com.suavepirate.bottomnavigationpuppies.models.Puppy;
import com.suavepirate.bottomnavigationpuppies.models.PuppyFactory;
import com.suavepirate.bottomnavigationpuppies.models.PuppyListType;

import java.util.ArrayList;

/**
 * Created by adunn on 6/18/17.
 */

public class PuppyListFragment extends Fragment {

    private static final String ARG_LIST_TYPE = "LIST_TYPE";
    private PuppyFactory puppyFactory;
    private Context context;
    public PuppyListFragment(Context context) {
        puppyFactory = new PuppyFactory(context);
        this.context = context;
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PuppyListFragment newInstance(PuppyListType listType, Context context) {
        PuppyListFragment fragment = new PuppyListFragment(context);
        Bundle args = new Bundle();
        args.putSerializable(ARG_LIST_TYPE, listType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        RecyclerView recyclerView = (RecyclerView)rootView.findViewById(R.id.puppyRecyclerView);
        PuppyListType listType = (PuppyListType)getArguments().getSerializable(ARG_LIST_TYPE);
        ArrayList<Puppy> puppies = new ArrayList<Puppy>();
        switch(listType){
            case All: puppies = puppyFactory.getPuppies();
                break;
            case Active: puppies = puppyFactory.getActivePuppies();
                break;
            case LeashTrained: puppies = puppyFactory.getLeashTrainedPuppies();
                break;
            case Big: puppies = puppyFactory.getBigPuppies();
                break;
            case Small: puppies = puppyFactory.getSmallPuppies();
                break;
        }

        recyclerView.setAdapter(new PuppyAdapter(puppies));
        recyclerView.setLayoutManager(new LinearLayoutManager(this.context));
        return rootView;
    }
}
