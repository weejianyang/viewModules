package sg.edu.rp.c346.id22027500.viewmodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvprogram;
    TextView tvwebapp;
    TextView tvsoftware;
    TextView tvuiux;
    TextView tvmobapp;
    TextView tvlifeskill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvprogram = findViewById(R.id.textView1);
        tvwebapp = findViewById(R.id.textView2);
        tvsoftware = findViewById(R.id.textView3);
        tvuiux = findViewById(R.id.textView4);
        tvmobapp = findViewById(R.id.textView5);
        tvlifeskill = findViewById(R.id.textView6);

        tvprogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);

                intent.putExtra("code", "C110");
                intent.putExtra("course", "Programming Fundamentals I");
                intent.putExtra("name", "Soon Yoong kit");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "W55M");

                startActivity(intent);
            }
        });

        tvwebapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);
                intent.putExtra("code", "C203");
                intent.putExtra("course", "Web AppIn Development in php");
                intent.putExtra("name", "Jessica Sin");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "W65C");

                startActivity(intent);
            }
        });

        tvsoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);
                intent.putExtra("code", "C206");
                intent.putExtra("course", "Software Development Process");
                intent.putExtra("name", "Yong Yoke Fong");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "W65P");

                startActivity(intent);

            }
        });

        tvuiux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);
                intent.putExtra("code", "C218");
                intent.putExtra("course", "UI/UX Design for Apps");
                intent.putExtra("name", "Stanley Tan");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "W65C");

                startActivity(intent);
            }
        });

        tvmobapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);
                intent.putExtra("code", "C346");
                intent.putExtra("course", "Mobile App Development");
                intent.putExtra("name", "Andy Tao");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "E63A");

                startActivity(intent);
            }
        });

        tvlifeskill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Displaydetails.class);
                intent.putExtra("code", "G953");
                intent.putExtra("course", "Life skills III");
                intent.putExtra("name", "Andrew V");
                intent.putExtra("acYear", 2022);
                intent.putExtra("sem", 1);
                intent.putExtra("venue", "HB02");

                startActivity(intent);
            }
        });
    }
}





