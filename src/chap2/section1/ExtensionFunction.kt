package chap2.section1

fun main(){
    val source = "Hel"
    val target = "Kotlin"
    println(source.getLongStr(target))

}

fun String.getLongStr(target: String): String =
    if (this.length > target.length) this else target
