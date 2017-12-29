package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Motor2 extends AppCompatActivity {
ImageButton e;
    ImageButton k;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_motor2);
        e=(ImageButton)findViewById(R.id.imageButton2110);
        e.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                Intent callIntent= new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:0172725120"));
                startActivity(callIntent);
            }
        });

        k = (ImageButton) findViewById(R.id.imageButton);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri gmmIntentUri = Uri.parse("geo:0,0?q= Adam Motor Performance, No. YG-19, Jalan Plumbum Y7/Y, Pusat Komersial Section 7, 40000, Shah Alam, Selangor, 40000 Shah Alam");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}