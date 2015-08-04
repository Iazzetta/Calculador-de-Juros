package com.example.rm71819.juros;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {


    private TextView txtValorFinanciamento;
    private TextView txtNumeroMeses;
    private TextView txtTaxaJuros;
    private String resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtValorFinanciamento = (TextView) findViewById(R.id.txtValorFinanciamento);
        txtNumeroMeses = (TextView) findViewById(R.id.txtNumeroMeses);
        txtTaxaJuros = (TextView) findViewById(R.id.txtTaxaJuros);

    }


    public void calcular(View v){

        Double ve = Double.parseDouble(txtValorFinanciamento.getText().toString());
        Integer nm = Integer.parseInt(txtNumeroMeses.getText().toString());
        Double juros = Double.parseDouble(txtTaxaJuros.getText().toString());



        Intent i = new Intent(this, Activity2.class);
        i.putExtra("valor", ve);
        i.putExtra("meses", nm);
        i.putExtra("juros", juros);

        this.startActivity(i);

    }

}
