package com.example.foodrecipes.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.foodrecipes.R
import com.example.foodrecipes.data.remote.FoodRecipeClient
import com.example.foodrecipes.data.remote.FoodRecipesService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

}
