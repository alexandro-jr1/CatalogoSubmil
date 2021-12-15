package com.example.catalogosubmil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Info extends AppCompatActivity {

    Button button_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_info);

        getSupportActionBar().hide();
        IniciarComponentes();

        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Tela_Info.this, Tela_Inicial.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarComponentes(){
        button_exit = findViewById(R.id.button_exit);
    }
}