package com.suavepirate.bottomnavigationpuppies.adapters;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.ViewGroup;
import java.util.ArrayList;

import com.suavepirate.bottomnavigationpuppies.models.Puppy;
import com.suavepirate.bottomnavigationpuppies.models.PuppyHolder;

/**
 * Created by adunn on 6/18/17.
 */

public class PuppyAdapter extends Adapter<PuppyHolder> {
    private ArrayList<Puppy> puppies;

    public PuppyAdapter (ArrayList<Puppy> puppies){
        this.puppies = puppies;
    }

    @Override
    public PuppyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new PuppyHolder(parent);
    }

    @Override
    public void onBindViewHolder(PuppyHolder holder, int position) {
        holder.updateWithPuppy(puppies.get(position));
    }

    @Override
    public int getItemCount() {
        return puppies.toArray().length;
    }
}
