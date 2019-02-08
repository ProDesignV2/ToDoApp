package com.example.photolog;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //ListView mainListView;
    //String[] items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resources res = getResources();
        ListView mainListView = (ListView) findViewById(R.id.mainListView);
        Button createButton = (Button) findViewById(R.id.createButton);

        String [] items = res.getStringArray(R.array.items);
        createButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, createScreenActivity.class));
            }
        });
    }


    }

