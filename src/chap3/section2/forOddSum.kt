package chap3.section2

fun main(){
    var total = 0

    for (i in 1..100 step 2) total += i
    println("OddTotal : $total")

    for (x in 0..99 step 2) total += x
    println("Even Total : $total")

}