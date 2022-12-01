package chap8.section2

fun main(){
    val intsLinkedHashSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 24, 66)
    intsLinkedHashSet.add(15)
    intsLinkedHashSet.remove(66)
    println("intsLinkedHashSet : $intsLinkedHashSet")

    intsLinkedHashSet.clear()
    println("intsLinkedHashSet : $intsLinkedHashSet")
}