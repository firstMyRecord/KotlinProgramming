package chap4.section3.openClass


// 상속 가능한 클래스를 위해 open 사용
open class Bird1(var name: String, var wing: Int, var beak: String, var color: String) {
    //메소드
    fun fly() = println("Fly wing : $wing")
    open fun sing(vol: Int) = println("Sing vol : $vol") //오버라이딩 가능한 메소드
}
                                                                        // 마지막 인자만 var로 선언되서 프로퍼티가 추가됨을 알 수 있음
class Parrot1(name: String, wing: Int = 2, beak: String, color: String, var language1 : String = "natural") :
    Bird1(name, wing, beak, color) {

    fun speak() = println("Speak! $language1")
    override fun sing(vol: Int) {
        println("I'm a parrot! The volume level is $vol")
        speak()// 달라진 내용
    }
}

fun main(){
    val parrot = Parrot1(name = "myparrot", wing = 2, beak = "short", color = "multiple")
    parrot.language1 = "English"

    println("Parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language1}" )
    parrot.sing(5) //달라진 메소드 실행 가능
}
