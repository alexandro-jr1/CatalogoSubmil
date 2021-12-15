package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Equipamentos extends AppCompatActivity {

    Button button_proximoequipamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_equipamentos);
        getSupportActionBar().hide();

        IniciarComponentes();


        button_proximoequipamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Equipamentos.this, Tela_Equipamentos_II.class);
                startActivity(intent);

            }


        });
    }

    private void IniciarComponentes() {
        button_proximoequipamentos = findViewById(R.id.button_proximoequipamentos);
    }
}
