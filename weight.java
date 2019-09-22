package com.example.nutrition_assist_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class weight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        Button button1 = findViewById(R.id.analyze);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(weight.this, NutritionFacts.class);
                EditText editText = (EditText) findViewById(R.id.weightbox);
                String message = editText.getText().toString();
                intent.putExtra("extra_data",message);
                startActivity(intent);
            }
        });
    }
}
