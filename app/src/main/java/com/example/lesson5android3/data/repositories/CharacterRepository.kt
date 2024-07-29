package com.example.lesson5android3.data.repositories

import com.example.lesson5android3.data.models.DataItem
import com.example.lesson5android3.data.models.HarryPoterResponce
import com.example.lesson5android3.data.remote.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterRepository {

    private val CharacterApi = RetrofitClient.harryCharacterReponse

    fun searchHarryPotter(
        query: String,
        onResponse: (harry: List<DataItem>) -> Unit,
        onFailure: (t: Throwable) -> Unit,
    ) {

        CharacterApi.getCharacter(query = query).enqueue(object : Callback<HarryPoterResponce> {
            override fun onResponse(
                call: Call<HarryPoterResponce>,
                response: Response<HarryPoterResponce>
            ) {
                if (response.isSuccessful && response.body() != null) {
                    response.body()!!.data?.let { onResponse(it) }
                }
            }

            override fun onFailure(call: Call<HarryPoterResponce>, t: Throwable) {
                onFailure(t)
            }

        })
    }
}