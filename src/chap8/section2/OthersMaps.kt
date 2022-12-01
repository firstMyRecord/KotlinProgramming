package chap8.section2

import java.util.*
import kotlin.collections.LinkedHashMap

fun main(){
    val hashMap : HashMap<Int, String> = hashMapOf(1 to "Hello", 2 to "BoA")
    println(hashMap)

    val sortedMap : SortedMap<Int, String> = sortedMapOf(2 to "Love you", 1 to "I")
    println(sortedMap)

    val linkedHashMap : LinkedHashMap<Int, String> = linkedMapOf(1 to " I miss", 2 to "you")
    println(linkedHashMap)


    println("${hashMap.values}${sortedMap.values}${linkedHashMap.values}")
}