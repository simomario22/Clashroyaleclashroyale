package com.tips.clashroyaleclashroyale;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class clashroyaleclashroyale_5 extends AppCompatActivity {

    private Button btn1 ;

    private EditText editnumber ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clashroyaleclashroyale_5);

        btn1 = (Button)findViewById(R.id.button5_1);
        editnumber = (EditText)findViewById(R.id.editText5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(),clashroyaleclashroyale_2.class);
                startActivity(intent);

            }
        });


    }
}
