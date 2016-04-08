package com.inkadroid.tareas5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Tarea4 extends MainActivity {

    private EditText edtTraba, edtOtorg;
    private TextView txtTotal,txtPend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea4);

        edtTraba = (EditText) findViewById(R.id.edtTraba);
        edtOtorg = (EditText) findViewById(R.id.edtOtorg);
        txtTotal = (TextView) findViewById(R.id.txtTotal);
        txtPend = (TextView) findViewById(R.id.txtPend);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarea4, menu);
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

    public void calc2(View view){

        try{

        double anio = Double.parseDouble(edtTraba.getText().toString());
        double otorg = Double.parseDouble(edtOtorg.getText().toString());

        //calcular el numero de dias en total
        double total = anio*30;
        txtTotal.setText(String.valueOf(total));

        //calcular los dias restantes
        double pend = total - otorg;
        txtPend.setText(String.valueOf(pend));

        }catch (Exception e){
            txtTotal.setText("error");
            txtPend.setText("error");
        }

    }

    public void limpiar2(View view){
        edtTraba.setText("");
        edtOtorg.setText("");
        txtTotal.setText("Total de Dias");
        txtPend.setText("Dias Pendientes");
    }

    public void cerrar(View view) {
        finish();
    }
}
