package com.inkadroid.tareas5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Tarea5 extends MainActivity implements View.OnClickListener {

    TextView txtMonto;
    Double[] num = new Double[20];
    Double result;
    boolean suma = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea5);

        txtMonto = (TextView) findViewById(R.id.txtMonto);

        Button bPW = (Button) findViewById(R.id.bPW);
        bPW.setOnClickListener(this);
        Button bD = (Button) findViewById(R.id.bD);
        bD.setOnClickListener(this);
        Button bH = (Button) findViewById(R.id.bH);
        bH.setOnClickListener(this);
        Button bRS = (Button) findViewById(R.id.bRS);
        bRS.setOnClickListener(this);
        Button bV = (Button) findViewById(R.id.bV);
        bV.setOnClickListener(this);
        Button bCE = (Button) findViewById(R.id.bCE);
        bCE.setOnClickListener(this);
        Button bCalc = (Button) findViewById(R.id.bCalc);
        bCalc.setOnClickListener(this);
        Button bSumar = (Button) findViewById(R.id.bSumar);
        bSumar.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tarea5, menu);
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

    public void limpi(View view) {
        txtMonto.setText("0");
    }

    public void cerrar5(View view) {
        finish();
    }

    @Override
    public void onClick(View view) {

        TextView txtMonto = (TextView) findViewById(R.id.txtMonto);
        int seleccion = view.getId();
        String a= txtMonto.getText().toString();

        try {
            switch(seleccion) {
                case R.id.bPW:
                    suma = false;
                    txtMonto.setText(a + " 500 ");
                    break;
                case R.id.bH:
                    suma = false;
                    txtMonto.setText(a + " 350 ");
                    break;
                case R.id.bD:
                    suma = false;
                    txtMonto.setText(a + " 700 ");
                    break;
                case R.id.bRS:
                    suma = false;
                    txtMonto.setText(a + " 450 ");
                    break;
                case R.id.bV:
                    suma = false;
                    txtMonto.setText(a + " 800 ");
                    break;
                case R.id.bCE:
                    suma = false;
                    txtMonto.setText(a + " 400 ");
                    break;
                case R.id.bSumar:
                    suma = true;
                    num[0] = Double.parseDouble(a);
                    txtMonto.setText(a + " + ");
                    break;
                case R.id.bCalc:
                    //num[1]= Double.parseDouble(a);

                    if(suma == true){
                        result = num[0] + num[1];
                        txtMonto.setText(String.valueOf(result));
                    }else{
                        txtMonto.setText("Lo sentimos :'(");
                    }
                    suma = false;
                    break;
            }
        }catch (Exception e){
            txtMonto.setText("Error");
        }
    }

}