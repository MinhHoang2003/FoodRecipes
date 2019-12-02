package com.example.foodrecipes.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FoodRecipeClient {
    companion object {
        private var RETROFIT_CLIENT: Retrofit? = null
        val BASE_URL = "https://www.themealdb.com/api/json/v1/1/"
        fun getClient() = RETROFIT_CLIENT ?: synchronized(this) {
            buildClient()
        }

        private fun buildClient() = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }


}