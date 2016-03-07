package com.example.prashant.popularmovies;

import android.content.Context;
import android.database.Cursor;

import com.example.prashant.popularmovies.data.MovieContract;

/**
 * Created by prashant on 2/7/16.
 */
public class Utility {

  public static int isFavorited(Context context, int id) {
    Cursor cursor = context.getContentResolver().query(
            MovieContract.MovieEntry.CONTENT_URI,
            null,   // projection
            MovieContract.MovieEntry.COLUMN_MOVIE_ID + " = ?", // selection
            new String[]{Integer.toString(id)},   // selectionArgs
            null    // sort order
    );
    int numRows = cursor.getCount();
    cursor.close();
    return numRows;
  }

  public static String buildImageUrl(int width, String fileName) {
    return "http://image.tmdb.org/t/p/w" + Integer.toString(width) + fileName;
  }
}
