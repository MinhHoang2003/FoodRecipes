package com.example.foodrecipes.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Categories(
    @SerializedName("categories")
    @Expose
    var categories: List<Category>
)