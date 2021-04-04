package com.example.comandadigital;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText produto;
    private EditText valor;
    private Button enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produto = findViewById(R.id.editTextProduto);
        valor = findViewById(R.id.editTextValor);
        enviar = findViewById(R.id.buttonEnviar);

        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoProduto = produto.getText().toString();
                String textoValor = valor.getText().toString();

                Intent intent = new Intent(MainActivity.this, ResumoActivity.class);
                intent.putExtra("produto", textoProduto );
                intent.putExtra("valor", "R$ " + textoValor);
                startActivity(intent);

            }
        });


    }

}