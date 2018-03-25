package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;

public class DailyProfile {

    private Collection<Profile> profiles = new ArrayList<>();

    public void addProfile(@NonNull Profile profile){
        profiles.add(profile);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Profile profile:profiles){
            builder.append(profile.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

}
