package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Municoes_III extends AppCompatActivity {

    Button button_voltarmun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_municoes_iii);
        getSupportActionBar().hide();

        IniciarComponentes();

        button_voltarmun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Municoes_III.this, Tela_Inicial.class);
                startActivity(intent);

            }

        });
    }
    private void IniciarComponentes() {
        button_voltarmun = findViewById(R.id.button_voltarmun);
    }
}