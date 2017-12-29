package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Krypto extends AppCompatActivity {
ImageButton a;
    ImageButton h;
    ImageButton w;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krypto);


        a = (ImageButton) findViewById(R.id.imageButton3);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0182107391"));
                startActivity(callIntent);
            }
        });

        h = (ImageButton) findViewById(R.id.imageButton2110);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q= Krypto Motorsports, 8, Jalan Keluli AN7/AN, Taman Perindustrian Bukit Raja Selatan, 40000 Shah Alam, Selangor");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }

        });

        w=(ImageButton)findViewById(R.id.imageButton2);
        w.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is emergency.I will send my current location  ");
                sendIntent.setType("text/plain");
                sendIntent.setPackage("com.whatsapp");
                startActivity(sendIntent);
            }
        });
}}





