package com.example.hw2a1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=findViewById(R.id.edit_text1);
        button=findViewById(R.id.b1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text_value=text.getText().toString();
                Intent intent= new Intent(getApplicationContext(),SecondActivity.class);
                intent.putExtra("1", text_value);
                startActivity(intent);
            }
        });
    }
}