package com.example.android.musicalstructure;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class PlaylistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlists);

        ImageView lovePlaylist = (ImageView) findViewById(R.id.love_playlist);
        ImageView workoutPlaylist = (ImageView) findViewById(R.id.workout_playlist);
        ImageView roadTripPlaylist = (ImageView) findViewById(R.id.road_trip_playlist);
        ImageView chillPlaylist = (ImageView) findViewById(R.id.chill_playlist);
        Button playlistMenuButton = (Button) findViewById(R.id.playlist_menu_button);

        lovePlaylist.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Takes you to Love Playlist";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        workoutPlaylist.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Takes you to Workout Playlist";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        roadTripPlaylist.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Takes you to Road Trip Playlist";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        chillPlaylist.setOnClickListener(new View.OnClickListener() {
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text;
            @Override
            public void onClick(View view) {
                text = "Takes you to Chill Playlist";
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        playlistMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menuButton = new Intent(PlaylistsActivity.this, MainActivity.class);
                startActivity(menuButton);
            }
        });
    }
}
