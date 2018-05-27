package com.example.shantanu.bookmyshow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21;
    int count,count1,count2,count3,count4,count5,count6,count7,count8,count9,count10,count11,count12,count13,count14,count15,count16,s6,s4;
    String s1,s2,s3,s5,b5="",b6="",b7="",b8="",b9="",b10="",b11="",b12="",b13="",b14="",b15="",b16="",b17="",b18="",b19="",b20="",b21="";
    int sum=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);


        Intent intent = getIntent();
        s1 = intent.getStringExtra("et1");
        s2 = intent.getStringExtra("et2");
        s3 = intent.getStringExtra("et3");
        s4 = intent.getIntExtra("et4",0);
        s5 = intent.getStringExtra("et5");
        s6 = intent.getIntExtra("et6",0);

        count=0;
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count%2==0)
                {
                    button5.setBackgroundResource(R.drawable.crectangle);
                    b5="C1,";
                    count++;
                    sum++;
                }
                else
                {
                    button5.setBackgroundResource(R.drawable.rectangle);
                    b5="";
                    sum--;
                    count++;
                }
            }
        });

        count1=0;
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count1%2==0)
                {
                    button6.setBackgroundResource(R.drawable.crectangle);
                    b6="C2,";
                    count1++;sum++;
                }
                else
                {
                    button6.setBackgroundResource(R.drawable.rectangle);
                    b6="";
                    count1++;sum--;
                }
            }
        });

        count2=0;
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count2%2==0)
                {
                    button7.setBackgroundResource(R.drawable.crectangle);
                    b7="C3,";
                    count2++;sum++;
                }
                else
                {
                    button7.setBackgroundResource(R.drawable.rectangle);
                    b7="";
                    count2++;sum--;
                }
            }
        });

        count3=0;
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count3%2==0)
                {
                    button8.setBackgroundResource(R.drawable.crectangle);
                    b8="C4,";
                    count3++;sum++;
                }
                else
                {
                    button8.setBackgroundResource(R.drawable.rectangle);
                    b8="";sum--;
                    count3++;
                }
            }
        });

        count4=0;
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count4%2==0)
                {
                    button9.setBackgroundResource(R.drawable.crectangle);
                    b9="C5,";
                    count4++;sum++;
                }
                else
                {
                    button9.setBackgroundResource(R.drawable.rectangle);
                    b9="";
                    count4++;sum--;
                }
            }
        });

        count5=0;
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count5%2==0)
                {
                    button10.setBackgroundResource(R.drawable.crectangle);
                    b10="C7,";sum++;
                    count5++;
                }
                else
                {
                    button10.setBackgroundResource(R.drawable.rectangle);
                    b10="";
                    count5++;sum--;
                }
            }
        });

        count6=0;
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count6%2==0)
                {
                    button11.setBackgroundResource(R.drawable.crectangle);
                    b11="C6,";
                    count6++;sum++;
                }
                else
                {
                    button11.setBackgroundResource(R.drawable.rectangle);
                    b11="";
                    count6++;sum--;
                }
            }
        });

        count7=0;
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count7%2==0)
                {
                    button12.setBackgroundResource(R.drawable.crectangle);
                    b12="C9,";
                    count7++;sum++;
                }
                else
                {
                    button12.setBackgroundResource(R.drawable.rectangle);
                    b12="";
                    count7++;sum--;
                }
            }
        });

        count8=0;
        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count8%2==0)
                {
                    button13.setBackgroundResource(R.drawable.crectangle);
                    b13="C8,";
                    count8++;sum++;
                }
                else
                {
                    button13.setBackgroundResource(R.drawable.rectangle);
                    b13="";sum--;
                    count8++;
                }
            }
        });

        count9=0;
        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count9%2==0)
                {
                    button14.setBackgroundResource(R.drawable.crectangle);
                    b14="B1,";
                    count9++;sum++;
                }
                else
                {
                    button14.setBackgroundResource(R.drawable.rectangle);
                    b14="";sum--;
                    count9++;
                }
            }
        });

        count10=0;
        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count10%2==0)
                {
                    button15.setBackgroundResource(R.drawable.crectangle);
                    b15="B2,";sum++;
                    count10++;
                }
                else
                {
                    button15.setBackgroundResource(R.drawable.rectangle);
                    b15="";sum--;
                    count10++;
                }
            }
        });

        count11=0;
        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count11%2==0)
                {
                    button16.setBackgroundResource(R.drawable.crectangle);
                    b16="B4,";sum++;
                    count11++;
                }
                else
                {
                    button16.setBackgroundResource(R.drawable.rectangle);
                    b16="";sum--;
                    count11++;
                }
            }
        });

        count12=0;
        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count12%2==0)
                {
                    button17.setBackgroundResource(R.drawable.crectangle);
                    b17="B3,";
                    count12++;sum++;
                }
                else
                {
                    button17.setBackgroundResource(R.drawable.rectangle);
                    b17="";sum--;
                    count12++;
                }
            }
        });

        count13=0;
        button18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count13%2==0)
                {
                    button18.setBackgroundResource(R.drawable.crectangle);
                    b18="B5,";sum++;
                    count13++;
                }
                else
                {
                    button18.setBackgroundResource(R.drawable.rectangle);
                    b18="";sum--;
                    count13++;
                }
            }
        });

        count14=0;
        button19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count14%2==0)
                {
                    button19.setBackgroundResource(R.drawable.crectangle);
                    b19="A2,";sum++;
                    count14++;
                }
                else
                {
                    button19.setBackgroundResource(R.drawable.rectangle);
                    b19="";sum--;
                    count14++;
                }
            }
        });

        count15=0;
        button20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count15%2==0)
                {
                    button20.setBackgroundResource(R.drawable.crectangle);
                    b20="A3,";
                    count15++;sum++;
                }
                else
                {
                    button20.setBackgroundResource(R.drawable.rectangle);
                    b20="";sum--;
                    count15++;
                }
            }
        });

        count16=0;
        button21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count16%2==0)
                {
                    button21.setBackgroundResource(R.drawable.crectangle);
                    b21="A1,";sum++;
                    count16++;
                }
                else
                {
                    button21.setBackgroundResource(R.drawable.rectangle);
                    b21="";
                    count16++;sum--;
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Main2Activity.this,Main3Activity.class);
                intent1.putExtra("et1",s1);
                intent1.putExtra("et2",s2);
                intent1.putExtra("et3",s3);
                intent1.putExtra("et4",s4);
                intent1.putExtra("et8",sum);
                intent1.putExtra("et5",s5);
                intent1.putExtra("et6",s6);
                intent1.putExtra("et7",b5+b6+b7+b8+b9+b10+b11+b12+b13+b14+b15+b16+b17+b18+b19+b20+b21);
                startActivity(intent1);
            }
        });
    }
}
