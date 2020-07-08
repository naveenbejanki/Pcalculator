
package com.naveen.pcalculator;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterperentage;
    private EditText enternumber;
    private TextView txtresulte;
    private Button btnresulte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

         enternumber=(EditText)findViewById(R.id.edtnumber);
         enterperentage=(EditText)findViewById(R.id.edtperentage);
         txtresulte=(TextView) findViewById(R.id.txtresulte);
         btnresulte=(Button) findViewById(R.id.btnresulte);
         btnresulte.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 float perentagenumbericvalue=Float.parseFloat(enterperentage.getText().toString());
                 float decimalvalue=perentagenumbericvalue/100;
                 float result=decimalvalue * Float.parseFloat(enternumber.getText().toString());
                 txtresulte.setText(Float.toString(result));



             }
         });




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
}