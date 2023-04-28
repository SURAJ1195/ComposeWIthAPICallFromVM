package com.example.irctconbordingstatus.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.irctconbordingstatus.screen.HomeScreen
import com.example.irctconbordingstatus.screen.MainViewModel
import com.example.irctconbordingstatus.screen.ShowOnBoardDetails


@Composable
fun MovieNavigation(viewModel: MainViewModel) {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = NavScreens.HomeScreen.name) {

        composable(NavScreens.HomeScreen.name) {

            HomeScreen(viewModel, navController)

        }
        composable(NavScreens.ShowOnBoardDetails.name){
            ShowOnBoardDetails(viewModel = viewModel,navController)
        }
    }
}