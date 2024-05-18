package com.example.counterapp.ui.screen.Counter

import DecreaseCounter
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CounterScreen(modifier: Modifier, counterViewModel: CounterViewModel){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(150.dp))
        Text(text = "${counterViewModel._counterState.value.counterInt}",
            fontSize = 58.sp)
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            IncreaseCounter { counterViewModel.increaseCounter() }
            Spacer(modifier = Modifier.width(16.dp))
            DecreaseCounter {counterViewModel.decreaseCounter()}

        }

    }
}

@Composable
fun IncreaseCounter(increaseCounter: () -> Unit){
    Button(onClick =  increaseCounter) {
        Text(text = "+")
    }
}

@Composable
fun DecreaseCounter(decreaseCounter: () -> Unit){
    Button(onClick =  decreaseCounter) {
        Text(text = "-")
    }
}