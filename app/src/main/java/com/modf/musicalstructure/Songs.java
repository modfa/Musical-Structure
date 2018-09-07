package com.modf.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);

        final ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("Artist Name 1","Song 1", R.drawable.music));
        songs.add(new Song("Artist Name 2","Song 2", R.drawable.music));
        songs.add(new Song("Artist Name 3","Song 3", R.drawable.music));
        songs.add(new Song("Artist Name 4","Song 4", R.drawable.music));
        songs.add(new Song("Artist Name 5","Song 5", R.drawable.music));
        songs.add(new Song("Artist Name 6","Song 6", R.drawable.music));
        songs.add(new Song("Artist Name 7","Song 7", R.drawable.music));
        songs.add(new Song("Artist Name 8","Song 8", R.drawable.music));
        songs.add(new Song("Artist Name 9","Song 9", R.drawable.music));
        songs.add(new Song("Artist Name 10","Song 10", R.drawable.music));
        songs.add(new Song("Artist Name 11","Song 11", R.drawable.music));
        songs.add(new Song("Artist Name 12","Song 12", R.drawable.music));

        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(this, songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // songs_list.xml layout file.
        ListView listView =  findViewById(R.id.list);

        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Song} in the list.
        listView.setAdapter(adapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                // Get the {@link Song} object attributes at the given position the user clicked on
                String songNameClicked = songs.get(position).getmSongName();
                // Get the {@link Song} object attributes at the given position the user clicked on
                String songArtistNameClicked = songs.get(position).getmArtistName();
                // Get the {@link Song} object attributes at the given position the user clicked on
                int songImageClicked = songs.get(position).getmImageResourceId();

                // Creating the explicit intent so that when any item in the list is clicked, It will open the NowPlaying Activity
                Intent nowPlayingIntent = new Intent(Songs.this, NowPlaying.class);
                // putting the song attribute so that can be recovered in the NowPlaying activity
                nowPlayingIntent.putExtra("clickedArtistName", songArtistNameClicked);
                nowPlayingIntent.putExtra("ClickedSongImage", songImageClicked);
                nowPlayingIntent.putExtra("clickedSongName",songNameClicked);
                startActivity(nowPlayingIntent);
            }

        });
    }
}
