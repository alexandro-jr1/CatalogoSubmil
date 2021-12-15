package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Municoes_II extends AppCompatActivity {

    Button button_proximomunicoesII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_municoes_ii);

        getSupportActionBar().hide();

        IniciarComponentes();

        button_proximomunicoesII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Municoes_II.this, Tela_Municoes_III.class);
                startActivity(intent);

            }


        });
    }
    private void IniciarComponentes() {
        button_proximomunicoesII = findViewById(R.id.button_proximomunicoesII);
    }
}