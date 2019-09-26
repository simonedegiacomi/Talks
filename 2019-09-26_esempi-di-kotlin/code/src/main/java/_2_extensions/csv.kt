package _2_extensions

import java.io.File

data class Participant(val firstName: String, val lastName: String, val job: String)

fun main() {
    val participants = File("src/main/java/_2_extensions/participants.csv")
        .readLines()
        .drop(1)
        .map { it.split(";")}
        .map { Participant(it[0], it[1], it[3]) }
        .groupBy { it.job }

    println(participants)
}
