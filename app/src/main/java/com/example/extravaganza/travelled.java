package com.example.extravaganza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class travelled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelled);

        ArrayList<customPlaces> lists = new ArrayList<customPlaces>();
//        customPlaces places = new customPlaces("Mumbai","12/01/2021");
//        lists.add(places);
          lists.add(new customPlaces("Mumbai","12/01/2021"));

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

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}