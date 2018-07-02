package com.example.raiff.latemusicialstructurepart2;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class AlbumsFragment extends Fragment {

    private SelectedItem selectedItem;

    public AlbumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        selectedItem = SelectedItem.getInstance();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_albums, container, false);
        final ArrayList<Albums> albums = new ArrayList<>();


        albums.add(new Albums("4x4=12",R.drawable.deadmau));
        albums.add(new Albums("W:/2016ALBUM/",R.drawable.album_2016));
        albums.add(new Albums("Random Access Memories", R.drawable.random_access_memories));

        final AlbumsAdapter adapter = new AlbumsAdapter(getActivity(), albums);

        ListView listView = view.findViewById(R.id.album_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Albums selectedAlbum = albums.get(position);
                Log.v("grabbing right album?", selectedAlbum.getAlbums());
                selectedItem.setSelectedItem(selectedAlbum.getAlbums());
                Intent myIntent = new Intent(view.getContext(), SongFragment.class);
                startActivityForResult(myIntent, 0);



            }
        });
        return view;
        }
    }
