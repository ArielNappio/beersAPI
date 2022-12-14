package com.example.borrar.DATA.repository.beers.api

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class BeerAPIMainProvider : BeerAPIProvider {
    override fun getAPI(): BeerAPI {
        val serviceGetBeersByAPI = Retrofit.Builder()
            .baseUrl("https://api.punkapi.com/v2/")
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .build()

        return serviceGetBeersByAPI.create(BeerAPI::class.java)
    }
}