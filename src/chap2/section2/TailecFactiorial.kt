package chap2.section1

fun main(){
    val number = 1
    println("Factorial : $number -> ${fatorial(number)} ")
}

tailrec fun fatorial(n : Int, run : Int = 1) : Long{
    return if (n == 1) run.toLong() else fatorial(n - 1, n * run)
}