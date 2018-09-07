package com.modf.musicalstructure;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NowPlaying extends AppCompatActivity {

    TextView songNamePlaying;
    TextView artistNamePlaying;
    ImageView songCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        // Finding the ImageView for song image
        songCover = findViewById(R.id.songCover);
        // Finding the TextView for song name
        songNamePlaying = findViewById(R.id.songName);
        // finding the artist name
        artistNamePlaying = findViewById(R.id.songArtistName);

        // getting the intent object
        Bundle bundle = getIntent().getExtras();

        // extracting the attributes values
        String nowPlayingSongName = bundle.getString("clickedArtistName");
        String nowPlayingArtistname = bundle.getString("clickedSongName");
        int nowPlayingSongImage = bundle.getInt("ClickedSongImage");

        // Setting up the textViews and Imagesview with the corresponding song object attribute.
        songNamePlaying.setText(nowPlayingSongName);
        artistNamePlaying.setText(nowPlayingArtistname);
        songCover.setImageResource(nowPlayingSongImage);
    }
}
