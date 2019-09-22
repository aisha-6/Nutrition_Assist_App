package com.example.nutrition_assist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


public class NutritionFacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_facts);

        String[] nutrients = {"Calories  =  3584.17","Protein  =  72.93g", "Lipid  =  137.26g", "Carbohydrates  =  214.99g", "Fiber  =  51.45g", "Sugar  =  14.25g","Calcium  =  1270.83mg","Iron  =  49.91mg", "Magnesium  =  1309.58mg", "Potassium  =  7251.46mg", "Sodium  =  778.33mg", "Vitamin C  =  83.28g", "Vitamin B6  =  2.83g", "Vitamin B12  =  2.69g", "Vitamin A  =  1060.19g", "Vitamin E  =  16.68g", "Saturated Fat  =  69.54g", "Cholesterol  =  32.64g"};
        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nutrients);
        ListView mListView1 = (ListView)findViewById(R.id.listView1);
        mListView1.setAdapter(theAdapter);

    }
}
