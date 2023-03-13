package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Education5 extends AppCompatActivity {

    EditText uni_name,dgree,pas_year,percent;

    TextView reset,next;

    String name,dgre,year,percente;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education5);

        preferences = getSharedPreferences("Date",0);
        editor = preferences.edit();

        uni_name = findViewById(R.id.uni_name);
        dgree = findViewById(R.id.dgree);
        pas_year = findViewById(R.id.pas_year);
        percent = findViewById(R.id.percent);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                uni_name.setText("");
                dgree.setText("");
                pas_year.setText("");
                percent.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = uni_name.getText().toString();
                dgre = dgree.getText().toString();
                year = pas_year.getText().toString();
                percente = percent.getText().toString();

                editor.putString("uni_name",name);
                editor.putString("dgree",dgre);
                editor.putString("pas_year",year);
                editor.putString("percent",percente);
                editor.commit();


                Intent intent = new Intent(Education5.this,Experiance6.class);
                finish();
                startActivity(intent);
            }
        });
    }
}