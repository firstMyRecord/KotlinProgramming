package chap5.section2

class LazyTest {
    init {
        println("시발 너부터 나와라")
    }

    open val subject by lazy {
        println("시발 앤 또 왜 중괄호야 시발 시발 시발 일단 초기화 해")
        "kotlinProgrammoingoksfndlfngklmf으아맨랆알맘앎암람ㄹ나ㅣㅁㄹ낼밧빗;비ㅗㅗㅗㅗㅗㅗㅗㅗㅗㅗ"
    }


    fun flow() {
        println("어 아직 초기화 안됌 ㅅㄱ")
        println("어라 초기화가 됐네 어쩌라고 : $subject")
        println("확인이나 한번 더 해보자 에휴 : $subject")
    }
}
/*어 그래 오버라이딩 안돼네 레이지는 ㅗㅗㅗㅗㅗㅗㅗ알겠다
class Angry {
    override val subject by lazy {  }
}*/

fun main(){
    val idiot = LazyTest()
    idiot.flow()
}