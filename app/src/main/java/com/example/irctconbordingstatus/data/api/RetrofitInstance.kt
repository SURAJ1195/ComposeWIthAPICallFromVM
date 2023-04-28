package com.example.irctconbordingstatus.data.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitInstance {
    companion object{

        //val BASE_URL = "https://date.nager.at/api/v2/PublicHolidays/" //2021/us
        val BASE_URL = "https://apidev.iserveu.online/irctc/"
        private val okHttpClient = OkHttpClient.Builder().connectTimeout(1, TimeUnit.MINUTES)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header("client_id", "gxOduauzNyhjJhLuAoGFF94a9X6trAszmR45bwbTNhH2iKkl")
                    .header("client_secret", "po0MybjkYO7kVyvLNA7bGi1lEA79NG8dGifFjXzMfyUYHyOi4XMzoEE34GcI7gIG")
                    .build()

                chain.proceed(request)

            }.build()
        fun getRetrofitInstance(): ApiService {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
                .client(okHttpClient)
                .build()
                .create(ApiService::class.java)
        }

    }
}