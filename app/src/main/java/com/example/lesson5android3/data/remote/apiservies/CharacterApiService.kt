package com.example.lesson5android3.data.remote.apiservies

import com.example.lesson5android3.data.models.HarryPoterResponce
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

private const val CHARACTER = "https://api.potterdb.com/v1/characters?"

interface CharacterApiService {

    @GET(CHARACTER)
    fun getCharacter(
        @Query("filter[name_cont]") query: String
    ): Call<HarryPoterResponce>
}