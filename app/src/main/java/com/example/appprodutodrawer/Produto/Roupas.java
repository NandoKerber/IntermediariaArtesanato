package com.example.appprodutodrawer.Produto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appprodutodrawer.R;

public class Roupas extends AppCompatActivity {
    private Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roupas);

        btn3 = findViewById(R.id.comprar3);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Compra efetuada com sucesso!", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
