package com.example.raiff.latemusicialstructurepart2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import android.content.Intent;
import android.widget.AdapterView;




public class ArtistFragment extends Fragment {


    private SelectedItem selectedItem;

    public ArtistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        selectedItem = SelectedItem.getInstance();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_artist, container, false);
        final ArrayList<Artist> artists = new ArrayList<>();


        artists.add(new Artist("Deadmau5",R.drawable.deadmau));
        artists.add(new Artist("Daft Punk", R.drawable.daftpunk));

        final ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);

        final ListView listView = view.findViewById(R.id.artist_list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Artist selectedArtist = artists.get(position);
                selectedItem.setSelectedItem(selectedArtist.getArtist());
                Intent myIntent = new Intent(view.getContext(), SongFragment.class);
                startActivityForResult(myIntent, 0);



                }
            });
        return view;
        }
    }
