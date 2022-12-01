package chap7.section2

fun main() {
    val arr = arrayOf(8, 4, 3 ,2, 5, 9, 1)
    // 1. 오름차순, 내림차 순으로 정렬된 일반 배열로 반환
    val sortedNums = arr.sortedArray()
    println("ASC : " + sortedNums.contentToString())

    val sortedNumsDesc = arr.sortedArrayDescending()
    println("DESC : "+ sortedNumsDesc.contentToString())

    // 2. 원본 배열에 대한 정렬
    arr.sort(1, 3) // sort(fromIndex, tolnIndex )
    println("ORI : " + arr.contentToString())
    arr.sortDescending()
    println("ORI : " + arr.contentToString())

    // 3. 리스트로 반환
    val listSorted : List<Int> = arr.sorted()
    val listDesc : List<Int> = arr.sortedDescending()
    println("LST : $listSorted")
    println("LST : $listDesc")

    // 4. SortedBy를 이용한 특정 표현식에 따른 정렬
    val items = arrayOf<String>("Dog", "Cat", "Lion", "kangaroo", "Po")
    items.sortBy{ item -> item.length}
    println(items.contentToString())
 }
