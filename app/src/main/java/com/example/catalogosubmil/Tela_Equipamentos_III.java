package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Equipamentos_III extends AppCompatActivity {

    Button button_proximoequipamentosIII;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_equipamentos_iii);
        getSupportActionBar().hide();

        IniciarComponentes();


        button_proximoequipamentosIII.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Equipamentos_III.this, Tela_Equipamentos_IIII.class);
                startActivity(intent);

            }


        });

    }
    private void IniciarComponentes() {
        button_proximoequipamentosIII = findViewById(R.id.button_proximoequipamentosIII);
    }
}