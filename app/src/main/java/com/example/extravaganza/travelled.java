package com.example.extravaganza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class travelled extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelled);

        ArrayList<CustomPlaces> lists = new ArrayList<CustomPlaces>();
//        customPlaces places = new customPlaces("Mumbai","12/01/2021");
//        lists.add(places);
          lists.add(new CustomPlaces("Mumbai","12/01/2021"));

        ArrayList<CustomPlaces> list = new ArrayList<>();
        list.add(new CustomPlaces("Mumbai","12/01/21"));
        list.add(new CustomPlaces("Kalsubai Hike","12/01/21"));
        list.add(new CustomPlaces("Pune ","12/01/21"));
        list.add(new CustomPlaces("Delhi","12/01/21"));
        list.add(new CustomPlaces("Haridwar","12/01/21"));
        list.add(new CustomPlaces("Rishikesh","12/01/21"));
        list.add(new CustomPlaces("Tungnath","12/01/21"));
        list.add(new CustomPlaces("Chandrashila Trek","12/01/21"));
        list.add(new CustomPlaces("Imagica Theme park","12/01/21"));
        list.add(new CustomPlaces("Ratangad Trek","12/01/21"));
        list.add(new CustomPlaces("Rajasthan Trek","12/01/21"));

        CustomAdapter adapter = new CustomAdapter(this,list);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);



    }
}