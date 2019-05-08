package com.example.pruebagit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pulsa = (Button) findViewById(R.id.pulsa);
        Button preciona=(Button) findViewById(R.id.preciona);
        Button selecciona=(Button) findViewById(R.id.selecciona);
        Button envia=(Button)findViewById(R.id.envia);

        pulsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cambio de Zulema",Toast.LENGTH_SHORT).show();
            }
        });

        preciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cambio Jaqueline", Toast.LENGTH_LONG).show();
            }
        });

        selecciona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cambio Ximena", Toast.LENGTH_LONG).show();
            }
        });
        envia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cambio Jose", Toast.LENGTH_LONG).show();
            }
        });
    }
}
