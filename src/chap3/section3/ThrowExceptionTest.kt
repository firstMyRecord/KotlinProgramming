package chap3.section3

import java.lang.Exception

//잔고가 1000 이하일 때 예외 발생
fun main(){
    var amount = 1100
    try {
        amount -= 100
        checkAmount(amount)
    } catch (e : Exception){
        println(e.message)
    }
    println("amount : $amount")
}

fun checkAmount(amount: Int){
    if (amount < 1000)
        throw Exception("잔고가 $amount 이므로 1000 미만 입니다.")
}