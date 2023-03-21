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

    String yea,ord,com,tit,res;

    EditText year,order,company,title,response;

    TextView reset,next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work3);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        next=findViewById(R.id.txtnext);
        reset=findViewById(R.id.txtreset);
        year=findViewById(R.id.year);
        order=findViewById(R.id.order);
        company=findViewById(R.id.company);
        title=findViewById(R.id.title);
        response=findViewById(R.id.response);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                year.setText("");
                order.setText("");
                company.setText("");
                title.setText("");
                response.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yea = year.getText().toString();
                ord = order.getText().toString();
                com = company.getText().toString();
                tit = title.getText().toString();
                res = response.getText().toString();

                editor.putString("year",yea);
                editor.putString("order",ord);
                editor.putString("company",com);
                editor.putString("title",tit);
                editor.putString("responss",res);
                editor.commit();

                Intent intent = new Intent(Work3.this,Project4.class);
                finish();
                startActivity(intent);
            }
        });


    }
}