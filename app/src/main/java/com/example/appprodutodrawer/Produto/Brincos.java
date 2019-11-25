package com.example.appprodutodrawer.Produto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.appprodutodrawer.R;

public class Brincos extends AppCompatActivity {

    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brincos);

        btn2 = findViewById(R.id.comprar2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Compra efetuada com sucesso!", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
