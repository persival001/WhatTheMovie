package com.persival.whatthemovie.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.persival.whatthemovie.R;
import com.persival.whatthemovie.databinding.ActivityMovieBinding;
import com.persival.whatthemovie.model.Movie;

public class MovieActivity extends AppCompatActivity {
    private Movie movie;
    private ActivityMovieBinding activityMovieBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        activityMovieBinding = DataBindingUtil.setContentView(this, R.layout.activity_movie);

        Intent i = getIntent();

        if (i != null) {
            movie = i.getParcelableExtra("movie");
            activityMovieBinding.setMovie(movie);
            getSupportActionBar().setTitle(movie.getTitle());
        }
    }
}
