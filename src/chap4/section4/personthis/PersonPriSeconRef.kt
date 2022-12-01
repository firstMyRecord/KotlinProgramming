package chap4.section4.personthis

// 주 생성자
class Person1(firstName: String, out: Unit = println("[Primary Constructor] Parameter")) {

    val fName = println("[Property] Person fName : $firstName") // 3. 프로퍼티 할당

    init {
        println("[init] Person init Block") // 4. 초기화 블록
    }

    // 1. 부 생성자
    constructor(
        firstName: String,
        age: Int,
        out: Unit = println("[Secondary Constructor] Parameter")
    ) : this(firstName) {
        println("[Secondary Constructor] Body : $firstName $age") // 부 생성자 본문
    }
}

fun main(){
    val p1 = Person1("hyeon", 25) // 1 -> 2 호출, 3 -> 4 -> 5 실행
    println()
    val p2 = Person1("Zin") // 2 호출, 3 -> 4 실행
}
