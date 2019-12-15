package com.ordersexample.mytabkotlinapp.services;


import com.ordersexample.mytabkotlinapp.model.MoviesApiResponse;
import com.ordersexample.mytabkotlinapp.model.TrailersApiResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public  interface Service {
    //once creating the api base build we need to call the right query and define the type of return for each purpose
    @GET("movie/popular")
    Call<MoviesApiResponse> getPopularMovies(@Query("api_key") String apiKey);
    @GET("movie/top_rated")
    Call<MoviesApiResponse>getTopRatedMovies(@Query("api_key") String apiKey);
    @GET("search/movie")
    Call<MoviesApiResponse>getMovieByName(@Query("api_key") String apiKey, @Query("query") String subject);
    @GET("movie/{movie_id}/videos")
    Call<TrailersApiResponse> getMovieTrailer(@Path("movie_id") int id, @Query("api_key") String apiKey);

}
