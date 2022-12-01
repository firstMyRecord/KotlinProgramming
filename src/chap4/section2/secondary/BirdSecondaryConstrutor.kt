package chap4.section2.secondary

class Bird{
    // 프로퍼티 선언만 함
    var name : String
    var wing : Int
    var beak : String
    var color : String

    constructor(name: String, wing: Int, beak: String, color: String){ //부 생성자 - 매개 변수를 통 초기화 할 프로퍼티의 저장
    this.name = name
    this.wing = wing
    this.beak = beak
    this.color = color
}
    //메서드
    fun fly() = println("Fly wing: $wing")
    fun sing(vol : Int) = println("Sing vol: $vol")
}

fun main(){
    val coco = Bird("Mybird", 2, "short", "blue")

    coco.color = "yellow"
    println("coco.color: ${coco.color}")
    coco.fly()
    coco.sing(3)
}