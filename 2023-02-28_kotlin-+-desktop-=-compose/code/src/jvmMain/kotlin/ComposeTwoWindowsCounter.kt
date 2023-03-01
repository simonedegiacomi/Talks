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
import androidx.compose.ui.unit.em
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    var counter by remember { mutableStateOf(0) }

    DisplayWindow(
        ::exitApplication,
        counter
    )
    ButtonsWindow(
        ::exitApplication,
        onDecrement = { counter -= 1 },
        onIncrement = { counter += 1 }
    )
}

@Composable
fun DisplayWindow(onClose: () -> Unit, counter: Int) {
    Window(onCloseRequest = onClose, title = "Display") {
        Text("$counter", fontSize = 10.em)
    }
}

@Composable
fun ButtonsWindow(
    onClose: () -> Unit,
    onDecrement: () -> Unit,
    onIncrement: () -> Unit
) {
    Window(onCloseRequest = onClose, title = "Buttons") {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(4.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = onDecrement) {
                    Text("-")
                }

                Button(onClick = onIncrement) {
                    Text("+")
                }
            }
        }
    }
}
