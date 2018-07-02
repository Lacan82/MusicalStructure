package com.example.raiff.latemusicialstructurepart2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbumsAdapter extends ArrayAdapter<Albums> {
    public AlbumsAdapter(Context context, ArrayList<Albums> albums) {
        super(context, 0, albums);
    }
    @Override
    public View getView(int  position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Albums currentAlbums = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.default_imageView);

        imageView.setImageResource(currentAlbums.getAlbumsImage());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentAlbums.getAlbums());

        return listItemView;
    }

}
