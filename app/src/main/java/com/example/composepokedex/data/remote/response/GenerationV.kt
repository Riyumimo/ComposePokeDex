package com.example.composepokedex.data.remote.response


import com.example.composepokedex.data.remote.response.BlackWhite
import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white")
    val blackWhite: BlackWhite
)