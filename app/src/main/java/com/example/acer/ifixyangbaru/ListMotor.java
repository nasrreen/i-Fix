package com.example.acer.ifixyangbaru;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListMotor extends AppCompatActivity {


    ListView listView;
    String [] restaurant = {"Chan Bikers", "Adam Motor", "AlexLee76 Bike"};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_car);

        listView = (ListView)findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, restaurant);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0 :
                        Intent nextActivity = new Intent(ListMotor.this, Motor1.class);
                        startActivity(nextActivity);

                        break;
                    case 1 :
                        // Next row of ListView
                        Intent nextActivity2 = new Intent(ListMotor.this, Motor2.class);
                        startActivity(nextActivity2);

                        break;
                    case 2 :
                        //call for third row
                        Intent nextActivity3 = new Intent(ListMotor.this,Motor3.class);
                        startActivity(nextActivity3);

                        break;

                    default:


                        break;
                }
            }
        });
    }
}

