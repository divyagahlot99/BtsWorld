package com.example.btsworld;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        Button b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                setContentView(R.layout.activity_main);
            }

        });
    }
}


