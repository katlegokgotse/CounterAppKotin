package com.example.counterapp.ui.screen.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun OutputText(modifier: Modifier){
    Text(
        text = "Hello",
        fontSize = 30.sp,
        )
}