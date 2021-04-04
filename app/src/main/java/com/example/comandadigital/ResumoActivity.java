package com.example.comandadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumoActivity extends AppCompatActivity {

    private TextView produtoResumo;
    private TextView valoResumo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        produtoResumo = findViewById(R.id.textViewProdutoResumo);
        valoResumo = findViewById(R.id.textViewValorResumo);



       Bundle dados = getIntent().getExtras();

       String textProduto = dados.getString("produto");
       String textValor = dados.getString("valor");

       produtoResumo.setText(textProduto);
       valoResumo.setText(textValor);




    }
}