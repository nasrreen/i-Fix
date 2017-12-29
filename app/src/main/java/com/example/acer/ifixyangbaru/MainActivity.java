package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button indexButton;

    public void init(){
        indexButton = (Button)findViewById(R.id.indexButton);
        indexButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, homepage.class);
                startActivity(intent);

                Toast toast = Toast.makeText(MainActivity.this, "WELCOME TO i-Fix!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }


}
