package com.inkadroid.tareas5;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public void lanzar(View view) {
        Intent i = new Intent(this,Tarea1.class);
        startActivity(i);
    }

    public void lanzar1(View view) {
        Intent i = new Intent(this,Tarea2.class);
        startActivity(i);
    }

    public void lanzar2(View view) {
        Intent i = new Intent(this,Tarea3.class);
        startActivity(i);
    }

    public void lanzar3(View view) {
        Intent i = new Intent(this,Tarea4.class);
        startActivity(i);
    }

    public void lanzar4(View view) {
        Intent i = new Intent(this,Tarea5.class);
        startActivity(i);
    }

    public void cerrar(View view) {
        finish();
    }

}
