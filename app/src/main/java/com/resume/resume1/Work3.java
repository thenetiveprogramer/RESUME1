package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Work3 extends AppCompatActivity {

    String yearr,orderr,companyy,titlee,responss;

    EditText year,order,company,title,respons;

    TextView txtreset,txtnext;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        txtnext=findViewById(R.id.txtnext);
        txtreset=findViewById(R.id.txtreset);
        year=findViewById(R.id.year);
        order=findViewById(R.id.order);
        company=findViewById(R.id.company);
        title=findViewById(R.id.title);
        respons=findViewById(R.id.respons);

        txtreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                year.setText("");
                order.setText("");
                company.setText("");
                title.setText("");
                respons.setText("");
            }
        });

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yearr = year.getText().toString();
                orderr = order.getText().toString();
                companyy = company.getText().toString();
                titlee = title.getText().toString();
                responss = respons.getText().toString();

                editor.putString("year",yearr);
                editor.putString("order",orderr);
                editor.putString("company",companyy);
                editor.putString("title",titlee);
                editor.putString("responss",responss);
                editor.commit();

                Intent intent = new Intent(Work3.this,Project4.class);
            }
        });


    }
}