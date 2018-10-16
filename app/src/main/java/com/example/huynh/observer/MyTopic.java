package com.example.huynh.observer;

import com.example.huynh.observer.Observer.Observer;
import com.example.huynh.observer.Observer.Subject;

import java.util.ArrayList;

public class MyTopic implements Subject {

    private ArrayList<Observer> observerList;
    private String message;

    public MyTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        if (!observerList.contains(obj)) {
            observerList.add(obj);
            obj.setSubject(this);
        }
    }

    @Override
    public void unregister(Observer obj) {
        if (observerList.contains(obj)) {
            observerList.remove(obj);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer obj : observerList) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void PostMessage(String msg) {
        this.message = msg;
        notifyObservers();
    }
}
