package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button EffettuaAccessoBtn = findViewById(R.id.effettua_accesso);
        EffettuaAccessoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openPaginaAccesso = new Intent(MainActivity.this, PaginaAccesso.class);
                startActivity(openPaginaAccesso);
            }


        });

        Button RegistratiBtn = findViewById(R.id.registrati);
        RegistratiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openPaginaRegistrazione = new Intent(MainActivity.this, PaginaRegistrazione.class);
                startActivity(openPaginaRegistrazione);
            }

        });


        Button AccediOspiteBtn = findViewById(R.id.accedi_come_ospite);
        AccediOspiteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openHomePage = new Intent(MainActivity.this, HomePage.class);
                startActivity(openHomePage);
            }
        });



    }





















}