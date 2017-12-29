package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class homepage extends AppCompatActivity {


    public ImageButton btnCar;
    public ImageButton btnMotor;
    public ImageButton btnAboutUs;
    public ImageButton imageButton8;
    public void init(){
        btnCar = (ImageButton)findViewById(R.id.btnCar);
        btnMotor = (ImageButton)findViewById(R.id.btnMotor);
        btnAboutUs = (ImageButton)findViewById(R.id.btnAboutUs);
       imageButton8 = (ImageButton)findViewById(R.id.imageButton8);

        btnCar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(homepage.this, ListCar.class);
                startActivity(intent);
            }
        });

        btnMotor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(homepage.this, ListMotor.class);
                startActivity(intent);
            }
        });

        btnAboutUs.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(homepage.this, AboutUs.class);
                startActivity(intent);
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(homepage.this, MapsActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        init();
    }
}
