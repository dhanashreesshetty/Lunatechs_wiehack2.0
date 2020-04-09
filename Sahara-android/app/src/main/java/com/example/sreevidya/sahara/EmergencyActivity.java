package com.example.sreevidya.sahara;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class EmergencyActivity extends AppCompatActivity {
Button btnEm;
TextView tvEm;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency);
        btnEm=findViewById(R.id.btnEm);
        tvEm=findViewById(R.id.tvEm);
        sp=getSharedPreferences("f1",MODE_PRIVATE);
        final String emname1=sp.getString("Em name1"," ");
        final String emp1=sp.getString("Em phone1"," ");
        final String emname2=sp.getString("Em name2"," ");
        final String emp2=sp.getString("Em phone2"," ");
        tvEm.setText("Emergency Contacts\n 1."+emname1+emp1+"\n 2."+emname2+emp2);

    }
}
