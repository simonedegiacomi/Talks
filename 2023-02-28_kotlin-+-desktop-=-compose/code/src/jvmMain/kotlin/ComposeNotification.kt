import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.*

fun main() = application {

    val socratenIcon = painterResource("socraten-icon.png")
    val trayState = rememberTrayState()

    val notification = rememberNotification("Notification", "Message from MyApp!")

    Tray(
        icon = socratenIcon,
        state = trayState,
    )

    Window(onCloseRequest = ::exitApplication, title = "Compose Counter", icon = socratenIcon) {
        Button(onClick = {
            trayState.sendNotification(
                Notification(
                    "\"Kotlin + Desktop = Compose\" è iniziato",
                    "Seguilo al link ricevuto per email"
                )
            )
        }) {
            Text("Show notification")
        }
    }

}