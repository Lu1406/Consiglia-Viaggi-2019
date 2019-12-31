package com.example.consigliaviaggi2019nuovo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaNuovaRecensione extends AppCompatActivity {

    private Button PubblicaNomeCognome;
    private Button PubblicaNickname;
    private Spinner SpinnerPunteggioNuovaRecensione;
    String[] optionsNuovaRecensione = {"♥", "♥♥", "♥♥♥", "♥♥♥♥", "♥♥♥♥♥"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_nuova_recensione);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        PubblicaNomeCognome = (Button) findViewById(R.id.pubblica_nome_cognome);
        PubblicaNickname = (Button) findViewById(R.id.pubblica_nickname);

        PubblicaNomeCognome.setOnClickListener (new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                Context context = getApplicationContext();
                CharSequence text = "Recensione inviata agli amministratori!\n" +
                        "In attesa di approvazione.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent openPaginaStruttura = new Intent(PaginaNuovaRecensione.this, PaginaStruttura.class);
                startActivity(openPaginaStruttura);

            }
        });

        PubblicaNickname.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Context context = getApplicationContext();
                CharSequence text = "Recensione inviata agli amministratori!\n" +
                        "In attesa di approvazione.";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                Intent openPaginaStruttura = new Intent(PaginaNuovaRecensione.this, PaginaStruttura.class);
                startActivity(openPaginaStruttura);

            }
        });


        SpinnerPunteggioNuovaRecensione = (Spinner) findViewById(R.id.spinnerpunteggioNR);
        ArrayAdapter punteggipossibiliNuovaRecensione = new ArrayAdapter(PaginaNuovaRecensione.this, android.R.layout.simple_spinner_item, optionsNuovaRecensione);
        punteggipossibiliNuovaRecensione.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerPunteggioNuovaRecensione.setAdapter(punteggipossibiliNuovaRecensione);
        SpinnerPunteggioNuovaRecensione.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
