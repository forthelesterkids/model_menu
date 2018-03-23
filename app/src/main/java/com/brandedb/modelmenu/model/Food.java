package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

public class Food implements Comparable<Food> {

    private final String name;

    public Food(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Name:" + name;
    }

    @Override
    public int compareTo(@NonNull Food other) {
        return name.compareTo(other.name);
    }
}
