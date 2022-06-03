package com.example.seccion_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class CardView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        TextView textView = (TextView) findViewById(R.id.textViewTitle);
        textView.setText("Hello from the Card View!");
    }
}