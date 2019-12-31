package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private Button Esci;
    private Button RicercaStruttura;
    private Button VisualizzaMappa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        //NomeCognome = "Ospite";
        //string NomeCognome = Controller.trovaNomeCognome(email)
        Esci = (Button)findViewById(R.id.esci);
        RicercaStruttura = (Button)findViewById(R.id.ricerca_struttura);
        VisualizzaMappa = (Button)findViewById(R.id.visualizza_mappa);

        Esci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent openPaginaIniziale = new Intent(HomePage.this, MainActivity.class);
                startActivity(openPaginaIniziale);

            }
        });


        RicercaStruttura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openFiltriRicercaStruttura = new Intent(HomePage.this, com.example.consigliaviaggi2019nuovo.FiltriRicercaStruttura.class);
                startActivity(openFiltriRicercaStruttura);
            }
        });

        VisualizzaMappa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaginaPosizioneAttuale = new Intent(HomePage.this, PaginaPosizioneAttuale.class);
                startActivity(openPaginaPosizioneAttuale);
            }
        });
    }
}
