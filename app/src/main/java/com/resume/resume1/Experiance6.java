package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Experiance6 extends AppCompatActivity {

    String company_name,job,description,year,certi;
    EditText edcompanyName,edjob,eddescription,edyear,edcerti;
    TextView txtreset,txtnext;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiance6);

        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        edcompanyName = findViewById(R.id.edcompanyName);
        edjob = findViewById(R.id.edjob);
        eddescription = findViewById(R.id.eddescription);
        edyear = findViewById(R.id.edyear);
        edcerti = findViewById(R.id.edcerti);
        txtreset = findViewById(R.id.txtreset);
        txtnext = findViewById(R.id.txtnext);

        txtreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edcompanyName.setText("");
                edjob.setText("");
                eddescription.setText("");
                edyear.setText("");
                edcerti.setText("");
            }
        });

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                company_name = edcompanyName.getText().toString();
                job = edjob.getText().toString();
                description = eddescription.getText().toString();
                year = edyear.getText().toString();
                certi = edcerti.getText().toString();

                editor.putString("companyName",company_name);
                editor.putString("job",job);
                editor.putString("desc",description);
                editor.putString("yeare",year);
                editor.putString("certi",certi);
                editor.commit();

                Intent intent = new Intent(Experiance6.this,Skill7.class);
                finish();
                startActivity(intent);
            }
        });
    }
}