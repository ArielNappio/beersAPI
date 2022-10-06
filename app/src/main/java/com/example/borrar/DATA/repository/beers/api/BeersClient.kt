package com.example.borrar.DATA.repository.beers.api.models

interface BeersClient {

     fun fetchBeers() : List<APIbeersmodel>

        //busquedaDeServersas
            // aca podemos ya usarla normalemente porque es una lista
}