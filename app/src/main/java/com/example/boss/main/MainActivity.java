package com.example.boss.main;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText v1,v2,oper;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        v1 = (EditText) findViewById(R.id.value1);
        v2 = (EditText) findViewById(R.id.value2);
        oper = (EditText) findViewById(R.id.operator);
        b1 = (Button) findViewById(R.id.result1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calculate();
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

    public void Calculate(){
        String a = v1.getText().toString();
        int aa = Integer.valueOf(a);
        int b = Integer.valueOf(v2.getText().toString());
        String operator = oper.getText().toString();

        // why i am declaring int result here ?

        int resulto = 1;

        switch (operator){
            case "+":
                resulto = aa + b;
                break;
            case "-":
                resulto = aa - b;
                break;
            case "/":
                resulto = aa / b;
                break;
            case "*":
                resulto = aa * b;
                break;
        }



        EditText re = (EditText) findViewById(R.id.result);
        re.setText(String.valueOf(resulto));
    }




}
