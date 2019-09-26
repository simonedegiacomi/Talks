package _3_dsl

object Things {
    const val lights = "lights"
    const val projector = "projector"
    const val screen = "screen"
}

class SmartRoom {
    infix fun turnsOn (thing: String) = println("Turning on $thing ...")
    infix fun lowers (thing: String) = println("Lowering $thing ...")
}

fun smartRoom (block: Things.(SmartRoom) -> Unit) {
    Things.block(SmartRoom())
}

fun main () {

    val map = mapOf("uno" to 1, "due" to 2)
    val map2 = HashMap<>
    println(map)

    smartRoom {
        it turnsOn lights
        it turnsOn projector
        it lowers screen
    }
}

