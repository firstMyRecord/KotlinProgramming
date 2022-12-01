package chap4.section2.secondary

class Bird2(var name : String, var wing : Int, var beak : String, var color : String) {
    // 프로퍼티는 매개 변수 안에 var 를 사용해 프로퍼티 로서 선언되서 본문에서 생략 됨

    //메서드
    fun fly() = println("Fly Wing : $wing")
    fun sing(vol : Int) = println("Sing vol : $vol")
}

fun main(){
    val coco = Bird2("mybird", 2, "short", "blue")

    println(coco.name)
    println(coco.beak)
    coco.color = "Yellow"
    println("coco.color : ${coco.color}")
    coco.fly()
    coco.sing(3)
}
