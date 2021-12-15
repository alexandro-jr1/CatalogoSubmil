package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Inicial extends AppCompatActivity {


     Button button_armas,button_equipamentos,button_municoes,button_info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        getSupportActionBar().hide();

        IniciarComponentes();

        button_armas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Inicial.this, Tela_Armas_Pistolas.class);
                startActivity(intent);

            }
        });
        button_equipamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Inicial.this, Tela_Equipamentos.class);
                startActivity(intent);
            }
        });
        button_municoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Inicial.this, Tela_Municoes.class);
                startActivity(intent);
            }
        });
        button_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Inicial.this, Tela_Info.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponentes(){
        button_armas = findViewById(R.id.button_armas);
        button_equipamentos = findViewById(R.id.button_equipamentos);
        button_municoes = findViewById(R.id.button_municoes);
        button_info = findViewById(R.id.button_info);


    }

}










    

        
        


