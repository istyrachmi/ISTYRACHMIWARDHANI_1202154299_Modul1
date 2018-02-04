package com.example.ISTYRACHMIWARDHANI_1202154299_Modul1.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ISTYRACHMIWARDHANI_1202154299_Modul1.ISTYRACHMIWARDHANI_1202154299_Modul1.R;


public class SecondActivity extends AppCompatActivity {

    TextView tempat,menumakanan,porsipesanan,harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent=getIntent();
        String HasilTempat =intent.getStringExtra("tempat");
        String Menu=intent.getStringExtra("menu");
        String Porsi=intent.getStringExtra("porsi");
        String Harga=intent.getStringExtra("harga");

        int Total= Integer.valueOf(Harga)* Integer.valueOf(Porsi);

        tempat =(TextView)findViewById(R.id.textView4);
        tempat.setText(HasilTempat);

        menumakanan =(TextView)findViewById(R.id.textView6);
        menumakanan.setText(Menu);

        porsipesanan =(TextView)findViewById(R.id.textView9);
        porsipesanan.setText(Porsi);

        harga=(TextView)findViewById(R.id.textView11);
        harga.setText(String.valueOf(Total));

        if (Total > 65000) {
            Toast peringatan =Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup",Toast.LENGTH_LONG);
            peringatan.show();

        } else{

            Toast peringatan =Toast.makeText(this, "Disini aja makan malamnya",Toast.LENGTH_LONG);
            peringatan.show();

        }
    }
}
