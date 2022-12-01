package chap8.section5

// 시퀀스를 이용한 피보나치 수열

fun main(){
    val fibonacci = generateSequence(1 to 1){it.second to it.first + it.second}
        .map { it.first }
    println(fibonacci.take(10).toList())
}