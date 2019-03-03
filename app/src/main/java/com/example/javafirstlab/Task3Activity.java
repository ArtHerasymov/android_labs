package com.example.javafirstlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.javafirstlab.R;
import com.example.javafirstlab.Task3.TextContainer;

import org.w3c.dom.Text;

import java.util.List;


// Implements action listener as an anonymous class
public class Task3Activity extends AppCompatActivity {

    Button resetButton;
    Button searchButton;
    TextView outputView;
    TextView inputField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);

        resetButton = findViewById(R.id.resetButton);
        searchButton = findViewById(R.id.searchButton);
        outputView = findViewById(R.id.outputView);
        inputField = findViewById(R.id.inputField);

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outputView.setText("");
                inputField.setText("");
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = inputField.getText().toString();
                if(inputText == ""){
                    outputView.setText("WrongInout");
                    return;
                }
                TextContainer textContainer = new TextContainer(inputText);
                List<String> listOfWords = textContainer.getUniqueWhereFirstEqualsLast();
                StringBuilder resultingString = new StringBuilder();
                for(String word : listOfWords){
                    resultingString.append(word).append(" ");
                }
                outputView.setText(resultingString.toString());
            }
        });
    }
}
