package com.example.irctconbordingstatus

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import com.example.irctconbordingstatus.component.InputField
import com.example.irctconbordingstatus.component.NoteButton
import com.example.irctconbordingstatus.data.api.ApiService
import com.example.irctconbordingstatus.data.api.RetrofitInstance
import com.example.irctconbordingstatus.data.model.RequestBody
import com.example.irctconbordingstatus.navigation.MovieNavigation
import com.example.irctconbordingstatus.screen.MainViewModel
import com.example.irctconbordingstatus.screen.MainViewModelFactory
import com.example.irctconbordingstatus.ui.theme.IRCTCOnBordingStatusTheme
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private lateinit var apiService: ApiService
    private lateinit var viewModel: MainViewModel
    @OptIn(ExperimentalComposeUiApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IRCTCOnBordingStatusTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,

                ) {


                    apiService = RetrofitInstance.getRetrofitInstance()
                    viewModel = ViewModelProvider(this,MainViewModelFactory(apiService)).get(MainViewModel::class.java)
                    MovieNavigation(viewModel = viewModel)
                }
            }
        }
    }

}


