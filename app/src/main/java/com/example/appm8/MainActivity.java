package com.example.appm8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    void ferCalcul(String seleccio, Editable numero, int i){

        Toast.makeText(getApplicationContext(), seleccio, Toast.LENGTH_LONG).show();

        EditText segons = findViewById(R.id.editTextNumber5);
        EditText minuts = (EditText) findViewById(R.id.editTextNumber6);
        EditText hores = (EditText) findViewById(R.id.editTextNumber7);
        EditText anys = (EditText) findViewById(R.id.editTextNumber8);

        int val = 10000; //numero provisional.

        if(i == 0){

            float calculMinuts = (val/60);
            float calculHores = (val/60)/60;
            float calculAnys = ((val/60)/60)/8784;

            segons.setText((String) String.valueOf(numero));
            minuts.setText((String) String.valueOf(calculMinuts));
            hores.setText((String) String.valueOf(calculHores));
            anys.setText((String) String.valueOf(calculAnys));
        }
        if(i == 1){

        }
        if(i == 2){

        }
        if(i == 3){
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Spinner valorSpinner;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner valor_Spinner = (Spinner) findViewById(R.id.valorSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.unitats, android.R.layout.simple_spinner_item);

        valor_Spinner.setAdapter(adapter);

        valor_Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                EditText valorTextField = (EditText) findViewById(R.id.valorTextField);
                Editable numero = valorTextField.getText();
                Spinner spinner = (Spinner) findViewById(R.id.valorSpinner);
                String seleccio = spinner.getSelectedItem().toString();
                System.out.println(seleccio);
                ferCalcul(seleccio, numero, i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }






}