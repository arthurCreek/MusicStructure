package com.example.android.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.duration;

public class NowPlayingActivity extends AppCompatActivity {

    Boolean pause = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //View variables for the activity_now_playing
        ImageView albumButton = (ImageView) findViewById(R.id.album_cover);
        ImageButton previousButton = (ImageButton) findViewById(R.id.previous_button);
        final ImageButton playPauseButton = (ImageButton) findViewById(R.id.play_pause_button);
        ImageButton nextButton = (ImageButton) findViewById(R.id.next_button);
        Button buyNowButton = (Button) findViewById(R.id.buy_now_button);
        Button nowPlayingMenuButton = (Button) findViewById(R.id.now_playing_menu_button);


        albumButton.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "This shows album details";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        previousButton.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Previous Song";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        playPauseButton.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                if(pause) {
                    playPauseButton.setImageResource(R.drawable.pause);
                    pause = false;
                    text = "Play";
                } else {
                    playPauseButton.setImageResource(R.drawable.circled_play);
                    pause = true;
                    text = "Paused";
                }
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Next Song";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        buyNowButton.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Takes you to the payment activity";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                Intent libraryIntent = new Intent(NowPlayingActivity.this, PaymentActivity.class);
                startActivity(libraryIntent);
            }
        });

        nowPlayingMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuButton = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(menuButton);
            }
        });
    }
}
