package org.example.lesson_1

fun main() {
    val seconds: Short = 6480
    val minutes = seconds / 60
    val secondsRemains = seconds % 60
    val hours = minutes / 60
    val minutesRemains = minutes % 60

    var hoursnull = ""
    var minutesnull = ""
    var secondsnull = ""

    if (secondsRemains < 10) secondsnull = "0"

    if (minutesRemains < 10) minutesnull = "0"

    if (hours < 10) hoursnull = "0"

    println("${hoursnull + hours}:${minutesnull + minutesRemains}:${secondsnull + secondsRemains}")
}