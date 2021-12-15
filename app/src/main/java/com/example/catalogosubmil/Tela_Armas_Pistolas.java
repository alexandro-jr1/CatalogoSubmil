package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Armas_Pistolas extends AppCompatActivity {

    Button button_proximoarmaspistolas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_armas_pistolas);
        getSupportActionBar().hide();

        IniciarComponentes();

        button_proximoarmaspistolas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Armas_Pistolas.this, Tela_Armas_Escopetas.class);
                startActivity(intent);

            }


        });
    }
        private void IniciarComponentes() {
            button_proximoarmaspistolas = findViewById(R.id.button_proximoarmaspistolas);

        }
    }
