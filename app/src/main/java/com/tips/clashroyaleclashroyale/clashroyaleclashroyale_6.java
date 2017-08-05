package com.tips.clashroyaleclashroyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class clashroyaleclashroyale_6 extends AppCompatActivity {

    private Button btn1 ;

    private EditText editnumber ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale_6);

        // ads banner
        View adContainer = findViewById(R.id.adMobView);
        AdView mAdView = new AdView(this);
        mAdView.setAdSize(AdSize.SMART_BANNER);
        mAdView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        ((RelativeLayout)adContainer).addView(mAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        btn1 = (Button)findViewById(R.id.button6_1);
        editnumber = (EditText)findViewById(R.id.editText6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_2.class);
                startActivity(intent);

            }
        });


    }
}
