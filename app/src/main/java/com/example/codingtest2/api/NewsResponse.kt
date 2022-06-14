package com.example.codingtest2.api

import com.google.gson.annotations.SerializedName

data class NewsResponse (
    @field: SerializedName("status")
    val status : String,
    @field: SerializedName("totalResults")
    val newsCount : Int,
    @field: SerializedName("articles")
    val articles : List<Article>
)