package com.example.javafirstlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.javafirstlab.Task1.Numbers;

import java.util.ArrayList;
import java.util.List;

public class Task1Activity extends AppCompatActivity {

    TextView inputField;
    TextView outputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);

        inputField = findViewById(R.id.inputField);
        outputField = findViewById(R.id.outputField);

        findViewById(R.id.luckyButton).setOnClickListener(handleClick);

    }

    private View.OnClickListener handleClick = new View.OnClickListener(){
        public void onClick(View v) {
            String inputLine = inputField.getText().toString();
            if(inputLine.isEmpty()){
             outputField.setText("Wrong input");
             return;
            }
            String[] stringNumbers = inputLine.split(" ");
            List<Integer> inputNumbers = new ArrayList<>();
            for(String number: stringNumbers){
                inputNumbers.add(Integer.parseInt(number));
            }

            Numbers numbers = new Numbers(inputNumbers.toArray(new Integer[inputNumbers.size()]));
            try {
                outputField.setText(numbers.getLuckyNumbers().toString());
            } catch (Exception e) {
               outputField.setText("Couldn't execute operation");
            }
        }
    };

    public void onResetClicked(View v){
        outputField.setText("");
        inputField.setText("");
    }
}
