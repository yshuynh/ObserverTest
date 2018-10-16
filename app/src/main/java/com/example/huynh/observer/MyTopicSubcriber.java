package com.example.huynh.observer;

import android.util.Log;

import com.example.huynh.observer.Observer.Observer;
import com.example.huynh.observer.Observer.Subject;

public class MyTopicSubcriber implements Observer{

    private Subject topic;
    private String name;

    public MyTopicSubcriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        Log.d("AAA", name + ": " + msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
