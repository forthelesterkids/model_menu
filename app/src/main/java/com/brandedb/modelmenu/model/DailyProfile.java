package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collection;

public class DailyProfile implements Comparable<DailyProfile> {

    private Collection<Profile> profiles = new ArrayList<>();

    public void addProfile(Profile profile){
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

    @Override
    public int compareTo(@NonNull DailyProfile other) {
        return profiles.equals(other.profiles) ? 0 : -1;
    }
}
