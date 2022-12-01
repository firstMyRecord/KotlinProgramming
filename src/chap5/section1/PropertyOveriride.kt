package chap5.section1

open class First {
    open val x: Int = 5 // 1. 오버라이딩 가능한 프로퍼티
        get() {
            println("First x")
            return field
        }
    val y: Int = 3 // open 키워드가 없으면 final 프로퍼티
}

class Second : First(){
    override val x: Int = 1 // 상위 클래스와 구현부가 다르게 오버라이딩 됨
        get() {
            println("Second x")
            return field + 3
        }
}

fun main(){
    val first = First()
    val second = Second()
    println(first.x)
    println(second.x) // 오버라이딩 된 두 번째 클래스 객체의 값 x
    println(second.y) // 상위 클래로부터 상속받은 값
}