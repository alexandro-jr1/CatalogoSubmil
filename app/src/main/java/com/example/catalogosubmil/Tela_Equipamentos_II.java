package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Equipamentos_II extends AppCompatActivity {

    Button button_proximoequipamentosII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_equipamentos_ii);
        getSupportActionBar().hide();

        IniciarComponentes();


        button_proximoequipamentosII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Equipamentos_II.this, Tela_Equipamentos_III.class);
                startActivity(intent);

            }


        });

    }

        private void IniciarComponentes() {
        button_proximoequipamentosII = findViewById(R.id.button_proximoequipamentosII);
    }
}
