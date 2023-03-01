import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import kotlinx.coroutines.delay

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        state = WindowState(size = DpSize(300.dp, 300.dp))
    ) {
        TodoList()
    }
}

@Composable
fun TodoList() {
    val (todos, setTodos) = remember { mutableStateOf<Todos>(Todos.Loading) }

    LaunchedEffect(true) {
        delay(3000)
        setTodos(
            Todos.Loaded(
                listOf(
                    "Configure Gradle", "Add Kotlin", "Develop an awesome app"
                )
            )
        )
    }

    when (todos) {
        Todos.Loading -> {
            Row(
                Modifier.padding(8.dp).fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.CenterHorizontally)
            ) {
                CircularProgressIndicator()
                Text("Loading TODOs list ...")
            }
        }

        is Todos.Loaded -> Column(
            Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text("TODOs:", fontWeight = FontWeight.Bold, fontSize = 2.em)
            todos.todos.map { Text(it) }
        }
    }
}

sealed interface Todos {
    object Loading : Todos
    data class Loaded(val todos: List<String>) : Todos
}
