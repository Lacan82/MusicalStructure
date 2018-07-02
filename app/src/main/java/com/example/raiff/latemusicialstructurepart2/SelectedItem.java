package com.example.raiff.latemusicialstructurepart2;

import java.io.Serializable;

public class SelectedItem implements Serializable {
    private String mselectedArtist;
    private String mselectAlbum;

    public void setAlbum(String Album){
        this.mselectAlbum = Album;

    }

    public void setArtist(String Artist){
       this.mselectedArtist = Artist;

    }

    public String getSelectedArtist() {
        return this.mselectedArtist;
    }

    public String getSelectedAlbum() {
        return this.mselectAlbum;
    }
}
