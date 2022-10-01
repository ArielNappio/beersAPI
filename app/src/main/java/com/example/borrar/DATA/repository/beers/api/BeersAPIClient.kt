package com.example.borrar.DATA.repository.beers.api

import com.example.borrar.DATA.repository.beers.api.models.APIbeersmodel
import com.example.borrar.DATA.repository.beers.api.models.BeersClient
import com.example.borrar.DATA.repository.beers.api.models.ErrorMessage
import com.google.gson.Gson
import com.google.gson.JsonSyntaxException
import retrofit2.Response

// siempre interfaz
class BeersAPIClient(beerAPIProvideer : BeerAPIProvider) : BeersClient{
                                    //lo llamo del constructor, parametro
    private val beearAPI : BeerAPI = beerAPIProvideer.getAPI()

    override fun fetchBeers(): List<APIbeersmodel> {

        val APPIBeerResponse = beearAPI.getBeers()

        if(!APPIBeerResponse.isSuccessful){
            throw Exception(handleUnsuccessfulResponse(APPIBeerResponse).statusMessage)
        }
              // siemre retornramos el cuerpo. lista
        return APPIBeerResponse.body() ?: emptyList()
    }



        // en caso que le pegue a la apii  y no encuentre nada nos muestra el error de la api
         private fun <T> handleUnsuccessfulResponse(response: Response<T>): ErrorMessage {
         return try {
         Gson().fromJson(response.errorBody()!!.string(), ErrorMessage::class.java)
          } catch (je: JsonSyntaxException) {
          ErrorMessage(500, "Unknown")
        }
       }

}