package com.example.consigliaviaggi2019nuovo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaRegistrazione extends AppCompatActivity {

    private EditText Nome;
    private EditText Cognome;
    private EditText Nickname;
    private EditText Email;
    private EditText Password;
    private Button Annulla;
    private Button Registrati;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_registrazione);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Nome = (EditText)findViewById(R.id.nome);
        Cognome = (EditText)findViewById(R.id.cognome);
        Nickname = (EditText)findViewById(R.id.nickname);
        Email = (EditText)findViewById(R.id.email);
        Password = (EditText)findViewById(R.id.password);

        /*Annulla = (Button)findViewById(R.id.annulla);
        Annulla.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                Intent openPaginaIniziale = new Intent(PaginaRegistrazione.this, MainActivity.class);
                startActivity(openPaginaIniziale);
            }
        });*/

        Registrati = (Button)findViewById(R.id.registrati);
        Registrati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Context context = getApplicationContext();
                CharSequence text = "La registrazione è avvenuta con successo.\nAccesso effettuato!";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();


                Intent openHomePage = new Intent(PaginaRegistrazione.this, HomePage.class);
                startActivity(openHomePage);
            }
        });
    }
}

//QUI MANCANO GLI ERRORI SUL NICKNAME O SULL'E-MAIL
