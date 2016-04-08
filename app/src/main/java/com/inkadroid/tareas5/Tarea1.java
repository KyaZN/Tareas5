package com.inkadroid.tareas5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Tarea1 extends MainActivity {

    private EditText edtSB1, edtHT, edtHF;
    private TextView txtSuBru, txtFondo, txtComi , txtPS , txtFaltas, txtAport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea1);

        edtSB1 = (EditText) findViewById(R.id.edtSB);
        edtHT = (EditText) findViewById(R.id.edtHT);
        edtHF = (EditText) findViewById(R.id.edtHF);
        txtFondo = (TextView) findViewById(R.id.txtFondo);
        txtComi = (TextView) findViewById(R.id.txtComision);
        txtPS = (TextView) findViewById(R.id.txtPS);
        txtFaltas = (TextView) findViewById(R.id.txtFaltas);
        txtAport = (TextView) findViewById(R.id.txtAport);
        txtSuBru = (TextView) findViewById(R.id.txtSuBru);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarea1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calc(View view){

        try {
            double s = Double.parseDouble(edtSB1.getText().toString());
            double ht = Double.parseDouble(edtHT.getText().toString());

            //calcular el sueldo bruto
            double bru = ht*((s/30)/8);
            txtSuBru.setText(String.valueOf(bru));

            //calcular la AFP tres variables
            double fondo , comision , prima;
            fondo= s*0.1;
            comision= s*0.01;
            prima=s*0.0098;
            txtFondo.setText("Fondo : " + fondo);
            txtComi.setText("Comisión : " + comision);
            txtPS.setText("Prima de Seguro : " + prima);

            //calcular faltas
            double hf = Double.parseDouble(edtHF.getText().toString());
            double falta = hf*((s/30)/8);
            txtFaltas.setText(String.valueOf(falta));

            //calcular aporte
            double apo = s*0.09;
            txtAport.setText(String.valueOf(apo));

        }catch(Exception e){
            txtSuBru.setText("error");
        }
    }

    public void limpiar(View view) {
        edtSB1.setText("");
        edtHT.setText("");
        edtHF.setText("");
        txtFondo.setText("Fondo");
        txtComi.setText("Comisión Variable");
        txtPS.setText("Prima de Seguro");
        txtFaltas.setText("Numero de Horas de Falta");
        txtAport.setText("EsSalud");
        txtSuBru.setText("En base al Sueldo Básico");
    }

    public void cerrar(View view) {
        finish();
    }
}
