package com.example.raiff.latemusicialstructurepart2;

public class Artist {

    private String mArtist;
    private int mArtistImage;


    public Artist(String Artist, int Image) {
        mArtist = Artist;
        mArtistImage = Image;
    }

    public String getArtist() {
        return mArtist;
    }

    public int getArtistImage() {
        return mArtistImage;
    }
}
