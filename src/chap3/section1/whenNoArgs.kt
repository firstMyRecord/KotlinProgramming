package chap3.section1

fun main(){
    print("Enter the score")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    when{
        score <= 90 -> grade = 'A'
        score in 80.0..89.9 -> grade = 'B'
        score in 70.0..79.9 -> grade = 'C'
        else -> grade
    }

    println("score : $score   grade : $grade")


}