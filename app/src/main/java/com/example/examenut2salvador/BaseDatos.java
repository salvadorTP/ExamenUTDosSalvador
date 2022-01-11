package com.example.examenut2salvador;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseDatos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_datos);

        TextView nombreGrupo=findViewById(R.id.insertGroupName);
        TextView nacionalidadGrupo=findViewById(R.id.insertNationality);
        TextView generoGrupo=findViewById(R.id.insertGeneroMus);
        TextView yearGrupo=findViewById(R.id.insertYearSong);

        TextView salida=findViewById(R.id.salida);

        Button insertar=findViewById(R.id.insertJb);
        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String almacenado=salida.getText().toString();

                salida.setText(almacenado.concat("nombre grupo: "+nombreGrupo.getText().toString()+" nacionalidad: "+nacionalidadGrupo.getText().toString()+
                        " genero: "+generoGrupo.getText().toString()+" año: "+yearGrupo.getText().toString()+"\n"));

                Helper helper= new Helper(getApplicationContext());
                SQLiteDatabase db=helper.getWritableDatabase();

                ContentValues values= new ContentValues();
                values.put("nombre", nombreGrupo.getText().toString());
                values.put("nacionalidad", nacionalidadGrupo.getText().toString());
                values.put("genero_musical", generoGrupo.getText().toString());
                values.put("year_creacion", generoGrupo.getText().toString());

                db.insert("grupos",null, values);
            }
        });



    }
}