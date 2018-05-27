package com.example.shantanu.bookmyshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    String s1,s2,s3,s5,s7,s9;
    TextView textview;
    int s4,s6,sum;
    ImageView imageview;
    Button rebook,exit;
    int[] limage = {R.drawable.pic2,R.drawable.pic1,R.drawable.pic4,R.drawable.pic3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textview = (TextView) findViewById(R.id.textView4);
        imageview = (ImageView) findViewById(R.id.imageView2);
        rebook = (Button) findViewById(R.id.button22);
        exit = (Button) findViewById(R.id.button23);

        final Intent intent = getIntent();
        s1 = intent.getStringExtra("et1");
        s2 = intent.getStringExtra("et2");
        s3 = intent.getStringExtra("et3");
        s4 = intent.getIntExtra("et4",0);
        s5 = intent.getStringExtra("et5");
        s6 = intent.getIntExtra("et6",0);
        s7 = intent.getStringExtra("et7");
        sum = intent.getIntExtra("et8",0);

        s9 = s7.replace(",", " ");

        textview.setText("\n   City  : "+s1+"\n   Cinema  : "+s2+"\n   Movie  : "+s3+"\n   Price  : "+s4*sum+"\n   Time  : "+s5+"\n   Seats  : "+s9);
        imageview.setImageResource(limage[s6]);

        rebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Main3Activity.this,MainActivity.class);
                startActivity(intent3);
            }
        });

       exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAffinity();
            }
        });

    }
}
