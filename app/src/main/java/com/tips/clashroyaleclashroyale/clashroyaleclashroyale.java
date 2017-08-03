package com.tips.clashroyaleclashroyale;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class clashroyaleclashroyale extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale);


        int secondsDelayed = 4;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(clashroyaleclashroyale.this, clashroyaleclashroyale_1.class));
                finish();
            }
        }, secondsDelayed * 1000);
    }
}
