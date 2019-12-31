package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class FiltriRicercaRecensione extends AppCompatActivity {

    private Button Ok;
    private Spinner SpinnerPunteggioFiltriRicercaRecensione;
    String[] optionsFiltriRicercaRecensione = {"♥", "♥♥", "♥♥♥", "♥♥♥♥", "♥♥♥♥♥"};
    private Spinner SpinnerPeriodoRecensione;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtri_ricerca_recensione);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Ok = (Button) findViewById(R.id.okbottone);
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaginaRecensioni = new Intent(FiltriRicercaRecensione.this, PaginaRecensioni.class);
                startActivity(openPaginaRecensioni);

            }
        });
        SpinnerPunteggioFiltriRicercaRecensione = (Spinner) findViewById(R.id.spinnerpunteggioFRR);
        ArrayAdapter punteggiFiltriRicercaRecensione = new ArrayAdapter(FiltriRicercaRecensione.this, android.R.layout.simple_spinner_item, optionsFiltriRicercaRecensione);
        punteggiFiltriRicercaRecensione.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerPunteggioFiltriRicercaRecensione.setAdapter(punteggiFiltriRicercaRecensione);
        SpinnerPunteggioFiltriRicercaRecensione.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        SpinnerPeriodoRecensione = (Spinner) findViewById(R.id.spinnerpunteggioFRR);
        ArrayAdapter PeriodoRecensione = new ArrayAdapter(FiltriRicercaRecensione.this, android.R.layout.simple_spinner_item, optionsFiltriRicercaRecensione);
        PeriodoRecensione.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerPeriodoRecensione.setAdapter(PeriodoRecensione);
        SpinnerPeriodoRecensione.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}


//ATTENZIONE NON CI SONO RECENSIONI PER LA STRUTTURA SPECIFICATA
