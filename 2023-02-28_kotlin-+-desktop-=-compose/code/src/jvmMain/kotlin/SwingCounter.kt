import java.awt.Insets
import javax.swing.*

fun main() {
    var count = 0

    val frame = JFrame("Swing Counter")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val label = JLabel("0")
    val incButton = JButton("+")
    val decButton = JButton("-")

    val buttonInsets = Insets(20, 20, 20, 20)
    incButton.margin = buttonInsets
    decButton.margin = buttonInsets

    incButton.addActionListener {
        count++
        label.text = "$count"
    }

    decButton.addActionListener {
        count--
        label.text = "$count"
    }

    val panel = JPanel()
    panel.add(decButton)
    panel.add(label)
    panel.add(incButton)

    frame.contentPane.add(panel)
    frame.pack()
    frame.isVisible = true
}
