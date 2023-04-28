package com.example.irctconbordingstatus.screen

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.irctconbordingstatus.data.model.ErrorResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

@Composable
fun ShowOnBoardDetails(viewModel: MainViewModel, navController: NavHostController){
Surface() {



    Card(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(start = 27.dp, end = 27.dp, top = 10.dp, bottom = 10.dp),
        elevation = 8.dp,
        backgroundColor = Color.White,
    ) {
        Column(modifier = Modifier
            .clip(RectangleShape)
            .padding(10.dp).verticalScroll(ScrollState(1)),
            horizontalAlignment = Alignment.Start,

        ) {



                if (viewModel.response.value?.isSuccessful == true) {
                    Text(
                        text = viewModel.response.value?.body().toString(),
                        modifier = Modifier.fillMaxWidth()
                    )

                } else if (viewModel.response.value?.isSuccessful == false) {
                    val gson = Gson()
                    val type = object : TypeToken<ErrorResponse>() {}.type
                    var errorResponse: ErrorResponse? =
                        gson.fromJson(viewModel.response.value?.errorBody()?.charStream(), type)
                    Text(
                        text = errorResponse?.message.toString(),
                        modifier = Modifier.fillMaxWidth()
                    )

                }


        }
    }
    }


}
