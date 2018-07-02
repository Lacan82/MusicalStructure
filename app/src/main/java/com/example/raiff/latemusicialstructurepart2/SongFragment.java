package com.example.raiff.latemusicialstructurepart2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongFragment extends AppCompatActivity {

    private SelectedItem selectedItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_song);
        selectedItem = SelectedItem.getInstance();
        TextView songTitle = (TextView) findViewById(R.id.songTitle) ;


        songTitle.setText(selectedItem.getSelected());

        ArrayList<Song> Song = new ArrayList<>();

        String Selected = selectedItem.getSelected();
        Log.v("ARGH", Selected);
        if (Selected.equals("Deadmau5") || Selected.equals("4x4=12")) {
            Song.add(new Song("4x4=12", "Deadmau5", "Some Cords"));
            Song.add(new Song("4x4=12", "Deadmau5", "Sofi needs a Ladder"));
            Song.add(new Song("4x4=12", "Deadmau5", "City in Florida"));

        }
        if (Selected.equals("Deadmau5") || Selected.equals("W:/2016ALBUM/")) {
            Song.add(new Song("W:/2016ALBUM/", "Deadmau5", "4ware"));
            Song.add(new Song("W:/2016ALBUM/", "Deadmau5", "2448"));
            Song.add(new Song("W:/2016ALBUM/", "Deadmau5", "Cat Thruster"));

        }
        if (Selected.equals("Daft Punk") || Selected.equals("Random Access Memories")) {
            Song.add(new Song("Random Access Memories", "Daft Punk", "Give Life Back to Music"));
            Song.add(new Song("Random Access Memories", "Daft Punk", "The Game of Love"));
            Song.add(new Song("Random Access Memories", "Daft Punk", "Giorgio by Moroder"));

        }

        SongAdapter adapter = new SongAdapter(this, Song);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);




    }
}

