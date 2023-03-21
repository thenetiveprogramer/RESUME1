package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Template8 extends AppCompatActivity {

    SharedPreferences preferences;
    TextView Name,address,educat,email,phone,hobby,school,course,grade,year,Company,job,Desciription,Jobyear,skill1,skill2,skill3,skill4,github,linkedin,objective,companyname,companylink;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_template8);

        preferences = getSharedPreferences("Data",0);

        Name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        hobby = findViewById(R.id.hobby);
        school = findViewById(R.id.school);
        course = findViewById(R.id.course);
        grade = findViewById(R.id.grade);
        year = findViewById(R.id.year);

        Company = findViewById(R.id.Company);
        job = findViewById(R.id.job);
        Desciription = findViewById(R.id.Desciription);
        Jobyear = findViewById(R.id.Jobyear);
        skill1 = findViewById(R.id.skill1);
        skill2 = findViewById(R.id.skill2);
        skill3 = findViewById(R.id.skill3);
        skill4 = findViewById(R.id.skill4);
        linkedin = findViewById(R.id.linkedin);
        github = findViewById(R.id.github);
        objective = findViewById(R.id.objective);
        companyname = findViewById(R.id.companyname);
        companylink = findViewById(R.id.companylink);
        educat = findViewById(R.id.educat);

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

        Name.setText(n1);
        address.setText(n2);
        email.setText(n3);
        phone.setText(n4);
        hobby.setText(n5);
        school.setText(n6);
        course.setText(n7);
        grade.setText(n8);
        year.setText(n9);
        Company.setText(n10);
        job.setText(n11);
        Desciription.setText(n12);
        Jobyear.setText(n13);
        skill1.setText(n14);
        skill2.setText(n15);
        skill3.setText(n16);
        skill4.setText(n17);
        github.setText(n18);
        linkedin.setText(n19);
        objective.setText(n20);
        companyname.setText(n21);
        companylink.setText(n22);

    }
}