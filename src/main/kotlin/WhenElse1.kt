package org.example

fun main(args: Array<String>) {
    val a = 2
    when (a) {
        1 -> print("a == 1" )
        2 -> print("a == 2" )
        else -> { // block is necessary
            print("a is neither 1 nor 2" )
            print("a is $a")
        }
    }
    when (a) {
        1, 2 -> print("a is 1 or 2" )
        3, 4, 6 -> print("a is 3 or 4 or 6" )
        else -> print("a is something else" ) // block is not necessary
    }

}