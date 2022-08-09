package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView title = findViewById(R.id.title);
        EditText firstNumber = findViewById(R.id.Num1);
        EditText secondNumber = findViewById(R.id.Num2);
        Button Calculate = findViewById(R.id.button);
        TextView Total = findViewById(R.id.Total);


        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int num1 = Integer.parseInt(firstNumber.getText().toString());
               int num2 = Integer.parseInt(secondNumber.getText().toString());


            int result = num1 + num2;

            Total.setText(String.valueOf(result));

            }

        });
    }
}