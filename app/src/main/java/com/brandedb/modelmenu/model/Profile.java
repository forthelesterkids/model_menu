package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;

public class Profile implements Comparable<Profile> {

    private Collection<Food> foods = new ArrayList<>();

    public void addFood(Food food){
        foods.add(food);
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(Food food:foods){
            builder.append(food.toString());
            builder.append(":");
        }
        return builder.toString();
    }

    @Override
    public int compareTo(@NonNull Profile other) {
        return foods.equals(other.foods) ? 0 : -1;
    }
}
