package com.example.examenut2salvador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SumarRestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_restar);

        TextView salida=findViewById(R.id.consola);

        Button regresar=findViewById(R.id.previousFromSumRes);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiaMain=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(cambiaMain);
            }
        });

        Button sum1=findViewById(R.id.sum1);
        sum1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma=Integer.valueOf(salida.getText().toString());
                suma+=1;

                salida.setText(String.valueOf(suma));
            }
        });

        Button sum2=findViewById(R.id.sum2);
        sum2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma=Integer.valueOf(salida.getText().toString());
                suma+=2;

                salida.setText(String.valueOf(suma));
            }
        });

        Button zero=findViewById(R.id.zero);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma=0;

                salida.setText(String.valueOf(suma));
            }
        });

        Button res1=findViewById(R.id.res1);
        res1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma=Integer.valueOf(salida.getText().toString());
                suma-=1;

                salida.setText(String.valueOf(suma));
            }
        });

        Button res2=findViewById(R.id.res2);
        res2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int suma=Integer.valueOf(salida.getText().toString());
                suma-=2;

                salida.setText(String.valueOf(suma));
            }
        });

    }
}