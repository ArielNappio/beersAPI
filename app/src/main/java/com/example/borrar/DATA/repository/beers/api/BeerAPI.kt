package com.example.borrar.DATA.repository.beers.api

import com.example.borrar.DATA.repository.beers.api.models.APIbeersmodel
import retrofit2.Response
import retrofit2.http.GET

interface BeerAPI {
@GET("beers/random")

fun getBeers(): Response<List<APIbeersmodel>>
}