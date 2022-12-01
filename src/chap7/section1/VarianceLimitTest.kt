package chap7.section1

/* 공변성으로 자료형을 제한하는 제네릭 클래스 */

open class Animal(val size: Int){
    fun feed() = println("Feeding.........")
}


class Cat(val jump: Int) : Animal(50)
class Spider(val poison : Boolean): Animal(1)

// 1. 형식 매개변수를 Animal로 제한
class Box<out T : Animal>(val element : T) { // 주 생성자에서는 val(읽기 형식)만 허용
    fun getAnimal() : T = element // 2. out은 반환 자료형에서만 사용할 수 있음
   /* fun set(new: T){// 3. T는 in 위치에 사용할 수 없음
        elment = new

    */
}

fun main(){
    //일반적인 객체 선언
    val c1 : Cat = Cat(10)
    val s1 : Spider = Spider(true)

    var a1: Animal = c1 //클래스의 상위 자료형으로 변환하는 것은 아무런 문제 없음
    a1 = s1 // 4. a1 은  Spider의 객체가 됨
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) // 5. 공변성 - Cat은 Animal의 하위 자료형이다.
    println("c2.element.size = ${c2.element.size}")


}

