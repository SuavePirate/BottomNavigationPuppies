package com.suavepirate.bottomnavigationpuppies.models;

import  com.suavepirate.bottomnavigationpuppies.R;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by adunn on 6/18/17.
 */

public class PuppyHolder extends RecyclerView.ViewHolder {
    private ImageView puppyImage;
    private TextView puppyName;
    public PuppyHolder(View itemView) {
        super(itemView);
        puppyImage = (ImageView)itemView.findViewById(R.id.puppyImageView);
        puppyName = (TextView)itemView.findViewById(R.id.puppyTextView);
    }

    public void updateWithPuppy(Puppy puppy){
        puppyImage.setImageDrawable(puppy.imageFile);
        puppyName.setText(puppy.name);
    }
}
