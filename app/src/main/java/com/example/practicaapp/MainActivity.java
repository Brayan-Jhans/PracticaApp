package com.example.practicaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewNumber1;
    private TextView textViewNumber2;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        textViewNumber1 = findViewById(R.id.textViewNumber1);
        textViewNumber2 = findViewById(R.id.textViewNumber2);
        textViewResult = findViewById(R.id.textViewResult);
        Intent intent = getIntent();
        if (intent != null) {
            int number1 = intent.getIntExtra("number1", 0);
            int number2 = intent.getIntExtra("number2", 0);
            textViewNumber1.setText("Número 1: " + number1);
            textViewNumber2.setText("Número 2: " + number2);


            // Realizar operaciones aritméticas
            int sum = number1 + number2;
            int subtraction = number1 - number2;
            int multiplication = number1 * number2;
            double division = (double) number1 / number2;

            // Mostrar resultados en el TextView
            String resultText = "Suma: " + sum + "\n" +
                    "Resta: " + subtraction + "\n" +
                    "Multiplicación: " + multiplication + "\n" +
                    "División: " + division;
            textViewResult.setText(resultText);
        }
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        //  txt_ciclo.append("estas en onRestart()\n");
    }

}
