package training

fun main(){
//    var numverA : Int = readLine()!!.toInt()
//    var numberB : Int = readLine()!!.toInt()
//    var c : Boolean = numverA == numberB
//    println(c)
//    println(studentScore())
//      println(score(readLine()!!.toInt()))
}

fun other(){
    var numverA2 : Int = readLine()!!.toInt()
    var numberB2 : Int = numverA2 * 2
    println(numberB2)
}

fun studentScore(score : Int = readLine()!!.toInt()){
    var grade = 'F'
    when(score){
        in 90..100 -> grade = 'A'
        in 80..89 -> grade = 'B'
        in 70..79 ->grade = 'C'
        else -> grade
    }
    println(grade)
}

fun score(countScore : Int): Int {
    return countScore * 5
}

fun nullAble(nullA :Int? , nullB: Int?) : Int {
   val first : Int = nullA ?: 0
    val second : Int = if (nullB == null) 0 else nullB

    return first + second
}
