package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Municoes extends AppCompatActivity {

    Button button_proximomunicoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_municoes);

        getSupportActionBar().hide();

        IniciarComponentes();

        button_proximomunicoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Municoes.this, Tela_Municoes_II.class);
                startActivity(intent);

            }


        });
    }
    private void IniciarComponentes() {
        button_proximomunicoes = findViewById(R.id.button_proximomunicoes);
    }
}