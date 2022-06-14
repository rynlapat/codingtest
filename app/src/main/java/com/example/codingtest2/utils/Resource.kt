package com.example.codingtest2.utils

sealed class Resource<out T : Any>{
    data class Success<out T : Any>(val data : T) : Resource<T>()
    data class Failure(val msg: String) : Resource<Nothing>()
}
