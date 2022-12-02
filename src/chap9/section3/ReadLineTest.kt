package chap9.section3

import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    print("Enter : ")
    val input = readLine()!!
    println("You Entered : $input")
    var integer = this.nextInt()
    println(integer)
}