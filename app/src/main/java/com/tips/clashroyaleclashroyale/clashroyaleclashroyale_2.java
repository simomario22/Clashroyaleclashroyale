package com.tips.clashroyaleclashroyale;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.InterstitialAd;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class clashroyaleclashroyale_2 extends AppCompatActivity {

    // ads interstitial
    private InterstitialAd mInterstitialAd;

    //  farebase
    private DatabaseReference mreferance ;

    private Button  btn1 ,btn2 , btn3 , btn4 ,btn5 , btn6, btn7,  btn8 ;

    //  url  come from database
    private String appUrl1 , appUrl2 ,appUrl3 ,adIdinter , adIdbanner;

    //  hadi  3la 9bal button bach ya cliki darori
    private int  a ,b,c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale_2);


        btn1 = (Button)findViewById(R.id.button2_1);
        btn2 = (Button)findViewById(R.id.button2_2);
        btn3 = (Button)findViewById(R.id.button2_3);
        btn4 = (Button)findViewById(R.id.button2_4);
        btn5 = (Button)findViewById(R.id.button2_5);
        btn6 = (Button)findViewById(R.id.button2_6);
        btn7 = (Button)findViewById(R.id.button2_7);
        btn8 = (Button)findViewById(R.id.button2_8);





        // Firebase

        mreferance = FirebaseDatabase.getInstance().getReference().child("page2");
        mreferance.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                //  get value from database firebase
                appUrl1 = dataSnapshot.child("app1").getValue().toString();
                appUrl2 = dataSnapshot.child("app2").getValue().toString();
                appUrl3 = dataSnapshot.child("app3").getValue().toString();
                adIdbanner = dataSnapshot.child("ads_id_banner").getValue().toString();
                adIdinter = dataSnapshot.child("ads_id_inter").getValue().toString();

                //  if data ad_id retriv from servor work
                if (dataSnapshot.exists()){

                    // ads banner programed
                    View adContainer = findViewById(R.id.adMobView);
                    AdView mAdView = new AdView(getApplicationContext());
                    mAdView.setAdSize(AdSize.SMART_BANNER);
                    mAdView.setAdUnitId(adIdbanner);
                    ((RelativeLayout)adContainer).addView(mAdView);
                    AdRequest adRequest = new AdRequest.Builder().build();
                    mAdView.loadAd(adRequest);

                    // ads ineterstitial
                    mInterstitialAd = new InterstitialAd(getApplicationContext());
                    mInterstitialAd.setAdUnitId(adIdinter);
                    mInterstitialAd.loadAd(new AdRequest.Builder().build());

                    mInterstitialAd.setAdListener(new AdListener() {
                        @Override
                        public void onAdClosed() {
                            // Load the next interstitial.
                            mInterstitialAd.loadAd(new AdRequest.Builder().build());
                        }

                    });

                }



            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // intent  with putextra
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_3.class);
                intent.putExtra("ads",adIdbanner);
                startActivity(intent);

                // interstitial
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // intent with put extra
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_4.class);
                intent.putExtra("ads",adIdbanner);
                startActivity(intent);

                // interstitial
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }


            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_5.class);
                intent.putExtra("ads",adIdbanner);
                startActivity(intent);

                // interstitial
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }


            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_6.class);
                intent.putExtra("ads",adIdbanner);
                startActivity(intent);

                // interstitial
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }



            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(appUrl2));
                startActivity(intent);

                a = 1;

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(appUrl1));
                startActivity(intent);
                b = 1;

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(appUrl3));
                startActivity(intent);

                c = 1;
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //  chart  hta ycliki 3la buttons b 3

                if (a ==1 &&  b==1  && c== 1 ){

                    Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_7.class);
                    startActivity(intent);

                    // interstitial
                    if (mInterstitialAd.isLoaded()) {
                        mInterstitialAd.show();
                    }


                }else {

                    AlertDialog.Builder builder = new  AlertDialog.Builder(clashroyaleclashroyale_2.this);
                    builder.setMessage("You Need to Rate the Applications With 5 Stars. it's the IMPORTANT STEP");
                    builder.setCancelable(true);
                    builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();

                        }
                    });

                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }



            }
        });



    }
}
