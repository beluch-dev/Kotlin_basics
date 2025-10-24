package org.example.lesson_1

const val timeQuantity = 60

fun main() {
    val seconds: Short = 6480

    val minutes = seconds / timeQuantity
    val secondsRemains = seconds % timeQuantity
    val hours = minutes / timeQuantity
    val minutesRemains = minutes % timeQuantity
    val definitiveTime = String.format("%02d:%02d:%02d", hours, minutesRemains, secondsRemains)

    println(definitiveTime)
}