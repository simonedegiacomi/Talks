package _1_class


import java.util.Date

data class Event(val title: String, val start: Date, val end: Date)


fun main () {
    val start = Date()
    val end = Date()

    val typescript = Event("Intro TypeScript", start, end)
    val typescript2 = typescript.copy(title =  "2")

    println(typescript)
    println(typescript2)
}
