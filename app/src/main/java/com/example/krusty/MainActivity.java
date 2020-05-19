package com.example.krusty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView imCuci,imtreatment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imCuci = (ImageView) findViewById(R.id.cuci);
        imCuci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cuci = new Intent(MainActivity.this, Cuci.class);
                startActivity(cuci);
            }
        });

        imtreatment = (ImageView) findViewById(R.id.tretment);
        imtreatment.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent sigin = new Intent(MainActivity.this, Treatment.class);
                startActivity(sigin);
            }
        });


    }
}
