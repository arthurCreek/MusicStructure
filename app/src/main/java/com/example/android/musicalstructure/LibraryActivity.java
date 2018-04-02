package com.example.android.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        LinearLayout firstSong = (LinearLayout) findViewById(R.id.first_song);
        LinearLayout secondSong = (LinearLayout) findViewById(R.id.second_song);
        LinearLayout thirdSong = (LinearLayout) findViewById(R.id.third_song);
        LinearLayout fourthSong = (LinearLayout) findViewById(R.id.fourth_song);
        LinearLayout fifthSong = (LinearLayout) findViewById(R.id.fifth_song);
        LinearLayout sixthSong = (LinearLayout) findViewById(R.id.sixth_song);
        LinearLayout seventhSong = (LinearLayout) findViewById(R.id.seventh_song);
        LinearLayout eighthSong = (LinearLayout) findViewById(R.id.eighth_song);
        LinearLayout ninthSong = (LinearLayout) findViewById(R.id.ninth_song);
        LinearLayout tenthSong = (LinearLayout) findViewById(R.id.tenth_song);
        Button libraryMenuButton = (Button) findViewById(R.id.library_menu_button);

        firstSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Under The Bridge Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        secondSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Give It Away Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        thirdSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Breaking The Girl Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        fourthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Californication Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        fifthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Scar Tissue Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        sixthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Soul To Squeeze Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        seventhSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Other Side Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        eighthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Suck My Kiss [Clean] Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        ninthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "By The Way Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        tenthSong.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Parallel Universe Now Playing";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        libraryMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuButton = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(menuButton);
            }
        });
    }
}
