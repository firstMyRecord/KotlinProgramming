package chap8.section3

fun main(){
    val list1 = listOf<Int>(1, 2, 3, 4, 5, 6)
    val list2 = listOf<Int>(2, 2, 3, 4, 5, 5, 6, 7)

    //union : 두 List를 중복 요소는 하나만 해서 합침, 중복 요소를 하나만 허용하여 반환하는 set 컬렉션
    println(list1.union(list2))

    // plus : 중복 요소를 포함해서 두 List를 합침, + 연산자와 같음, List 컬렉션 반환
    println(list1.plus(list2))

    // partition : 주어진 식에 따라 2개의 컬렉션으로 분리해 Pair로 반환
    val part = list1.partition { it % 2 == 0 }
    println(part)

    // zip : 동일 인덱스끼리 pair를 만들어 반환, 요소의 개수가 적은 컬렉션의 맞춰 pair가 구성
    val zip = list1.zip(listOf(7, 8 ))
    println(zip)
    val zip2 = list1.zip(list2)
    println(zip2)
}