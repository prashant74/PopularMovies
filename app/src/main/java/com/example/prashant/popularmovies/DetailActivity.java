package com.example.prashant.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by prashant on 2/7/16.
 */
public class DetailActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    if (savedInstanceState == null) {
      Bundle arguments = new Bundle();
      arguments.putParcelable(MovieDetailFragment.DETAIL_MOVIE,
              getIntent().getParcelableExtra(MovieDetailFragment.DETAIL_MOVIE));

      MovieDetailFragment fragment = new MovieDetailFragment();
      fragment.setArguments(arguments);

      getSupportFragmentManager().beginTransaction()
              .add(R.id.movie_detail_container, fragment)
              .commit();
    }
  }
}
