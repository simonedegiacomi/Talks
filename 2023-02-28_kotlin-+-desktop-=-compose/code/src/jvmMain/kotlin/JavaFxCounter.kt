import javafx.application.Application
import javafx.application.Application.launch
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.HBox
import javafx.stage.Stage
import java.io.ByteArrayInputStream

fun main(args: Array<String>) {
    launch(HelloWorldApp::class.java)
}

class HelloWorldApp : Application() {
    override fun start(primaryStage: Stage?) {
        val root = FXMLLoader().load<HBox>(ByteArrayInputStream(
            """
                <?xml version="1.0" encoding="UTF-8"?>
                <?import javafx.scene.control.*?>
                <?import javafx.scene.layout.*?>
                <?import javafx.scene.geometry.*?>

                <HBox xmlns="http://javafx.com/javafx"
                      xmlns:fx="http://javafx.com/fxml"
                      fx:controller="HelloWorldController">
                      
                    <Button text="-" onAction="#decrement" style="-fx-padding: 20 20 20 20;"/>
                    <Label text="0" fx:id="countLabel" style="-fx-padding: 20 20 20 20;"/>                    
                    <Button text="+" onAction="#increment" style="-fx-padding: 20 20 20 20;"/>                    
                </HBox>
            """.trimIndent().toByteArray()
        ))

        val scene = Scene(root, 300.0, 200.0)
        primaryStage?.title = "JavaFX Counter"
        primaryStage?.scene = scene
        primaryStage?.show()
    }
}

class HelloWorldController {
    private var count = 0
    lateinit var countLabel: Label

    fun increment() {
        count++
        countLabel.text = "$count"
    }

    fun decrement() {
        count--
        countLabel.text = "$count"
    }
}


