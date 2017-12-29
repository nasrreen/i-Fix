package com.example.acer.ifixyangbaru;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListCar extends AppCompatActivity {


        ListView listView;
        String [] restaurant = {"Benz", "Krypto", "SS Mutiara Jaya"};

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
                            Intent nextActivity = new Intent(ListCar.this, Benz.class);
                            startActivity(nextActivity);

                            break;
                        case 1 :
                            // Next row of ListView
                            Intent nextActivity2 = new Intent(ListCar.this, Krypto.class);
                            startActivity(nextActivity2);

                            break;
                        case 2 :
                            //call for third row
                            Intent nextActivity3 = new Intent(ListCar.this, SeriMutiara.class);
                            startActivity(nextActivity3);

                            break;

                        default:


                            break;
                    }
                }
            });
        }
    }

