package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FiltriRicercaStruttura extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private Button Ok;
    private EditText NomeStruttura;
    private EditText Città;
    private Spinner SpinnerPunteggio;
    String[] options = {"♥", "♥♥", "♥♥♥", "♥♥♥♥", "♥♥♥♥♥"};

    private CheckBox Hotel, Ristorante, Pub, Pizzeria, Bar, Gelateria, Pasticceria, Parco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtri_ricerca_struttura);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NomeStruttura = (EditText)findViewById(R.id.nomestruttura);
        Città = (EditText)findViewById(R.id.città);

        SpinnerPunteggio = (Spinner)findViewById(R.id.spinnerpunteggio);
        ArrayAdapter punteggipossibili = new ArrayAdapter(FiltriRicercaStruttura.this, android.R.layout.simple_spinner_item, options);
        punteggipossibili.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        SpinnerPunteggio.setAdapter(punteggipossibili);
        SpinnerPunteggio.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

       /* Hotel = (CheckBox)findViewById(R.id.checkBox_hotel);
        Ristorante = (CheckBox)findViewById(R.id.checkBox_ristorante);
        Pub = (CheckBox)findViewById(R.id.checkBox_pub);
        Pizzeria = (CheckBox)findViewById(R.id.checkBox_pizzeria);
        Bar = (CheckBox)findViewById(R.id.checkBox_bar);
        Gelateria = (CheckBox)findViewById(R.id.checkBox_gelateria);
        Pasticceria = (CheckBox)findViewById(R.id.checkBox_pasticceria);
        Parco = (CheckBox)findViewById(R.id.checkBox_parco);*/

        Ok = (Button)findViewById(R.id.ok_bottone);
        Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRisultatiRicercaStruttura = new Intent(FiltriRicercaStruttura.this, RisultatiRicercaStruttura.class);
                startActivity(openRisultatiRicercaStruttura);

               /* StringBuffer tipostruttura = new StringBuffer();
                tipostruttura.append("Hotel : ").append(Hotel.isChecked());
                tipostruttura.append("Ristorante : ").append(Ristorante.isChecked());
                tipostruttura.append("Pub : ").append(Pub.isChecked());
                tipostruttura.append("Pizzeria : ").append(Pizzeria.isChecked());
                tipostruttura.append("Bar : ").append(Bar.isChecked());
                tipostruttura.append("Gelateria : ").append(Gelateria.isChecked());
                tipostruttura.append("Pasticceria : ").append(Pasticceria.isChecked());
                tipostruttura.append("Parco dei divertimenti : ").append(Parco.isChecked());

                Toast.makeText(FiltriRicercaStruttura.this, tipostruttura.toString(), Toast.LENGTH_LONG).show();*/

            }
        });
    }




    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
