package com.example.maoztamir.recyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateTaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_task);

        Button button;
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent i = new Intent(getBaseContext(),MainActivity.class);
                EditText txtInput = (EditText)findViewById(R.id.editText);
                //Set the Data to pass
                String txtData = txtInput.getText().toString();
                i.putExtra("txtData", txtData);
                startActivity(i);
            }
        });
    }
}

