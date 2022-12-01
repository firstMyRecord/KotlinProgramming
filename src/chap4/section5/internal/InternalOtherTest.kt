package chap4.section5.internal

fun main(){
    val otherlic = InternalTest() // 다른 파일에 있어도 같은 모듈이라 접근 가능

    println(otherlic.i)
    otherlic.icFunc()
}
/* 패키지 이름이 다르다면 import구문을 사용해 필요한 클래스를 임포트 해야지 사용 가능 */