package chap9.section1

fun main(){
    data class Person(var name : String, var skill : String)
    var person = Person("kildong", "Kotlin")
    val a = person.let {
        it.skill = "Android"
        "success" // 마지막 문장을 결과로 반환
    }
    println(person)
    println("a : $a") // String
    val b = person.also {
        it.skill = "JAVA"
        "success" // 마지막 문장은 사용 되지 않음
    }
    println(person)
    println("b : $b")
}

