package chap4.section4.personthis
/*인터페이스에서 참조하기*/

open class AngleBraketTest {
    open fun f() = println("AngleBraketTest class f()")
    fun a() = println("AngleBraketTest class a()")
}

interface B {
    fun f() = println("B interface f()") //인터페이스는 기본 적으로 open 이다.
    fun b() = println("B interface b()")
}

class C : AngleBraketTest(), B{ // 1.쉼표(,)를 사용해 클래스와 인터페이스를 지정
    // 컴파일 되려면 f()가 오버라이딩 되어야 핢
    override fun f() = println("C Class f()")

    fun test(){
        f() // 현재 클래스의 f()
        b() // B 인터페이스의 b()
        super<AngleBraketTest>.f() // AngleBraketTest 클래스의 f()
        super<B>.f() // B 클래스의 f()
    }
}

fun main(){
    val c = C()
    c.test()
}