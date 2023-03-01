import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose Counter"
    ) {
        Counter()
    }
}

@Composable
fun Counter() {
    var counter by remember { mutableStateOf(0) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { counter -= 1 }) {
                Text("-")
            }

            Text("$counter")

            Button(onClick = { counter += 1 }) {
                Text("+")
            }
        }
    }
}

















// val mutableState = remember { mutableStateOf(0) }
// var value by remember { mutableStateOf(0) }
// val (value, setValue) = remember { mutableStateOf(0) }









