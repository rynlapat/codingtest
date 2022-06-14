package com.example.codingtest2.api

import com.google.gson.annotations.SerializedName

data class SourceObject(
    @field:SerializedName("id") val id :String?,
    @field:SerializedName("name") val name:String,
)
