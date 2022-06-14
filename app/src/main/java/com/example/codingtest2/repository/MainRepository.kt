package com.example.codingtest2.repository

import com.example.codingtest2.api.NewsAPIService
import com.example.codingtest2.api.NewsResponse
import com.example.codingtest2.utils.Resource
import java.lang.Exception
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val newsAPIService: NewsAPIService){

    suspend fun getNews() : Resource<NewsResponse>{
        return try{
            val response = newsAPIService.getNews()
            if(response.isSuccessful){
                Resource.Success(response.body()!!)
            }else{
                Resource.Failure("เกิดข้อผิดพลาด")
            }
        }catch (e : Exception){
            Resource.Failure(e.message ?: "กรุณาตรวจสอบการเชื่อมต่ออินเทอร์เน็ต")
        }
    }
}