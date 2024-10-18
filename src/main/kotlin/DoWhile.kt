package org.example

fun main(args: Array<String>) {
    var x = 5
    while (x > 0) {
        println(x)
        x--
    }
    do {
        val y = Math.random()
        println(y)
    } while (y < 0.8) // y is visible here
}