package com.inkadroid.tareas5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class Tarea3 extends MainActivity {

    private EditText edtSM;
    private TextView txtU, txtMon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea3);

        edtSM = (EditText) findViewById(R.id.edtSM);
        txtU = (TextView) findViewById(R.id.txtU);
        txtMon = (TextView)findViewById(R.id.txtMon);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarea3, menu);
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

    public void calc6(View view){
        double monto = Double.parseDouble(edtSM.getText().toString());
        double anual=monto*12;

        try{
        if(anual==26600){
            txtMon.setText("No Pagara NADA");
        }else{
            double div = anual/3800;
            txtU.setText(String.valueOf(div));

            if(div>7 && div<=12){
                txtMon.setText("1.520");
            }else if(div>12 && div<=27){
                txtMon.setText("7.980");
            }else if(div>27 && div<=42){
                txtMon.setText("9.690");
            }else if(div>42 && div<=52){
                txtMon.setText("7.600");
            }
        }}catch (Exception e){
            txtMon.setText("Error");
        }
    }

    public  void limpiar6(View view){
        edtSM.setText("");
        txtU.setText("Numero de UITs");
        txtMon.setText("Monto");
    }

    public void cerrar(View view) {
        finish();
    }
}
