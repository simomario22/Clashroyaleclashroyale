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
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class clashroyaleclashroyale_7 extends AppCompatActivity {

    private Button btn1 , btn2 ;

    //  farebase
    private DatabaseReference mreferance ;

    // url  rate button

    private String rateUrl ;

    // for if buttton
    private int a ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale_7);

        // ads banner
        View adContainer = findViewById(R.id.adMobView);
        AdView mAdView = new AdView(this);
        mAdView.setAdSize(AdSize.SMART_BANNER);
        mAdView.setAdUnitId("ca-app-pub-3940256099942544/6300978111");
        ((RelativeLayout)adContainer).addView(mAdView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btn1 = (Button)findViewById(R.id.button7_1);
        btn2 = (Button )findViewById(R.id.button7_2);

        mreferance = FirebaseDatabase.getInstance().getReference().child("page7");
        mreferance.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                rateUrl = dataSnapshot.child("rate").getValue().toString();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse(rateUrl));
                startActivity(intent);

                a = 1;

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a==1){

                    moveTaskToBack(true);
                    android.os.Process.killProcess(android.os.Process.myPid());
                    System.exit(1);

                }else {

                    AlertDialog.Builder builder = new  AlertDialog.Builder(clashroyaleclashroyale_7.this);
                    builder.setMessage("This is the FINAL STEP ! You Need to Rate the App With 5 Stars");
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
