package com.brandedb.modelmenu.model;


import android.support.annotation.NonNull;

import org.joda.time.Instant;

import java.util.Objects;

public class QualifyingEvent {

    private final String eventName;
    private final Instant instant;

    public QualifyingEvent(String eventName, Instant instant){
        this.eventName = eventName;
        this.instant = instant;
    }

    @Override
    public boolean equals(@NonNull Object object){
        if(object == null){
            return false;
        }
        else if (object instanceof QualifyingEvent){
            QualifyingEvent qualifyingEvent = (QualifyingEvent)object;
            return (qualifyingEvent.instant.equals(instant) && qualifyingEvent.eventName.equalsIgnoreCase(eventName));
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(eventName, instant);
    }
}
