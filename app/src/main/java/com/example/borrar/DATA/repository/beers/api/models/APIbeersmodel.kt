package com.example.borrar.DATA.repository.beers.api.models

import com.google.gson.annotations.SerializedName

data class APIbeersmodel (
    @SerializedName("id") val id :Int,
    @SerializedName("name") val nombre : String,
    @SerializedName("description") val descripcion :String,
    @SerializedName("image_url")val imagen: String)
