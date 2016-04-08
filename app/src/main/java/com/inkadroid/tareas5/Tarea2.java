package com.inkadroid.tareas5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Tarea2 extends MainActivity {

    private EditText edtPU , edtCant;
    private TextView txtBr, txtIgv, txtNeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea2);

        edtPU = (EditText) findViewById(R.id.edtPU);
        edtCant = (EditText) findViewById(R.id.edtCant);
        txtBr = (TextView) findViewById(R.id.txtBr);
        txtIgv = (TextView) findViewById(R.id.txtIgv);
        txtNeto = (TextView) findViewById(R.id.txtNeto);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarea2, menu);
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

    public void calc1(View view){

        try{
            double pu= Double.parseDouble(edtPU.getText().toString());
            double cant=Double.parseDouble(edtCant.getText().toString());

            // calculando el bruto
            double br=pu*cant;
            txtBr.setText(" " + String.valueOf(br));

            //sacando el igv
            double igv=br*0.18;
            txtIgv.setText(" " + String.valueOf(igv));

            //calculando el neto
            double neto=br+igv;
            txtNeto.setText(" " + String.valueOf(neto));

        }catch (Exception e){
            txtBr.setText("error");
            txtIgv.setText("error");
            txtNeto.setText("error");
        }

    }

    public void limpiar1(View view) {
        edtPU.setText("");
        edtCant.setText("");
        txtBr.setText("Cantidad * Precio Unitario");
        txtIgv.setText("Bruto * igv");
        txtNeto.setText("Bruto + igv");
    }

    public void cerrar(View view) {
        finish();
    }
}
