package com.example.comandadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText produto;
    private EditText valor;
    private Button enviar;
    private TextView quantidade;
    private double valorTotal = 0.0;
    private String valorTotalCalculo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produto = findViewById(R.id.editTextProduto);
        valor = findViewById(R.id.editTextValor);
        enviar = findViewById(R.id.buttonEnviar);
        quantidade = findViewById(R.id.textViewQauntidade);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String textoProduto = produto.getText().toString();
                String textoValor = valor.getText().toString();

                calcular();

                Intent intent = new Intent(MainActivity.this, ResumoActivity.class);
                intent.putExtra("produto", textoProduto );
                intent.putExtra("valor", textoValor);
                intent.putExtra("valorTotal", valorTotalCalculo );
                startActivity(intent);

            }
        });


    }

    public String calcular(){
       double valorCalculo = Double.valueOf(String.valueOf(valor.getText())).doubleValue();
       double quantidadeCalculo = Double.valueOf(String.valueOf(quantidade.getText())).doubleValue();

        valorTotal = valorCalculo * quantidadeCalculo;
        valorTotalCalculo = String.valueOf(valorTotal);
        return valorTotalCalculo;

    }

}