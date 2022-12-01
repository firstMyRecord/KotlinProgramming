package chap3.section2

fun main(){
    var sum : Int = 1

    for (n in 10 downTo 1 step 2)sum += n
    println("sum : $sum")
}