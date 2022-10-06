package com.example.borrar.DOMAIN.model

import com.example.borrar.DATA.repository.beers.api.BeerRepository
import com.example.borrar.DATA.repository.beers.api.BeersClient

class BeerAPIRepository(private val beerClient : BeersClient) :BeerRepository {
    override suspend fun getBeer(): BeerModel {

    }
}