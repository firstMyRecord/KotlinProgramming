package chap5.section1

class FakeAgeTest {
    var age: Int = 0
        set(value) {// 나이를 판별하는 세터
            field = when {
                value < 18 -> 18
                value in 18..30 -> value
                else -> value - 3
            }
        }
}

fun main(){
    val kim = FakeAgeTest()
    kim.age = 15
    println("Kim 's real age = 15, pretended age = ${kim.age}")

    val hong = FakeAgeTest()
    hong.age = 35
    println("hong's real age = 35, pretended age = ${hong.age}")
}
