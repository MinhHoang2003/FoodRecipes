package com.example.foodrecipes.data.remote

import com.example.foodrecipes.data.model.Categories
import retrofit2.Response
import retrofit2.http.GET

interface FoodRecipesService {
    @GET("categories.php")
    suspend fun getAllCategories(): Response<Categories>
}