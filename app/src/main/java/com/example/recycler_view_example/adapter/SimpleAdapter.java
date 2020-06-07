package com.example.recycler_view_example.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.recycler_view_example.R;
import com.example.recycler_view_example.model.Movie;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SimpleAdapter extends RecyclerView.Adapter<SimpleAdapter.MyViewHolder> {

    private List<Movie> movieList;

    public SimpleAdapter (List<Movie> list) {
        this.movieList = list;
    }

    /**
     * To create firsts views
     */
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_list, parent, false);
        return new MyViewHolder(listItem);
    }

    /**
     *  To recycle views and, in did, show info
     */
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        // Get info from movie list on specified position
        Movie movie = movieList.get(position);
        // Set it value on screen for each property
        holder.title.setText(movie.getTitle());
        holder.year.setText(movie.getYear());
        holder.gender.setText(movie.getGender());
    }


    /**
     * How many times we are supposed to call onBindViewHolder() in one shot
     */
    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, year, gender;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textTitle);
            year = itemView.findViewById(R.id.textYear);
            gender = itemView.findViewById(R.id.textGender);

        }
    }
}
