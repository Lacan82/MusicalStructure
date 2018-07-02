package com.example.raiff.latemusicialstructurepart2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.AdapterView;
import android.widget.ListView;



public class ArtistFragment extends Fragment {

    public ArtistFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_artist, container, false);
        ArrayList<Artist> artists = new ArrayList<>();


        artists.add(new Artist("Deadmau5",R.drawable.deadmau));

        ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists);

        ListView listView = view.findViewById(R.id.artist_list);

        listView.setAdapter(adapter);

        return view;

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if (position == 0) {
                    Intent myIntent = new Intent(view.getContext(), ListItemActivity1.class);
                    startActivityForResult(myIntent, 0);
                }
    }

}
