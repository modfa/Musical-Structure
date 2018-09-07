package com.modf.musicalstructure;
/**
 * {@link Song} represents a song that the user wants to play.
 * It contains artist name,song name, and an image for that song.
 */
public class Song {
// Artist name for the song
private String mArtistName;
// Song name for the song
private String mSongName;
// Image resource ID for the song
private int mImageResourceId;

/**
 * Create a new Song object.
 *
 * @param mArtistName is the Name of the song artist
 * @param mSongName   is the Name of the Song.
 * @param mImageResourceId is the drawable resource ID for the image associated with the song
 */
    public Song(String mArtistName, String mSongName, int mImageResourceId) {
        this.mArtistName = mArtistName;
        this.mSongName = mSongName;
        this.mImageResourceId = mImageResourceId;
    }
// Get the Image resource ID with the Song
    public int getmImageResourceId() {
        return mImageResourceId;
    }
// Get the Artist name for the song
    public String getmArtistName() {
        return mArtistName;
    }
// Get the Song name for the song
    public String getmSongName() {
        return mSongName;
    }
}
