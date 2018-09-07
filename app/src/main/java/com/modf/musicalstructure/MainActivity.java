package com.modf.musicalstructure;

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


    TextView artists = findViewById(R.id.artists);
        TextView songs = findViewById(R.id.songs);
        TextView genre = findViewById(R.id.genre);
        TextView albums = findViewById(R.id.albums);
    artists.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent myIntent = new Intent(MainActivity.this, Artists.class);
            startActivity(myIntent);
        }
    });
        genre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Genre.class);
                startActivity(myIntent);
            }
        });
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Songs.class);
                startActivity(myIntent);
            }
        });
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, Artists.class);
                startActivity(myIntent);
            }
        });
    }

}
