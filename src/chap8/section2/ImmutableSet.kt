package chap8.section2

fun main(){
    val mixedTypesSet = setOf("Hello", 's', "world", 3.14, 'c') //자료형의 초기화
    var intSet: Set<Int> = setOf<Int>(1, 5 ,5)// 정수형만 초기화

    println(mixedTypesSet)
    println(intSet)

    varag()
}

// 가변형 Set의 초기화
fun varag(){
    // 불변형 Set 정의하기
    val animal = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animal)

    // 요소의 추가
    animal.add("Dog") // 요소중 dog가 있어서 변화는 없음
    println(animal)

    //요소의 삭제
    animal.remove("Python")
    println(animal)

}