package org.example

fun main(args: Array<String>) {
    val collection = listOf(1, 3, 8, 12, 14, 16)
    for (item in collection ) println(item)
    for (i in collection .indices) {
        println("$i - ${collection [i]}")
    }
}