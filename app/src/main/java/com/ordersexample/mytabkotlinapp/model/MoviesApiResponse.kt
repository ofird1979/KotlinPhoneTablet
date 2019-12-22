package com.ordersexample.mytabkotlinapp.model
@Serializable
data class MoviesApiResponse(
    val page: Int,
    val movies: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)
