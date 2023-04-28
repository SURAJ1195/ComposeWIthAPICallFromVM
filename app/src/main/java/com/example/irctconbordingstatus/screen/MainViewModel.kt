package com.example.irctconbordingstatus.screen

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.irctconbordingstatus.data.api.ApiService
import com.example.irctconbordingstatus.data.model.RequestBody
import com.example.irctconbordingstatus.data.model.ResponseBody
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response

class MainViewModel(private val apiService: ApiService) : ViewModel() {

       var response:MutableState<Response<ResponseBody>?> = mutableStateOf(null)

    fun getData(ippbAgentId: String) {
        viewModelScope.launch {
           response.value=  apiService.getApiData(RequestBody(ippbAgentId = ippbAgentId))


        }
    }


}