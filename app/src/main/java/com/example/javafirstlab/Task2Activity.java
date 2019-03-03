package com.example.javafirstlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.javafirstlab.Task2.SmartDoubleArray;
import com.example.javafirstlab.Task2.SumBetweenVisitor;

import java.util.ArrayList;
import java.util.List;

public class Task2Activity extends AppCompatActivity {

    Button sumButton;
    Button clearButton;
    TextView inputField;
    TextView outputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);

        clearButton = findViewById(R.id.clearButton);
        inputField = findViewById(R.id.inputField);
        sumButton = findViewById(R.id.sumButton);
        outputField = findViewById(R.id.outputField);

        sumButton.setOnClickListener(new HandleClick());
    }


    private class HandleClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            List<Double>doubleList = new ArrayList<>();
            String inputLine = inputField.getText().toString();
            if(inputLine.isEmpty()){
                outputField.setText("Wrong input");
                return;
            }
            String[] stringNumbers = inputLine.split(" ");
            for(String stringNumber: stringNumbers){
                doubleList.add(Double.parseDouble(stringNumber));
            }
            SmartDoubleArray smartArray = new SmartDoubleArray(doubleList.toArray(new Double[doubleList.size()]));
            SumBetweenVisitor sumVisitor = new SumBetweenVisitor();
            smartArray.accept(sumVisitor);
            outputField.setText( smartArray.accept(sumVisitor).toString());
        }
    }

    public void onResetClicked(View v){

        inputField.setText("");
        outputField.setText("");
    }



}

