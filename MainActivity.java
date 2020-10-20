package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView movie;
    ArrayList<String> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movieList = new ArrayList<String>(Arrays.asList(getResources().getStringArray(R.array.movieList)));
        movie = findViewById(R.id.movieName);
    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Random:
        if (movieList.size() != 0) {
            int randomId = (int) (Math.random() * movieList.size());
            movie.setText(movieList.get(randomId));
            movieList.remove(randomId);
        }
        else movie.setText("Фильмов больше нет:с");
   //     break;
    //        case R.id.Reset:
    //            movieTV.setText("");
    //            break;
    }}


}

