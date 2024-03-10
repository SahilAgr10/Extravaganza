package com.example.extravaganza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class travelled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelled);

        ArrayList<String> list = new ArrayList<>();
        list.add("Mumbai");
        list.add("Kalsubai ,Nashik");
        list.add("Pune");
        list.add("Imagica Theme Park");
        list.add("Delhi");
        list.add("Haridwar");
        list.add("Rishikesh");
        list.add("Tungnath");
        list.add("Chandrashila");
        list.add("Rajgad ");
        list.add("Ratangad");



    }
}