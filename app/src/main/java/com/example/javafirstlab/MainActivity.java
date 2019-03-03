package com.example.javafirstlab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button firstTaskButton;
    Button secondTaskButton;
    Button thirdTaskButton;
    Button fourthTaskButton;
    TextView ouputField;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstTaskButton = (Button)findViewById(R.id.firstTaskButton);
        secondTaskButton = (Button)findViewById(R.id.secondTaskButton);
        thirdTaskButton = (Button)findViewById(R.id.thirdTaskButton);
        fourthTaskButton = (Button)findViewById(R.id.fourthTaskButton);
    }

    public void launchTaskActivity(View view){
        Intent intent;
        switch(view.getId()){
            case R.id.firstTaskButton:
             intent = new Intent(this, Task1Activity.class);
             startActivity(intent);
             break;
            case R.id.secondTaskButton:
                intent = new Intent(this, Task2Activity.class);
                startActivity(intent);
                break;
            case R.id.thirdTaskButton:
                intent = new Intent(this, Task3Activity.class);
                startActivity(intent);
                break;
            case R.id.fourthTaskButton:
                intent = new Intent(this, Task4Activity.class);
                startActivity(intent);
                break;
        }
    }
}
