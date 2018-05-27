package com.example.shantanu.bookmyshow;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void onBackPressed(){
        final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("EXIT LAUNCHER");
        builder.setMessage("Are you sure want to exit?");
        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finishAffinity();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        builder.show();
    }

    Spinner spinner,spinner3,spinner2,spinner4;
    TextView textView,textView1;
    Button button,button2,button3;
    String[] CityName = {"Tokyo City","Kyoto City","Akihabara City","Arazato City"};
    String[] Tokthe = {"Aniplex Cinemas","Bandai Cinemas","Dentsu Cinemas","TOHO Cinemas"};
    String[] Kyothe = {"Shueisha Cinemas","FUNimation Cinemas"};
    String[] Akithe = {"Aniplex Cinemas","Bandai Cinemas","Dentsu Cinemas"};
    String[] Arathe = {"Aniplex Cinemas"};
    String[] movie = {"Sword Art Online","Fukka","Shigatsu Wa Kimi No","Kuroko No Basket"};
    int[] price = {240,150,100,300};
    String[] s = {};
    int[] images = {R.drawable.anime4,R.drawable.anime5,R.drawable.anime2,R.drawable.anime3};
    String[] timings = {"9:00 AM","1:00 PM","5:00 PM","9:00 PM"};
    String Btime = "9:00 AM",fcinema,fmovie, fcity;
    int fimage,fprice,pos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        textView = (TextView) findViewById(R.id.textViewName);
        textView1 = (TextView) findViewById(R.id.textView);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,CityName);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                fcity=parent.getItemAtPosition(position).toString();

                switch(position)
                {
                    case 0 :    s=Tokthe;
                                break;
                    case 1 :    s = Kyothe;
                                break ;
                    case 2 :    s=Akithe;
                                break;
                    case 3 :    s=Arathe;
                                break;

                }
                ArrayAdapter<String> arrayAdapter1=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,s);
                spinner3.setAdapter(arrayAdapter1);
                spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        fcinema=parent.getItemAtPosition(position).toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });


                CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(),images,movie);
                spinner2.setAdapter(customAdapter);
                spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                        fmovie = movie[position];
                        fprice = price[position];
                        fimage = images[position];
                        pos = position;
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setTitle("Booking Time");
                dialog.setContentView(R.layout.custom_layout);
                button3 = (Button) dialog.findViewById(R.id.button3);
                spinner4 = (Spinner) dialog.findViewById(R.id.spinner4);
                ArrayAdapter<String> arrayAdapter3=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,timings);
                spinner4.setAdapter(arrayAdapter3);
                dialog.show();
                spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                        Btime=parent.getItemAtPosition(position).toString();
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
                button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView1.setText("   "+Btime);
                        dialog.cancel();
                    }
                });
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("et1",fcity);
                intent.putExtra("et2",fcinema);
                intent.putExtra("et3",fmovie);
                intent.putExtra("et4",fprice);
                intent.putExtra("et5",Btime);
                intent.putExtra("et6",pos);
                startActivity(intent);
            }
        });

    }

    class CustomAdapter extends BaseAdapter {
        Context context;
        int flags[];
        String[] cname;
        LayoutInflater inflter;

        public CustomAdapter(Context applicationContext, int[] images, String[] movie) {
            this.context = applicationContext;
            this.flags = images;
            this.cname = movie;
            inflter = (LayoutInflater.from(applicationContext));
        }

        @Override
        public int getCount() {
            return flags.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View view, ViewGroup viewGroup) {

            view = inflter.inflate(R.layout.custom_list,null);
            TextView names= (TextView) view.findViewById(R.id.textViewName);
            TextView prices = (TextView) view.findViewById(R.id.textViewDesignation);
            ImageView icon = (ImageView) view.findViewById(R.id.imageView);
            names.setText(movie[position]);
            prices.setText(""+price[position]);
            icon.setImageResource(images[position]);
            return view;
        }
    }
}
