package com.example.kristine.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Second extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String RA = getIntent().getStringExtra("RA");
        String FinalGrade = getIntent().getStringExtra("finalgrade");

        TextView raw = (TextView) findViewById(R.id.RA);
        TextView fg = (TextView) findViewById(R.id.FinalGrade);

        raw.setText("Your RA is " + RA);
        fg.setText("Your Final Grade is " + FinalGrade);



    }

    public void Return(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);

    }

}
