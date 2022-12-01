package chap7.section1

/* 여러가지 자료형을 지원하면서 배열에서 특정 요소의 인덱스를 찾는 검색 함수 */

fun <T> search(a: Array<T>, Target: T) : Int{
    for (i in a.indices){
        if (a[i] == Target) return i
    }
    return -1
}

fun main(){
    val arr1 : Array<String> = arrayOf("Apple", "Banana", "Mango","Cherry")
    val arr2 : Array<Int> = arrayOf(1, 2, 3, 4)

    println("arr.indices : ${arr1.indices}") // indices는 배열의 유효범위 반환
    println(search<String>(arr1,"Cherry")) // 요소 C의 인덱스 찾아내기
    println(search(arr2,2)) // 요소 2의 인덱스 찾아내기
    println(search(arr2, 5)) // 요소 2의 인덱스를 찾지만 조건에 맞지 않아 -1 반환
}