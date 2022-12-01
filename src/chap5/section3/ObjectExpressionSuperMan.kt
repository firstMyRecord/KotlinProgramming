package chap5.section3

/* object 표현식을 이용해 특정 메소드 오버라이딩하기*/

open class Superman{
    fun work() = println("fucking Code Test")
    fun talk() = println("sibal")
    open fun fly() = println("Fly in the moon~~!~!")
}

fun main(){
    val pretendedMan  =  object: Superman(){ // 1. object 표현식으로 fly() 메소드 구현의 재정
        override fun fly() = println("Fly in the SKY~!~!~!")
    }
    pretendedMan.work()
    pretendedMan.talk()
    pretendedMan.fly()
}

