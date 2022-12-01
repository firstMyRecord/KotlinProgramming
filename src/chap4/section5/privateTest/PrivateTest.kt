package chap4.section5.privateTest

/*private을 객체로 생성을 했다 하더라도 다른 함수나 최상위 함수인 main같은 함수에 접근할 수 가 없음 private 클래스 내부에서만 접근 가능*/

private class PrivateTest{
    private var i = 1
    private fun privateFunc(){
        i += 1 // 접근 허용
    }
    fun access(){
        privateFunc() // 접근 허용
    }
}

class OtherClass{
    //val opc = PrivateTest() opc가 private가 아니므로 접근이 불가함
    fun test() {
        val pc = PrivateTest() // 생성 가능함
    }
}

fun main(){
    val pc = PrivateTest() // 생성 가능
    // pc.i 접근 불가 private 으로 선언된게 아님
    // pc.privateFunc 접근 불가 private 으로 선언된게 아님
}

fun topFunction(){
    val tpc = PrivateTest() // 객체 생성 가능
}

