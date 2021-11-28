package com.example.donation10;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button donateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        donateButton = findViewById(R.id.donateButton);
        if (donateButton != null)
        {
            Log.v("Donate", "Really got the donate button");
        }
        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("Donate", "Donate Pressed!");
            }
        });
    }

}