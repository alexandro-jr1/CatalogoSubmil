package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Equipamentos_IIII extends AppCompatActivity {

    Button button_voltareq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_equipamentos_iiii);
        getSupportActionBar().hide();


        IniciarComponentes();


        button_voltareq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Equipamentos_IIII.this, Tela_Inicial.class);
                startActivity(intent);

            }


        });

    }
        private void IniciarComponentes() {
            button_voltareq = findViewById(R.id.button_voltareq);
    }
}