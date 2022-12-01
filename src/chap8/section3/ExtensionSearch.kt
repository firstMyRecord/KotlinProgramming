package chap8.section3

fun main(){
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("b", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // elementAt : 인덱스에 해당하는 요소를 반환
    println("elementAt : " + list.elementAt(1))

    // elementAtOrElse : 인덱스를 벗어나는 경우 식에 따라 결과 반환
    println("elementAtOrElse : " + list.elementAtOrElse(10) { 2 * it })

    // elementAtOrNull : 인덱스를 벗어나는 경우 null 반환
    println("elementAtOrNull : " + list.elementAtOrNull(10))

    // first : 식에 일치하는 첫 요소 반환
    println("first : " + listPair.first{ it.second == 200})

    // last : 식에 일치하는 마지막 요소 반환
    println("last : " + listPair.last { it.second == 200})

    //firstOrNull : 식에 일치하지 않는 경우 null 반환
    println("firstOrNull : " + listPair.firstOrNull { it.first == "E"})

    // lastOrNull : 식에 일치하지 않는 경우 null반환
    println("lastOrNull : " + listPair.lastOrNull {it.first == "E"})

    // indexOf : 주어진 요소에 일치하는 첫 인덱스 반환
    println("indexof : " + list.indexOf(4))

    // indexOfFirst : 람다식에 일치한느 첫 요소의 인덱스 반환, 없으면 -1
    println("indexofFirst : " + list.indexOfFirst { it % 2 == 0 })

    // lastIndexOf : 주어진 요소의 일치하는 가장 마지막 인덱스 반환
    println("lastIndexOf : " + listRepeated.lastIndexOf(5))

    // indexOfLast : 람다식에 일치하는 마지막 요소의 인덱스 반환, 없으면 -1
    println("indexOfLast : " + list.indexOfLast { it % 2 == 0 })

    // single : 람다식에 일치하는 요소 하나 반환
    println("single : " + listPair.single{ it.second == 100})
    println("singleOrNull : " + listPair.singleOrNull { it.second == 500 })

    // binarySearch : 요소에 대해 이진 탐색 후 인덱스 반환 / 중복된 요소가 있는 경우 해당 요소가 원하는 순서에 있는 요소인지는 보장 x
    println("binarySearch : " + list.binarySearch(3))

    // find : 조건식을 만족하는 첫 번째 검색된 요소 반환, 없으면 null
    println("find : " + list.find { it > 3 }  )

}