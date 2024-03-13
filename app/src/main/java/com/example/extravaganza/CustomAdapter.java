package com.example.extravaganza;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<CustomPlaces> {
    public CustomAdapter(@NonNull Context context, ArrayList<CustomPlaces> customPlaces) {
        super(context, 0, customPlaces);
    }@Override
    public View getView(int position,View convertView,ViewGroup parent){
        View ListItemView = convertView;
        if(ListItemView==null){
            ListItemView = LayoutInflater.from(getContext()).inflate(R.layout.travel_layout,parent,false);
        } CustomPlaces customPlaces = getItem(position);

        TextView places = (TextView) ListItemView.findViewById(R.id.place_view);
        places.setText(customPlaces.getPlace());

        TextView defaultTextView = (TextView) ListItemView.findViewById(R.id.date_view);
        defaultTextView.setText(customPlaces.getDate());

        return ListItemView;
    }
}
