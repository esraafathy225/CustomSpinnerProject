package com.company.customspinner;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ArrayList<Country> countries = new ArrayList<Country>();

        countries.add(new Country("United States", R.drawable.unitedstates)); //inline
        countries.add(new Country("Australia", R.drawable.australia));
        countries.add(new Country("Brazil", R.drawable.brazil));
        countries.add(new Country("Egypt", R.drawable.egypt));
        countries.add(new Country("England", R.drawable.england));
        countries.add(new Country("China", R.drawable.china));


        spinner = findViewById(R.id.spn);

        CountriesAdapter countriesAdapter=new CountriesAdapter(MainActivity.this,countries);
        spinner.setAdapter(countriesAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Item Clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }
}
