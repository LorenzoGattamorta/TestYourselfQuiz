package com.example.android.testyourselfquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void done(View view) {

    /*
    Initial points.
     */

        EditText personalName = (EditText) findViewById(R.id.personal_name);
        String name = personalName.getText().toString();

        int points = 0;

    /* Question 1
     */

        CheckBox louvre = (CheckBox) findViewById(R.id.louvre);
        boolean IsLouvre = louvre.isChecked();

        CheckBox moma = (CheckBox) findViewById(R.id.moma);
        boolean IsMoma = moma.isChecked();

        CheckBox guggenheim = (CheckBox) findViewById(R.id.guggenheim);
        boolean IsGuggenheim = guggenheim.isChecked();

        if (IsLouvre && !IsMoma && !IsGuggenheim) {
            points += 1;
        } else if(IsMoma){
            points += 0;
        } else if(IsGuggenheim){
            points += 0;
        }

        /* Question 2
         */

        RadioButton true2 = (RadioButton) findViewById(R.id.true2);
        boolean IsTrue = true2.isChecked();

        RadioButton false2 = (RadioButton) findViewById(R.id.false2);
        boolean IsFalse = false2.isChecked();

        if (IsTrue) {
            points += 1;
        } else if (IsFalse){
            points += 0;
        }

        /* Question 3
         */

        RadioButton false_1_3 = (RadioButton) findViewById(R.id.false_1_3);
        boolean Is1 = false_1_3.isChecked();

        RadioButton false_2_3 = (RadioButton) findViewById(R.id.false_2_3);
        boolean Is2 = false_2_3.isChecked();

        RadioButton false_3_3 = (RadioButton) findViewById(R.id.false_3_3);
        boolean Is3 = false_3_3.isChecked();

        RadioButton false_4_3 = (RadioButton) findViewById(R.id.false_4_3);
        boolean Is4 = false_4_3.isChecked();

        RadioButton false_5_3 = (RadioButton) findViewById(R.id.false_5_3);
        boolean Is5 = false_5_3.isChecked();

        RadioButton true3 = (RadioButton) findViewById(R.id.true3);
        boolean Is6 = true3.isChecked();

        RadioButton false_7_3 = (RadioButton) findViewById(R.id.false_7_3);
        boolean Is7 = false_7_3.isChecked();

        if (Is6 && !Is1 && !Is2 && !Is3 && !Is4 && !Is5 && !Is7) {
            points += 1;
        } else if(Is1){
            points += 0;
        }else if(Is2){
            points += 0;
        }else if(Is3){
            points += 0;
        }else if(Is4){
            points += 0;
        }else if(Is5){
            points += 0;
        }else if(Is7){
            points += 0;
        }else{
            points += 0;
        }

        /* Question4.
         */

        CheckBox red = (CheckBox) findViewById(R.id.red);
        boolean IsRed = red.isChecked();

        CheckBox blue = (CheckBox) findViewById(R.id.blue);
        boolean IsBlue = blue.isChecked();

        CheckBox green = (CheckBox) findViewById(R.id.green);
        boolean IsGreen = green.isChecked();

        CheckBox purple = (CheckBox) findViewById(R.id.purple);
        boolean IsPurple = purple.isChecked();

        if (IsBlue && IsRed && !IsGreen && !IsPurple) {
            points += 1;
        } else if(IsRed){
            points += 0;
        } else if(IsBlue){
            points += 0;
        } else if(IsGreen){
            points += 0;
        } else if(IsPurple){
            points += 0;
        } else{
            points += 0;
        }

        /*
        Question 5.
         */

        EditText capitalname = (EditText) findViewById(R.id.capitalname);
        String Iscapitalname = capitalname.getText().toString().trim();

        if (Iscapitalname.equalsIgnoreCase("London")) {
            points += 1;
        } else {
            points = 0;
        }

        /* Final score.
         */

        if (points == 1) {
            Toast.makeText(this, name + " your score is " + points + ", very very bad!",
                    Toast.LENGTH_LONG).show();
        } else if (points == 2) {
            Toast.makeText(this, name + " your score is " + points + ", bad!",
                    Toast.LENGTH_LONG).show();
        } else if (points == 3) {
            Toast.makeText(this, name + " your score is " + points + ", not so good!",
                    Toast.LENGTH_LONG).show();
        } else if (points == 4) {
            Toast.makeText(this, name + " your score is " + points + ", good!",
                    Toast.LENGTH_LONG).show();
        } else if (points == 5) {
            Toast.makeText(this, name + " your score is " + points + ", well done!",
                    Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Please answer all the questions", Toast.LENGTH_SHORT).show();
        }
    }
}