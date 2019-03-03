package com.example.javafirstlab;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.javafirstlab.Task4.Book;
import com.example.javafirstlab.Task4.BookController;
import com.example.javafirstlab.Task4.Catalog;

import java.util.ArrayList;

public class Task4Activity extends AppCompatActivity implements View.OnClickListener {

    Button submitButton;
    TextView catalogueView;
    TextView titleField;
    TextView authorField;
    Catalog catalogue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);

        catalogue = new Catalog();

        submitButton = findViewById(R.id.submitButton);
        catalogueView = findViewById(R.id.catalogueView);
        titleField = findViewById(R.id.titleField);
        authorField = findViewById(R.id.authorField);

    }


    @Override
    public void onClick(View v) {
        String inputTitle = titleField.getText().toString();
        String inputAuthor = titleField.getText().toString();
        if(inputTitle.isEmpty() || inputAuthor.isEmpty()){
            catalogueView.setText("WrongInput");
            return;
        }
        Book book = new Book(0, authorField.getText().toString(), titleField.getText().toString());
        catalogue.add(book);
        String bookData = "";
        for(Book b : catalogue.getBooks()){
            bookData += ("Title : " + b.getName());
            bookData += ("Author: " + b.getAuthor() + ", ");
            bookData += ("\n");
        }
        catalogueView.setText(bookData);
    }

    public void removeHintOnClick(View v){
        TextView inputField = (TextView)v;
        inputField.setText("");
    }
}
