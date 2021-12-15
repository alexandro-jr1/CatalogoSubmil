package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Armas_Revolvers extends AppCompatActivity {


    Button button_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_armas_revolvers);
        getSupportActionBar().hide();

        IniciarComponentes();


        button_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Armas_Revolvers.this, Tela_Inicial.class);
                startActivity(intent);

            }


        });
    }
    private void IniciarComponentes() {
        button_voltar = findViewById(R.id.button_voltar);
    }
}