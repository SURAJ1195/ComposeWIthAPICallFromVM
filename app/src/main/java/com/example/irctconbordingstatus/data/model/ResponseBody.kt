package com.example.irctconbordingstatus.data.model


import com.google.gson.annotations.SerializedName

data class ResponseBody(
    @SerializedName("data")
    val `data`: Data,
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int
)