package chap8.section2

import java.util.*

fun main(){
    // 자바의 TreeSet 선언
    val intsSortedSet : TreeSet<Int> = sortedSetOf(4, 1, 7, 2)
    intsSortedSet.add(6)
    intsSortedSet.remove(1)
    println("intsSortedSet : $intsSortedSet")

    intsSortedSet.clear() // 모든 요소를 삭제
    println("intsSortedSet : $intsSortedSet")

}