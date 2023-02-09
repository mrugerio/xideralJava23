package com.java.academy.finalproject.rest.observer;

import com.java.academy.finalproject.rest.entities.AcademyFormData;


import java.util.ArrayList;


public class DataObserved {

    protected ArrayList<DataObserver> dataObservers;

    public DataObserved(){
        this.dataObservers = new ArrayList<>();
    }

    public void addObserver(DataObserver dataObserver){
        this.dataObservers.add(dataObserver);
    }

    public void removeObserver(DataObserver dataObserver){
        this.dataObservers.remove(dataObserver);
    }

    public void notifyObservers(AcademyFormData academyFormData){
        for (DataObserver dataObserver : dataObservers) {
            dataObserver.update(academyFormData);
        }
    }

}
