package com.brandedb.modelmenu.model;

import android.support.annotation.NonNull;

import java.util.Objects;

public class Food {

    private final String name;

    public Food(String name){

        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(@NonNull Object object){
        if (object == null) {
            return false;
        }
        return object instanceof Food ? name.equalsIgnoreCase(((Food)object).name) : false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}
