package com.example.raiff.latemusicialstructurepart2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Intent;
import android.widget.AdapterView;




public class ArtistFragment extends Fragment {


    private String mArtist;

    public ArtistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_artist, container, false);
        final ArrayList<Artist> artists = new ArrayList<>();


        artists.add(new Artist("Deadmau5",R.drawable.deadmau));

        final ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);

        ListView listView = view.findViewById(R.id.artist_list);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Artist selectedArtist = artists.get(position);
                Log.v("Artist", selectedArtist.getArtist());

                }
            });
        return view;
        }
    }
