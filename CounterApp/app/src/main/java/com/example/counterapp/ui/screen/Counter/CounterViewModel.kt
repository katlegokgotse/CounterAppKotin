package com.example.counterapp.ui.screen.Counter

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.counterapp.data.CounterModel

class CounterViewModel: ViewModel() {
    //Receive the state value from the model
     val _counterState = mutableStateOf(CounterModel())

    fun updateCounterState(){
        _counterState.value = _counterState.value.copy(counterInt = _counterState.value.counterInt)
    }
    fun increaseCounter(){
        _counterState.value = _counterState.value.copy(counterInt = _counterState.value.counterInt + 1)
    }
    fun decreaseCounter(){
        if (_counterState.value.counterInt <= 0){
            _counterState.value = _counterState.value.copy(counterInt = 0)
        } else {
            _counterState.value = _counterState.value.copy(counterInt = _counterState.value.counterInt - 1)
        }
    }
}