package com.example.sreevidya.sahara;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText etName;
    EditText etAge;
    EditText etPhone;
    EditText etEmName1;
    EditText etEmName2;
    EditText etEmPhone1;
    EditText etEmPhone2;
    EditText etEmWord;
    Button btnRegister;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etAge=findViewById(R.id.etAge);
        etName=findViewById(R.id.etName);
        etPhone=findViewById(R.id.etPhone);
        etEmName1=findViewById(R.id.etEmName1);
        etEmName2=findViewById(R.id.etEmName2);
        etEmPhone1=findViewById(R.id.etEmPhone1);
        etEmPhone2=findViewById(R.id.etEmPhone2);
        etEmWord=findViewById(R.id.etEmWord);
        btnRegister=findViewById(R.id.btnRegister);
        sp=getSharedPreferences("f1",MODE_PRIVATE);
        String name= sp.getString("name","");

        if(name.length()==0){
            btnRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String name=etName.getText().toString();
                    if(name.length()==0)
                    {
                        etName.setError("No name entered");
                        etName.requestFocus();
                        return;
                    }
                    String age=etAge.getText().toString();
                    if(age.length()==0)
                    {
                        etAge.setError("No age entered");
                        etAge.requestFocus();
                        return;
                    }
                    String p=etPhone.getText().toString();
                    if(p.length()!=10){
                        etPhone.setError("Phone number inaccurate");
                        etPhone.requestFocus();
                        return;
                    }
                    String emname1=etEmName1.getText().toString();
                    if(emname1.length()==0)
                    {
                        etEmName1.setError("No name entered");
                        etEmName1.requestFocus();
                        return;
                    }

                    String emp1=etEmPhone1.getText().toString();
                    if(emp1.length()!=10){
                        etEmPhone1.setError("Phone number inaccurate");
                        etEmPhone1.requestFocus();
                        return;
                    }
                    String emname2=etEmName2.getText().toString();
                    if(emname2.length()==0)
                    {
                        etEmName2.setError("No name entered");
                        etEmName2.requestFocus();
                        return;
                    }

                    String emp2=etEmPhone2.getText().toString();
                    if(emp2.length()!=10){
                        etEmPhone2.setError("Phone number inaccurate");
                        etEmPhone2.requestFocus();
                        return;
                    }
                    String emword=etEmWord.getText().toString();
                    if(emword.length()==0)
                    {
                        etEmWord.setError("No name entered");
                        etEmWord.requestFocus();
                        return;
                    }

                    SharedPreferences.Editor editor=sp.edit();
                    editor.putString("name",name);
                    editor.putString("age",age);
                    editor.putString("Phone Number",p);
                    editor.putString("Em name1",emname1);
                    editor.putString("Em phone1",emp1);
                    editor.putString("Em name2",emname2);
                    editor.putString("Em phone2",emp2);
                    editor.putString("Em word",emword);
                    editor.commit();
                    Intent i=new Intent(MainActivity.this, EmergencyActivity.class);
                    startActivity(i);
                    finish();
                }
            });}
        else{
            Intent i=new Intent(MainActivity.this, EmergencyActivity.class);
            startActivity(i);
            finish();
        }}



}
