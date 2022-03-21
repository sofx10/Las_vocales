package com.example.lasvocales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView a;
private ImageView e;
private ImageView i;
private ImageView o;
private ImageView u;
MediaPlayer letra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a=(ImageView) findViewById(R.id.img_bta);
        e=(ImageView) findViewById(R.id.img_bte);
        i=(ImageView) findViewById(R.id.img_bti);
        o=(ImageView) findViewById(R.id.img_bto);
        u=(ImageView) findViewById(R.id.img_btu);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra=MediaPlayer.create(getApplicationContext(),R.raw.alphabet);
                letra.start();
            }

        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra=MediaPlayer.create(getApplicationContext(),R.raw.elphabet);
                letra.start();
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra=MediaPlayer.create(getApplicationContext(),R.raw.ilphabet);
                letra.start();
            }
        });
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra=MediaPlayer.create(getApplicationContext(),R.raw.olphabet);
                letra.start();
            }
        });
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra=MediaPlayer.create(getApplicationContext(),R.raw.ulphabet);
                letra.start();
            }
        });





    }
}