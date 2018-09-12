package com.example.ademuz.foodtruck_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<String>pedido = new ArrayList<>();

        Button btn_pedido = (Button)findViewById(R.id.btn_enviar);

        btn_pedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");

                RadioButton rbtncomida1 =(RadioButton)findViewById(R.id.rbtn_comida1);
                RadioButton rbtncomida2 =(RadioButton)findViewById(R.id.rbtn_comida2);
                RadioButton rbtncomida3 =(RadioButton)findViewById(R.id.rbtn_comida3);
                RadioButton rbtnbebida1 =(RadioButton)findViewById(R.id.rbtn_bebida1);
                RadioButton rbtnbebida2 =(RadioButton)findViewById(R.id.rbtn_bebida2);
                RadioButton rbtnbebida3 =(RadioButton)findViewById(R.id.rbtn_bebida3);
                RadioButton rbtnpapas1 =(RadioButton)findViewById(R.id.rbtn_papas1);
                RadioButton rbtnpapas2 =(RadioButton)findViewById(R.id.rbtn_papas2);
                RadioButton rbtnpapas3 =(RadioButton)findViewById(R.id.rbtn_papas3);

                if(rbtncomida1.isChecked()){
                    pedido.add("Hamburguesa: " + rbtncomida1.getText().toString() + "\n");
                }
                if (rbtncomida2.isChecked()){
                    pedido.add("Hamburguesa: " + rbtncomida2.getText().toString() + "\n");
                }
                if (rbtncomida3.isChecked()){
                    pedido.add("Hamburguesa: " + rbtncomida3.getText().toString() + "\n");
                }
                if (rbtnbebida1.isChecked()){
                    pedido.add("Bebida: " + rbtnbebida1.getText().toString() + "\n");
                }
                if (rbtnbebida2.isChecked()){
                    pedido.add("Bebida: " + rbtnbebida2.getText().toString() + "\n");
                }
                if (rbtnbebida3.isChecked()){
                    pedido.add("Bebida: " + rbtnbebida3.getText().toString() + "\n");
                }
                if (rbtnpapas1.isChecked()){
                    pedido.add("Papas: " + rbtnpapas1.getText().toString() + "\n");
                }
                if (rbtnpapas2.isChecked()){
                    pedido.add("Papas: " + rbtnpapas2.getText().toString() + "\n");
                }
                if (rbtnpapas3.isChecked()){
                    pedido.add("Papas: " + rbtnpapas3.getText().toString() + "\n");
                }


                intent.putStringArrayListExtra(Intent.EXTRA_STREAM,pedido);

                if (null != intent.resolveActivity(getPackageManager())){
                    startActivity(Intent.createChooser(intent,"Escoja una aplicacion:"));
                    pedido.clear();
                }
            }
        });
    }
}
