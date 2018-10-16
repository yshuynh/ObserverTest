package com.example.huynh.observer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyTopic myTopic = new MyTopic();
        MyTopicSubcriber sub1 = new MyTopicSubcriber("sub1");
        MyTopicSubcriber sub2 = new MyTopicSubcriber("sub2");
        myTopic.register(sub1);
        myTopic.register(sub2);

        myTopic.PostMessage("ABC");
        myTopic.PostMessage("BBB");
    }
}
