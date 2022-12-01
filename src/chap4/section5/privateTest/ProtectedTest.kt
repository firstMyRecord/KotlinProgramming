package chap4.section5.privateTest

/*상속 된 하위 클래스에 접근 가능하지만 .이나 외부 클래스에는 접근 불가*/

// 최상위 클래스에서는 protected 사용불가
open class Base{
    protected var i = 1
    protected fun protectedFunc() {
        i += 1 //접근 허용
    }
    fun access(){
        protectedFunc() // 접근 허용
    }
    protected class Nested // 내부 클래스에서는 지시자 허
}

class Derived : Base(){
    fun test(base: Base) : Int {
        protectedFunc() // Base class 메소드 접근 가능
        return  i // Base class 프로퍼티 접근 가능
    }
}

fun main(){
    val base = Base() // 생성 가능
    // base.i 접근 불가
    // base.protectedFunc() 접근불가
    base.access() // 접근 가능
}
