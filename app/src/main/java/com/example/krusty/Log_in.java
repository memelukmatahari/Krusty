package com.example.krusty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Log_in extends AppCompatActivity {

    Button login;
    TextView register;

    private ImageView cloud1,star;
    Animation animCloud,animStar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        cloud1 = findViewById(R.id.cloud1);
        star = findViewById(R.id.star);
        animCloud   = AnimationUtils.loadAnimation(this,R.anim.animcloud);
        animStar    = AnimationUtils.loadAnimation(this,R.anim.animstar);
        cloud1.startAnimation(animCloud);
        star.startAnimation(animStar);


        login = (Button) findViewById(R.id.btLogin);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent sigin = new Intent(Log_in.this, MainActivity.class);
                startActivity(sigin);
            }
        });


        register = (TextView) findViewById(R.id.tvRegister);

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent regis = new Intent(Log_in.this, Register.class);
                startActivity(regis);
            }
        });
    }
}
