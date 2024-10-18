package org.example

fun main(args: Array<String>) {
    val a = 10
    val b = 7
    when {
        a > b -> {
            println("a > b")
        }
        a < b -> {
            println("b > a")
        }
        else -> {
            println("a is equal to b" )
        }
    }
}


// another syntax style | without block of curly brackets
//when {
//    a > b -> println("a > b")
//    a < b -> println("b > a")
//    else -> println("a is equal to b" )
//}