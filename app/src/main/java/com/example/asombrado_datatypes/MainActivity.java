package com.example.asombrado_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displayTxt);

        String firstname = "Kervi Kent ";
        char middleInitial ='C';
        String lastname = " Asombrado";
        String anotherOne = "\nI want my grade in TVL3 to be";
        int myAge = 17;
        int myGrade = 100;


        display.setText(firstname);


        String numberButString = "0.00";

        double myRacks = 99999.99;

        myRacks =  Double.parseDouble(numberButString);

        display.setText("My name is " + firstname + "" + String.valueOf (middleInitial) + lastname
        + "\nand my age is " + myAge + " years old. " + anotherOne + "\t" + myGrade + "\n \n \n \n \n \n \n because why not? KEKW");




        boolean amImarried = false;

    }
}