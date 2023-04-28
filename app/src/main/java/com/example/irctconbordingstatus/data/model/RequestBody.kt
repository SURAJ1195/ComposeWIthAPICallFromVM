package com.example.irctconbordingstatus.data.model


import com.google.gson.annotations.SerializedName

data class RequestBody(
    @SerializedName("ippb_agentId")
    val ippbAgentId: String
)