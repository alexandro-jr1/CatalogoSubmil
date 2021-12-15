package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Armas_Rifles extends AppCompatActivity {

    Button button_proximorifles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_armas_rifles);
        getSupportActionBar().hide();

        IniciarComponentes();


        button_proximorifles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Armas_Rifles.this, Tela_Armas_Revolvers.class);
                startActivity(intent);

            }


        });
    }
        private void IniciarComponentes() {
            button_proximorifles = findViewById(R.id.button_proximorifles);
        }
    }
