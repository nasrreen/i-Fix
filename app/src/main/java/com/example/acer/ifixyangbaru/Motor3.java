package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Motor3 extends AppCompatActivity {
ImageButton f;
    ImageButton l;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor3);

        f=(ImageButton)findViewById(R.id.imageButton20);
        f.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0166666894"));
                startActivity(callIntent);
            }
        });
        l = (ImageButton) findViewById(R.id.imageButton);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q= Alexlee76 Bike Wash & Services, 7, Jalan Unggul 25/40, Seksyen 25, 42450 Shah Alam, Selangor");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}