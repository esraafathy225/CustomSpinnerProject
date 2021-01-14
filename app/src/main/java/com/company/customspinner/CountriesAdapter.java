package com.company.customspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CountriesAdapter extends ArrayAdapter<Country> {

    public CountriesAdapter(@NonNull Context context, @NonNull List<Country> objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner,parent,false);

        TextView textView=convertView.findViewById(R.id.txt);
        ImageView imageView=convertView.findViewById(R.id.img);

        Country country=getItem(position);

        textView.setText(country.getCountry());
        imageView.setImageResource(country.getImageId());

        return convertView;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner,parent,false);

        TextView textView=convertView.findViewById(R.id.txt);
        ImageView imageView=convertView.findViewById(R.id.img);

        Country country=getItem(position);

        textView.setText(country.getCountry());
        imageView.setImageResource(country.getImageId());

        return convertView;
    }


}
