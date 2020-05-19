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

public class Register extends AppCompatActivity {

    TextView txlogin;

    private ImageView cloud1,star;
    Animation animCloud,animStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        cloud1 = findViewById(R.id.cloud1);
        star = findViewById(R.id.star);
        animCloud   = AnimationUtils.loadAnimation(this,R.anim.animcloud);
        animStar    = AnimationUtils.loadAnimation(this,R.anim.animstar);
        cloud1.startAnimation(animCloud);
        star.startAnimation(animStar);

        txlogin = (TextView) findViewById(R.id.txLogin);

        txlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sigin = new Intent(Register.this, Log_in.class);
                startActivity(sigin);
            }
        });

    }
}
