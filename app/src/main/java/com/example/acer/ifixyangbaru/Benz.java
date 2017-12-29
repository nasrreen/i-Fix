package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.*;
public class Benz extends AppCompatActivity {
ImageButton b;
ImageButton g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benz);

        b=(ImageButton)findViewById(R.id.call);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0333583766"));
                startActivity(callIntent);
            }
        });

        g=(ImageButton)findViewById(R.id.imageButton2110);
        g.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q= Benz Tech Car Care (SA) Sdn Bhd, Taman TTDI Jaya, 40150 Shah Alam, Selangor");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });






    }}


