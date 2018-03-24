package com.brandedb.modelmenu.model;


import android.support.annotation.NonNull;

import java.util.Objects;

public class QualifyingEvent {

    private final String eventName;

    public QualifyingEvent(String eventName){
        this.eventName = eventName;
    }

    @Override
    public boolean equals(@NonNull Object object){
        if(object == null){
            return false;
        }

        return object instanceof QualifyingEvent ? eventName.equalsIgnoreCase(((QualifyingEvent)object).eventName) : false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(eventName);
    }
}
