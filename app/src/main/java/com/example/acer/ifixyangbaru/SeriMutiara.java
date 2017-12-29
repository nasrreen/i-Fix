package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SeriMutiara extends AppCompatActivity {
ImageButton c;
    ImageButton i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seri_mutiara);

        c=(ImageButton)findViewById(R.id.imageButton4);
        c.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:055122428"));
                startActivity(callIntent);
            }
        });

        i=(ImageButton)findViewById(R.id.imageButton3);
        i.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q= Pusat Servis Ss Mutiara Jaya, No. 32, Jalan Utas A 15/A, Section 15, Selangor, 40000 Shah Alam");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });




    }}



