package chap3.section1

fun main(){
    print("Enter the score")
    val score = readLine()!!.toDouble()
    var grade : Char = 'F'

    if(score >= 90) {
        grade = 'A'
    }
    else if (score in 80.0..89.9) {
        grade = 'B'
    }
    else if (score in 70.0..79.9) {
        grade = 'c'
    }
    else {
        grade
    }

    println("score : $score   grade : $grade")


}