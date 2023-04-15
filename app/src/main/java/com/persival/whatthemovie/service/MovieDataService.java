package com.persival.whatthemovie.service;

import com.persival.whatthemovie.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {
    // Base URL
    // https://api.themoviedb.org/3/
    //
    // End Point Url
    // movie/popular?api_key=<<api_key>>

    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
