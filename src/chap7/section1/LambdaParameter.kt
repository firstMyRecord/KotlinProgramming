package chap7.section1

/* 람다식에서 제네릭 사용 */

fun <T> add(a: T, b: T, op: (T, T) -> T): T{
    return op(a, b)
}

fun main(){
    val result = add(2, 3) { a, b -> a + b }
    println(result)
    main2()
}

typealias arithmetic<T> = (T, T) -> T

fun <T> addAUX(a: T, b: T, op: arithmetic<T>): T{
    return op(a, b)
}

fun main2(){
    val result2 = addAUX(5, 3) {a, b -> a + b}
    println(result2)
}