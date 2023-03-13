package com.resume.resume1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Project4 extends AppCompatActivity {

    String git,link,projec;
    EditText github,Linkedin,project;

    TextView txtreset,txtnext;

    SharedPreferences preferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project4);

        preferences = getSharedPreferences("Date",0);
        editor = preferences.edit();

        github = findViewById(R.id.github);
        Linkedin = findViewById(R.id.Linkedin);
        project = findViewById(R.id.project);
        txtreset = findViewById(R.id.txtreset);
        txtnext = findViewById(R.id.txtnext);

        txtreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                github.setText("");
                Linkedin.setText("");
            }
        });

        txtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                git = github.getText().toString();
                link = Linkedin.getText().toString();
                projec = project.getText().toString();

                editor.putString("git",git);
                editor.putString("link",link);
                editor.putString("project",projec);
                editor.commit();

                Intent intent = new Intent(Project4.this,Education5.class);
                finish();
                startActivity(intent);
            }
        });
    }
}