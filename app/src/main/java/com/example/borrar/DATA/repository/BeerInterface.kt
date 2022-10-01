package com.example.borrar.DATA.repository

import com.example.borrar.DATA.repository.beers.api.models.APIbeersmodel

interface BeerInterface{
    suspend fun ListBeers() : List<APIbeersmodel>
}

