package com.example.ISTYRACHMIWARDHANI_1202154299_Modul1.studycase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ISTYRACHMIWARDHANI_1202154299_Modul1.ISTYRACHMIWARDHANI_1202154299_Modul1;

public class SecondActivity extends AppCompatActivity {

    TextView tempat,menumakanan,porsipesanan,harga;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ISTYRACHMIWARDHANI_1202154299_Modul1.R.layout.activity_second);

        Intent intent=getIntent();
        String HasilTempat =intent.getStringExtra("tempat");
        String Menu=intent.getStringExtra("menu");
        String Porsi=intent.getStringExtra("porsi");
        String Harga=intent.getStringExtra("harga");

        int Total= Integer.valueOf(Harga)* Integer.valueOf(Porsi);

        tempat =(TextView)findViewById(ISTYRACHMIWARDHANI_1202154299_Modul1.R.id.rumahmakan);
        tempat.setText(HasilTempat);

        menumakanan =(TextView)findViewById(ISTYRACHMIWARDHANI_1202154299_Modul1.R.id.menum);
        menumakanan.setText(Menu);

        porsipesanan =(TextView)findViewById(ISTYRACHMIWARDHANI_1202154299_Modul1.R.id.porsi);
        porsipesanan.setText(Porsi);

        harga=(TextView)findViewById(ISTYRACHMIWARDHANI_1202154299_Modul1.R.id.hargah);
        harga.setText(String.valueOf(Total));

        if (Total > 65000) {
            Toast peringatan =Toast.makeText(this, "Jangan disini makan",Toast.LENGTH_LONG);
            peringatan.show();

        } else{

            Toast peringatan =Toast.makeText(this, "Disini aja makanya",Toast.LENGTH_LONG);
            peringatan.show();

        }
    }
}
