package com.modf.musicalstructure;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song>{
    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param songs          A List of Song objects to display in a list
     */
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, songs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID artistName
        TextView artistNameView =  listItemView.findViewById(R.id.artistName);
        // Get the artist name from the current Song object and
        // set this text on the TextView
        artistNameView.setText(currentSong.getmArtistName());

        // Find the TextView in the list_item.xml layout with the ID songName
        TextView songNameTextView =  listItemView.findViewById(R.id.songName);
        // Get the Song name from the current Song object and
        // set this text on the TextView
        songNameTextView.setText(currentSong.getmSongName());
        // Find the ImageView in the list_item.xml layout with the ID imageView.
        ImageView imageView =  listItemView.findViewById(R.id.imageView);

        // Check if an image is provided for this word or not

            // display the provided image based on the resource ID
            imageView.setImageResource(currentSong.getmImageResourceId());

        return listItemView;
    }
}
