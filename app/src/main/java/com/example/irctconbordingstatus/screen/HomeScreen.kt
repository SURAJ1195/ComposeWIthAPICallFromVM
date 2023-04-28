package com.example.irctconbordingstatus.screen

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.navigation.NavController
import com.example.irctconbordingstatus.component.InputField
import com.example.irctconbordingstatus.component.NoteButton
import com.example.irctconbordingstatus.navigation.NavScreens


@Composable
@OptIn(ExperimentalComposeUiApi::class)
fun HomeScreen(viewModel: MainViewModel,navController: NavController) {
    val context = LocalContext.current

    val keyBoardController= LocalSoftwareKeyboardController.current
    val ippbAgentId = remember {
        mutableStateOf("")
    }
    val validState = remember(ippbAgentId.value) {
        ippbAgentId.value.trim().isNotEmpty()
    }
    Surface(modifier = Modifier.fillMaxSize()) {


        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            InputField(valueState = ippbAgentId,
                labelId = "",
                enabled = true,
                isSingleLine = true,
                onAction = KeyboardActions {
                    if (!validState) return@KeyboardActions
                    //Todo-onValueChanged
//Todo- so value change hebo mane ehi lambda value send kariba upara method ku and upare lekha thiba code execute hebo

                    keyBoardController?.hide()
                })
            Log.d("suraj", "${validState}")


            NoteButton(text = "Click Me", onClick = {
                if (ippbAgentId.value.trim() == "") {
                    Toast.makeText(context, "Enter Id", Toast.LENGTH_LONG).show()
                } else {
                    viewModel.getData(ippbAgentId.value.trim())
                    navController.navigate(NavScreens.ShowOnBoardDetails.name)
                }

            })
        }

    }
}