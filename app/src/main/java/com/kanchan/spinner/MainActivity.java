package com.kanchan.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

        String Alphabets[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Spinner spin = findViewById(R.id.spinner);
            spin.setOnItemSelectedListener(this);

            ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.activity_main, Alphabets);
            spin.setAdapter(arrayAdapter);
        }
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id)
            {
                Toast.makeText(getApplicationContext(), Alphabets[position],Toast.LENGTH_LONG).show ();
            }
            public void onNothingSelected(AdapterView<?> arg0)
            {

            }
    }

