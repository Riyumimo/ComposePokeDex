package com.example.composepokedex.data.remote.response


import com.example.composepokedex.data.remote.response.DreamWorld
import com.example.composepokedex.data.remote.response.OfficialArtwork
import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    val dreamWorld: DreamWorld,
    @SerializedName("official-artwork")
    val officialArtwork: OfficialArtwork
)