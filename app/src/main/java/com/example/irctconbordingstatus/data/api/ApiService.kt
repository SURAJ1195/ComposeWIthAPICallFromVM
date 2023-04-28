package com.example.irctconbordingstatus.data.api

import com.example.irctconbordingstatus.data.model.RequestBody
import com.example.irctconbordingstatus.data.model.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("onboardingStatus")
    suspend fun getApiData(@Body requestBody: RequestBody ) : Response<ResponseBody>
}