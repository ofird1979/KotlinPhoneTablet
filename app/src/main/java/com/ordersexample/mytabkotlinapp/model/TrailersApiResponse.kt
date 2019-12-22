package com.ordersexample.mytabkotlinapp.model
@Serializable
data class TrailersApiResponse(
    val id: Int,
    val trailers: List<Trailer>
)
