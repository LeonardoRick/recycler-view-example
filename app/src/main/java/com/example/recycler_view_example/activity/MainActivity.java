package com.example.recycler_view_example.activity;

import android.os.Bundle;

import com.example.recycler_view_example.R;
import com.example.recycler_view_example.adapter.SimpleAdapter;
import com.example.recycler_view_example.model.Movie;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;


import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Movie> movieList = new ArrayList<Movie>();
    private View.OnClickListener onItemClickListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //creating list
        createMovieList();
        // Adapter config
        SimpleAdapter adapter = new SimpleAdapter(movieList);

        // RecyclerView config
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration( new DividerItemDecoration(this, LinearLayout.VERTICAL)); // create vertical divider between each item
        recyclerView.setAdapter(adapter);


    }


    /**
     * Create movie list
     *
     */
    public void createMovieList() {
        Movie filme = new Movie("PulpFiction", "1994", "Action");
        this.movieList.add(filme);
        filme = new Movie("Spiderman", "2017", "Fiction");
        this.movieList.add(filme);
        filme = new Movie("Wonder Woman", "2017", "Fantasy");
        this.movieList.add(filme);
        filme = new Movie("IT: The Thing", "2017", "Drama/Horror");
        this.movieList.add(filme);
        filme = new Movie("Inception", "2010", "Fiction");
        this.movieList.add(filme);
        filme = new Movie("Hancock", "2008", "Action/Drama");
        this.movieList.add(filme);
        filme = new Movie("Wreck-It Ralph", "2012", "Animation");
        this.movieList.add(filme);
        filme = new Movie("Gladiator", "2000", "Adventure");
        this.movieList.add(filme);
        filme = new Movie("Forrest Gump", "1994", "Drama/Romance");
        this.movieList.add(filme);
        filme = new Movie("The Godfather", "1972", "Drama");
        this.movieList.add(filme);
        filme = new Movie("S7ven", "1994", "Drama");
        this.movieList.add(filme);
        filme = new Movie("Hacksaw Ridge", "2016", "History");
        this.movieList.add(filme);
        filme = new Movie("Peaceful Warrior", "2006", "Drama/Romance");
        this.movieList.add(filme);
        filme = new Movie("Kaze Tachinu", "2013", "Animation");
        this.movieList.add(filme);
        filme = new Movie("The Hangover", "2009", "Comedy");
        this.movieList.add(filme);
        filme = new Movie("Memento", "2000", "Mistery");
        this.movieList.add(filme);
        filme = new Movie("Limtless", "2011", "Fiction");
        this.movieList.add(filme);
        filme = new Movie("Arrival", "2016", "Drama/Romance");
        this.movieList.add(filme);
        filme = new Movie("The Wire", "2002", "Crime");
        this.movieList.add(filme);
        filme = new Movie("The Hole Truth", "2016", "Crime/Drama");
        this.movieList.add(filme);
        filme = new Movie("Forrest Gump", "1994", "Drama/Romance");
        this.movieList.add(filme);
        filme = new Movie("The Terminal", "2004", "Comedy/Drama");
        this.movieList.add(filme);
        filme = new Movie("The Men How Knew Infinity", "2015", "Biography/Drama");
        this.movieList.add(filme);
        filme = new Movie("Inglorious Bastards", "2009", "Adventure/Drama");
        this.movieList.add(filme);
        filme = new Movie("The Hateful Height", "2015", "Drama");
        this.movieList.add(filme);
        filme = new Movie("Shutter Island", "2010", "Mistery");
        this.movieList.add(filme);
    }


}