package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Personal2 extends AppCompatActivity {
    String name, email,contect, address;
    EditText txtname,txtemail,txtcontect,txtaddress;
    CheckBox dance,travel,music,reading;
    TextView hobby,reset, next;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal2);


        preferences = getSharedPreferences("Data",0);
        editor = preferences.edit();

        txtname = findViewById(R.id.txtname);
        txtaddress = findViewById(R.id.txtaddress);
        txtemail = findViewById(R.id.txtemail);
        txtcontect = findViewById(R.id.txtcontect);
        reset = findViewById(R.id.reset);
        next = findViewById(R.id.next);
        dance = findViewById(R.id.dance);
        travel = findViewById(R.id.travel);
        music = findViewById(R.id.music);
        reading = findViewById(R.id.reading);
        hobby = findViewById(R.id.hobby);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtname.setText("");
                txtemail.setText("");
                txtaddress.setText("");
                txtcontect.setText("");
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                name = txtname.getText().toString();
                address = txtaddress.getText().toString();
                email = txtemail.getText().toString();
                contect = txtcontect.getText().toString();

                String Hobby= "";

                if(dance.isClickable()){
                    Hobby += "Dance/n";
                }
                if(travel.isClickable()){
                    Hobby += "Traveling/n";
                }
                if(music.isClickable()){
                    Hobby += "Music/n";
                }
                if(reading.isClickable()){
                    Hobby += "Reading/n";
                }

                hobby.setText(""+Hobby);

                editor.putString("name",name);
                editor.putString("address",address);
                editor.putString("email",email);
                editor.putString("contect",contect);
                editor.putString("hobby",Hobby);
                editor.commit();

                Intent intent = new Intent(Personal2.this,Work3.class);
                finish();
                startActivity(intent);
            }
        });

    }
}