package com.tips.clashroyaleclashroyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class clashroyaleclashroyale_2 extends AppCompatActivity {


    private Button  btn1 ,btn2 , btn3 , btn4 ,btn5 , btn6, btn7,  btn8 ;


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


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_3.class);
                    startActivity(intent);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_4.class);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_5.class);
                startActivity(intent);

            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_6.class);
                startActivity(intent);


            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_7.class);
                startActivity(intent);

            }
        });



    }
}
