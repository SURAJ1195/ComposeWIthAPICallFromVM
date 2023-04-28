package com.example.irctconbordingstatus.screen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.irctconbordingstatus.data.api.ApiService

class MainViewModelFactory(private val apiService: ApiService):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(apiService =apiService ) as T
    }
}