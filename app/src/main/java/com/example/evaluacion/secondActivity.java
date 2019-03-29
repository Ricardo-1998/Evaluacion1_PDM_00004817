package com.example.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.evaluacion.utilities.appConstants;

public class secondActivity extends AppCompatActivity {
    Button mButton;
    String resultado;
    TextView usuario, email, total;
    TextView resultado1,resultado2,resultado3,resultado4,resultado5,resultado6,resultado7,resultado8,resultado9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bindView();

        Intent mIntent = getIntent();

        if (mIntent!=null) {
            usuario.setText(mIntent.getStringExtra(appConstants.TEXT_KEY));
            email.setText(mIntent.getStringExtra(appConstants.TEXT_KEY2));
            total.setText(mIntent.getStringExtra(appConstants.TEXT_KEY13));

            resultado1.setText(mIntent.getStringExtra(appConstants.TEXT_KEY4));
            resultado2.setText(mIntent.getStringExtra(appConstants.TEXT_KEY5));
            resultado3.setText(mIntent.getStringExtra(appConstants.TEXT_KEY6));
            resultado4.setText(mIntent.getStringExtra(appConstants.TEXT_KEY7));
            resultado5.setText(mIntent.getStringExtra(appConstants.TEXT_KEY8));
            resultado6.setText(mIntent.getStringExtra(appConstants.TEXT_KEY9));
            resultado7.setText(mIntent.getStringExtra(appConstants.TEXT_KEY10));
            resultado8.setText(mIntent.getStringExtra(appConstants.TEXT_KEY11));
            resultado9.setText(mIntent.getStringExtra(appConstants.TEXT_KEY12));




        }


        mButton.setOnClickListener(v->{
            resultado ="User: "+mIntent.getStringExtra(appConstants.TEXT_KEY) + "\n"+"Emai: "+ mIntent.getStringExtra(appConstants.TEXT_KEY2);
            Intent mIntent2 = new Intent();
            mIntent2.setAction(Intent.ACTION_SEND);
            mIntent2.setType("text/plain");
            mIntent2.putExtra(Intent.EXTRA_TEXT,resultado);
            startActivity(mIntent2);

        });
    }

    public void bindView(){
        resultado1 = findViewById(R.id.resultado1);
        resultado2 = findViewById(R.id.resultado2);
        resultado3 = findViewById(R.id.resultado3);
        resultado4 = findViewById(R.id.resultado4);
        resultado5 = findViewById(R.id.resultado5);
        resultado6 = findViewById(R.id.resultado6);
        resultado7 = findViewById(R.id.resultado7);
        resultado8 = findViewById(R.id.resultado8);
        resultado9 = findViewById(R.id.resultado9);
        mButton = findViewById(R.id.bt_share);
        total = findViewById(R.id.total_productos);

        usuario = findViewById(R.id.user_second);
        email = findViewById(R.id.email_second);

    }

}
