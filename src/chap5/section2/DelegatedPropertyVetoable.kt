package chap5.section2

import kotlin.properties.Delegates

// vetoable 함수 사용해보기

class User2{
    var max : Int by Delegates.vetoable(0) {    // 초기값은 0
        property, oldValue, newValue ->
        newValue > oldValue // 2. 조건에 맞지 않으면 거부권 행사
    }
}

fun main(){
    val classMax = User2()
    println(classMax)
    classMax.max = 10
    println(classMax.max)

    classMax.max = 8
    println(classMax.max)
}

