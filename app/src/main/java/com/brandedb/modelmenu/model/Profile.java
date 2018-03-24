package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;

public class Profile {

    private Collection<Food> foods = new ArrayList<>();

    public void addFood(Food food){
        foods.add(food);
    }

    public Collection<Food> getFoods(){
        return foods;
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

}
