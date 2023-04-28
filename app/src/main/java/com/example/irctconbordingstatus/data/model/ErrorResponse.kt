package com.example.irctconbordingstatus.data.model


import com.google.gson.annotations.SerializedName

data class ErrorResponse(
    @SerializedName("message")
    val message: String,
    @SerializedName("status")
    val status: Int
)