package com.example.foodrecipes.data

import com.example.foodrecipes.data.remote.FoodRecipesService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DataRepository(private val service: FoodRecipesService) {

    suspend fun getAllCategories() = CoroutineScope(Dispatchers.IO).launch {
        service.getAllCategories()
    }

}