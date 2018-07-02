package com.example.raiff.latemusicialstructurepart2;

public class Song {

    private String mAlbums;
    private String mArtists;
    private String mSong;


    public Song(String Album,String Artist,String Song) {
        mAlbums = Album;
        mArtists = Artist;
        mSong = Song;
    }


    public String getAlbums() {
        return mAlbums;
    }

    public String getArtists() {
        return mArtists;
    }

    public String getSong() { return mSong;}

}
