package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tela_Armas_Escopetas extends AppCompatActivity {

    Button button_proximoarmasescopetas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_armas_escopetas);
        getSupportActionBar().hide();

        IniciarComponentes();

        button_proximoarmasescopetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Armas_Escopetas.this, Tela_Armas_Rifles.class);
                startActivity(intent);

            }


        });
    }

        private void IniciarComponentes() {
            button_proximoarmasescopetas= findViewById(R.id.button_proximoarmasescopetas);
         }
    }