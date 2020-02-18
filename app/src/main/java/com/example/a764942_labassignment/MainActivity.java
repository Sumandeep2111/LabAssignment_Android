package com.example.a764942_labassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editName,editLastname,editPhone,editAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = findViewById(R.id.TextName);
        editLastname = findViewById(R.id.Textlast);
        editPhone  = findViewById(R.id.TextPhone);
        editAddress = findViewById(R.id.TextAddress);
    }

    @Override
    public void onClick(View v) {

    }
}
