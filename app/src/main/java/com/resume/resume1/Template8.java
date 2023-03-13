package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Template8 extends AppCompatActivity {

    SharedPreferences preferences;
    TextView txtName,tvaddress,educat,tvemail,tvphone,tvhobby,tvschool,tvcourse,tvgrade,tvyear,tvCompany,tvjob,tvDesciription,tvJobyear,tvskill1,tvskill2,tvskill3,tvskill4,tvgithub,tvlinkedin,tvobjective,tvcompanyname,tvcompanylink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template8);

        preferences = getSharedPreferences("Data",0);

        txtName = findViewById(R.id.name);
        tvaddress = findViewById(R.id.tvaddress);
        tvemail = findViewById(R.id.tvemail);
        tvphone = findViewById(R.id.tvphone);
        tvhobby = findViewById(R.id.tvhobby);
        tvschool = findViewById(R.id.tvschool);
        tvcourse = findViewById(R.id.tvcourse);
        tvgrade = findViewById(R.id.tvgrade);
        tvyear = findViewById(R.id.tvyear);
        tvCompany = findViewById(R.id.tvCompany);
        tvjob = findViewById(R.id.tvjob);
        tvDesciription = findViewById(R.id.tvDesciription);
        tvJobyear = findViewById(R.id.tvJobyear);
        tvskill1 = findViewById(R.id.tvskill1);
        tvskill2 = findViewById(R.id.tvskill2);
        tvskill3 = findViewById(R.id.tvskill3);
        tvskill4 = findViewById(R.id.tvskill4);
        tvlinkedin = findViewById(R.id.tvlinkedin);
        tvgithub = findViewById(R.id.tvgithub);
        tvobjective = findViewById(R.id.tvobjective);
        tvcompanyname = findViewById(R.id.tvcompanyname);
        tvcompanylink = findViewById(R.id.tvcompanylink);

        String n1 = preferences.getString("name","");
        String n2 = preferences.getString("address","");
        String n3 = preferences.getString("email","");
        String n4 = preferences.getString("phone","");
        String n5 = preferences.getString("hobby","");
        String n6 = preferences.getString("course","");
        String n7 = preferences.getString("school","");
        String n8 = preferences.getString("grade","");
        String n9 = preferences.getString("year","");
        String n10 = preferences.getString("cname","");
        String n11 = preferences.getString("job","");
        String n12 = preferences.getString("desc","");
        String n13 = preferences.getString("yeare","");
        String n14 = preferences.getString("skill1","");
        String n15 = preferences.getString("skill2","");
        String n16 = preferences.getString("skill3","");
        String n17 = preferences.getString("skill4","");
        String n18 = preferences.getString("git","");
        String n19 = preferences.getString("link","");
        String n20 = preferences.getString("obj","");
        String n21 = preferences.getString("coname","");
        String n22 = preferences.getString("colink","");

        txtName.setText(n1);
        tvaddress.setText(n2);
        tvemail.setText(n3);
        tvphone.setText(n4);
        tvhobby.setText(n5);
        tvschool.setText(n6);
        tvcourse.setText(n7);
        tvgrade.setText(n8);
        tvyear.setText(n9);
        tvCompany.setText(n10);
        tvjob.setText(n11);
        tvDesciription.setText(n12);
        tvJobyear.setText(n13);
        tvskill1.setText(n14);
        tvskill2.setText(n15);
        tvskill3.setText(n16);
        tvskill4.setText(n17);
        tvgithub.setText(n18);
        tvlinkedin.setText(n19);
        tvobjective.setText(n20);
        tvcompanyname.setText(n21);
        tvcompanylink.setText(n22);

    }
}