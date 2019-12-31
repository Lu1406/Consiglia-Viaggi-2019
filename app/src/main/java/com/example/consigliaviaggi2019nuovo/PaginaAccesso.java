package com.example.consigliaviaggi2019nuovo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class PaginaAccesso extends AppCompatActivity {

    private EditText Email;
    private EditText Password;
    private Button Accedi;
    private Button Annulla;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_accesso);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        Email = (EditText)findViewById(R.id.editEmail);
        Password = (EditText)findViewById(R.id.editPassword);
        Accedi = (Button)findViewById(R.id.accedi);
        //Annulla = (Button)findViewById(R.id.annulla);

        Accedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Email.getText().toString().equals("giovanni.palomba95@live.it") && Password.getText().toString().equals("1234")){
                    Intent openHomePage = new Intent(PaginaAccesso.this, HomePage.class);
                    startActivity(openHomePage);
                }
                else{

                    /*Context context = getApplicationContext(); //PER I MESSAGGI DI SUCCESSO
                    CharSequence text = "Errore!\nCredenziali errate!";
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();*/


                    AlertDialog.Builder popupErrAccesso = new AlertDialog.Builder(PaginaAccesso.this); //PER I MESSAGGI DI ERRORE
                    popupErrAccesso.setTitle("Errore:");
                    popupErrAccesso.setMessage("Credenziali errate!");
                    AlertDialog alert = popupErrAccesso.create();
                    alert.show();

                }

            }
        });


        /*Annulla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openPaginaIniziale = new Intent(PaginaAccesso.this, MainActivity.class);
                startActivity(openPaginaIniziale);
            }
        });*/
    }


  /*  private void validate(String editEmail, String editPassword){

        if(editEmail == "ciao" && editPassword == "ciao"){
            Accedi.setEnabled(true);
            Intent openHomePage = new Intent(PaginaAccesso.this, HomePage.class);
            startActivity(openHomePage);

        }

        else{


           Accedi.setEnabled(false);
            AlertDialog.Builder popupErrAccesso = new AlertDialog.Builder(this);
            popupErrAccesso.setTitle("Errore!");
            popupErrAccesso.setMessage("Credenziali errate!");
            AlertDialog alert = popupErrAccesso.create();
            alert.show();

        }

    }*/
}
