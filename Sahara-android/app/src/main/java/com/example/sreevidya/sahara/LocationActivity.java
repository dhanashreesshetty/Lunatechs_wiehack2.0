package com.example.sreevidya.sahara;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class LocationActivity extends AppCompatActivity {
EditText etSource;
EditText etDestination;
SharedPreferences sp;
TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        etSource=findViewById(R.id.etSource);
        etDestination=findViewById(R.id.etDestination);
        sp=getSharedPreferences("f1",MODE_PRIVATE);
        tvWelcome=findViewById(R.id.tvWelcome);
        final String name=sp.getString("name"," ");
        tvWelcome.setText("Welcome "+name);
    }
}
