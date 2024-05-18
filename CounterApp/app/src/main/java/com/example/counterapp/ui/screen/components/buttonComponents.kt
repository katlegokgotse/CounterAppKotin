import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

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