package chap5.section2

class Person {
    lateinit var name: String // 1. 지연 초기화를 위한 선언

    fun test() {
        if (!::name.isInitialized) // 2. 프로퍼티의 초기화 판단
            println("Not initialized")
        else {
            println("initialized")
        }
    }
}

fun main(){
    val hyeon = Person()
    hyeon.test()
    hyeon.name = "hyeon" // 이쪽에서 지연 프로퍼티 초기화
    hyeon.test() // test() 에서 else 문 실행
    println("Name : ${hyeon.name}")
}
