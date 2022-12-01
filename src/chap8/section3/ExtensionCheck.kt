package chap8.section3

// 요소의 검사

// 컬렉션의 검사 확장 함수 사용하기

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "JAVA", 22 to "Kotlin", 33 to "C#")


    // 요소의 일치 여부 검사

    // all : 모든 요소가 일치해야 true를 반환
    println(list.all { it < 10 })
    println(list.all { it % 2 == 0 })
    // any : 최소한 하나 혹은 그 이상의 특정 요소가 일치해야 true를 반횐
    println(list.any{it % 2 == 0})
    println(list.any{it > 10})

    // 특정 요소의 포함 및 존재 여부 검사하기

    // contain : 요소가 포함되어 있으면 true 를 반환
    println("contain : " + list.contains(2))
    println(2 in list)
    println(map.contains(11))

    // containAll : 모든 요소가 포함되어 있으면 true를 반환
    println("containAll : " + list.containsAll(listOf(1, 2, 3)))

    // none : 요소가 없으면 true, 있으면 false를 반환
    println("none : " + list.none() )
    println("none : " + list.none {it > 6}) // 6이상은 없으므로 true를 반환

    // isEmpty/isNotEmpty : 컬렉션이 비어 있는지 아닌지 검사
    println(list.isEmpty())
    println(list.isNotEmpty())
}