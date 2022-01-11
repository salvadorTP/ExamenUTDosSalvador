package com.example.examenut2salvador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botonSumar=findViewById(R.id.actSumar);
        botonSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiasumres=new Intent(getApplicationContext(), SumarRestar.class);
                startActivity(cambiasumres);
            }
        });

        Button botonDatabase=findViewById(R.id.actDatabase);
        botonDatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiadb=new Intent(getApplicationContext(), BaseDatos.class);
                startActivity(cambiadb);
            }
        });

    }
}