package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Experiance6 extends AppCompatActivity {

    String company_name,job1,description1,year1,certi1;
    EditText companyName,job,description,year,cert;
    TextView reset,next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiance6);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        companyName = findViewById(R.id.companyName);
        job = findViewById(R.id.job);
        description = findViewById(R.id.description);
        year = findViewById(R.id.year);
        cert = findViewById(R.id.cert);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                companyName.setText("");
                job.setText("");
                description.setText("");
                year.setText("");
                cert.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                company_name = companyName.getText().toString();
                job1 = job.getText().toString();
                description1 = description.getText().toString();
                year1 = year.getText().toString();
                certi1 = cert.getText().toString();

                editor.putString("companyName",company_name);
                editor.putString("job",job1);
                editor.putString("desc",description1);
                editor.putString("year",year1);
                editor.putString("cert",certi1);
                editor.commit();

                Intent intent = new Intent(Experiance6.this,Skill7.class);
                finish();
                startActivity(intent);
            }
        });
    }
}