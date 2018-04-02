package com.example.android.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView variables for the onClickListeners of the activity_main
        TextView nowPlaying = (TextView) findViewById(R.id.now_playing);
        TextView library = (TextView) findViewById(R.id.library);
        TextView playlists = (TextView) findViewById(R.id.playlists);
        TextView payment = (TextView) findViewById(R.id.payment);
        TextView aboutUs = (TextView) findViewById(R.id.about_us);


        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(nowPlayingIntent);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent libraryIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(libraryIntent);
            }
        });

        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistsIntent = new Intent(MainActivity.this, PlaylistsActivity.class);
                startActivity(playlistsIntent);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent paymentIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(paymentIntent);
            }
        });

        aboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutUsIntent = new Intent(MainActivity.this, AboutUsActivity.class);
                startActivity(aboutUsIntent);
            }
        });
    }


}
