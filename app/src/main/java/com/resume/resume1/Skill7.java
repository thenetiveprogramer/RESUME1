package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Skill7 extends AppCompatActivity {

    TextView reset,next;

    EditText Skill1,Skill2,Skill3,Skill4,Skill5;

    String skil1,skil2,skil3,skil4,skil5;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill7);

        preferences = getSharedPreferences("Date",0);
        editor = preferences.edit();

        reset=findViewById(R.id.txtreset);
        next=findViewById(R.id.txtnext);
        Skill1=findViewById(R.id.skill1);
        Skill2=findViewById(R.id.skill2);
        Skill3=findViewById(R.id.skill3);
        Skill4=findViewById(R.id.skill4);
        Skill5=findViewById(R.id.skill5);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Skill1.setText("");
                Skill2.setText("");
                Skill3.setText("");
                Skill4.setText("");
                Skill5.setText("");
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                skil1 = Skill1.getText().toString();
                skil2 = Skill2.getText().toString();
                skil3 = Skill3.getText().toString();
                skil4 = Skill4.getText().toString();
                skil5= Skill5.getText().toString();

                editor.putString("skill1",skil1);
                editor.putString("skill2",skil2);
                editor.putString("skill3",skil3);
                editor.putString("skill4",skil4);
                editor.putString("skill5",skil5);
                editor.commit();

                Intent intent = new Intent(Skill7.this,Template8.class);
                finish();
                startActivity(intent);

            }
        });
    }
}