package com.example.rm71819.juros;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


public class Activity2 extends ActionBarActivity {

    private String resultado;
    private TextView txtTotalJuros;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

            txtTotalJuros = (TextView) findViewById(R.id.txtTotalJuros);

            //Exibir resultado
            Bundle b = getIntent().getExtras();
            Double valor = b.getDouble("valor");
            Integer meses = b.getInt("meses");
            Double juros = b.getDouble("juros");

            Double res = valor * meses * ( juros / 100);

            txtTotalJuros.setText(String.valueOf(res));


    }


    public void fechar(View v){
        this.finish();
    }
}
