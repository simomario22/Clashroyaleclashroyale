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
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class clashroyaleclashroyale_3 extends AppCompatActivity {

    private Button btn1 ;

    private EditText  editnumber ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale_3);

        // extra  from clashroyaleclashroyale_2
        String value = getIntent().getStringExtra("ads");

                    // ads banner
                    View adContainer = findViewById(R.id.adMobView);
                    AdView mAdView = new AdView(getApplicationContext());
                    mAdView.setAdSize(AdSize.SMART_BANNER);
                    mAdView.setAdUnitId(value);
                    ((RelativeLayout)adContainer).addView(mAdView);
                    AdRequest adRequest = new AdRequest.Builder().build();
                    mAdView.loadAd(adRequest);





        btn1 = (Button)findViewById(R.id.button3_1);
        editnumber = (EditText)findViewById(R.id.editText3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_2.class);
                startActivity(intent);

            }
        });


    }
}
