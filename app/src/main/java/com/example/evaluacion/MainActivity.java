package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.evaluacion.utilities.appConstants;

import java.util.concurrent.atomic.AtomicInteger;

public class MainActivity extends AppCompatActivity {
    TextView contador1,contador2,contador3,contador4,contador5,contador6,contador7,contador8,contador9;
    EditText usuario, email;
    Button Btsend;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] cont1 = {0,0,0,0,0,0,0,0,0};
        AtomicInteger numero= new AtomicInteger();

        bindView();

        contador1.setOnClickListener(v-> cont1[0]++);
        contador2.setOnClickListener(v1-> cont1[1]++);
        contador3.setOnClickListener(v2-> cont1[2]++);
        contador4.setOnClickListener(v3-> cont1[3]++);
        contador5.setOnClickListener(v4-> cont1[4]++);
        contador6.setOnClickListener(v5-> cont1[5]++);
        contador7.setOnClickListener(v6-> cont1[6]++);
        contador8.setOnClickListener(v7-> cont1[7]++);
        contador9.setOnClickListener(v8-> cont1[8]++);



        Btsend.setOnClickListener(v->{
            if (verificacion()) {
                numero.set(cont1[0] + cont1[1] + cont1[2] + cont1[3] + cont1[4] + cont1[5] + cont1[6] + cont1[7] + cont1[8]);
                Intent intent = new Intent(this, secondActivity.class);
                intent.putExtra(appConstants.TEXT_KEY, usuario.getText().toString());
                intent.putExtra(appConstants.TEXT_KEY2, email.getText().toString());

                intent.putExtra(appConstants.TEXT_KEY4, cont1[0]+"");
                intent.putExtra(appConstants.TEXT_KEY5, cont1[1]+"");
                intent.putExtra(appConstants.TEXT_KEY6, cont1[2]+"");
                intent.putExtra(appConstants.TEXT_KEY7, cont1[3]+"");
                intent.putExtra(appConstants.TEXT_KEY8, cont1[4]+"");
                intent.putExtra(appConstants.TEXT_KEY9, cont1[5]+"");
                intent.putExtra(appConstants.TEXT_KEY10, cont1[6]+"");
                intent.putExtra(appConstants.TEXT_KEY11, cont1[7]+"");
                intent.putExtra(appConstants.TEXT_KEY12, cont1[8]+"");
                intent.putExtra(appConstants.TEXT_KEY13, numero+"");

                startActivity(intent);
            }



        });
    }

    public void bindView(){
        contador1 = findViewById(R.id.contador1);
        contador2 = findViewById(R.id.contador2);
        contador3 = findViewById(R.id.contador3);
        contador4 = findViewById(R.id.contador4);
        contador5 = findViewById(R.id.contador5);
        contador6 = findViewById(R.id.contador6);
        contador7 = findViewById(R.id.contador7);
        contador8 = findViewById(R.id.contador8);
        contador9 = findViewById(R.id.contador9);

        usuario = findViewById(R.id.usuario);
        email = findViewById(R.id.email);
        Btsend = findViewById(R.id.bt_send);

    }

    public boolean verificacion(){
        if (usuario.getText().toString().equals("")) {
            usuario.setError("Obligatorio");
            return false;
        }
        if (email.getText().toString().equals("")){
            email.setError("Obligatorio");
            return false;
        }
        return true;
    }


}
