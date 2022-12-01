package chap8.section4

fun main(){
    val list1 = listOf<Int>(1, 2, 3, 4, 5)
    val listDefault = list1
        .map { println("map($it)"); it * it }
        .filter { println("filter($it)"); it % 2 == 0 }
    println(listDefault) // 단순 메서드 체이닝 결과 값
    /* map(1)
       map(2)
       map(3)
       map(4)
       map(5)
       filter(1)
       filter(4)
       filter(9)
       filter(16)
       filter(25)
       [4, 16]
       먼저 map에 대한 처리가 끝난 후 이것을 filter로 넘기기 때문에 실행 결과에서 중간 연산 결과가 존재
    */

    // asSequence()사용
    val listSeq = list1.asSequence()
        .map { print("map($it)"); it * it }
        .filter { println("filter($it)"); it % 2 == 0 }
        .toList()
    println(listSeq)
}