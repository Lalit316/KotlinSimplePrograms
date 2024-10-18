package org.example

fun main(args: Array<String>) {
    // With else
   val a = 6
   val  b= 10
    val max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    println(max2)
// As an expression: another syntax style
//    val max3 = if (a > b) a else b
//    println(max3)
}