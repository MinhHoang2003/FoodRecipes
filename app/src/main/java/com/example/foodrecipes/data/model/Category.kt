package com.example.foodrecipes.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("idCategory")
    @Expose
    var idCategory: String,
    @SerializedName("strCategory")
    @Expose
    var strCategory: String,
    @SerializedName("strCategoryThumb")
    @Expose
    var strCategoryThumb: String,
    @SerializedName("strCategoryDescription")
    @Expose
    var strCategoryDescription: String
)