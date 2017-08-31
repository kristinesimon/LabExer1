package com.example.kristine.labexer1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOK;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Compute(View view){

        Intent intent = new Intent(this,Second.class);
        String FinalGrade = "";
        EditText Quiz1 = (EditText) findViewById(R.id.Quiz1);
        EditText Quiz2 = (EditText) findViewById(R.id.Quiz2);
        EditText SeatWorks = (EditText) findViewById(R.id.Seatworks);
        EditText LabExer = (EditText) findViewById(R.id.LabExer);
        EditText MajorExams = (EditText) findViewById(R.id.MajorExam);

        double Q1 = Double.parseDouble(Quiz1.getText().toString());
        double Q2 = Double.parseDouble(Quiz2.getText().toString());
        double sw = Double.parseDouble(SeatWorks.getText().toString());
        double le = Double.parseDouble(LabExer.getText().toString());
        double me = Double.parseDouble(MajorExams.getText().toString());


        double RA = ((Q1 * .1) + (Q2 * .1) + (sw * .1) + (le * .4) + (me * .3));

        if(RA < 60 ) {
            FinalGrade = "FAILED";
        }
        else if(RA <= 65){
            FinalGrade = "3.00";
        }
        else if(RA <=70 ){
            FinalGrade = "2.75";
        }
        else if(RA <=75){
            FinalGrade = "2.50";
        }
        else if(RA <=80){
            FinalGrade = "2.25";
        }
        else if(RA <=85){
            FinalGrade = "2.00";
        }
        else if(RA <=90){
            FinalGrade = "1.75";
        }
        else if(RA <=92){
            FinalGrade = "1.50";
        }
        else if(RA <=94){
            FinalGrade = "1.25";
        }
        else if(RA <=100){
            FinalGrade = "1.00";
        }

        intent.putExtra("RA", Double.toString(RA));
        intent.putExtra("finalgrade", FinalGrade);

        startActivity(intent);

    }
}
