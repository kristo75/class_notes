package com.example.user.listviewparttwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 23/01/2018.
 */

public class TopMoviesAdapter extends ArrayAdapter<Movie> {

    public TopMoviesAdapter(Context context, ArrayList<Movie> movies){
        super(context, 0, movies);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_item, parent, false);
        }

        Movie currentMovie = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        TextView title = listItemView.findViewById(R.id.title);
        TextView year = listItemView.findViewById(R.id.year);
        ranking.setText(currentMovie.getRanking().toString());
        title.setText(currentMovie.getTitle().toString());
        year.setText(currentMovie.getYear().toString());

        return listItemView;

    }
}
