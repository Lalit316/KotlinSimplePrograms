package org.example

fun main(args: Array<String>) {
    for (i in 1..3) {
        println(i) // 1 2 3
    }
    for (i in 1 until 3) {
        println(i) // 1 2
    }
    for (i in 6 downTo 0 step 2) {
        println(i) // 6 4 2 0
    }
}