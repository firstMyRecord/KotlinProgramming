package chap7.section2

fun main(){
    val fruit = arrayOf("banana", "avocado", "apple" , "kiwi")
    fruit
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.toUpperCase() }
        .forEach{ println(it) }
}