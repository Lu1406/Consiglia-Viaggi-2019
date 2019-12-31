package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PaginaStruttura extends AppCompatActivity {

    private Button AggiungiRecensione;
    private Button VisualizzaRecensioni;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_struttura);

        AggiungiRecensione = (Button)findViewById(R.id.aggiungi_recensione);
        AggiungiRecensione.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent openPaginaNuovaRecensione = new Intent(PaginaStruttura.this, PaginaNuovaRecensione.class);
                startActivity(openPaginaNuovaRecensione);
            }
        });

        VisualizzaRecensioni = (Button)findViewById(R.id.visualizza_recensioni);
        VisualizzaRecensioni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaginaFiltriRicercaRecensione = new Intent(PaginaStruttura.this, FiltriRicercaRecensione.class);
                startActivity(openPaginaFiltriRicercaRecensione);
            }
        });
    }
}
