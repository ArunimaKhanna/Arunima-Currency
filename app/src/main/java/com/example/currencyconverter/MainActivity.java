package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        public void convertCurrency(View view){

        EditText editText = (EditText) findViewById(R.id.editText4);
        String amountInDollars = editText.getText().toString();
        double amountInDollarsDouble = Double.parseDouble(amountInDollars);
        double amountInRupeesDouble = amountInDollarsDouble *67;
        String amountInRupeesString = String.format("%.2f",amountInRupeesDouble);
            Toast.makeText(this,"$"+ amountInDollars+"is Rupees "+amountInRupeesString,Toast.LENGTH_LONG).show();

        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
