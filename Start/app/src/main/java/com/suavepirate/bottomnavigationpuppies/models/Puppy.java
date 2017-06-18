package com.suavepirate.bottomnavigationpuppies.models;

import android.graphics.drawable.Drawable;

/**
 * Created by adunn on 6/15/17.
 *
 * Data model for a Puppy
 */

public class Puppy {
    public String name;
    public String description;
    public Drawable imageFile;
    public boolean isFullGrown;

    public Puppy(String name, String description, Drawable imageFile, boolean isFullGrown){
        this.name = name;
        this.description = description;
        this.imageFile = imageFile;
        this.isFullGrown = isFullGrown;
    }
}
