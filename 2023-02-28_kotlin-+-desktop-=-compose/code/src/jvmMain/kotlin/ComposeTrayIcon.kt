import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Tray
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberTrayState

fun main() = application {

    var windowVisible by remember { mutableStateOf(true) }
    val socratenIcon = painterResource("socraten-icon.png")

    if (windowVisible) {
        Window(onCloseRequest = ::exitApplication, title = "Compose Counter", icon = socratenIcon) {
            Button(onClick = { windowVisible = false }) {
                Text("Hide window")
            }
        }
    } else {
        val trayState = rememberTrayState()
        Tray(
            icon = socratenIcon,
            state = trayState,
            menu = {
                Item("Show window", onClick = { windowVisible = true })
                Item("Close app", onClick = ::exitApplication)
            }
        )
    }
}